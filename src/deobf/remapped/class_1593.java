package remapped;

public class class_1593 extends class_2550 {
   private static String[] field_8309;

   public class_1593(EntityType<? extends class_1593> var1, World var2) {
      super(var1, var2);
   }

   public class_1593(World var1, LivingEntity var2, double var3, double var5, double var7) {
      super(EntityType.field_34288, var2, var3, var5, var7, var1);
   }

   public class_1593(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(EntityType.field_34288, var2, var4, var6, var8, var10, var12, var1);
   }

   @Override
   public void method_26163(class_5631 var1) {
      super.method_26163(var1);
      if (!this.world.field_33055) {
         Entity var4 = var1.method_25524();
         if (!var4.method_37087()) {
            Entity var5 = this.method_26166();
            int var6 = var4.method_37230();
            var4.method_37178(5);
            boolean var7 = var4.attackEntityFrom(DamageSource.method_28375(this, var5), 5.0F);
            if (var7) {
               if (var5 instanceof LivingEntity) {
                  this.method_37096((LivingEntity)var5, var4);
               }
            } else {
               var4.method_37164(var6);
            }
         }
      }
   }

   @Override
   public void method_26165(class_9529 var1) {
      super.method_26165(var1);
      if (!this.world.field_33055) {
         Entity var4 = this.method_26166();
         if (var4 == null || !(var4 instanceof MobEntity) || this.world.getGameRules().getBoolean(GameRules.field_1047)) {
            BlockPos var5 = var1.method_43955().method_6098(var1.method_43956());
            if (this.world.method_22548(var5)) {
               this.world.method_29594(var5, class_9476.method_43768(this.world, var5));
            }
         }
      }
   }

   @Override
   public void method_26160(class_7474 var1) {
      super.method_26160(var1);
      if (!this.world.field_33055) {
         this.method_37204();
      }
   }

   @Override
   public boolean method_37167() {
      return false;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      return false;
   }
}
