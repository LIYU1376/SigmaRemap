package remapped;

import java.util.function.Predicate;

public abstract class class_551 extends class_2451 {
   public static final Predicate<ItemStack> field_3286 = var0 -> var0.method_27960().method_11250(class_391.field_1594);
   public static final Predicate<ItemStack> field_3287 = field_3286.or(var0 -> var0.method_27960() == class_4897.field_24479);

   public class_551(class_317 var1) {
      super(var1);
   }

   public Predicate<ItemStack> method_2653() {
      return this.method_2655();
   }

   public abstract Predicate<ItemStack> method_2655();

   public static ItemStack method_2656(LivingEntity var0, Predicate<ItemStack> var1) {
      if (!var1.test(var0.method_26617(Hand.OFF_HAND))) {
         return !var1.test(var0.method_26617(Hand.MAIN_HAND)) ? ItemStack.EMPTY : var0.method_26617(Hand.MAIN_HAND);
      } else {
         return var0.method_26617(Hand.OFF_HAND);
      }
   }

   @Override
   public int method_11213() {
      return 1;
   }

   public abstract int method_2654();
}
