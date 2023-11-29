
package net.mcreator.mineterra.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.mineterra.procedures.StaffOfLesserMagicWhileProjectileFlyingTickProcedure;
import net.mcreator.mineterra.procedures.StaffOfLesserMagicProjectileHitsLivingEntityProcedure;
import net.mcreator.mineterra.init.MineterraModItems;
import net.mcreator.mineterra.init.MineterraModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class StaffOfLesserMagicEntity extends AbstractArrow implements ItemSupplier {
	public StaffOfLesserMagicEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(MineterraModEntities.ARCANITE_STAFF.get(), world);
	}

	public StaffOfLesserMagicEntity(EntityType<? extends StaffOfLesserMagicEntity> type, Level world) {
		super(type, world);
	}

	public StaffOfLesserMagicEntity(EntityType<? extends StaffOfLesserMagicEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public StaffOfLesserMagicEntity(EntityType<? extends StaffOfLesserMagicEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(MineterraModItems.ARCANITE_RUNE.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		StaffOfLesserMagicProjectileHitsLivingEntityProcedure.execute(this.level(), entityHitResult.getEntity(), this.getOwner());
	}

	@Override
	public void tick() {
		super.tick();
		StaffOfLesserMagicWhileProjectileFlyingTickProcedure.execute(this);
		if (this.inGround)
			this.discard();
	}

	public static StaffOfLesserMagicEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		StaffOfLesserMagicEntity entityarrow = new StaffOfLesserMagicEntity(MineterraModEntities.ARCANITE_STAFF.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mineterra:celestial-passive-active")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static StaffOfLesserMagicEntity shoot(LivingEntity entity, LivingEntity target) {
		StaffOfLesserMagicEntity entityarrow = new StaffOfLesserMagicEntity(MineterraModEntities.ARCANITE_STAFF.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 0.5f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(0);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mineterra:celestial-passive-active")), SoundSource.PLAYERS, 1,
				1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
