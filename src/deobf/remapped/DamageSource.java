package remapped;

import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class DamageSource {
   public static final DamageSource field_31678 = new DamageSource("inFire").method_28371().method_28343();
   public static final DamageSource field_31674 = new DamageSource("lightningBolt");
   public static final DamageSource field_31665 = new DamageSource(field_31663[6]).method_28371().method_28343();
   public static final DamageSource field_31691 = new DamageSource("lava").method_28343();
   public static final DamageSource field_31675 = new DamageSource("hotFloor").method_28343();
   public static final DamageSource field_31670 = new DamageSource("inWall").method_28371();
   public static final DamageSource field_31676 = new DamageSource("cramming").method_28371();
   public static final DamageSource field_31671 = new DamageSource("drown").method_28371();
   public static final DamageSource field_31694 = new DamageSource("starve").method_28371().method_28354();
   public static final DamageSource field_31677 = new DamageSource("cactus");
   public static final DamageSource field_31684 = new DamageSource("fall").method_28371();
   public static final DamageSource field_31672 = new DamageSource("flyIntoWall").method_28371();
   public static final DamageSource field_31685 = new DamageSource("outOfWorld").method_28371().method_28356();
   public static final DamageSource field_31664 = new DamageSource("generic").method_28371();
   public static final DamageSource field_31686 = new DamageSource("magic").method_28371().method_28361();
   public static final DamageSource field_31669 = new DamageSource("wither").method_28371();
   public static final DamageSource field_31666 = new DamageSource("anvil");
   public static final DamageSource field_31681 = new DamageSource("fallingBlock");
   public static final DamageSource field_31692 = new DamageSource("dragonBreath").method_28371();
   public static final DamageSource field_31688 = new DamageSource("dryout");
   public static final DamageSource field_31687 = new DamageSource("sweetBerryBush");
   private boolean field_31673;
   private boolean field_31668;
   private boolean field_31680;
   private float field_31689 = 0.1F;
   private boolean field_31679;
   private boolean field_31682;
   private boolean field_31690;
   private boolean field_31667;
   private boolean field_31683;
   public final String field_31693;

   public static DamageSource method_28370(LivingEntity var0) {
      return new class_5405("sting", var0);
   }

   public static DamageSource method_28345(LivingEntity var0) {
      return new class_5405("mob", var0);
   }

   public static DamageSource method_28358(Entity var0, LivingEntity var1) {
      return new class_8758("mob", var0, var1);
   }

   public static DamageSource method_28344(PlayerEntity var0) {
      return new class_5405("player", var0);
   }

   public static DamageSource method_28379(class_6749 var0, Entity var1) {
      return new class_8758("arrow", var0, var1).method_28359();
   }

   public static DamageSource method_28368(Entity var0, Entity var1) {
      return new class_8758("trident", var0, var1).method_28359();
   }

   public static DamageSource method_28363(class_8612 var0, Entity var1) {
      return new class_8758("fireworks", var0, var1).method_28377();
   }

   public static DamageSource method_28375(class_2550 var0, Entity var1) {
      return var1 != null
         ? new class_8758("fireball", var0, var1).method_28343().method_28359()
         : new class_8758("onFire", var0, var0).method_28343().method_28359();
   }

   public static DamageSource method_28376(class_1044 var0, Entity var1) {
      return new class_8758("witherSkull", var0, var1).method_28359();
   }

   public static DamageSource method_28355(Entity var0, Entity var1) {
      return new class_8758("thrown", var0, var1).method_28359();
   }

   public static DamageSource method_28369(Entity var0, Entity var1) {
      return new class_8758("indirectMagic", var0, var1).method_28371().method_28361();
   }

   public static DamageSource method_28364(Entity var0) {
      return new class_5405("thorns", var0).method_24599().method_28361();
   }

   public static DamageSource method_28350(class_2730 var0) {
      return method_28351(var0 == null ? null : var0.method_12273());
   }

   public static DamageSource method_28351(LivingEntity var0) {
      return var0 == null ? new DamageSource("explosion").method_28366().method_28377() : new class_5405("explosion.player", var0).method_28366().method_28377();
   }

   public static DamageSource method_28378() {
      return new class_6188();
   }

   @Override
   public String toString() {
      return "DamageSource (" + this.field_31693 + ")";
   }

   public boolean method_28357() {
      return this.field_31682;
   }

   public DamageSource method_28359() {
      this.field_31682 = true;
      return this;
   }

   public boolean method_28367() {
      return this.field_31683;
   }

   public DamageSource method_28377() {
      this.field_31683 = true;
      return this;
   }

   public boolean method_28380() {
      return this.field_31673;
   }

   public float method_28381() {
      return this.field_31689;
   }

   public boolean method_28346() {
      return this.field_31668;
   }

   public boolean method_28348() {
      return this.field_31680;
   }

   public DamageSource(String var1) {
      this.field_31693 = var1;
   }

   @Nullable
   public Entity method_28353() {
      return this.method_28372();
   }

   @Nullable
   public Entity method_28372() {
      return null;
   }

   public DamageSource method_28371() {
      this.field_31673 = true;
      this.field_31689 = 0.0F;
      return this;
   }

   public DamageSource method_28356() {
      this.field_31668 = true;
      return this;
   }

   public DamageSource method_28354() {
      this.field_31680 = true;
      this.field_31689 = 0.0F;
      return this;
   }

   public DamageSource method_28343() {
      this.field_31679 = true;
      return this;
   }

   public ITextComponent method_28362(LivingEntity var1) {
      LivingEntity var4 = var1.method_26560();
      String var5 = "death.attack." + this.field_31693;
      String var6 = var5 + ".player";
      return var4 == null
         ? new TranslationTextComponent(var5, var1.method_19839())
         : new TranslationTextComponent(var6, var1.method_19839(), var4.method_19839());
   }

   public boolean method_28360() {
      return this.field_31679;
   }

   public String method_28347() {
      return this.field_31693;
   }

   public DamageSource method_28366() {
      this.field_31690 = true;
      return this;
   }

   public boolean method_28374() {
      return this.field_31690;
   }

   public boolean method_28352() {
      return this.field_31667;
   }

   public DamageSource method_28361() {
      this.field_31667 = true;
      return this;
   }

   public boolean method_28349() {
      Entity var3 = this.method_28372();
      return var3 instanceof PlayerEntity && ((PlayerEntity)var3).playerAbilities.isCreativeMode;
   }

   @Nullable
   public class_1343 method_28365() {
      return null;
   }
}
