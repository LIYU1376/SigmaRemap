package remapped;

import java.util.Iterator;
import java.util.stream.Stream;

public class AutoMLGModule extends PremiumModule {
   private int field_17598;
   private int field_17600;
   private static int field_17597;
   private BlockPos field_17596;

   public AutoMLGModule() {
      super("AutoMLG", "Automatically places water when falling", Category.ITEM);
      this.addSetting(new BooleanSetting("Cubecraft", "Cubecraft bypass", true));
      field_17597 = -1;
   }

   public static boolean method_16781() {
      return field_17597 >= 0;
   }

   @Override
   public void onEnable() {
      field_17597 = -1;
   }

   @Override
   public void onDisable() {
      field_17597 = -1;
   }

   @EventListen
   private void method_16782(class_7767 var1) {
      if (this.method_42015()) {
         if (field_17597 > 0 && !client.thePlayer.onGround) {
            class_8865.method_40777(var1, 0.0);
         }
      }
   }

   @EventListen
   @class_7664
   private void method_16779(class_1393 var1) {
      if (this.method_42015() && client.playerController.gameIsSurvivalOrAdventure()) {
         if (var1.method_6449() && field_17597 >= 0) {
            field_17597++;
            float[] var4 = class_7211.method_33006(
               (double)this.field_17596.getX() + 0.5, (double)this.field_17596.getZ() + 0.5, (double)this.field_17596.getY() + 0.5
            );
            var1.method_6441(var4[0]);
            var1.method_6448(var4[1]);
         }

         if (field_17597 == (!this.getBooleanValueByName("Cubecraft") ? 3 : 5)) {
            if (client.thePlayer.inventory.field_36404 != this.field_17598) {
               this.field_17600 = client.thePlayer.inventory.field_36404;
               client.thePlayer.inventory.field_36404 = this.field_17598;
               client.playerController.method_42129();
            }

            client.method_8614().sendPacket(new class_3195(Hand.MAIN_HAND));
            client.method_8614().sendPacket(new class_1022(Hand.MAIN_HAND));
            field_17597 = -1;
            this.field_17596 = null;
            client.thePlayer.inventory.field_36404 = this.field_17600;
         }

         int var7 = this.method_16778();
         if (!SigmaMainClass.getInstance().getModuleManager().getModuleByClass(FlyModule.class).method_42015()
            && var7 != -1
            && !client.thePlayer.onGround
            && client.thePlayer.field_41706 > 3.0F) {
            BlockPos var5 = this.method_16780();
            if (var5 != null) {
               if (var1.method_6449() && field_17597 == -1) {
                  float[] var6 = class_7211.method_33006(
                     (double)var5.getX() + 0.5, (double)var5.getZ() + 0.5, (double)var5.getY() + 0.5
                  );
                  var1.method_6441(var6[0]);
                  var1.method_6448(var6[1]);
                  if (var7 != client.thePlayer.inventory.field_36404) {
                     this.field_17600 = client.thePlayer.inventory.field_36404;
                     client.thePlayer.inventory.field_36404 = var7;
                     client.playerController.method_42129();
                  }

                  this.field_17598 = var7;
                  this.field_17596 = var5;
                  field_17597 = 0;
                  return;
               }

               if (this.field_17596 != null) {
                  client.method_8614().sendPacket(new class_3195(Hand.MAIN_HAND));
                  client.method_8614().sendPacket(new class_1022(Hand.MAIN_HAND));
               }
            }
         }
      }
   }

   public int method_16778() {
      for (int var3 = 36; var3 < 45; var3++) {
         if (client.thePlayer.field_3869.method_18878(var3).method_35884()) {
            ItemStack var4 = client.thePlayer.field_3869.method_18878(var3).method_35898();
            if (var4.method_27960() == class_4897.field_24999) {
               return var3 - 36;
            }
         }
      }

      if (SigmaMainClass.getInstance().method_3310().method_25303() > 1) {
         for (int var5 = 9; var5 < 36; var5++) {
            if (client.thePlayer.field_3869.method_18878(var5).method_35884()) {
               ItemStack var6 = client.thePlayer.field_3869.method_18878(var5).method_35898();
               if (var6.method_27960() == class_4897.field_24999) {
                  if (class_3347.method_15349() <= class_412.field_1752.method_2055()) {
                     client.method_8614().sendPacket(new class_8559(class_2105.field_10551));
                  }

                  class_2740.method_12312(var5, 6);
                  client.method_8614().sendPacket(new class_1194(-1));
                  return 6;
               }
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private BlockPos method_16780() {
      double var3 = client.thePlayer.method_37098().field_7336;
      double var5 = client.thePlayer.method_37098().field_7333;
      double var7 = client.thePlayer.method_37098().field_7334;
      Box var9 = client.thePlayer.field_41712.method_18928(var3, 0.0, var7).method_18918(0.0, var5, 0.0);
      Stream var10 = client.theWorld.method_6680(client.thePlayer, var9);
      Iterator var11 = var10.iterator();
      BlockPos var12 = null;

      while (var11.hasNext()) {
         class_4190 var13 = (class_4190)var11.next();
         Box var14 = var13.method_19483();
         BlockPos var15 = new BlockPos(var14.method_18926());
         if (class_7494.method_34090(var15)
            && (double)(var15.getY() + 1) < client.thePlayer.method_37309()
            && (
               var12 == null
                  || client.thePlayer
                        .method_37273((double)var12.getX() + 0.5 - var3, (double)(var12.getY() + 1), (double)var12.getZ() + 0.5 - var7)
                     > client.thePlayer
                        .method_37273((double)var15.getX() + 0.5 - var3, (double)(var15.getY() + 1), (double)var15.getZ() + 0.5 - var7)
            )) {
            var12 = var15;
         }
      }

      if (var12 != null) {
         return var12;
      } else {
         var5 = client.thePlayer.method_37098().field_7333 - 1.0;
         var9 = client.thePlayer.field_41712.method_18928(var3, 0.0, var7).method_18918(0.0, var5, 0.0);
         var10 = client.theWorld.method_6680(client.thePlayer, var9);
         var11 = var10.iterator();

         while (var11.hasNext()) {
            class_4190 var20 = (class_4190)var11.next();
            Box var21 = var20.method_19483();
            BlockPos var22 = new BlockPos(var21.method_18926());
            if (class_7494.method_34090(var22)
               && (double)(var22.getY() + 1) < client.thePlayer.method_37309()
               && (
                  var12 == null
                     || client.thePlayer
                           .method_37273(
                              (double)var12.getX() + 0.5 - var3, (double)(var12.getY() + 1), (double)var12.getZ() + 0.5 - var7
                           )
                        > client.thePlayer
                           .method_37273(
                              (double)var22.getX() + 0.5 - var3, (double)(var22.getY() + 1), (double)var22.getZ() + 0.5 - var7
                           )
               )) {
               var12 = var22;
            }
         }

         return var12;
      }
   }
}
