package remapped;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class class_298 extends class_7637 {
   private static final Predicate<class_423> field_1082 = var0 -> var0 == class_423.field_1789 || var0 == class_423.field_1782;
   private boolean field_1083;

   public class_298(EntityType<? extends class_298> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void registerGoals() {
      super.registerGoals();
      this.goalSelector.addGoal(0, new SwimGoal(this));
      this.goalSelector.addGoal(1, new class_5472(this));
      this.goalSelector.addGoal(2, new class_4121(this, this));
      this.goalSelector.addGoal(3, new class_1052(this, this, 10.0F));
      this.goalSelector.addGoal(4, new class_2959(this, this));
      this.targetSelector.addGoal(1, new HurtByTargetGoal(this, AbstractRaiderEntity.class).setCallsForHelp());
      this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, true));
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<AbstractVillagerEntity>(this, AbstractVillagerEntity.class, true));
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<IronGolemEntity>(this, IronGolemEntity.class, true));
      this.targetSelector.addGoal(4, new class_8642(this));
      this.goalSelector.addGoal(8, new class_8285(this, 0.6));
      this.goalSelector.addGoal(9, new LookAtGoal(this, PlayerEntity.class, 3.0F, 1.0F));
      this.goalSelector.addGoal(10, new LookAtGoal(this, MobEntity.class, 8.0F));
   }

   @Override
   public void method_26919() {
      if (!this.isAIDisabled() && class_3613.method_16840(this)) {
         boolean var3 = ((class_6331)this.world).method_28983(this.method_37075());
         ((class_8985)this.method_26927()).method_41199(var3);
      }

      super.method_26919();
   }

   public static MutableAttribute method_1340() {
      return MonsterEntity.func_234295_eP_()
         .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.35F)
         .createMutableAttribute(Attributes.FOLLOW_RANGE, 12.0)
         .createMutableAttribute(Attributes.MAX_HEALTH, 24.0)
         .createMutableAttribute(Attributes.ATTACK_DAMAGE, 5.0);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      if (this.field_1083) {
         var1.putBoolean("Johnny", true);
      }
   }

   @Override
   public class_5871 method_34604() {
      if (!this.method_26892()) {
         return !this.method_18596() ? class_5871.field_29811 : class_5871.field_29819;
      } else {
         return class_5871.field_29818;
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("Johnny", 99)) {
         this.field_1083 = var1.getBoolean("Johnny");
      }
   }

   @Override
   public SoundEvent getRaidLossSound() {
      return SoundEvents.field_2243;
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      class_8733 var8 = super.method_26864(var1, var2, var3, var4, var5);
      ((class_8985)this.method_26927()).method_41199(true);
      this.method_26870(var2);
      this.method_26893(var2);
      return var8;
   }

   @Override
   public void method_26870(class_9589 var1) {
      if (this.method_18589() == null) {
         this.method_37349(class_6943.field_35707, new ItemStack(class_4897.field_24420));
      }
   }

   @Override
   public boolean method_37344(Entity var1) {
      if (super.method_37344(var1)) {
         return true;
      } else {
         return var1 instanceof LivingEntity && ((LivingEntity)var1).method_26550() == class_2780.field_13576
            ? this.method_37095() == null && var1.method_37095() == null
            : false;
      }
   }

   @Override
   public void method_37303(ITextComponent var1) {
      super.method_37303(var1);
      if (!this.field_1083 && var1 != null && var1.getString().equals("Johnny")) {
         this.field_1083 = true;
      }
   }

   @Override
   public SoundEvent method_26918() {
      return SoundEvents.field_2609;
   }

   @Override
   public SoundEvent method_26599() {
      return SoundEvents.field_2533;
   }

   @Override
   public SoundEvent method_26541(DamageSource var1) {
      return SoundEvents.field_2486;
   }

   @Override
   public void method_18602(int var1, boolean var2) {
      ItemStack var5 = new ItemStack(class_4897.field_24420);
      class_2452 var6 = this.method_18589();
      byte var7 = 1;
      if (var1 > var6.method_11302(class_423.field_1789)) {
         var7 = 2;
      }

      boolean var8 = this.field_41717.nextFloat() <= var6.method_11272();
      if (var8) {
         HashMap var9 = Maps.newHashMap();
         var9.put(class_3668.field_17864, Integer.valueOf(var7));
         class_2931.method_13398(var9, var5);
      }

      this.method_37349(class_6943.field_35707, var5);
   }
}
