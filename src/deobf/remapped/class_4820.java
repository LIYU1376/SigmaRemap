package remapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class_4820 extends Module {
   public static class_1331 field_24090;

   public class_4820() {
      super(Category.WORLD, "CakeEater", "Automatically eats cake");
      this.addSetting(new BooleanSetting("No Swing", "Removes the swing animation.", true));
      this.addSetting(new BooleanSetting("Mineplex", "Mineplex mode.", true));
   }

   @Override
   public void onDisable() {
      field_24090 = null;
   }

   @EventListen
   private void method_22206(class_139 var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_5182) {
            class_5182 var4 = (class_5182)var1.method_557();
            if (var4.method_23768().getString().equals("§9Game> §r§7You cannot eat your own cake!§r")) {
               var1.method_29715(true);
            }
         }
      }
   }

   @EventListen
   @class_315
   private void method_22207(class_1393 var1) {
      if (this.method_42015()) {
         SecondModule var4 = (SecondModule) SigmaMainClass.method_3328().getModuleManager().method_847(FlyModule.class);
         if (var4.method_16864() instanceof class_9154) {
            class_9154 var5 = (class_9154)var4.method_16864();
            if (var5.method_42164()) {
               return;
            }
         }

         if (!var1.method_6449()) {
            if (field_24090 != null) {
               if (this.getBooleanValueByName("No Swing") && !this.getBooleanValueByName("Mineplex")) {
                  mcInstance.method_8614().method_4813(new class_3195(class_2584.field_12791));
               } else if (!this.getBooleanValueByName("No Swing")) {
                  mcInstance.field_9632.method_26597(class_2584.field_12791);
               }

               class_9529 var7 = new class_9529(
                  new class_1343(
                     (double)field_24090.method_12173() + 0.4 + Math.random() * 0.2,
                     (double)field_24090.method_12165() + 0.5,
                     (double)field_24090.method_12185() + 0.4 + Math.random() * 0.2
                  ),
                  Direction.field_817,
                  field_24090,
                  false
               );
               mcInstance.method_8614().method_4813(new class_8585(class_2584.field_12791, var7));
            }
         } else {
            List var8 = this.method_22209(!this.getBooleanValueByName("Mineplex") ? mcInstance.field_9647.method_42146() : 6.0F);
            if (var8.isEmpty()) {
               field_24090 = null;
            } else {
               Collections.sort(var8, new class_9688(this));
               field_24090 = (class_1331)var8.get(0);
               if (!this.getBooleanValueByName("Mineplex")) {
                  float[] var6 = class_7211.method_33006(
                     (double)field_24090.method_12173() + 0.5, (double)field_24090.method_12185() + 0.5, (double)field_24090.method_12165()
                  );
                  var1.method_6441(var6[0]);
                  var1.method_6448(var6[1]);
               }
            }
         }
      }
   }

   private List<class_1331> method_22209(float var1) {
      ArrayList var4 = new ArrayList();

      for (float var5 = var1 + 2.0F; var5 >= -var1 + 1.0F; var5--) {
         for (float var6 = -var1; var6 <= var1; var6++) {
            for (float var7 = -var1; var7 <= var1; var7++) {
               class_1331 var8 = new class_1331(
                  mcInstance.field_9632.method_37302() + (double)var6,
                  mcInstance.field_9632.method_37309() + (double)var5,
                  mcInstance.field_9632.method_37156() + (double)var7
               );
               if (mcInstance.field_9601.method_28262(var8).method_8360() instanceof class_6726
                  && Math.sqrt(
                        mcInstance.field_9632
                           .method_37273((double)var8.method_12173() + 0.5, (double)var8.method_12165() + 0.5, (double)var8.method_12185() + 0.5)
                     )
                     < (double)var1) {
                  var4.add(var8);
               }
            }
         }
      }

      return var4;
   }
}
