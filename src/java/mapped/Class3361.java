package mapped;

import net.minecraft.block.HorizontalBlock;
import net.minecraft.state.DirectionProperty;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Map;

public class Class3361 extends Class3359 {
   private static String[] field18909;
   public static final DirectionProperty field18910 = HorizontalBlock.HORIZONTAL_FACING;
   private static final Map<Direction, VoxelShape> field18911 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.NORTH,
         Block.makeCuboidShape(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         Direction.SOUTH,
         Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         Direction.WEST,
         Block.makeCuboidShape(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         Direction.EAST,
         Block.makeCuboidShape(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   public Class3361(Class112 var1, Properties var2) {
      super(var1, var2);
      this.method11578(this.field18612.method35393().with(field18910, Direction.NORTH));
   }

   @Override
   public String getTranslationKey() {
      return this.method11581().getTranslationKey();
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      return var2.getBlockState(var3.method8349(var1.<Direction>get(field18910).getOpposite())).getMaterial().isSolid();
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2 == var1.<Direction>get(field18910).getOpposite() && !var1.method23443(var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18911.get(var1.<Direction>get(field18910));
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      BlockState var4 = this.method11579();
      World var5 = var1.method18360();
      BlockPos var6 = var1.method18345();
      Direction[] var7 = var1.method18349();

      for (Direction var11 : var7) {
         if (var11.getAxis().method324()) {
            Direction var12 = var11.getOpposite();
            var4 = var4.with(field18910, var12);
            if (var4.method23443(var5, var6)) {
               return var4;
            }
         }
      }

      return null;
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field18910, var2.rotate(var1.<Direction>get(field18910)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field18910)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18910);
   }
}
