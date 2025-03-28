package net.minecraft.block;

import java.util.List;
import javax.annotation.Nullable;

import mapped.*;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.ShulkerBoxTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class ShulkerBoxBlock extends ContainerBlock {
   public static final EnumProperty<Direction> field18939 = Class3433.field19198;
   public static final ResourceLocation field18940 = new ResourceLocation("contents");
   private final DyeColor field18941;

   public ShulkerBoxBlock(DyeColor var1, Properties var2) {
      super(var2);
      this.field18941 = var1;
      this.setDefaultState(this.stateContainer.getBaseState().with(field18939, Direction.UP));
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new ShulkerBoxTileEntity(this.field18941);
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.field9886;
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         if (!var4.isSpectator()) {
            TileEntity var9 = var2.getTileEntity(var3);
            if (!(var9 instanceof ShulkerBoxTileEntity)) {
               return ActionResultType.field14820;
            } else {
               ShulkerBoxTileEntity var10 = (ShulkerBoxTileEntity)var9;
               boolean var11;
               if (var10.method3746() != Class2126.field13872) {
                  var11 = true;
               } else {
                  Direction var12 = var1.<Direction>get(field18939);
                  var11 = var2.hasNoCollisions(Class8919.method32596(var3, var12));
               }

               if (var11) {
                  var4.method2766(var10);
                  var4.method2911(Stats.field40163);
                  Class4388.method13832(var4, true);
               }

               return ActionResultType.field14819;
            }
         } else {
            return ActionResultType.field14819;
         }
      } else {
         return ActionResultType.SUCCESS;
      }
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      return this.getDefaultState().with(field18939, var1.getFace());
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18939);
   }

   @Override
   public void onBlockHarvested(World var1, BlockPos var2, BlockState var3, PlayerEntity var4) {
      TileEntity var7 = var1.getTileEntity(var2);
      if (var7 instanceof ShulkerBoxTileEntity) {
         ShulkerBoxTileEntity var8 = (ShulkerBoxTileEntity)var7;
         if (!var1.isRemote && var4.isCreative() && !var8.isEmpty()) {
            ItemStack var9 = method11958(this.method11957());
            CompoundNBT var10 = var8.method3754(new CompoundNBT());
            if (!var10.isEmpty()) {
               var9.setTagInfo("BlockEntityTag", var10);
            }

            if (var8.method3381()) {
               var9.method32150(var8.method3380());
            }

            ItemEntity var11 = new ItemEntity(var1, (double)var2.getX() + 0.5, (double)var2.getY() + 0.5, (double)var2.getZ() + 0.5, var9);
            var11.setDefaultPickupDelay();
            var1.addEntity(var11);
         } else {
            var8.method3743(var4);
         }
      }

      super.onBlockHarvested(var1, var2, var3, var4);
   }

   @Override
   public List<ItemStack> method11697(BlockState var1, Class9464 var2) {
      TileEntity var5 = var2.<TileEntity>method36459(Class9525.field44337);
      if (var5 instanceof ShulkerBoxTileEntity) {
         ShulkerBoxTileEntity var6 = (ShulkerBoxTileEntity)var5;
         var2 = var2.method36456(field18940, (var1x, var2x) -> {
            for (int var5x = 0; var5x < var6.getSizeInventory(); var5x++) {
               var2x.accept(var6.getStackInSlot(var5x));
            }
         });
      }

      return super.method11697(var1, var2);
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      if (var5.method32152()) {
         TileEntity var8 = var1.getTileEntity(var2);
         if (var8 instanceof ShulkerBoxTileEntity) {
            ((ShulkerBoxTileEntity)var8).method3695(var5.method32149());
         }
      }
   }

   @Override
   public void onReplaced(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.isIn(var4.getBlock())) {
         TileEntity var8 = var2.getTileEntity(var3);
         if (var8 instanceof ShulkerBoxTileEntity) {
            var2.updateComparatorOutputLevel(var3, var1.getBlock());
         }

         super.onReplaced(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void method11583(ItemStack var1, IBlockReader var2, List<ITextComponent> var3, Class2216 var4) {
      super.method11583(var1, var2, var3, var4);
      CompoundNBT var7 = var1.method32145("BlockEntityTag");
      if (var7 != null) {
         if (var7.contains("LootTable", 8)) {
            var3.add(new StringTextComponent("???????"));
         }

         if (var7.contains("Items", 9)) {
            NonNullList<ItemStack> var8 = NonNullList.method68(27, ItemStack.EMPTY);
            ItemStackHelper.loadAllItems(var7, var8);
            int var9 = 0;
            int var10 = 0;

            for (ItemStack var12 : var8) {
               if (!var12.isEmpty()) {
                  var10++;
                  if (var9 <= 4) {
                     var9++;
                     IFormattableTextComponent var13 = var12.method32149().deepCopy();
                     var13.appendString(" x").appendString(String.valueOf(var12.getCount()));
                     var3.add(var13);
                  }
               }
            }

            if (var10 - var9 > 0) {
               var3.add(new TranslationTextComponent("container.shulkerBox.more", var10 - var9).mergeStyle(TextFormatting.ITALIC));
            }
         }
      }
   }

   @Override
   public PushReaction method11689(BlockState var1) {
      return PushReaction.field15863;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      TileEntity var7 = var2.getTileEntity(var3);
      return !(var7 instanceof ShulkerBoxTileEntity) ? VoxelShapes.method27426() : VoxelShapes.create(((ShulkerBoxTileEntity)var7).method3747(var1));
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return Container.calcRedstoneFromInventory((IInventory)var2.getTileEntity(var3));
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      ItemStack var6 = super.getItem(var1, var2, var3);
      ShulkerBoxTileEntity var7 = (ShulkerBoxTileEntity)var1.getTileEntity(var2);
      CompoundNBT var8 = var7.method3754(new CompoundNBT());
      if (!var8.isEmpty()) {
         var6.setTagInfo("BlockEntityTag", var8);
      }

      return var6;
   }

   @Nullable
   public static DyeColor method11954(Item var0) {
      return method11955(Block.method11537(var0));
   }

   @Nullable
   public static DyeColor method11955(Block var0) {
      return !(var0 instanceof ShulkerBoxBlock) ? null : ((ShulkerBoxBlock)var0).method11957();
   }

   public static Block method11956(DyeColor var0) {
      if (var0 == null) {
         return Blocks.SHULKER_BOX;
      } else {
         switch (Class7797.field33491[var0.ordinal()]) {
            case 1:
               return Blocks.WHITE_SHULKER_BOX;
            case 2:
               return Blocks.ORANGE_SHULKER_BOX;
            case 3:
               return Blocks.MAGENTA_SHULKER_BOX;
            case 4:
               return Blocks.LIGHT_BLUE_SHULKER_BOX;
            case 5:
               return Blocks.YELLOW_SHULKER_BOX;
            case 6:
               return Blocks.LIME_SHULKER_BOX;
            case 7:
               return Blocks.PINK_SHULKER_BOX;
            case 8:
               return Blocks.GRAY_SHULKER_BOX;
            case 9:
               return Blocks.LIGHT_GRAY_SHULKER_BOX;
            case 10:
               return Blocks.CYAN_SHULKER_BOX;
            case 11:
            default:
               return Blocks.PURPLE_SHULKER_BOX;
            case 12:
               return Blocks.BLUE_SHULKER_BOX;
            case 13:
               return Blocks.BROWN_SHULKER_BOX;
            case 14:
               return Blocks.GREEN_SHULKER_BOX;
            case 15:
               return Blocks.RED_SHULKER_BOX;
            case 16:
               return Blocks.BLACK_SHULKER_BOX;
         }
      }
   }

   @Nullable
   public DyeColor method11957() {
      return this.field18941;
   }

   public static ItemStack method11958(DyeColor var0) {
      return new ItemStack(method11956(var0));
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field18939, var2.rotate(var1.<Direction>get(field18939)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field18939)));
   }
}
