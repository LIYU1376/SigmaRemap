package remapped;

public enum class_5068 {
   field_26192(SoundEvents.field_2216),
   field_26190(SoundEvents.field_2155);

   private final SoundEvent field_26189;

   private class_5068(SoundEvent var3) {
      this.field_26189 = var3;
   }

   public void method_23330(class_3541 var1) {
      var1.play(class_4949.method_22676(this.field_26189, 1.0F, 1.0F));
   }
}
