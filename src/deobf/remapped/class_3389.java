package remapped;

public class class_3389 extends LookAtGoal {
   private static String[] field_16697;

   public class_3389(MobEntity var1, Class<? extends LivingEntity> var2, float var3, float var4) {
      super(var2, var3, var4);
      this.field_16696 = var1;
   }

   @Override
   public boolean method_16795() {
      return super.method_16795() && !this.field_16696.method_25212() && !this.field_16696.method_25182();
   }

   @Override
   public boolean method_16799() {
      return super.method_16799() && !this.field_16696.method_25212() && !this.field_16696.method_25182();
   }
}
