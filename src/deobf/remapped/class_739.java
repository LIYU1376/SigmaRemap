package remapped;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class class_739 implements Iterator<BlockPos> {
   private double field_4037;
   private double field_4036;
   private int field_4025;
   private int field_4035;
   private double field_4030;
   private double field_4027;
   private double field_4033;
   private double field_4024;
   private int field_4032;
   private double field_4034;
   private double field_4026;
   private class_523 field_4029 = new class_523(0, 0, 0);
   private boolean field_4031 = false;

   public class_739(BlockPos var1, BlockPos var2, double var3, double var5) {
      this.field_4037 = var3;
      this.field_4036 = var5;
      this.field_4025 = var1.getX();
      this.field_4035 = var2.getX();
      this.field_4030 = (double)var1.getY();
      this.field_4027 = (double)var2.getY() - 0.5;
      this.field_4033 = (double)var1.getZ();
      this.field_4024 = (double)var2.getZ() - 0.5;
      this.field_4032 = this.field_4025;
      this.field_4034 = this.field_4030;
      this.field_4026 = this.field_4033;
      this.field_4031 = this.field_4032 < this.field_4035 && this.field_4034 < this.field_4027 && this.field_4026 < this.field_4024;
   }

   @Override
   public boolean hasNext() {
      return this.field_4031;
   }

   public BlockPos next() {
      if (!this.field_4031) {
         throw new NoSuchElementException();
      } else {
         this.field_4029.method_2547((double)this.field_4032, this.field_4034, this.field_4026);
         this.method_3365();
         this.field_4031 = this.field_4032 < this.field_4035 && this.field_4034 < this.field_4027 && this.field_4026 < this.field_4024;
         return this.field_4029;
      }
   }

   private void method_3365() {
      this.field_4026++;
      if (!(this.field_4026 < this.field_4024)) {
         this.field_4026 = this.field_4033;
         this.field_4034++;
         if (!(this.field_4034 < this.field_4027)) {
            this.field_4034 = this.field_4030;
            this.field_4030 = this.field_4030 + this.field_4037;
            this.field_4027 = this.field_4027 + this.field_4037;
            this.field_4034 = this.field_4030;
            this.field_4033 = this.field_4033 + this.field_4036;
            this.field_4024 = this.field_4024 + this.field_4036;
            this.field_4026 = this.field_4033;
            this.field_4032++;
            if (this.field_4032 < this.field_4035) {
            }
         }
      }
   }

   @Override
   public void remove() {
      throw new RuntimeException("Not implemented");
   }

   public static void main(String[] var0) throws Exception {
      BlockPos var3 = new BlockPos(-2, 10, 20);
      BlockPos var4 = new BlockPos(2, 12, 22);
      double var5 = -0.5;
      double var7 = 0.5;
      class_739 var9 = new class_739(var3, var4, var5, var7);
      System.out.println("Start: " + var3 + ", end: " + var4 + ", yDelta: " + var5 + ", zDelta: " + var7);

      while (var9.hasNext()) {
         BlockPos var10 = var9.next();
         System.out.println("" + var10);
      }
   }
}
