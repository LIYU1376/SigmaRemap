package mapped;

import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Objects;
import java.util.function.Consumer;

public class Class4447 implements Class4442 {
   private static final Logger field21616 = LogManager.getLogger();
   private static final Gson field21617 = new GsonBuilder().setPrettyPrinting().create();
   private final Class9068 field21618;

   public Class4447(Class9068 var1) {
      this.field21618 = var1;
   }

   @Override
   public void method14013(Class8297 var1) throws IOException {
      Path var4 = this.field21618.method33776();
      HashSet var5 = Sets.newHashSet();
      method14047(
         var3 -> {
            if (var5.add(var3.method14634())) {
               method14045(
                  var1, var3.method14637(), var4.resolve("data/" + var3.method14634().getNamespace() + "/recipes/" + var3.method14634().getPath() + ".json")
               );
               JsonObject var6 = var3.method14635();
               if (var6 != null) {
                  method14046(
                     var1, var6, var4.resolve("data/" + var3.method14634().getNamespace() + "/advancements/" + var3.method14636().getPath() + ".json")
                  );
               }
            } else {
               throw new IllegalStateException("Duplicate recipe " + var3.method14634());
            }
         }
      );
      method14046(
         var1, Class7999.method27304().method27312("impossible", new Class4478()).method27318(), var4.resolve("data/minecraft/advancements/recipes/root.json")
      );
   }

   private static void method14045(Class8297 var0, JsonObject var1, Path var2) {
      try {
         String var5 = field21617.toJson(var1);
         String var6 = field21602.hashUnencodedChars(var5).toString();
         if (!Objects.equals(var0.method29001(var2), var6) || !Files.exists(var2)) {
            Files.createDirectories(var2.getParent());

            try (BufferedWriter var7 = Files.newBufferedWriter(var2)) {
               var7.write(var5);
            }
         }

         var0.method29002(var2, var6);
      } catch (IOException var20) {
         field21616.error("Couldn't save recipe {}", var2, var20);
      }
   }

   private static void method14046(Class8297 var0, JsonObject var1, Path var2) {
      try {
         String var5 = field21617.toJson(var1);
         String var6 = field21602.hashUnencodedChars(var5).toString();
         if (!Objects.equals(var0.method29001(var2), var6) || !Files.exists(var2)) {
            Files.createDirectories(var2.getParent());

            try (BufferedWriter var7 = Files.newBufferedWriter(var2)) {
               var7.write(var5);
            }
         }

         var0.method29002(var2, var6);
      } catch (IOException var20) {
         field21616.error("Couldn't save recipe advancement {}", var2, var20);
      }
   }

   private static void method14047(Consumer<Class4664> var0) {
      method14049(var0, Blocks.ACACIA_PLANKS, ItemTags.field26089);
      method14050(var0, Blocks.BIRCH_PLANKS, ItemTags.field26088);
      method14050(var0, Blocks.CRIMSON_PLANKS, ItemTags.field26092);
      method14049(var0, Blocks.DARK_OAK_PLANKS, ItemTags.field26086);
      method14050(var0, Blocks.JUNGLE_PLANKS, ItemTags.field26090);
      method14050(var0, Blocks.OAK_PLANKS, ItemTags.field26087);
      method14050(var0, Blocks.SPRUCE_PLANKS, ItemTags.field26091);
      method14050(var0, Blocks.WARPED_PLANKS, ItemTags.field26093);
      method14051(var0, Blocks.ACACIA_WOOD, Blocks.ACACIA_LOG);
      method14051(var0, Blocks.BIRCH_WOOD, Blocks.BIRCH_LOG);
      method14051(var0, Blocks.DARK_OAK_WOOD, Blocks.DARK_OAK_LOG);
      method14051(var0, Blocks.JUNGLE_WOOD, Blocks.JUNGLE_LOG);
      method14051(var0, Blocks.OAK_WOOD, Blocks.OAK_LOG);
      method14051(var0, Blocks.SPRUCE_WOOD, Blocks.SPRUCE_LOG);
      method14051(var0, Blocks.CRIMSON_HYPHAE, Blocks.CRIMSON_STEM);
      method14051(var0, Blocks.WARPED_HYPHAE, Blocks.WARPED_STEM);
      method14051(var0, Blocks.STRIPPED_ACACIA_WOOD, Blocks.STRIPPED_ACACIA_LOG);
      method14051(var0, Blocks.STRIPPED_BIRCH_WOOD, Blocks.STRIPPED_BIRCH_LOG);
      method14051(var0, Blocks.STRIPPED_DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_LOG);
      method14051(var0, Blocks.STRIPPED_JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_LOG);
      method14051(var0, Blocks.STRIPPED_OAK_WOOD, Blocks.STRIPPED_OAK_LOG);
      method14051(var0, Blocks.STRIPPED_SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_LOG);
      method14051(var0, Blocks.STRIPPED_CRIMSON_HYPHAE, Blocks.STRIPPED_CRIMSON_STEM);
      method14051(var0, Blocks.STRIPPED_WARPED_HYPHAE, Blocks.STRIPPED_WARPED_STEM);
      method14052(var0, Items.field38124, Blocks.ACACIA_PLANKS);
      method14052(var0, Items.field38122, Blocks.BIRCH_PLANKS);
      method14052(var0, Items.field38125, Blocks.DARK_OAK_PLANKS);
      method14052(var0, Items.field38123, Blocks.JUNGLE_PLANKS);
      method14052(var0, Items.OAK_BOAT, Blocks.OAK_PLANKS);
      method14052(var0, Items.field38121, Blocks.SPRUCE_PLANKS);
      method14053(var0, Blocks.ACACIA_BUTTON, Blocks.ACACIA_PLANKS);
      method14054(var0, Blocks.ACACIA_DOOR, Blocks.ACACIA_PLANKS);
      method14055(var0, Blocks.ACACIA_FENCE, Blocks.ACACIA_PLANKS);
      method14056(var0, Blocks.ACACIA_FENCE_GATE, Blocks.ACACIA_PLANKS);
      method14057(var0, Blocks.ACACIA_PRESSURE_PLATE, Blocks.ACACIA_PLANKS);
      method14058(var0, Blocks.ACACIA_SLAB, Blocks.ACACIA_PLANKS);
      method14059(var0, Blocks.ACACIA_STAIRS, Blocks.ACACIA_PLANKS);
      method14060(var0, Blocks.ACACIA_TRAPDOOR, Blocks.ACACIA_PLANKS);
      method14061(var0, Blocks.ACACIA_SIGN, Blocks.ACACIA_PLANKS);
      method14053(var0, Blocks.BIRCH_BUTTON, Blocks.BIRCH_PLANKS);
      method14054(var0, Blocks.BIRCH_DOOR, Blocks.BIRCH_PLANKS);
      method14055(var0, Blocks.BIRCH_FENCE, Blocks.BIRCH_PLANKS);
      method14056(var0, Blocks.BIRCH_FENCE_GATE, Blocks.BIRCH_PLANKS);
      method14057(var0, Blocks.BIRCH_PRESSURE_PLATE, Blocks.BIRCH_PLANKS);
      method14058(var0, Blocks.BIRCH_SLAB, Blocks.BIRCH_PLANKS);
      method14059(var0, Blocks.BIRCH_STAIRS, Blocks.BIRCH_PLANKS);
      method14060(var0, Blocks.BIRCH_TRAPDOOR, Blocks.BIRCH_PLANKS);
      method14061(var0, Blocks.BIRCH_SIGN, Blocks.BIRCH_PLANKS);
      method14053(var0, Blocks.CRIMSON_BUTTON, Blocks.CRIMSON_PLANKS);
      method14054(var0, Blocks.CRIMSON_DOOR, Blocks.CRIMSON_PLANKS);
      method14055(var0, Blocks.CRIMSON_FENCE, Blocks.CRIMSON_PLANKS);
      method14056(var0, Blocks.CRIMSON_FENCE_GATE, Blocks.CRIMSON_PLANKS);
      method14057(var0, Blocks.CRIMSON_PRESSURE_PLATE, Blocks.CRIMSON_PLANKS);
      method14058(var0, Blocks.CRIMSON_SLAB, Blocks.CRIMSON_PLANKS);
      method14059(var0, Blocks.CRIMSON_STAIRS, Blocks.CRIMSON_PLANKS);
      method14060(var0, Blocks.CRIMSON_TRAPDOOR, Blocks.CRIMSON_PLANKS);
      method14061(var0, Blocks.CRIMSON_SIGN, Blocks.CRIMSON_PLANKS);
      method14053(var0, Blocks.DARK_OAK_BUTTON, Blocks.DARK_OAK_PLANKS);
      method14054(var0, Blocks.DARK_OAK_DOOR, Blocks.DARK_OAK_PLANKS);
      method14055(var0, Blocks.DARK_OAK_FENCE, Blocks.DARK_OAK_PLANKS);
      method14056(var0, Blocks.DARK_OAK_FENCE_GATE, Blocks.DARK_OAK_PLANKS);
      method14057(var0, Blocks.DARK_OAK_PRESSURE_PLATE, Blocks.DARK_OAK_PLANKS);
      method14058(var0, Blocks.DARK_OAK_SLAB, Blocks.DARK_OAK_PLANKS);
      method14059(var0, Blocks.DARK_OAK_STAIRS, Blocks.DARK_OAK_PLANKS);
      method14060(var0, Blocks.DARK_OAK_TRAPDOOR, Blocks.DARK_OAK_PLANKS);
      method14061(var0, Blocks.DARK_OAK_SIGN, Blocks.DARK_OAK_PLANKS);
      method14053(var0, Blocks.JUNGLE_BUTTON, Blocks.JUNGLE_PLANKS);
      method14054(var0, Blocks.JUNGLE_DOOR, Blocks.JUNGLE_PLANKS);
      method14055(var0, Blocks.JUNGLE_FENCE, Blocks.JUNGLE_PLANKS);
      method14056(var0, Blocks.JUNGLE_FENCE_GATE, Blocks.JUNGLE_PLANKS);
      method14057(var0, Blocks.JUNGLE_PRESSURE_PLATE, Blocks.JUNGLE_PLANKS);
      method14058(var0, Blocks.JUNGLE_SLAB, Blocks.JUNGLE_PLANKS);
      method14059(var0, Blocks.JUNGLE_STAIRS, Blocks.JUNGLE_PLANKS);
      method14060(var0, Blocks.JUNGLE_TRAPDOOR, Blocks.JUNGLE_PLANKS);
      method14061(var0, Blocks.JUNGLE_SIGN, Blocks.JUNGLE_PLANKS);
      method14053(var0, Blocks.OAK_BUTTON, Blocks.OAK_PLANKS);
      method14054(var0, Blocks.OAK_DOOR, Blocks.OAK_PLANKS);
      method14055(var0, Blocks.OAK_FENCE, Blocks.OAK_PLANKS);
      method14056(var0, Blocks.OAK_FENCE_GATE, Blocks.OAK_PLANKS);
      method14057(var0, Blocks.OAK_PRESSURE_PLATE, Blocks.OAK_PLANKS);
      method14058(var0, Blocks.OAK_SLAB, Blocks.OAK_PLANKS);
      method14059(var0, Blocks.OAK_STAIRS, Blocks.OAK_PLANKS);
      method14060(var0, Blocks.OAK_TRAPDOOR, Blocks.OAK_PLANKS);
      method14061(var0, Blocks.OAK_SIGN, Blocks.OAK_PLANKS);
      method14053(var0, Blocks.SPRUCE_BUTTON, Blocks.SPRUCE_PLANKS);
      method14054(var0, Blocks.SPRUCE_DOOR, Blocks.SPRUCE_PLANKS);
      method14055(var0, Blocks.SPRUCE_FENCE, Blocks.SPRUCE_PLANKS);
      method14056(var0, Blocks.SPRUCE_FENCE_GATE, Blocks.SPRUCE_PLANKS);
      method14057(var0, Blocks.SPRUCE_PRESSURE_PLATE, Blocks.SPRUCE_PLANKS);
      method14058(var0, Blocks.SPRUCE_SLAB, Blocks.SPRUCE_PLANKS);
      method14059(var0, Blocks.SPRUCE_STAIRS, Blocks.SPRUCE_PLANKS);
      method14060(var0, Blocks.SPRUCE_TRAPDOOR, Blocks.SPRUCE_PLANKS);
      method14061(var0, Blocks.SPRUCE_SIGN, Blocks.SPRUCE_PLANKS);
      method14053(var0, Blocks.WARPED_BUTTON, Blocks.WARPED_PLANKS);
      method14054(var0, Blocks.WARPED_DOOR, Blocks.WARPED_PLANKS);
      method14055(var0, Blocks.WARPED_FENCE, Blocks.WARPED_PLANKS);
      method14056(var0, Blocks.WARPED_FENCE_GATE, Blocks.WARPED_PLANKS);
      method14057(var0, Blocks.WARPED_PRESSURE_PLATE, Blocks.WARPED_PLANKS);
      method14058(var0, Blocks.WARPED_SLAB, Blocks.WARPED_PLANKS);
      method14059(var0, Blocks.WARPED_STAIRS, Blocks.WARPED_PLANKS);
      method14060(var0, Blocks.WARPED_TRAPDOOR, Blocks.WARPED_PLANKS);
      method14061(var0, Blocks.WARPED_SIGN, Blocks.WARPED_PLANKS);
      method14062(var0, Blocks.BLACK_WOOL, Items.field37933);
      method14063(var0, Blocks.BLACK_CARPET, Blocks.BLACK_WOOL);
      method14064(var0, Blocks.BLACK_CARPET, Items.field37933);
      method14065(var0, Items.field37953, Blocks.BLACK_WOOL);
      method14066(var0, Items.field37953, Items.field37933);
      method14067(var0, Items.field38107, Blocks.BLACK_WOOL);
      method14062(var0, Blocks.BLUE_WOOL, Items.field37929);
      method14063(var0, Blocks.BLUE_CARPET, Blocks.BLUE_WOOL);
      method14064(var0, Blocks.BLUE_CARPET, Items.field37929);
      method14065(var0, Items.field37949, Blocks.BLUE_WOOL);
      method14066(var0, Items.field37949, Items.field37929);
      method14067(var0, Items.field38103, Blocks.BLUE_WOOL);
      method14062(var0, Blocks.BROWN_WOOL, Items.field37930);
      method14063(var0, Blocks.BROWN_CARPET, Blocks.BROWN_WOOL);
      method14064(var0, Blocks.BROWN_CARPET, Items.field37930);
      method14065(var0, Items.field37950, Blocks.BROWN_WOOL);
      method14066(var0, Items.field37950, Items.field37930);
      method14067(var0, Items.field38104, Blocks.BROWN_WOOL);
      method14062(var0, Blocks.CYAN_WOOL, Items.field37927);
      method14063(var0, Blocks.CYAN_CARPET, Blocks.CYAN_WOOL);
      method14064(var0, Blocks.CYAN_CARPET, Items.field37927);
      method14065(var0, Items.field37947, Blocks.CYAN_WOOL);
      method14066(var0, Items.field37947, Items.field37927);
      method14067(var0, Items.field38101, Blocks.CYAN_WOOL);
      method14062(var0, Blocks.GRAY_WOOL, Items.field37925);
      method14063(var0, Blocks.GRAY_CARPET, Blocks.GRAY_WOOL);
      method14064(var0, Blocks.GRAY_CARPET, Items.field37925);
      method14065(var0, Items.field37945, Blocks.GRAY_WOOL);
      method14066(var0, Items.field37945, Items.field37925);
      method14067(var0, Items.field38099, Blocks.GRAY_WOOL);
      method14062(var0, Blocks.GREEN_WOOL, Items.field37931);
      method14063(var0, Blocks.GREEN_CARPET, Blocks.GREEN_WOOL);
      method14064(var0, Blocks.GREEN_CARPET, Items.field37931);
      method14065(var0, Items.field37951, Blocks.GREEN_WOOL);
      method14066(var0, Items.field37951, Items.field37931);
      method14067(var0, Items.field38105, Blocks.GREEN_WOOL);
      method14062(var0, Blocks.LIGHT_BLUE_WOOL, Items.field37921);
      method14063(var0, Blocks.LIGHT_BLUE_CARPET, Blocks.LIGHT_BLUE_WOOL);
      method14064(var0, Blocks.LIGHT_BLUE_CARPET, Items.field37921);
      method14065(var0, Items.field37941, Blocks.LIGHT_BLUE_WOOL);
      method14066(var0, Items.field37941, Items.field37921);
      method14067(var0, Items.field38095, Blocks.LIGHT_BLUE_WOOL);
      method14062(var0, Blocks.LIGHT_GRAY_WOOL, Items.field37926);
      method14063(var0, Blocks.LIGHT_GRAY_CARPET, Blocks.LIGHT_GRAY_WOOL);
      method14064(var0, Blocks.LIGHT_GRAY_CARPET, Items.field37926);
      method14065(var0, Items.field37946, Blocks.LIGHT_GRAY_WOOL);
      method14066(var0, Items.field37946, Items.field37926);
      method14067(var0, Items.field38100, Blocks.LIGHT_GRAY_WOOL);
      method14062(var0, Blocks.LIME_WOOL, Items.field37923);
      method14063(var0, Blocks.LIME_CARPET, Blocks.LIME_WOOL);
      method14064(var0, Blocks.LIME_CARPET, Items.field37923);
      method14065(var0, Items.field37943, Blocks.LIME_WOOL);
      method14066(var0, Items.field37943, Items.field37923);
      method14067(var0, Items.field38097, Blocks.LIME_WOOL);
      method14062(var0, Blocks.MAGENTA_WOOL, Items.field37920);
      method14063(var0, Blocks.MAGENTA_CARPET, Blocks.MAGENTA_WOOL);
      method14064(var0, Blocks.MAGENTA_CARPET, Items.field37920);
      method14065(var0, Items.field37940, Blocks.MAGENTA_WOOL);
      method14066(var0, Items.field37940, Items.field37920);
      method14067(var0, Items.field38094, Blocks.MAGENTA_WOOL);
      method14062(var0, Blocks.ORANGE_WOOL, Items.field37919);
      method14063(var0, Blocks.ORANGE_CARPET, Blocks.ORANGE_WOOL);
      method14064(var0, Blocks.ORANGE_CARPET, Items.field37919);
      method14065(var0, Items.field37939, Blocks.ORANGE_WOOL);
      method14066(var0, Items.field37939, Items.field37919);
      method14067(var0, Items.field38093, Blocks.ORANGE_WOOL);
      method14062(var0, Blocks.PINK_WOOL, Items.field37924);
      method14063(var0, Blocks.PINK_CARPET, Blocks.PINK_WOOL);
      method14064(var0, Blocks.PINK_CARPET, Items.field37924);
      method14065(var0, Items.field37944, Blocks.PINK_WOOL);
      method14066(var0, Items.field37944, Items.field37924);
      method14067(var0, Items.field38098, Blocks.PINK_WOOL);
      method14062(var0, Blocks.PURPLE_WOOL, Items.field37928);
      method14063(var0, Blocks.PURPLE_CARPET, Blocks.PURPLE_WOOL);
      method14064(var0, Blocks.PURPLE_CARPET, Items.field37928);
      method14065(var0, Items.field37948, Blocks.PURPLE_WOOL);
      method14066(var0, Items.field37948, Items.field37928);
      method14067(var0, Items.field38102, Blocks.PURPLE_WOOL);
      method14062(var0, Blocks.RED_WOOL, Items.field37932);
      method14063(var0, Blocks.RED_CARPET, Blocks.RED_WOOL);
      method14064(var0, Blocks.RED_CARPET, Items.field37932);
      method14065(var0, Items.field37952, Blocks.RED_WOOL);
      method14066(var0, Items.field37952, Items.field37932);
      method14067(var0, Items.field38106, Blocks.RED_WOOL);
      method14063(var0, Blocks.WHITE_CARPET, Blocks.WHITE_WOOL);
      method14065(var0, Items.field37938, Blocks.WHITE_WOOL);
      method14067(var0, Items.field38092, Blocks.WHITE_WOOL);
      method14062(var0, Blocks.YELLOW_WOOL, Items.field37922);
      method14063(var0, Blocks.YELLOW_CARPET, Blocks.YELLOW_WOOL);
      method14064(var0, Blocks.YELLOW_CARPET, Items.field37922);
      method14065(var0, Items.field37942, Blocks.YELLOW_WOOL);
      method14066(var0, Items.field37942, Items.field37922);
      method14067(var0, Items.field38096, Blocks.YELLOW_WOOL);
      method14068(var0, Blocks.BLACK_STAINED_GLASS, Items.field37933);
      method14069(var0, Blocks.BLACK_STAINED_GLASS_PANE, Blocks.BLACK_STAINED_GLASS);
      method14070(var0, Blocks.BLACK_STAINED_GLASS_PANE, Items.field37933);
      method14068(var0, Blocks.BLUE_STAINED_GLASS, Items.field37929);
      method14069(var0, Blocks.BLUE_STAINED_GLASS_PANE, Blocks.BLUE_STAINED_GLASS);
      method14070(var0, Blocks.BLUE_STAINED_GLASS_PANE, Items.field37929);
      method14068(var0, Blocks.BROWN_STAINED_GLASS, Items.field37930);
      method14069(var0, Blocks.BROWN_STAINED_GLASS_PANE, Blocks.BROWN_STAINED_GLASS);
      method14070(var0, Blocks.BROWN_STAINED_GLASS_PANE, Items.field37930);
      method14068(var0, Blocks.CYAN_STAINED_GLASS, Items.field37927);
      method14069(var0, Blocks.CYAN_STAINED_GLASS_PANE, Blocks.CYAN_STAINED_GLASS);
      method14070(var0, Blocks.CYAN_STAINED_GLASS_PANE, Items.field37927);
      method14068(var0, Blocks.GRAY_STAINED_GLASS, Items.field37925);
      method14069(var0, Blocks.GRAY_STAINED_GLASS_PANE, Blocks.GRAY_STAINED_GLASS);
      method14070(var0, Blocks.GRAY_STAINED_GLASS_PANE, Items.field37925);
      method14068(var0, Blocks.GREEN_STAINED_GLASS, Items.field37931);
      method14069(var0, Blocks.GREEN_STAINED_GLASS_PANE, Blocks.GREEN_STAINED_GLASS);
      method14070(var0, Blocks.GREEN_STAINED_GLASS_PANE, Items.field37931);
      method14068(var0, Blocks.LIGHT_BLUE_STAINED_GLASS, Items.field37921);
      method14069(var0, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, Blocks.LIGHT_BLUE_STAINED_GLASS);
      method14070(var0, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, Items.field37921);
      method14068(var0, Blocks.LIGHT_GRAY_STAINED_GLASS, Items.field37926);
      method14069(var0, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, Blocks.LIGHT_GRAY_STAINED_GLASS);
      method14070(var0, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, Items.field37926);
      method14068(var0, Blocks.LIME_STAINED_GLASS, Items.field37923);
      method14069(var0, Blocks.LIME_STAINED_GLASS_PANE, Blocks.LIME_STAINED_GLASS);
      method14070(var0, Blocks.LIME_STAINED_GLASS_PANE, Items.field37923);
      method14068(var0, Blocks.MAGENTA_STAINED_GLASS, Items.field37920);
      method14069(var0, Blocks.MAGENTA_STAINED_GLASS_PANE, Blocks.MAGENTA_STAINED_GLASS);
      method14070(var0, Blocks.MAGENTA_STAINED_GLASS_PANE, Items.field37920);
      method14068(var0, Blocks.ORANGE_STAINED_GLASS, Items.field37919);
      method14069(var0, Blocks.ORANGE_STAINED_GLASS_PANE, Blocks.ORANGE_STAINED_GLASS);
      method14070(var0, Blocks.ORANGE_STAINED_GLASS_PANE, Items.field37919);
      method14068(var0, Blocks.PINK_STAINED_GLASS, Items.field37924);
      method14069(var0, Blocks.PINK_STAINED_GLASS_PANE, Blocks.PINK_STAINED_GLASS);
      method14070(var0, Blocks.PINK_STAINED_GLASS_PANE, Items.field37924);
      method14068(var0, Blocks.PURPLE_STAINED_GLASS, Items.field37928);
      method14069(var0, Blocks.PURPLE_STAINED_GLASS_PANE, Blocks.PURPLE_STAINED_GLASS);
      method14070(var0, Blocks.PURPLE_STAINED_GLASS_PANE, Items.field37928);
      method14068(var0, Blocks.RED_STAINED_GLASS, Items.field37932);
      method14069(var0, Blocks.RED_STAINED_GLASS_PANE, Blocks.RED_STAINED_GLASS);
      method14070(var0, Blocks.RED_STAINED_GLASS_PANE, Items.field37932);
      method14068(var0, Blocks.WHITE_STAINED_GLASS, Items.field37918);
      method14069(var0, Blocks.WHITE_STAINED_GLASS_PANE, Blocks.WHITE_STAINED_GLASS);
      method14070(var0, Blocks.WHITE_STAINED_GLASS_PANE, Items.field37918);
      method14068(var0, Blocks.YELLOW_STAINED_GLASS, Items.field37922);
      method14069(var0, Blocks.YELLOW_STAINED_GLASS_PANE, Blocks.YELLOW_STAINED_GLASS);
      method14070(var0, Blocks.YELLOW_STAINED_GLASS_PANE, Items.field37922);
      method14071(var0, Blocks.BLACK_TERRACOTTA, Items.field37933);
      method14071(var0, Blocks.BLUE_TERRACOTTA, Items.field37929);
      method14071(var0, Blocks.BROWN_TERRACOTTA, Items.field37930);
      method14071(var0, Blocks.CYAN_TERRACOTTA, Items.field37927);
      method14071(var0, Blocks.GRAY_TERRACOTTA, Items.field37925);
      method14071(var0, Blocks.GREEN_TERRACOTTA, Items.field37931);
      method14071(var0, Blocks.LIGHT_BLUE_TERRACOTTA, Items.field37921);
      method14071(var0, Blocks.LIGHT_GRAY_TERRACOTTA, Items.field37926);
      method14071(var0, Blocks.LIME_TERRACOTTA, Items.field37923);
      method14071(var0, Blocks.MAGENTA_TERRACOTTA, Items.field37920);
      method14071(var0, Blocks.ORANGE_TERRACOTTA, Items.field37919);
      method14071(var0, Blocks.PINK_TERRACOTTA, Items.field37924);
      method14071(var0, Blocks.PURPLE_TERRACOTTA, Items.field37928);
      method14071(var0, Blocks.RED_TERRACOTTA, Items.field37932);
      method14071(var0, Blocks.WHITE_TERRACOTTA, Items.field37918);
      method14071(var0, Blocks.YELLOW_TERRACOTTA, Items.field37922);
      method14072(var0, Blocks.BLACK_CONCRETE_POWDER, Items.field37933);
      method14072(var0, Blocks.BLUE_CONCRETE_POWDER, Items.field37929);
      method14072(var0, Blocks.BROWN_CONCRETE_POWDER, Items.field37930);
      method14072(var0, Blocks.CYAN_CONCRETE_POWDER, Items.field37927);
      method14072(var0, Blocks.GRAY_CONCRETE_POWDER, Items.field37925);
      method14072(var0, Blocks.GREEN_CONCRETE_POWDER, Items.field37931);
      method14072(var0, Blocks.LIGHT_BLUE_CONCRETE_POWDER, Items.field37921);
      method14072(var0, Blocks.LIGHT_GRAY_CONCRETE_POWDER, Items.field37926);
      method14072(var0, Blocks.LIME_CONCRETE_POWDER, Items.field37923);
      method14072(var0, Blocks.MAGENTA_CONCRETE_POWDER, Items.field37920);
      method14072(var0, Blocks.ORANGE_CONCRETE_POWDER, Items.field37919);
      method14072(var0, Blocks.PINK_CONCRETE_POWDER, Items.field37924);
      method14072(var0, Blocks.PURPLE_CONCRETE_POWDER, Items.field37928);
      method14072(var0, Blocks.RED_CONCRETE_POWDER, Items.field37932);
      method14072(var0, Blocks.WHITE_CONCRETE_POWDER, Items.field37918);
      method14072(var0, Blocks.YELLOW_CONCRETE_POWDER, Items.field37922);
      Class8528.method30248(Blocks.ACTIVATOR_RAIL, 6)
         .method30250('#', Blocks.REDSTONE_TORCH)
         .method30250('S', Items.field37835)
         .method30250('X', Items.IRON_INGOT)
         .method30252("XSX")
         .method30252("X#X")
         .method30252("XSX")
         .method30253("has_rail", method14075(Blocks.RAIL))
         .method30255(var0);
      Class8888.method32342(Blocks.ANDESITE, 2)
         .method32344(Blocks.DIORITE)
         .method32344(Blocks.COBBLESTONE)
         .method32348("has_stone", method14075(Blocks.DIORITE))
         .method32350(var0);
      Class8528.method30247(Blocks.ANVIL)
         .method30250('I', Blocks.IRON_BLOCK)
         .method30250('i', Items.IRON_INGOT)
         .method30252("III")
         .method30252(" i ")
         .method30252("iii")
         .method30253("has_iron_block", method14075(Blocks.IRON_BLOCK))
         .method30255(var0);
      Class8528.method30247(Items.ARMOR_STAND)
         .method30250('/', Items.field37835)
         .method30250('_', Blocks.SMOOTH_STONE_SLAB)
         .method30252("///")
         .method30252(" / ")
         .method30252("/_/")
         .method30253("has_stone_slab", method14075(Blocks.SMOOTH_STONE_SLAB))
         .method30255(var0);
      Class8528.method30248(Items.ARROW, 4)
         .method30250('#', Items.field37835)
         .method30250('X', Items.field37868)
         .method30250('Y', Items.field37839)
         .method30252("X")
         .method30252("#")
         .method30252("Y")
         .method30253("has_feather", method14075(Items.field37839))
         .method30253("has_flint", method14075(Items.field37868))
         .method30255(var0);
      Class8528.method30248(Blocks.BARREL, 1)
         .method30249('P', ItemTags.PLANKS)
         .method30249('S', ItemTags.field26078)
         .method30252("PSP")
         .method30252("P P")
         .method30252("PSP")
         .method30253("has_planks", method14076(ItemTags.PLANKS))
         .method30253("has_wood_slab", method14076(ItemTags.field26078))
         .method30255(var0);
      Class8528.method30247(Blocks.BEACON)
         .method30250('S', Items.field38066)
         .method30250('G', Blocks.GLASS)
         .method30250('O', Blocks.OBSIDIAN)
         .method30252("GGG")
         .method30252("GSG")
         .method30252("OOO")
         .method30253("has_nether_star", method14075(Items.field38066))
         .method30255(var0);
      Class8528.method30247(Blocks.BEEHIVE)
         .method30249('P', ItemTags.PLANKS)
         .method30250('H', Items.field38174)
         .method30252("PPP")
         .method30252("HHH")
         .method30252("PPP")
         .method30253("has_honeycomb", method14075(Items.field38174))
         .method30255(var0);
      Class8888.method32341(Items.field38113)
         .method32344(Items.field37836)
         .method32345(Items.field38111, 6)
         .method32348("has_beetroot", method14075(Items.field38111))
         .method32350(var0);
      Class8888.method32341(Items.field37933)
         .method32344(Items.field37915)
         .method32349("black_dye")
         .method32348("has_ink_sac", method14075(Items.field37915))
         .method32350(var0);
      Class8888.method32341(Items.field37933)
         .method32344(Blocks.WITHER_ROSE)
         .method32349("black_dye")
         .method32348("has_black_flower", method14075(Blocks.WITHER_ROSE))
         .method32351(var0, "black_dye_from_wither_rose");
      Class8888.method32342(Items.field37975, 2)
         .method32344(Items.field37967)
         .method32348("has_blaze_rod", method14075(Items.field37967))
         .method32350(var0);
      Class8888.method32341(Items.field37929)
         .method32344(Items.field37917)
         .method32349("blue_dye")
         .method32348("has_lapis_lazuli", method14075(Items.field37917))
         .method32350(var0);
      Class8888.method32341(Items.field37929)
         .method32344(Blocks.CORNFLOWER)
         .method32349("blue_dye")
         .method32348("has_blue_flower", method14075(Blocks.CORNFLOWER))
         .method32351(var0, "blue_dye_from_cornflower");
      Class8528.method30247(Blocks.BLUE_ICE)
         .method30250('#', Blocks.PACKED_ICE)
         .method30252("###")
         .method30252("###")
         .method30252("###")
         .method30253("has_packed_ice", method14075(Blocks.PACKED_ICE))
         .method30255(var0);
      Class8528.method30247(Blocks.BONE_BLOCK)
         .method30250('X', Items.field37934)
         .method30252("XXX")
         .method30252("XXX")
         .method30252("XXX")
         .method30253("has_bonemeal", method14075(Items.field37934))
         .method30255(var0);
      Class8888.method32342(Items.field37934, 3)
         .method32344(Items.field37935)
         .method32349("bonemeal")
         .method32348("has_bone", method14075(Items.field37935))
         .method32350(var0);
      Class8888.method32342(Items.field37934, 9)
         .method32344(Blocks.BONE_BLOCK)
         .method32349("bonemeal")
         .method32348("has_bone_block", method14075(Blocks.BONE_BLOCK))
         .method32351(var0, "bone_meal_from_bone_block");
      Class8888.method32341(Items.field37900)
         .method32345(Items.field37899, 3)
         .method32344(Items.LEATHER)
         .method32348("has_paper", method14075(Items.field37899))
         .method32350(var0);
      Class8528.method30247(Blocks.BOOKSHELF)
         .method30249('#', ItemTags.PLANKS)
         .method30250('X', Items.field37900)
         .method30252("###")
         .method30252("XXX")
         .method30252("###")
         .method30253("has_book", method14075(Items.field37900))
         .method30255(var0);
      Class8528.method30247(Items.BOW)
         .method30250('#', Items.field37835)
         .method30250('X', Items.field37838)
         .method30252(" #X")
         .method30252("# X")
         .method30252(" #X")
         .method30253("has_string", method14075(Items.field37838))
         .method30255(var0);
      Class8528.method30248(Items.field37836, 4)
         .method30249('#', ItemTags.PLANKS)
         .method30252("# #")
         .method30252(" # ")
         .method30253("has_brown_mushroom", method14075(Blocks.BROWN_MUSHROOM))
         .method30253("has_red_mushroom", method14075(Blocks.RED_MUSHROOM))
         .method30253("has_mushroom_stew", method14075(Items.field37837))
         .method30255(var0);
      Class8528.method30247(Items.field37843)
         .method30250('#', Items.field37842)
         .method30252("###")
         .method30253("has_wheat", method14075(Items.field37842))
         .method30255(var0);
      Class8528.method30247(Blocks.BREWING_STAND)
         .method30250('B', Items.field37967)
         .method30249('#', ItemTags.field26123)
         .method30252(" B ")
         .method30252("###")
         .method30253("has_blaze_rod", method14075(Items.field37967))
         .method30255(var0);
      Class8528.method30247(Blocks.BRICKS)
         .method30250('#', Items.field37896)
         .method30252("##")
         .method30252("##")
         .method30253("has_brick", method14075(Items.field37896))
         .method30255(var0);
      Class8528.method30248(Blocks.BRICK_SLAB, 6)
         .method30250('#', Blocks.BRICKS)
         .method30252("###")
         .method30253("has_brick_block", method14075(Blocks.BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.BRICK_STAIRS, 4)
         .method30250('#', Blocks.BRICKS)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_brick_block", method14075(Blocks.BRICKS))
         .method30255(var0);
      Class8888.method32341(Items.field37930)
         .method32344(Items.field37916)
         .method32349("brown_dye")
         .method32348("has_cocoa_beans", method14075(Items.field37916))
         .method32350(var0);
      Class8528.method30247(Items.BUCKET)
         .method30250('#', Items.IRON_INGOT)
         .method30252("# #")
         .method30252(" # ")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8528.method30247(Blocks.CAKE)
         .method30250('A', Items.MILK_BUCKET)
         .method30250('B', Items.field37936)
         .method30250('C', Items.field37842)
         .method30250('E', Items.EGG)
         .method30252("AAA")
         .method30252("BEB")
         .method30252("CCC")
         .method30253("has_egg", method14075(Items.EGG))
         .method30255(var0);
      Class8528.method30247(Blocks.CAMPFIRE)
         .method30249('L', ItemTags.field26085)
         .method30250('S', Items.field37835)
         .method30249('C', ItemTags.field26118)
         .method30252(" S ")
         .method30252("SCS")
         .method30252("LLL")
         .method30253("has_stick", method14075(Items.field37835))
         .method30253("has_coal", method14076(ItemTags.field26118))
         .method30255(var0);
      Class8528.method30247(Items.field38064)
         .method30250('#', Items.field37906)
         .method30250('X', Items.field38052)
         .method30252("# ")
         .method30252(" X")
         .method30253("has_carrot", method14075(Items.field38052))
         .method30255(var0);
      Class8528.method30247(Items.field38065)
         .method30250('#', Items.field37906)
         .method30250('X', Items.WARPED_FUNGUS)
         .method30252("# ")
         .method30252(" X")
         .method30253("has_warped_fungus", method14075(Items.WARPED_FUNGUS))
         .method30255(var0);
      Class8528.method30247(Blocks.CAULDRON)
         .method30250('#', Items.IRON_INGOT)
         .method30252("# #")
         .method30252("# #")
         .method30252("###")
         .method30253("has_water_bucket", method14075(Items.WATER_BUCKET))
         .method30255(var0);
      Class8528.method30247(Blocks.COMPOSTER)
         .method30249('#', ItemTags.field26078)
         .method30252("# #")
         .method30252("# #")
         .method30252("###")
         .method30253("has_wood_slab", method14076(ItemTags.field26078))
         .method30255(var0);
      Class8528.method30247(Blocks.CHEST)
         .method30249('#', ItemTags.PLANKS)
         .method30252("###")
         .method30252("# #")
         .method30252("###")
         .method30253(
            "has_lots_of_items", new Class4491(Class9587.field44822, Class8840.method32014(10), Class8840.field39936, Class8840.field39936, new Class8634[0])
         )
         .method30255(var0);
      Class8528.method30247(Items.CHEST_MINECART)
         .method30250('A', Blocks.CHEST)
         .method30250('B', Items.MINECART)
         .method30252("A")
         .method30252("B")
         .method30253("has_minecart", method14075(Items.MINECART))
         .method30255(var0);
      Class8528.method30247(Blocks.CHISELED_NETHER_BRICKS)
         .method30250('#', Blocks.NETHER_BRICK_SLAB)
         .method30252("#")
         .method30252("#")
         .method30253("has_nether_bricks", method14075(Blocks.NETHER_BRICKS))
         .method30255(var0);
      Class8528.method30247(Blocks.CHISELED_QUARTZ_BLOCK)
         .method30250('#', Blocks.QUARTZ_SLAB)
         .method30252("#")
         .method30252("#")
         .method30253("has_chiseled_quartz_block", method14075(Blocks.CHISELED_QUARTZ_BLOCK))
         .method30253("has_quartz_block", method14075(Blocks.QUARTZ_BLOCK))
         .method30253("has_quartz_pillar", method14075(Blocks.QUARTZ_PILLAR))
         .method30255(var0);
      Class8528.method30247(Blocks.CHISELED_STONE_BRICKS)
         .method30250('#', Blocks.STONE_BRICK_SLAB)
         .method30252("#")
         .method30252("#")
         .method30253("has_stone_bricks", method14076(ItemTags.field26072))
         .method30255(var0);
      Class8528.method30247(Blocks.CLAY)
         .method30250('#', Items.field37897)
         .method30252("##")
         .method30252("##")
         .method30253("has_clay_ball", method14075(Items.field37897))
         .method30255(var0);
      Class8528.method30247(Items.field37907)
         .method30250('#', Items.GOLD_INGOT)
         .method30250('X', Items.REDSTONE_DUST)
         .method30252(" # ")
         .method30252("#X#")
         .method30252(" # ")
         .method30253("has_redstone", method14075(Items.REDSTONE_DUST))
         .method30255(var0);
      Class8888.method32342(Items.COAL, 9)
         .method32344(Blocks.COAL_BLOCK)
         .method32348("has_coal_block", method14075(Blocks.COAL_BLOCK))
         .method32350(var0);
      Class8528.method30247(Blocks.COAL_BLOCK)
         .method30250('#', Items.COAL)
         .method30252("###")
         .method30252("###")
         .method30252("###")
         .method30253("has_coal", method14075(Items.COAL))
         .method30255(var0);
      Class8528.method30248(Blocks.COARSE_DIRT, 4)
         .method30250('D', Blocks.DIRT)
         .method30250('G', Blocks.GRAVEL)
         .method30252("DG")
         .method30252("GD")
         .method30253("has_gravel", method14075(Blocks.GRAVEL))
         .method30255(var0);
      Class8528.method30248(Blocks.COBBLESTONE_SLAB, 6)
         .method30250('#', Blocks.COBBLESTONE)
         .method30252("###")
         .method30253("has_cobblestone", method14075(Blocks.COBBLESTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.COBBLESTONE_WALL, 6)
         .method30250('#', Blocks.COBBLESTONE)
         .method30252("###")
         .method30252("###")
         .method30253("has_cobblestone", method14075(Blocks.COBBLESTONE))
         .method30255(var0);
      Class8528.method30247(Blocks.COMPARATOR)
         .method30250('#', Blocks.REDSTONE_TORCH)
         .method30250('X', Items.field38072)
         .method30250('I', Blocks.STONE)
         .method30252(" # ")
         .method30252("#X#")
         .method30252("III")
         .method30253("has_quartz", method14075(Items.field38072))
         .method30255(var0);
      Class8528.method30247(Items.COMPASS)
         .method30250('#', Items.IRON_INGOT)
         .method30250('X', Items.REDSTONE_DUST)
         .method30252(" # ")
         .method30252("#X#")
         .method30252(" # ")
         .method30253("has_redstone", method14075(Items.REDSTONE_DUST))
         .method30255(var0);
      Class8528.method30248(Items.field37954, 8)
         .method30250('#', Items.field37842)
         .method30250('X', Items.field37916)
         .method30252("#X#")
         .method30253("has_cocoa", method14075(Items.field37916))
         .method30255(var0);
      Class8528.method30247(Blocks.CRAFTING_TABLE)
         .method30249('#', ItemTags.PLANKS)
         .method30252("##")
         .method30252("##")
         .method30253("has_planks", method14076(ItemTags.PLANKS))
         .method30255(var0);
      Class8528.method30247(Items.CROSSBOW)
         .method30250('~', Items.field37838)
         .method30250('#', Items.field37835)
         .method30250('&', Items.IRON_INGOT)
         .method30250('$', Blocks.TRIPWIRE_HOOK)
         .method30252("#&#")
         .method30252("~$~")
         .method30252(" # ")
         .method30253("has_string", method14075(Items.field37838))
         .method30253("has_stick", method14075(Items.field37835))
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30253("has_tripwire_hook", method14075(Blocks.TRIPWIRE_HOOK))
         .method30255(var0);
      Class8528.method30247(Blocks.LOOM)
         .method30249('#', ItemTags.PLANKS)
         .method30250('@', Items.field37838)
         .method30252("@@")
         .method30252("##")
         .method30253("has_string", method14075(Items.field37838))
         .method30255(var0);
      Class8528.method30247(Blocks.CHISELED_RED_SANDSTONE)
         .method30250('#', Blocks.RED_SANDSTONE_SLAB)
         .method30252("#")
         .method30252("#")
         .method30253("has_red_sandstone", method14075(Blocks.RED_SANDSTONE))
         .method30253("has_chiseled_red_sandstone", method14075(Blocks.CHISELED_RED_SANDSTONE))
         .method30253("has_cut_red_sandstone", method14075(Blocks.CUT_RED_SANDSTONE))
         .method30255(var0);
      Class8528.method30247(Blocks.CHISELED_SANDSTONE)
         .method30250('#', Blocks.SANDSTONE_SLAB)
         .method30252("#")
         .method30252("#")
         .method30253("has_stone_slab", method14075(Blocks.SANDSTONE_SLAB))
         .method30255(var0);
      Class8888.method32342(Items.field37927, 2)
         .method32344(Items.field37929)
         .method32344(Items.field37931)
         .method32348("has_green_dye", method14075(Items.field37931))
         .method32348("has_blue_dye", method14075(Items.field37929))
         .method32350(var0);
      Class8528.method30247(Blocks.DARK_PRISMARINE)
         .method30250('S', Items.field38075)
         .method30250('I', Items.field37933)
         .method30252("SSS")
         .method30252("SIS")
         .method30252("SSS")
         .method30253("has_prismarine_shard", method14075(Items.field38075))
         .method30255(var0);
      Class8528.method30248(Blocks.PRISMARINE_STAIRS, 4)
         .method30250('#', Blocks.PRISMARINE)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_prismarine", method14075(Blocks.PRISMARINE))
         .method30255(var0);
      Class8528.method30248(Blocks.PRISMARINE_BRICK_STAIRS, 4)
         .method30250('#', Blocks.PRISMARINE_BRICKS)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_prismarine_bricks", method14075(Blocks.PRISMARINE_BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.DARK_PRISMARINE_STAIRS, 4)
         .method30250('#', Blocks.DARK_PRISMARINE)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_dark_prismarine", method14075(Blocks.DARK_PRISMARINE))
         .method30255(var0);
      Class8528.method30247(Blocks.DAYLIGHT_DETECTOR)
         .method30250('Q', Items.field38072)
         .method30250('G', Blocks.GLASS)
         .method30251('W', Ingredient.fromTag(ItemTags.field26078))
         .method30252("GGG")
         .method30252("QQQ")
         .method30252("WWW")
         .method30253("has_quartz", method14075(Items.field38072))
         .method30255(var0);
      Class8528.method30248(Blocks.DETECTOR_RAIL, 6)
         .method30250('R', Items.REDSTONE_DUST)
         .method30250('#', Blocks.STONE_PRESSURE_PLATE)
         .method30250('X', Items.IRON_INGOT)
         .method30252("X X")
         .method30252("X#X")
         .method30252("XRX")
         .method30253("has_rail", method14075(Blocks.RAIL))
         .method30255(var0);
      Class8888.method32342(Items.DIAMOND, 9)
         .method32344(Blocks.DIAMOND_BLOCK)
         .method32348("has_diamond_block", method14075(Blocks.DIAMOND_BLOCK))
         .method32350(var0);
      Class8528.method30247(Items.field37828)
         .method30250('#', Items.field37835)
         .method30250('X', Items.DIAMOND)
         .method30252("XX")
         .method30252("X#")
         .method30252(" #")
         .method30253("has_diamond", method14075(Items.DIAMOND))
         .method30255(var0);
      Class8528.method30247(Blocks.DIAMOND_BLOCK)
         .method30250('#', Items.DIAMOND)
         .method30252("###")
         .method30252("###")
         .method30252("###")
         .method30253("has_diamond", method14075(Items.DIAMOND))
         .method30255(var0);
      Class8528.method30247(Items.field37859)
         .method30250('X', Items.DIAMOND)
         .method30252("X X")
         .method30252("X X")
         .method30253("has_diamond", method14075(Items.DIAMOND))
         .method30255(var0);
      Class8528.method30247(Items.field37857)
         .method30250('X', Items.DIAMOND)
         .method30252("X X")
         .method30252("XXX")
         .method30252("XXX")
         .method30253("has_diamond", method14075(Items.DIAMOND))
         .method30255(var0);
      Class8528.method30247(Items.field37856)
         .method30250('X', Items.DIAMOND)
         .method30252("XXX")
         .method30252("X X")
         .method30253("has_diamond", method14075(Items.DIAMOND))
         .method30255(var0);
      Class8528.method30247(Items.field37829)
         .method30250('#', Items.field37835)
         .method30250('X', Items.DIAMOND)
         .method30252("XX")
         .method30252(" #")
         .method30252(" #")
         .method30253("has_diamond", method14075(Items.DIAMOND))
         .method30255(var0);
      Class8528.method30247(Items.field37858)
         .method30250('X', Items.DIAMOND)
         .method30252("XXX")
         .method30252("X X")
         .method30252("X X")
         .method30253("has_diamond", method14075(Items.DIAMOND))
         .method30255(var0);
      Class8528.method30247(Items.field37827)
         .method30250('#', Items.field37835)
         .method30250('X', Items.DIAMOND)
         .method30252("XXX")
         .method30252(" # ")
         .method30252(" # ")
         .method30253("has_diamond", method14075(Items.DIAMOND))
         .method30255(var0);
      Class8528.method30247(Items.field37826)
         .method30250('#', Items.field37835)
         .method30250('X', Items.DIAMOND)
         .method30252("X")
         .method30252("#")
         .method30252("#")
         .method30253("has_diamond", method14075(Items.DIAMOND))
         .method30255(var0);
      Class8528.method30247(Items.field37825)
         .method30250('#', Items.field37835)
         .method30250('X', Items.DIAMOND)
         .method30252("X")
         .method30252("X")
         .method30252("#")
         .method30253("has_diamond", method14075(Items.DIAMOND))
         .method30255(var0);
      Class8528.method30248(Blocks.DIORITE, 2)
         .method30250('Q', Items.field38072)
         .method30250('C', Blocks.COBBLESTONE)
         .method30252("CQ")
         .method30252("QC")
         .method30253("has_quartz", method14075(Items.field38072))
         .method30255(var0);
      Class8528.method30247(Blocks.DISPENSER)
         .method30250('R', Items.REDSTONE_DUST)
         .method30250('#', Blocks.COBBLESTONE)
         .method30250('X', Items.BOW)
         .method30252("###")
         .method30252("#X#")
         .method30252("#R#")
         .method30253("has_bow", method14075(Items.BOW))
         .method30255(var0);
      Class8528.method30247(Blocks.DROPPER)
         .method30250('R', Items.REDSTONE_DUST)
         .method30250('#', Blocks.COBBLESTONE)
         .method30252("###")
         .method30252("# #")
         .method30252("#R#")
         .method30253("has_redstone", method14075(Items.REDSTONE_DUST))
         .method30255(var0);
      Class8888.method32342(Items.EMERALD, 9)
         .method32344(Blocks.EMERALD_BLOCK)
         .method32348("has_emerald_block", method14075(Blocks.EMERALD_BLOCK))
         .method32350(var0);
      Class8528.method30247(Blocks.EMERALD_BLOCK)
         .method30250('#', Items.EMERALD)
         .method30252("###")
         .method30252("###")
         .method30252("###")
         .method30253("has_emerald", method14075(Items.EMERALD))
         .method30255(var0);
      Class8528.method30247(Blocks.ENCHANTING_TABLE)
         .method30250('B', Items.field37900)
         .method30250('#', Blocks.OBSIDIAN)
         .method30250('D', Items.DIAMOND)
         .method30252(" B ")
         .method30252("D#D")
         .method30252("###")
         .method30253("has_obsidian", method14075(Blocks.OBSIDIAN))
         .method30255(var0);
      Class8528.method30247(Blocks.ENDER_CHEST)
         .method30250('#', Blocks.OBSIDIAN)
         .method30250('E', Items.field37979)
         .method30252("###")
         .method30252("#E#")
         .method30252("###")
         .method30253("has_ender_eye", method14075(Items.field37979))
         .method30255(var0);
      Class8888.method32341(Items.field37979)
         .method32344(Items.ENDER_PEARL)
         .method32344(Items.field37975)
         .method32348("has_blaze_powder", method14075(Items.field37975))
         .method32350(var0);
      Class8528.method30248(Blocks.END_STONE_BRICKS, 4)
         .method30250('#', Blocks.END_STONE)
         .method30252("##")
         .method30252("##")
         .method30253("has_end_stone", method14075(Blocks.END_STONE))
         .method30255(var0);
      Class8528.method30247(Items.END_CRYSTAL)
         .method30250('T', Items.field37968)
         .method30250('E', Items.field37979)
         .method30250('G', Blocks.GLASS)
         .method30252("GGG")
         .method30252("GEG")
         .method30252("GTG")
         .method30253("has_ender_eye", method14075(Items.field37979))
         .method30255(var0);
      Class8528.method30248(Blocks.END_ROD, 4)
         .method30250('#', Items.field38110)
         .method30250('/', Items.field37967)
         .method30252("/")
         .method30252("#")
         .method30253("has_chorus_fruit_popped", method14075(Items.field38110))
         .method30255(var0);
      Class8888.method32341(Items.field37974)
         .method32344(Items.field37973)
         .method32344(Blocks.BROWN_MUSHROOM)
         .method32344(Items.field37936)
         .method32348("has_spider_eye", method14075(Items.field37973))
         .method32350(var0);
      Class8888.method32342(Items.field38046, 3)
         .method32344(Items.field37840)
         .method32344(Items.field37975)
         .method32346(Ingredient.fromItems(Items.COAL, Items.CHARCOAL))
         .method32348("has_blaze_powder", method14075(Items.field37975))
         .method32350(var0);
      Class8528.method30247(Items.field37906)
         .method30250('#', Items.field37835)
         .method30250('X', Items.field37838)
         .method30252("  #")
         .method30252(" #X")
         .method30252("# X")
         .method30253("has_string", method14075(Items.field37838))
         .method30255(var0);
      Class8888.method32341(Items.FLINT_AND_STEEL)
         .method32344(Items.IRON_INGOT)
         .method32344(Items.field37868)
         .method32348("has_flint", method14075(Items.field37868))
         .method32348("has_obsidian", method14075(Blocks.OBSIDIAN))
         .method32350(var0);
      Class8528.method30247(Blocks.FLOWER_POT)
         .method30250('#', Items.field37896)
         .method30252("# #")
         .method30252(" # ")
         .method30253("has_brick", method14075(Items.field37896))
         .method30255(var0);
      Class8528.method30247(Blocks.FURNACE)
         .method30249('#', ItemTags.field26123)
         .method30252("###")
         .method30252("# #")
         .method30252("###")
         .method30253("has_cobblestone", method14076(ItemTags.field26123))
         .method30255(var0);
      Class8528.method30247(Items.FURNACE_MINECART)
         .method30250('A', Blocks.FURNACE)
         .method30250('B', Items.MINECART)
         .method30252("A")
         .method30252("B")
         .method30253("has_minecart", method14075(Items.MINECART))
         .method30255(var0);
      Class8528.method30248(Items.field37972, 3)
         .method30250('#', Blocks.GLASS)
         .method30252("# #")
         .method30252(" # ")
         .method30253("has_glass", method14075(Blocks.GLASS))
         .method30255(var0);
      Class8528.method30248(Blocks.GLASS_PANE, 16)
         .method30250('#', Blocks.GLASS)
         .method30252("###")
         .method30252("###")
         .method30253("has_glass", method14075(Blocks.GLASS))
         .method30255(var0);
      Class8528.method30247(Blocks.GLOWSTONE)
         .method30250('#', Items.field37908)
         .method30252("##")
         .method30252("##")
         .method30253("has_glowstone_dust", method14075(Items.field37908))
         .method30255(var0);
      Class8528.method30247(Items.GOLDEN_APPLE)
         .method30250('#', Items.GOLD_INGOT)
         .method30250('X', Items.APPLE)
         .method30252("###")
         .method30252("#X#")
         .method30252("###")
         .method30253("has_gold_ingot", method14075(Items.GOLD_INGOT))
         .method30255(var0);
      Class8528.method30247(Items.field37818)
         .method30250('#', Items.field37835)
         .method30250('X', Items.GOLD_INGOT)
         .method30252("XX")
         .method30252("X#")
         .method30252(" #")
         .method30253("has_gold_ingot", method14075(Items.GOLD_INGOT))
         .method30255(var0);
      Class8528.method30247(Items.field37863)
         .method30250('X', Items.GOLD_INGOT)
         .method30252("X X")
         .method30252("X X")
         .method30253("has_gold_ingot", method14075(Items.GOLD_INGOT))
         .method30255(var0);
      Class8528.method30247(Items.field38057)
         .method30250('#', Items.field37969)
         .method30250('X', Items.field38052)
         .method30252("###")
         .method30252("#X#")
         .method30252("###")
         .method30253("has_gold_nugget", method14075(Items.field37969))
         .method30255(var0);
      Class8528.method30247(Items.field37861)
         .method30250('X', Items.GOLD_INGOT)
         .method30252("X X")
         .method30252("XXX")
         .method30252("XXX")
         .method30253("has_gold_ingot", method14075(Items.GOLD_INGOT))
         .method30255(var0);
      Class8528.method30247(Items.field37860)
         .method30250('X', Items.GOLD_INGOT)
         .method30252("XXX")
         .method30252("X X")
         .method30253("has_gold_ingot", method14075(Items.GOLD_INGOT))
         .method30255(var0);
      Class8528.method30247(Items.field37819)
         .method30250('#', Items.field37835)
         .method30250('X', Items.GOLD_INGOT)
         .method30252("XX")
         .method30252(" #")
         .method30252(" #")
         .method30253("has_gold_ingot", method14075(Items.GOLD_INGOT))
         .method30255(var0);
      Class8528.method30247(Items.GOLDEN_LEGGINGS)
         .method30250('X', Items.GOLD_INGOT)
         .method30252("XXX")
         .method30252("X X")
         .method30252("X X")
         .method30253("has_gold_ingot", method14075(Items.GOLD_INGOT))
         .method30255(var0);
      Class8528.method30247(Items.field37817)
         .method30250('#', Items.field37835)
         .method30250('X', Items.GOLD_INGOT)
         .method30252("XXX")
         .method30252(" # ")
         .method30252(" # ")
         .method30253("has_gold_ingot", method14075(Items.GOLD_INGOT))
         .method30255(var0);
      Class8528.method30248(Blocks.POWERED_RAIL, 6)
         .method30250('R', Items.REDSTONE_DUST)
         .method30250('#', Items.field37835)
         .method30250('X', Items.GOLD_INGOT)
         .method30252("X X")
         .method30252("X#X")
         .method30252("XRX")
         .method30253("has_rail", method14075(Blocks.RAIL))
         .method30255(var0);
      Class8528.method30247(Items.field37816)
         .method30250('#', Items.field37835)
         .method30250('X', Items.GOLD_INGOT)
         .method30252("X")
         .method30252("#")
         .method30252("#")
         .method30253("has_gold_ingot", method14075(Items.GOLD_INGOT))
         .method30255(var0);
      Class8528.method30247(Items.GOLDEN_SWORD)
         .method30250('#', Items.field37835)
         .method30250('X', Items.GOLD_INGOT)
         .method30252("X")
         .method30252("X")
         .method30252("#")
         .method30253("has_gold_ingot", method14075(Items.GOLD_INGOT))
         .method30255(var0);
      Class8528.method30247(Blocks.GOLD_BLOCK)
         .method30250('#', Items.GOLD_INGOT)
         .method30252("###")
         .method30252("###")
         .method30252("###")
         .method30253("has_gold_ingot", method14075(Items.GOLD_INGOT))
         .method30255(var0);
      Class8888.method32342(Items.GOLD_INGOT, 9)
         .method32344(Blocks.GOLD_BLOCK)
         .method32349("gold_ingot")
         .method32348("has_gold_block", method14075(Blocks.GOLD_BLOCK))
         .method32351(var0, "gold_ingot_from_gold_block");
      Class8528.method30247(Items.GOLD_INGOT)
         .method30250('#', Items.field37969)
         .method30252("###")
         .method30252("###")
         .method30252("###")
         .method30254("gold_ingot")
         .method30253("has_gold_nugget", method14075(Items.field37969))
         .method30256(var0, "gold_ingot_from_nuggets");
      Class8888.method32342(Items.field37969, 9)
         .method32344(Items.GOLD_INGOT)
         .method32348("has_gold_ingot", method14075(Items.GOLD_INGOT))
         .method32350(var0);
      Class8888.method32341(Blocks.GRANITE)
         .method32344(Blocks.DIORITE)
         .method32344(Items.field38072)
         .method32348("has_quartz", method14075(Items.field38072))
         .method32350(var0);
      Class8888.method32342(Items.field37925, 2)
         .method32344(Items.field37933)
         .method32344(Items.field37918)
         .method32348("has_white_dye", method14075(Items.field37918))
         .method32348("has_black_dye", method14075(Items.field37933))
         .method32350(var0);
      Class8528.method30247(Blocks.HAY_BLOCK)
         .method30250('#', Items.field37842)
         .method30252("###")
         .method30252("###")
         .method30252("###")
         .method30253("has_wheat", method14075(Items.field37842))
         .method30255(var0);
      Class8528.method30247(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)
         .method30250('#', Items.IRON_INGOT)
         .method30252("##")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8888.method32342(Items.field38177, 4)
         .method32344(Items.field38178)
         .method32345(Items.field37972, 4)
         .method32348("has_honey_block", method14075(Blocks.HONEY_BLOCK))
         .method32350(var0);
      Class8528.method30248(Blocks.HONEY_BLOCK, 1)
         .method30250('S', Items.field38177)
         .method30252("SS")
         .method30252("SS")
         .method30253("has_honey_bottle", method14075(Items.field38177))
         .method30255(var0);
      Class8528.method30247(Blocks.HONEYCOMB_BLOCK)
         .method30250('H', Items.field38174)
         .method30252("HH")
         .method30252("HH")
         .method30253("has_honeycomb", method14075(Items.field38174))
         .method30255(var0);
      Class8528.method30247(Blocks.HOPPER)
         .method30250('C', Blocks.CHEST)
         .method30250('I', Items.IRON_INGOT)
         .method30252("I I")
         .method30252("ICI")
         .method30252(" I ")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8528.method30247(Items.HOPPER_MINECART)
         .method30250('A', Blocks.HOPPER)
         .method30250('B', Items.MINECART)
         .method30252("A")
         .method30252("B")
         .method30253("has_minecart", method14075(Items.MINECART))
         .method30255(var0);
      Class8528.method30247(Items.IRON_AXE)
         .method30250('#', Items.field37835)
         .method30250('X', Items.IRON_INGOT)
         .method30252("XX")
         .method30252("X#")
         .method30252(" #")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8528.method30248(Blocks.IRON_BARS, 16)
         .method30250('#', Items.IRON_INGOT)
         .method30252("###")
         .method30252("###")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8528.method30247(Blocks.IRON_BLOCK)
         .method30250('#', Items.IRON_INGOT)
         .method30252("###")
         .method30252("###")
         .method30252("###")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8528.method30247(Items.field37855)
         .method30250('X', Items.IRON_INGOT)
         .method30252("X X")
         .method30252("X X")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8528.method30247(Items.field37853)
         .method30250('X', Items.IRON_INGOT)
         .method30252("X X")
         .method30252("XXX")
         .method30252("XXX")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8528.method30248(Blocks.IRON_DOOR, 3)
         .method30250('#', Items.IRON_INGOT)
         .method30252("##")
         .method30252("##")
         .method30252("##")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8528.method30247(Items.field37852)
         .method30250('X', Items.IRON_INGOT)
         .method30252("XXX")
         .method30252("X X")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8528.method30247(Items.field37824)
         .method30250('#', Items.field37835)
         .method30250('X', Items.IRON_INGOT)
         .method30252("XX")
         .method30252(" #")
         .method30252(" #")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8888.method32342(Items.IRON_INGOT, 9)
         .method32344(Blocks.IRON_BLOCK)
         .method32349("iron_ingot")
         .method32348("has_iron_block", method14075(Blocks.IRON_BLOCK))
         .method32351(var0, "iron_ingot_from_iron_block");
      Class8528.method30247(Items.IRON_INGOT)
         .method30250('#', Items.field38128)
         .method30252("###")
         .method30252("###")
         .method30252("###")
         .method30254("iron_ingot")
         .method30253("has_iron_nugget", method14075(Items.field38128))
         .method30256(var0, "iron_ingot_from_nuggets");
      Class8528.method30247(Items.field37854)
         .method30250('X', Items.IRON_INGOT)
         .method30252("XXX")
         .method30252("X X")
         .method30252("X X")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8888.method32342(Items.field38128, 9)
         .method32344(Items.IRON_INGOT)
         .method32348("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method32350(var0);
      Class8528.method30247(Items.field37822)
         .method30250('#', Items.field37835)
         .method30250('X', Items.IRON_INGOT)
         .method30252("XXX")
         .method30252(" # ")
         .method30252(" # ")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8528.method30247(Items.IRON_SHOVEL)
         .method30250('#', Items.field37835)
         .method30250('X', Items.IRON_INGOT)
         .method30252("X")
         .method30252("#")
         .method30252("#")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8528.method30247(Items.field37820)
         .method30250('#', Items.field37835)
         .method30250('X', Items.IRON_INGOT)
         .method30252("X")
         .method30252("X")
         .method30252("#")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8528.method30247(Blocks.IRON_TRAPDOOR)
         .method30250('#', Items.IRON_INGOT)
         .method30252("##")
         .method30252("##")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8528.method30247(Items.ITEM_FRAME)
         .method30250('#', Items.field37835)
         .method30250('X', Items.LEATHER)
         .method30252("###")
         .method30252("#X#")
         .method30252("###")
         .method30253("has_leather", method14075(Items.LEATHER))
         .method30255(var0);
      Class8528.method30247(Blocks.JUKEBOX)
         .method30249('#', ItemTags.PLANKS)
         .method30250('X', Items.DIAMOND)
         .method30252("###")
         .method30252("#X#")
         .method30252("###")
         .method30253("has_diamond", method14075(Items.DIAMOND))
         .method30255(var0);
      Class8528.method30248(Blocks.LADDER, 3)
         .method30250('#', Items.field37835)
         .method30252("# #")
         .method30252("###")
         .method30252("# #")
         .method30253("has_stick", method14075(Items.field37835))
         .method30255(var0);
      Class8528.method30247(Blocks.LAPIS_BLOCK)
         .method30250('#', Items.field37917)
         .method30252("###")
         .method30252("###")
         .method30252("###")
         .method30253("has_lapis", method14075(Items.field37917))
         .method30255(var0);
      Class8888.method32342(Items.field37917, 9)
         .method32344(Blocks.LAPIS_BLOCK)
         .method32348("has_lapis_block", method14075(Blocks.LAPIS_BLOCK))
         .method32350(var0);
      Class8528.method30248(Items.LEAD, 2)
         .method30250('~', Items.field37838)
         .method30250('O', Items.field37901)
         .method30252("~~ ")
         .method30252("~O ")
         .method30252("  ~")
         .method30253("has_slime_ball", method14075(Items.field37901))
         .method30255(var0);
      Class8528.method30247(Items.LEATHER)
         .method30250('#', Items.field38081)
         .method30252("##")
         .method30252("##")
         .method30253("has_rabbit_hide", method14075(Items.field38081))
         .method30255(var0);
      Class8528.method30247(Items.field37847)
         .method30250('X', Items.LEATHER)
         .method30252("X X")
         .method30252("X X")
         .method30253("has_leather", method14075(Items.LEATHER))
         .method30255(var0);
      Class8528.method30247(Items.field37845)
         .method30250('X', Items.LEATHER)
         .method30252("X X")
         .method30252("XXX")
         .method30252("XXX")
         .method30253("has_leather", method14075(Items.LEATHER))
         .method30255(var0);
      Class8528.method30247(Items.field37844)
         .method30250('X', Items.LEATHER)
         .method30252("XXX")
         .method30252("X X")
         .method30253("has_leather", method14075(Items.LEATHER))
         .method30255(var0);
      Class8528.method30247(Items.field37846)
         .method30250('X', Items.LEATHER)
         .method30252("XXX")
         .method30252("X X")
         .method30252("X X")
         .method30253("has_leather", method14075(Items.LEATHER))
         .method30255(var0);
      Class8528.method30247(Items.field38086)
         .method30250('X', Items.LEATHER)
         .method30252("X X")
         .method30252("XXX")
         .method30252("X X")
         .method30253("has_leather", method14075(Items.LEATHER))
         .method30255(var0);
      Class8528.method30247(Blocks.LECTERN)
         .method30249('S', ItemTags.field26078)
         .method30250('B', Blocks.BOOKSHELF)
         .method30252("SSS")
         .method30252(" B ")
         .method30252(" S ")
         .method30253("has_book", method14075(Items.field37900))
         .method30255(var0);
      Class8528.method30247(Blocks.LEVER)
         .method30250('#', Blocks.COBBLESTONE)
         .method30250('X', Items.field37835)
         .method30252("X")
         .method30252("#")
         .method30253("has_cobblestone", method14075(Blocks.COBBLESTONE))
         .method30255(var0);
      Class8888.method32341(Items.field37921)
         .method32344(Blocks.BLUE_ORCHID)
         .method32349("light_blue_dye")
         .method32348("has_red_flower", method14075(Blocks.BLUE_ORCHID))
         .method32351(var0, "light_blue_dye_from_blue_orchid");
      Class8888.method32342(Items.field37921, 2)
         .method32344(Items.field37929)
         .method32344(Items.field37918)
         .method32349("light_blue_dye")
         .method32348("has_blue_dye", method14075(Items.field37929))
         .method32348("has_white_dye", method14075(Items.field37918))
         .method32351(var0, "light_blue_dye_from_blue_white_dye");
      Class8888.method32341(Items.field37926)
         .method32344(Blocks.AZURE_BLUET)
         .method32349("light_gray_dye")
         .method32348("has_red_flower", method14075(Blocks.AZURE_BLUET))
         .method32351(var0, "light_gray_dye_from_azure_bluet");
      Class8888.method32342(Items.field37926, 2)
         .method32344(Items.field37925)
         .method32344(Items.field37918)
         .method32349("light_gray_dye")
         .method32348("has_gray_dye", method14075(Items.field37925))
         .method32348("has_white_dye", method14075(Items.field37918))
         .method32351(var0, "light_gray_dye_from_gray_white_dye");
      Class8888.method32342(Items.field37926, 3)
         .method32344(Items.field37933)
         .method32345(Items.field37918, 2)
         .method32349("light_gray_dye")
         .method32348("has_white_dye", method14075(Items.field37918))
         .method32348("has_black_dye", method14075(Items.field37933))
         .method32351(var0, "light_gray_dye_from_black_white_dye");
      Class8888.method32341(Items.field37926)
         .method32344(Blocks.OXEYE_DAISY)
         .method32349("light_gray_dye")
         .method32348("has_red_flower", method14075(Blocks.OXEYE_DAISY))
         .method32351(var0, "light_gray_dye_from_oxeye_daisy");
      Class8888.method32341(Items.field37926)
         .method32344(Blocks.WHITE_TULIP)
         .method32349("light_gray_dye")
         .method32348("has_red_flower", method14075(Blocks.WHITE_TULIP))
         .method32351(var0, "light_gray_dye_from_white_tulip");
      Class8528.method30247(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE)
         .method30250('#', Items.GOLD_INGOT)
         .method30252("##")
         .method30253("has_gold_ingot", method14075(Items.GOLD_INGOT))
         .method30255(var0);
      Class8888.method32342(Items.field37923, 2)
         .method32344(Items.field37931)
         .method32344(Items.field37918)
         .method32348("has_green_dye", method14075(Items.field37931))
         .method32348("has_white_dye", method14075(Items.field37918))
         .method32350(var0);
      Class8528.method30247(Blocks.JACK_O_LANTERN)
         .method30250('A', Blocks.CARVED_PUMPKIN)
         .method30250('B', Blocks.TORCH)
         .method30252("A")
         .method30252("B")
         .method30253("has_carved_pumpkin", method14075(Blocks.CARVED_PUMPKIN))
         .method30255(var0);
      Class8888.method32341(Items.field37920)
         .method32344(Blocks.ALLIUM)
         .method32349("magenta_dye")
         .method32348("has_red_flower", method14075(Blocks.ALLIUM))
         .method32351(var0, "magenta_dye_from_allium");
      Class8888.method32342(Items.field37920, 4)
         .method32344(Items.field37929)
         .method32345(Items.field37932, 2)
         .method32344(Items.field37918)
         .method32349("magenta_dye")
         .method32348("has_blue_dye", method14075(Items.field37929))
         .method32348("has_rose_red", method14075(Items.field37932))
         .method32348("has_white_dye", method14075(Items.field37918))
         .method32351(var0, "magenta_dye_from_blue_red_white_dye");
      Class8888.method32342(Items.field37920, 3)
         .method32344(Items.field37929)
         .method32344(Items.field37932)
         .method32344(Items.field37924)
         .method32349("magenta_dye")
         .method32348("has_pink_dye", method14075(Items.field37924))
         .method32348("has_blue_dye", method14075(Items.field37929))
         .method32348("has_red_dye", method14075(Items.field37932))
         .method32351(var0, "magenta_dye_from_blue_red_pink");
      Class8888.method32342(Items.field37920, 2)
         .method32344(Blocks.LILAC)
         .method32349("magenta_dye")
         .method32348("has_double_plant", method14075(Blocks.LILAC))
         .method32351(var0, "magenta_dye_from_lilac");
      Class8888.method32342(Items.field37920, 2)
         .method32344(Items.field37928)
         .method32344(Items.field37924)
         .method32349("magenta_dye")
         .method32348("has_pink_dye", method14075(Items.field37924))
         .method32348("has_purple_dye", method14075(Items.field37928))
         .method32351(var0, "magenta_dye_from_purple_and_pink");
      Class8528.method30247(Blocks.MAGMA_BLOCK)
         .method30250('#', Items.field37976)
         .method30252("##")
         .method30252("##")
         .method30253("has_magma_cream", method14075(Items.field37976))
         .method30255(var0);
      Class8888.method32341(Items.field37976)
         .method32344(Items.field37975)
         .method32344(Items.field37901)
         .method32348("has_blaze_powder", method14075(Items.field37975))
         .method32350(var0);
      Class8528.method30247(Items.field38056)
         .method30250('#', Items.field37899)
         .method30250('X', Items.COMPASS)
         .method30252("###")
         .method30252("#X#")
         .method30252("###")
         .method30253("has_compass", method14075(Items.COMPASS))
         .method30255(var0);
      Class8528.method30247(Blocks.MELON)
         .method30250('M', Items.field37957)
         .method30252("MMM")
         .method30252("MMM")
         .method30252("MMM")
         .method30253("has_melon", method14075(Items.field37957))
         .method30255(var0);
      Class8888.method32341(Items.field37960)
         .method32344(Items.field37957)
         .method32348("has_melon", method14075(Items.field37957))
         .method32350(var0);
      Class8528.method30247(Items.MINECART)
         .method30250('#', Items.IRON_INGOT)
         .method30252("# #")
         .method30252("###")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8888.method32341(Blocks.MOSSY_COBBLESTONE)
         .method32344(Blocks.COBBLESTONE)
         .method32344(Blocks.VINE)
         .method32348("has_vine", method14075(Blocks.VINE))
         .method32350(var0);
      Class8528.method30248(Blocks.MOSSY_COBBLESTONE_WALL, 6)
         .method30250('#', Blocks.MOSSY_COBBLESTONE)
         .method30252("###")
         .method30252("###")
         .method30253("has_mossy_cobblestone", method14075(Blocks.MOSSY_COBBLESTONE))
         .method30255(var0);
      Class8888.method32341(Blocks.MOSSY_STONE_BRICKS)
         .method32344(Blocks.STONE_BRICKS)
         .method32344(Blocks.VINE)
         .method32348("has_mossy_cobblestone", method14075(Blocks.MOSSY_COBBLESTONE))
         .method32350(var0);
      Class8888.method32341(Items.field37837)
         .method32344(Blocks.BROWN_MUSHROOM)
         .method32344(Blocks.RED_MUSHROOM)
         .method32344(Items.field37836)
         .method32348("has_mushroom_stew", method14075(Items.field37837))
         .method32348("has_bowl", method14075(Items.field37836))
         .method32348("has_brown_mushroom", method14075(Blocks.BROWN_MUSHROOM))
         .method32348("has_red_mushroom", method14075(Blocks.RED_MUSHROOM))
         .method32350(var0);
      Class8528.method30247(Blocks.NETHER_BRICKS)
         .method30250('N', Items.field38071)
         .method30252("NN")
         .method30252("NN")
         .method30253("has_netherbrick", method14075(Items.field38071))
         .method30255(var0);
      Class8528.method30248(Blocks.NETHER_BRICK_FENCE, 6)
         .method30250('#', Blocks.NETHER_BRICKS)
         .method30250('-', Items.field38071)
         .method30252("#-#")
         .method30252("#-#")
         .method30253("has_nether_brick", method14075(Blocks.NETHER_BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.NETHER_BRICK_SLAB, 6)
         .method30250('#', Blocks.NETHER_BRICKS)
         .method30252("###")
         .method30253("has_nether_brick", method14075(Blocks.NETHER_BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.NETHER_BRICK_STAIRS, 4)
         .method30250('#', Blocks.NETHER_BRICKS)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_nether_brick", method14075(Blocks.NETHER_BRICKS))
         .method30255(var0);
      Class8528.method30247(Blocks.NETHER_WART_BLOCK)
         .method30250('#', Items.field37970)
         .method30252("###")
         .method30252("###")
         .method30252("###")
         .method30253("has_nether_wart", method14075(Items.field37970))
         .method30255(var0);
      Class8528.method30247(Blocks.NOTE_BLOCK)
         .method30249('#', ItemTags.PLANKS)
         .method30250('X', Items.REDSTONE_DUST)
         .method30252("###")
         .method30252("#X#")
         .method30252("###")
         .method30253("has_redstone", method14075(Items.REDSTONE_DUST))
         .method30255(var0);
      Class8528.method30247(Blocks.OBSERVER)
         .method30250('Q', Items.field38072)
         .method30250('R', Items.REDSTONE_DUST)
         .method30250('#', Blocks.COBBLESTONE)
         .method30252("###")
         .method30252("RRQ")
         .method30252("###")
         .method30253("has_quartz", method14075(Items.field38072))
         .method30255(var0);
      Class8888.method32341(Items.field37919)
         .method32344(Blocks.ORANGE_TULIP)
         .method32349("orange_dye")
         .method32348("has_red_flower", method14075(Blocks.ORANGE_TULIP))
         .method32351(var0, "orange_dye_from_orange_tulip");
      Class8888.method32342(Items.field37919, 2)
         .method32344(Items.field37932)
         .method32344(Items.field37922)
         .method32349("orange_dye")
         .method32348("has_red_dye", method14075(Items.field37932))
         .method32348("has_yellow_dye", method14075(Items.field37922))
         .method32351(var0, "orange_dye_from_red_yellow");
      Class8528.method30247(Items.PAINTING)
         .method30250('#', Items.field37835)
         .method30251('X', Ingredient.fromTag(ItemTags.field26070))
         .method30252("###")
         .method30252("#X#")
         .method30252("###")
         .method30253("has_wool", method14076(ItemTags.field26070))
         .method30255(var0);
      Class8528.method30248(Items.field37899, 3)
         .method30250('#', Blocks.SUGAR_CANE)
         .method30252("###")
         .method30253("has_reeds", method14075(Blocks.SUGAR_CANE))
         .method30255(var0);
      Class8528.method30248(Blocks.QUARTZ_PILLAR, 2)
         .method30250('#', Blocks.QUARTZ_BLOCK)
         .method30252("#")
         .method30252("#")
         .method30253("has_chiseled_quartz_block", method14075(Blocks.CHISELED_QUARTZ_BLOCK))
         .method30253("has_quartz_block", method14075(Blocks.QUARTZ_BLOCK))
         .method30253("has_quartz_pillar", method14075(Blocks.QUARTZ_PILLAR))
         .method30255(var0);
      Class8888.method32341(Blocks.PACKED_ICE)
         .method32345(Blocks.ICE, 9)
         .method32348("has_ice", method14075(Blocks.ICE))
         .method32350(var0);
      Class8888.method32342(Items.field37924, 2)
         .method32344(Blocks.PEONY)
         .method32349("pink_dye")
         .method32348("has_double_plant", method14075(Blocks.PEONY))
         .method32351(var0, "pink_dye_from_peony");
      Class8888.method32341(Items.field37924)
         .method32344(Blocks.PINK_TULIP)
         .method32349("pink_dye")
         .method32348("has_red_flower", method14075(Blocks.PINK_TULIP))
         .method32351(var0, "pink_dye_from_pink_tulip");
      Class8888.method32342(Items.field37924, 2)
         .method32344(Items.field37932)
         .method32344(Items.field37918)
         .method32349("pink_dye")
         .method32348("has_white_dye", method14075(Items.field37918))
         .method32348("has_red_dye", method14075(Items.field37932))
         .method32351(var0, "pink_dye_from_red_white_dye");
      Class8528.method30247(Blocks.PISTON)
         .method30250('R', Items.REDSTONE_DUST)
         .method30250('#', Blocks.COBBLESTONE)
         .method30249('T', ItemTags.PLANKS)
         .method30250('X', Items.IRON_INGOT)
         .method30252("TTT")
         .method30252("#X#")
         .method30252("#R#")
         .method30253("has_redstone", method14075(Items.REDSTONE_DUST))
         .method30255(var0);
      Class8528.method30248(Blocks.POLISHED_BASALT, 4)
         .method30250('S', Blocks.BASALT)
         .method30252("SS")
         .method30252("SS")
         .method30253("has_basalt", method14075(Blocks.BASALT))
         .method30255(var0);
      Class8528.method30248(Blocks.POLISHED_GRANITE, 4)
         .method30250('S', Blocks.GRANITE)
         .method30252("SS")
         .method30252("SS")
         .method30253("has_stone", method14075(Blocks.GRANITE))
         .method30255(var0);
      Class8528.method30248(Blocks.POLISHED_DIORITE, 4)
         .method30250('S', Blocks.DIORITE)
         .method30252("SS")
         .method30252("SS")
         .method30253("has_stone", method14075(Blocks.DIORITE))
         .method30255(var0);
      Class8528.method30248(Blocks.POLISHED_ANDESITE, 4)
         .method30250('S', Blocks.ANDESITE)
         .method30252("SS")
         .method30252("SS")
         .method30253("has_stone", method14075(Blocks.ANDESITE))
         .method30255(var0);
      Class8528.method30247(Blocks.PRISMARINE)
         .method30250('S', Items.field38075)
         .method30252("SS")
         .method30252("SS")
         .method30253("has_prismarine_shard", method14075(Items.field38075))
         .method30255(var0);
      Class8528.method30247(Blocks.PRISMARINE_BRICKS)
         .method30250('S', Items.field38075)
         .method30252("SSS")
         .method30252("SSS")
         .method30252("SSS")
         .method30253("has_prismarine_shard", method14075(Items.field38075))
         .method30255(var0);
      Class8528.method30248(Blocks.PRISMARINE_SLAB, 6)
         .method30250('#', Blocks.PRISMARINE)
         .method30252("###")
         .method30253("has_prismarine", method14075(Blocks.PRISMARINE))
         .method30255(var0);
      Class8528.method30248(Blocks.PRISMARINE_BRICK_SLAB, 6)
         .method30250('#', Blocks.PRISMARINE_BRICKS)
         .method30252("###")
         .method30253("has_prismarine_bricks", method14075(Blocks.PRISMARINE_BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.DARK_PRISMARINE_SLAB, 6)
         .method30250('#', Blocks.DARK_PRISMARINE)
         .method30252("###")
         .method30253("has_dark_prismarine", method14075(Blocks.DARK_PRISMARINE))
         .method30255(var0);
      Class8888.method32341(Items.field38067)
         .method32344(Blocks.PUMPKIN)
         .method32344(Items.field37936)
         .method32344(Items.EGG)
         .method32348("has_carved_pumpkin", method14075(Blocks.CARVED_PUMPKIN))
         .method32348("has_pumpkin", method14075(Blocks.PUMPKIN))
         .method32350(var0);
      Class8888.method32342(Items.field37959, 4)
         .method32344(Blocks.PUMPKIN)
         .method32348("has_pumpkin", method14075(Blocks.PUMPKIN))
         .method32350(var0);
      Class8888.method32342(Items.field37928, 2)
         .method32344(Items.field37929)
         .method32344(Items.field37932)
         .method32348("has_blue_dye", method14075(Items.field37929))
         .method32348("has_red_dye", method14075(Items.field37932))
         .method32350(var0);
      Class8528.method30247(Blocks.SHULKER_BOX)
         .method30250('#', Blocks.CHEST)
         .method30250('-', Items.field38127)
         .method30252("-")
         .method30252("#")
         .method30252("-")
         .method30253("has_shulker_shell", method14075(Items.field38127))
         .method30255(var0);
      Class8528.method30248(Blocks.PURPUR_BLOCK, 4)
         .method30250('F', Items.field38110)
         .method30252("FF")
         .method30252("FF")
         .method30253("has_chorus_fruit_popped", method14075(Items.field38110))
         .method30255(var0);
      Class8528.method30247(Blocks.PURPUR_PILLAR)
         .method30250('#', Blocks.PURPUR_SLAB)
         .method30252("#")
         .method30252("#")
         .method30253("has_purpur_block", method14075(Blocks.PURPUR_BLOCK))
         .method30255(var0);
      Class8528.method30248(Blocks.PURPUR_SLAB, 6)
         .method30251('#', Ingredient.fromItems(Blocks.PURPUR_BLOCK, Blocks.PURPUR_PILLAR))
         .method30252("###")
         .method30253("has_purpur_block", method14075(Blocks.PURPUR_BLOCK))
         .method30255(var0);
      Class8528.method30248(Blocks.PURPUR_STAIRS, 4)
         .method30251('#', Ingredient.fromItems(Blocks.PURPUR_BLOCK, Blocks.PURPUR_PILLAR))
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_purpur_block", method14075(Blocks.PURPUR_BLOCK))
         .method30255(var0);
      Class8528.method30247(Blocks.QUARTZ_BLOCK)
         .method30250('#', Items.field38072)
         .method30252("##")
         .method30252("##")
         .method30253("has_quartz", method14075(Items.field38072))
         .method30255(var0);
      Class8528.method30248(Blocks.QUARTZ_BRICKS, 4)
         .method30250('#', Blocks.QUARTZ_BLOCK)
         .method30252("##")
         .method30252("##")
         .method30253("has_quartz_block", method14075(Blocks.QUARTZ_BLOCK))
         .method30255(var0);
      Class8528.method30248(Blocks.QUARTZ_SLAB, 6)
         .method30251('#', Ingredient.fromItems(Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_PILLAR))
         .method30252("###")
         .method30253("has_chiseled_quartz_block", method14075(Blocks.CHISELED_QUARTZ_BLOCK))
         .method30253("has_quartz_block", method14075(Blocks.QUARTZ_BLOCK))
         .method30253("has_quartz_pillar", method14075(Blocks.QUARTZ_PILLAR))
         .method30255(var0);
      Class8528.method30248(Blocks.QUARTZ_STAIRS, 4)
         .method30251('#', Ingredient.fromItems(Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_PILLAR))
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_chiseled_quartz_block", method14075(Blocks.CHISELED_QUARTZ_BLOCK))
         .method30253("has_quartz_block", method14075(Blocks.QUARTZ_BLOCK))
         .method30253("has_quartz_pillar", method14075(Blocks.QUARTZ_PILLAR))
         .method30255(var0);
      Class8888.method32341(Items.field38079)
         .method32344(Items.field38054)
         .method32344(Items.field38078)
         .method32344(Items.field37836)
         .method32344(Items.field38052)
         .method32344(Blocks.BROWN_MUSHROOM)
         .method32349("rabbit_stew")
         .method32348("has_cooked_rabbit", method14075(Items.field38078))
         .method32351(var0, "rabbit_stew_from_brown_mushroom");
      Class8888.method32341(Items.field38079)
         .method32344(Items.field38054)
         .method32344(Items.field38078)
         .method32344(Items.field37836)
         .method32344(Items.field38052)
         .method32344(Blocks.RED_MUSHROOM)
         .method32349("rabbit_stew")
         .method32348("has_cooked_rabbit", method14075(Items.field38078))
         .method32351(var0, "rabbit_stew_from_red_mushroom");
      Class8528.method30248(Blocks.RAIL, 16)
         .method30250('#', Items.field37835)
         .method30250('X', Items.IRON_INGOT)
         .method30252("X X")
         .method30252("X#X")
         .method30252("X X")
         .method30253("has_minecart", method14075(Items.MINECART))
         .method30255(var0);
      Class8888.method32342(Items.REDSTONE_DUST, 9)
         .method32344(Blocks.REDSTONE_BLOCK)
         .method32348("has_redstone_block", method14075(Blocks.REDSTONE_BLOCK))
         .method32350(var0);
      Class8528.method30247(Blocks.REDSTONE_BLOCK)
         .method30250('#', Items.REDSTONE_DUST)
         .method30252("###")
         .method30252("###")
         .method30252("###")
         .method30253("has_redstone", method14075(Items.REDSTONE_DUST))
         .method30255(var0);
      Class8528.method30247(Blocks.REDSTONE_LAMP)
         .method30250('R', Items.REDSTONE_DUST)
         .method30250('G', Blocks.GLOWSTONE)
         .method30252(" R ")
         .method30252("RGR")
         .method30252(" R ")
         .method30253("has_glowstone", method14075(Blocks.GLOWSTONE))
         .method30255(var0);
      Class8528.method30247(Blocks.REDSTONE_TORCH)
         .method30250('#', Items.field37835)
         .method30250('X', Items.REDSTONE_DUST)
         .method30252("X")
         .method30252("#")
         .method30253("has_redstone", method14075(Items.REDSTONE_DUST))
         .method30255(var0);
      Class8888.method32341(Items.field37932)
         .method32344(Items.field38111)
         .method32349("red_dye")
         .method32348("has_beetroot", method14075(Items.field38111))
         .method32351(var0, "red_dye_from_beetroot");
      Class8888.method32341(Items.field37932)
         .method32344(Blocks.POPPY)
         .method32349("red_dye")
         .method32348("has_red_flower", method14075(Blocks.POPPY))
         .method32351(var0, "red_dye_from_poppy");
      Class8888.method32342(Items.field37932, 2)
         .method32344(Blocks.ROSE_BUSH)
         .method32349("red_dye")
         .method32348("has_double_plant", method14075(Blocks.ROSE_BUSH))
         .method32351(var0, "red_dye_from_rose_bush");
      Class8888.method32341(Items.field37932)
         .method32344(Blocks.RED_TULIP)
         .method32349("red_dye")
         .method32348("has_red_flower", method14075(Blocks.RED_TULIP))
         .method32351(var0, "red_dye_from_tulip");
      Class8528.method30247(Blocks.RED_NETHER_BRICKS)
         .method30250('W', Items.field37970)
         .method30250('N', Items.field38071)
         .method30252("NW")
         .method30252("WN")
         .method30253("has_nether_wart", method14075(Items.field37970))
         .method30255(var0);
      Class8528.method30247(Blocks.RED_SANDSTONE)
         .method30250('#', Blocks.RED_SAND)
         .method30252("##")
         .method30252("##")
         .method30253("has_sand", method14075(Blocks.RED_SAND))
         .method30255(var0);
      Class8528.method30248(Blocks.RED_SANDSTONE_SLAB, 6)
         .method30251('#', Ingredient.fromItems(Blocks.RED_SANDSTONE, Blocks.CHISELED_RED_SANDSTONE))
         .method30252("###")
         .method30253("has_red_sandstone", method14075(Blocks.RED_SANDSTONE))
         .method30253("has_chiseled_red_sandstone", method14075(Blocks.CHISELED_RED_SANDSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.CUT_RED_SANDSTONE_SLAB, 6)
         .method30250('#', Blocks.CUT_RED_SANDSTONE)
         .method30252("###")
         .method30253("has_cut_red_sandstone", method14075(Blocks.CUT_RED_SANDSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.RED_SANDSTONE_STAIRS, 4)
         .method30251('#', Ingredient.fromItems(Blocks.RED_SANDSTONE, Blocks.CHISELED_RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE))
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_red_sandstone", method14075(Blocks.RED_SANDSTONE))
         .method30253("has_chiseled_red_sandstone", method14075(Blocks.CHISELED_RED_SANDSTONE))
         .method30253("has_cut_red_sandstone", method14075(Blocks.CUT_RED_SANDSTONE))
         .method30255(var0);
      Class8528.method30247(Blocks.REPEATER)
         .method30250('#', Blocks.REDSTONE_TORCH)
         .method30250('X', Items.REDSTONE_DUST)
         .method30250('I', Blocks.STONE)
         .method30252("#X#")
         .method30252("III")
         .method30253("has_redstone_torch", method14075(Blocks.REDSTONE_TORCH))
         .method30255(var0);
      Class8528.method30247(Blocks.SANDSTONE)
         .method30250('#', Blocks.SAND)
         .method30252("##")
         .method30252("##")
         .method30253("has_sand", method14075(Blocks.SAND))
         .method30255(var0);
      Class8528.method30248(Blocks.SANDSTONE_SLAB, 6)
         .method30251('#', Ingredient.fromItems(Blocks.SANDSTONE, Blocks.CHISELED_SANDSTONE))
         .method30252("###")
         .method30253("has_sandstone", method14075(Blocks.SANDSTONE))
         .method30253("has_chiseled_sandstone", method14075(Blocks.CHISELED_SANDSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.CUT_SANDSTONE_SLAB, 6)
         .method30250('#', Blocks.CUT_SANDSTONE)
         .method30252("###")
         .method30253("has_cut_sandstone", method14075(Blocks.CUT_SANDSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.SANDSTONE_STAIRS, 4)
         .method30251('#', Ingredient.fromItems(Blocks.SANDSTONE, Blocks.CHISELED_SANDSTONE, Blocks.CUT_SANDSTONE))
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_sandstone", method14075(Blocks.SANDSTONE))
         .method30253("has_chiseled_sandstone", method14075(Blocks.CHISELED_SANDSTONE))
         .method30253("has_cut_sandstone", method14075(Blocks.CUT_SANDSTONE))
         .method30255(var0);
      Class8528.method30247(Blocks.SEA_LANTERN)
         .method30250('S', Items.field38075)
         .method30250('C', Items.field38076)
         .method30252("SCS")
         .method30252("CCC")
         .method30252("SCS")
         .method30253("has_prismarine_crystals", method14075(Items.field38076))
         .method30255(var0);
      Class8528.method30247(Items.field37956)
         .method30250('#', Items.IRON_INGOT)
         .method30252(" #")
         .method30252("# ")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8528.method30247(Items.field38119)
         .method30249('W', ItemTags.PLANKS)
         .method30250('o', Items.IRON_INGOT)
         .method30252("WoW")
         .method30252("WWW")
         .method30252(" W ")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8528.method30247(Blocks.SLIME_BLOCK)
         .method30250('#', Items.field37901)
         .method30252("###")
         .method30252("###")
         .method30252("###")
         .method30253("has_slime_ball", method14075(Items.field37901))
         .method30255(var0);
      Class8888.method32342(Items.field37901, 9)
         .method32344(Blocks.SLIME_BLOCK)
         .method32348("has_slime", method14075(Blocks.SLIME_BLOCK))
         .method32350(var0);
      Class8528.method30248(Blocks.CUT_RED_SANDSTONE, 4)
         .method30250('#', Blocks.RED_SANDSTONE)
         .method30252("##")
         .method30252("##")
         .method30253("has_red_sandstone", method14075(Blocks.RED_SANDSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.CUT_SANDSTONE, 4)
         .method30250('#', Blocks.SANDSTONE)
         .method30252("##")
         .method30252("##")
         .method30253("has_sandstone", method14075(Blocks.SANDSTONE))
         .method30255(var0);
      Class8528.method30247(Blocks.SNOW_BLOCK)
         .method30250('#', Items.SNOWBALL)
         .method30252("##")
         .method30252("##")
         .method30253("has_snowball", method14075(Items.SNOWBALL))
         .method30255(var0);
      Class8528.method30248(Blocks.SNOW, 6)
         .method30250('#', Blocks.SNOW_BLOCK)
         .method30252("###")
         .method30253("has_snowball", method14075(Items.SNOWBALL))
         .method30255(var0);
      Class8528.method30247(Blocks.SOUL_CAMPFIRE)
         .method30249('L', ItemTags.field26085)
         .method30250('S', Items.field37835)
         .method30249('#', ItemTags.field26112)
         .method30252(" S ")
         .method30252("S#S")
         .method30252("LLL")
         .method30253("has_stick", method14075(Items.field37835))
         .method30253("has_soul_sand", method14076(ItemTags.field26112))
         .method30255(var0);
      Class8528.method30247(Items.field37980)
         .method30250('#', Items.field37969)
         .method30250('X', Items.field37957)
         .method30252("###")
         .method30252("#X#")
         .method30252("###")
         .method30253("has_melon", method14075(Items.field37957))
         .method30255(var0);
      Class8528.method30248(Items.field38116, 2)
         .method30250('#', Items.field37908)
         .method30250('X', Items.ARROW)
         .method30252(" # ")
         .method30252("#X#")
         .method30252(" # ")
         .method30253("has_glowstone_dust", method14075(Items.field37908))
         .method30255(var0);
      Class8528.method30248(Items.field37835, 4)
         .method30249('#', ItemTags.PLANKS)
         .method30252("#")
         .method30252("#")
         .method30254("sticks")
         .method30253("has_planks", method14076(ItemTags.PLANKS))
         .method30255(var0);
      Class8528.method30248(Items.field37835, 1)
         .method30250('#', Blocks.BAMBOO)
         .method30252("#")
         .method30252("#")
         .method30254("sticks")
         .method30253("has_bamboo", method14075(Blocks.BAMBOO))
         .method30256(var0, "stick_from_bamboo_item");
      Class8528.method30247(Blocks.STICKY_PISTON)
         .method30250('P', Blocks.PISTON)
         .method30250('S', Items.field37901)
         .method30252("S")
         .method30252("P")
         .method30253("has_slime_ball", method14075(Items.field37901))
         .method30255(var0);
      Class8528.method30248(Blocks.STONE_BRICKS, 4)
         .method30250('#', Blocks.STONE)
         .method30252("##")
         .method30252("##")
         .method30253("has_stone", method14075(Blocks.STONE))
         .method30255(var0);
      Class8528.method30247(Items.field37813)
         .method30250('#', Items.field37835)
         .method30249('X', ItemTags.STONE_TOOL_MATERIALS)
         .method30252("XX")
         .method30252("X#")
         .method30252(" #")
         .method30253("has_cobblestone", method14076(ItemTags.STONE_TOOL_MATERIALS))
         .method30255(var0);
      Class8528.method30248(Blocks.STONE_BRICK_SLAB, 6)
         .method30250('#', Blocks.STONE_BRICKS)
         .method30252("###")
         .method30253("has_stone_bricks", method14076(ItemTags.field26072))
         .method30255(var0);
      Class8528.method30248(Blocks.STONE_BRICK_STAIRS, 4)
         .method30250('#', Blocks.STONE_BRICKS)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_stone_bricks", method14076(ItemTags.field26072))
         .method30255(var0);
      Class8888.method32341(Blocks.STONE_BUTTON)
         .method32344(Blocks.STONE)
         .method32348("has_stone", method14075(Blocks.STONE))
         .method32350(var0);
      Class8528.method30247(Items.field37814)
         .method30250('#', Items.field37835)
         .method30249('X', ItemTags.STONE_TOOL_MATERIALS)
         .method30252("XX")
         .method30252(" #")
         .method30252(" #")
         .method30253("has_cobblestone", method14076(ItemTags.STONE_TOOL_MATERIALS))
         .method30255(var0);
      Class8528.method30247(Items.STONE_PICKAXE)
         .method30250('#', Items.field37835)
         .method30249('X', ItemTags.STONE_TOOL_MATERIALS)
         .method30252("XXX")
         .method30252(" # ")
         .method30252(" # ")
         .method30253("has_cobblestone", method14076(ItemTags.STONE_TOOL_MATERIALS))
         .method30255(var0);
      Class8528.method30247(Blocks.STONE_PRESSURE_PLATE)
         .method30250('#', Blocks.STONE)
         .method30252("##")
         .method30253("has_stone", method14075(Blocks.STONE))
         .method30255(var0);
      Class8528.method30247(Items.STONE_SHOVEL)
         .method30250('#', Items.field37835)
         .method30249('X', ItemTags.STONE_TOOL_MATERIALS)
         .method30252("X")
         .method30252("#")
         .method30252("#")
         .method30253("has_cobblestone", method14076(ItemTags.STONE_TOOL_MATERIALS))
         .method30255(var0);
      Class8528.method30248(Blocks.STONE_SLAB, 6)
         .method30250('#', Blocks.STONE)
         .method30252("###")
         .method30253("has_stone", method14075(Blocks.STONE))
         .method30255(var0);
      Class8528.method30248(Blocks.SMOOTH_STONE_SLAB, 6)
         .method30250('#', Blocks.SMOOTH_STONE)
         .method30252("###")
         .method30253("has_smooth_stone", method14075(Blocks.SMOOTH_STONE))
         .method30255(var0);
      Class8528.method30248(Blocks.COBBLESTONE_STAIRS, 4)
         .method30250('#', Blocks.COBBLESTONE)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_cobblestone", method14075(Blocks.COBBLESTONE))
         .method30255(var0);
      Class8528.method30247(Items.STONE_SWORD)
         .method30250('#', Items.field37835)
         .method30249('X', ItemTags.STONE_TOOL_MATERIALS)
         .method30252("X")
         .method30252("X")
         .method30252("#")
         .method30253("has_cobblestone", method14076(ItemTags.STONE_TOOL_MATERIALS))
         .method30255(var0);
      Class8528.method30247(Blocks.WHITE_WOOL)
         .method30250('#', Items.field37838)
         .method30252("##")
         .method30252("##")
         .method30253("has_string", method14075(Items.field37838))
         .method30256(var0, "white_wool_from_string");
      Class8888.method32341(Items.field37936)
         .method32344(Blocks.SUGAR_CANE)
         .method32349("sugar")
         .method32348("has_reeds", method14075(Blocks.SUGAR_CANE))
         .method32351(var0, "sugar_from_sugar_cane");
      Class8888.method32342(Items.field37936, 3)
         .method32344(Items.field38177)
         .method32349("sugar")
         .method32348("has_honey_bottle", method14075(Items.field38177))
         .method32351(var0, "sugar_from_honey_bottle");
      Class8528.method30247(Blocks.TARGET)
         .method30250('H', Items.field37571)
         .method30250('R', Items.REDSTONE_DUST)
         .method30252(" R ")
         .method30252("RHR")
         .method30252(" R ")
         .method30253("has_redstone", method14075(Items.REDSTONE_DUST))
         .method30253("has_hay_block", method14075(Blocks.HAY_BLOCK))
         .method30255(var0);
      Class8528.method30247(Blocks.TNT)
         .method30251('#', Ingredient.fromItems(Blocks.SAND, Blocks.RED_SAND))
         .method30250('X', Items.field37840)
         .method30252("X#X")
         .method30252("#X#")
         .method30252("X#X")
         .method30253("has_gunpowder", method14075(Items.field37840))
         .method30255(var0);
      Class8528.method30247(Items.TNT_MINECART)
         .method30250('A', Blocks.TNT)
         .method30250('B', Items.MINECART)
         .method30252("A")
         .method30252("B")
         .method30253("has_minecart", method14075(Items.MINECART))
         .method30255(var0);
      Class8528.method30248(Blocks.TORCH, 4)
         .method30250('#', Items.field37835)
         .method30251('X', Ingredient.fromItems(Items.COAL, Items.CHARCOAL))
         .method30252("X")
         .method30252("#")
         .method30253("has_stone_pickaxe", method14075(Items.STONE_PICKAXE))
         .method30255(var0);
      Class8528.method30248(Blocks.SOUL_TORCH, 4)
         .method30251('X', Ingredient.fromItems(Items.COAL, Items.CHARCOAL))
         .method30250('#', Items.field37835)
         .method30249('S', ItemTags.field26112)
         .method30252("X")
         .method30252("#")
         .method30252("S")
         .method30253("has_soul_sand", method14076(ItemTags.field26112))
         .method30255(var0);
      Class8528.method30247(Blocks.LANTERN)
         .method30250('#', Items.TORCH)
         .method30250('X', Items.field38128)
         .method30252("XXX")
         .method30252("X#X")
         .method30252("XXX")
         .method30253("has_iron_nugget", method14075(Items.field38128))
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8528.method30247(Blocks.SOUL_LANTERN)
         .method30250('#', Items.field37445)
         .method30250('X', Items.field38128)
         .method30252("XXX")
         .method30252("X#X")
         .method30252("XXX")
         .method30253("has_soul_torch", method14075(Items.field37445))
         .method30255(var0);
      Class8888.method32341(Blocks.TRAPPED_CHEST)
         .method32344(Blocks.CHEST)
         .method32344(Blocks.TRIPWIRE_HOOK)
         .method32348("has_tripwire_hook", method14075(Blocks.TRIPWIRE_HOOK))
         .method32350(var0);
      Class8528.method30248(Blocks.TRIPWIRE_HOOK, 2)
         .method30249('#', ItemTags.PLANKS)
         .method30250('S', Items.field37835)
         .method30250('I', Items.IRON_INGOT)
         .method30252("I")
         .method30252("S")
         .method30252("#")
         .method30253("has_string", method14075(Items.field37838))
         .method30255(var0);
      Class8528.method30247(Items.TURTLE_HELMET)
         .method30250('X', Items.SCUTE)
         .method30252("XXX")
         .method30252("X X")
         .method30253("has_scute", method14075(Items.SCUTE))
         .method30255(var0);
      Class8888.method32342(Items.field37842, 9)
         .method32344(Blocks.HAY_BLOCK)
         .method32348("has_hay_block", method14075(Blocks.HAY_BLOCK))
         .method32350(var0);
      Class8888.method32341(Items.field37918)
         .method32344(Items.field37934)
         .method32349("white_dye")
         .method32348("has_bone_meal", method14075(Items.field37934))
         .method32350(var0);
      Class8888.method32341(Items.field37918)
         .method32344(Blocks.LILY_OF_THE_VALLEY)
         .method32349("white_dye")
         .method32348("has_white_flower", method14075(Blocks.LILY_OF_THE_VALLEY))
         .method32351(var0, "white_dye_from_lily_of_the_valley");
      Class8528.method30247(Items.WOODEN_AXE)
         .method30250('#', Items.field37835)
         .method30249('X', ItemTags.PLANKS)
         .method30252("XX")
         .method30252("X#")
         .method30252(" #")
         .method30253("has_stick", method14075(Items.field37835))
         .method30255(var0);
      Class8528.method30247(Items.WOODEN_HOE)
         .method30250('#', Items.field37835)
         .method30249('X', ItemTags.PLANKS)
         .method30252("XX")
         .method30252(" #")
         .method30252(" #")
         .method30253("has_stick", method14075(Items.field37835))
         .method30255(var0);
      Class8528.method30247(Items.WOODEN_PICKAXE)
         .method30250('#', Items.field37835)
         .method30249('X', ItemTags.PLANKS)
         .method30252("XXX")
         .method30252(" # ")
         .method30252(" # ")
         .method30253("has_stick", method14075(Items.field37835))
         .method30255(var0);
      Class8528.method30247(Items.WOODEN_SHOVEL)
         .method30250('#', Items.field37835)
         .method30249('X', ItemTags.PLANKS)
         .method30252("X")
         .method30252("#")
         .method30252("#")
         .method30253("has_stick", method14075(Items.field37835))
         .method30255(var0);
      Class8528.method30247(Items.WOODEN_SWORD)
         .method30250('#', Items.field37835)
         .method30249('X', ItemTags.PLANKS)
         .method30252("X")
         .method30252("X")
         .method30252("#")
         .method30253("has_stick", method14075(Items.field37835))
         .method30255(var0);
      Class8888.method32341(Items.field38047)
         .method32344(Items.field37900)
         .method32344(Items.field37915)
         .method32344(Items.field37839)
         .method32348("has_book", method14075(Items.field37900))
         .method32350(var0);
      Class8888.method32341(Items.field37922)
         .method32344(Blocks.DANDELION)
         .method32349("yellow_dye")
         .method32348("has_yellow_flower", method14075(Blocks.DANDELION))
         .method32351(var0, "yellow_dye_from_dandelion");
      Class8888.method32342(Items.field37922, 2)
         .method32344(Blocks.SUNFLOWER)
         .method32349("yellow_dye")
         .method32348("has_double_plant", method14075(Blocks.SUNFLOWER))
         .method32351(var0, "yellow_dye_from_sunflower");
      Class8888.method32342(Items.field37958, 9)
         .method32344(Blocks.DRIED_KELP_BLOCK)
         .method32348("has_dried_kelp_block", method14075(Blocks.DRIED_KELP_BLOCK))
         .method32350(var0);
      Class8888.method32341(Blocks.DRIED_KELP_BLOCK)
         .method32345(Items.field37958, 9)
         .method32348("has_dried_kelp", method14075(Items.field37958))
         .method32350(var0);
      Class8528.method30247(Blocks.CONDUIT)
         .method30250('#', Items.field38146)
         .method30250('X', Items.field38147)
         .method30252("###")
         .method30252("#X#")
         .method30252("###")
         .method30253("has_nautilus_core", method14075(Items.field38147))
         .method30253("has_nautilus_shell", method14075(Items.field38146))
         .method30255(var0);
      Class8528.method30248(Blocks.POLISHED_GRANITE_STAIRS, 4)
         .method30250('#', Blocks.POLISHED_GRANITE)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_polished_granite", method14075(Blocks.POLISHED_GRANITE))
         .method30255(var0);
      Class8528.method30248(Blocks.SMOOTH_RED_SANDSTONE_STAIRS, 4)
         .method30250('#', Blocks.SMOOTH_RED_SANDSTONE)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_smooth_red_sandstone", method14075(Blocks.SMOOTH_RED_SANDSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.MOSSY_STONE_BRICK_STAIRS, 4)
         .method30250('#', Blocks.MOSSY_STONE_BRICKS)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_mossy_stone_bricks", method14075(Blocks.MOSSY_STONE_BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.POLISHED_DIORITE_STAIRS, 4)
         .method30250('#', Blocks.POLISHED_DIORITE)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_polished_diorite", method14075(Blocks.POLISHED_DIORITE))
         .method30255(var0);
      Class8528.method30248(Blocks.MOSSY_COBBLESTONE_STAIRS, 4)
         .method30250('#', Blocks.MOSSY_COBBLESTONE)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_mossy_cobblestone", method14075(Blocks.MOSSY_COBBLESTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.END_STONE_BRICK_STAIRS, 4)
         .method30250('#', Blocks.END_STONE_BRICKS)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_end_stone_bricks", method14075(Blocks.END_STONE_BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.STONE_STAIRS, 4)
         .method30250('#', Blocks.STONE)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_stone", method14075(Blocks.STONE))
         .method30255(var0);
      Class8528.method30248(Blocks.SMOOTH_SANDSTONE_STAIRS, 4)
         .method30250('#', Blocks.SMOOTH_SANDSTONE)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_smooth_sandstone", method14075(Blocks.SMOOTH_SANDSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.SMOOTH_QUARTZ_STAIRS, 4)
         .method30250('#', Blocks.SMOOTH_QUARTZ)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_smooth_quartz", method14075(Blocks.SMOOTH_QUARTZ))
         .method30255(var0);
      Class8528.method30248(Blocks.GRANITE_STAIRS, 4)
         .method30250('#', Blocks.GRANITE)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_granite", method14075(Blocks.GRANITE))
         .method30255(var0);
      Class8528.method30248(Blocks.ANDESITE_STAIRS, 4)
         .method30250('#', Blocks.ANDESITE)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_andesite", method14075(Blocks.ANDESITE))
         .method30255(var0);
      Class8528.method30248(Blocks.RED_NETHER_BRICK_STAIRS, 4)
         .method30250('#', Blocks.RED_NETHER_BRICKS)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_red_nether_bricks", method14075(Blocks.RED_NETHER_BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.POLISHED_ANDESITE_STAIRS, 4)
         .method30250('#', Blocks.POLISHED_ANDESITE)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_polished_andesite", method14075(Blocks.POLISHED_ANDESITE))
         .method30255(var0);
      Class8528.method30248(Blocks.DIORITE_STAIRS, 4)
         .method30250('#', Blocks.DIORITE)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_diorite", method14075(Blocks.DIORITE))
         .method30255(var0);
      Class8528.method30248(Blocks.POLISHED_GRANITE_SLAB, 6)
         .method30250('#', Blocks.POLISHED_GRANITE)
         .method30252("###")
         .method30253("has_polished_granite", method14075(Blocks.POLISHED_GRANITE))
         .method30255(var0);
      Class8528.method30248(Blocks.SMOOTH_RED_SANDSTONE_SLAB, 6)
         .method30250('#', Blocks.SMOOTH_RED_SANDSTONE)
         .method30252("###")
         .method30253("has_smooth_red_sandstone", method14075(Blocks.SMOOTH_RED_SANDSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.MOSSY_STONE_BRICK_SLAB, 6)
         .method30250('#', Blocks.MOSSY_STONE_BRICKS)
         .method30252("###")
         .method30253("has_mossy_stone_bricks", method14075(Blocks.MOSSY_STONE_BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.POLISHED_DIORITE_SLAB, 6)
         .method30250('#', Blocks.POLISHED_DIORITE)
         .method30252("###")
         .method30253("has_polished_diorite", method14075(Blocks.POLISHED_DIORITE))
         .method30255(var0);
      Class8528.method30248(Blocks.MOSSY_COBBLESTONE_SLAB, 6)
         .method30250('#', Blocks.MOSSY_COBBLESTONE)
         .method30252("###")
         .method30253("has_mossy_cobblestone", method14075(Blocks.MOSSY_COBBLESTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.END_STONE_BRICK_SLAB, 6)
         .method30250('#', Blocks.END_STONE_BRICKS)
         .method30252("###")
         .method30253("has_end_stone_bricks", method14075(Blocks.END_STONE_BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.SMOOTH_SANDSTONE_SLAB, 6)
         .method30250('#', Blocks.SMOOTH_SANDSTONE)
         .method30252("###")
         .method30253("has_smooth_sandstone", method14075(Blocks.SMOOTH_SANDSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.SMOOTH_QUARTZ_SLAB, 6)
         .method30250('#', Blocks.SMOOTH_QUARTZ)
         .method30252("###")
         .method30253("has_smooth_quartz", method14075(Blocks.SMOOTH_QUARTZ))
         .method30255(var0);
      Class8528.method30248(Blocks.GRANITE_SLAB, 6)
         .method30250('#', Blocks.GRANITE)
         .method30252("###")
         .method30253("has_granite", method14075(Blocks.GRANITE))
         .method30255(var0);
      Class8528.method30248(Blocks.ANDESITE_SLAB, 6)
         .method30250('#', Blocks.ANDESITE)
         .method30252("###")
         .method30253("has_andesite", method14075(Blocks.ANDESITE))
         .method30255(var0);
      Class8528.method30248(Blocks.RED_NETHER_BRICK_SLAB, 6)
         .method30250('#', Blocks.RED_NETHER_BRICKS)
         .method30252("###")
         .method30253("has_red_nether_bricks", method14075(Blocks.RED_NETHER_BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.POLISHED_ANDESITE_SLAB, 6)
         .method30250('#', Blocks.POLISHED_ANDESITE)
         .method30252("###")
         .method30253("has_polished_andesite", method14075(Blocks.POLISHED_ANDESITE))
         .method30255(var0);
      Class8528.method30248(Blocks.DIORITE_SLAB, 6)
         .method30250('#', Blocks.DIORITE)
         .method30252("###")
         .method30253("has_diorite", method14075(Blocks.DIORITE))
         .method30255(var0);
      Class8528.method30248(Blocks.BRICK_WALL, 6)
         .method30250('#', Blocks.BRICKS)
         .method30252("###")
         .method30252("###")
         .method30253("has_bricks", method14075(Blocks.BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.PRISMARINE_WALL, 6)
         .method30250('#', Blocks.PRISMARINE)
         .method30252("###")
         .method30252("###")
         .method30253("has_prismarine", method14075(Blocks.PRISMARINE))
         .method30255(var0);
      Class8528.method30248(Blocks.RED_SANDSTONE_WALL, 6)
         .method30250('#', Blocks.RED_SANDSTONE)
         .method30252("###")
         .method30252("###")
         .method30253("has_red_sandstone", method14075(Blocks.RED_SANDSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.MOSSY_STONE_BRICK_WALL, 6)
         .method30250('#', Blocks.MOSSY_STONE_BRICKS)
         .method30252("###")
         .method30252("###")
         .method30253("has_mossy_stone_bricks", method14075(Blocks.MOSSY_STONE_BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.GRANITE_WALL, 6)
         .method30250('#', Blocks.GRANITE)
         .method30252("###")
         .method30252("###")
         .method30253("has_granite", method14075(Blocks.GRANITE))
         .method30255(var0);
      Class8528.method30248(Blocks.STONE_BRICK_WALL, 6)
         .method30250('#', Blocks.STONE_BRICKS)
         .method30252("###")
         .method30252("###")
         .method30253("has_stone_bricks", method14075(Blocks.STONE_BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.NETHER_BRICK_WALL, 6)
         .method30250('#', Blocks.NETHER_BRICKS)
         .method30252("###")
         .method30252("###")
         .method30253("has_nether_bricks", method14075(Blocks.NETHER_BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.ANDESITE_WALL, 6)
         .method30250('#', Blocks.ANDESITE)
         .method30252("###")
         .method30252("###")
         .method30253("has_andesite", method14075(Blocks.ANDESITE))
         .method30255(var0);
      Class8528.method30248(Blocks.RED_NETHER_BRICK_WALL, 6)
         .method30250('#', Blocks.RED_NETHER_BRICKS)
         .method30252("###")
         .method30252("###")
         .method30253("has_red_nether_bricks", method14075(Blocks.RED_NETHER_BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.SANDSTONE_WALL, 6)
         .method30250('#', Blocks.SANDSTONE)
         .method30252("###")
         .method30252("###")
         .method30253("has_sandstone", method14075(Blocks.SANDSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.END_STONE_BRICK_WALL, 6)
         .method30250('#', Blocks.END_STONE_BRICKS)
         .method30252("###")
         .method30252("###")
         .method30253("has_end_stone_bricks", method14075(Blocks.END_STONE_BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.DIORITE_WALL, 6)
         .method30250('#', Blocks.DIORITE)
         .method30252("###")
         .method30252("###")
         .method30253("has_diorite", method14075(Blocks.DIORITE))
         .method30255(var0);
      Class8888.method32341(Items.field38152)
         .method32344(Items.field37899)
         .method32344(Items.field38062)
         .method32348("has_creeper_head", method14075(Items.field38062))
         .method32350(var0);
      Class8888.method32341(Items.field38153)
         .method32344(Items.field37899)
         .method32344(Items.field38059)
         .method32348("has_wither_skeleton_skull", method14075(Items.field38059))
         .method32350(var0);
      Class8888.method32341(Items.field38151)
         .method32344(Items.field37899)
         .method32344(Blocks.OXEYE_DAISY)
         .method32348("has_oxeye_daisy", method14075(Blocks.OXEYE_DAISY))
         .method32350(var0);
      Class8888.method32341(Items.field38154)
         .method32344(Items.field37899)
         .method32344(Items.ENCHANTED_GOLDEN_APPLE)
         .method32348("has_enchanted_golden_apple", method14075(Items.ENCHANTED_GOLDEN_APPLE))
         .method32350(var0);
      Class8528.method30248(Blocks.SCAFFOLDING, 6)
         .method30250('~', Items.field37838)
         .method30250('I', Blocks.BAMBOO)
         .method30252("I~I")
         .method30252("I I")
         .method30252("I I")
         .method30253("has_bamboo", method14075(Blocks.BAMBOO))
         .method30255(var0);
      Class8528.method30247(Blocks.GRINDSTONE)
         .method30250('I', Items.field37835)
         .method30250('-', Blocks.STONE_SLAB)
         .method30249('#', ItemTags.PLANKS)
         .method30252("I-I")
         .method30252("# #")
         .method30253("has_stone_slab", method14075(Blocks.STONE_SLAB))
         .method30255(var0);
      Class8528.method30247(Blocks.BLAST_FURNACE)
         .method30250('#', Blocks.SMOOTH_STONE)
         .method30250('X', Blocks.FURNACE)
         .method30250('I', Items.IRON_INGOT)
         .method30252("III")
         .method30252("IXI")
         .method30252("###")
         .method30253("has_smooth_stone", method14075(Blocks.SMOOTH_STONE))
         .method30255(var0);
      Class8528.method30247(Blocks.SMOKER)
         .method30249('#', ItemTags.field26085)
         .method30250('X', Blocks.FURNACE)
         .method30252(" # ")
         .method30252("#X#")
         .method30252(" # ")
         .method30253("has_furnace", method14075(Blocks.FURNACE))
         .method30255(var0);
      Class8528.method30247(Blocks.CARTOGRAPHY_TABLE)
         .method30249('#', ItemTags.PLANKS)
         .method30250('@', Items.field37899)
         .method30252("@@")
         .method30252("##")
         .method30252("##")
         .method30253("has_paper", method14075(Items.field37899))
         .method30255(var0);
      Class8528.method30247(Blocks.SMITHING_TABLE)
         .method30249('#', ItemTags.PLANKS)
         .method30250('@', Items.IRON_INGOT)
         .method30252("@@")
         .method30252("##")
         .method30252("##")
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class8528.method30247(Blocks.FLETCHING_TABLE)
         .method30249('#', ItemTags.PLANKS)
         .method30250('@', Items.field37868)
         .method30252("@@")
         .method30252("##")
         .method30252("##")
         .method30253("has_flint", method14075(Items.field37868))
         .method30255(var0);
      Class8528.method30247(Blocks.STONECUTTER)
         .method30250('I', Items.IRON_INGOT)
         .method30250('#', Blocks.STONE)
         .method30252(" I ")
         .method30252("###")
         .method30253("has_stone", method14075(Blocks.STONE))
         .method30255(var0);
      Class8528.method30247(Blocks.LODESTONE)
         .method30250('S', Items.CHISELED_STONE_BRICKS)
         .method30250('#', Items.NETHERITE_INGOT)
         .method30252("SSS")
         .method30252("S#S")
         .method30252("SSS")
         .method30253("has_netherite_ingot", method14075(Items.NETHERITE_INGOT))
         .method30255(var0);
      Class8528.method30247(Blocks.NETHERITE_BLOCK)
         .method30250('#', Items.NETHERITE_INGOT)
         .method30252("###")
         .method30252("###")
         .method30252("###")
         .method30253("has_netherite_ingot", method14075(Items.NETHERITE_INGOT))
         .method30255(var0);
      Class8888.method32342(Items.NETHERITE_INGOT, 9)
         .method32344(Blocks.NETHERITE_BLOCK)
         .method32349("netherite_ingot")
         .method32348("has_netherite_block", method14075(Blocks.NETHERITE_BLOCK))
         .method32351(var0, "netherite_ingot_from_netherite_block");
      Class8888.method32341(Items.NETHERITE_INGOT)
         .method32345(Items.NETHERITE_SCRAP, 4)
         .method32345(Items.GOLD_INGOT, 4)
         .method32349("netherite_ingot")
         .method32348("has_netherite_scrap", method14075(Items.NETHERITE_SCRAP))
         .method32350(var0);
      Class8528.method30247(Blocks.RESPAWN_ANCHOR)
         .method30250('O', Blocks.CRYING_OBSIDIAN)
         .method30250('G', Blocks.GLOWSTONE)
         .method30252("OOO")
         .method30252("GGG")
         .method30252("OOO")
         .method30253("has_obsidian", method14075(Blocks.CRYING_OBSIDIAN))
         .method30255(var0);
      Class8528.method30248(Blocks.BLACKSTONE_STAIRS, 4)
         .method30250('#', Blocks.BLACKSTONE)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_blackstone", method14075(Blocks.BLACKSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.POLISHED_BLACKSTONE_STAIRS, 4)
         .method30250('#', Blocks.POLISHED_BLACKSTONE)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_polished_blackstone", method14075(Blocks.POLISHED_BLACKSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, 4)
         .method30250('#', Blocks.POLISHED_BLACKSTONE_BRICKS)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30253("has_polished_blackstone_bricks", method14075(Blocks.POLISHED_BLACKSTONE_BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.BLACKSTONE_SLAB, 6)
         .method30250('#', Blocks.BLACKSTONE)
         .method30252("###")
         .method30253("has_blackstone", method14075(Blocks.BLACKSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.POLISHED_BLACKSTONE_SLAB, 6)
         .method30250('#', Blocks.POLISHED_BLACKSTONE)
         .method30252("###")
         .method30253("has_polished_blackstone", method14075(Blocks.POLISHED_BLACKSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, 6)
         .method30250('#', Blocks.POLISHED_BLACKSTONE_BRICKS)
         .method30252("###")
         .method30253("has_polished_blackstone_bricks", method14075(Blocks.POLISHED_BLACKSTONE_BRICKS))
         .method30255(var0);
      Class8528.method30248(Blocks.POLISHED_BLACKSTONE, 4)
         .method30250('S', Blocks.BLACKSTONE)
         .method30252("SS")
         .method30252("SS")
         .method30253("has_blackstone", method14075(Blocks.BLACKSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.POLISHED_BLACKSTONE_BRICKS, 4)
         .method30250('#', Blocks.POLISHED_BLACKSTONE)
         .method30252("##")
         .method30252("##")
         .method30253("has_polished_blackstone", method14075(Blocks.POLISHED_BLACKSTONE))
         .method30255(var0);
      Class8528.method30247(Blocks.CHISELED_POLISHED_BLACKSTONE)
         .method30250('#', Blocks.POLISHED_BLACKSTONE_SLAB)
         .method30252("#")
         .method30252("#")
         .method30253("has_polished_blackstone", method14075(Blocks.POLISHED_BLACKSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.BLACKSTONE_WALL, 6)
         .method30250('#', Blocks.BLACKSTONE)
         .method30252("###")
         .method30252("###")
         .method30253("has_blackstone", method14075(Blocks.BLACKSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.POLISHED_BLACKSTONE_WALL, 6)
         .method30250('#', Blocks.POLISHED_BLACKSTONE)
         .method30252("###")
         .method30252("###")
         .method30253("has_polished_blackstone", method14075(Blocks.POLISHED_BLACKSTONE))
         .method30255(var0);
      Class8528.method30248(Blocks.POLISHED_BLACKSTONE_BRICK_WALL, 6)
         .method30250('#', Blocks.POLISHED_BLACKSTONE_BRICKS)
         .method30252("###")
         .method30252("###")
         .method30253("has_polished_blackstone_bricks", method14075(Blocks.POLISHED_BLACKSTONE_BRICKS))
         .method30255(var0);
      Class8888.method32341(Blocks.POLISHED_BLACKSTONE_BUTTON)
         .method32344(Blocks.POLISHED_BLACKSTONE)
         .method32348("has_polished_blackstone", method14075(Blocks.POLISHED_BLACKSTONE))
         .method32350(var0);
      Class8528.method30247(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE)
         .method30250('#', Blocks.POLISHED_BLACKSTONE)
         .method30252("##")
         .method30253("has_polished_blackstone", method14075(Blocks.POLISHED_BLACKSTONE))
         .method30255(var0);
      Class8528.method30247(Blocks.CHAIN)
         .method30250('I', Items.IRON_INGOT)
         .method30250('N', Items.field38128)
         .method30252("N")
         .method30252("I")
         .method30252("N")
         .method30253("has_iron_nugget", method14075(Items.field38128))
         .method30253("has_iron_ingot", method14075(Items.IRON_INGOT))
         .method30255(var0);
      Class7557.method24734(Class6504.field28472).method24735(var0, "armor_dye");
      Class7557.method24734(Class6504.field28480).method24735(var0, "banner_duplicate");
      Class7557.method24734(Class6504.field28473).method24735(var0, "book_cloning");
      Class7557.method24734(Class6504.field28476).method24735(var0, "firework_rocket");
      Class7557.method24734(Class6504.field28477).method24735(var0, "firework_star");
      Class7557.method24734(Class6504.field28478).method24735(var0, "firework_star_fade");
      Class7557.method24734(Class6504.field28474).method24735(var0, "map_cloning");
      Class7557.method24734(Class6504.field28475).method24735(var0, "map_extending");
      Class7557.method24734(Class6504.field28484).method24735(var0, "repair_item");
      Class7557.method24734(Class6504.field28481).method24735(var0, "shield_decoration");
      Class7557.method24734(Class6504.field28482).method24735(var0, "shulker_box_coloring");
      Class7557.method24734(Class6504.field28479).method24735(var0, "tipped_arrow");
      Class7557.method24734(Class6504.field28483).method24735(var0, "suspicious_stew");
      Class5625.method17666(Ingredient.fromItems(Items.field38053), Items.field38054, 0.35F, 200)
         .method17667("has_potato", method14075(Items.field38053))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Items.field37897), Items.field37896, 0.3F, 200)
         .method17667("has_clay_ball", method14075(Items.field37897))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromTag(ItemTags.field26084), Items.CHARCOAL, 0.15F, 200)
         .method17667("has_log", method14076(ItemTags.field26084))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Items.field38109), Items.field38110, 0.1F, 200)
         .method17667("has_chorus_fruit", method14075(Items.field38109))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.COAL_ORE.asItem()), Items.COAL, 0.1F, 200)
         .method17667("has_coal_ore", method14075(Blocks.COAL_ORE))
         .method17669(var0, "coal_from_smelting");
      Class5625.method17666(Ingredient.fromItems(Items.field37961), Items.field37962, 0.35F, 200)
         .method17667("has_beef", method14075(Items.field37961))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Items.field37963), Items.field37964, 0.35F, 200)
         .method17667("has_chicken", method14075(Items.field37963))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Items.field37909), Items.field37913, 0.35F, 200)
         .method17667("has_cod", method14075(Items.field37909))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.KELP), Items.field37958, 0.1F, 200)
         .method17667("has_kelp", method14075(Blocks.KELP))
         .method17669(var0, "dried_kelp_from_smelting");
      Class5625.method17666(Ingredient.fromItems(Items.field37910), Items.field37914, 0.35F, 200)
         .method17667("has_salmon", method14075(Items.field37910))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Items.field38090), Items.field38091, 0.35F, 200)
         .method17667("has_mutton", method14075(Items.field38090))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Items.PORKCHOP), Items.field37870, 0.35F, 200)
         .method17667("has_porkchop", method14075(Items.PORKCHOP))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Items.field38077), Items.field38078, 0.35F, 200)
         .method17667("has_rabbit", method14075(Items.field38077))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.DIAMOND_ORE.asItem()), Items.DIAMOND, 1.0F, 200)
         .method17667("has_diamond_ore", method14075(Blocks.DIAMOND_ORE))
         .method17669(var0, "diamond_from_smelting");
      Class5625.method17666(Ingredient.fromItems(Blocks.LAPIS_ORE.asItem()), Items.field37917, 0.2F, 200)
         .method17667("has_lapis_ore", method14075(Blocks.LAPIS_ORE))
         .method17669(var0, "lapis_from_smelting");
      Class5625.method17666(Ingredient.fromItems(Blocks.EMERALD_ORE.asItem()), Items.EMERALD, 1.0F, 200)
         .method17667("has_emerald_ore", method14075(Blocks.EMERALD_ORE))
         .method17669(var0, "emerald_from_smelting");
      Class5625.method17666(Ingredient.fromTag(ItemTags.field26095), Blocks.GLASS.asItem(), 0.1F, 200)
         .method17667("has_sand", method14076(ItemTags.field26095))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromTag(ItemTags.field26110), Items.GOLD_INGOT, 1.0F, 200)
         .method17667("has_gold_ore", method14076(ItemTags.field26110))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.SEA_PICKLE.asItem()), Items.field37923, 0.1F, 200)
         .method17667("has_sea_pickle", method14075(Blocks.SEA_PICKLE))
         .method17669(var0, "lime_dye_from_smelting");
      Class5625.method17666(Ingredient.fromItems(Blocks.CACTUS.asItem()), Items.field37931, 1.0F, 200)
         .method17667("has_cactus", method14075(Blocks.CACTUS))
         .method17668(var0);
      Class5625.method17666(
            Ingredient.fromItems(
               Items.field37817,
               Items.field37816,
               Items.field37818,
               Items.field37819,
               Items.GOLDEN_SWORD,
               Items.field37860,
               Items.field37861,
               Items.GOLDEN_LEGGINGS,
               Items.field37863,
               Items.field38084
            ),
            Items.field37969,
            0.1F,
            200
         )
         .method17667("has_golden_pickaxe", method14075(Items.field37817))
         .method17667("has_golden_shovel", method14075(Items.field37816))
         .method17667("has_golden_axe", method14075(Items.field37818))
         .method17667("has_golden_hoe", method14075(Items.field37819))
         .method17667("has_golden_sword", method14075(Items.GOLDEN_SWORD))
         .method17667("has_golden_helmet", method14075(Items.field37860))
         .method17667("has_golden_chestplate", method14075(Items.field37861))
         .method17667("has_golden_leggings", method14075(Items.GOLDEN_LEGGINGS))
         .method17667("has_golden_boots", method14075(Items.field37863))
         .method17667("has_golden_horse_armor", method14075(Items.field38084))
         .method17669(var0, "gold_nugget_from_smelting");
      Class5625.method17666(
            Ingredient.fromItems(
               Items.field37822,
               Items.IRON_SHOVEL,
               Items.IRON_AXE,
               Items.field37824,
               Items.field37820,
               Items.field37852,
               Items.field37853,
               Items.field37854,
               Items.field37855,
               Items.field38083,
               Items.field37848,
               Items.field37849,
               Items.field37850,
               Items.field37851
            ),
            Items.field38128,
            0.1F,
            200
         )
         .method17667("has_iron_pickaxe", method14075(Items.field37822))
         .method17667("has_iron_shovel", method14075(Items.IRON_SHOVEL))
         .method17667("has_iron_axe", method14075(Items.IRON_AXE))
         .method17667("has_iron_hoe", method14075(Items.field37824))
         .method17667("has_iron_sword", method14075(Items.field37820))
         .method17667("has_iron_helmet", method14075(Items.field37852))
         .method17667("has_iron_chestplate", method14075(Items.field37853))
         .method17667("has_iron_leggings", method14075(Items.field37854))
         .method17667("has_iron_boots", method14075(Items.field37855))
         .method17667("has_iron_horse_armor", method14075(Items.field38083))
         .method17667("has_chainmail_helmet", method14075(Items.field37848))
         .method17667("has_chainmail_chestplate", method14075(Items.field37849))
         .method17667("has_chainmail_leggings", method14075(Items.field37850))
         .method17667("has_chainmail_boots", method14075(Items.field37851))
         .method17669(var0, "iron_nugget_from_smelting");
      Class5625.method17666(Ingredient.fromItems(Blocks.IRON_ORE.asItem()), Items.IRON_INGOT, 0.7F, 200)
         .method17667("has_iron_ore", method14075(Blocks.IRON_ORE.asItem()))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.CLAY), Blocks.TERRACOTTA.asItem(), 0.35F, 200)
         .method17667("has_clay_block", method14075(Blocks.CLAY))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.NETHERRACK), Items.field38071, 0.1F, 200)
         .method17667("has_netherrack", method14075(Blocks.NETHERRACK))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.NETHER_QUARTZ_ORE), Items.field38072, 0.2F, 200)
         .method17667("has_nether_quartz_ore", method14075(Blocks.NETHER_QUARTZ_ORE))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.REDSTONE_ORE), Items.REDSTONE_DUST, 0.7F, 200)
         .method17667("has_redstone_ore", method14075(Blocks.REDSTONE_ORE))
         .method17669(var0, "redstone_from_smelting");
      Class5625.method17666(Ingredient.fromItems(Blocks.WET_SPONGE), Blocks.SPONGE.asItem(), 0.15F, 200)
         .method17667("has_wet_sponge", method14075(Blocks.WET_SPONGE))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.COBBLESTONE), Blocks.STONE.asItem(), 0.1F, 200)
         .method17667("has_cobblestone", method14075(Blocks.COBBLESTONE))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.STONE), Blocks.SMOOTH_STONE.asItem(), 0.1F, 200)
         .method17667("has_stone", method14075(Blocks.STONE))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.SANDSTONE), Blocks.SMOOTH_SANDSTONE.asItem(), 0.1F, 200)
         .method17667("has_sandstone", method14075(Blocks.SANDSTONE))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.RED_SANDSTONE), Blocks.SMOOTH_RED_SANDSTONE.asItem(), 0.1F, 200)
         .method17667("has_red_sandstone", method14075(Blocks.RED_SANDSTONE))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.QUARTZ_BLOCK), Blocks.SMOOTH_QUARTZ.asItem(), 0.1F, 200)
         .method17667("has_quartz_block", method14075(Blocks.QUARTZ_BLOCK))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.STONE_BRICKS), Blocks.CRACKED_STONE_BRICKS.asItem(), 0.1F, 200)
         .method17667("has_stone_bricks", method14075(Blocks.STONE_BRICKS))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.BLACK_TERRACOTTA), Blocks.BLACK_GLAZED_TERRACOTTA.asItem(), 0.1F, 200)
         .method17667("has_black_terracotta", method14075(Blocks.BLACK_TERRACOTTA))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.BLUE_TERRACOTTA), Blocks.BLUE_GLAZED_TERRACOTTA.asItem(), 0.1F, 200)
         .method17667("has_blue_terracotta", method14075(Blocks.BLUE_TERRACOTTA))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.BROWN_TERRACOTTA), Blocks.BROWN_GLAZED_TERRACOTTA.asItem(), 0.1F, 200)
         .method17667("has_brown_terracotta", method14075(Blocks.BROWN_TERRACOTTA))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.CYAN_TERRACOTTA), Blocks.CYAN_GLAZED_TERRACOTTA.asItem(), 0.1F, 200)
         .method17667("has_cyan_terracotta", method14075(Blocks.CYAN_TERRACOTTA))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.GRAY_TERRACOTTA), Blocks.GRAY_GLAZED_TERRACOTTA.asItem(), 0.1F, 200)
         .method17667("has_gray_terracotta", method14075(Blocks.GRAY_TERRACOTTA))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.GREEN_TERRACOTTA), Blocks.GREEN_GLAZED_TERRACOTTA.asItem(), 0.1F, 200)
         .method17667("has_green_terracotta", method14075(Blocks.GREEN_TERRACOTTA))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.LIGHT_BLUE_TERRACOTTA), Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA.asItem(), 0.1F, 200)
         .method17667("has_light_blue_terracotta", method14075(Blocks.LIGHT_BLUE_TERRACOTTA))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.LIGHT_GRAY_TERRACOTTA), Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA.asItem(), 0.1F, 200)
         .method17667("has_light_gray_terracotta", method14075(Blocks.LIGHT_GRAY_TERRACOTTA))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.LIME_TERRACOTTA), Blocks.LIME_GLAZED_TERRACOTTA.asItem(), 0.1F, 200)
         .method17667("has_lime_terracotta", method14075(Blocks.LIME_TERRACOTTA))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.MAGENTA_TERRACOTTA), Blocks.MAGENTA_GLAZED_TERRACOTTA.asItem(), 0.1F, 200)
         .method17667("has_magenta_terracotta", method14075(Blocks.MAGENTA_TERRACOTTA))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.ORANGE_TERRACOTTA), Blocks.ORANGE_GLAZED_TERRACOTTA.asItem(), 0.1F, 200)
         .method17667("has_orange_terracotta", method14075(Blocks.ORANGE_TERRACOTTA))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.PINK_TERRACOTTA), Blocks.PINK_GLAZED_TERRACOTTA.asItem(), 0.1F, 200)
         .method17667("has_pink_terracotta", method14075(Blocks.PINK_TERRACOTTA))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.PURPLE_TERRACOTTA), Blocks.PURPLE_GLAZED_TERRACOTTA.asItem(), 0.1F, 200)
         .method17667("has_purple_terracotta", method14075(Blocks.PURPLE_TERRACOTTA))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.RED_TERRACOTTA), Blocks.RED_GLAZED_TERRACOTTA.asItem(), 0.1F, 200)
         .method17667("has_red_terracotta", method14075(Blocks.RED_TERRACOTTA))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.WHITE_TERRACOTTA), Blocks.WHITE_GLAZED_TERRACOTTA.asItem(), 0.1F, 200)
         .method17667("has_white_terracotta", method14075(Blocks.WHITE_TERRACOTTA))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.YELLOW_TERRACOTTA), Blocks.YELLOW_GLAZED_TERRACOTTA.asItem(), 0.1F, 200)
         .method17667("has_yellow_terracotta", method14075(Blocks.YELLOW_TERRACOTTA))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.ANCIENT_DEBRIS), Items.NETHERITE_SCRAP, 2.0F, 200)
         .method17667("has_ancient_debris", method14075(Blocks.ANCIENT_DEBRIS))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.POLISHED_BLACKSTONE_BRICKS), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.asItem(), 0.1F, 200)
         .method17667("has_blackstone_bricks", method14075(Blocks.POLISHED_BLACKSTONE_BRICKS))
         .method17668(var0);
      Class5625.method17666(Ingredient.fromItems(Blocks.NETHER_BRICKS), Blocks.CRACKED_NETHER_BRICKS.asItem(), 0.1F, 200)
         .method17667("has_nether_bricks", method14075(Blocks.NETHER_BRICKS))
         .method17668(var0);
      Class5625.method17665(Ingredient.fromItems(Blocks.IRON_ORE.asItem()), Items.IRON_INGOT, 0.7F, 100)
         .method17667("has_iron_ore", method14075(Blocks.IRON_ORE.asItem()))
         .method17669(var0, "iron_ingot_from_blasting");
      Class5625.method17665(Ingredient.fromTag(ItemTags.field26110), Items.GOLD_INGOT, 1.0F, 100)
         .method17667("has_gold_ore", method14076(ItemTags.field26110))
         .method17669(var0, "gold_ingot_from_blasting");
      Class5625.method17665(Ingredient.fromItems(Blocks.DIAMOND_ORE.asItem()), Items.DIAMOND, 1.0F, 100)
         .method17667("has_diamond_ore", method14075(Blocks.DIAMOND_ORE))
         .method17669(var0, "diamond_from_blasting");
      Class5625.method17665(Ingredient.fromItems(Blocks.LAPIS_ORE.asItem()), Items.field37917, 0.2F, 100)
         .method17667("has_lapis_ore", method14075(Blocks.LAPIS_ORE))
         .method17669(var0, "lapis_from_blasting");
      Class5625.method17665(Ingredient.fromItems(Blocks.REDSTONE_ORE), Items.REDSTONE_DUST, 0.7F, 100)
         .method17667("has_redstone_ore", method14075(Blocks.REDSTONE_ORE))
         .method17669(var0, "redstone_from_blasting");
      Class5625.method17665(Ingredient.fromItems(Blocks.COAL_ORE.asItem()), Items.COAL, 0.1F, 100)
         .method17667("has_coal_ore", method14075(Blocks.COAL_ORE))
         .method17669(var0, "coal_from_blasting");
      Class5625.method17665(Ingredient.fromItems(Blocks.EMERALD_ORE.asItem()), Items.EMERALD, 1.0F, 100)
         .method17667("has_emerald_ore", method14075(Blocks.EMERALD_ORE))
         .method17669(var0, "emerald_from_blasting");
      Class5625.method17665(Ingredient.fromItems(Blocks.NETHER_QUARTZ_ORE), Items.field38072, 0.2F, 100)
         .method17667("has_nether_quartz_ore", method14075(Blocks.NETHER_QUARTZ_ORE))
         .method17669(var0, "quartz_from_blasting");
      Class5625.method17665(
            Ingredient.fromItems(
               Items.field37817,
               Items.field37816,
               Items.field37818,
               Items.field37819,
               Items.GOLDEN_SWORD,
               Items.field37860,
               Items.field37861,
               Items.GOLDEN_LEGGINGS,
               Items.field37863,
               Items.field38084
            ),
            Items.field37969,
            0.1F,
            100
         )
         .method17667("has_golden_pickaxe", method14075(Items.field37817))
         .method17667("has_golden_shovel", method14075(Items.field37816))
         .method17667("has_golden_axe", method14075(Items.field37818))
         .method17667("has_golden_hoe", method14075(Items.field37819))
         .method17667("has_golden_sword", method14075(Items.GOLDEN_SWORD))
         .method17667("has_golden_helmet", method14075(Items.field37860))
         .method17667("has_golden_chestplate", method14075(Items.field37861))
         .method17667("has_golden_leggings", method14075(Items.GOLDEN_LEGGINGS))
         .method17667("has_golden_boots", method14075(Items.field37863))
         .method17667("has_golden_horse_armor", method14075(Items.field38084))
         .method17669(var0, "gold_nugget_from_blasting");
      Class5625.method17665(
            Ingredient.fromItems(
               Items.field37822,
               Items.IRON_SHOVEL,
               Items.IRON_AXE,
               Items.field37824,
               Items.field37820,
               Items.field37852,
               Items.field37853,
               Items.field37854,
               Items.field37855,
               Items.field38083,
               Items.field37848,
               Items.field37849,
               Items.field37850,
               Items.field37851
            ),
            Items.field38128,
            0.1F,
            100
         )
         .method17667("has_iron_pickaxe", method14075(Items.field37822))
         .method17667("has_iron_shovel", method14075(Items.IRON_SHOVEL))
         .method17667("has_iron_axe", method14075(Items.IRON_AXE))
         .method17667("has_iron_hoe", method14075(Items.field37824))
         .method17667("has_iron_sword", method14075(Items.field37820))
         .method17667("has_iron_helmet", method14075(Items.field37852))
         .method17667("has_iron_chestplate", method14075(Items.field37853))
         .method17667("has_iron_leggings", method14075(Items.field37854))
         .method17667("has_iron_boots", method14075(Items.field37855))
         .method17667("has_iron_horse_armor", method14075(Items.field38083))
         .method17667("has_chainmail_helmet", method14075(Items.field37848))
         .method17667("has_chainmail_chestplate", method14075(Items.field37849))
         .method17667("has_chainmail_leggings", method14075(Items.field37850))
         .method17667("has_chainmail_boots", method14075(Items.field37851))
         .method17669(var0, "iron_nugget_from_blasting");
      Class5625.method17665(Ingredient.fromItems(Blocks.ANCIENT_DEBRIS), Items.NETHERITE_SCRAP, 2.0F, 100)
         .method17667("has_ancient_debris", method14075(Blocks.ANCIENT_DEBRIS))
         .method17669(var0, "netherite_scrap_from_blasting");
      method14073(var0, "smoking", Class6504.field28487, 100);
      method14073(var0, "campfire_cooking", Class6504.field28488, 600);
      Class9067.method33770(Ingredient.fromItems(Blocks.STONE), Blocks.STONE_SLAB, 2)
         .method33771("has_stone", method14075(Blocks.STONE))
         .method33772(var0, "stone_slab_from_stone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.STONE), Blocks.STONE_STAIRS)
         .method33771("has_stone", method14075(Blocks.STONE))
         .method33772(var0, "stone_stairs_from_stone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.STONE), Blocks.STONE_BRICKS)
         .method33771("has_stone", method14075(Blocks.STONE))
         .method33772(var0, "stone_bricks_from_stone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.STONE), Blocks.STONE_BRICK_SLAB, 2)
         .method33771("has_stone", method14075(Blocks.STONE))
         .method33772(var0, "stone_brick_slab_from_stone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.STONE), Blocks.STONE_BRICK_STAIRS)
         .method33771("has_stone", method14075(Blocks.STONE))
         .method33772(var0, "stone_brick_stairs_from_stone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.STONE), Blocks.CHISELED_STONE_BRICKS)
         .method33771("has_stone", method14075(Blocks.STONE))
         .method33772(var0, "chiseled_stone_bricks_stone_from_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.STONE), Blocks.STONE_BRICK_WALL)
         .method33771("has_stone", method14075(Blocks.STONE))
         .method33772(var0, "stone_brick_walls_from_stone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.SANDSTONE), Blocks.CUT_SANDSTONE)
         .method33771("has_sandstone", method14075(Blocks.SANDSTONE))
         .method33772(var0, "cut_sandstone_from_sandstone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.SANDSTONE), Blocks.SANDSTONE_SLAB, 2)
         .method33771("has_sandstone", method14075(Blocks.SANDSTONE))
         .method33772(var0, "sandstone_slab_from_sandstone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.SANDSTONE), Blocks.CUT_SANDSTONE_SLAB, 2)
         .method33771("has_sandstone", method14075(Blocks.SANDSTONE))
         .method33772(var0, "cut_sandstone_slab_from_sandstone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.CUT_SANDSTONE), Blocks.CUT_SANDSTONE_SLAB, 2)
         .method33771("has_cut_sandstone", method14075(Blocks.SANDSTONE))
         .method33772(var0, "cut_sandstone_slab_from_cut_sandstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.SANDSTONE), Blocks.SANDSTONE_STAIRS)
         .method33771("has_sandstone", method14075(Blocks.SANDSTONE))
         .method33772(var0, "sandstone_stairs_from_sandstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.SANDSTONE), Blocks.SANDSTONE_WALL)
         .method33771("has_sandstone", method14075(Blocks.SANDSTONE))
         .method33772(var0, "sandstone_wall_from_sandstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.SANDSTONE), Blocks.CHISELED_SANDSTONE)
         .method33771("has_sandstone", method14075(Blocks.SANDSTONE))
         .method33772(var0, "chiseled_sandstone_from_sandstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.RED_SANDSTONE), Blocks.CUT_RED_SANDSTONE)
         .method33771("has_red_sandstone", method14075(Blocks.RED_SANDSTONE))
         .method33772(var0, "cut_red_sandstone_from_red_sandstone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.RED_SANDSTONE), Blocks.RED_SANDSTONE_SLAB, 2)
         .method33771("has_red_sandstone", method14075(Blocks.RED_SANDSTONE))
         .method33772(var0, "red_sandstone_slab_from_red_sandstone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.RED_SANDSTONE), Blocks.CUT_RED_SANDSTONE_SLAB, 2)
         .method33771("has_red_sandstone", method14075(Blocks.RED_SANDSTONE))
         .method33772(var0, "cut_red_sandstone_slab_from_red_sandstone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.CUT_RED_SANDSTONE), Blocks.CUT_RED_SANDSTONE_SLAB, 2)
         .method33771("has_cut_red_sandstone", method14075(Blocks.RED_SANDSTONE))
         .method33772(var0, "cut_red_sandstone_slab_from_cut_red_sandstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.RED_SANDSTONE), Blocks.RED_SANDSTONE_STAIRS)
         .method33771("has_red_sandstone", method14075(Blocks.RED_SANDSTONE))
         .method33772(var0, "red_sandstone_stairs_from_red_sandstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.RED_SANDSTONE), Blocks.RED_SANDSTONE_WALL)
         .method33771("has_red_sandstone", method14075(Blocks.RED_SANDSTONE))
         .method33772(var0, "red_sandstone_wall_from_red_sandstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.RED_SANDSTONE), Blocks.CHISELED_RED_SANDSTONE)
         .method33771("has_red_sandstone", method14075(Blocks.RED_SANDSTONE))
         .method33772(var0, "chiseled_red_sandstone_from_red_sandstone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.QUARTZ_BLOCK), Blocks.QUARTZ_SLAB, 2)
         .method33771("has_quartz_block", method14075(Blocks.QUARTZ_BLOCK))
         .method33772(var0, "quartz_slab_from_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.QUARTZ_BLOCK), Blocks.QUARTZ_STAIRS)
         .method33771("has_quartz_block", method14075(Blocks.QUARTZ_BLOCK))
         .method33772(var0, "quartz_stairs_from_quartz_block_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.QUARTZ_BLOCK), Blocks.QUARTZ_PILLAR)
         .method33771("has_quartz_block", method14075(Blocks.QUARTZ_BLOCK))
         .method33772(var0, "quartz_pillar_from_quartz_block_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.QUARTZ_BLOCK), Blocks.CHISELED_QUARTZ_BLOCK)
         .method33771("has_quartz_block", method14075(Blocks.QUARTZ_BLOCK))
         .method33772(var0, "chiseled_quartz_block_from_quartz_block_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.QUARTZ_BLOCK), Blocks.QUARTZ_BRICKS)
         .method33771("has_quartz_block", method14075(Blocks.QUARTZ_BLOCK))
         .method33772(var0, "quartz_bricks_from_quartz_block_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.COBBLESTONE), Blocks.COBBLESTONE_STAIRS)
         .method33771("has_cobblestone", method14075(Blocks.COBBLESTONE))
         .method33772(var0, "cobblestone_stairs_from_cobblestone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.COBBLESTONE), Blocks.COBBLESTONE_SLAB, 2)
         .method33771("has_cobblestone", method14075(Blocks.COBBLESTONE))
         .method33772(var0, "cobblestone_slab_from_cobblestone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.COBBLESTONE), Blocks.COBBLESTONE_WALL)
         .method33771("has_cobblestone", method14075(Blocks.COBBLESTONE))
         .method33772(var0, "cobblestone_wall_from_cobblestone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.STONE_BRICKS), Blocks.STONE_BRICK_SLAB, 2)
         .method33771("has_stone_bricks", method14075(Blocks.STONE_BRICKS))
         .method33772(var0, "stone_brick_slab_from_stone_bricks_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.STONE_BRICKS), Blocks.STONE_BRICK_STAIRS)
         .method33771("has_stone_bricks", method14075(Blocks.STONE_BRICKS))
         .method33772(var0, "stone_brick_stairs_from_stone_bricks_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.STONE_BRICKS), Blocks.STONE_BRICK_WALL)
         .method33771("has_stone_bricks", method14075(Blocks.STONE_BRICKS))
         .method33772(var0, "stone_brick_wall_from_stone_bricks_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.STONE_BRICKS), Blocks.CHISELED_STONE_BRICKS)
         .method33771("has_stone_bricks", method14075(Blocks.STONE_BRICKS))
         .method33772(var0, "chiseled_stone_bricks_from_stone_bricks_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.BRICKS), Blocks.BRICK_SLAB, 2)
         .method33771("has_bricks", method14075(Blocks.BRICKS))
         .method33772(var0, "brick_slab_from_bricks_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.BRICKS), Blocks.BRICK_STAIRS)
         .method33771("has_bricks", method14075(Blocks.BRICKS))
         .method33772(var0, "brick_stairs_from_bricks_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.BRICKS), Blocks.BRICK_WALL)
         .method33771("has_bricks", method14075(Blocks.BRICKS))
         .method33772(var0, "brick_wall_from_bricks_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.NETHER_BRICKS), Blocks.NETHER_BRICK_SLAB, 2)
         .method33771("has_nether_bricks", method14075(Blocks.NETHER_BRICKS))
         .method33772(var0, "nether_brick_slab_from_nether_bricks_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.NETHER_BRICKS), Blocks.NETHER_BRICK_STAIRS)
         .method33771("has_nether_bricks", method14075(Blocks.NETHER_BRICKS))
         .method33772(var0, "nether_brick_stairs_from_nether_bricks_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.NETHER_BRICKS), Blocks.NETHER_BRICK_WALL)
         .method33771("has_nether_bricks", method14075(Blocks.NETHER_BRICKS))
         .method33772(var0, "nether_brick_wall_from_nether_bricks_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.NETHER_BRICKS), Blocks.CHISELED_NETHER_BRICKS)
         .method33771("has_nether_bricks", method14075(Blocks.NETHER_BRICKS))
         .method33772(var0, "chiseled_nether_bricks_from_nether_bricks_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.RED_NETHER_BRICKS), Blocks.RED_NETHER_BRICK_SLAB, 2)
         .method33771("has_nether_bricks", method14075(Blocks.RED_NETHER_BRICKS))
         .method33772(var0, "red_nether_brick_slab_from_red_nether_bricks_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.RED_NETHER_BRICKS), Blocks.RED_NETHER_BRICK_STAIRS)
         .method33771("has_nether_bricks", method14075(Blocks.RED_NETHER_BRICKS))
         .method33772(var0, "red_nether_brick_stairs_from_red_nether_bricks_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.RED_NETHER_BRICKS), Blocks.RED_NETHER_BRICK_WALL)
         .method33771("has_nether_bricks", method14075(Blocks.RED_NETHER_BRICKS))
         .method33772(var0, "red_nether_brick_wall_from_red_nether_bricks_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.PURPUR_BLOCK), Blocks.PURPUR_SLAB, 2)
         .method33771("has_purpur_block", method14075(Blocks.PURPUR_BLOCK))
         .method33772(var0, "purpur_slab_from_purpur_block_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.PURPUR_BLOCK), Blocks.PURPUR_STAIRS)
         .method33771("has_purpur_block", method14075(Blocks.PURPUR_BLOCK))
         .method33772(var0, "purpur_stairs_from_purpur_block_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.PURPUR_BLOCK), Blocks.PURPUR_PILLAR)
         .method33771("has_purpur_block", method14075(Blocks.PURPUR_BLOCK))
         .method33772(var0, "purpur_pillar_from_purpur_block_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.PRISMARINE), Blocks.PRISMARINE_SLAB, 2)
         .method33771("has_prismarine", method14075(Blocks.PRISMARINE))
         .method33772(var0, "prismarine_slab_from_prismarine_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.PRISMARINE), Blocks.PRISMARINE_STAIRS)
         .method33771("has_prismarine", method14075(Blocks.PRISMARINE))
         .method33772(var0, "prismarine_stairs_from_prismarine_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.PRISMARINE), Blocks.PRISMARINE_WALL)
         .method33771("has_prismarine", method14075(Blocks.PRISMARINE))
         .method33772(var0, "prismarine_wall_from_prismarine_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.PRISMARINE_BRICKS), Blocks.PRISMARINE_BRICK_SLAB, 2)
         .method33771("has_prismarine_brick", method14075(Blocks.PRISMARINE_BRICKS))
         .method33772(var0, "prismarine_brick_slab_from_prismarine_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.PRISMARINE_BRICKS), Blocks.PRISMARINE_BRICK_STAIRS)
         .method33771("has_prismarine_brick", method14075(Blocks.PRISMARINE_BRICKS))
         .method33772(var0, "prismarine_brick_stairs_from_prismarine_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.DARK_PRISMARINE), Blocks.DARK_PRISMARINE_SLAB, 2)
         .method33771("has_dark_prismarine", method14075(Blocks.DARK_PRISMARINE))
         .method33772(var0, "dark_prismarine_slab_from_dark_prismarine_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.DARK_PRISMARINE), Blocks.DARK_PRISMARINE_STAIRS)
         .method33771("has_dark_prismarine", method14075(Blocks.DARK_PRISMARINE))
         .method33772(var0, "dark_prismarine_stairs_from_dark_prismarine_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.ANDESITE), Blocks.ANDESITE_SLAB, 2)
         .method33771("has_andesite", method14075(Blocks.ANDESITE))
         .method33772(var0, "andesite_slab_from_andesite_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.ANDESITE), Blocks.ANDESITE_STAIRS)
         .method33771("has_andesite", method14075(Blocks.ANDESITE))
         .method33772(var0, "andesite_stairs_from_andesite_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.ANDESITE), Blocks.ANDESITE_WALL)
         .method33771("has_andesite", method14075(Blocks.ANDESITE))
         .method33772(var0, "andesite_wall_from_andesite_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.ANDESITE), Blocks.POLISHED_ANDESITE)
         .method33771("has_andesite", method14075(Blocks.ANDESITE))
         .method33772(var0, "polished_andesite_from_andesite_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.ANDESITE), Blocks.POLISHED_ANDESITE_SLAB, 2)
         .method33771("has_andesite", method14075(Blocks.ANDESITE))
         .method33772(var0, "polished_andesite_slab_from_andesite_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.ANDESITE), Blocks.POLISHED_ANDESITE_STAIRS)
         .method33771("has_andesite", method14075(Blocks.ANDESITE))
         .method33772(var0, "polished_andesite_stairs_from_andesite_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.POLISHED_ANDESITE), Blocks.POLISHED_ANDESITE_SLAB, 2)
         .method33771("has_polished_andesite", method14075(Blocks.POLISHED_ANDESITE))
         .method33772(var0, "polished_andesite_slab_from_polished_andesite_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.POLISHED_ANDESITE), Blocks.POLISHED_ANDESITE_STAIRS)
         .method33771("has_polished_andesite", method14075(Blocks.POLISHED_ANDESITE))
         .method33772(var0, "polished_andesite_stairs_from_polished_andesite_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.BASALT), Blocks.POLISHED_BASALT)
         .method33771("has_basalt", method14075(Blocks.BASALT))
         .method33772(var0, "polished_basalt_from_basalt_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.GRANITE), Blocks.GRANITE_SLAB, 2)
         .method33771("has_granite", method14075(Blocks.GRANITE))
         .method33772(var0, "granite_slab_from_granite_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.GRANITE), Blocks.GRANITE_STAIRS)
         .method33771("has_granite", method14075(Blocks.GRANITE))
         .method33772(var0, "granite_stairs_from_granite_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.GRANITE), Blocks.GRANITE_WALL)
         .method33771("has_granite", method14075(Blocks.GRANITE))
         .method33772(var0, "granite_wall_from_granite_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.GRANITE), Blocks.POLISHED_GRANITE)
         .method33771("has_granite", method14075(Blocks.GRANITE))
         .method33772(var0, "polished_granite_from_granite_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.GRANITE), Blocks.POLISHED_GRANITE_SLAB, 2)
         .method33771("has_granite", method14075(Blocks.GRANITE))
         .method33772(var0, "polished_granite_slab_from_granite_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.GRANITE), Blocks.POLISHED_GRANITE_STAIRS)
         .method33771("has_granite", method14075(Blocks.GRANITE))
         .method33772(var0, "polished_granite_stairs_from_granite_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.POLISHED_GRANITE), Blocks.POLISHED_GRANITE_SLAB, 2)
         .method33771("has_polished_granite", method14075(Blocks.POLISHED_GRANITE))
         .method33772(var0, "polished_granite_slab_from_polished_granite_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.POLISHED_GRANITE), Blocks.POLISHED_GRANITE_STAIRS)
         .method33771("has_polished_granite", method14075(Blocks.POLISHED_GRANITE))
         .method33772(var0, "polished_granite_stairs_from_polished_granite_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.DIORITE), Blocks.DIORITE_SLAB, 2)
         .method33771("has_diorite", method14075(Blocks.DIORITE))
         .method33772(var0, "diorite_slab_from_diorite_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.DIORITE), Blocks.DIORITE_STAIRS)
         .method33771("has_diorite", method14075(Blocks.DIORITE))
         .method33772(var0, "diorite_stairs_from_diorite_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.DIORITE), Blocks.DIORITE_WALL)
         .method33771("has_diorite", method14075(Blocks.DIORITE))
         .method33772(var0, "diorite_wall_from_diorite_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.DIORITE), Blocks.POLISHED_DIORITE)
         .method33771("has_diorite", method14075(Blocks.DIORITE))
         .method33772(var0, "polished_diorite_from_diorite_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.DIORITE), Blocks.POLISHED_DIORITE_SLAB, 2)
         .method33771("has_diorite", method14075(Blocks.POLISHED_DIORITE))
         .method33772(var0, "polished_diorite_slab_from_diorite_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.DIORITE), Blocks.POLISHED_DIORITE_STAIRS)
         .method33771("has_diorite", method14075(Blocks.POLISHED_DIORITE))
         .method33772(var0, "polished_diorite_stairs_from_diorite_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.POLISHED_DIORITE), Blocks.POLISHED_DIORITE_SLAB, 2)
         .method33771("has_polished_diorite", method14075(Blocks.POLISHED_DIORITE))
         .method33772(var0, "polished_diorite_slab_from_polished_diorite_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.POLISHED_DIORITE), Blocks.POLISHED_DIORITE_STAIRS)
         .method33771("has_polished_diorite", method14075(Blocks.POLISHED_DIORITE))
         .method33772(var0, "polished_diorite_stairs_from_polished_diorite_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.MOSSY_STONE_BRICKS), Blocks.MOSSY_STONE_BRICK_SLAB, 2)
         .method33771("has_mossy_stone_bricks", method14075(Blocks.MOSSY_STONE_BRICKS))
         .method33772(var0, "mossy_stone_brick_slab_from_mossy_stone_brick_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.MOSSY_STONE_BRICKS), Blocks.MOSSY_STONE_BRICK_STAIRS)
         .method33771("has_mossy_stone_bricks", method14075(Blocks.MOSSY_STONE_BRICKS))
         .method33772(var0, "mossy_stone_brick_stairs_from_mossy_stone_brick_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.MOSSY_STONE_BRICKS), Blocks.MOSSY_STONE_BRICK_WALL)
         .method33771("has_mossy_stone_bricks", method14075(Blocks.MOSSY_STONE_BRICKS))
         .method33772(var0, "mossy_stone_brick_wall_from_mossy_stone_brick_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.MOSSY_COBBLESTONE), Blocks.MOSSY_COBBLESTONE_SLAB, 2)
         .method33771("has_mossy_cobblestone", method14075(Blocks.MOSSY_COBBLESTONE))
         .method33772(var0, "mossy_cobblestone_slab_from_mossy_cobblestone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.MOSSY_COBBLESTONE), Blocks.MOSSY_COBBLESTONE_STAIRS)
         .method33771("has_mossy_cobblestone", method14075(Blocks.MOSSY_COBBLESTONE))
         .method33772(var0, "mossy_cobblestone_stairs_from_mossy_cobblestone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.MOSSY_COBBLESTONE), Blocks.MOSSY_COBBLESTONE_WALL)
         .method33771("has_mossy_cobblestone", method14075(Blocks.MOSSY_COBBLESTONE))
         .method33772(var0, "mossy_cobblestone_wall_from_mossy_cobblestone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.SMOOTH_SANDSTONE), Blocks.SMOOTH_SANDSTONE_SLAB, 2)
         .method33771("has_smooth_sandstone", method14075(Blocks.SMOOTH_SANDSTONE))
         .method33772(var0, "smooth_sandstone_slab_from_smooth_sandstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.SMOOTH_SANDSTONE), Blocks.SMOOTH_SANDSTONE_STAIRS)
         .method33771("has_mossy_cobblestone", method14075(Blocks.SMOOTH_SANDSTONE))
         .method33772(var0, "smooth_sandstone_stairs_from_smooth_sandstone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.SMOOTH_RED_SANDSTONE), Blocks.SMOOTH_RED_SANDSTONE_SLAB, 2)
         .method33771("has_smooth_red_sandstone", method14075(Blocks.SMOOTH_RED_SANDSTONE))
         .method33772(var0, "smooth_red_sandstone_slab_from_smooth_red_sandstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.SMOOTH_RED_SANDSTONE), Blocks.SMOOTH_RED_SANDSTONE_STAIRS)
         .method33771("has_smooth_red_sandstone", method14075(Blocks.SMOOTH_RED_SANDSTONE))
         .method33772(var0, "smooth_red_sandstone_stairs_from_smooth_red_sandstone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.SMOOTH_QUARTZ), Blocks.SMOOTH_QUARTZ_SLAB, 2)
         .method33771("has_smooth_quartz", method14075(Blocks.SMOOTH_QUARTZ))
         .method33772(var0, "smooth_quartz_slab_from_smooth_quartz_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.SMOOTH_QUARTZ), Blocks.SMOOTH_QUARTZ_STAIRS)
         .method33771("has_smooth_quartz", method14075(Blocks.SMOOTH_QUARTZ))
         .method33772(var0, "smooth_quartz_stairs_from_smooth_quartz_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.END_STONE_BRICKS), Blocks.END_STONE_BRICK_SLAB, 2)
         .method33771("has_end_stone_brick", method14075(Blocks.END_STONE_BRICKS))
         .method33772(var0, "end_stone_brick_slab_from_end_stone_brick_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.END_STONE_BRICKS), Blocks.END_STONE_BRICK_STAIRS)
         .method33771("has_end_stone_brick", method14075(Blocks.END_STONE_BRICKS))
         .method33772(var0, "end_stone_brick_stairs_from_end_stone_brick_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.END_STONE_BRICKS), Blocks.END_STONE_BRICK_WALL)
         .method33771("has_end_stone_brick", method14075(Blocks.END_STONE_BRICKS))
         .method33772(var0, "end_stone_brick_wall_from_end_stone_brick_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.END_STONE), Blocks.END_STONE_BRICKS)
         .method33771("has_end_stone", method14075(Blocks.END_STONE))
         .method33772(var0, "end_stone_bricks_from_end_stone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.END_STONE), Blocks.END_STONE_BRICK_SLAB, 2)
         .method33771("has_end_stone", method14075(Blocks.END_STONE))
         .method33772(var0, "end_stone_brick_slab_from_end_stone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.END_STONE), Blocks.END_STONE_BRICK_STAIRS)
         .method33771("has_end_stone", method14075(Blocks.END_STONE))
         .method33772(var0, "end_stone_brick_stairs_from_end_stone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.END_STONE), Blocks.END_STONE_BRICK_WALL)
         .method33771("has_end_stone", method14075(Blocks.END_STONE))
         .method33772(var0, "end_stone_brick_wall_from_end_stone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.SMOOTH_STONE), Blocks.SMOOTH_STONE_SLAB, 2)
         .method33771("has_smooth_stone", method14075(Blocks.SMOOTH_STONE))
         .method33772(var0, "smooth_stone_slab_from_smooth_stone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.BLACKSTONE), Blocks.BLACKSTONE_SLAB, 2)
         .method33771("has_blackstone", method14075(Blocks.BLACKSTONE))
         .method33772(var0, "blackstone_slab_from_blackstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.BLACKSTONE), Blocks.BLACKSTONE_STAIRS)
         .method33771("has_blackstone", method14075(Blocks.BLACKSTONE))
         .method33772(var0, "blackstone_stairs_from_blackstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.BLACKSTONE), Blocks.BLACKSTONE_WALL)
         .method33771("has_blackstone", method14075(Blocks.BLACKSTONE))
         .method33772(var0, "blackstone_wall_from_blackstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.BLACKSTONE), Blocks.POLISHED_BLACKSTONE)
         .method33771("has_blackstone", method14075(Blocks.BLACKSTONE))
         .method33772(var0, "polished_blackstone_from_blackstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.BLACKSTONE), Blocks.POLISHED_BLACKSTONE_WALL)
         .method33771("has_blackstone", method14075(Blocks.BLACKSTONE))
         .method33772(var0, "polished_blackstone_wall_from_blackstone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.BLACKSTONE), Blocks.POLISHED_BLACKSTONE_SLAB, 2)
         .method33771("has_blackstone", method14075(Blocks.BLACKSTONE))
         .method33772(var0, "polished_blackstone_slab_from_blackstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.BLACKSTONE), Blocks.POLISHED_BLACKSTONE_STAIRS)
         .method33771("has_blackstone", method14075(Blocks.BLACKSTONE))
         .method33772(var0, "polished_blackstone_stairs_from_blackstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.BLACKSTONE), Blocks.CHISELED_POLISHED_BLACKSTONE)
         .method33771("has_blackstone", method14075(Blocks.BLACKSTONE))
         .method33772(var0, "chiseled_polished_blackstone_from_blackstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.BLACKSTONE), Blocks.POLISHED_BLACKSTONE_BRICKS)
         .method33771("has_blackstone", method14075(Blocks.BLACKSTONE))
         .method33772(var0, "polished_blackstone_bricks_from_blackstone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.BLACKSTONE), Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, 2)
         .method33771("has_blackstone", method14075(Blocks.BLACKSTONE))
         .method33772(var0, "polished_blackstone_brick_slab_from_blackstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.BLACKSTONE), Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS)
         .method33771("has_blackstone", method14075(Blocks.BLACKSTONE))
         .method33772(var0, "polished_blackstone_brick_stairs_from_blackstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.BLACKSTONE), Blocks.POLISHED_BLACKSTONE_BRICK_WALL)
         .method33771("has_blackstone", method14075(Blocks.BLACKSTONE))
         .method33772(var0, "polished_blackstone_brick_wall_from_blackstone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.POLISHED_BLACKSTONE), Blocks.POLISHED_BLACKSTONE_SLAB, 2)
         .method33771("has_polished_blackstone", method14075(Blocks.POLISHED_BLACKSTONE))
         .method33772(var0, "polished_blackstone_slab_from_polished_blackstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.POLISHED_BLACKSTONE), Blocks.POLISHED_BLACKSTONE_STAIRS)
         .method33771("has_polished_blackstone", method14075(Blocks.POLISHED_BLACKSTONE))
         .method33772(var0, "polished_blackstone_stairs_from_polished_blackstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.POLISHED_BLACKSTONE), Blocks.POLISHED_BLACKSTONE_BRICKS)
         .method33771("has_polished_blackstone", method14075(Blocks.POLISHED_BLACKSTONE))
         .method33772(var0, "polished_blackstone_bricks_from_polished_blackstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.POLISHED_BLACKSTONE), Blocks.POLISHED_BLACKSTONE_WALL)
         .method33771("has_polished_blackstone", method14075(Blocks.POLISHED_BLACKSTONE))
         .method33772(var0, "polished_blackstone_wall_from_polished_blackstone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.POLISHED_BLACKSTONE), Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, 2)
         .method33771("has_polished_blackstone", method14075(Blocks.POLISHED_BLACKSTONE))
         .method33772(var0, "polished_blackstone_brick_slab_from_polished_blackstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.POLISHED_BLACKSTONE), Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS)
         .method33771("has_polished_blackstone", method14075(Blocks.POLISHED_BLACKSTONE))
         .method33772(var0, "polished_blackstone_brick_stairs_from_polished_blackstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.POLISHED_BLACKSTONE), Blocks.POLISHED_BLACKSTONE_BRICK_WALL)
         .method33771("has_polished_blackstone", method14075(Blocks.POLISHED_BLACKSTONE))
         .method33772(var0, "polished_blackstone_brick_wall_from_polished_blackstone_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.POLISHED_BLACKSTONE), Blocks.CHISELED_POLISHED_BLACKSTONE)
         .method33771("has_polished_blackstone", method14075(Blocks.POLISHED_BLACKSTONE))
         .method33772(var0, "chiseled_polished_blackstone_from_polished_blackstone_stonecutting");
      Class9067.method33770(Ingredient.fromItems(Blocks.POLISHED_BLACKSTONE_BRICKS), Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, 2)
         .method33771("has_polished_blackstone_bricks", method14075(Blocks.POLISHED_BLACKSTONE_BRICKS))
         .method33772(var0, "polished_blackstone_brick_slab_from_polished_blackstone_bricks_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.POLISHED_BLACKSTONE_BRICKS), Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS)
         .method33771("has_polished_blackstone_bricks", method14075(Blocks.POLISHED_BLACKSTONE_BRICKS))
         .method33772(var0, "polished_blackstone_brick_stairs_from_polished_blackstone_bricks_stonecutting");
      Class9067.method33769(Ingredient.fromItems(Blocks.POLISHED_BLACKSTONE_BRICKS), Blocks.POLISHED_BLACKSTONE_BRICK_WALL)
         .method33771("has_polished_blackstone_bricks", method14075(Blocks.POLISHED_BLACKSTONE_BRICKS))
         .method33772(var0, "polished_blackstone_brick_wall_from_polished_blackstone_bricks_stonecutting");
      method14048(var0, Items.field37857, Items.NETHERITE_CHESTPLATE);
      method14048(var0, Items.field37858, Items.field37866);
      method14048(var0, Items.field37856, Items.field37864);
      method14048(var0, Items.field37859, Items.field37867);
      method14048(var0, Items.field37825, Items.field37830);
      method14048(var0, Items.field37828, Items.field37833);
      method14048(var0, Items.field37827, Items.field37832);
      method14048(var0, Items.field37829, Items.field37834);
      method14048(var0, Items.field37826, Items.field37831);
   }

   private static void method14048(Consumer<Class4664> var0, Item var1, Item var2) {
      Class9828.method38783(Ingredient.fromItems(var1), Ingredient.fromItems(Items.NETHERITE_INGOT), var2)
         .method38784("has_netherite_ingot", method14075(Items.NETHERITE_INGOT))
         .method38785(var0, Registry.ITEM.getKey(var2.asItem()).getPath() + "_smithing");
   }

   private static void method14049(Consumer<Class4664> var0, IItemProvider var1, ITag<Item> var2) {
      Class8888.method32342(var1, 4).method32343(var2).method32349("planks").method32348("has_log", method14076(var2)).method32350(var0);
   }

   private static void method14050(Consumer<Class4664> var0, IItemProvider var1, ITag<Item> var2) {
      Class8888.method32342(var1, 4).method32343(var2).method32349("planks").method32348("has_logs", method14076(var2)).method32350(var0);
   }

   private static void method14051(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      Class8528.method30248(var1, 3)
         .method30250('#', var2)
         .method30252("##")
         .method30252("##")
         .method30254("bark")
         .method30253("has_log", method14075(var2))
         .method30255(var0);
   }

   private static void method14052(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      Class8528.method30247(var1)
         .method30250('#', var2)
         .method30252("# #")
         .method30252("###")
         .method30254("boat")
         .method30253("in_water", method14074(Blocks.WATER))
         .method30255(var0);
   }

   private static void method14053(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      Class8888.method32341(var1).method32344(var2).method32349("wooden_button").method32348("has_planks", method14075(var2)).method32350(var0);
   }

   private static void method14054(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      Class8528.method30248(var1, 3)
         .method30250('#', var2)
         .method30252("##")
         .method30252("##")
         .method30252("##")
         .method30254("wooden_door")
         .method30253("has_planks", method14075(var2))
         .method30255(var0);
   }

   private static void method14055(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      Class8528.method30248(var1, 3)
         .method30250('#', Items.field37835)
         .method30250('W', var2)
         .method30252("W#W")
         .method30252("W#W")
         .method30254("wooden_fence")
         .method30253("has_planks", method14075(var2))
         .method30255(var0);
   }

   private static void method14056(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      Class8528.method30247(var1)
         .method30250('#', Items.field37835)
         .method30250('W', var2)
         .method30252("#W#")
         .method30252("#W#")
         .method30254("wooden_fence_gate")
         .method30253("has_planks", method14075(var2))
         .method30255(var0);
   }

   private static void method14057(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      Class8528.method30247(var1)
         .method30250('#', var2)
         .method30252("##")
         .method30254("wooden_pressure_plate")
         .method30253("has_planks", method14075(var2))
         .method30255(var0);
   }

   private static void method14058(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      Class8528.method30248(var1, 6)
         .method30250('#', var2)
         .method30252("###")
         .method30254("wooden_slab")
         .method30253("has_planks", method14075(var2))
         .method30255(var0);
   }

   private static void method14059(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      Class8528.method30248(var1, 4)
         .method30250('#', var2)
         .method30252("#  ")
         .method30252("## ")
         .method30252("###")
         .method30254("wooden_stairs")
         .method30253("has_planks", method14075(var2))
         .method30255(var0);
   }

   private static void method14060(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      Class8528.method30248(var1, 2)
         .method30250('#', var2)
         .method30252("###")
         .method30252("###")
         .method30254("wooden_trapdoor")
         .method30253("has_planks", method14075(var2))
         .method30255(var0);
   }

   private static void method14061(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      String var5 = Registry.ITEM.getKey(var2.asItem()).getPath();
      Class8528.method30248(var1, 3)
         .method30254("sign")
         .method30250('#', var2)
         .method30250('X', Items.field37835)
         .method30252("###")
         .method30252("###")
         .method30252(" X ")
         .method30253("has_" + var5, method14075(var2))
         .method30255(var0);
   }

   private static void method14062(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      Class8888.method32341(var1)
         .method32344(var2)
         .method32344(Blocks.WHITE_WOOL)
         .method32349("wool")
         .method32348("has_white_wool", method14075(Blocks.WHITE_WOOL))
         .method32350(var0);
   }

   private static void method14063(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      String var5 = Registry.ITEM.getKey(var2.asItem()).getPath();
      Class8528.method30248(var1, 3)
         .method30250('#', var2)
         .method30252("##")
         .method30254("carpet")
         .method30253("has_" + var5, method14075(var2))
         .method30255(var0);
   }

   private static void method14064(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      String var5 = Registry.ITEM.getKey(var1.asItem()).getPath();
      String var6 = Registry.ITEM.getKey(var2.asItem()).getPath();
      Class8528.method30248(var1, 8)
         .method30250('#', Blocks.WHITE_CARPET)
         .method30250('$', var2)
         .method30252("###")
         .method30252("#$#")
         .method30252("###")
         .method30254("carpet")
         .method30253("has_white_carpet", method14075(Blocks.WHITE_CARPET))
         .method30253("has_" + var6, method14075(var2))
         .method30256(var0, var5 + "_from_white_carpet");
   }

   private static void method14065(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      String var5 = Registry.ITEM.getKey(var2.asItem()).getPath();
      Class8528.method30247(var1)
         .method30250('#', var2)
         .method30249('X', ItemTags.PLANKS)
         .method30252("###")
         .method30252("XXX")
         .method30254("bed")
         .method30253("has_" + var5, method14075(var2))
         .method30255(var0);
   }

   private static void method14066(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      String var5 = Registry.ITEM.getKey(var1.asItem()).getPath();
      Class8888.method32341(var1)
         .method32344(Items.field37938)
         .method32344(var2)
         .method32349("dyed_bed")
         .method32348("has_bed", method14075(Items.field37938))
         .method32351(var0, var5 + "_from_white_bed");
   }

   private static void method14067(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      String var5 = Registry.ITEM.getKey(var2.asItem()).getPath();
      Class8528.method30247(var1)
         .method30250('#', var2)
         .method30250('|', Items.field37835)
         .method30252("###")
         .method30252("###")
         .method30252(" | ")
         .method30254("banner")
         .method30253("has_" + var5, method14075(var2))
         .method30255(var0);
   }

   private static void method14068(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      Class8528.method30248(var1, 8)
         .method30250('#', Blocks.GLASS)
         .method30250('X', var2)
         .method30252("###")
         .method30252("#X#")
         .method30252("###")
         .method30254("stained_glass")
         .method30253("has_glass", method14075(Blocks.GLASS))
         .method30255(var0);
   }

   private static void method14069(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      Class8528.method30248(var1, 16)
         .method30250('#', var2)
         .method30252("###")
         .method30252("###")
         .method30254("stained_glass_pane")
         .method30253("has_glass", method14075(var2))
         .method30255(var0);
   }

   private static void method14070(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      String var5 = Registry.ITEM.getKey(var1.asItem()).getPath();
      String var6 = Registry.ITEM.getKey(var2.asItem()).getPath();
      Class8528.method30248(var1, 8)
         .method30250('#', Blocks.GLASS_PANE)
         .method30250('$', var2)
         .method30252("###")
         .method30252("#$#")
         .method30252("###")
         .method30254("stained_glass_pane")
         .method30253("has_glass_pane", method14075(Blocks.GLASS_PANE))
         .method30253("has_" + var6, method14075(var2))
         .method30256(var0, var5 + "_from_glass_pane");
   }

   private static void method14071(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      Class8528.method30248(var1, 8)
         .method30250('#', Blocks.TERRACOTTA)
         .method30250('X', var2)
         .method30252("###")
         .method30252("#X#")
         .method30252("###")
         .method30254("stained_terracotta")
         .method30253("has_terracotta", method14075(Blocks.TERRACOTTA))
         .method30255(var0);
   }

   private static void method14072(Consumer<Class4664> var0, IItemProvider var1, IItemProvider var2) {
      Class8888.method32342(var1, 8)
         .method32344(var2)
         .method32345(Blocks.SAND, 4)
         .method32345(Blocks.GRAVEL, 4)
         .method32349("concrete_powder")
         .method32348("has_sand", method14075(Blocks.SAND))
         .method32348("has_gravel", method14075(Blocks.GRAVEL))
         .method32350(var0);
   }

   private static void method14073(Consumer<Class4664> var0, String var1, Class6503<?> var2, int var3) {
      Class5625.method17664(Ingredient.fromItems(Items.field37961), Items.field37962, 0.35F, var3, var2)
         .method17667("has_beef", method14075(Items.field37961))
         .method17669(var0, "cooked_beef_from_" + var1);
      Class5625.method17664(Ingredient.fromItems(Items.field37963), Items.field37964, 0.35F, var3, var2)
         .method17667("has_chicken", method14075(Items.field37963))
         .method17669(var0, "cooked_chicken_from_" + var1);
      Class5625.method17664(Ingredient.fromItems(Items.field37909), Items.field37913, 0.35F, var3, var2)
         .method17667("has_cod", method14075(Items.field37909))
         .method17669(var0, "cooked_cod_from_" + var1);
      Class5625.method17664(Ingredient.fromItems(Blocks.KELP), Items.field37958, 0.1F, var3, var2)
         .method17667("has_kelp", method14075(Blocks.KELP))
         .method17669(var0, "dried_kelp_from_" + var1);
      Class5625.method17664(Ingredient.fromItems(Items.field37910), Items.field37914, 0.35F, var3, var2)
         .method17667("has_salmon", method14075(Items.field37910))
         .method17669(var0, "cooked_salmon_from_" + var1);
      Class5625.method17664(Ingredient.fromItems(Items.field38090), Items.field38091, 0.35F, var3, var2)
         .method17667("has_mutton", method14075(Items.field38090))
         .method17669(var0, "cooked_mutton_from_" + var1);
      Class5625.method17664(Ingredient.fromItems(Items.PORKCHOP), Items.field37870, 0.35F, var3, var2)
         .method17667("has_porkchop", method14075(Items.PORKCHOP))
         .method17669(var0, "cooked_porkchop_from_" + var1);
      Class5625.method17664(Ingredient.fromItems(Items.field38053), Items.field38054, 0.35F, var3, var2)
         .method17667("has_potato", method14075(Items.field38053))
         .method17669(var0, "baked_potato_from_" + var1);
      Class5625.method17664(Ingredient.fromItems(Items.field38077), Items.field38078, 0.35F, var3, var2)
         .method17667("has_rabbit", method14075(Items.field38077))
         .method17669(var0, "cooked_rabbit_from_" + var1);
   }

   private static Class4466 method14074(Block var0) {
      return new Class4466(Class9587.field44822, var0, Class7340.field31445);
   }

   private static Class4491 method14075(IItemProvider var0) {
      return method14077(Class9735.method38146().method38147(var0).method38151());
   }

   private static Class4491 method14076(ITag<Item> var0) {
      return method14077(Class9735.method38146().method38148(var0).method38151());
   }

   private static Class4491 method14077(Class8634... var0) {
      return new Class4491(Class9587.field44822, Class8840.field39936, Class8840.field39936, Class8840.field39936, var0);
   }

   @Override
   public String method14012() {
      return "Recipes";
   }
}
