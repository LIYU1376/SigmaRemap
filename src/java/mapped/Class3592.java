package mapped;

import com.mentalfrostbyte.jello.module.impl.combat.BowAimbot;
import net.minecraft.entity.Entity;

import java.util.Comparator;

public class Class3592 implements Comparator<Entity> {
   private static String[] field19537;
   public final BowAimbot field19538;

   public Class3592(BowAimbot var1) {
      this.field19538 = var1;
   }

   public int compare(Entity var1, Entity var2) {
      float var5 = RotationHelper.angleDiff(RotationHelper.method34147(var1).field32084, BowAimbot.method16574().player.rotationYaw);
      float var6 = RotationHelper.angleDiff(RotationHelper.method34147(var2).field32084, BowAimbot.method16575().player.rotationYaw);
      if (!(var5 - var6 < 0.0F)) {
         if (var5 - var6 != 0.0F) {
            return 1;
         } else {
            float var7 = BowAimbot.method16576().player.getDistance(var1);
            float var8 = BowAimbot.method16577().player.getDistance(var2);
            if (!(var7 - var8 < 0.0F)) {
               return var7 - var8 != 0.0F ? 1 : 0;
            } else {
               return -1;
            }
         }
      } else {
         return -1;
      }
   }
}
