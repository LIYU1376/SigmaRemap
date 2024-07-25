package remapped;

import java.util.function.Predicate;
import javax.annotation.Nullable;

public class class_7885 extends class_4040 {
   private static final Predicate<Entity> field_40350 = var0 -> var0.method_37330() && !(var0 instanceof class_7885);
   private int field_40349;
   private int field_40351;
   private int field_40347;

   public class_7885(class_6629<? extends class_7885> var1, World var2) {
      super(var1, var2);
      this.field_41733 = 1.0F;
      this.field_29915 = 20;
   }

   @Override
   public void method_26851() {
      super.method_26851();
      this.field_29916.method_3485(0, new class_787(this));
      this.field_29916.method_3485(4, new class_829(this));
      this.field_29916.method_3485(5, new class_2889(this, 0.4));
      this.field_29916.method_3485(6, new class_4407(this, class_704.class, 6.0F));
      this.field_29916.method_3485(10, new class_4407(this, class_5886.class, 8.0F));
      this.field_29908.method_3485(2, new class_8420(this, class_4040.class).method_38757());
      this.field_29908.method_3485(3, new class_4138<class_704>(this, class_704.class, true));
      this.field_29908.method_3485(4, new class_4138<class_405>(this, class_405.class, true));
      this.field_29908.method_3485(4, new class_4138<class_8127>(this, class_8127.class, true));
   }

   @Override
   public void method_26872() {
      boolean var3 = !(this.method_37259() instanceof class_5886) || this.method_37259().method_37387().method_30453(class_5218.field_26788);
      boolean var4 = !(this.method_37243() instanceof class_9149);
      this.field_29916.method_3493(class_1891.field_9564, var3);
      this.field_29916.method_3493(class_1891.field_9561, var3 && var4);
      this.field_29916.method_3493(class_1891.field_9560, var3);
      this.field_29916.method_3493(class_1891.field_9563, var3);
   }

   public static class_1313 method_35660() {
      return class_1173.method_5201()
         .method_5984(class_7331.field_37468, 100.0)
         .method_5984(class_7331.field_37465, 0.3)
         .method_5984(class_7331.field_37463, 0.75)
         .method_5984(class_7331.field_37462, 12.0)
         .method_5984(class_7331.field_37467, 1.5)
         .method_5984(class_7331.field_37471, 32.0);
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25931("AttackTick", this.field_40349);
      var1.method_25931("StunTick", this.field_40351);
      var1.method_25931("RoarTick", this.field_40347);
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      this.field_40349 = var1.method_25947("AttackTick");
      this.field_40351 = var1.method_25947("StunTick");
      this.field_40347 = var1.method_25947("RoarTick");
   }

   @Override
   public class_8461 method_18591() {
      return class_463.field_2326;
   }

   @Override
   public class_1249 method_26933(World var1) {
      return new class_9052(this, var1);
   }

   @Override
   public int method_26903() {
      return 45;
   }

   @Override
   public double method_37149() {
      return 2.1;
   }

   @Override
   public boolean method_26863() {
      return !this.method_26859() && this.method_37259() instanceof class_5834;
   }

   @Nullable
   @Override
   public Entity method_37259() {
      return !this.method_37114().isEmpty() ? this.method_37114().get(0) : null;
   }

   @Override
   public void method_26606() {
      super.method_26606();
      if (this.method_37330()) {
         if (!this.method_26468()) {
            double var3 = this.method_17809() == null ? 0.3 : 0.35;
            double var5 = this.method_26561(class_7331.field_37465).method_44996();
            this.method_26561(class_7331.field_37465).method_45006(class_9299.method_42794(0.1, var5, var3));
         } else {
            this.method_26561(class_7331.field_37465).method_45006(0.0);
         }

         if (this.field_41744 && this.field_41768.method_29537().method_1285(class_291.field_1047)) {
            boolean var7 = false;
            class_4092 var8 = this.method_37241().method_18898(0.2);

            for (class_1331 var10 : class_1331.method_6075(
               class_9299.method_42847(var8.field_19941),
               class_9299.method_42847(var8.field_19937),
               class_9299.method_42847(var8.field_19938),
               class_9299.method_42847(var8.field_19940),
               class_9299.method_42847(var8.field_19939),
               class_9299.method_42847(var8.field_19942)
            )) {
               class_2522 var11 = this.field_41768.method_28262(var10);
               class_6414 var12 = var11.method_8360();
               if (var12 instanceof class_4423) {
                  var7 = this.field_41768.method_7511(var10, true, this) || var7;
               }
            }

            if (!var7 && this.field_41726) {
               this.method_26595();
            }
         }

         if (this.field_40347 > 0) {
            this.field_40347--;
            if (this.field_40347 == 10) {
               this.method_35657();
            }
         }

         if (this.field_40349 > 0) {
            this.field_40349--;
         }

         if (this.field_40351 > 0) {
            this.field_40351--;
            this.method_35659();
            if (this.field_40351 == 0) {
               this.method_37155(class_463.field_2440, 1.0F, 1.0F);
               this.field_40347 = 20;
            }
         }
      }
   }

   private void method_35659() {
      if (this.field_41717.nextInt(6) == 0) {
         double var3 = this.method_37302()
            - (double)this.method_37086() * Math.sin((double)(this.field_29605 * (float) (Math.PI / 180.0)))
            + (this.field_41717.nextDouble() * 0.6 - 0.3);
         double var5 = this.method_37309() + (double)this.method_37074() - 0.3;
         double var7 = this.method_37156()
            + (double)this.method_37086() * Math.cos((double)(this.field_29605 * (float) (Math.PI / 180.0)))
            + (this.field_41717.nextDouble() * 0.6 - 0.3);
         this.field_41768.method_43361(class_3090.field_15353, var3, var5, var7, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }

   @Override
   public boolean method_26468() {
      return super.method_26468() || this.field_40349 > 0 || this.field_40351 > 0 || this.field_40347 > 0;
   }

   @Override
   public boolean method_26420(Entity var1) {
      return this.field_40351 <= 0 && this.field_40347 <= 0 ? super.method_26420(var1) : false;
   }

   @Override
   public void method_26469(class_5834 var1) {
      if (this.field_40347 == 0) {
         if (!(this.field_41717.nextDouble() < 0.5)) {
            this.method_35658(var1);
         } else {
            this.field_40351 = 40;
            this.method_37155(class_463.field_2615, 1.0F, 1.0F);
            this.field_41768.method_29587(this, (byte)39);
            var1.method_37183(this);
         }

         var1.field_41743 = true;
      }
   }

   private void method_35657() {
      if (this.method_37330()) {
         for (Entity var4 : this.field_41768.<Entity>method_25869(class_5834.class, this.method_37241().method_18898(4.0), field_40350)) {
            if (!(var4 instanceof class_7637)) {
               var4.method_37181(class_6199.method_28345(this), 6.0F);
            }

            this.method_35658(var4);
         }

         class_1343 var11 = this.method_37241().method_18926();

         for (int var12 = 0; var12 < 40; var12++) {
            double var5 = this.field_41717.nextGaussian() * 0.2;
            double var7 = this.field_41717.nextGaussian() * 0.2;
            double var9 = this.field_41717.nextGaussian() * 0.2;
            this.field_41768.method_43361(class_3090.field_15343, var11.field_7336, var11.field_7333, var11.field_7334, var5, var7, var9);
         }
      }
   }

   private void method_35658(Entity var1) {
      double var4 = var1.method_37302() - this.method_37302();
      double var6 = var1.method_37156() - this.method_37156();
      double var8 = Math.max(var4 * var4 + var6 * var6, 0.001);
      var1.method_37186(var4 / var8 * 4.0, 0.2, var6 / var8 * 4.0);
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 4) {
         if (var1 == 39) {
            this.field_40351 = 40;
         }
      } else {
         this.field_40349 = 10;
         this.method_37155(class_463.field_2738, 1.0F, 1.0F);
      }

      super.method_37336(var1);
   }

   public int method_35656() {
      return this.field_40349;
   }

   public int method_35654() {
      return this.field_40351;
   }

   public int method_35655() {
      return this.field_40347;
   }

   @Override
   public boolean method_26442(Entity var1) {
      this.field_40349 = 10;
      this.field_41768.method_29587(this, (byte)4);
      this.method_37155(class_463.field_2738, 1.0F, 1.0F);
      return super.method_26442(var1);
   }

   @Nullable
   @Override
   public class_8461 method_26918() {
      return class_463.field_2412;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2520;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2504;
   }

   @Override
   public void method_37207(class_1331 var1, class_2522 var2) {
      this.method_37155(class_463.field_2392, 0.15F, 1.0F);
   }

   @Override
   public boolean method_26855(class_4924 var1) {
      return !var1.method_22550(this.method_37241());
   }

   @Override
   public void method_18602(int var1, boolean var2) {
   }

   @Override
   public boolean method_21357() {
      return false;
   }
}
