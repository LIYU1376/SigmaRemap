package remapped;

public class class_481 extends class_7164<class_4206, class_1898<class_4206>> {
   private static final Identifier field_2983 = new Identifier("textures/entity/ghast/ghast.png");
   private static final Identifier field_2984 = new Identifier("textures/entity/ghast/ghast_shooting.png");

   public class_481(EntityRenderDispatcher var1) {
      super(var1, new class_1898<class_4206>(), 1.5F);
   }

   public Identifier method_2273(class_4206 var1) {
      return !var1.method_19572() ? field_2983 : field_2984;
   }

   public void method_2274(class_4206 var1, class_7966 var2, float var3) {
      float var6 = 1.0F;
      float var7 = 4.5F;
      float var8 = 4.5F;
      var2.method_36062(4.5F, 4.5F, 4.5F);
   }
}
