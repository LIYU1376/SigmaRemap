package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3414 extends Block {
   private static String[] field19103;
   private final Block field19104;

   public Class3414(Block var1, Properties var2) {
      super(var2);
      this.field19104 = var1;
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!this.method12052(var2, var3)) {
         var2.setBlockState(var3, this.field19104.method11579(), 2);
      }
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (!this.method12052(var4, var5)) {
         var4.method6860().method20726(var5, this, 60 + var4.method6814().nextInt(40));
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   public boolean method12052(IBlockReader var1, BlockPos var2) {
      for (Direction var8 : Direction.values()) {
         FluidState var9 = var1.getFluidState(var2.method8349(var8));
         if (var9.method23486(FluidTags.field40469)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      if (!this.method12052(var1.method18360(), var1.method18345())) {
         var1.method18360().method6860().method20726(var1.method18345(), this, 60 + var1.method18360().method6814().nextInt(40));
      }

      return this.method11579();
   }
}
