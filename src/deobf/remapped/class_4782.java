package remapped;

public class class_4782 extends class_7164<class_3024, class_472<class_3024>> {
   private static final Identifier field_23157 = new Identifier("textures/entity/chicken.png");

   public class_4782(EntityRenderDispatcher var1) {
      super(var1, new class_472<class_3024>(), 0.3F);
   }

   public Identifier method_22018(class_3024 var1) {
      return field_23157;
   }

   public float method_22019(class_3024 var1, float var2) {
      float var5 = MathHelper.lerp(var2, var1.field_14829, var1.field_14831);
      float var6 = MathHelper.lerp(var2, var1.field_14830, var1.field_14827);
      return (MathHelper.sin(var5) + 1.0F) * var6;
   }
}
