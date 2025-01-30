package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.nio.file.Path;

public class Class4454 extends Class4441<Block> {
   public Class4454(Class9068 var1) {
      super(var1, Registry.BLOCK);
   }

   @Override
   public void method14010() {
      this.method14014(BlockTags.WOOL)
         .method31560(
            Blocks.WHITE_WOOL,
            Blocks.ORANGE_WOOL,
            Blocks.MAGENTA_WOOL,
            Blocks.LIGHT_BLUE_WOOL,
            Blocks.YELLOW_WOOL,
            Blocks.LIME_WOOL,
            Blocks.PINK_WOOL,
            Blocks.GRAY_WOOL,
            Blocks.LIGHT_GRAY_WOOL,
            Blocks.CYAN_WOOL,
            Blocks.PURPLE_WOOL,
            Blocks.BLUE_WOOL,
            Blocks.BROWN_WOOL,
            Blocks.GREEN_WOOL,
            Blocks.RED_WOOL,
            Blocks.BLACK_WOOL
         );
      this.method14014(BlockTags.field32735)
         .method31560(
            Blocks.OAK_PLANKS,
            Blocks.SPRUCE_PLANKS,
            Blocks.BIRCH_PLANKS,
            Blocks.JUNGLE_PLANKS,
            Blocks.ACACIA_PLANKS,
            Blocks.DARK_OAK_PLANKS,
            Blocks.CRIMSON_PLANKS,
            Blocks.WARPED_PLANKS
         );
      this.method14014(BlockTags.field32736).method31560(Blocks.STONE_BRICKS, Blocks.MOSSY_STONE_BRICKS, Blocks.CRACKED_STONE_BRICKS, Blocks.CHISELED_STONE_BRICKS);
      this.method14014(BlockTags.field32737)
         .method31560(
            Blocks.OAK_BUTTON,
            Blocks.SPRUCE_BUTTON,
            Blocks.BIRCH_BUTTON,
            Blocks.JUNGLE_BUTTON,
            Blocks.ACACIA_BUTTON,
            Blocks.DARK_OAK_BUTTON,
            Blocks.CRIMSON_BUTTON,
            Blocks.WARPED_BUTTON
         );
      this.method14014(BlockTags.field32738).method31559(BlockTags.field32737).method31558(Blocks.STONE_BUTTON).method31558(Blocks.POLISHED_BLACKSTONE_BUTTON);
      this.method14014(BlockTags.field32739)
         .method31560(
            Blocks.WHITE_CARPET,
            Blocks.ORANGE_CARPET,
            Blocks.MAGENTA_CARPET,
            Blocks.LIGHT_BLUE_CARPET,
            Blocks.YELLOW_CARPET,
            Blocks.LIME_CARPET,
            Blocks.PINK_CARPET,
            Blocks.GRAY_CARPET,
            Blocks.LIGHT_GRAY_CARPET,
            Blocks.CYAN_CARPET,
            Blocks.PURPLE_CARPET,
            Blocks.BLUE_CARPET,
            Blocks.BROWN_CARPET,
            Blocks.GREEN_CARPET,
            Blocks.RED_CARPET,
            Blocks.BLACK_CARPET
         );
      this.method14014(BlockTags.field32740)
         .method31560(
            Blocks.OAK_DOOR,
            Blocks.SPRUCE_DOOR,
            Blocks.BIRCH_DOOR,
            Blocks.JUNGLE_DOOR,
            Blocks.ACACIA_DOOR,
            Blocks.DARK_OAK_DOOR,
            Blocks.CRIMSON_DOOR,
            Blocks.WARPED_DOOR
         );
      this.method14014(BlockTags.field32741)
         .method31560(
            Blocks.OAK_STAIRS,
            Blocks.SPRUCE_STAIRS,
            Blocks.BIRCH_STAIRS,
            Blocks.JUNGLE_STAIRS,
            Blocks.ACACIA_STAIRS,
            Blocks.DARK_OAK_STAIRS,
            Blocks.CRIMSON_STAIRS,
            Blocks.WARPED_STAIRS
         );
      this.method14014(BlockTags.field32742)
         .method31560(
            Blocks.OAK_SLAB,
            Blocks.SPRUCE_SLAB,
            Blocks.BIRCH_SLAB,
            Blocks.JUNGLE_SLAB,
            Blocks.ACACIA_SLAB,
            Blocks.DARK_OAK_SLAB,
            Blocks.CRIMSON_SLAB,
            Blocks.WARPED_SLAB
         );
      this.method14014(BlockTags.field32743)
         .method31560(
            Blocks.OAK_FENCE,
            Blocks.ACACIA_FENCE,
            Blocks.DARK_OAK_FENCE,
            Blocks.SPRUCE_FENCE,
            Blocks.BIRCH_FENCE,
            Blocks.JUNGLE_FENCE,
            Blocks.CRIMSON_FENCE,
            Blocks.WARPED_FENCE
         );
      this.method14014(BlockTags.field32748).method31559(BlockTags.field32740).method31558(Blocks.IRON_DOOR);
      this.method14014(BlockTags.field32749)
         .method31560(Blocks.OAK_SAPLING, Blocks.SPRUCE_SAPLING, Blocks.BIRCH_SAPLING, Blocks.JUNGLE_SAPLING, Blocks.ACACIA_SAPLING, Blocks.DARK_OAK_SAPLING);
      this.method14014(BlockTags.field32752).method31560(Blocks.DARK_OAK_LOG, Blocks.DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_WOOD);
      this.method14014(BlockTags.field32753).method31560(Blocks.OAK_LOG, Blocks.OAK_WOOD, Blocks.STRIPPED_OAK_LOG, Blocks.STRIPPED_OAK_WOOD);
      this.method14014(BlockTags.field32755).method31560(Blocks.ACACIA_LOG, Blocks.ACACIA_WOOD, Blocks.STRIPPED_ACACIA_LOG, Blocks.STRIPPED_ACACIA_WOOD);
      this.method14014(BlockTags.field32754).method31560(Blocks.BIRCH_LOG, Blocks.BIRCH_WOOD, Blocks.STRIPPED_BIRCH_LOG, Blocks.STRIPPED_BIRCH_WOOD);
      this.method14014(BlockTags.field32756).method31560(Blocks.JUNGLE_LOG, Blocks.JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_WOOD);
      this.method14014(BlockTags.field32757).method31560(Blocks.SPRUCE_LOG, Blocks.SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_WOOD);
      this.method14014(BlockTags.field32758).method31560(Blocks.CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_STEM, Blocks.CRIMSON_HYPHAE, Blocks.STRIPPED_CRIMSON_HYPHAE);
      this.method14014(BlockTags.field32759).method31560(Blocks.WARPED_STEM, Blocks.STRIPPED_WARPED_STEM, Blocks.WARPED_HYPHAE, Blocks.STRIPPED_WARPED_HYPHAE);
      this.method14014(BlockTags.field32750)
         .method31559(BlockTags.field32752)
         .method31559(BlockTags.field32753)
         .method31559(BlockTags.field32755)
         .method31559(BlockTags.field32754)
         .method31559(BlockTags.field32756)
         .method31559(BlockTags.field32757);
      this.method14014(BlockTags.field32751).method31559(BlockTags.field32750).method31559(BlockTags.field32758).method31559(BlockTags.field32759);
      this.method14014(BlockTags.field32765).method31560(Blocks.ANVIL, Blocks.CHIPPED_ANVIL, Blocks.DAMAGED_ANVIL);
      this.method14014(BlockTags.field32769)
         .method31560(
            Blocks.DANDELION,
            Blocks.POPPY,
            Blocks.BLUE_ORCHID,
            Blocks.ALLIUM,
            Blocks.AZURE_BLUET,
            Blocks.RED_TULIP,
            Blocks.ORANGE_TULIP,
            Blocks.WHITE_TULIP,
            Blocks.PINK_TULIP,
            Blocks.OXEYE_DAISY,
            Blocks.CORNFLOWER,
            Blocks.LILY_OF_THE_VALLEY,
            Blocks.WITHER_ROSE
         );
      this.method14014(BlockTags.field32778)
         .method31559(BlockTags.field32769)
         .method31560(
            Blocks.GRASS_BLOCK,
            Blocks.DIRT,
            Blocks.COARSE_DIRT,
            Blocks.PODZOL,
            Blocks.SAND,
            Blocks.RED_SAND,
            Blocks.GRAVEL,
            Blocks.BROWN_MUSHROOM,
            Blocks.RED_MUSHROOM,
            Blocks.TNT,
            Blocks.CACTUS,
            Blocks.CLAY,
            Blocks.PUMPKIN,
            Blocks.CARVED_PUMPKIN,
            Blocks.MELON,
            Blocks.MYCELIUM,
            Blocks.CRIMSON_FUNGUS,
            Blocks.CRIMSON_NYLIUM,
            Blocks.CRIMSON_ROOTS,
            Blocks.WARPED_FUNGUS,
            Blocks.WARPED_NYLIUM,
            Blocks.WARPED_ROOTS
         );
      this.method14014(BlockTags.field32777)
         .method31560(
            Blocks.FLOWER_POT,
            Blocks.POTTED_POPPY,
            Blocks.POTTED_BLUE_ORCHID,
            Blocks.POTTED_ALLIUM,
            Blocks.POTTED_AZURE_BLUET,
            Blocks.POTTED_RED_TULIP,
            Blocks.POTTED_ORANGE_TULIP,
            Blocks.POTTED_WHITE_TULIP,
            Blocks.POTTED_PINK_TULIP,
            Blocks.POTTED_OXEYE_DAISY,
            Blocks.POTTED_DANDELION,
            Blocks.POTTED_OAK_SAPLING,
            Blocks.POTTED_SPRUCE_SAPLING,
            Blocks.POTTED_BIRCH_SAPLING,
            Blocks.POTTED_JUNGLE_SAPLING,
            Blocks.POTTED_ACACIA_SAPLING,
            Blocks.POTTED_DARK_OAK_SAPLING,
            Blocks.POTTED_RED_MUSHROOM,
            Blocks.POTTED_BROWN_MUSHROOM,
            Blocks.POTTED_DEAD_BUSH,
            Blocks.POTTED_FERN,
            Blocks.POTTED_CACTUS,
            Blocks.POTTED_CORNFLOWER,
            Blocks.POTTED_LILY_OF_THE_VALLEY,
            Blocks.POTTED_WITHER_ROSE,
            Blocks.POTTED_BAMBOO,
            Blocks.POTTED_CRIMSON_FUNGUS,
            Blocks.POTTED_WARPED_FUNGUS,
            Blocks.POTTED_CRIMSON_ROOTS,
            Blocks.POTTED_WARPED_ROOTS
         );
      this.method14014(BlockTags.field32760)
         .method31560(
            Blocks.WHITE_BANNER,
            Blocks.ORANGE_BANNER,
            Blocks.MAGENTA_BANNER,
            Blocks.LIGHT_BLUE_BANNER,
            Blocks.YELLOW_BANNER,
            Blocks.LIME_BANNER,
            Blocks.PINK_BANNER,
            Blocks.GRAY_BANNER,
            Blocks.LIGHT_GRAY_BANNER,
            Blocks.CYAN_BANNER,
            Blocks.PURPLE_BANNER,
            Blocks.BLUE_BANNER,
            Blocks.BROWN_BANNER,
            Blocks.GREEN_BANNER,
            Blocks.RED_BANNER,
            Blocks.BLACK_BANNER,
            Blocks.WHITE_WALL_BANNER,
            Blocks.ORANGE_WALL_BANNER,
            Blocks.MAGENTA_WALL_BANNER,
            Blocks.LIGHT_BLUE_WALL_BANNER,
            Blocks.YELLOW_WALL_BANNER,
            Blocks.LIME_WALL_BANNER,
            Blocks.PINK_WALL_BANNER,
            Blocks.GRAY_WALL_BANNER,
            Blocks.LIGHT_GRAY_WALL_BANNER,
            Blocks.CYAN_WALL_BANNER,
            Blocks.PURPLE_WALL_BANNER,
            Blocks.BLUE_WALL_BANNER,
            Blocks.BROWN_WALL_BANNER,
            Blocks.GREEN_WALL_BANNER,
            Blocks.RED_WALL_BANNER,
            Blocks.BLACK_WALL_BANNER
         );
      this.method14014(BlockTags.field32745)
         .method31560(
            Blocks.OAK_PRESSURE_PLATE,
            Blocks.SPRUCE_PRESSURE_PLATE,
            Blocks.BIRCH_PRESSURE_PLATE,
            Blocks.JUNGLE_PRESSURE_PLATE,
            Blocks.ACACIA_PRESSURE_PLATE,
            Blocks.DARK_OAK_PRESSURE_PLATE,
            Blocks.CRIMSON_PRESSURE_PLATE,
            Blocks.WARPED_PRESSURE_PLATE
         );
      this.method14014(BlockTags.field32746).method31560(Blocks.STONE_PRESSURE_PLATE, Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE);
      this.method14014(BlockTags.field32744)
         .method31560(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE, Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)
         .method31559(BlockTags.field32745)
         .method31559(BlockTags.field32746);
      this.method14014(BlockTags.field32762)
         .method31559(BlockTags.field32741)
         .method31560(
            Blocks.COBBLESTONE_STAIRS,
            Blocks.SANDSTONE_STAIRS,
            Blocks.NETHER_BRICK_STAIRS,
            Blocks.STONE_BRICK_STAIRS,
            Blocks.BRICK_STAIRS,
            Blocks.PURPUR_STAIRS,
            Blocks.QUARTZ_STAIRS,
            Blocks.RED_SANDSTONE_STAIRS,
            Blocks.PRISMARINE_BRICK_STAIRS,
            Blocks.PRISMARINE_STAIRS,
            Blocks.DARK_PRISMARINE_STAIRS,
            Blocks.POLISHED_GRANITE_STAIRS,
            Blocks.SMOOTH_RED_SANDSTONE_STAIRS,
            Blocks.MOSSY_STONE_BRICK_STAIRS,
            Blocks.POLISHED_DIORITE_STAIRS,
            Blocks.MOSSY_COBBLESTONE_STAIRS,
            Blocks.END_STONE_BRICK_STAIRS,
            Blocks.STONE_STAIRS,
            Blocks.SMOOTH_SANDSTONE_STAIRS,
            Blocks.SMOOTH_QUARTZ_STAIRS,
            Blocks.GRANITE_STAIRS,
            Blocks.ANDESITE_STAIRS,
            Blocks.RED_NETHER_BRICK_STAIRS,
            Blocks.POLISHED_ANDESITE_STAIRS,
            Blocks.DIORITE_STAIRS,
            Blocks.BLACKSTONE_STAIRS,
            Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS,
            Blocks.POLISHED_BLACKSTONE_STAIRS
         );
      this.method14014(BlockTags.field32763)
         .method31559(BlockTags.field32742)
         .method31560(
            Blocks.STONE_SLAB,
            Blocks.SMOOTH_STONE_SLAB,
            Blocks.STONE_BRICK_SLAB,
            Blocks.SANDSTONE_SLAB,
            Blocks.PURPUR_SLAB,
            Blocks.QUARTZ_SLAB,
            Blocks.RED_SANDSTONE_SLAB,
            Blocks.BRICK_SLAB,
            Blocks.COBBLESTONE_SLAB,
            Blocks.NETHER_BRICK_SLAB,
            Blocks.PETRIFIED_OAK_SLAB,
            Blocks.PRISMARINE_SLAB,
            Blocks.PRISMARINE_BRICK_SLAB,
            Blocks.DARK_PRISMARINE_SLAB,
            Blocks.POLISHED_GRANITE_SLAB,
            Blocks.SMOOTH_RED_SANDSTONE_SLAB,
            Blocks.MOSSY_STONE_BRICK_SLAB,
            Blocks.POLISHED_DIORITE_SLAB,
            Blocks.MOSSY_COBBLESTONE_SLAB,
            Blocks.END_STONE_BRICK_SLAB,
            Blocks.SMOOTH_SANDSTONE_SLAB,
            Blocks.SMOOTH_QUARTZ_SLAB,
            Blocks.GRANITE_SLAB,
            Blocks.ANDESITE_SLAB,
            Blocks.RED_NETHER_BRICK_SLAB,
            Blocks.POLISHED_ANDESITE_SLAB,
            Blocks.DIORITE_SLAB,
            Blocks.CUT_SANDSTONE_SLAB,
            Blocks.CUT_RED_SANDSTONE_SLAB,
            Blocks.BLACKSTONE_SLAB,
            Blocks.POLISHED_BLACKSTONE_BRICK_SLAB,
            Blocks.POLISHED_BLACKSTONE_SLAB
         );
      this.method14014(BlockTags.field32764)
         .method31560(
            Blocks.COBBLESTONE_WALL,
            Blocks.MOSSY_COBBLESTONE_WALL,
            Blocks.BRICK_WALL,
            Blocks.PRISMARINE_WALL,
            Blocks.RED_SANDSTONE_WALL,
            Blocks.MOSSY_STONE_BRICK_WALL,
            Blocks.GRANITE_WALL,
            Blocks.STONE_BRICK_WALL,
            Blocks.NETHER_BRICK_WALL,
            Blocks.ANDESITE_WALL,
            Blocks.RED_NETHER_BRICK_WALL,
            Blocks.SANDSTONE_WALL,
            Blocks.END_STONE_BRICK_WALL,
            Blocks.DIORITE_WALL,
            Blocks.BLACKSTONE_WALL,
            Blocks.POLISHED_BLACKSTONE_BRICK_WALL,
            Blocks.POLISHED_BLACKSTONE_WALL
         );
      this.method14014(BlockTags.field32785)
         .method31560(Blocks.TUBE_CORAL, Blocks.BRAIN_CORAL, Blocks.BUBBLE_CORAL, Blocks.FIRE_CORAL, Blocks.HORN_CORAL);
      this.method14014(BlockTags.field32786)
         .method31559(BlockTags.field32785)
         .method31560(Blocks.TUBE_CORAL_FAN, Blocks.BRAIN_CORAL_FAN, Blocks.BUBBLE_CORAL_FAN, Blocks.FIRE_CORAL_FAN, Blocks.HORN_CORAL_FAN);
      this.method14014(BlockTags.field32784)
         .method31560(Blocks.TUBE_CORAL_WALL_FAN, Blocks.BRAIN_CORAL_WALL_FAN, Blocks.BUBBLE_CORAL_WALL_FAN, Blocks.FIRE_CORAL_WALL_FAN, Blocks.HORN_CORAL_WALL_FAN);
      this.method14014(BlockTags.field32761).method31560(Blocks.SAND, Blocks.RED_SAND);
      this.method14014(BlockTags.field32766).method31560(Blocks.RAIL, Blocks.POWERED_RAIL, Blocks.DETECTOR_RAIL, Blocks.ACTIVATOR_RAIL);
      this.method14014(BlockTags.field32783)
         .method31560(Blocks.TUBE_CORAL_BLOCK, Blocks.BRAIN_CORAL_BLOCK, Blocks.BUBBLE_CORAL_BLOCK, Blocks.FIRE_CORAL_BLOCK, Blocks.HORN_CORAL_BLOCK);
      this.method14014(BlockTags.field32779).method31560(Blocks.ICE, Blocks.PACKED_ICE, Blocks.BLUE_ICE, Blocks.FROSTED_ICE);
      this.method14014(BlockTags.VALID_SPAWN).method31560(Blocks.GRASS_BLOCK, Blocks.PODZOL);
      this.method14014(BlockTags.LEAVES)
         .method31560(Blocks.JUNGLE_LEAVES, Blocks.OAK_LEAVES, Blocks.SPRUCE_LEAVES, Blocks.DARK_OAK_LEAVES, Blocks.ACACIA_LEAVES, Blocks.BIRCH_LEAVES);
      this.method14014(BlockTags.field32781)
         .method31560(
            Blocks.GLASS,
            Blocks.WHITE_STAINED_GLASS,
            Blocks.ORANGE_STAINED_GLASS,
            Blocks.MAGENTA_STAINED_GLASS,
            Blocks.LIGHT_BLUE_STAINED_GLASS,
            Blocks.YELLOW_STAINED_GLASS,
            Blocks.LIME_STAINED_GLASS,
            Blocks.PINK_STAINED_GLASS,
            Blocks.GRAY_STAINED_GLASS,
            Blocks.LIGHT_GRAY_STAINED_GLASS,
            Blocks.CYAN_STAINED_GLASS,
            Blocks.PURPLE_STAINED_GLASS,
            Blocks.BLUE_STAINED_GLASS,
            Blocks.BROWN_STAINED_GLASS,
            Blocks.GREEN_STAINED_GLASS,
            Blocks.RED_STAINED_GLASS,
            Blocks.BLACK_STAINED_GLASS
         );
      this.method14014(BlockTags.field32747)
         .method31560(
            Blocks.ACACIA_TRAPDOOR,
            Blocks.BIRCH_TRAPDOOR,
            Blocks.DARK_OAK_TRAPDOOR,
            Blocks.JUNGLE_TRAPDOOR,
            Blocks.OAK_TRAPDOOR,
            Blocks.SPRUCE_TRAPDOOR,
            Blocks.CRIMSON_TRAPDOOR,
            Blocks.WARPED_TRAPDOOR
         );
      this.method14014(BlockTags.field32768).method31559(BlockTags.field32747).method31558(Blocks.IRON_TRAPDOOR);
      this.method14014(BlockTags.field32782).method31558(Blocks.SEAGRASS).method31559(BlockTags.field32786).method31559(BlockTags.field32784);
      this.method14014(BlockTags.field32787)
         .method31559(BlockTags.field32761)
         .method31560(
            Blocks.BAMBOO,
            Blocks.BAMBOO_SAPLING,
            Blocks.GRAVEL,
            Blocks.DIRT,
            Blocks.GRASS_BLOCK,
            Blocks.PODZOL,
            Blocks.COARSE_DIRT,
            Blocks.MYCELIUM
         );
      this.method14014(BlockTags.field32788)
         .method31560(
            Blocks.OAK_SIGN,
            Blocks.SPRUCE_SIGN,
            Blocks.BIRCH_SIGN,
            Blocks.ACACIA_SIGN,
            Blocks.JUNGLE_SIGN,
            Blocks.DARK_OAK_SIGN,
            Blocks.CRIMSON_SIGN,
            Blocks.WARPED_SIGN
         );
      this.method14014(BlockTags.field32789)
         .method31560(
            Blocks.OAK_WALL_SIGN,
            Blocks.SPRUCE_WALL_SIGN,
            Blocks.BIRCH_WALL_SIGN,
            Blocks.ACACIA_WALL_SIGN,
            Blocks.JUNGLE_WALL_SIGN,
            Blocks.DARK_OAK_WALL_SIGN,
            Blocks.CRIMSON_WALL_SIGN,
            Blocks.WARPED_WALL_SIGN
         );
      this.method14014(BlockTags.field32790).method31559(BlockTags.field32788).method31559(BlockTags.field32789);
      this.method14014(BlockTags.field32770)
         .method31560(
            Blocks.RED_BED,
            Blocks.BLACK_BED,
            Blocks.BLUE_BED,
            Blocks.BROWN_RED,
            Blocks.CYAN_BED,
            Blocks.GRAY_BED,
            Blocks.GREEN_BED,
            Blocks.LIGHT_BLUE_BED,
            Blocks.LIGHT_GRAY_BED,
            Blocks.LIME_BED,
            Blocks.MAGENTA_BED,
            Blocks.ORANGE_BED,
            Blocks.PINK_BED,
            Blocks.PURPLE_BED,
            Blocks.WHITE_BED,
            Blocks.YELLOW_BED
         );
      this.method14014(BlockTags.field32771).method31559(BlockTags.field32743).method31558(Blocks.NETHER_BRICK_FENCE);
      this.method14014(BlockTags.field32791)
         .method31560(
            Blocks.BARRIER,
            Blocks.BEDROCK,
            Blocks.END_PORTAL,
            Blocks.END_PORTAL_FRAME,
            Blocks.END_GATEWAY,
            Blocks.COMMAND_BLOCK,
            Blocks.REPEATING_COMMAND_BLOCK,
            Blocks.CHAIN_COMMAND_BLOCK,
            Blocks.STRUCTURE_BLOCK,
            Blocks.JIGSAW,
            Blocks.MOVING_PISTON,
            Blocks.OBSIDIAN,
            Blocks.CRYING_OBSIDIAN,
            Blocks.END_STONE,
            Blocks.IRON_BARS,
            Blocks.RESPAWN_ANCHOR
         );
      this.method14014(BlockTags.field32792)
         .method31560(
            Blocks.BARRIER,
            Blocks.BEDROCK,
            Blocks.END_PORTAL,
            Blocks.END_PORTAL_FRAME,
            Blocks.END_GATEWAY,
            Blocks.COMMAND_BLOCK,
            Blocks.REPEATING_COMMAND_BLOCK,
            Blocks.CHAIN_COMMAND_BLOCK,
            Blocks.STRUCTURE_BLOCK,
            Blocks.JIGSAW,
            Blocks.MOVING_PISTON
         );
      this.method14014(BlockTags.field32793).method31560(Blocks.SOUL_SAND, Blocks.SOUL_SOIL);
      this.method14014(BlockTags.field32772).method31560(Blocks.SUNFLOWER, Blocks.LILAC, Blocks.PEONY, Blocks.ROSE_BUSH);
      this.method14014(BlockTags.field32773).method31559(BlockTags.field32769).method31559(BlockTags.field32772);
      this.method14014(BlockTags.field32794).method31560(Blocks.BEE_NEST, Blocks.BEEHIVE);
      this.method14014(BlockTags.field32795)
         .method31560(Blocks.BEETROOTS, Blocks.CARROTS, Blocks.POTATOES, Blocks.WHEAT, Blocks.MELON_STEM, Blocks.PUMPKIN_STEM);
      this.method14014(BlockTags.field32796).method31559(BlockTags.field32795).method31558(Blocks.SWEET_BERRY_BUSH);
      this.method14014(BlockTags.field32805)
         .method31560(
            Blocks.SHULKER_BOX,
            Blocks.BLACK_SHULKER_BOX,
            Blocks.BLUE_SHULKER_BOX,
            Blocks.BROWN_SHULKER_BOX,
            Blocks.CYAN_SHULKER_BOX,
            Blocks.GRAY_SHULKER_BOX,
            Blocks.GREEN_SHULKER_BOX,
            Blocks.LIGHT_BLUE_SHULKER_BOX,
            Blocks.LIGHT_GRAY_SHULKER_BOX,
            Blocks.LIME_SHULKER_BOX,
            Blocks.MAGENTA_SHULKER_BOX,
            Blocks.ORANGE_SHULKER_BOX,
            Blocks.PINK_SHULKER_BOX,
            Blocks.PURPLE_SHULKER_BOX,
            Blocks.RED_SHULKER_BOX,
            Blocks.WHITE_SHULKER_BOX,
            Blocks.YELLOW_SHULKER_BOX
         );
      this.method14014(BlockTags.field32797).method31560(Blocks.NETHER_PORTAL, Blocks.END_PORTAL, Blocks.END_GATEWAY);
      this.method14014(BlockTags.field32798).method31560(Blocks.FIRE, Blocks.SOUL_FIRE);
      this.method14014(BlockTags.field32799).method31560(Blocks.CRIMSON_NYLIUM, Blocks.WARPED_NYLIUM);
      this.method14014(BlockTags.field32800).method31560(Blocks.NETHER_WART_BLOCK, Blocks.WARPED_WART_BLOCK);
      this.method14014(BlockTags.field32801)
         .method31560(Blocks.NETHERITE_BLOCK, Blocks.EMERALD_BLOCK, Blocks.DIAMOND_BLOCK, Blocks.GOLD_BLOCK, Blocks.IRON_BLOCK);
      this.method14014(BlockTags.SOUL_SPEED_BLOCKS).method31560(Blocks.SOUL_SAND, Blocks.SOUL_SOIL);
      this.method14014(BlockTags.field32803)
         .method31560(Blocks.TORCH, Blocks.SOUL_TORCH, Blocks.REDSTONE_TORCH, Blocks.TRIPWIRE)
         .method31559(BlockTags.field32790)
         .method31559(BlockTags.field32760)
         .method31559(BlockTags.field32744);
      this.method14014(BlockTags.field32804)
         .method31560(
            Blocks.LADDER,
            Blocks.VINE,
            Blocks.SCAFFOLDING,
            Blocks.WEEPING_VINES,
            Blocks.WEEPING_VINES_PLANT,
            Blocks.TWISTING_VINES,
            Blocks.TWISTING_VINES_PLANT
         );
      this.method14014(BlockTags.field32774)
         .method31558(Blocks.SOUL_FIRE)
         .method31558(Blocks.SOUL_TORCH)
         .method31558(Blocks.SOUL_LANTERN)
         .method31558(Blocks.SOUL_WALL_TORCH)
         .method31558(Blocks.SOUL_CAMPFIRE);
      this.method14014(BlockTags.field32806)
         .method31558(Blocks.WARPED_FUNGUS)
         .method31558(Blocks.POTTED_WARPED_FUNGUS)
         .method31558(Blocks.NETHER_PORTAL)
         .method31558(Blocks.RESPAWN_ANCHOR);
      this.method14014(BlockTags.field32775).method31560(Blocks.GOLD_ORE, Blocks.NETHER_GOLD_ORE);
      this.method14014(BlockTags.field32807).method31560(Blocks.SOUL_SAND, Blocks.SOUL_SOIL);
      this.method14014(BlockTags.field32776)
         .method31560(
            Blocks.WARPED_STEM,
            Blocks.STRIPPED_WARPED_STEM,
            Blocks.WARPED_HYPHAE,
            Blocks.STRIPPED_WARPED_HYPHAE,
            Blocks.CRIMSON_STEM,
            Blocks.STRIPPED_CRIMSON_STEM,
            Blocks.CRIMSON_HYPHAE,
            Blocks.STRIPPED_CRIMSON_HYPHAE,
            Blocks.CRIMSON_PLANKS,
            Blocks.WARPED_PLANKS,
            Blocks.CRIMSON_SLAB,
            Blocks.WARPED_SLAB,
            Blocks.CRIMSON_PRESSURE_PLATE,
            Blocks.WARPED_PRESSURE_PLATE,
            Blocks.CRIMSON_FENCE,
            Blocks.WARPED_FENCE,
            Blocks.CRIMSON_TRAPDOOR,
            Blocks.WARPED_TRAPDOOR,
            Blocks.CRIMSON_FENCE_GATE,
            Blocks.WARPED_FENCE_GATE,
            Blocks.CRIMSON_STAIRS,
            Blocks.WARPED_STAIRS,
            Blocks.CRIMSON_BUTTON,
            Blocks.WARPED_BUTTON,
            Blocks.CRIMSON_DOOR,
            Blocks.WARPED_DOOR,
            Blocks.CRIMSON_SIGN,
            Blocks.WARPED_SIGN,
            Blocks.CRIMSON_WALL_SIGN,
            Blocks.WARPED_WALL_SIGN
         );
      this.method14014(BlockTags.field32808).method31558(Blocks.LAVA);
      this.method14014(BlockTags.field32809).method31560(Blocks.CAMPFIRE, Blocks.SOUL_CAMPFIRE);
      this.method14014(BlockTags.field32810)
         .method31560(Blocks.GOLD_BLOCK, Blocks.BARREL, Blocks.CHEST, Blocks.ENDER_CHEST, Blocks.GILDED_BLACKSTONE, Blocks.TRAPPED_CHEST)
         .method31559(BlockTags.field32805)
         .method31559(BlockTags.field32775);
      this.method14014(BlockTags.field32811).method31559(BlockTags.field32766);
      this.method14014(BlockTags.field32812)
         .method31560(
            Blocks.ACACIA_FENCE_GATE,
            Blocks.BIRCH_FENCE_GATE,
            Blocks.DARK_OAK_FENCE_GATE,
            Blocks.JUNGLE_FENCE_GATE,
            Blocks.OAK_FENCE_GATE,
            Blocks.SPRUCE_FENCE_GATE,
            Blocks.CRIMSON_FENCE_GATE,
            Blocks.WARPED_FENCE_GATE
         );
      this.method14014(BlockTags.field32813).method31559(BlockTags.field32812);
      this.method14014(BlockTags.field32814)
         .method31558(Blocks.MYCELIUM)
         .method31558(Blocks.PODZOL)
         .method31558(Blocks.CRIMSON_NYLIUM)
         .method31558(Blocks.WARPED_NYLIUM);
      this.method14014(BlockTags.INFINIBURN_OVERWORLD).method31560(Blocks.NETHERRACK, Blocks.MAGMA_BLOCK);
      this.method14014(BlockTags.INFINIBURN_NETHER).method31559(BlockTags.INFINIBURN_OVERWORLD);
      this.method14014(BlockTags.INFINIBURN_END).method31559(BlockTags.INFINIBURN_OVERWORLD).method31558(Blocks.BEDROCK);
      this.method14014(BlockTags.field32818)
         .method31558(Blocks.STONE)
         .method31558(Blocks.GRANITE)
         .method31558(Blocks.DIORITE)
         .method31558(Blocks.ANDESITE);
      this.method14014(BlockTags.field32819).method31558(Blocks.NETHERRACK).method31558(Blocks.BASALT).method31558(Blocks.BLACKSTONE);
   }

   @Override
   public Path method14011(ResourceLocation var1) {
      return this.field21599.method33776().resolve("data/" + var1.getNamespace() + "/tags/blocks/" + var1.getPath() + ".json");
   }

   @Override
   public String method14012() {
      return "Block Tags";
   }
}
