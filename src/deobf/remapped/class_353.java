package remapped;

public class class_353 extends class_4734 {
   private static String[] field_1380;
   public BlockPos field_1379;
   public boolean field_1381 = true;

   public class_353(PlayerEntity var1, Hand var2, ItemStack var3, class_9529 var4) {
      this(var1.world, var1, var2, var3, var4);
   }

   public class_353(class_4734 var1) {
      this(var1.method_21862(), var1.method_21868(), var1.method_21860(), var1.method_21867(), var1.method_21864());
   }

   public class_353(World var1, PlayerEntity var2, Hand var3, ItemStack var4, class_9529 var5) {
      super(var1, var2, var3, var4, var5);
      this.field_1379 = var5.method_43955().method_6098(var5.method_43956());
      this.field_1381 = var1.method_28262(var5.method_43955()).method_8374(this);
   }

   public static class_353 method_1784(class_353 var0, BlockPos var1, Direction var2) {
      return new class_353(
         var0.method_21862(),
         var0.method_21868(),
         var0.method_21860(),
         var0.method_21867(),
         new class_9529(
            new class_1343(
               (double)var1.getX() + 0.5 + (double)var2.method_1041() * 0.5,
               (double)var1.method_12165() + 0.5 + (double)var2.method_1054() * 0.5,
               (double)var1.method_12185() + 0.5 + (double)var2.method_1034() * 0.5
            ),
            var2,
            var1,
            false
         )
      );
   }

   @Override
   public BlockPos method_21858() {
      return !this.field_1381 ? this.field_1379 : super.method_21858();
   }

   public boolean method_1785() {
      return this.field_1381 || this.method_21862().method_28262(this.method_21858()).method_8374(this);
   }

   public boolean method_1783() {
      return this.field_1381;
   }

   public Direction method_1782() {
      return Direction.method_1051(this.method_21868())[0];
   }

   public Direction[] method_1786() {
      Direction[] var3 = Direction.method_1051(this.method_21868());
      if (this.field_1381) {
         return var3;
      } else {
         Direction var4 = this.method_21857();
         int var5 = 0;

         while (var5 < var3.length && var3[var5] != var4.method_1046()) {
            var5++;
         }

         if (var5 > 0) {
            System.arraycopy(var3, 0, var3, 1, var5);
            var3[0] = var4.method_1046();
         }

         return var3;
      }
   }
}
