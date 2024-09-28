package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;

public class Class3488 extends Class3194 {
   private static String[] field19352;
   public static final VoxelShape field19353 = Block.makeCuboidShape(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   public Class3488(Properties var1) {
      super(var1);
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19353;
   }

   @Override
   public boolean method11490(BlockState var1, IBlockReader var2, BlockPos var3) {
      return var1.isIn(BlockTags.field32799) || var1.isIn(Blocks.SOUL_SOIL) || super.method11490(var1, var2, var3);
   }

   @Override
   public Class2260 method11994() {
      return Class2260.field14703;
   }
}
