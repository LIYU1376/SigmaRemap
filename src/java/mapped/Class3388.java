package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class3388 extends Class3386 {
   private static String[] field18993;

   public Class3388(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18994, Direction.field414));
   }

   @Override
   public void onFallenUpon(World var1, BlockPos var2, Entity var3, float var4) {
      var3.onLivingFall(var4, 0.2F);
   }
}
