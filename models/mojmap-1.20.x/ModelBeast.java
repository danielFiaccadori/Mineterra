// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBeast<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "beast"), "main");
	private final ModelPart body;
	private final ModelPart Head;
	private final ModelPart Tail;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public ModelBeast(ModelPart root) {
		this.body = root.getChild("body");
		this.Head = root.getChild("Head");
		this.Tail = root.getChild("Tail");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 21)
						.addBox(-5.0F, -20.0F, -10.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -19.0F, 0.0F, 8.0F, 9.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(33, 14)
						.addBox(-4.0F, -3.0F, -7.0F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-3.0F, -5.0F, -5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(2.0F, -5.0F, -5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 12)
						.addBox(-3.0F, 0.0F, -9.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-1.0F, 1.0F, -9.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.0F, -10.0F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, 7.0F, 12.0F));

		PartDefinition cube_r1 = Tail
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(40, 5).addBox(-1.0F, -15.5F, 24.0F, 2.0F, 2.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 17.0F, -12.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 41).addBox(-1.0F, -17.5F, 15.75F, 2.0F, 2.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, -12.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(18, 41).addBox(-1.0F, -21.0F, 4.0F, 2.0F, 2.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.0F, -12.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(34, 35)
				.addBox(4.0F, -2.0F, -3.0F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.0F, -5.0F));

		PartDefinition cube_r4 = LeftArm
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(55, 52).addBox(4.0F, -2.0F, -8.0F, 3.0F, 2.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 15.0F, 5.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = LeftArm.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(43, 57).addBox(4.0F, -6.0F, -7.0F, 3.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, 5.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r6 = LeftArm
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(0, 50).addBox(4.0F, -12.0F, -5.0F, 3.0F, 6.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 15.0F, 5.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(28, 0)
				.addBox(-7.0F, -2.0F, -3.0F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.0F, -5.0F));

		PartDefinition cube_r7 = RightArm
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(52, 40).addBox(4.0F, -2.0F, -8.0F, 3.0F, 2.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-11.0F, 15.0F, 5.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r8 = RightArm.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(23, 57).addBox(4.0F, -6.0F, -7.0F, 3.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, 15.0F, 5.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r9 = RightArm.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(46, 47).addBox(4.0F, -12.0F, -5.0F, 3.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, 15.0F, 5.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(0.0F, 11.0F, 7.0F));

		PartDefinition cube_r10 = LeftLeg
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(51, 0).addBox(4.0F, -2.0F, -8.0F, 3.0F, 2.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 13.0F, 4.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = LeftLeg
				.addOrReplaceChild("cube_r11",
						CubeListBuilder.create().texOffs(32, 47).addBox(4.0F, -14.0F, -5.0F, 3.0F, 8.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 13.0F, 4.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r12 = LeftLeg.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(11, 57).addBox(4.0F, -6.0F, -7.0F, 3.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, 4.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(0.0F, 11.0F, 7.0F));

		PartDefinition cube_r13 = RightLeg
				.addOrReplaceChild("cube_r13",
						CubeListBuilder.create().texOffs(14, 50).addBox(4.0F, -2.0F, -8.0F, 3.0F, 2.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-11.0F, 13.0F, 4.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r14 = RightLeg.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 0).addBox(4.0F, -6.0F, -7.0F, 3.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, 13.0F, 4.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r15 = RightLeg.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(46, 28).addBox(4.0F, -14.0F, -5.0F, 3.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, 13.0F, 4.0F, 0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}