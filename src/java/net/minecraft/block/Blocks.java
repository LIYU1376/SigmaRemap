package net.minecraft.block;

import mapped.*;
import mapped.BannerBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.trees.AcaciaTree;
import net.minecraft.block.trees.OakTree;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluids;
import net.minecraft.potion.Effects;
import net.minecraft.state.properties.BedPart;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.gen.feature.Features;

import java.util.function.ToIntFunction;

public class Blocks {
   public static final Block AIR = register(
      "air", new AirBlock(AbstractBlock.Properties.withMaterial(Material.AIR).method26614().method26626().method26628())
   );
   public static final Block STONE = register(
      "stone", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.STONE).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block GRANITE = register(
      "granite", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.GRANITE).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block POLISHED_GRANITE = register(
      "polished_granite", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.GRANITE).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block DIORITE = register(
      "diorite", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.DIORITE).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block POLISHED_DIORITE = register(
      "polished_diorite", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.DIORITE).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block ANDESITE = register(
      "andesite", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.STONE).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block POLISHED_ANDESITE = register(
      "polished_andesite", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.STONE).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block GRASS_BLOCK = register(
      "grass_block", new GrassBlock(AbstractBlock.Properties.withMaterial(Material.GRASS).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.GRASS))
   );
   public static final Block DIRT = register(
      "dirt", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.DIRT, MaterialColor.GRANITE).hardnessAndResistance(0.5F).sound(SoundType.GRAVEL))
   );
   public static final Block COARSE_DIRT = register(
      "coarse_dirt", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.DIRT, MaterialColor.GRANITE).hardnessAndResistance(0.5F).sound(SoundType.GRAVEL))
   );
   public static final Block PODZOL = register(
      "podzol", new PodzolBlock(AbstractBlock.Properties.withMaterialAndColor(Material.DIRT, MaterialColor.PODZOL).hardnessAndResistance(0.5F).sound(SoundType.GRAVEL))
   );
   public static final Block COBBLESTONE = register(
      "cobblestone", new Block(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block OAK_PLANKS = register(
      "oak_planks", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.OAK_PLANK).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block SPRUCE_PLANKS = register(
      "spruce_planks",
      new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.PODZOL).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block BIRCH_PLANKS = register(
      "birch_planks",
      new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30949).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block JUNGLE_PLANKS = register(
      "jungle_planks",
      new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.GRANITE).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block ACACIA_PLANKS = register(
      "acacia_planks",
      new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30962).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block DARK_OAK_PLANKS = register(
      "dark_oak_planks",
      new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30973).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block OAK_SAPLING = register(
      "oak_sapling",
      new SaplingBlock(new OakTree(), AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().tickRandomly().method26622().sound(SoundType.GRASS))
   );
   public static final Block SPRUCE_SAPLING = register(
      "spruce_sapling",
      new SaplingBlock(new SpruceTree(), AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().tickRandomly().method26622().sound(SoundType.GRASS))
   );
   public static final Block BIRCH_SAPLING = register(
      "birch_sapling",
      new SaplingBlock(new BirchTree(), AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().tickRandomly().method26622().sound(SoundType.GRASS))
   );
   public static final Block JUNGLE_SAPLING = register(
      "jungle_sapling",
      new SaplingBlock(new JungleTree(), AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().tickRandomly().method26622().sound(SoundType.GRASS))
   );
   public static final Block ACACIA_SAPLING = register(
      "acacia_sapling",
      new SaplingBlock(new AcaciaTree(), AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().tickRandomly().method26622().sound(SoundType.GRASS))
   );
   public static final Block DARK_OAK_SAPLING = register(
      "dark_oak_sapling",
      new SaplingBlock(new DarkOakTree(), AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().tickRandomly().method26622().sound(SoundType.GRASS))
   );
   public static final Block BEDROCK = register(
      "bedrock", new Block(AbstractBlock.Properties.withMaterial(Material.STONE).method26621(-1.0F, 3600000.0F).method26626().setAllowsSpawn(Blocks::neverAllowSpawn))
   );
   public static final Block WATER = register(
      "water", new FlowingFluidBlock(Fluids.WATER, AbstractBlock.Properties.withMaterial(Material.field38941).method26614().hardnessAndResistance(100.0F).method26626())
   );
   public static final Block LAVA = register(
      "lava",
      new FlowingFluidBlock(
         Fluids.LAVA,
         AbstractBlock.Properties.withMaterial(Material.field38943).method26614().tickRandomly().hardnessAndResistance(100.0F).method26620(var0 -> 15).method26626()
      )
   );
   public static final Block SAND = register(
      "sand", new SandBlock(14406560, AbstractBlock.Properties.withMaterialAndColor(Material.field38953, MaterialColor.field30949).hardnessAndResistance(0.5F).sound(SoundType.SAND))
   );
   public static final Block RED_SAND = register(
      "red_sand",
      new SandBlock(11098145, AbstractBlock.Properties.withMaterialAndColor(Material.field38953, MaterialColor.field30962).hardnessAndResistance(0.5F).sound(SoundType.SAND))
   );
   public static final Block GRAVEL = register(
      "gravel", new Class3215(AbstractBlock.Properties.withMaterialAndColor(Material.field38953, MaterialColor.STONE).hardnessAndResistance(0.6F).sound(SoundType.GRAVEL))
   );
   public static final Block GOLD_ORE = register(
      "gold_ore", new OreBlock(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().method26621(3.0F, 3.0F))
   );
   public static final Block IRON_ORE = register(
      "iron_ore", new OreBlock(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().method26621(3.0F, 3.0F))
   );
   public static final Block COAL_ORE = register(
      "coal_ore", new OreBlock(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().method26621(3.0F, 3.0F))
   );
   public static final Block NETHER_GOLD_ORE = register(
      "nether_gold_ore",
      new OreBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30982).method26635().method26621(3.0F, 3.0F).sound(SoundType.GILDED_BLACKSTONE))
   );
   public static final Block OAK_LOG = register("oak_log", createLogBlock(MaterialColor.OAK_PLANK, MaterialColor.PODZOL));
   public static final Block SPRUCE_LOG = register("spruce_log", createLogBlock(MaterialColor.PODZOL, MaterialColor.field30973));
   public static final Block BIRCH_LOG = register("birch_log", createLogBlock(MaterialColor.field30949, MaterialColor.DIORITE));
   public static final Block JUNGLE_LOG = register("jungle_log", createLogBlock(MaterialColor.GRANITE, MaterialColor.PODZOL));
   public static final Block ACACIA_LOG = register("acacia_log", createLogBlock(MaterialColor.field30962, MaterialColor.STONE));
   public static final Block DARK_OAK_LOG = register("dark_oak_log", createLogBlock(MaterialColor.field30973, MaterialColor.field30973));
   public static final Block STRIPPED_SPRUCE_LOG = register("stripped_spruce_log", createLogBlock(MaterialColor.PODZOL, MaterialColor.PODZOL));
   public static final Block STRIPPED_BIRCH_LOG = register("stripped_birch_log", createLogBlock(MaterialColor.field30949, MaterialColor.field30949));
   public static final Block STRIPPED_JUNGLE_LOG = register("stripped_jungle_log", createLogBlock(MaterialColor.GRANITE, MaterialColor.GRANITE));
   public static final Block STRIPPED_ACACIA_LOG = register("stripped_acacia_log", createLogBlock(MaterialColor.field30962, MaterialColor.field30962));
   public static final Block STRIPPED_DARK_OAK_LOG = register("stripped_dark_oak_log", createLogBlock(MaterialColor.field30973, MaterialColor.field30973));
   public static final Block STRIPPED_OAK_LOG = register("stripped_oak_log", createLogBlock(MaterialColor.OAK_PLANK, MaterialColor.OAK_PLANK));
   public static final Block OAK_WOOD = register(
      "oak_wood", new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.OAK_PLANK).hardnessAndResistance(2.0F).sound(SoundType.WOOD))
   );
   public static final Block SPRUCE_WOOD = register(
      "spruce_wood", new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.PODZOL).hardnessAndResistance(2.0F).sound(SoundType.WOOD))
   );
   public static final Block BIRCH_WOOD = register(
      "birch_wood", new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30949).hardnessAndResistance(2.0F).sound(SoundType.WOOD))
   );
   public static final Block JUNGLE_WOOD = register(
      "jungle_wood", new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.GRANITE).hardnessAndResistance(2.0F).sound(SoundType.WOOD))
   );
   public static final Block ACACIA_WOOD = register(
      "acacia_wood", new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30968).hardnessAndResistance(2.0F).sound(SoundType.WOOD))
   );
   public static final Block DARK_OAK_WOOD = register(
      "dark_oak_wood", new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30973).hardnessAndResistance(2.0F).sound(SoundType.WOOD))
   );
   public static final Block STRIPPED_OAK_WOOD = register(
      "stripped_oak_wood", new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.OAK_PLANK).hardnessAndResistance(2.0F).sound(SoundType.WOOD))
   );
   public static final Block STRIPPED_SPRUCE_WOOD = register(
      "stripped_spruce_wood",
      new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.PODZOL).hardnessAndResistance(2.0F).sound(SoundType.WOOD))
   );
   public static final Block STRIPPED_BIRCH_WOOD = register(
      "stripped_birch_wood",
      new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30949).hardnessAndResistance(2.0F).sound(SoundType.WOOD))
   );
   public static final Block STRIPPED_JUNGLE_WOOD = register(
      "stripped_jungle_wood",
      new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.GRANITE).hardnessAndResistance(2.0F).sound(SoundType.WOOD))
   );
   public static final Block STRIPPED_ACACIA_WOOD = register(
      "stripped_acacia_wood",
      new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30962).hardnessAndResistance(2.0F).sound(SoundType.WOOD))
   );
   public static final Block STRIPPED_DARK_OAK_WOOD = register(
      "stripped_dark_oak_wood",
      new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30973).hardnessAndResistance(2.0F).sound(SoundType.WOOD))
   );
   public static final Block OAK_LEAVES = register("oak_leaves", createLeavesBlock());
   public static final Block SPRUCE_LEAVES = register("spruce_leaves", createLeavesBlock());
   public static final Block BIRCH_LEAVES = register("birch_leaves", createLeavesBlock());
   public static final Block JUNGLE_LEAVES = register("jungle_leaves", createLeavesBlock());
   public static final Block ACACIA_LEAVES = register("acacia_leaves", createLeavesBlock());
   public static final Block DARK_OAK_LEAVES = register("dark_oak_leaves", createLeavesBlock());
   public static final Block SPONGE = register(
      "sponge", new SpongeBlock(AbstractBlock.Properties.withMaterial(Material.field38954).hardnessAndResistance(0.6F).sound(SoundType.GRASS))
   );
   public static final Block WET_SPONGE = register(
      "wet_sponge", new WetSpongeBlock(AbstractBlock.Properties.withMaterial(Material.field38954).hardnessAndResistance(0.6F).sound(SoundType.GRASS))
   );
   public static final Block GLASS_BLOCK = register(
      "glass",
      new GlassBlock(
         AbstractBlock.Properties.withMaterial(Material.field38963)
            .hardnessAndResistance(0.3F)
            .sound(SoundType.GLASS)
            .notSolid()
            .setAllowsSpawn(Blocks::neverAllowSpawn)
            .setOpaque(Blocks::isntSolid)
            .setSuffocates(Blocks::isntSolid)
            .setBlocksVision(Blocks::isntSolid)
      )
   );
   public static final Block LAPIS_ORE = register(
      "lapis_ore", new OreBlock(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().method26621(3.0F, 3.0F))
   );
   public static final Block LAPIS_BLOCK = register(
      "lapis_block", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.field30979).method26635().method26621(3.0F, 3.0F))
   );
   public static final Block DISPENSER = register(
      "dispenser", new DispenserBlock(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().hardnessAndResistance(3.5F))
   );
   public static final Block SANDSTONE = register(
      "sandstone", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30949).method26635().hardnessAndResistance(0.8F))
   );
   public static final Block CHISELED_SANDSTONE = register(
      "chiseled_sandstone", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30949).method26635().hardnessAndResistance(0.8F))
   );
   public static final Block CUT_SANDSTONE = register(
      "cut_sandstone", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30949).method26635().hardnessAndResistance(0.8F))
   );
   public static final Block NOTE_BLOCK = register(
      "note_block", new Class3426(AbstractBlock.Properties.withMaterial(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(0.8F))
   );
   public static final Block WHITE_BED = register("white_bed", createBedFromColor(DyeColor.field386));
   public static final Block ORANGE_BED = register("orange_bed", createBedFromColor(DyeColor.field387));
   public static final Block MAGENTA_BED = register("magenta_bed", createBedFromColor(DyeColor.field388));
   public static final Block LIGHT_BLUE_BED = register("light_blue_bed", createBedFromColor(DyeColor.field389));
   public static final Block YELLOW_BED = register("yellow_bed", createBedFromColor(DyeColor.field390));
   public static final Block LIME_BED = register("lime_bed", createBedFromColor(DyeColor.field391));
   public static final Block PINK_BED = register("pink_bed", createBedFromColor(DyeColor.field392));
   public static final Block GRAY_BED = register("gray_bed", createBedFromColor(DyeColor.field393));
   public static final Block LIGHT_GRAY_BED = register("light_gray_bed", createBedFromColor(DyeColor.field394));
   public static final Block CYAN_BED = register("cyan_bed", createBedFromColor(DyeColor.field395));
   public static final Block PURPLE_BED = register("purple_bed", createBedFromColor(DyeColor.field396));
   public static final Block BLUE_BED = register("blue_bed", createBedFromColor(DyeColor.field397));
   public static final Block BROWN_RED = register("brown_bed", createBedFromColor(DyeColor.field398));
   public static final Block GREEN_BED = register("green_bed", createBedFromColor(DyeColor.field399));
   public static final Block RED_BED = register("red_bed", createBedFromColor(DyeColor.field400));
   public static final Block BLACK_BED = register("black_bed", createBedFromColor(DyeColor.field401));
   public static final Block POWERED_RAIL = register(
      "powered_rail", new Class3432(AbstractBlock.Properties.withMaterial(Material.field38946).method26614().hardnessAndResistance(0.7F).sound(SoundType.METAL))
   );
   public static final Block DETECTOR_RAIL = register(
      "detector_rail", new Class3431(AbstractBlock.Properties.withMaterial(Material.field38946).method26614().hardnessAndResistance(0.7F).sound(SoundType.METAL))
   );
   public static final Block STICKY_PISTON = register("sticky_piston", createPiston(true));
   public static final Block COBWEB = register(
      "cobweb", new Class3212(AbstractBlock.Properties.withMaterial(Material.field38947).method26614().method26635().hardnessAndResistance(4.0F))
   );
   public static final Block GRASS = register(
      "grass", new Class3487(AbstractBlock.Properties.withMaterial(Material.TALL_PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block FERN = register(
      "fern", new Class3487(AbstractBlock.Properties.withMaterial(Material.TALL_PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block DEAD_BUSH = register(
      "dead_bush",
      new Class3492(AbstractBlock.Properties.withMaterialAndColor(Material.TALL_PLANTS, MaterialColor.OAK_PLANK).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block SEAGRASS = register(
      "seagrass", new Class3450(AbstractBlock.Properties.withMaterial(Material.field38940).method26614().method26622().sound(SoundType.WET_GRASS))
   );
   public static final Block TALL_SEAGRASS = register(
      "tall_seagrass", new Class3455(AbstractBlock.Properties.withMaterial(Material.field38940).method26614().method26622().sound(SoundType.WET_GRASS))
   );
   public static final Block PISTON = register("piston", createPiston(false));
   public static final Block PISTON_HEAD = register(
      "piston_head", new Class3436(AbstractBlock.Properties.withMaterial(Material.PISTON).hardnessAndResistance(1.5F).method26626())
   );
   public static final Block WHITE_WOOL = register(
      "white_wool", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOL, MaterialColor.SNOW).hardnessAndResistance(0.8F).sound(SoundType.WOOL))
   );
   public static final Block ORANGE_WOOL = register(
      "orange_wool", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOL, MaterialColor.field30962).hardnessAndResistance(0.8F).sound(SoundType.WOOL))
   );
   public static final Block MAGENTA_WOOL = register(
      "magenta_wool", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOL, MaterialColor.field30963).hardnessAndResistance(0.8F).sound(SoundType.WOOL))
   );
   public static final Block LIGHT_BLUE_WOOL = register(
      "light_blue_wool", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOL, MaterialColor.field30964).hardnessAndResistance(0.8F).sound(SoundType.WOOL))
   );
   public static final Block YELLOW_WOOL = register(
      "yellow_wool", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOL, MaterialColor.field30965).hardnessAndResistance(0.8F).sound(SoundType.WOOL))
   );
   public static final Block LIME_WOOL = register(
      "lime_wool", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOL, MaterialColor.field30966).hardnessAndResistance(0.8F).sound(SoundType.WOOL))
   );
   public static final Block PINK_WOOL = register(
      "pink_wool", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOL, MaterialColor.field30967).hardnessAndResistance(0.8F).sound(SoundType.WOOL))
   );
   public static final Block GRAY_WOOL = register(
      "gray_wool", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOL, MaterialColor.field30968).hardnessAndResistance(0.8F).sound(SoundType.WOOL))
   );
   public static final Block LIGHT_GRAY_WOOL = register(
      "light_gray_wool", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOL, MaterialColor.field30969).hardnessAndResistance(0.8F).sound(SoundType.WOOL))
   );
   public static final Block CYAN_WOOL = register(
      "cyan_wool", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOL, MaterialColor.field30970).hardnessAndResistance(0.8F).sound(SoundType.WOOL))
   );
   public static final Block PURPLE_WOOL = register(
      "purple_wool", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOL, MaterialColor.field30971).hardnessAndResistance(0.8F).sound(SoundType.WOOL))
   );
   public static final Block BLUE_WOOL = register(
      "blue_wool", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOL, MaterialColor.field30972).hardnessAndResistance(0.8F).sound(SoundType.WOOL))
   );
   public static final Block BROWN_WOOL = register(
      "brown_wool", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOL, MaterialColor.field30973).hardnessAndResistance(0.8F).sound(SoundType.WOOL))
   );
   public static final Block GREEN_WOOL = register(
      "green_wool", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOL, MaterialColor.field30974).hardnessAndResistance(0.8F).sound(SoundType.WOOL))
   );
   public static final Block RED_WOOL = register(
      "red_wool", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOL, MaterialColor.field30975).hardnessAndResistance(0.8F).sound(SoundType.WOOL))
   );
   public static final Block BLACK_WOOL = register(
      "black_wool", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.WOOL, MaterialColor.field30976).hardnessAndResistance(0.8F).sound(SoundType.WOOL))
   );
   public static final Block MOVING_PISTON = register(
      "moving_piston",
      new Class3356(
         AbstractBlock.Properties.withMaterial(Material.PISTON)
            .hardnessAndResistance(-1.0F)
            .variableOpacity()
            .method26626()
            .notSolid()
            .setOpaque(Blocks::isntSolid)
            .setSuffocates(Blocks::isntSolid)
            .setBlocksVision(Blocks::isntSolid)
      )
   );
   public static final Block DANDELION = register(
      "dandelion",
      new Class3490(Effects.SATURATION, 7, AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block POPPY = register(
      "poppy",
      new Class3490(Effects.NIGHT_VISION, 5, AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block BLUE_ORCHID = register(
      "blue_orchid",
      new Class3490(Effects.SATURATION, 7, AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block ALLIUM = register(
      "allium",
      new Class3490(Effects.FIRE_RESISTANCE, 4, AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block AZURE_BLUET = register(
      "azure_bluet",
      new Class3490(Effects.BLINDNESS, 8, AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block RED_TULIP = register(
      "red_tulip",
      new Class3490(Effects.WEAKNESS, 9, AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block ORANGE_TULIP = register(
      "orange_tulip",
      new Class3490(Effects.WEAKNESS, 9, AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block WHITE_TULIP = register(
      "white_tulip",
      new Class3490(Effects.WEAKNESS, 9, AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block PINK_TULIP = register(
      "pink_tulip",
      new Class3490(Effects.WEAKNESS, 9, AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block OXEYE_DAISY = register(
      "oxeye_daisy",
      new Class3490(Effects.REGENERATION, 8, AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block CORNFLOWER = register(
      "cornflower",
      new Class3490(Effects.JUMP_BOOST, 6, AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block WITHER_ROSE = register(
      "wither_rose",
      new Class3491(Effects.WITHER, AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block LILY_OF_THE_VALLEY = register(
      "lily_of_the_valley",
      new Class3490(Effects.POISON, 12, AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block BROWN_MUSHROOM = register(
      "brown_mushroom",
      new Class3479(
         AbstractBlock.Properties.withMaterialAndColor(Material.PLANTS, MaterialColor.field30973)
            .method26614()
            .tickRandomly()
            .method26622()
            .sound(SoundType.GRASS)
            .method26620(var0 -> 1)
            .method26633(Blocks::needsPostProcessing)
      )
   );
   public static final Block RED_MUSHROOM = register(
      "red_mushroom",
      new Class3479(
         AbstractBlock.Properties.withMaterialAndColor(Material.PLANTS, MaterialColor.field30975)
            .method26614()
            .tickRandomly()
            .method26622()
            .sound(SoundType.GRASS)
            .method26633(Blocks::needsPostProcessing)
      )
   );
   public static final Block GOLD_BLOCK = register(
      "gold_block",
      new Block(AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.field30977).method26635().method26621(3.0F, 6.0F).sound(SoundType.METAL))
   );
   public static final Block IRON_BLOCK = register(
      "iron_block",
      new Block(AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.IRON).method26635().method26621(5.0F, 6.0F).sound(SoundType.METAL))
   );
   public static final Block BRICKS = register(
      "bricks", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30975).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block TNT = register(
      "tnt", new Class3458(AbstractBlock.Properties.withMaterial(Material.field38961).method26622().sound(SoundType.GRASS))
   );
   public static final Block BOOKSHELF = register(
      "bookshelf", new Block(AbstractBlock.Properties.withMaterial(Material.WOOD).hardnessAndResistance(1.5F).sound(SoundType.WOOD))
   );
   public static final Block MOSSY_COBBLESTONE = register(
      "mossy_cobblestone", new Block(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block OBSIDIAN = register(
      "obsidian", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30976).method26635().method26621(50.0F, 1200.0F))
   );
   public static final Block TORCH = register(
      "torch",
      new Class3381(
         AbstractBlock.Properties.withMaterial(Material.field38946).method26614().method26622().method26620(var0 -> 14).sound(SoundType.WOOD),
         ParticleTypes.field34074
      )
   );
   public static final Block WALL_TORCH = register(
      "wall_torch",
      new Class3382(
         AbstractBlock.Properties.withMaterial(Material.field38946)
            .method26614()
            .method26622()
            .method26620(var0 -> 14)
            .sound(SoundType.WOOD)
            .method26627(TORCH),
         ParticleTypes.field34074
      )
   );
   public static final Block FIRE = register(
      "fire",
      new Class3399(
         AbstractBlock.Properties.withMaterialAndColor(Material.field38945, MaterialColor.field30951)
            .method26614()
            .method26622()
            .method26620(var0 -> 15)
            .sound(SoundType.WOOL)
      )
   );
   public static final Block SOUL_FIRE = register(
      "soul_fire",
      new Class3398(
         AbstractBlock.Properties.withMaterialAndColor(Material.field38945, MaterialColor.field30964)
            .method26614()
            .method26622()
            .method26620(var0 -> 10)
            .sound(SoundType.WOOL)
      )
   );
   public static final Block SPAWNER = register(
      "spawner", new Class3370(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().hardnessAndResistance(5.0F).sound(SoundType.METAL).notSolid())
   );
   public static final Block OAK_STAIRS = register("oak_stairs", new StairsBlock(OAK_PLANKS.getDefaultState(), AbstractBlock.Properties.method26613(OAK_PLANKS)));
   public static final Block CHEST = register(
      "chest", new ChestBlock(AbstractBlock.Properties.withMaterial(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD), () -> TileEntityType.CHEST)
   );
   public static final Block REDSTONE_WIRE = register(
      "redstone_wire", new Class3222(AbstractBlock.Properties.withMaterial(Material.field38946).method26614().method26622())
   );
   public static final Block DIAMOND_ORE = register(
      "diamond_ore", new OreBlock(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().method26621(3.0F, 3.0F))
   );
   public static final Block DIAMOND_BLOCK = register(
      "diamond_block",
      new Block(AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.field30978).method26635().method26621(5.0F, 6.0F).sound(SoundType.METAL))
   );
   public static final Block CRAFTING_TABLE = register(
      "crafting_table", new CraftingTableBlock(AbstractBlock.Properties.withMaterial(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD))
   );
   public static final Block WHEAT = register(
      "wheat", new WheatBlock(AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().tickRandomly().method26622().sound(SoundType.CROP))
   );
   public static final Block FARMLAND = register(
      "farmland",
      new FarmlandBlock(
         AbstractBlock.Properties.withMaterial(Material.DIRT)
            .tickRandomly()
            .hardnessAndResistance(0.6F)
            .sound(SoundType.GRAVEL)
            .setBlocksVision(Blocks::needsPostProcessing)
            .setSuffocates(Blocks::needsPostProcessing)
      )
   );
   public static final Block FURNACE = register(
      "furnace", new FurnaceBlock(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().hardnessAndResistance(3.5F).method26620(method30011(13)))
   );
   public static final Block OAK_SIGN = register(
      "oak_sign",
      new SignBlock(AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD), Class9673.field45166)
   );
   public static final Block SPRUCE_SIGN = register(
      "spruce_sign",
      new SignBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, SPRUCE_LOG.getColor()).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD),
         Class9673.field45167
      )
   );
   public static final Block BIRCH_SIGN = register(
      "birch_sign",
      new SignBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30949).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD),
         Class9673.field45168
      )
   );
   public static final Block ACACIA_SIGN = register(
      "acacia_sign",
      new SignBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30962).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD),
         Class9673.field45169
      )
   );
   public static final Block JUNGLE_SIGN = register(
      "jungle_sign",
      new SignBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, JUNGLE_LOG.getColor()).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD),
         Class9673.field45170
      )
   );
   public static final Block DARK_OAK_SIGN = register(
      "dark_oak_sign",
      new SignBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, DARK_OAK_LOG.getColor()).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD),
         Class9673.field45171
      )
   );
   public static final Block OAK_DOOR = register(
      "oak_door",
      new DoorBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, OAK_PLANKS.getColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid())
   );
   public static final Block LADDER = register(
      "ladder", new Class3423(AbstractBlock.Properties.withMaterial(Material.field38946).hardnessAndResistance(0.4F).sound(SoundType.LADDER).notSolid())
   );
   public static final Block RAIL = register(
      "rail", new Class3430(AbstractBlock.Properties.withMaterial(Material.field38946).method26614().hardnessAndResistance(0.7F).sound(SoundType.METAL))
   );
   public static final Block COBBLESTONE_STAIRS = register("cobblestone_stairs", new StairsBlock(COBBLESTONE.getDefaultState(), AbstractBlock.Properties.method26613(COBBLESTONE)));
   public static final Block OAK_WALL_SIGN = register(
      "oak_wall_sign",
      new Class3375(
         AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD).method26627(OAK_SIGN),
         Class9673.field45166
      )
   );
   public static final Block SPRUCE_WALL_SIGN = register(
      "spruce_wall_sign",
      new Class3375(
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, SPRUCE_LOG.getColor())
            .method26614()
            .hardnessAndResistance(1.0F)
            .sound(SoundType.WOOD)
            .method26627(SPRUCE_SIGN),
         Class9673.field45167
      )
   );
   public static final Block BIRCH_WALL_SIGN = register(
      "birch_wall_sign",
      new Class3375(
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30949)
            .method26614()
            .hardnessAndResistance(1.0F)
            .sound(SoundType.WOOD)
            .method26627(BIRCH_SIGN),
         Class9673.field45168
      )
   );
   public static final Block ACACIA_WALL_SIGN = register(
      "acacia_wall_sign",
      new Class3375(
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30962)
            .method26614()
            .hardnessAndResistance(1.0F)
            .sound(SoundType.WOOD)
            .method26627(ACACIA_SIGN),
         Class9673.field45169
      )
   );
   public static final Block JUNGLE_WALL_SIGN = register(
      "jungle_wall_sign",
      new Class3375(
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, JUNGLE_LOG.getColor())
            .method26614()
            .hardnessAndResistance(1.0F)
            .sound(SoundType.WOOD)
            .method26627(JUNGLE_SIGN),
         Class9673.field45170
      )
   );
   public static final Block DARK_OAK_WALL_SIGN = register(
      "dark_oak_wall_sign",
      new Class3375(
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, DARK_OAK_LOG.getColor())
            .method26614()
            .hardnessAndResistance(1.0F)
            .sound(SoundType.WOOD)
            .method26627(DARK_OAK_SIGN),
         Class9673.field45171
      )
   );
   public static final Block LEVER = register(
      "lever", new Class3201(AbstractBlock.Properties.withMaterial(Material.field38946).method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD))
   );
   public static final Block STONE_PRESSURE_PLATE = register(
      "stone_pressure_plate", new PressurePlateBlock(Class2275.field14824, AbstractBlock.Properties.withMaterial(Material.STONE).method26635().method26614().hardnessAndResistance(0.5F))
   );
   public static final Block IRON_DOOR = register(
      "iron_door",
      new DoorBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.IRON).method26635().hardnessAndResistance(5.0F).sound(SoundType.METAL).notSolid()
      )
   );
   public static final Block OAK_PRESSURE_PLATE = register(
      "oak_pressure_plate",
      new PressurePlateBlock(
         Class2275.field14823,
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, OAK_PLANKS.getColor()).method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD)
      )
   );
   public static final Block SPRUCE_PRESSURE_PLATE = register(
      "spruce_pressure_plate",
      new PressurePlateBlock(
         Class2275.field14823,
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, SPRUCE_PLANKS.getColor()).method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD)
      )
   );
   public static final Block BIRCH_PRESSURE_PLATE = register(
      "birch_pressure_plate",
      new PressurePlateBlock(
         Class2275.field14823,
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, BIRCH_PLANKS.getColor()).method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD)
      )
   );
   public static final Block JUNGLE_PRESSURE_PLATE = register(
      "jungle_pressure_plate",
      new PressurePlateBlock(
         Class2275.field14823,
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, JUNGLE_PLANKS.getColor()).method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD)
      )
   );
   public static final Block ACACIA_PRESSURE_PLATE = register(
      "acacia_pressure_plate",
      new PressurePlateBlock(
         Class2275.field14823,
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, ACACIA_PLANKS.getColor()).method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD)
      )
   );
   public static final Block DARK_OAK_PRESSURE_PLATE = register(
      "dark_oak_pressure_plate",
      new PressurePlateBlock(
         Class2275.field14823,
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, DARK_OAK_PLANKS.getColor()).method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD)
      )
   );
   public static final Block REDSTONE_ORE = register(
      "redstone_ore",
      new Class3403(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().tickRandomly().method26620(method30011(9)).method26621(3.0F, 3.0F))
   );
   public static final Block REDSTONE_TORCH = register(
      "redstone_torch",
      new Class3383(AbstractBlock.Properties.withMaterial(Material.field38946).method26614().method26622().method26620(method30011(7)).sound(SoundType.WOOD))
   );
   public static final Block REDSTONE_WALL_TORCH = register(
      "redstone_wall_torch",
      new Class3384(
         AbstractBlock.Properties.withMaterial(Material.field38946)
            .method26614()
            .method26622()
            .method26620(method30011(7))
            .sound(SoundType.WOOD)
            .method26627(REDSTONE_TORCH)
      )
   );
   public static final Block STONE_BUTTON = register(
      "stone_button", new StoneButtonBlock(AbstractBlock.Properties.withMaterial(Material.field38946).method26614().hardnessAndResistance(0.5F))
   );
   public static final Block SNOW = register(
      "snow", new Class3410(AbstractBlock.Properties.withMaterial(Material.field38944).tickRandomly().hardnessAndResistance(0.1F).method26635().sound(SoundType.SNOW))
   );
   public static final Block ICE = register(
      "ice",
      new Class3377(
         AbstractBlock.Properties.withMaterial(Material.ICE)
            .method26616(0.98F)
            .tickRandomly()
            .hardnessAndResistance(0.5F)
            .sound(SoundType.GLASS)
            .notSolid()
            .setAllowsSpawn((var0, var1, var2, var3) -> var3 == EntityType.POLAR_BEAR)
      )
   );
   public static final Block SNOW_BLOCK = register(
      "snow_block", new Block(AbstractBlock.Properties.withMaterial(Material.SNOW_BLOCK).method26635().hardnessAndResistance(0.2F).sound(SoundType.SNOW))
   );
   public static final Block CACTUS = register(
      "cactus", new Class3220(AbstractBlock.Properties.withMaterial(Material.field38965).tickRandomly().hardnessAndResistance(0.4F).sound(SoundType.WOOL))
   );
   public static final Block CLAY = register(
      "clay", new Block(AbstractBlock.Properties.withMaterial(Material.field38949).hardnessAndResistance(0.6F).sound(SoundType.GRAVEL))
   );
   public static final Block SUGAR_CANE = register(
      "sugar_cane", new Class3408(AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().tickRandomly().method26622().sound(SoundType.GRASS))
   );
   public static final Block JUKEBOX = register(
      "jukebox", new Class3364(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.GRANITE).method26621(2.0F, 6.0F))
   );
   public static final Block OAK_FENCE = register(
      "oak_fence",
      new FenceBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, OAK_PLANKS.getColor()).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block PUMPKIN = register(
      "pumpkin", new Class3464(AbstractBlock.Properties.withMaterialAndColor(Material.GOURD, MaterialColor.field30962).hardnessAndResistance(1.0F).sound(SoundType.WOOD))
   );
   public static final Block NETHERRACK = register(
      "netherrack",
      new Class3385(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30982).method26635().hardnessAndResistance(0.4F).sound(SoundType.NETHER_BRICKS))
   );
   public static final Block SOUL_SAND = register(
      "soul_sand",
      new Class3409(
         AbstractBlock.Properties.withMaterialAndColor(Material.field38953, MaterialColor.field30973)
            .hardnessAndResistance(0.5F)
            .method26617(0.4F)
            .sound(SoundType.SOUL_SOIL)
            .setAllowsSpawn(Blocks::alwaysAllowSpawn)
            .setOpaque(Blocks::needsPostProcessing)
            .setBlocksVision(Blocks::needsPostProcessing)
            .setSuffocates(Blocks::needsPostProcessing)
      )
   );
   public static final Block SOUL_SOIL = register(
      "soul_soil", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.DIRT, MaterialColor.field30973).hardnessAndResistance(0.5F).sound(SoundType.BASALT))
   );
   public static final Block BASALT = register(
      "basalt",
      new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30976).method26635().method26621(1.25F, 4.2F).sound(SoundType.WART_BLOCK))
   );
   public static final Block POLISHED_BASALT = register(
      "polished_basalt",
      new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30976).method26635().method26621(1.25F, 4.2F).sound(SoundType.WART_BLOCK))
   );
   public static final Block SOUL_TORCH = register(
      "soul_torch",
      new Class3381(
         AbstractBlock.Properties.withMaterial(Material.field38946).method26614().method26622().method26620(var0 -> 10).sound(SoundType.WOOD),
         ParticleTypes.field34075
      )
   );
   public static final Block SOUL_WALL_TORCH = register(
      "soul_wall_torch",
      new Class3382(
         AbstractBlock.Properties.withMaterial(Material.field38946)
            .method26614()
            .method26622()
            .method26620(var0 -> 10)
            .sound(SoundType.WOOD)
            .method26627(SOUL_TORCH),
         ParticleTypes.field34075
      )
   );
   public static final Block GLOWSTONE = register(
      "glowstone",
      new Block(
         AbstractBlock.Properties.withMaterialAndColor(Material.field38963, MaterialColor.field30949).hardnessAndResistance(0.3F).sound(SoundType.GLASS).method26620(var0 -> 15)
      )
   );
   public static final Block NETHER_PORTAL = register(
      "nether_portal",
      new NetherPortalBlock(
         AbstractBlock.Properties.withMaterial(Material.field38934).method26614().tickRandomly().hardnessAndResistance(-1.0F).sound(SoundType.GLASS).method26620(var0 -> 11)
      )
   );
   public static final Block CARVED_PUMPKIN = register(
      "carved_pumpkin",
      new PumpkinBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.GOURD, MaterialColor.field30962)
            .hardnessAndResistance(1.0F)
            .sound(SoundType.WOOD)
            .setAllowsSpawn(Blocks::alwaysAllowSpawn)
      )
   );
   public static final Block JACK_O_LANTERN = register(
      "jack_o_lantern",
      new PumpkinBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.GOURD, MaterialColor.field30962)
            .hardnessAndResistance(1.0F)
            .sound(SoundType.WOOD)
            .method26620(var0 -> 15)
            .setAllowsSpawn(Blocks::alwaysAllowSpawn)
      )
   );
   public static final Block CAKE = register(
      "cake", new CakeBlock(AbstractBlock.Properties.withMaterial(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.WOOL))
   );
   public static final Block REPEATER = register(
      "repeater", new RepeaterBlock(AbstractBlock.Properties.withMaterial(Material.field38946).method26622().sound(SoundType.WOOD))
   );
   public static final Block WHITE_STAINED_GLASS = register("white_stained_glass", createStainedGlassFromColor(DyeColor.field386));
   public static final Block ORANGE_STAINED_GLASS = register("orange_stained_glass", createStainedGlassFromColor(DyeColor.field387));
   public static final Block MAGENTA_STAINED_GLASS = register("magenta_stained_glass", createStainedGlassFromColor(DyeColor.field388));
   public static final Block LIGHT_BLUE_STAINED_GLASS = register("light_blue_stained_glass", createStainedGlassFromColor(DyeColor.field389));
   public static final Block YELLOW_STAINED_GLASS = register("yellow_stained_glass", createStainedGlassFromColor(DyeColor.field390));
   public static final Block LIME_STAINED_GLASS = register("lime_stained_glass", createStainedGlassFromColor(DyeColor.field391));
   public static final Block PINK_STAINED_GLASS = register("pink_stained_glass", createStainedGlassFromColor(DyeColor.field392));
   public static final Block GRAY_STAINED_GLASS = register("gray_stained_glass", createStainedGlassFromColor(DyeColor.field393));
   public static final Block LIGHT_GRAY_STAINED_GLASS = register("light_gray_stained_glass", createStainedGlassFromColor(DyeColor.field394));
   public static final Block CYAN_STAINED_GLASS = register("cyan_stained_glass", createStainedGlassFromColor(DyeColor.field395));
   public static final Block PURPLE_STAINED_GLASS = register("purple_stained_glass", createStainedGlassFromColor(DyeColor.field396));
   public static final Block BLUE_STAINED_GLASS = register("blue_stained_glass", createStainedGlassFromColor(DyeColor.field397));
   public static final Block BROWN_STAINED_GLASS = register("brown_stained_glass", createStainedGlassFromColor(DyeColor.field398));
   public static final Block GREEN_STAINED_GLASS = register("green_stained_glass", createStainedGlassFromColor(DyeColor.field399));
   public static final Block RED_STAINED_GLASS = register("red_stained_glass", createStainedGlassFromColor(DyeColor.field400));
   public static final Block BLACK_STAINED_GLASS = register("black_stained_glass", createStainedGlassFromColor(DyeColor.field401));
   public static final Block OAK_TRAPDOOR = register(
      "oak_trapdoor",
      new TrapDoorBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.OAK_PLANK)
            .hardnessAndResistance(3.0F)
            .sound(SoundType.WOOD)
            .notSolid()
            .setAllowsSpawn(Blocks::neverAllowSpawn)
      )
   );
   public static final Block SPRUCE_TRAPDOOR = register(
      "spruce_trapdoor",
      new TrapDoorBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.PODZOL)
            .hardnessAndResistance(3.0F)
            .sound(SoundType.WOOD)
            .notSolid()
            .setAllowsSpawn(Blocks::neverAllowSpawn)
      )
   );
   public static final Block BIRCH_TRAPDOOR = register(
      "birch_trapdoor",
      new TrapDoorBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30949)
            .hardnessAndResistance(3.0F)
            .sound(SoundType.WOOD)
            .notSolid()
            .setAllowsSpawn(Blocks::neverAllowSpawn)
      )
   );
   public static final Block JUNGLE_TRAPDOOR = register(
      "jungle_trapdoor",
      new TrapDoorBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.GRANITE)
            .hardnessAndResistance(3.0F)
            .sound(SoundType.WOOD)
            .notSolid()
            .setAllowsSpawn(Blocks::neverAllowSpawn)
      )
   );
   public static final Block ACACIA_TRAPDOOR = register(
      "acacia_trapdoor",
      new TrapDoorBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30962)
            .hardnessAndResistance(3.0F)
            .sound(SoundType.WOOD)
            .notSolid()
            .setAllowsSpawn(Blocks::neverAllowSpawn)
      )
   );
   public static final Block DARK_OAK_TRAPDOOR = register(
      "dark_oak_trapdoor",
      new TrapDoorBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30973)
            .hardnessAndResistance(3.0F)
            .sound(SoundType.WOOD)
            .notSolid()
            .setAllowsSpawn(Blocks::neverAllowSpawn)
      )
   );
   public static final Block STONE_BRICKS = register(
      "stone_bricks", new Block(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block MOSSY_STONE_BRICKS = register(
      "mossy_stone_bricks", new Block(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block CRACKED_STONE_BRICKS = register(
      "cracked_stone_bricks", new Block(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block CHISELED_STONE_BRICKS = register(
      "chiseled_stone_bricks", new Block(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block INFESTED_STONE = register(
      "infested_stone", new InfestedBlock(STONE, AbstractBlock.Properties.withMaterial(Material.field38949).method26621(0.0F, 0.75F))
   );
   public static final Block INFESTED_COBBLESTONE = register(
      "infested_cobblestone", new InfestedBlock(COBBLESTONE, AbstractBlock.Properties.withMaterial(Material.field38949).method26621(0.0F, 0.75F))
   );
   public static final Block INFESTED_STONE_BRICKS = register(
      "infested_stone_bricks", new InfestedBlock(STONE_BRICKS, AbstractBlock.Properties.withMaterial(Material.field38949).method26621(0.0F, 0.75F))
   );
   public static final Block INFESTED_MOSSY_STONE_BRICKS = register(
      "infested_mossy_stone_bricks", new InfestedBlock(MOSSY_STONE_BRICKS, AbstractBlock.Properties.withMaterial(Material.field38949).method26621(0.0F, 0.75F))
   );
   public static final Block INFESTED_CRACKED_STONE_BRICKS = register(
      "infested_cracked_stone_bricks", new InfestedBlock(CRACKED_STONE_BRICKS, AbstractBlock.Properties.withMaterial(Material.field38949).method26621(0.0F, 0.75F))
   );
   public static final Block INFESTED_CHISELED_STONE_BRICKS = register(
      "infested_chiseled_stone_bricks", new InfestedBlock(CHISELED_STONE_BRICKS, AbstractBlock.Properties.withMaterial(Material.field38949).method26621(0.0F, 0.75F))
   );
   public static final Block BROWN_MUSHROOM_BLOCK = register(
      "brown_mushroom_block",
      new Class3443(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.GRANITE).hardnessAndResistance(0.2F).sound(SoundType.WOOD))
   );
   public static final Block RED_MUSHROOM_BLOCK = register(
      "red_mushroom_block",
      new Class3443(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30975).hardnessAndResistance(0.2F).sound(SoundType.WOOD))
   );
   public static final Block MUSHROOM_STEM = register(
      "mushroom_stem", new Class3443(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.WOOL).hardnessAndResistance(0.2F).sound(SoundType.WOOD))
   );
   public static final Block IRON_BARS = register(
      "iron_bars",
      new Class3237(
         AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.AIR)
            .method26635()
            .method26621(5.0F, 6.0F)
            .sound(SoundType.METAL)
            .notSolid()
      )
   );
   public static final Block CHAIN = register(
      "chain",
      new Class3387(
         AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.AIR)
            .method26635()
            .method26621(5.0F, 6.0F)
            .sound(SoundType.NETHER_GOLD_ORE)
            .notSolid()
      )
   );
   public static final Block GLASS_PANE = register(
      "glass_pane", new Class3237(AbstractBlock.Properties.withMaterial(Material.field38963).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid())
   );
   public static final Block MELON = register(
      "melon", new Class3463(AbstractBlock.Properties.withMaterialAndColor(Material.GOURD, MaterialColor.field30966).hardnessAndResistance(1.0F).sound(SoundType.WOOD))
   );
   public static final Block ATTACHED_PUMPKIN_STEM = register(
      "attached_pumpkin_stem",
      new Class3493((Class3462) PUMPKIN, AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().method26622().sound(SoundType.WOOD))
   );
   public static final Block ATTACHED_MELON_STEM = register(
      "attached_melon_stem",
      new Class3493((Class3462) MELON, AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().method26622().sound(SoundType.WOOD))
   );
   public static final Block PUMPKIN_STEM = register(
      "pumpkin_stem",
      new Class3486(
         (Class3462) PUMPKIN, AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().tickRandomly().method26622().sound(SoundType.HARD_CROP)
      )
   );
   public static final Block MELON_STEM = register(
      "melon_stem",
      new Class3486(
         (Class3462) MELON, AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().tickRandomly().method26622().sound(SoundType.HARD_CROP)
      )
   );
   public static final Block VINE = register(
      "vine", new Class3402(AbstractBlock.Properties.withMaterial(Material.TALL_PLANTS).method26614().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.VINE))
   );
   public static final Block OAK_FENCE_GATE = register(
      "oak_fence_gate",
      new FenceGateBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, OAK_PLANKS.getColor()).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block BRICK_STAIRS = register("brick_stairs", new StairsBlock(BRICKS.getDefaultState(), AbstractBlock.Properties.method26613(BRICKS)));
   public static final Block STONE_BRICK_STAIRS = register("stone_brick_stairs", new StairsBlock(STONE_BRICKS.getDefaultState(), AbstractBlock.Properties.method26613(STONE_BRICKS)));
   public static final Block MYCELIUM = register(
      "mycelium",
      new Class3474(AbstractBlock.Properties.withMaterialAndColor(Material.GRASS, MaterialColor.field30971).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.GRASS))
   );
   public static final Block LILY_PAD = register(
      "lily_pad", new LilyPadBlock(AbstractBlock.Properties.withMaterial(Material.PLANTS).method26622().sound(SoundType.LILY_PAD).notSolid())
   );
   public static final Block NETHER_BRICKS = register(
      "nether_bricks",
      new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30982).method26635().method26621(2.0F, 6.0F).sound(SoundType.NETHER_SPROUTS))
   );
   public static final Block NETHER_BRICK_FENCE = register(
      "nether_brick_fence",
      new FenceBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30982).method26635().method26621(2.0F, 6.0F).sound(SoundType.NETHER_SPROUTS))
   );
   public static final Block NETHER_BRICK_STAIRS = register("nether_brick_stairs", new StairsBlock(NETHER_BRICKS.getDefaultState(), AbstractBlock.Properties.method26613(NETHER_BRICKS)));
   public static final Block NETHER_WART = register(
      "nether_wart",
      new Class3489(AbstractBlock.Properties.withMaterialAndColor(Material.PLANTS, MaterialColor.field30975).method26614().tickRandomly().sound(SoundType.NETHER_WART))
   );
   public static final Block ENCHANTING_TABLE = register(
      "enchanting_table", new Class3363(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30975).method26635().method26621(5.0F, 1200.0F))
   );
   public static final Block BREWING_STAND = register(
      "brewing_stand", new Class3376(AbstractBlock.Properties.withMaterial(Material.field38967).method26635().hardnessAndResistance(0.5F).method26620(var0 -> 1).notSolid())
   );
   public static final Block CAULDRON = register(
      "cauldron", new Class3413(AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.STONE).method26635().hardnessAndResistance(2.0F).notSolid())
   );
   public static final Block END_PORTAL = register(
      "end_portal",
      new Class3365(
         AbstractBlock.Properties.withMaterialAndColor(Material.field38934, MaterialColor.field30976).method26614().method26620(var0 -> 15).method26621(-1.0F, 3600000.0F).method26626()
      )
   );
   public static final Block END_PORTAL_FRAME = register(
      "end_portal_frame",
      new Class3400(
         AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30974)
            .sound(SoundType.GLASS)
            .method26620(var0 -> 1)
            .method26621(-1.0F, 3600000.0F)
            .method26626()
      )
   );
   public static final Block END_STONE = register(
      "end_stone", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30949).method26635().method26621(3.0F, 9.0F))
   );
   public static final Block DRAGON_EGG = register(
      "dragon_egg",
      new Class3214(AbstractBlock.Properties.withMaterialAndColor(Material.DRAGON_EGG, MaterialColor.field30976).method26621(3.0F, 9.0F).method26620(var0 -> 1).notSolid())
   );
   public static final Block REDSTONE_LAMP = register(
      "redstone_lamp",
      new Class3223(
         AbstractBlock.Properties.withMaterial(Material.field38948)
            .method26620(method30011(15))
            .hardnessAndResistance(0.3F)
            .sound(SoundType.GLASS)
            .setAllowsSpawn(Blocks::alwaysAllowSpawn)
      )
   );
   public static final Block COCOA = register(
      "cocoa", new Class3197(AbstractBlock.Properties.withMaterial(Material.PLANTS).tickRandomly().method26621(0.2F, 3.0F).sound(SoundType.WOOD).notSolid())
   );
   public static final Block SANDSTONE_STAIRS = register("sandstone_stairs", new StairsBlock(SANDSTONE.getDefaultState(), AbstractBlock.Properties.method26613(SANDSTONE)));
   public static final Block EMERALD_ORE = register(
      "emerald_ore", new OreBlock(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().method26621(3.0F, 3.0F))
   );
   public static final Block ENDER_CHEST = register(
      "ender_chest", new Class3347(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().method26621(22.5F, 600.0F).method26620(var0 -> 7))
   );
   public static final Block TRIPWIRE_HOOK = register("tripwire_hook", new Class3459(AbstractBlock.Properties.withMaterial(Material.field38946).method26614()));
   public static final Block TRIPWIRE = register(
      "tripwire", new Class3425((Class3459) TRIPWIRE_HOOK, AbstractBlock.Properties.withMaterial(Material.field38946).method26614())
   );
   public static final Block EMERALD_BLOCK = register(
      "emerald_block",
      new Block(AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.field30980).method26635().method26621(5.0F, 6.0F).sound(SoundType.METAL))
   );
   public static final Block SPRUCE_STAIRS = register("spruce_stairs", new StairsBlock(SPRUCE_PLANKS.getDefaultState(), AbstractBlock.Properties.method26613(SPRUCE_PLANKS)));
   public static final Block BIRCH_STAIRS = register("birch_stairs", new StairsBlock(BIRCH_PLANKS.getDefaultState(), AbstractBlock.Properties.method26613(BIRCH_PLANKS)));
   public static final Block JUNGLE_STAIRS = register("jungle_stairs", new StairsBlock(JUNGLE_PLANKS.getDefaultState(), AbstractBlock.Properties.method26613(JUNGLE_PLANKS)));
   public static final Block COMMAND_BLOCK = register(
      "command_block",
      new CommandBlockBlock(AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.field30973).method26635().method26621(-1.0F, 3600000.0F).method26626())
   );
   public static final Block BEACON = register(
      "beacon",
      new Class3240(
         AbstractBlock.Properties.withMaterialAndColor(Material.field38963, MaterialColor.field30978)
            .hardnessAndResistance(3.0F)
            .method26620(var0 -> 15)
            .notSolid()
            .setOpaque(Blocks::isntSolid)
      )
   );
   public static final Block COBBLESTONE_WALL = register("cobblestone_wall", new WallBlock(AbstractBlock.Properties.method26613(COBBLESTONE)));
   public static final Block MOSSY_COBBLESTONE_WALL = register("mossy_cobblestone_wall", new WallBlock(AbstractBlock.Properties.method26613(COBBLESTONE)));
   public static final Block FLOWER_POT = register(
      "flower_pot", new PottedWarpedRoots(AIR, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_OAK_SAPLING = register(
      "potted_oak_sapling", new PottedWarpedRoots(OAK_SAPLING, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_SPRUCE_SAPLING = register(
      "potted_spruce_sapling", new PottedWarpedRoots(SPRUCE_SAPLING, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_BIRCH_SAPLING = register(
      "potted_birch_sapling", new PottedWarpedRoots(BIRCH_SAPLING, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_JUNGLE_SAPLING = register(
      "potted_jungle_sapling", new PottedWarpedRoots(JUNGLE_SAPLING, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_ACACIA_SAPLING = register(
      "potted_acacia_sapling", new PottedWarpedRoots(ACACIA_SAPLING, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_DARK_OAK_SAPLING = register(
      "potted_dark_oak_sapling", new PottedWarpedRoots(DARK_OAK_SAPLING, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_FERN = register(
      "potted_fern", new PottedWarpedRoots(FERN, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_DANDELION = register(
      "potted_dandelion", new PottedWarpedRoots(DANDELION, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_POPPY = register(
      "potted_poppy", new PottedWarpedRoots(POPPY, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_BLUE_ORCHID = register(
      "potted_blue_orchid", new PottedWarpedRoots(BLUE_ORCHID, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_ALLIUM = register(
      "potted_allium", new PottedWarpedRoots(ALLIUM, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_AZURE_BLUET = register(
      "potted_azure_bluet", new PottedWarpedRoots(AZURE_BLUET, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_RED_TULIP = register(
      "potted_red_tulip", new PottedWarpedRoots(RED_TULIP, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_ORANGE_TULIP = register(
      "potted_orange_tulip", new PottedWarpedRoots(ORANGE_TULIP, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_WHITE_TULIP = register(
      "potted_white_tulip", new PottedWarpedRoots(WHITE_TULIP, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_PINK_TULIP = register(
      "potted_pink_tulip", new PottedWarpedRoots(PINK_TULIP, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_OXEYE_DAISY = register(
      "potted_oxeye_daisy", new PottedWarpedRoots(OXEYE_DAISY, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_CORNFLOWER = register(
      "potted_cornflower", new PottedWarpedRoots(CORNFLOWER, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_LILY_OF_THE_VALLEY = register(
      "potted_lily_of_the_valley", new PottedWarpedRoots(LILY_OF_THE_VALLEY, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_WITHER_ROSE = register(
      "potted_wither_rose", new PottedWarpedRoots(WITHER_ROSE, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_RED_MUSHROOM = register(
      "potted_red_mushroom", new PottedWarpedRoots(RED_MUSHROOM, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_BROWN_MUSHROOM = register(
      "potted_brown_mushroom", new PottedWarpedRoots(BROWN_MUSHROOM, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_DEAD_BUSH = register(
      "potted_dead_bush", new PottedWarpedRoots(DEAD_BUSH, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_CACTUS = register(
      "potted_cactus", new PottedWarpedRoots(CACTUS, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block CARROTS = register(
      "carrots", new Class3483(AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().tickRandomly().method26622().sound(SoundType.CROP))
   );
   public static final Block POTATOES = register(
      "potatoes", new Class3481(AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().tickRandomly().method26622().sound(SoundType.CROP))
   );
   public static final Block OAK_BUTTON = register(
      "oak_button", new WoodButtonBlock(AbstractBlock.Properties.withMaterial(Material.field38946).method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD))
   );
   public static final Block SPRUCE_BUTTON = register(
      "spruce_button", new WoodButtonBlock(AbstractBlock.Properties.withMaterial(Material.field38946).method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD))
   );
   public static final Block BIRCH_BUTTON = register(
      "birch_button", new WoodButtonBlock(AbstractBlock.Properties.withMaterial(Material.field38946).method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD))
   );
   public static final Block JUNGLE_BUTTON = register(
      "jungle_button", new WoodButtonBlock(AbstractBlock.Properties.withMaterial(Material.field38946).method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD))
   );
   public static final Block ACACIA_BUTTON = register(
      "acacia_button", new WoodButtonBlock(AbstractBlock.Properties.withMaterial(Material.field38946).method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD))
   );
   public static final Block DARK_OAK_BUTTON = register(
      "dark_oak_button", new WoodButtonBlock(AbstractBlock.Properties.withMaterial(Material.field38946).method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD))
   );
   public static final Block SKELETON_SKULL = register(
      "skeleton_skull", new SkullBlock(Class2136.field13989, AbstractBlock.Properties.withMaterial(Material.field38946).hardnessAndResistance(1.0F))
   );
   public static final Block SKELETON_WALL_SKULL = register(
      "skeleton_wall_skull", new Class3252(Class2136.field13989, AbstractBlock.Properties.withMaterial(Material.field38946).hardnessAndResistance(1.0F).method26627(SKELETON_SKULL))
   );
   public static final Block WITHER_SKELETON_SKULL = register("wither_skeleton_skull", new Class3344(AbstractBlock.Properties.withMaterial(Material.field38946).hardnessAndResistance(1.0F)));
   public static final Block WITHER_SKELETON_WALL_SKULL = register(
      "wither_skeleton_wall_skull", new Class3253(AbstractBlock.Properties.withMaterial(Material.field38946).hardnessAndResistance(1.0F).method26627(WITHER_SKELETON_SKULL))
   );
   public static final Block ZOMBIE_HEAD = register(
      "zombie_head", new SkullBlock(Class2136.field13992, AbstractBlock.Properties.withMaterial(Material.field38946).hardnessAndResistance(1.0F))
   );
   public static final Block ZOMBIE_WALL_HEAD = register(
      "zombie_wall_head", new Class3252(Class2136.field13992, AbstractBlock.Properties.withMaterial(Material.field38946).hardnessAndResistance(1.0F).method26627(ZOMBIE_HEAD))
   );
   public static final Block PLAYER_HEAD = register("player_head", new PlayerHeadBlock(AbstractBlock.Properties.withMaterial(Material.field38946).hardnessAndResistance(1.0F)));
   public static final Block PLAYER_WALL_HEAD = register(
      "player_wall_head", new Class3254(AbstractBlock.Properties.withMaterial(Material.field38946).hardnessAndResistance(1.0F).method26627(PLAYER_HEAD))
   );
   public static final Block CREEPER_HEAD = register(
      "creeper_head", new SkullBlock(Class2136.field13993, AbstractBlock.Properties.withMaterial(Material.field38946).hardnessAndResistance(1.0F))
   );
   public static final Block CREEPER_WALL_HEAD = register(
      "creeper_wall_head", new Class3252(Class2136.field13993, AbstractBlock.Properties.withMaterial(Material.field38946).hardnessAndResistance(1.0F).method26627(CREEPER_HEAD))
   );
   public static final Block HEAD = register(
      "dragon_head", new SkullBlock(Class2136.field13994, AbstractBlock.Properties.withMaterial(Material.field38946).hardnessAndResistance(1.0F))
   );
   public static final Block DRAGON_WALL_HEAD = register(
      "dragon_wall_head", new Class3252(Class2136.field13994, AbstractBlock.Properties.withMaterial(Material.field38946).hardnessAndResistance(1.0F).method26627(HEAD))
   );
   public static final Block ANVIL = register(
      "anvil",
      new Class3218(
         AbstractBlock.Properties.withMaterialAndColor(Material.ANVIL, MaterialColor.IRON).method26635().method26621(5.0F, 1200.0F).sound(SoundType.ANVIL)
      )
   );
   public static final Block CHIPPED_ANVIL = register(
      "chipped_anvil",
      new Class3218(
         AbstractBlock.Properties.withMaterialAndColor(Material.ANVIL, MaterialColor.IRON).method26635().method26621(5.0F, 1200.0F).sound(SoundType.ANVIL)
      )
   );
   public static final Block DAMAGED_ANVIL = register(
      "damaged_anvil",
      new Class3218(
         AbstractBlock.Properties.withMaterialAndColor(Material.ANVIL, MaterialColor.IRON).method26635().method26621(5.0F, 1200.0F).sound(SoundType.ANVIL)
      )
   );
   public static final Block TRAPPED_CHEST = register(
      "trapped_chest", new Class3349(AbstractBlock.Properties.withMaterial(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD))
   );
   public static final Block LIGHT_WEIGHTED_PRESSURE_PLATE = register(
      "light_weighted_pressure_plate",
      new Class3470(
         15, AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.field30977).method26635().method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD)
      )
   );
   public static final Block HEAVY_WEIGHTED_PRESSURE_PLATE = register(
      "heavy_weighted_pressure_plate",
      new Class3470(150, AbstractBlock.Properties.withMaterial(Material.field38967).method26635().method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD))
   );
   public static final Block COMPARATOR = register(
      "comparator", new Class3246(AbstractBlock.Properties.withMaterial(Material.field38946).method26622().sound(SoundType.WOOD))
   );
   public static final Block DAYLIGHT_DETECTOR = register(
      "daylight_detector", new Class3372(AbstractBlock.Properties.withMaterial(Material.WOOD).hardnessAndResistance(0.2F).sound(SoundType.WOOD))
   );
   public static final Block REDSTONE_BLOCK = register(
      "redstone_block",
      new Class3396(
         AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.field30951)
            .method26635()
            .method26621(5.0F, 6.0F)
            .sound(SoundType.METAL)
            .setOpaque(Blocks::isntSolid)
      )
   );
   public static final Block NETHER_QUARTZ_ORE = register(
      "nether_quartz_ore",
      new OreBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30982).method26635().method26621(3.0F, 3.0F).sound(SoundType.BONE))
   );
   public static final Block HOPPER = register(
      "hopper",
      new Class3362(
         AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.STONE)
            .method26635()
            .method26621(3.0F, 4.8F)
            .sound(SoundType.METAL)
            .notSolid()
      )
   );
   public static final Block QUARTZ_BLOCK = register(
      "quartz_block", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.DIORITE).method26635().hardnessAndResistance(0.8F))
   );
   public static final Block CHISELED_QUARTZ_BLOCK = register(
      "chiseled_quartz_block", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.DIORITE).method26635().hardnessAndResistance(0.8F))
   );
   public static final Block QUARTZ_PILLAR = register(
      "quartz_pillar", new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.DIORITE).method26635().hardnessAndResistance(0.8F))
   );
   public static final Block QUARTZ_STAIRS = register("quartz_stairs", new StairsBlock(QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Properties.method26613(QUARTZ_BLOCK)));
   public static final Block ACTIVATOR_RAIL = register(
      "activator_rail", new Class3432(AbstractBlock.Properties.withMaterial(Material.field38946).method26614().hardnessAndResistance(0.7F).sound(SoundType.METAL))
   );
   public static final Block DROPPER = register("dropper", new DropperBlock(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().hardnessAndResistance(3.5F)));
   public static final Block WHITE_TERRACOTTA = register(
      "white_terracotta", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30983).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block ORANGE_TERRACOTTA = register(
      "orange_terracotta", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30984).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block MAGENTA_TERRACOTTA = register(
      "magenta_terracotta", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30985).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block LIGHT_BLUE_TERRACOTTA = register(
      "light_blue_terracotta", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30986).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block YELLOW_TERRACOTTA = register(
      "yellow_terracotta", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30987).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block LIME_TERRACOTTA = register(
      "lime_terracotta", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30988).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block PINK_TERRACOTTA = register(
      "pink_terracotta", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30989).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block GRAY_TERRACOTTA = register(
      "gray_terracotta", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30990).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block LIGHT_GRAY_TERRACOTTA = register(
      "light_gray_terracotta", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30991).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block CYAN_TERRACOTTA = register(
      "cyan_terracotta", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30992).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block PURPLE_TERRACOTTA = register(
      "purple_terracotta", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30993).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block BLUE_TERRACOTTA = register(
      "blue_terracotta", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30994).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block BROWN_TERRACOTTA = register(
      "brown_terracotta", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30995).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block GREEN_TERRACOTTA = register(
      "green_terracotta", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30996).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block RED_TERRACOTTA = register(
      "red_terracotta", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30997).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block BLACK_TERRACOTTA = register(
      "black_terracotta", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30998).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block WHITE_STAINED_GLASS_PANE = register(
      "white_stained_glass_pane",
      new Class3236(DyeColor.field386, AbstractBlock.Properties.withMaterial(Material.field38963).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid())
   );
   public static final Block ORANGE_STAINED_GLASS_PANE = register(
      "orange_stained_glass_pane",
      new Class3236(DyeColor.field387, AbstractBlock.Properties.withMaterial(Material.field38963).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid())
   );
   public static final Block MAGENTA_STAINED_GLASS_PANE = register(
      "magenta_stained_glass_pane",
      new Class3236(DyeColor.field388, AbstractBlock.Properties.withMaterial(Material.field38963).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid())
   );
   public static final Block LIGHT_BLUE_STAINED_GLASS_PANE = register(
      "light_blue_stained_glass_pane",
      new Class3236(DyeColor.field389, AbstractBlock.Properties.withMaterial(Material.field38963).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid())
   );
   public static final Block YELLOW_STAINED_GLASS_PANE = register(
      "yellow_stained_glass_pane",
      new Class3236(DyeColor.field390, AbstractBlock.Properties.withMaterial(Material.field38963).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid())
   );
   public static final Block LIME_STAINED_GLASS_PANE = register(
      "lime_stained_glass_pane",
      new Class3236(DyeColor.field391, AbstractBlock.Properties.withMaterial(Material.field38963).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid())
   );
   public static final Block PINK_STAINED_GLASS_PANE = register(
      "pink_stained_glass_pane",
      new Class3236(DyeColor.field392, AbstractBlock.Properties.withMaterial(Material.field38963).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid())
   );
   public static final Block GRAY_STAINED_GLASS_PANE = register(
      "gray_stained_glass_pane",
      new Class3236(DyeColor.field393, AbstractBlock.Properties.withMaterial(Material.field38963).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid())
   );
   public static final Block LIGHT_GRAY_STAINED_GLASS_PANE = register(
      "light_gray_stained_glass_pane",
      new Class3236(DyeColor.field394, AbstractBlock.Properties.withMaterial(Material.field38963).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid())
   );
   public static final Block CYAN_STAINED_GLASS_PANE = register(
      "cyan_stained_glass_pane",
      new Class3236(DyeColor.field395, AbstractBlock.Properties.withMaterial(Material.field38963).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid())
   );
   public static final Block PURPLE_STAINED_GLASS_PANE = register(
      "purple_stained_glass_pane",
      new Class3236(DyeColor.field396, AbstractBlock.Properties.withMaterial(Material.field38963).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid())
   );
   public static final Block BLUE_STAINED_GLASS_PANE = register(
      "blue_stained_glass_pane",
      new Class3236(DyeColor.field397, AbstractBlock.Properties.withMaterial(Material.field38963).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid())
   );
   public static final Block BROWN_STAINED_GLASS_PANE = register(
      "brown_stained_glass_pane",
      new Class3236(DyeColor.field398, AbstractBlock.Properties.withMaterial(Material.field38963).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid())
   );
   public static final Block GREEN_STAINED_GLASS_PANE = register(
      "green_stained_glass_pane",
      new Class3236(DyeColor.field399, AbstractBlock.Properties.withMaterial(Material.field38963).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid())
   );
   public static final Block RED_STAINED_GLASS_PANE = register(
      "red_stained_glass_pane",
      new Class3236(DyeColor.field400, AbstractBlock.Properties.withMaterial(Material.field38963).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid())
   );
   public static final Block BLACK_STAINED_GLASS_PANE = register(
      "black_stained_glass_pane",
      new Class3236(DyeColor.field401, AbstractBlock.Properties.withMaterial(Material.field38963).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid())
   );
   public static final Block ACACIA_STAIRS = register("acacia_stairs", new StairsBlock(ACACIA_PLANKS.getDefaultState(), AbstractBlock.Properties.method26613(ACACIA_PLANKS)));
   public static final Block DARK_OAK_STAIRS = register("dark_oak_stairs", new StairsBlock(DARK_OAK_PLANKS.getDefaultState(), AbstractBlock.Properties.method26613(DARK_OAK_PLANKS)));
   public static final Block SLIME_BLOCK = register(
      "slime_block",
      new Class3380(AbstractBlock.Properties.withMaterialAndColor(Material.field38949, MaterialColor.field30948).method26616(0.8F).sound(SoundType.SLIME).notSolid())
   );
   public static final Block BARRIER = register(
      "barrier",
      new Class3467(AbstractBlock.Properties.withMaterial(Material.BARRIER).method26621(-1.0F, 3600000.8F).method26626().notSolid().setAllowsSpawn(Blocks::neverAllowSpawn))
   );
   public static final Block IRON_TRAPDOOR = register(
      "iron_trapdoor",
      new TrapDoorBlock(
         AbstractBlock.Properties.withMaterial(Material.field38967)
            .method26635()
            .hardnessAndResistance(5.0F)
            .sound(SoundType.METAL)
            .notSolid()
            .setAllowsSpawn(Blocks::neverAllowSpawn)
      )
   );
   public static final Block PRISMARINE = register(
      "prismarine", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30970).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block PRISMARINE_BRICKS = register(
      "prismarine_bricks", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30978).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block DARK_PRISMARINE = register(
      "dark_prismarine", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30978).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block PRISMARINE_STAIRS = register("prismarine_stairs", new StairsBlock(PRISMARINE.getDefaultState(), AbstractBlock.Properties.method26613(PRISMARINE)));
   public static final Block PRISMARINE_BRICK_STAIRS = register("prismarine_brick_stairs", new StairsBlock(PRISMARINE_BRICKS.getDefaultState(), AbstractBlock.Properties.method26613(PRISMARINE_BRICKS)));
   public static final Block DARK_PRISMARINE_STAIRS = register("dark_prismarine_stairs", new StairsBlock(DARK_PRISMARINE.getDefaultState(), AbstractBlock.Properties.method26613(DARK_PRISMARINE)));
   public static final Block PRISMARINE_SLAB = register(
      "prismarine_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30970).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block PRISMARINE_BRICK_SLAB = register(
      "prismarine_brick_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30978).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block DARK_PRISMARINE_SLAB = register(
      "dark_prismarine_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30978).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block SEA_LANTERN = register(
      "sea_lantern",
      new Block(
         AbstractBlock.Properties.withMaterialAndColor(Material.field38963, MaterialColor.DIORITE).hardnessAndResistance(0.3F).sound(SoundType.GLASS).method26620(var0 -> 15)
      )
   );
   public static final Block HAY_BLOCK = register(
      "hay_block", new Class3388(AbstractBlock.Properties.withMaterialAndColor(Material.GRASS, MaterialColor.field30965).hardnessAndResistance(0.5F).sound(SoundType.GRASS))
   );
   public static final Block WHITE_CARPET = register(
      "white_carpet",
      new Class3422(DyeColor.field386, AbstractBlock.Properties.withMaterialAndColor(Material.field38935, MaterialColor.SNOW).hardnessAndResistance(0.1F).sound(SoundType.WOOL))
   );
   public static final Block ORANGE_CARPET = register(
      "orange_carpet",
      new Class3422(DyeColor.field387, AbstractBlock.Properties.withMaterialAndColor(Material.field38935, MaterialColor.field30962).hardnessAndResistance(0.1F).sound(SoundType.WOOL))
   );
   public static final Block MAGENTA_CARPET = register(
      "magenta_carpet",
      new Class3422(DyeColor.field388, AbstractBlock.Properties.withMaterialAndColor(Material.field38935, MaterialColor.field30963).hardnessAndResistance(0.1F).sound(SoundType.WOOL))
   );
   public static final Block LIGHT_BLUE_CARPET = register(
      "light_blue_carpet",
      new Class3422(DyeColor.field389, AbstractBlock.Properties.withMaterialAndColor(Material.field38935, MaterialColor.field30964).hardnessAndResistance(0.1F).sound(SoundType.WOOL))
   );
   public static final Block YELLOW_CARPET = register(
      "yellow_carpet",
      new Class3422(DyeColor.field390, AbstractBlock.Properties.withMaterialAndColor(Material.field38935, MaterialColor.field30965).hardnessAndResistance(0.1F).sound(SoundType.WOOL))
   );
   public static final Block LIME_CARPET = register(
      "lime_carpet",
      new Class3422(DyeColor.field391, AbstractBlock.Properties.withMaterialAndColor(Material.field38935, MaterialColor.field30966).hardnessAndResistance(0.1F).sound(SoundType.WOOL))
   );
   public static final Block PINK_CARPET = register(
      "pink_carpet",
      new Class3422(DyeColor.field392, AbstractBlock.Properties.withMaterialAndColor(Material.field38935, MaterialColor.field30967).hardnessAndResistance(0.1F).sound(SoundType.WOOL))
   );
   public static final Block GRAY_CARPET = register(
      "gray_carpet",
      new Class3422(DyeColor.field393, AbstractBlock.Properties.withMaterialAndColor(Material.field38935, MaterialColor.field30968).hardnessAndResistance(0.1F).sound(SoundType.WOOL))
   );
   public static final Block LIGHT_GRAY_CARPET = register(
      "light_gray_carpet",
      new Class3422(DyeColor.field394, AbstractBlock.Properties.withMaterialAndColor(Material.field38935, MaterialColor.field30969).hardnessAndResistance(0.1F).sound(SoundType.WOOL))
   );
   public static final Block CYAN_CARPET = register(
      "cyan_carpet",
      new Class3422(DyeColor.field395, AbstractBlock.Properties.withMaterialAndColor(Material.field38935, MaterialColor.field30970).hardnessAndResistance(0.1F).sound(SoundType.WOOL))
   );
   public static final Block PURPLE_CARPET = register(
      "purple_carpet",
      new Class3422(DyeColor.field396, AbstractBlock.Properties.withMaterialAndColor(Material.field38935, MaterialColor.field30971).hardnessAndResistance(0.1F).sound(SoundType.WOOL))
   );
   public static final Block BLUE_CARPET = register(
      "blue_carpet",
      new Class3422(DyeColor.field397, AbstractBlock.Properties.withMaterialAndColor(Material.field38935, MaterialColor.field30972).hardnessAndResistance(0.1F).sound(SoundType.WOOL))
   );
   public static final Block BROWN_CARPET = register(
      "brown_carpet",
      new Class3422(DyeColor.field398, AbstractBlock.Properties.withMaterialAndColor(Material.field38935, MaterialColor.field30973).hardnessAndResistance(0.1F).sound(SoundType.WOOL))
   );
   public static final Block GREEN_CARPET = register(
      "green_carpet",
      new Class3422(DyeColor.field399, AbstractBlock.Properties.withMaterialAndColor(Material.field38935, MaterialColor.field30974).hardnessAndResistance(0.1F).sound(SoundType.WOOL))
   );
   public static final Block RED_CARPET = register(
      "red_carpet",
      new Class3422(DyeColor.field400, AbstractBlock.Properties.withMaterialAndColor(Material.field38935, MaterialColor.field30975).hardnessAndResistance(0.1F).sound(SoundType.WOOL))
   );
   public static final Block BLACK_CARPET = register(
      "black_carpet",
      new Class3422(DyeColor.field401, AbstractBlock.Properties.withMaterialAndColor(Material.field38935, MaterialColor.field30976).hardnessAndResistance(0.1F).sound(SoundType.WOOL))
   );
   public static final Block TERRACOTTA = register(
      "terracotta", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30962).method26635().method26621(1.25F, 4.2F))
   );
   public static final Block COAL_BLOCK = register(
      "coal_block", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30976).method26635().method26621(5.0F, 6.0F))
   );
   public static final Block PACKED_ICE = register(
      "packed_ice", new Block(AbstractBlock.Properties.withMaterial(Material.field38952).method26616(0.98F).hardnessAndResistance(0.5F).sound(SoundType.GLASS))
   );
   public static final Block SUNFLOWER = register(
      "sunflower", new Class3457(AbstractBlock.Properties.withMaterial(Material.TALL_PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block LILAC = register(
      "lilac", new Class3457(AbstractBlock.Properties.withMaterial(Material.TALL_PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block ROSE_BUSH = register(
      "rose_bush", new Class3457(AbstractBlock.Properties.withMaterial(Material.TALL_PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block PEONY = register(
      "peony", new Class3457(AbstractBlock.Properties.withMaterial(Material.TALL_PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block TALL_GRASS = register(
      "tall_grass", new Class3456(AbstractBlock.Properties.withMaterial(Material.TALL_PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block LARGE_FERN = register(
      "large_fern", new Class3456(AbstractBlock.Properties.withMaterial(Material.TALL_PLANTS).method26614().method26622().sound(SoundType.GRASS))
   );
   public static final Block WHITE_BANNER = register(
      "white_banner",
      new BannerBlock(DyeColor.field386, AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD))
   );
   public static final Block ORANGE_BANNER = register(
      "orange_banner",
      new BannerBlock(DyeColor.field387, AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD))
   );
   public static final Block MAGENTA_BANNER = register(
      "magenta_banner",
      new BannerBlock(DyeColor.field388, AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD))
   );
   public static final Block LIGHT_BLUE_BANNER = register(
      "light_blue_banner",
      new BannerBlock(DyeColor.field389, AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD))
   );
   public static final Block YELLOW_BANNER = register(
      "yellow_banner",
      new BannerBlock(DyeColor.field390, AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD))
   );
   public static final Block LIME_BANNER = register(
      "lime_banner",
      new BannerBlock(DyeColor.field391, AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD))
   );
   public static final Block PINK_BANNER = register(
      "pink_banner",
      new BannerBlock(DyeColor.field392, AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD))
   );
   public static final Block GRAY_BANNER = register(
      "gray_banner",
      new BannerBlock(DyeColor.field393, AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD))
   );
   public static final Block LIGHT_GRAY_BANNER = register(
      "light_gray_banner",
      new BannerBlock(DyeColor.field394, AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD))
   );
   public static final Block CYAN_BANNER = register(
      "cyan_banner",
      new BannerBlock(DyeColor.field395, AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD))
   );
   public static final Block PURPLE_BANNER = register(
      "purple_banner",
      new BannerBlock(DyeColor.field396, AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD))
   );
   public static final Block BLUE_BANNER = register(
      "blue_banner",
      new BannerBlock(DyeColor.field397, AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD))
   );
   public static final Block BROWN_BANNER = register(
      "brown_banner",
      new BannerBlock(DyeColor.field398, AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD))
   );
   public static final Block GREEN_BANNER = register(
      "green_banner",
      new BannerBlock(DyeColor.field399, AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD))
   );
   public static final Block RED_BANNER = register(
      "red_banner",
      new BannerBlock(DyeColor.field400, AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD))
   );
   public static final Block BLACK_BANNER = register(
      "black_banner",
      new BannerBlock(DyeColor.field401, AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD))
   );
   public static final Block WHITE_WALL_BANNER = register(
      "white_wall_banner",
      new WallBanner(
         DyeColor.field386,
         AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD).method26627(WHITE_BANNER)
      )
   );
   public static final Block ORANGE_WALL_BANNER = register(
      "orange_wall_banner",
      new WallBanner(
         DyeColor.field387,
         AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD).method26627(ORANGE_BANNER)
      )
   );
   public static final Block MAGENTA_WALL_BANNER = register(
      "magenta_wall_banner",
      new WallBanner(
         DyeColor.field388,
         AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD).method26627(MAGENTA_BANNER)
      )
   );
   public static final Block LIGHT_BLUE_WALL_BANNER = register(
      "light_blue_wall_banner",
      new WallBanner(
         DyeColor.field389,
         AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD).method26627(LIGHT_BLUE_BANNER)
      )
   );
   public static final Block YELLOW_WALL_BANNER = register(
      "yellow_wall_banner",
      new WallBanner(
         DyeColor.field390,
         AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD).method26627(YELLOW_BANNER)
      )
   );
   public static final Block LIME_WALL_BANNER = register(
      "lime_wall_banner",
      new WallBanner(
         DyeColor.field391,
         AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD).method26627(LIME_BANNER)
      )
   );
   public static final Block PINK_WALL_BANNER = register(
      "pink_wall_banner",
      new WallBanner(
         DyeColor.field392,
         AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD).method26627(PINK_BANNER)
      )
   );
   public static final Block GRAY_WALL_BANNER = register(
      "gray_wall_banner",
      new WallBanner(
         DyeColor.field393,
         AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD).method26627(GRAY_BANNER)
      )
   );
   public static final Block LIGHT_GRAY_WALL_BANNER = register(
      "light_gray_wall_banner",
      new WallBanner(
         DyeColor.field394,
         AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD).method26627(LIGHT_GRAY_BANNER)
      )
   );
   public static final Block CYAN_WALL_BANNER = register(
      "cyan_wall_banner",
      new WallBanner(
         DyeColor.field395,
         AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD).method26627(CYAN_BANNER)
      )
   );
   public static final Block PURPLE_WALL_BANNER = register(
      "purple_wall_banner",
      new WallBanner(
         DyeColor.field396,
         AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD).method26627(PURPLE_BANNER)
      )
   );
   public static final Block BLUE_WALL_BANNER = register(
      "blue_wall_banner",
      new WallBanner(
         DyeColor.field397,
         AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD).method26627(BLUE_BANNER)
      )
   );
   public static final Block BROWN_WALL_BANNER = register(
      "brown_wall_banner",
      new WallBanner(
         DyeColor.field398,
         AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD).method26627(BROWN_BANNER)
      )
   );
   public static final Block GREEN_WALL_BANNER = register(
      "green_wall_banner",
      new WallBanner(
         DyeColor.field399,
         AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD).method26627(GREEN_BANNER)
      )
   );
   public static final Block RED_WALL_BANNER = register(
      "red_wall_banner",
      new WallBanner(
         DyeColor.field400,
         AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD).method26627(RED_BANNER)
      )
   );
   public static final Block BLACK_WALL_BANNER = register(
      "black_wall_banner",
      new WallBanner(
         DyeColor.field401,
         AbstractBlock.Properties.withMaterial(Material.WOOD).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD).method26627(BLACK_BANNER)
      )
   );
   public static final Block RED_SANDSTONE = register(
      "red_sandstone", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30962).method26635().hardnessAndResistance(0.8F))
   );
   public static final Block CHISELED_RED_SANDSTONE = register(
      "chiseled_red_sandstone", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30962).method26635().hardnessAndResistance(0.8F))
   );
   public static final Block CUT_RED_SANDSTONE = register(
      "cut_red_sandstone", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30962).method26635().hardnessAndResistance(0.8F))
   );
   public static final Block RED_SANDSTONE_STAIRS = register("red_sandstone_stairs", new StairsBlock(RED_SANDSTONE.getDefaultState(), AbstractBlock.Properties.method26613(RED_SANDSTONE)));
   public static final Block OAK_SLAB = register(
      "oak_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.OAK_PLANK).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block SPRUCE_SLAB = register(
      "spruce_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.PODZOL).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block BIRCH_SLAB = register(
      "birch_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30949).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block JUNGLE_SLAB = register(
      "jungle_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.GRANITE).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block ACACIA_SLAB = register(
      "acacia_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30962).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block DARK_OAK_SLAB = register(
      "dark_oak_slab",
      new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30973).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block STONE_SLAB = register(
      "stone_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.STONE).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block SMOOTH_STONE_SLAB = register(
      "smooth_stone_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.STONE).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block SANDSTONE_SLAB = register(
      "sandstone_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30949).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block CUT_SANDSTONE_SLAB = register(
      "cut_sandstone_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30949).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block PETRIFIED_OAK_SLAB = register(
      "petrified_oak_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.OAK_PLANK).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block COBBLESTONE_SLAB = register(
      "cobblestone_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.STONE).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block BRICK_SLAB = register(
      "brick_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30975).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block STONE_BRICK_SLAB = register(
      "stone_brick_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.STONE).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block NETHER_BRICK_SLAB = register(
      "nether_brick_slab",
      new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30982).method26635().method26621(2.0F, 6.0F).sound(SoundType.NETHER_SPROUTS))
   );
   public static final Block QUARTZ_SLAB = register(
      "quartz_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.DIORITE).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block RED_SANDSTONE_SLAB = register(
      "red_sandstone_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30962).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block CUT_RED_SANDSTONE_SLAB = register(
      "cut_red_sandstone_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30962).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block PURPUR_SLAB = register(
      "purpur_slab", new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30963).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block SMOOTH_STONE = register(
      "smooth_stone", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.STONE).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block SMOOTH_SANDSTONE = register(
      "smooth_sandstone", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30949).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block SMOOTH_QUARTZ = register(
      "smooth_quartz", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.DIORITE).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block SMOOTH_RED_SANDSTONE = register(
      "smooth_red_sandstone", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30962).method26635().method26621(2.0F, 6.0F))
   );
   public static final Block SPRUCE_FENCE_GATE = register(
      "spruce_fence_gate",
      new FenceGateBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, SPRUCE_PLANKS.getColor()).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block BIRCH_FENCE_GATE = register(
      "birch_fence_gate",
      new FenceGateBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, BIRCH_PLANKS.getColor()).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block JUNGLE_FENCE_GATE = register(
      "jungle_fence_gate",
      new FenceGateBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, JUNGLE_PLANKS.getColor()).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block ACACIA_FENCE_GATE = register(
      "acacia_fence_gate",
      new FenceGateBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, ACACIA_PLANKS.getColor()).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block DARK_OAK_FENCE_GATE = register(
      "dark_oak_fence_gate",
      new FenceGateBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, DARK_OAK_PLANKS.getColor()).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block SPRUCE_FENCE = register(
      "spruce_fence",
      new FenceBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, SPRUCE_PLANKS.getColor()).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block BIRCH_FENCE = register(
      "birch_fence",
      new FenceBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, BIRCH_PLANKS.getColor()).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block JUNGLE_FENCE = register(
      "jungle_fence",
      new FenceBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, JUNGLE_PLANKS.getColor()).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block ACACIA_FENCE = register(
      "acacia_fence",
      new FenceBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, ACACIA_PLANKS.getColor()).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block DARK_OAK_FENCE = register(
      "dark_oak_fence",
      new FenceBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, DARK_OAK_PLANKS.getColor()).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block SPRUCE_DOOR = register(
      "spruce_door",
      new DoorBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, SPRUCE_PLANKS.getColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid())
   );
   public static final Block BIRCH_DOOR = register(
      "birch_door",
      new DoorBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, BIRCH_PLANKS.getColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid())
   );
   public static final Block JUNGLE_DOOR = register(
      "jungle_door",
      new DoorBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, JUNGLE_PLANKS.getColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid())
   );
   public static final Block ACACIA_DOOR = register(
      "acacia_door",
      new DoorBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, ACACIA_PLANKS.getColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid())
   );
   public static final Block DARK_OAK_DOOR = register(
      "dark_oak_door",
      new DoorBlock(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, DARK_OAK_PLANKS.getColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid())
   );
   public static final Block END_ROD = register(
      "end_rod",
      new EndRodBlock(AbstractBlock.Properties.withMaterial(Material.field38946).method26622().method26620(var0 -> 14).sound(SoundType.WOOD).notSolid())
   );
   public static final Block CHORUS_PLANT = register(
      "chorus_plant",
      new ChorusPlantBlock(AbstractBlock.Properties.withMaterialAndColor(Material.PLANTS, MaterialColor.field30971).hardnessAndResistance(0.4F).sound(SoundType.WOOD).notSolid())
   );
   public static final Block CHORUS_FLOWER = register(
      "chorus_flower",
      new ChorusFlowerBlock(
         (ChorusPlantBlock) CHORUS_PLANT,
         AbstractBlock.Properties.withMaterialAndColor(Material.PLANTS, MaterialColor.field30971).tickRandomly().hardnessAndResistance(0.4F).sound(SoundType.WOOD).notSolid()
      )
   );
   public static final Block PURPUR_BLOCK = register(
      "purpur_block", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30963).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block PURPUR_PILLAR = register(
      "purpur_pillar", new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30963).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block PURPUR_STAIRS = register("purpur_stairs", new StairsBlock(PURPUR_BLOCK.getDefaultState(), AbstractBlock.Properties.method26613(PURPUR_BLOCK)));
   public static final Block END_STONE_BRICKS = register(
      "end_stone_bricks", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30949).method26635().method26621(3.0F, 9.0F))
   );
   public static final Block BEETROOTS = register(
      "beetroots", new Class3482(AbstractBlock.Properties.withMaterial(Material.PLANTS).method26614().tickRandomly().method26622().sound(SoundType.CROP))
   );
   public static final Block GRASS_PATH = register(
      "grass_path",
      new Class3411(
         AbstractBlock.Properties.withMaterial(Material.DIRT)
            .hardnessAndResistance(0.65F)
            .sound(SoundType.GRASS)
            .setBlocksVision(Blocks::needsPostProcessing)
            .setSuffocates(Blocks::needsPostProcessing)
      )
   );
   public static final Block END_GATEWAY = register(
      "end_gateway",
      new Class3243(
         AbstractBlock.Properties.withMaterialAndColor(Material.field38934, MaterialColor.field30976).method26614().method26620(var0 -> 15).method26621(-1.0F, 3600000.0F).method26626()
      )
   );
   public static final Block REPEATING_COMMAND_BLOCK = register(
      "repeating_command_block",
      new CommandBlockBlock(AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.field30971).method26635().method26621(-1.0F, 3600000.0F).method26626())
   );
   public static final Block CHAIN_COMMAND_BLOCK = register(
      "chain_command_block",
      new CommandBlockBlock(AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.field30974).method26635().method26621(-1.0F, 3600000.0F).method26626())
   );
   public static final Block FROSTED_ICE = register(
      "frosted_ice",
      new IceBlock(
         AbstractBlock.Properties.withMaterial(Material.ICE)
            .method26616(0.98F)
            .tickRandomly()
            .hardnessAndResistance(0.5F)
            .sound(SoundType.GLASS)
            .notSolid()
            .setAllowsSpawn((var0, var1, var2, var3) -> var3 == EntityType.POLAR_BEAR)
      )
   );
   public static final Block MAGMA_BLOCK = register(
      "magma_block",
      new MagmaBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30982)
            .method26635()
            .method26620(var0 -> 3)
            .tickRandomly()
            .hardnessAndResistance(0.5F)
            .setAllowsSpawn((var0, var1, var2, var3) -> var3.method33207())
            .method26633(Blocks::needsPostProcessing)
            .method26634(Blocks::needsPostProcessing)
      )
   );
   public static final Block NETHER_WART_BLOCK = register(
      "nether_wart_block", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.GRASS, MaterialColor.field30975).hardnessAndResistance(1.0F).sound(SoundType.NETHERRACK))
   );
   public static final Block RED_NETHER_BRICKS = register(
      "red_nether_bricks",
      new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30982).method26635().method26621(2.0F, 6.0F).sound(SoundType.NETHER_SPROUTS))
   );
   public static final Block BONE_BLOCK = register(
      "bone_block",
      new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30949).method26635().hardnessAndResistance(2.0F).sound(SoundType.NETHERITE))
   );
   public static final Block STRUCTURE_VOID = register(
      "structure_void", new StructureVoid(AbstractBlock.Properties.withMaterial(Material.field38933).method26614().method26626())
   );
   public static final Block OBSERVER = register(
      "observer", new ObserverBlock(AbstractBlock.Properties.withMaterial(Material.STONE).hardnessAndResistance(3.0F).method26635().setOpaque(Blocks::isntSolid))
   );
   public static final Block SHULKER_BOX = register("shulker_box", createShulkerBoxFromColorAndProperties((DyeColor)null, AbstractBlock.Properties.withMaterial(Material.field38955)));
   public static final Block WHITE_SHULKER_BOX = register(
      "white_shulker_box", createShulkerBoxFromColorAndProperties(DyeColor.field386, AbstractBlock.Properties.withMaterialAndColor(Material.field38955, MaterialColor.SNOW))
   );
   public static final Block ORANGE_SHULKER_BOX = register(
      "orange_shulker_box", createShulkerBoxFromColorAndProperties(DyeColor.field387, AbstractBlock.Properties.withMaterialAndColor(Material.field38955, MaterialColor.field30962))
   );
   public static final Block MAGENTA_SHULKER_BOX = register(
      "magenta_shulker_box", createShulkerBoxFromColorAndProperties(DyeColor.field388, AbstractBlock.Properties.withMaterialAndColor(Material.field38955, MaterialColor.field30963))
   );
   public static final Block LIGHT_BLUE_SHULKER_BOX = register(
      "light_blue_shulker_box", createShulkerBoxFromColorAndProperties(DyeColor.field389, AbstractBlock.Properties.withMaterialAndColor(Material.field38955, MaterialColor.field30964))
   );
   public static final Block YELLOW_SHULKER_BOX = register(
      "yellow_shulker_box", createShulkerBoxFromColorAndProperties(DyeColor.field390, AbstractBlock.Properties.withMaterialAndColor(Material.field38955, MaterialColor.field30965))
   );
   public static final Block LIME_SHULKER_BOX = register(
      "lime_shulker_box", createShulkerBoxFromColorAndProperties(DyeColor.field391, AbstractBlock.Properties.withMaterialAndColor(Material.field38955, MaterialColor.field30966))
   );
   public static final Block PINK_SHULKER_BOX = register(
      "pink_shulker_box", createShulkerBoxFromColorAndProperties(DyeColor.field392, AbstractBlock.Properties.withMaterialAndColor(Material.field38955, MaterialColor.field30967))
   );
   public static final Block GRAY_SHULKER_BOX = register(
      "gray_shulker_box", createShulkerBoxFromColorAndProperties(DyeColor.field393, AbstractBlock.Properties.withMaterialAndColor(Material.field38955, MaterialColor.field30968))
   );
   public static final Block LIGHT_GRAY_SHULKER_BOX = register(
      "light_gray_shulker_box", createShulkerBoxFromColorAndProperties(DyeColor.field394, AbstractBlock.Properties.withMaterialAndColor(Material.field38955, MaterialColor.field30969))
   );
   public static final Block CYAN_SHULKER_BOX = register(
      "cyan_shulker_box", createShulkerBoxFromColorAndProperties(DyeColor.field395, AbstractBlock.Properties.withMaterialAndColor(Material.field38955, MaterialColor.field30970))
   );
   public static final Block PURPLE_SHULKER_BOX = register(
      "purple_shulker_box", createShulkerBoxFromColorAndProperties(DyeColor.field396, AbstractBlock.Properties.withMaterialAndColor(Material.field38955, MaterialColor.field30993))
   );
   public static final Block BLUE_SHULKER_BOX = register(
      "blue_shulker_box", createShulkerBoxFromColorAndProperties(DyeColor.field397, AbstractBlock.Properties.withMaterialAndColor(Material.field38955, MaterialColor.field30972))
   );
   public static final Block BROWN_SHULKER_BOX = register(
      "brown_shulker_box", createShulkerBoxFromColorAndProperties(DyeColor.field398, AbstractBlock.Properties.withMaterialAndColor(Material.field38955, MaterialColor.field30973))
   );
   public static final Block GREEN_SHULKER_BOX = register(
      "green_shulker_box", createShulkerBoxFromColorAndProperties(DyeColor.field399, AbstractBlock.Properties.withMaterialAndColor(Material.field38955, MaterialColor.field30974))
   );
   public static final Block RED_SHULKER_BOX = register(
      "red_shulker_box", createShulkerBoxFromColorAndProperties(DyeColor.field400, AbstractBlock.Properties.withMaterialAndColor(Material.field38955, MaterialColor.field30975))
   );
   public static final Block BLACK_SHULKER_BOX = register(
      "black_shulker_box", createShulkerBoxFromColorAndProperties(DyeColor.field401, AbstractBlock.Properties.withMaterialAndColor(Material.field38955, MaterialColor.field30976))
   );
   public static final Block WHITE_GLAZED_TERRACOTTA = register(
      "white_glazed_terracotta", new GlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field386).method26635().hardnessAndResistance(1.4F))
   );
   public static final Block ORANGE_GLAZED_TERRACOTTA = register(
      "orange_glazed_terracotta", new GlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field387).method26635().hardnessAndResistance(1.4F))
   );
   public static final Block MAGENTA_GLAZED_TERRACOTTA = register(
      "magenta_glazed_terracotta", new GlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field388).method26635().hardnessAndResistance(1.4F))
   );
   public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA = register(
      "light_blue_glazed_terracotta", new GlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field389).method26635().hardnessAndResistance(1.4F))
   );
   public static final Block YELLOW_GLAZED_TERRACOTTA = register(
      "yellow_glazed_terracotta", new GlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field390).method26635().hardnessAndResistance(1.4F))
   );
   public static final Block LIME_GLAZED_TERRACOTTA = register(
      "lime_glazed_terracotta", new GlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field391).method26635().hardnessAndResistance(1.4F))
   );
   public static final Block PINK_GLAZED_TERRACOTTA = register(
      "pink_glazed_terracotta", new GlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field392).method26635().hardnessAndResistance(1.4F))
   );
   public static final Block GRAY_GLAZED_TERRACOTTA = register(
      "gray_glazed_terracotta", new GlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field393).method26635().hardnessAndResistance(1.4F))
   );
   public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA = register(
      "light_gray_glazed_terracotta", new GlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field394).method26635().hardnessAndResistance(1.4F))
   );
   public static final Block CYAN_GLAZED_TERRACOTTA = register(
      "cyan_glazed_terracotta", new GlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field395).method26635().hardnessAndResistance(1.4F))
   );
   public static final Block PURPLE_GLAZED_TERRACOTTA = register(
      "purple_glazed_terracotta", new GlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field396).method26635().hardnessAndResistance(1.4F))
   );
   public static final Block BLUE_GLAZED_TERRACOTTA = register(
      "blue_glazed_terracotta", new GlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field397).method26635().hardnessAndResistance(1.4F))
   );
   public static final Block BROWN_GLAZED_TERRACOTTA = register(
      "brown_glazed_terracotta", new GlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field398).method26635().hardnessAndResistance(1.4F))
   );
   public static final Block GREEN_GLAZED_TERRACOTTA = register(
      "green_glazed_terracotta", new GlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field399).method26635().hardnessAndResistance(1.4F))
   );
   public static final Block RED_GLAZED_TERRACOTTA = register(
      "red_glazed_terracotta", new GlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field400).method26635().hardnessAndResistance(1.4F))
   );
   public static final Block BLACK_GLAZED_TERRACOTTA = register(
      "black_glazed_terracotta", new GlazedTerracottaBlock(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field401).method26635().hardnessAndResistance(1.4F))
   );
   public static final Block WHITE_CONCRETE = register(
      "white_concrete", new Block(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field386).method26635().hardnessAndResistance(1.8F))
   );
   public static final Block ORANGE_CONCRETE = register(
      "orange_concrete", new Block(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field387).method26635().hardnessAndResistance(1.8F))
   );
   public static final Block MAGENTA_CONCRETE = register(
      "magenta_concrete", new Block(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field388).method26635().hardnessAndResistance(1.8F))
   );
   public static final Block LIGHT_BLUE_CONCRETE = register(
      "light_blue_concrete", new Block(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field389).method26635().hardnessAndResistance(1.8F))
   );
   public static final Block YELLOW_CONCRETE = register(
      "yellow_concrete", new Block(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field390).method26635().hardnessAndResistance(1.8F))
   );
   public static final Block LIME_CONCRETE = register(
      "lime_concrete", new Block(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field391).method26635().hardnessAndResistance(1.8F))
   );
   public static final Block PINK_CONCRETE = register(
      "pink_concrete", new Block(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field392).method26635().hardnessAndResistance(1.8F))
   );
   public static final Block GRAY_CONCRETE = register(
      "gray_concrete", new Block(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field393).method26635().hardnessAndResistance(1.8F))
   );
   public static final Block LIGHT_GRAY_CONCRETE = register(
      "light_gray_concrete", new Block(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field394).method26635().hardnessAndResistance(1.8F))
   );
   public static final Block CYAN_CONCRETE = register(
      "cyan_concrete", new Block(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field395).method26635().hardnessAndResistance(1.8F))
   );
   public static final Block PURPLE_CONCRETE = register(
      "purple_concrete", new Block(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field396).method26635().hardnessAndResistance(1.8F))
   );
   public static final Block BLUE_CONCRETE = register(
      "blue_concrete", new Block(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field397).method26635().hardnessAndResistance(1.8F))
   );
   public static final Block BROWN_CONCRETE = register(
      "brown_concrete", new Block(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field398).method26635().hardnessAndResistance(1.8F))
   );
   public static final Block GREEN_CONCRETE = register(
      "green_concrete", new Block(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field399).method26635().hardnessAndResistance(1.8F))
   );
   public static final Block RED_CONCRETE = register(
      "red_concrete", new Block(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field400).method26635().hardnessAndResistance(1.8F))
   );
   public static final Block BLACK_CONCRETE = register(
      "black_concrete", new Block(AbstractBlock.Properties.method26610(Material.STONE, DyeColor.field401).method26635().hardnessAndResistance(1.8F))
   );
   public static final Block WHITE_CONCRETE_POWDER = register(
      "white_concrete_powder",
      new ConcretePowderBlock(WHITE_CONCRETE, AbstractBlock.Properties.method26610(Material.field38953, DyeColor.field386).hardnessAndResistance(0.5F).sound(SoundType.SAND))
   );
   public static final Block ORANGE_CONCRETE_POWDER = register(
      "orange_concrete_powder",
      new ConcretePowderBlock(ORANGE_CONCRETE, AbstractBlock.Properties.method26610(Material.field38953, DyeColor.field387).hardnessAndResistance(0.5F).sound(SoundType.SAND))
   );
   public static final Block MAGENTA_CONCRETE_POWDER = register(
      "magenta_concrete_powder",
      new ConcretePowderBlock(MAGENTA_CONCRETE, AbstractBlock.Properties.method26610(Material.field38953, DyeColor.field388).hardnessAndResistance(0.5F).sound(SoundType.SAND))
   );
   public static final Block LIGHT_BLUE_CONCRETE_POWDER = register(
      "light_blue_concrete_powder",
      new ConcretePowderBlock(LIGHT_BLUE_CONCRETE, AbstractBlock.Properties.method26610(Material.field38953, DyeColor.field389).hardnessAndResistance(0.5F).sound(SoundType.SAND))
   );
   public static final Block YELLOW_CONCRETE_POWDER = register(
      "yellow_concrete_powder",
      new ConcretePowderBlock(YELLOW_CONCRETE, AbstractBlock.Properties.method26610(Material.field38953, DyeColor.field390).hardnessAndResistance(0.5F).sound(SoundType.SAND))
   );
   public static final Block LIME_CONCRETE_POWDER = register(
      "lime_concrete_powder",
      new ConcretePowderBlock(LIME_CONCRETE, AbstractBlock.Properties.method26610(Material.field38953, DyeColor.field391).hardnessAndResistance(0.5F).sound(SoundType.SAND))
   );
   public static final Block PINK_CONCRETE_POWDER = register(
      "pink_concrete_powder",
      new ConcretePowderBlock(PINK_CONCRETE, AbstractBlock.Properties.method26610(Material.field38953, DyeColor.field392).hardnessAndResistance(0.5F).sound(SoundType.SAND))
   );
   public static final Block GRAY_CONCRETE_POWDER = register(
      "gray_concrete_powder",
      new ConcretePowderBlock(GRAY_CONCRETE, AbstractBlock.Properties.method26610(Material.field38953, DyeColor.field393).hardnessAndResistance(0.5F).sound(SoundType.SAND))
   );
   public static final Block LIGHT_GRAY_CONCRETE_POWDER = register(
      "light_gray_concrete_powder",
      new ConcretePowderBlock(LIGHT_GRAY_CONCRETE, AbstractBlock.Properties.method26610(Material.field38953, DyeColor.field394).hardnessAndResistance(0.5F).sound(SoundType.SAND))
   );
   public static final Block CYAN_CONCRETE_POWDER = register(
      "cyan_concrete_powder",
      new ConcretePowderBlock(CYAN_CONCRETE, AbstractBlock.Properties.method26610(Material.field38953, DyeColor.field395).hardnessAndResistance(0.5F).sound(SoundType.SAND))
   );
   public static final Block PURPLE_CONCRETE_POWDER = register(
      "purple_concrete_powder",
      new ConcretePowderBlock(PURPLE_CONCRETE, AbstractBlock.Properties.method26610(Material.field38953, DyeColor.field396).hardnessAndResistance(0.5F).sound(SoundType.SAND))
   );
   public static final Block BLUE_CONCRETE_POWDER = register(
      "blue_concrete_powder",
      new ConcretePowderBlock(BLUE_CONCRETE, AbstractBlock.Properties.method26610(Material.field38953, DyeColor.field397).hardnessAndResistance(0.5F).sound(SoundType.SAND))
   );
   public static final Block BROWN_CONCRETE_POWDER = register(
      "brown_concrete_powder",
      new ConcretePowderBlock(BROWN_CONCRETE, AbstractBlock.Properties.method26610(Material.field38953, DyeColor.field398).hardnessAndResistance(0.5F).sound(SoundType.SAND))
   );
   public static final Block GREEN_CONCRETE_POWDER = register(
      "green_concrete_powder",
      new ConcretePowderBlock(GREEN_CONCRETE, AbstractBlock.Properties.method26610(Material.field38953, DyeColor.field399).hardnessAndResistance(0.5F).sound(SoundType.SAND))
   );
   public static final Block RED_CONCRETE_POWDER = register(
      "red_concrete_powder",
      new ConcretePowderBlock(RED_CONCRETE, AbstractBlock.Properties.method26610(Material.field38953, DyeColor.field400).hardnessAndResistance(0.5F).sound(SoundType.SAND))
   );
   public static final Block BLACK_CONCRETE_POWDER = register(
      "black_concrete_powder",
      new ConcretePowderBlock(BLACK_CONCRETE, AbstractBlock.Properties.method26610(Material.field38953, DyeColor.field401).hardnessAndResistance(0.5F).sound(SoundType.SAND))
   );
   public static final Block KELP = register(
      "kelp", new KelpBlock(AbstractBlock.Properties.withMaterial(Material.field38937).method26614().tickRandomly().method26622().sound(SoundType.WET_GRASS))
   );
   public static final Block KELP_PLANT = register(
      "kelp_plant", new KelpPlantBlock(AbstractBlock.Properties.withMaterial(Material.field38937).method26614().method26622().sound(SoundType.WET_GRASS))
   );
   public static final Block DRIED_KELP_BLOCK = register(
      "dried_kelp_block",
      new Block(AbstractBlock.Properties.withMaterialAndColor(Material.GRASS, MaterialColor.field30974).method26621(0.5F, 2.5F).sound(SoundType.GRASS))
   );
   public static final Block TURTLE_EGG = register(
      "turtle_egg",
      new TurtleEggBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.DRAGON_EGG, MaterialColor.field30949).hardnessAndResistance(0.5F).sound(SoundType.METAL).tickRandomly().notSolid()
      )
   );
   public static final Block DEAD_TUBE_CORAL_BLOCK = register(
      "dead_tube_coral_block", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block DEAD_BRAIN_CORAL_BLOCK = register(
      "dead_brain_coral_block", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block DEAD_BUBBLE_CORAL_BLOCK = register(
      "dead_bubble_coral_block", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block DEAD_FIRE_CORAL_BLOCK = register(
      "dead_fire_coral_block", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block DEAD_HORN_CORAL_BLOCK = register(
      "dead_horn_coral_block", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block TUBE_CORAL_BLOCK = register(
      "tube_coral_block",
      new CoralBlock(
              DEAD_TUBE_CORAL_BLOCK, AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30972).method26635().method26621(1.5F, 6.0F).sound(SoundType.CORAL)
      )
   );
   public static final Block BRAIN_CORAL_BLOCK = register(
      "brain_coral_block",
      new CoralBlock(
              DEAD_BRAIN_CORAL_BLOCK, AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30967).method26635().method26621(1.5F, 6.0F).sound(SoundType.CORAL)
      )
   );
   public static final Block BUBBLE_CORAL_BLOCK = register(
      "bubble_coral_block",
      new CoralBlock(
              DEAD_BUBBLE_CORAL_BLOCK, AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30971).method26635().method26621(1.5F, 6.0F).sound(SoundType.CORAL)
      )
   );
   public static final Block FIRE_CORAL_BLOCK = register(
      "fire_coral_block",
      new CoralBlock(
              DEAD_FIRE_CORAL_BLOCK, AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30975).method26635().method26621(1.5F, 6.0F).sound(SoundType.CORAL)
      )
   );
   public static final Block HORN_CORAL_BLOCK = register(
      "horn_coral_block",
      new CoralBlock(
              DEAD_HORN_CORAL_BLOCK, AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30965).method26635().method26621(1.5F, 6.0F).sound(SoundType.CORAL)
      )
   );
   public static final Block DEAD_TUBE_CORAL = register(
      "dead_tube_coral", new DeadCoralBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block DEAD_BRAIN_CORAL = register(
      "dead_brain_coral", new DeadCoralBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block DEAD_BUBBLE_CORAL = register(
      "dead_bubble_coral", new DeadCoralBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block DEAD_FIRE_CORAL = register(
      "dead_fire_coral", new DeadCoralBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block DEAD_HORN_CORAL = register(
      "dead_horn_coral", new DeadCoralBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block TUBE_CORAL = register(
      "tube_coral",
      new OtherCoralBlock(DEAD_TUBE_CORAL, AbstractBlock.Properties.withMaterialAndColor(Material.field38937, MaterialColor.field30972).method26614().method26622().sound(SoundType.WET_GRASS))
   );
   public static final Block BRAIN_CORAL = register(
      "brain_coral",
      new OtherCoralBlock(DEAD_BRAIN_CORAL, AbstractBlock.Properties.withMaterialAndColor(Material.field38937, MaterialColor.field30967).method26614().method26622().sound(SoundType.WET_GRASS))
   );
   public static final Block BUBBLE_CORAL = register(
      "bubble_coral",
      new OtherCoralBlock(DEAD_BUBBLE_CORAL, AbstractBlock.Properties.withMaterialAndColor(Material.field38937, MaterialColor.field30971).method26614().method26622().sound(SoundType.WET_GRASS))
   );
   public static final Block FIRE_CORAL = register(
      "fire_coral",
      new OtherCoralBlock(DEAD_FIRE_CORAL, AbstractBlock.Properties.withMaterialAndColor(Material.field38937, MaterialColor.field30975).method26614().method26622().sound(SoundType.WET_GRASS))
   );
   public static final Block HORN_CORAL = register(
      "horn_coral",
      new OtherCoralBlock(DEAD_HORN_CORAL, AbstractBlock.Properties.withMaterialAndColor(Material.field38937, MaterialColor.field30965).method26614().method26622().sound(SoundType.WET_GRASS))
   );
   public static final Block DEAD_TUBE_CORAL_FAN = register(
      "dead_tube_coral_fan", new CoralFanBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block DEAD_BRAIN_CORAL_FAN = register(
      "dead_brain_coral_fan", new CoralFanBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block DEAD_BUBBLE_CORAL_FAN = register(
      "dead_bubble_coral_fan", new CoralFanBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block DEAD_FIRE_CORAL_FAN = register(
      "dead_fire_coral_fan", new CoralFanBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block DEAD_HORN_CORAL_FAN = register(
      "dead_horn_coral_fan", new CoralFanBlock(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26614().method26622())
   );
   public static final Block TUBE_CORAL_FAN = register(
      "tube_coral_fan",
      new Class3228(DEAD_TUBE_CORAL_FAN, AbstractBlock.Properties.withMaterialAndColor(Material.field38937, MaterialColor.field30972).method26614().method26622().sound(SoundType.WET_GRASS))
   );
   public static final Block BRAIN_CORAL_FAN = register(
      "brain_coral_fan",
      new Class3228(DEAD_BRAIN_CORAL_FAN, AbstractBlock.Properties.withMaterialAndColor(Material.field38937, MaterialColor.field30967).method26614().method26622().sound(SoundType.WET_GRASS))
   );
   public static final Block BUBBLE_CORAL_FAN = register(
      "bubble_coral_fan",
      new Class3228(DEAD_BUBBLE_CORAL_FAN, AbstractBlock.Properties.withMaterialAndColor(Material.field38937, MaterialColor.field30971).method26614().method26622().sound(SoundType.WET_GRASS))
   );
   public static final Block FIRE_CORAL_FAN = register(
      "fire_coral_fan",
      new Class3228(DEAD_FIRE_CORAL_FAN, AbstractBlock.Properties.withMaterialAndColor(Material.field38937, MaterialColor.field30975).method26614().method26622().sound(SoundType.WET_GRASS))
   );
   public static final Block HORN_CORAL_FAN = register(
      "horn_coral_fan",
      new Class3228(DEAD_HORN_CORAL_FAN, AbstractBlock.Properties.withMaterialAndColor(Material.field38937, MaterialColor.field30965).method26614().method26622().sound(SoundType.WET_GRASS))
   );
   public static final Block DEAD_TUBE_CORAL_WALL_FAN = register(
      "dead_tube_coral_wall_fan",
      new Class3229(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26614().method26622().method26627(DEAD_TUBE_CORAL_FAN))
   );
   public static final Block DEAD_BRAIN_CORAL_WALL_FAN = register(
      "dead_brain_coral_wall_fan",
      new Class3229(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26614().method26622().method26627(DEAD_BRAIN_CORAL_FAN))
   );
   public static final Block DEAD_BUBBLE_CORAL_WALL_FAN = register(
      "dead_bubble_coral_wall_fan",
      new Class3229(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26614().method26622().method26627(DEAD_BUBBLE_CORAL_FAN))
   );
   public static final Block DEAD_FIRE_CORAL_WALL_FAN = register(
      "dead_fire_coral_wall_fan",
      new Class3229(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26614().method26622().method26627(DEAD_FIRE_CORAL_FAN))
   );
   public static final Block DEAD_HORN_CORAL_WALL_FAN = register(
      "dead_horn_coral_wall_fan",
      new Class3229(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30968).method26635().method26614().method26622().method26627(DEAD_HORN_CORAL_FAN))
   );
   public static final Block TUBE_CORAL_WALL_FAN = register(
      "tube_coral_wall_fan",
      new Class3230(
              DEAD_TUBE_CORAL_WALL_FAN,
         AbstractBlock.Properties.withMaterialAndColor(Material.field38937, MaterialColor.field30972)
            .method26614()
            .method26622()
            .sound(SoundType.WET_GRASS)
            .method26627(TUBE_CORAL_FAN)
      )
   );
   public static final Block BRAIN_CORAL_WALL_FAN = register(
      "brain_coral_wall_fan",
      new Class3230(
              DEAD_BRAIN_CORAL_WALL_FAN,
         AbstractBlock.Properties.withMaterialAndColor(Material.field38937, MaterialColor.field30967)
            .method26614()
            .method26622()
            .sound(SoundType.WET_GRASS)
            .method26627(BRAIN_CORAL_FAN)
      )
   );
   public static final Block BUBBLE_CORAL_WALL_FAN = register(
      "bubble_coral_wall_fan",
      new Class3230(
              DEAD_BUBBLE_CORAL_WALL_FAN,
         AbstractBlock.Properties.withMaterialAndColor(Material.field38937, MaterialColor.field30971)
            .method26614()
            .method26622()
            .sound(SoundType.WET_GRASS)
            .method26627(BUBBLE_CORAL_FAN)
      )
   );
   public static final Block FIRE_CORAL_WALL_FAN = register(
      "fire_coral_wall_fan",
      new Class3230(
              DEAD_FIRE_CORAL_WALL_FAN,
         AbstractBlock.Properties.withMaterialAndColor(Material.field38937, MaterialColor.field30975)
            .method26614()
            .method26622()
            .sound(SoundType.WET_GRASS)
            .method26627(FIRE_CORAL_FAN)
      )
   );
   public static final Block HORN_CORAL_WALL_FAN = register(
      "horn_coral_wall_fan",
      new Class3230(
              DEAD_HORN_CORAL_WALL_FAN,
         AbstractBlock.Properties.withMaterialAndColor(Material.field38937, MaterialColor.field30965)
            .method26614()
            .method26622()
            .sound(SoundType.WET_GRASS)
            .method26627(HORN_CORAL_FAN)
      )
   );
   public static final Block SEA_PICKLE = register(
      "sea_pickle",
      new Class3195(
         AbstractBlock.Properties.withMaterialAndColor(Material.field38937, MaterialColor.field30974)
            .method26620(var0 -> !Class3195.method11496(var0) ? 3 + 3 * var0.<Integer>get(Class3195.field18472) : 0)
            .sound(SoundType.SLIME)
            .notSolid()
      )
   );
   public static final Block BLUE_ICE = register(
      "blue_ice", new Class3231(AbstractBlock.Properties.withMaterial(Material.field38952).hardnessAndResistance(2.8F).method26616(0.989F).sound(SoundType.GLASS))
   );
   public static final Block CONDUIT = register(
      "conduit", new Class3371(AbstractBlock.Properties.withMaterialAndColor(Material.field38963, MaterialColor.field30978).hardnessAndResistance(3.0F).method26620(var0 -> 15).notSolid())
   );
   public static final Block BAMBOO_SAPLING = register(
      "bamboo_sapling",
      new Class3424(AbstractBlock.Properties.withMaterial(Material.field38958).tickRandomly().method26622().method26614().hardnessAndResistance(1.0F).sound(SoundType.BAMBOO_SAPLING))
   );
   public static final Block BAMBOO = register(
      "bamboo",
      new BambooBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.field38959, MaterialColor.FOLIAGE)
            .tickRandomly()
            .method26622()
            .hardnessAndResistance(1.0F)
            .sound(SoundType.BAMBOO)
            .notSolid()
      )
   );
   public static final Block POTTED_BAMBOO = register(
      "potted_bamboo", new PottedWarpedRoots(BAMBOO, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block VOID_AIR = register(
      "void_air", new AirBlock(AbstractBlock.Properties.withMaterial(Material.AIR).method26614().method26626().method26628())
   );
   public static final Block CAVE_AIR = register(
      "cave_air", new AirBlock(AbstractBlock.Properties.withMaterial(Material.AIR).method26614().method26626().method26628())
   );
   public static final Block BUBBLE_COLUMN = register(
      "bubble_column", new Class3406(AbstractBlock.Properties.withMaterial(Material.field38942).method26614().method26626())
   );
   public static final Block POLISHED_GRANITE_STAIRS = register("polished_granite_stairs", new StairsBlock(POLISHED_GRANITE.getDefaultState(), AbstractBlock.Properties.method26613(POLISHED_GRANITE)));
   public static final Block SMOOTH_RED_SANDSTONE_STAIRS = register(
      "smooth_red_sandstone_stairs", new StairsBlock(SMOOTH_RED_SANDSTONE.getDefaultState(), AbstractBlock.Properties.method26613(SMOOTH_RED_SANDSTONE))
   );
   public static final Block MOSSY_STONE_BRICK_STAIRS = register(
      "mossy_stone_brick_stairs", new StairsBlock(MOSSY_STONE_BRICKS.getDefaultState(), AbstractBlock.Properties.method26613(MOSSY_STONE_BRICKS))
   );
   public static final Block POLISHED_DIORITE_STAIRS = register("polished_diorite_stairs", new StairsBlock(POLISHED_DIORITE.getDefaultState(), AbstractBlock.Properties.method26613(POLISHED_DIORITE)));
   public static final Block MOSSY_COBBLESTONE_STAIRS = register(
      "mossy_cobblestone_stairs", new StairsBlock(MOSSY_COBBLESTONE.getDefaultState(), AbstractBlock.Properties.method26613(MOSSY_COBBLESTONE))
   );
   public static final Block END_STONE_BRICK_STAIRS = register("end_stone_brick_stairs", new StairsBlock(END_STONE_BRICKS.getDefaultState(), AbstractBlock.Properties.method26613(END_STONE_BRICKS)));
   public static final Block STONE_STAIRS = register("stone_stairs", new StairsBlock(STONE.getDefaultState(), AbstractBlock.Properties.method26613(STONE)));
   public static final Block SMOOTH_SANDSTONE_STAIRS = register("smooth_sandstone_stairs", new StairsBlock(SMOOTH_SANDSTONE.getDefaultState(), AbstractBlock.Properties.method26613(SMOOTH_SANDSTONE)));
   public static final Block SMOOTH_QUARTZ_STAIRS = register("smooth_quartz_stairs", new StairsBlock(SMOOTH_QUARTZ.getDefaultState(), AbstractBlock.Properties.method26613(SMOOTH_QUARTZ)));
   public static final Block GRANITE_STAIRS = register("granite_stairs", new StairsBlock(GRANITE.getDefaultState(), AbstractBlock.Properties.method26613(GRANITE)));
   public static final Block ANDESITE_STAIRS = register("andesite_stairs", new StairsBlock(ANDESITE.getDefaultState(), AbstractBlock.Properties.method26613(ANDESITE)));
   public static final Block RED_NETHER_BRICK_STAIRS = register("red_nether_brick_stairs", new StairsBlock(RED_NETHER_BRICKS.getDefaultState(), AbstractBlock.Properties.method26613(RED_NETHER_BRICKS)));
   public static final Block POLISHED_ANDESITE_STAIRS = register(
      "polished_andesite_stairs", new StairsBlock(POLISHED_ANDESITE.getDefaultState(), AbstractBlock.Properties.method26613(POLISHED_ANDESITE))
   );
   public static final Block DIORITE_STAIRS = register("diorite_stairs", new StairsBlock(DIORITE.getDefaultState(), AbstractBlock.Properties.method26613(DIORITE)));
   public static final Block POLISHED_GRANITE_SLAB = register("polished_granite_slab", new SlabBlock(AbstractBlock.Properties.method26613(POLISHED_GRANITE)));
   public static final Block SMOOTH_RED_SANDSTONE_SLAB = register("smooth_red_sandstone_slab", new SlabBlock(AbstractBlock.Properties.method26613(SMOOTH_RED_SANDSTONE)));
   public static final Block MOSSY_STONE_BRICK_SLAB = register("mossy_stone_brick_slab", new SlabBlock(AbstractBlock.Properties.method26613(MOSSY_STONE_BRICKS)));
   public static final Block POLISHED_DIORITE_SLAB = register("polished_diorite_slab", new SlabBlock(AbstractBlock.Properties.method26613(POLISHED_DIORITE)));
   public static final Block MOSSY_COBBLESTONE_SLAB = register("mossy_cobblestone_slab", new SlabBlock(AbstractBlock.Properties.method26613(MOSSY_COBBLESTONE)));
   public static final Block END_STONE_BRICK_SLAB = register("end_stone_brick_slab", new SlabBlock(AbstractBlock.Properties.method26613(END_STONE_BRICKS)));
   public static final Block SMOOTH_SANDSTONE_SLAB = register("smooth_sandstone_slab", new SlabBlock(AbstractBlock.Properties.method26613(SMOOTH_SANDSTONE)));
   public static final Block SMOOTH_QUARTZ_SLAB = register("smooth_quartz_slab", new SlabBlock(AbstractBlock.Properties.method26613(SMOOTH_QUARTZ)));
   public static final Block GRANITE_SLAB = register("granite_slab", new SlabBlock(AbstractBlock.Properties.method26613(GRANITE)));
   public static final Block ANDESITE_SLAB = register("andesite_slab", new SlabBlock(AbstractBlock.Properties.method26613(ANDESITE)));
   public static final Block RED_NETHER_BRICK_SLAB = register("red_nether_brick_slab", new SlabBlock(AbstractBlock.Properties.method26613(RED_NETHER_BRICKS)));
   public static final Block POLISHED_ANDESITE_SLAB = register("polished_andesite_slab", new SlabBlock(AbstractBlock.Properties.method26613(POLISHED_ANDESITE)));
   public static final Block DIORITE_SLAB = register("diorite_slab", new SlabBlock(AbstractBlock.Properties.method26613(DIORITE)));
   public static final Block BRICK_WALL = register("brick_wall", new WallBlock(AbstractBlock.Properties.method26613(BRICKS)));
   public static final Block PRISMARINE_WALL = register("prismarine_wall", new WallBlock(AbstractBlock.Properties.method26613(PRISMARINE)));
   public static final Block RED_SANDSTONE_WALL = register("red_sandstone_wall", new WallBlock(AbstractBlock.Properties.method26613(RED_SANDSTONE)));
   public static final Block MOSSY_STONE_BRICK_WALL = register("mossy_stone_brick_wall", new WallBlock(AbstractBlock.Properties.method26613(MOSSY_STONE_BRICKS)));
   public static final Block GRANITE_WALL = register("granite_wall", new WallBlock(AbstractBlock.Properties.method26613(GRANITE)));
   public static final Block STONE_BRICK_WALL = register("stone_brick_wall", new WallBlock(AbstractBlock.Properties.method26613(STONE_BRICKS)));
   public static final Block NETHER_BRICK_WALL = register("nether_brick_wall", new WallBlock(AbstractBlock.Properties.method26613(NETHER_BRICKS)));
   public static final Block ANDESITE_WALL = register("andesite_wall", new WallBlock(AbstractBlock.Properties.method26613(ANDESITE)));
   public static final Block RED_NETHER_BRICK_WALL = register("red_nether_brick_wall", new WallBlock(AbstractBlock.Properties.method26613(RED_NETHER_BRICKS)));
   public static final Block SANDSTONE_WALL = register("sandstone_wall", new WallBlock(AbstractBlock.Properties.method26613(SANDSTONE)));
   public static final Block END_STONE_BRICK_WALL = register("end_stone_brick_wall", new WallBlock(AbstractBlock.Properties.method26613(END_STONE_BRICKS)));
   public static final Block DIORITE_WALL = register("diorite_wall", new WallBlock(AbstractBlock.Properties.method26613(DIORITE)));
   public static final Block SCAFFOLDING = register(
      "scaffolding",
      new ScaffoldingBlock(AbstractBlock.Properties.withMaterialAndColor(Material.field38946, MaterialColor.field30949).method26614().sound(SoundType.SCAFFOLDING).variableOpacity())
   );
   public static final Block LOOM = register(
      "loom", new Class3478(AbstractBlock.Properties.withMaterial(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD))
   );
   public static final Block BARREL = register(
      "barrel", new Class3242(AbstractBlock.Properties.withMaterial(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD))
   );
   public static final Block SMOKER = register(
      "smoker", new Class3352(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().hardnessAndResistance(3.5F).method26620(method30011(13)))
   );
   public static final Block BLAST_FURNACE = register(
      "blast_furnace", new Class3351(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().hardnessAndResistance(3.5F).method26620(method30011(13)))
   );
   public static final Block CARTOGRAPHY_TABLE = register(
      "cartography_table", new Class3416(AbstractBlock.Properties.withMaterial(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD))
   );
   public static final Block FLETCHING_TABLE = register(
      "fletching_table", new Class3439(AbstractBlock.Properties.withMaterial(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD))
   );
   public static final Block GRINDSTONE = register(
      "grindstone",
      new Class3205(AbstractBlock.Properties.withMaterialAndColor(Material.ANVIL, MaterialColor.IRON).method26635().method26621(2.0F, 6.0F).sound(SoundType.STONE))
   );
   public static final Block LECTERN = register(
      "lectern", new Class3354(AbstractBlock.Properties.withMaterial(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD))
   );
   public static final Block SMITHING_TABLE = register(
      "smithing_table", new Class3440(AbstractBlock.Properties.withMaterial(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD))
   );
   public static final Block STONECUTTER = register(
      "stonecutter", new Class3412(AbstractBlock.Properties.withMaterial(Material.STONE).method26635().hardnessAndResistance(3.5F))
   );
   public static final Block BELL = register(
      "bell",
      new Class3369(AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.field30977).method26635().hardnessAndResistance(5.0F).sound(SoundType.ANVIL))
   );
   public static final Block LANTERN = register(
      "lantern",
      new Class3466(
         AbstractBlock.Properties.withMaterial(Material.field38967).method26635().hardnessAndResistance(3.5F).sound(SoundType.LANTERN).method26620(var0 -> 15).notSolid()
      )
   );
   public static final Block SOUL_LANTERN = register(
      "soul_lantern",
      new Class3466(
         AbstractBlock.Properties.withMaterial(Material.field38967).method26635().hardnessAndResistance(3.5F).sound(SoundType.LANTERN).method26620(var0 -> 10).notSolid()
      )
   );
   public static final Block CAMPFIRE = register(
      "campfire",
      new Class3244(
         true,
         1,
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.PODZOL)
            .hardnessAndResistance(2.0F)
            .sound(SoundType.WOOD)
            .method26620(method30011(15))
            .notSolid()
      )
   );
   public static final Block SOUL_CAMPFIRE = register(
      "soul_campfire",
      new Class3244(
         false,
         2,
         AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.PODZOL)
            .hardnessAndResistance(2.0F)
            .sound(SoundType.WOOD)
            .method26620(method30011(10))
            .notSolid()
      )
   );
   public static final Block SWEET_BERRY_BUSH = register(
      "sweet_berry_bush", new Class3484(AbstractBlock.Properties.withMaterial(Material.PLANTS).tickRandomly().method26614().sound(SoundType.SWEET_BERRY_BUSH))
   );
   public static final Block WARPED_STEM = register("warped_stem", createRotatableNetherBlock(MaterialColor.field31003));
   public static final Block STRIPPED_WARPED_STEM = register("stripped_warped_stem", createRotatableNetherBlock(MaterialColor.field31003));
   public static final Block WARPED_HYPHAE = register(
      "warped_hyphae", new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, MaterialColor.field31004).hardnessAndResistance(2.0F).sound(SoundType.STEM))
   );
   public static final Block STRIPPED_WARPED_HYPHAE = register(
      "stripped_warped_hyphae",
      new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, MaterialColor.field31004).hardnessAndResistance(2.0F).sound(SoundType.STEM))
   );
   public static final Block WARPED_NYLIUM = register(
      "warped_nylium",
      new Class3219(
         AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field31002).method26635().hardnessAndResistance(0.4F).sound(SoundType.NYLIUM).tickRandomly()
      )
   );
   public static final Block WARPED_FUNGUS = register(
      "warped_fungus",
      new Class3485(
         AbstractBlock.Properties.withMaterialAndColor(Material.PLANTS, MaterialColor.field30970).method26622().method26614().sound(SoundType.FUNGUS),
         () -> Features.field41767
      )
   );
   public static final Block WARPED_WART_BLOCK = register(
      "warped_wart_block", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.GRASS, MaterialColor.field31005).hardnessAndResistance(1.0F).sound(SoundType.NETHERRACK))
   );
   public static final Block WARPED_ROOTS = register(
      "warped_roots",
      new Class3495(AbstractBlock.Properties.withMaterialAndColor(Material.field38939, MaterialColor.field30970).method26614().method26622().sound(SoundType.ROOTS))
   );
   public static final Block NETHER_SPROUTS = register(
      "nether_sprouts",
      new Class3488(AbstractBlock.Properties.withMaterialAndColor(Material.field38939, MaterialColor.field30970).method26614().method26622().sound(SoundType.NETHER_ORE))
   );
   public static final Block CRIMSON_STEM = register("crimson_stem", createRotatableNetherBlock(MaterialColor.field31000));
   public static final Block STRIPPED_CRIMSON_STEM = register("stripped_crimson_stem", createRotatableNetherBlock(MaterialColor.field31000));
   public static final Block CRIMSON_HYPHAE = register(
      "crimson_hyphae", new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, MaterialColor.field31001).hardnessAndResistance(2.0F).sound(SoundType.STEM))
   );
   public static final Block STRIPPED_CRIMSON_HYPHAE = register(
      "stripped_crimson_hyphae",
      new RotatedPillarBlock(AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, MaterialColor.field31001).hardnessAndResistance(2.0F).sound(SoundType.STEM))
   );
   public static final Block CRIMSON_NYLIUM = register(
      "crimson_nylium",
      new Class3219(
         AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30999).method26635().hardnessAndResistance(0.4F).sound(SoundType.NYLIUM).tickRandomly()
      )
   );
   public static final Block CRIMSON_FUNGUS = register(
      "crimson_fungus",
      new Class3485(
         AbstractBlock.Properties.withMaterialAndColor(Material.PLANTS, MaterialColor.field30982).method26622().method26614().sound(SoundType.FUNGUS),
         () -> Features.field41765
      )
   );
   public static final Block SHROOMLIGHT = register(
      "shroomlight",
      new Block(
         AbstractBlock.Properties.withMaterialAndColor(Material.GRASS, MaterialColor.field30975).hardnessAndResistance(1.0F).sound(SoundType.WEEPING_VINES).method26620(var0 -> 15)
      )
   );
   public static final Block WEEPING_VINES = register(
      "weeping_vines",
      new Class3454(
         AbstractBlock.Properties.withMaterialAndColor(Material.PLANTS, MaterialColor.field30982).tickRandomly().method26614().method26622().sound(SoundType.TWISTING_VINES)
      )
   );
   public static final Block WEEPING_VINES_PLANT = register(
      "weeping_vines_plant",
      new Class3446(AbstractBlock.Properties.withMaterialAndColor(Material.PLANTS, MaterialColor.field30982).method26614().method26622().sound(SoundType.TWISTING_VINES))
   );
   public static final Block TWISTING_VINES = register(
      "twisting_vines",
      new Class3453(
         AbstractBlock.Properties.withMaterialAndColor(Material.PLANTS, MaterialColor.field30970).tickRandomly().method26614().method26622().sound(SoundType.TWISTING_VINES)
      )
   );
   public static final Block TWISTING_VINES_PLANT = register(
      "twisting_vines_plant",
      new Class3447(AbstractBlock.Properties.withMaterialAndColor(Material.PLANTS, MaterialColor.field30970).method26614().method26622().sound(SoundType.TWISTING_VINES))
   );
   public static final Block CRIMSON_ROOTS = register(
      "crimson_roots",
      new Class3495(AbstractBlock.Properties.withMaterialAndColor(Material.field38939, MaterialColor.field30982).method26614().method26622().sound(SoundType.ROOTS))
   );
   public static final Block CRIMSON_PLANKS = register(
      "crimson_planks",
      new Block(AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, MaterialColor.field31000).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block WARPED_PLANKS = register(
      "warped_planks",
      new Block(AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, MaterialColor.field31003).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block CRIMSON_SLAB = register(
      "crimson_slab",
      new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, CRIMSON_PLANKS.getColor()).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block WARPED_SLAB = register(
      "warped_slab",
      new SlabBlock(AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, WARPED_PLANKS.getColor()).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block CRIMSON_PRESSURE_PLATE = register(
      "crimson_pressure_plate",
      new PressurePlateBlock(
         Class2275.field14823,
         AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, CRIMSON_PLANKS.getColor()).method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD)
      )
   );
   public static final Block WARPED_PRESSURE_PLATE = register(
      "warped_pressure_plate",
      new PressurePlateBlock(
         Class2275.field14823,
         AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, WARPED_PLANKS.getColor()).method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD)
      )
   );
   public static final Block CRIMSON_FENCE = register(
      "crimson_fence",
      new FenceBlock(AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, CRIMSON_PLANKS.getColor()).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block WARPED_FENCE = register(
      "warped_fence",
      new FenceBlock(AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, WARPED_PLANKS.getColor()).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block CRIMSON_TRAPDOOR = register(
      "crimson_trapdoor",
      new TrapDoorBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, CRIMSON_PLANKS.getColor())
            .hardnessAndResistance(3.0F)
            .sound(SoundType.WOOD)
            .notSolid()
            .setAllowsSpawn(Blocks::neverAllowSpawn)
      )
   );
   public static final Block WARPED_TRAPDOOR = register(
      "warped_trapdoor",
      new TrapDoorBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, WARPED_PLANKS.getColor())
            .hardnessAndResistance(3.0F)
            .sound(SoundType.WOOD)
            .notSolid()
            .setAllowsSpawn(Blocks::neverAllowSpawn)
      )
   );
   public static final Block CRIMSON_FENCE_GATE = register(
      "crimson_fence_gate",
      new FenceGateBlock(AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, CRIMSON_PLANKS.getColor()).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block WARPED_FENCE_GATE = register(
      "warped_fence_gate",
      new FenceGateBlock(AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, WARPED_PLANKS.getColor()).method26621(2.0F, 3.0F).sound(SoundType.WOOD))
   );
   public static final Block CRIMSON_STAIRS = register("crimson_stairs", new StairsBlock(CRIMSON_PLANKS.getDefaultState(), AbstractBlock.Properties.method26613(CRIMSON_PLANKS)));
   public static final Block WARPED_STAIRS = register("warped_stairs", new StairsBlock(WARPED_PLANKS.getDefaultState(), AbstractBlock.Properties.method26613(WARPED_PLANKS)));
   public static final Block CRIMSON_BUTTON = register(
      "crimson_button", new WoodButtonBlock(AbstractBlock.Properties.withMaterial(Material.field38946).method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD))
   );
   public static final Block WARPED_BUTTON = register(
      "warped_button", new WoodButtonBlock(AbstractBlock.Properties.withMaterial(Material.field38946).method26614().hardnessAndResistance(0.5F).sound(SoundType.WOOD))
   );
   public static final Block CRIMSON_DOOR = register(
      "crimson_door",
      new DoorBlock(AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, CRIMSON_PLANKS.getColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid())
   );
   public static final Block WARPED_DOOR = register(
      "warped_door",
      new DoorBlock(AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, WARPED_PLANKS.getColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid())
   );
   public static final Block CRIMSON_SIGN = register(
      "crimson_sign",
      new SignBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, CRIMSON_PLANKS.getColor()).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD),
         Class9673.field45172
      )
   );
   public static final Block WARPED_SIGN = register(
      "warped_sign",
      new SignBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, WARPED_PLANKS.getColor()).method26614().hardnessAndResistance(1.0F).sound(SoundType.WOOD),
         Class9673.field45173
      )
   );
   public static final Block CRIMSON_WALL_SIGN = register(
      "crimson_wall_sign",
      new Class3375(
         AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, CRIMSON_PLANKS.getColor())
            .method26614()
            .hardnessAndResistance(1.0F)
            .sound(SoundType.WOOD)
            .method26627(CRIMSON_SIGN),
         Class9673.field45172
      )
   );
   public static final Block WARPED_WALL_SIGN = register(
      "warped_wall_sign",
      new Class3375(
         AbstractBlock.Properties.withMaterialAndColor(Material.NETHER_WOOD, WARPED_PLANKS.getColor())
            .method26614()
            .hardnessAndResistance(1.0F)
            .sound(SoundType.WOOD)
            .method26627(WARPED_SIGN),
         Class9673.field45173
      )
   );
   public static final Block STRUCTURE_BLOCK = register(
      "structure_block",
      new StructureBlock(AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.field30969).method26635().method26621(-1.0F, 3600000.0F).method26626())
   );
   public static final Block JIGSAW = register(
      "jigsaw", new JigsawBlock(AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.field30969).method26635().method26621(-1.0F, 3600000.0F).method26626())
   );
   public static final Block COMPOSTER = register(
      "composter", new Class3475(AbstractBlock.Properties.withMaterial(Material.WOOD).hardnessAndResistance(0.6F).sound(SoundType.WOOD))
   );
   public static final Block TARGET = register(
      "target", new Class3395(AbstractBlock.Properties.withMaterialAndColor(Material.GRASS, MaterialColor.DIORITE).hardnessAndResistance(0.5F).sound(SoundType.GRASS))
   );
   public static final Block BEE_NEST = register(
      "bee_nest", new Class3366(AbstractBlock.Properties.withMaterialAndColor(Material.WOOD, MaterialColor.field30965).hardnessAndResistance(0.3F).sound(SoundType.WOOD))
   );
   public static final Block BEEHIVE = register(
      "beehive", new Class3366(AbstractBlock.Properties.withMaterial(Material.WOOD).hardnessAndResistance(0.6F).sound(SoundType.WOOD))
   );
   public static final Block HONEY_BLOCK = register(
      "honey_block",
      new HoneyBlock(
         AbstractBlock.Properties.withMaterialAndColor(Material.field38949, MaterialColor.field30962).method26617(0.4F).method26618(0.5F).notSolid().sound(SoundType.HONEY)
      )
   );
   public static final Block HONEYCOMB_BLOCK = register(
      "honeycomb_block", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.field38949, MaterialColor.field30962).hardnessAndResistance(0.6F).sound(SoundType.CORAL))
   );
   public static final Block NETHERITE_BLOCK = register(
      "netherite_block",
      new Block(
         AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.field30976).method26635().method26621(50.0F, 1200.0F).sound(SoundType.ANCIENT_DEBRIS)
      )
   );
   public static final Block ANCIENT_DEBRIS = register(
      "ancient_debris",
      new Block(
         AbstractBlock.Properties.withMaterialAndColor(Material.field38967, MaterialColor.field30976).method26635().method26621(30.0F, 1200.0F).sound(SoundType.LODESTONE)
      )
   );
   public static final Block CRYING_OBSIDIAN = register(
      "crying_obsidian",
      new Class3427(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30976).method26635().method26621(50.0F, 1200.0F).method26620(var0 -> 10))
   );
   public static final Block RESPAWN_ANCHOR = register(
      "respawn_anchor",
      new Class3389(
         AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30976)
            .method26635()
            .method26621(50.0F, 1200.0F)
            .method26620(var0 -> Class3389.method11990(var0, 15))
      )
   );
   public static final Block POTTED_CRIMSON_FUNGUS = register(
      "potted_crimson_fungus", new PottedWarpedRoots(CRIMSON_FUNGUS, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_WARPED_FUNGUS = register(
      "potted_warped_fungus", new PottedWarpedRoots(WARPED_FUNGUS, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_CRIMSON_ROOTS = register(
      "potted_crimson_roots", new PottedWarpedRoots(CRIMSON_ROOTS, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block POTTED_WARPED_ROOTS = register(
      "potted_warped_roots", new PottedWarpedRoots(WARPED_ROOTS, AbstractBlock.Properties.withMaterial(Material.field38946).method26622().notSolid())
   );
   public static final Block LODESTONE = register(
      "lodestone", new Block(AbstractBlock.Properties.withMaterial(Material.ANVIL).method26635().hardnessAndResistance(3.5F).sound(SoundType.CHAIN))
   );
   public static final Block BLACKSTONE = register(
      "blackstone", new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30976).method26635().method26621(1.5F, 6.0F))
   );
   public static final Block BLACKSTONE_STAIRS = register("blackstone_stairs", new StairsBlock(BLACKSTONE.getDefaultState(), AbstractBlock.Properties.method26613(BLACKSTONE)));
   public static final Block BLACKSTONE_WALL = register("blackstone_wall", new WallBlock(AbstractBlock.Properties.method26613(BLACKSTONE)));
   public static final Block BLACKSTONE_SLAB = register("blackstone_slab", new SlabBlock(AbstractBlock.Properties.method26613(BLACKSTONE).method26621(2.0F, 6.0F)));
   public static final Block POLISHED_BLACKSTONE = register("polished_blackstone", new Block(AbstractBlock.Properties.method26613(BLACKSTONE).method26621(2.0F, 6.0F)));
   public static final Block POLISHED_BLACKSTONE_BRICKS = register(
      "polished_blackstone_bricks", new Block(AbstractBlock.Properties.method26613(POLISHED_BLACKSTONE).method26621(1.5F, 6.0F))
   );
   public static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS = register("cracked_polished_blackstone_bricks", new Block(AbstractBlock.Properties.method26613(POLISHED_BLACKSTONE_BRICKS)));
   public static final Block CHISELED_POLISHED_BLACKSTONE = register(
      "chiseled_polished_blackstone", new Block(AbstractBlock.Properties.method26613(POLISHED_BLACKSTONE).method26621(1.5F, 6.0F))
   );
   public static final Block POLISHED_BLACKSTONE_BRICK_SLAB = register(
      "polished_blackstone_brick_slab", new SlabBlock(AbstractBlock.Properties.method26613(POLISHED_BLACKSTONE_BRICKS).method26621(2.0F, 6.0F))
   );
   public static final Block POLISHED_BLACKSTONE_BRICK_STAIRS = register(
      "polished_blackstone_brick_stairs", new StairsBlock(POLISHED_BLACKSTONE_BRICKS.getDefaultState(), AbstractBlock.Properties.method26613(POLISHED_BLACKSTONE_BRICKS))
   );
   public static final Block POLISHED_BLACKSTONE_BRICK_WALL = register("polished_blackstone_brick_wall", new WallBlock(AbstractBlock.Properties.method26613(POLISHED_BLACKSTONE_BRICKS)));
   public static final Block GILDED_BLACKSTONE = register(
      "gilded_blackstone", new Block(AbstractBlock.Properties.method26613(BLACKSTONE).sound(SoundType.field36246))
   );
   public static final Block POLISHED_BLACKSTONE_STAIRS = register(
      "polished_blackstone_stairs", new StairsBlock(POLISHED_BLACKSTONE.getDefaultState(), AbstractBlock.Properties.method26613(POLISHED_BLACKSTONE))
   );
   public static final Block POLISHED_BLACKSTONE_SLAB = register("polished_blackstone_slab", new SlabBlock(AbstractBlock.Properties.method26613(POLISHED_BLACKSTONE)));
   public static final Block POLISHED_BLACKSTONE_PRESSURE_PLATE = register(
      "polished_blackstone_pressure_plate",
      new PressurePlateBlock(Class2275.field14824, AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30976).method26635().method26614().hardnessAndResistance(0.5F))
   );
   public static final Block POLISHED_BLACKSTONE_BUTTON = register(
      "polished_blackstone_button", new StoneButtonBlock(AbstractBlock.Properties.withMaterial(Material.field38946).method26614().hardnessAndResistance(0.5F))
   );
   public static final Block POLISHED_BLACKSTONE_WALL = register("polished_blackstone_wall", new WallBlock(AbstractBlock.Properties.method26613(POLISHED_BLACKSTONE)));
   public static final Block CHISELED_NETHER_BRICKS = register(
      "chiseled_nether_bricks",
      new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30982).method26635().method26621(2.0F, 6.0F).sound(SoundType.NETHER_SPROUTS))
   );
   public static final Block CRACKED_NETHER_BRICKS = register(
      "cracked_nether_bricks",
      new Block(AbstractBlock.Properties.withMaterialAndColor(Material.STONE, MaterialColor.field30982).method26635().method26621(2.0F, 6.0F).sound(SoundType.NETHER_SPROUTS))
   );
   public static final Block QUARTZ_BRICKS = register("quartz_bricks", new Block(AbstractBlock.Properties.method26613(QUARTZ_BLOCK)));

   private static ToIntFunction<BlockState> method30011(int var0) {
      return var1 -> !var1.get(BlockStateProperties.LIT) ? 0 : var0;
   }

   private static Boolean neverAllowSpawn(BlockState state, IBlockReader reader, BlockPos pos, EntityType<?> type) {
      return false;
   }

   private static Boolean alwaysAllowSpawn(BlockState state, IBlockReader reader, BlockPos pos, EntityType<?> type) {
      return true;
   }

   private static Boolean allowSpawnOnLeaves(BlockState state, IBlockReader reader, BlockPos pos, EntityType<?> type) {
      return type == EntityType.OCELOT || type == EntityType.PARROT;
   }

   private static BedBlock createBedFromColor(DyeColor color) {
      return new BedBlock(
         color,
         AbstractBlock.Properties.create(
               Material.WOOL, state -> state.get(BedBlock.PART) != BedPart.FOOT ? MaterialColor.WOOL : color.method312()
            )
            .sound(SoundType.WOOD)
            .hardnessAndResistance(0.2F)
            .notSolid()
      );
   }

   private static RotatedPillarBlock createLogBlock(MaterialColor topColor, MaterialColor barkColor) {
      return new RotatedPillarBlock(
         AbstractBlock.Properties.create(Material.WOOD, var2 -> var2.get(RotatedPillarBlock.AXIS) != Direction.Axis.Y ? barkColor : topColor)
            .hardnessAndResistance(2.0F)
            .sound(SoundType.WOOD)
      );
   }

   private static Block createRotatableNetherBlock(MaterialColor materialColor) {
      return new RotatedPillarBlock(AbstractBlock.Properties.create(Material.NETHER_WOOD, state -> materialColor).hardnessAndResistance(2.0F).sound(SoundType.STEM));
   }

   private static boolean needsPostProcessing(BlockState state, IBlockReader reader, BlockPos pos) {
      return true;
   }

   private static boolean isntSolid(BlockState state, IBlockReader reader, BlockPos pos) {
      return false;
   }

   private static StainedGlassBlock createStainedGlassFromColor(DyeColor color) {
      return new StainedGlassBlock(
         color,
         AbstractBlock.Properties.method26610(Material.field38963, color)
            .hardnessAndResistance(0.3F)
            .sound(SoundType.GLASS)
            .notSolid()
            .setAllowsSpawn(Blocks::neverAllowSpawn)
            .setOpaque(Blocks::isntSolid)
            .setSuffocates(Blocks::isntSolid)
            .setBlocksVision(Blocks::isntSolid)
      );
   }

   private static LeavesBlock createLeavesBlock() {
      return new LeavesBlock(
         AbstractBlock.Properties.withMaterial(Material.field38962)
            .hardnessAndResistance(0.2F)
            .tickRandomly()
            .sound(SoundType.GRASS)
            .notSolid()
            .setAllowsSpawn(Blocks::allowSpawnOnLeaves)
            .setSuffocates(Blocks::isntSolid)
            .setBlocksVision(Blocks::isntSolid)
      );
   }

   private static ShulkerBoxBlock createShulkerBoxFromColorAndProperties(DyeColor color, AbstractBlock.Properties properties) {
      AbstractBlock$IPositionPredicate predicate = (var0x, var1x, var2) -> {
         TileEntity var5 = var1x.getTileEntity(var2);
         if (var5 instanceof Class940) {
            Class940 var6 = (Class940)var5;
            return var6.method3757();
         } else {
            return true;
         }
      };
      return new ShulkerBoxBlock(color, properties.hardnessAndResistance(2.0F).variableOpacity().notSolid().setSuffocates(predicate).setBlocksVision(predicate));
   }

   private static PistonBlock createPiston(boolean sticky) {
      AbstractBlock$IPositionPredicate var3 = (var0x, var1, var2) -> !var0x.<Boolean>get(PistonBlock.field19202);
      return new PistonBlock(
         sticky, AbstractBlock.Properties.withMaterial(Material.PISTON).hardnessAndResistance(1.5F).setOpaque(Blocks::isntSolid).setSuffocates(var3).setBlocksVision(var3)
      );
   }

   private static Block register(String key, Block block) {
      return Registry.register(Registry.BLOCK, key, block);
   }

   public static void cacheBlockStates() {
      Block.BLOCK_STATE_IDS.forEach(AbstractBlock.AbstractBlockState::cacheState);
   }

   static {
      for (Block block : Registry.BLOCK) {
         for (BlockState blockstate : block.getStateContainer().getValidStates())
         {
            Block.BLOCK_STATE_IDS.add(blockstate);
         }

         block.getLootTable();
      }
   }
}
