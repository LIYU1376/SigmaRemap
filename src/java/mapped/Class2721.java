package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.Difficulty;

public class Class2721 extends NearestAttackableTargetGoal<PlayerEntity> {
   private static String[] field17187;
   public final Class1057 field17207;

   public Class2721(Class1057 var1, Class1057 var2) {
      super(var2, PlayerEntity.class, true);
      this.field17207 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field17207.world.method6997() != Difficulty.field14351 ? super.method10803() : false;
   }

   @Override
   public AxisAlignedBB method10921(double var1) {
      net.minecraft.util.Direction var5 = ((Class1057)this.field17153).method4848();
      if (var5.getAxis() != Direction.X) {
         return var5.getAxis() != Direction.Z
            ? this.field17153.getBoundingBox().method19663(var1, 4.0, var1)
            : this.field17153.getBoundingBox().method19663(var1, var1, 4.0);
      } else {
         return this.field17153.getBoundingBox().method19663(4.0, var1, var1);
      }
   }
}
