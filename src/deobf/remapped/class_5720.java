package remapped;

import javax.annotation.Nullable;

public class class_5720 extends class_5521 {
   private static String[] field_28903;

   public class_5720(EntityType<? extends class_5720> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public SoundEvent method_26918() {
      super.method_26918();
      return SoundEvents.field_2395;
   }

   @Override
   public SoundEvent method_19056() {
      super.method_19056();
      return SoundEvents.field_2234;
   }

   @Override
   public SoundEvent method_26599() {
      super.method_26599();
      return SoundEvents.field_2524;
   }

   @Nullable
   @Override
   public SoundEvent method_19083() {
      return SoundEvents.field_2775;
   }

   @Override
   public SoundEvent method_26541(DamageSource var1) {
      super.method_26541(var1);
      return SoundEvents.field_2591;
   }

   @Override
   public void method_25020() {
      this.method_37155(SoundEvents.field_2630, 1.0F, (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 1.0F);
   }

   @Override
   public class_1899 method_8638(class_6331 var1, class_1899 var2) {
      return EntityType.field_34218.method_30484(var1);
   }
}
