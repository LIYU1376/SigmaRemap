package remapped;

import java.util.List;
import java.util.function.Predicate;

public class class_8011 extends class_3429 implements class_3713 {
   public static final Predicate<class_5834> field_41037 = class_5834::method_26537;

   public class_8011(class_6629<? extends class_8011> var1, World var2) {
      super(var1, var2);
   }

   public class_8011(World var1, class_5834 var2) {
      super(class_6629.field_34312, var2, var1);
   }

   public class_8011(World var1, double var2, double var4, double var6) {
      super(class_6629.field_34312, var2, var4, var6, var1);
   }

   @Override
   public class_2451 method_15854() {
      return class_4897.field_25226;
   }

   @Override
   public float method_43874() {
      return 0.05F;
   }

   @Override
   public void method_26165(class_9529 var1) {
      super.method_26165(var1);
      if (!this.field_41768.field_33055) {
         class_6098 var4 = this.method_17246();
         class_6004 var5 = class_9541.method_43990(var4);
         List var6 = class_9541.method_43993(var4);
         boolean var7 = var5 == class_3697.field_18108 && var6.isEmpty();
         Direction var8 = var1.method_43956();
         class_1331 var9 = var1.method_43955();
         class_1331 var10 = var9.method_6098(var8);
         if (var7) {
            this.method_36348(var10, var8);
            this.method_36348(var10.method_6098(var8.method_1046()), var8);

            for (Direction var12 : class_9594.field_48893) {
               this.method_36348(var10.method_6098(var12), var12);
            }
         }
      }
   }

   @Override
   public void method_26160(class_7474 var1) {
      super.method_26160(var1);
      if (!this.field_41768.field_33055) {
         class_6098 var4 = this.method_17246();
         class_6004 var5 = class_9541.method_43990(var4);
         List var6 = class_9541.method_43993(var4);
         boolean var7 = var5 == class_3697.field_18108 && var6.isEmpty();
         if (!var7) {
            if (!var6.isEmpty()) {
               if (!this.method_36349()) {
                  this.method_36350(var6, var1.method_33990() != class_1430.field_7718 ? null : ((class_5631)var1).method_25524());
               } else {
                  this.method_36347(var4, var5);
               }
            }
         } else {
            this.method_36351();
         }

         int var8 = !var5.method_27402() ? 2002 : 2007;
         this.field_41768.method_43364(var8, this.method_37075(), class_9541.method_43987(var4));
         this.method_37204();
      }
   }

   private void method_36351() {
      class_4092 var3 = this.method_37241().method_18899(4.0, 2.0, 4.0);
      List var4 = this.field_41768.<class_5834>method_25869(class_5834.class, var3, field_41037);
      if (!var4.isEmpty()) {
         for (class_5834 var6 : var4) {
            double var7 = this.method_37275(var6);
            if (var7 < 16.0 && var6.method_26537()) {
               var6.method_37181(class_6199.method_28369(var6, this.method_26166()), 1.0F);
            }
         }
      }
   }

   private void method_36350(List<class_2250> var1, Entity var2) {
      class_4092 var5 = this.method_37241().method_18899(4.0, 2.0, 4.0);
      List var6 = this.field_41768.<class_5834>method_25868(class_5834.class, var5);
      if (!var6.isEmpty()) {
         for (class_5834 var8 : var6) {
            if (var8.method_26611()) {
               double var9 = this.method_37275(var8);
               if (var9 < 16.0) {
                  double var11 = 1.0 - Math.sqrt(var9) / 4.0;
                  if (var8 == var2) {
                     var11 = 1.0;
                  }

                  for (class_2250 var14 : var1) {
                     class_1425 var15 = var14.method_10339();
                     if (!var15.method_6535()) {
                        int var16 = (int)(var11 * (double)var14.method_10347() + 0.5);
                        if (var16 > 20) {
                           var8.method_26558(new class_2250(var15, var16, var14.method_10333(), var14.method_10338(), var14.method_10336()));
                        }
                     } else {
                        var15.method_6539(this, this.method_26166(), var8, var14.method_10333(), var11);
                     }
                  }
               }
            }
         }
      }
   }

   private void method_36347(class_6098 var1, class_6004 var2) {
      class_4478 var5 = new class_4478(this.field_41768, this.method_37302(), this.method_37309(), this.method_37156());
      Entity var6 = this.method_26166();
      if (var6 instanceof class_5834) {
         var5.method_20782((class_5834)var6);
      }

      var5.method_20781(3.0F);
      var5.method_20779(-0.5F);
      var5.method_20796(10);
      var5.method_20780(-var5.method_20783() / (float)var5.method_20791());
      var5.method_20793(var2);

      for (class_2250 var8 : class_9541.method_43995(var1)) {
         var5.method_20788(new class_2250(var8));
      }

      class_5734 var9 = var1.method_27990();
      if (var9 != null && var9.method_25939("CustomPotionColor", 99)) {
         var5.method_20785(var9.method_25947("CustomPotionColor"));
      }

      this.field_41768.method_7509(var5);
   }

   private boolean method_36349() {
      return this.method_17246().method_27960() == class_4897.field_24444;
   }

   private void method_36348(class_1331 var1, Direction var2) {
      class_2522 var5 = this.field_41768.method_28262(var1);
      if (!var5.method_8349(class_2351.field_11771)) {
         if (class_8474.method_39004(var5)) {
            this.field_41768.method_43365((class_704)null, 1009, var1, 0);
            class_8474.method_39006(this.field_41768, var1, var5);
            this.field_41768.method_29594(var1, var5.method_10308(class_8474.field_43423, Boolean.valueOf(false)));
         }
      } else {
         this.field_41768.method_7508(var1, false);
      }
   }
}
