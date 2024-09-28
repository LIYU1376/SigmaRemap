package mapped;

import java.util.Random;

import net.minecraft.block.HorizontalBlock;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.ChestContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3347 extends Class3346<Class943> implements Class3207 {
   public static final DirectionProperty field18860 = HorizontalBlock.HORIZONTAL_FACING;
   public static final BooleanProperty field18861 = BlockStateProperties.field39710;
   public static final VoxelShape field18862 = Block.makeCuboidShape(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final ITextComponent field18863 = new TranslationTextComponent("container.enderchest");

   public Class3347(Properties var1) {
      super(var1, () -> TileEntityType.field21424);
      this.method11578(this.field18612.method35393().with(field18860, Direction.NORTH).with(field18861, Boolean.valueOf(false)));
   }

   @Override
   public Class7995<? extends Class941> method11904(BlockState var1, World var2, BlockPos var3, boolean var4) {
      return Class6139::method19041;
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18862;
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.field9886;
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      FluidState var4 = var1.method18360().getFluidState(var1.method18345());
      return this.method11579()
         .with(field18860, var1.method18350().getOpposite())
         .with(field18861, Boolean.valueOf(var4.method23472() == Class9479.field44066));
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      Class980 var9 = var4.method2942();
      TileEntity var10 = var2.getTileEntity(var3);
      if (var9 != null && var10 instanceof Class943) {
         BlockPos var11 = var3.up();
         if (var2.getBlockState(var11).method23400(var2, var11)) {
            return ActionResultType.method9002(var2.isRemote);
         } else if (!var2.isRemote) {
            Class943 var12 = (Class943)var10;
            var9.method4064(var12);
            var4.method2766(new Class953((var1x, var2x, var3x) -> ChestContainer.method18162(var1x, var2x, var9), field18863));
            var4.method2911(Stats.field40156);
            Class4388.method13832(var4, true);
            return ActionResultType.field14819;
         } else {
            return ActionResultType.SUCCESS;
         }
      } else {
         return ActionResultType.method9002(var2.isRemote);
      }
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new Class943();
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      for (int var7 = 0; var7 < 3; var7++) {
         int var8 = var4.nextInt(2) * 2 - 1;
         int var9 = var4.nextInt(2) * 2 - 1;
         double var10 = (double)var3.getX() + 0.5 + 0.25 * (double)var8;
         double var12 = (double)((float)var3.getY() + var4.nextFloat());
         double var14 = (double)var3.getZ() + 0.5 + 0.25 * (double)var9;
         double var16 = (double)(var4.nextFloat() * (float)var8);
         double var18 = ((double)var4.nextFloat() - 0.5) * 0.125;
         double var20 = (double)(var4.nextFloat() * (float)var9);
         var2.addParticle(ParticleTypes.field34090, var10, var12, var14, var16, var18, var20);
      }
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field18860, var2.rotate(var1.<Direction>get(field18860)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field18860)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18860, field18861);
   }

   @Override
   public FluidState method11498(BlockState var1) {
      return !var1.<Boolean>get(field18861) ? super.method11498(var1) : Class9479.field44066.method25078(false);
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>get(field18861)) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11494(BlockState var1, IBlockReader var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
