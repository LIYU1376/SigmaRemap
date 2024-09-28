package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3237 extends Class3238 {
   private static String[] field18678;

   public Class3237(Properties var1) {
      super(1.0F, 1.0F, 16.0F, 16.0F, 16.0F, var1);
      this.method11578(
         this.field18612
            .method35393()
            .with(field18680, Boolean.valueOf(false))
            .with(field18681, Boolean.valueOf(false))
            .with(field18682, Boolean.valueOf(false))
            .with(field18683, Boolean.valueOf(false))
            .with(field18684, Boolean.valueOf(false))
      );
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      World var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      FluidState var6 = var1.method18360().getFluidState(var1.method18345());
      BlockPos var7 = var5.north();
      BlockPos var8 = var5.south();
      BlockPos var9 = var5.west();
      BlockPos var10 = var5.east();
      BlockState var11 = var4.getBlockState(var7);
      BlockState var12 = var4.getBlockState(var8);
      BlockState var13 = var4.getBlockState(var9);
      BlockState var14 = var4.getBlockState(var10);
      return this.method11579()
         .with(field18680, Boolean.valueOf(this.method11638(var11, var11.method23454(var4, var7, Direction.SOUTH))))
         .with(field18682, Boolean.valueOf(this.method11638(var12, var12.method23454(var4, var8, Direction.NORTH))))
         .with(field18683, Boolean.valueOf(this.method11638(var13, var13.method23454(var4, var9, Direction.EAST))))
         .with(field18681, Boolean.valueOf(this.method11638(var14, var14.method23454(var4, var10, Direction.WEST))))
         .with(field18684, Boolean.valueOf(var6.method23472() == Class9479.field44066));
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>get(field18684)) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      return !var2.getAxis().method324()
         ? super.method11491(var1, var2, var3, var4, var5, var6)
         : var1.with(field18685.get(var2), Boolean.valueOf(this.method11638(var3, var3.method23454(var4, var6, var2.getOpposite()))));
   }

   @Override
   public VoxelShape method11635(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return VoxelShapes.method27425();
   }

   @Override
   public boolean method11634(BlockState var1, BlockState var2, Direction var3) {
      if (var2.isIn(this)) {
         if (!var3.getAxis().method324()) {
            return true;
         }

         if (var1.<Boolean>get(field18685.get(var3)) && var2.<Boolean>get(field18685.get(var3.getOpposite()))) {
            return true;
         }
      }

      return super.method11634(var1, var2, var3);
   }

   public final boolean method11638(BlockState var1, boolean var2) {
      Block var5 = var1.getBlock();
      return !method11545(var5) && var2 || var5 instanceof Class3237 || var5.isIn(BlockTags.field32764);
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18680, field18681, field18683, field18682, field18684);
   }
}
