package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class Class5730 extends EntityRenderer<Class905> {
   private static final ResourceLocation field25138 = new ResourceLocation("textures/entity/shulker/spark.png");
   private static final RenderType field25139 = RenderType.getEntityTranslucent(field25138);
   private final Class2821<Class905> field25140 = new Class2821<Class905>();

   public Class5730(EntityRendererManager var1) {
      super(var1);
   }

   public int method17858(Class905 var1, BlockPos var2) {
      return 15;
   }

   public void render(Class905 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.push();
      float var9 = MathHelper.method37828(var1.prevRotationYaw, var1.rotationYaw, var3);
      float var10 = MathHelper.lerp(var3, var1.prevRotationPitch, var1.rotationPitch);
      float var11 = (float)var1.ticksExisted + var3;
      var4.translate(0.0, 0.15F, 0.0);
      var4.rotate(Vector3f.YP.rotationDegrees(MathHelper.sin(var11 * 0.1F) * 180.0F));
      var4.rotate(Vector3f.XP.rotationDegrees(MathHelper.cos(var11 * 0.1F) * 180.0F));
      var4.rotate(Vector3f.ZP.rotationDegrees(MathHelper.sin(var11 * 0.15F) * 360.0F));
      var4.method35292(-0.5F, -0.5F, 0.5F);
      this.field25140.setRotationAngles(var1, 0.0F, 0.0F, 0.0F, var9, var10);
      IVertexBuilder var12 = var5.method25597(this.field25140.method11028(field25138));
      this.field25140.method11016(var4, var12, var6, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.method35292(1.5F, 1.5F, 1.5F);
      IVertexBuilder var13 = var5.method25597(field25139);
      this.field25140.method11016(var4, var13, var6, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 0.15F);
      var4.pop();
      super.render(var1, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(Class905 var1) {
      return field25138;
   }
}
