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

import javax.annotation.Nullable;
import java.util.Map;

public class Class3229 extends Class3227 {
   private static String[] field18668;
   public static final DirectionProperty field18669 = HorizontalBlock.HORIZONTAL_FACING;
   private static final Map<Direction, VoxelShape> field18670 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.NORTH,
         Block.makeCuboidShape(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         Direction.SOUTH,
         Block.makeCuboidShape(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         Direction.WEST,
         Block.makeCuboidShape(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         Direction.EAST,
         Block.makeCuboidShape(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   public Class3229(Properties var1) {
      super(var1);
      this.method11578(this.field18612.method35393().with(field18669, Direction.NORTH).with(field18663, Boolean.valueOf(true)));
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18670.get(var1.<Direction>get(field18669));
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field18669, var2.rotate(var1.<Direction>get(field18669)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field18669)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18669, field18663);
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>get(field18663)) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      return var2.getOpposite() == var1.get(field18669) && !var1.method23443(var4, var5) ? Blocks.AIR.method11579() : var1;
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      Direction var6 = var1.<Direction>get(field18669);
      BlockPos var7 = var3.method8349(var6.getOpposite());
      BlockState var8 = var2.getBlockState(var7);
      return var8.method23454(var2, var7, var6);
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      BlockState var4 = super.method11495(var1);
      World var5 = var1.method18360();
      BlockPos var6 = var1.method18345();
      Direction[] var7 = var1.method18349();

      for (Direction var11 : var7) {
         if (var11.getAxis().method324()) {
            var4 = var4.with(field18669, var11.getOpposite());
            if (var4.method23443(var5, var6)) {
               return var4;
            }
         }
      }

      return null;
   }
}
