package remapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;

public class class_7376 extends SecondModule {
   private ArrayList<String> field_37694 = new ArrayList<String>();
   private ArrayList<String> field_37690 = new ArrayList<String>();
   private class_1508 field_37692;
   private Timer field_37691;
   private int field_37693;

   public class_7376() {
      super(
         Category.MISC,
         "GamePlay",
         "Manage your gameplay experience just for you.",
         new HypixelGameplayModule(),
         new class_5579(),
         new class_6505(),
         new class_8454(),
         new class_4256()
      );
      this.addSetting(new BooleanSetting("AutoL", "Automatically says L when you kill a player", true));
      this.addSetting(new ModeSetting("AutoL Mode", "AutoL Mode", 0, "Basic", "Sigmeme", "Penshen").method_23029(var1 -> this.field_37694.clear()));
      this.addSetting(new HippieModeValue("First character", "The characters your sentences will start with.", ""));
      this.addSetting(new BooleanSetting("AutoGG", "Automatically say gg at the end of the game", true));
      this.addSetting(new BooleanSetting("Auto Join", "Automatically joins another game", true));
      this.addSetting(new FloatSetting<Float>("Auto Join delay", "Seconds before joining a new game", 4.0F, Float.class, 1.0F, 10.0F, 1.0F));
      this.field_37691 = new Timer();
   }

   @Override
   public void onEnable() {
      if (!this.field_37691.method_14771()) {
         this.field_37691.method_14776();
      }

      this.field_37692 = null;
      this.field_37694.clear();
      this.field_37690.clear();
   }

   @Override
   public void onDisable() {
      this.field_37691.method_14773();
      this.field_37691.method_14774();
      this.field_37692 = null;
   }

   @EventListen
   private void method_33595(class_5596 var1) {
      if (this.method_42015()) {
         if (this.field_37692 != null) {
            if (mcInstance.field_9623 instanceof class_5766) {
               this.method_33594(null);
               SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Auto Join", "Auto join was canceled.", 2500));
            } else if (this.field_37692.method_6909()) {
               class_314.method_1423(this.field_37692.method_6912());
               this.method_33594(null);
            } else if ((int)(this.field_37692.method_6911() / 1000L) + 1 < this.field_37693) {
               this.field_37693 = (int)(this.field_37692.method_6911() / 1000L) + 1;
               SigmaMainClass.method_3328()
                  .method_3335()
                  .method_27841(
                     new class_8235("Auto Join", "Joining a new game in " + this.field_37693 + " second" + (this.field_37693 > 1 ? "s" : "") + ".", 2000)
                  );
            }
         }

         if (!this.field_37691.method_14771()) {
            this.field_37691.method_14776();
         }

         if (!this.field_37690.isEmpty()) {
            String var4 = this.getStringValueByName("Type");

            try {
               if (mcInstance.field_9632.field_41697 <= 3) {
                  this.field_37690.clear();
               }

               long var5 = 3200L;
               if (!var4.equalsIgnoreCase("Hypixel")) {
                  var5 = 0L;
               }

               if (var4.equalsIgnoreCase("Mineplex")) {
                  var5 = 300L;
               }

               if (var4.equalsIgnoreCase("Funcraft")) {
                  var5 = 1000L;
               }

               if (var4.equalsIgnoreCase("Jartex")) {
                  var5 = 3200L;
               }

               if (this.field_37691.method_14772() > var5 && !this.field_37690.isEmpty()) {
                  this.field_37691.method_14773();
                  String var7 = this.field_37690.get(0);
                  class_314.method_1423(var7);
                  this.field_37690.remove(0);
               }
            } catch (ConcurrentModificationException var9) {
            }
         }
      }
   }

   public void method_33594(class_1508 var1) {
      this.field_37692 = var1;
      if (var1 != null) {
         this.field_37693 = (int)(var1.method_6911() / 1000L) + 1;
      }
   }

   public void method_33593() {
      this.field_37690.add("gg");
   }

   public void method_33596(String var1) {
      String[] var4 = var1.split(" ");
      String var5 = var4[0];
      if (this.getStringValueByName("Type").equals("Mineplex") || this.getStringValueByName("Type").equals("Funcraft")) {
         var5 = var4[1];
      }

      String var6 = this.getStringValueByName("AutoL Mode");
      switch (var6) {
         case "Basic":
            this.field_37690.add(this.getStringValueByName("First character") + "L " + var5);
            break;
         case "Sigmeme":
            if (this.field_37694.isEmpty()) {
               this.field_37694 = new ArrayList<String>(class_1068.field_5846);
               Collections.shuffle(this.field_37694);
            }

            String var11 = this.field_37694.get(0);
            if (this.getStringValueByName("Type").equals("Cubecraft")) {
               var11 = var11.replaceAll("sigma", "ＳＩＧＭＡ");
               var11 = var11.replaceAll("Sigma", "ＳＩＧＭＡ");
            }

            var11 = this.getStringValueByName("First character") + var11;
            this.field_37690.add(var11);
            this.field_37694.remove(0);
            break;
         case "Penshen":
            if (this.field_37694.isEmpty()) {
               this.field_37694 = class_1068.field_5847;
               Collections.shuffle(this.field_37694);
            }

            String var8 = this.field_37694.get(0);
            if (this.getStringValueByName("Type").equals("Cubecraft")) {
               var8 = var8.replaceAll("sigma", "ＳＩＧＭＡ");
               var8 = var8.replaceAll("Sigma", "ＳＩＧＭＡ");
            }

            var8 = this.getStringValueByName("First character") + var8;
            this.field_37690.add(var8);
            this.field_37694.remove(0);
      }
   }
}
