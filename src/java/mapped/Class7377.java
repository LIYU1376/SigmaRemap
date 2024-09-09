package mapped;

import com.google.common.collect.ImmutableMap;
import com.mentalfrostbyte.jello.event.impl.EventRenderBlocks;
import com.mojang.serialization.MapCodec;
import com.mentalfrostbyte.jello.Client;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class Class7377 extends Class7378<Block, BlockState> {
   private final int field31564;
   private final boolean field31565;
   private final boolean field31566;
   private final Class8649 field31567;
   private final Class7210 field31568;
   private final float field31569;
   private final boolean field31570;
   private final boolean field31571;
   private final Class8609 field31572;
   private final Class8609 field31573;
   private final Class8609 field31574;
   private final Class8609 field31575;
   private final Class8609 field31576;
   public Class6486 field31577;

   public Class7377(Block var1, ImmutableMap<Class8550<?>, Comparable<?>> var2, MapCodec<BlockState> var3) {
      super(var1, var2, var3);
      AbstractBlock var6 = var1.field19013;
      this.field31564 = AbstractBlock.method26654(var6).applyAsInt(this.method23457());
      this.field31565 = var1.method11534(this.method23457());
      this.field31566 = AbstractBlock.method26655(var6);
      this.field31567 = AbstractBlock.method26643(var6);
      this.field31568 = (Class7210) AbstractBlock.method26653(var6).apply(this.method23457());
      this.field31569 = AbstractBlock.method26656(var6);
      this.field31570 = AbstractBlock.method26657(var6);
      this.field31571 = AbstractBlock.method26658(var6);
      this.field31572 = AbstractBlock.method26659(var6);
      this.field31573 = AbstractBlock.method26660(var6);
      this.field31574 = AbstractBlock.method26661(var6);
      this.field31575 = AbstractBlock.method26662(var6);
      this.field31576 = AbstractBlock.method26663(var6);
   }

   public void method23382() {
      if (!this.getBlock().method11582()) {
         this.field31577 = new Class6486(this.method23457());
      }
   }

   public Block getBlock() {
      return this.field31579;
   }

   public Class8649 getMaterial() {
      return this.field31567;
   }

   public boolean method23385(IBlockReader var1, BlockPos var2, EntityType<?> var3) {
      return AbstractBlock.method26664(this.getBlock().field19013).method38752(this.method23457(), var1, var2, var3);
   }

   public boolean method23386(IBlockReader var1, BlockPos var2) {
      return this.field31577 == null ? this.getBlock().method11493(this.method23457(), var1, var2) : Class6486.method19652(this.field31577);
   }

   public int getOpacity(IBlockReader var1, BlockPos var2) {
      return this.field31577 == null ? this.getBlock().method11996(this.method23457(), var1, var2) : Class6486.method19653(this.field31577);
   }

   public VoxelShape method23388(IBlockReader var1, BlockPos var2, Direction var3) {
      return this.field31577 != null && Class6486.method19654(this.field31577) != null
         ? Class6486.method19654(this.field31577)[var3.ordinal()]
         : VoxelShapes.method27442(this.method23389(var1, var2), var3);
   }

   public VoxelShape method23389(IBlockReader var1, BlockPos var2) {
      return this.getBlock().method11503(this.method23457(), var1, var2);
   }

   public boolean method23390() {
      return this.field31577 == null || this.field31577.field28443;
   }

   public boolean isTransparent() {
      return this.field31565;
   }

   public int getLightValue() {
      EventRenderBlocks var3 = new EventRenderBlocks(this);
      Client.getInstance().getEventManager().call(var3);
      return !var3.method13971() ? this.field31564 : 1;
   }

   public boolean isAir() {
      return this.field31566;
   }

   public Class7210 method23394(IBlockReader var1, BlockPos var2) {
      return this.field31568;
   }

   public BlockState method23395(Class80 var1) {
      return this.getBlock().method11500(this.method23457(), var1);
   }

   public BlockState method23396(Class2089 var1) {
      return this.getBlock().method11501(this.method23457(), var1);
   }

   public BlockRenderType getRenderType() {
      return this.getBlock().method11526(this.method23457());
   }

   public boolean method23398(IBlockReader var1, BlockPos var2) {
      return this.field31576.method30847(this.method23457(), var1, var2);
   }

   public float method23399(IBlockReader var1, BlockPos var2) {
      return this.getBlock().method11636(this.method23457(), var1, var2);
   }

   public boolean method23400(IBlockReader var1, BlockPos var2) {
      return this.field31572.method30847(this.method23457(), var1, var2);
   }

   public boolean method23401() {
      return this.getBlock().method11516(this.method23457());
   }

   public int method23402(IBlockReader var1, BlockPos var2, Direction var3) {
      return this.getBlock().method11514(this.method23457(), var1, var2, var3);
   }

   public boolean hasComparatorInputOverride() {
      return this.getBlock().method11648(this.method23457());
   }

   public int method23404(World var1, BlockPos var2) {
      return this.getBlock().method11649(this.method23457(), var1, var2);
   }

   public float method23405(IBlockReader var1, BlockPos var2) {
      return this.field31569;
   }

   public float method23406(PlayerEntity var1, IBlockReader var2, BlockPos var3) {
      return this.getBlock().method11997(this.method23457(), var1, var2, var3);
   }

   public int method23407(IBlockReader var1, BlockPos var2, Direction var3) {
      return this.getBlock().method11515(this.method23457(), var1, var2, var3);
   }

   public Class2315 method23408() {
      return this.getBlock().method11689(this.method23457());
   }

   public boolean method23409(IBlockReader var1, BlockPos var2) {
      if (this.field31577 == null) {
         BlockState var5 = this.method23457();
         return !var5.method23410() ? false : Block.method11550(var5.method23389(var1, var2));
      } else {
         return this.field31577.field28438;
      }
   }

   public boolean method23410() {
      return this.field31571;
   }

   public boolean method23411(BlockState var1, Direction var2) {
      return this.getBlock().method11634(this.method23457(), var1, var2);
   }

   public VoxelShape method23412(IBlockReader var1, BlockPos var2) {
      return this.method23413(var1, var2, ISelectionContext.method14947());
   }

   public VoxelShape method23413(IBlockReader var1, BlockPos var2, ISelectionContext var3) {
      return this.getBlock().method11483(this.method23457(), var1, var2, var3);
   }

   public VoxelShape method23414(IBlockReader var1, BlockPos var2) {
      return this.field31577 == null ? this.getCollisionShape(var1, var2, ISelectionContext.method14947()) : this.field31577.field28442;
   }

   public VoxelShape getCollisionShape(IBlockReader var1, BlockPos var2, ISelectionContext var3) {
      return this.getBlock().method11502(this.method23457(), var1, var2, var3);
   }

   public VoxelShape method23416(IBlockReader var1, BlockPos var2) {
      return this.getBlock().method11995(this.method23457(), var1, var2);
   }

   public VoxelShape method23417(IBlockReader var1, BlockPos var2, ISelectionContext var3) {
      return this.getBlock().method11635(this.method23457(), var1, var2, var3);
   }

   public VoxelShape method23418(IBlockReader var1, BlockPos var2) {
      return this.getBlock().method11938(this.method23457(), var1, var2);
   }

   public final boolean method23419(IBlockReader var1, BlockPos var2, Entity var3) {
      return this.method23420(var1, var2, var3, Direction.field673);
   }

   public final boolean method23420(IBlockReader var1, BlockPos var2, Entity var3, Direction var4) {
      return Block.method11549(this.getCollisionShape(var1, var2, ISelectionContext.forEntity(var3)), var4);
   }

   public Vector3d method23421(IBlockReader var1, BlockPos var2) {
      Class2260 var5 = this.getBlock().method11994();
      if (var5 != Class2260.field14702) {
         long var6 = MathHelper.method37810(var2.getX(), 0, var2.getZ());
         return new Vector3d(
            ((double)((float)(var6 & 15L) / 15.0F) - 0.5) * 0.5,
            var5 != Class2260.field14704 ? 0.0 : ((double)((float)(var6 >> 4 & 15L) / 15.0F) - 1.0) * 0.2,
            ((double)((float)(var6 >> 8 & 15L) / 15.0F) - 0.5) * 0.5
         );
      } else {
         return Vector3d.ZERO;
      }
   }

   public boolean method23422(World var1, BlockPos var2, int var3, int var4) {
      return this.getBlock().method11647(this.method23457(), var1, var2, var3, var4);
   }

   public void method23423(World var1, BlockPos var2, Block var3, BlockPos var4, boolean var5) {
      this.getBlock().method11506(this.method23457(), var1, var2, var3, var4, var5);
   }

   public final void method23424(Class1660 var1, BlockPos var2, int var3) {
      this.updateNeighbours(var1, var2, var3, 512);
   }

   public final void updateNeighbours(Class1660 var1, BlockPos var2, int var3, int var4) {
      this.getBlock();
      BlockPos.Mutable var7 = new BlockPos.Mutable();

      for (Direction var11 : Class3390.field19003) {
         var7.method8377(var2, var11);
         BlockState var12 = var1.getBlockState(var7);
         BlockState var13 = var12.method23439(var11.method536(), this.method23457(), var1, var7, var2);
         Block.method11544(var12, var13, var1, var7, var3, var4);
      }
   }

   public final void method23426(Class1660 var1, BlockPos var2, int var3) {
      this.updateDiagonalNeighbors(var1, var2, var3, 512);
   }

   public void updateDiagonalNeighbors(Class1660 var1, BlockPos var2, int var3, int var4) {
      this.getBlock().method11618(this.method23457(), var1, var2, var3, var4);
   }

   public void method23428(World var1, BlockPos var2, BlockState var3, boolean var4) {
      this.getBlock().method11589(this.method23457(), var1, var2, var3, var4);
   }

   public void method23429(World var1, BlockPos var2, BlockState var3, boolean var4) {
      this.getBlock().method11513(this.method23457(), var1, var2, var3, var4);
   }

   public void method23430(ServerWorld var1, BlockPos var2, Random var3) {
      this.getBlock().method11522(this.method23457(), var1, var2, var3);
   }

   public void method23431(ServerWorld var1, BlockPos var2, Random var3) {
      this.getBlock().method11484(this.method23457(), var1, var2, var3);
   }

   public void method23432(World var1, BlockPos var2, Entity var3) {
      this.getBlock().method11523(this.method23457(), var1, var2, var3);
   }

   public void method23433(ServerWorld var1, BlockPos var2, ItemStack var3) {
      this.getBlock().method11965(this.method23457(), var1, var2, var3);
   }

   public List<ItemStack> method23434(Class9464 var1) {
      return this.getBlock().method11697(this.method23457(), var1);
   }

   public ActionResultType method23435(World var1, PlayerEntity var2, Hand var3, BlockRayTraceResult var4) {
      return this.getBlock().method11505(this.method23457(), var1, var4.getPos(), var2, var3, var4);
   }

   public void method23436(World var1, BlockPos var2, PlayerEntity var3) {
      this.getBlock().method11602(this.method23457(), var1, var2, var3);
   }

   public boolean method23437(IBlockReader var1, BlockPos var2) {
      return this.field31573.method30847(this.method23457(), var1, var2);
   }

   public boolean method23438(IBlockReader var1, BlockPos var2) {
      return this.field31574.method30847(this.method23457(), var1, var2);
   }

   public BlockState method23439(Direction var1, BlockState var2, Class1660 var3, BlockPos var4, BlockPos var5) {
      return this.getBlock().method11491(this.method23457(), var1, var2, var3, var4, var5);
   }

   public boolean method23440(IBlockReader var1, BlockPos var2, Class1947 var3) {
      return this.getBlock().method11494(this.method23457(), var1, var2, var3);
   }

   public boolean method23441(Class5909 var1) {
      return this.getBlock().method11497(this.method23457(), var1);
   }

   public boolean method23442(Fluid var1) {
      return this.getBlock().method11650(this.method23457(), var1);
   }

   public boolean method23443(Class1662 var1, BlockPos var2) {
      return this.getBlock().method11492(this.method23457(), var1, var2);
   }

   public boolean method23444(IBlockReader var1, BlockPos var2) {
      return this.field31575.method30847(this.method23457(), var1, var2);
   }

   @Nullable
   public Class949 method23445(World var1, BlockPos var2) {
      return this.getBlock().method11528(this.method23457(), var1, var2);
   }

   public boolean method23446(ITag<Block> var1) {
      return this.getBlock().isIn(var1);
   }

   public boolean method23447(ITag<Block> var1, Predicate<Class7377> var2) {
      return this.getBlock().isIn(var1) && var2.test(this);
   }

   public boolean isIn(Block var1) {
      return this.getBlock().method11541(var1);
   }

   public FluidState method23449() {
      return this.getBlock().method11498(this.method23457());
   }

   public boolean method23450() {
      return this.getBlock().method11499(this.method23457());
   }

   public long method23451(BlockPos var1) {
      return this.getBlock().method11691(this.method23457(), var1);
   }

   public SoundType getSoundType() {
      return this.getBlock().method11580(this.method23457());
   }

   public void method23453(World var1, BlockState var2, BlockRayTraceResult var3, ProjectileEntity var4) {
      this.getBlock().method11595(var1, var2, var3, var4);
   }

   public boolean method23454(IBlockReader var1, BlockPos var2, Direction var3) {
      return this.method23455(var1, var2, var3, Class2156.field14140);
   }

   public boolean method23455(IBlockReader var1, BlockPos var2, Direction var3, Class2156 var4) {
      return this.field31577 == null ? var4.method8876(this.method23457(), var1, var2, var3) : this.field31577.method19649(var3, var4);
   }

   public boolean method23456(IBlockReader var1, BlockPos var2) {
      return this.field31577 == null ? Block.method11550(this.method23414(var1, var2)) : this.field31577.field28445;
   }

   public abstract BlockState method23457();

   public boolean method23458() {
      return this.field31570;
   }
}
