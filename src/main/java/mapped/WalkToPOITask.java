package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.server.ServerWorld;

public class WalkToPOITask extends Class3676<VillagerEntity> {
   private static String[] field19705;
   private final float field19706;
   private final int field19707;

   public WalkToPOITask(float var1, int var2) {
      super(ImmutableMap.of(MemoryModuleType.field39824, Class2217.field14485));
      this.field19706 = var1;
      this.field19707 = var2;
   }

   public boolean method12508(ServerWorld var1, VillagerEntity var2) {
      return !var1.method6952(var2.getPosition());
   }

   public void startExecuting(ServerWorld var1, VillagerEntity var2, long var3) {
      PointOfInterestManager var7 = var1.getPointOfInterestManager();
      int var8 = var7.sectionsToVillage(SectionPos.from(var2.getPosition()));
      Vector3d var9 = null;

      for (int var10 = 0; var10 < 5; var10++) {
         Vector3d var11 = Class8037.method27584(var2, 15, 7, var1x -> (double)(-var1.method6955(SectionPos.from(var1x))));
         if (var11 != null) {
            int var12 = var7.sectionsToVillage(SectionPos.from(new BlockPos(var11)));
            if (var12 < var8) {
               var9 = var11;
               break;
            }

            if (var12 == var8) {
               var9 = var11;
            }
         }
      }

      if (var9 != null) {
         var2.getBrain().method21406(MemoryModuleType.field39824, new Class8999(var9, this.field19706, this.field19707));
      }
   }
}
