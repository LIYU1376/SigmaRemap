// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class Class8710 extends Class8708
{
    private static final Map<String, String> field36597;
    
    public Class8710(final Schema schema, final boolean b) {
        super(schema, b, "Recipes fix", s -> Class8710.field36597.getOrDefault(s, s));
    }
    
    static {
        field36597 = (Map)ImmutableMap.builder().put((Object)"minecraft:acacia_wooden_slab", (Object)"minecraft:acacia_slab").put((Object)"minecraft:birch_wooden_slab", (Object)"minecraft:birch_slab").put((Object)"minecraft:black_stained_hardened_clay", (Object)"minecraft:black_terracotta").put((Object)"minecraft:blue_stained_hardened_clay", (Object)"minecraft:blue_terracotta").put((Object)"minecraft:boat", (Object)"minecraft:oak_boat").put((Object)"minecraft:bone_meal_from_block", (Object)"minecraft:bone_meal_from_bone_block").put((Object)"minecraft:bone_meal_from_bone", (Object)"minecraft:bone_meal").put((Object)"minecraft:brick_block", (Object)"minecraft:bricks").put((Object)"minecraft:brown_stained_hardened_clay", (Object)"minecraft:brown_terracotta").put((Object)"minecraft:chiseled_stonebrick", (Object)"minecraft:chiseled_stone_bricks").put((Object)"minecraft:cyan_stained_hardened_clay", (Object)"minecraft:cyan_terracotta").put((Object)"minecraft:dark_oak_wooden_slab", (Object)"minecraft:dark_oak_slab").put((Object)"minecraft:end_bricks", (Object)"minecraft:end_stone_bricks").put((Object)"minecraft:fence_gate", (Object)"minecraft:oak_fence_gate").put((Object)"minecraft:fence", (Object)"minecraft:oak_fence").put((Object)"minecraft:golden_rail", (Object)"minecraft:powered_rail").put((Object)"minecraft:gold_ingot_from_block", (Object)"minecraft:gold_ingot_from_gold_block").put((Object)"minecraft:gray_stained_hardened_clay", (Object)"minecraft:gray_terracotta").put((Object)"minecraft:green_stained_hardened_clay", (Object)"minecraft:green_terracotta").put((Object)"minecraft:iron_ingot_from_block", (Object)"minecraft:iron_ingot_from_iron_block").put((Object)"minecraft:jungle_wooden_slab", (Object)"minecraft:jungle_slab").put((Object)"minecraft:light_blue_stained_hardened_clay", (Object)"minecraft:light_blue_terracotta").put((Object)"minecraft:light_gray_stained_hardened_clay", (Object)"minecraft:light_gray_terracotta").put((Object)"minecraft:lime_stained_hardened_clay", (Object)"minecraft:lime_terracotta").put((Object)"minecraft:lit_pumpkin", (Object)"minecraft:jack_o_lantern").put((Object)"minecraft:magenta_stained_hardened_clay", (Object)"minecraft:magenta_terracotta").put((Object)"minecraft:magma", (Object)"minecraft:magma_block").put((Object)"minecraft:melon_block", (Object)"minecraft:melon").put((Object)"minecraft:mossy_stonebrick", (Object)"minecraft:mossy_stone_bricks").put((Object)"minecraft:noteblock", (Object)"minecraft:note_block").put((Object)"minecraft:oak_wooden_slab", (Object)"minecraft:oak_slab").put((Object)"minecraft:orange_stained_hardened_clay", (Object)"minecraft:orange_terracotta").put((Object)"minecraft:pillar_quartz_block", (Object)"minecraft:quartz_pillar").put((Object)"minecraft:pink_stained_hardened_clay", (Object)"minecraft:pink_terracotta").put((Object)"minecraft:purple_shulker_box", (Object)"minecraft:shulker_box").put((Object)"minecraft:purple_stained_hardened_clay", (Object)"minecraft:purple_terracotta").put((Object)"minecraft:red_nether_brick", (Object)"minecraft:red_nether_bricks").put((Object)"minecraft:red_stained_hardened_clay", (Object)"minecraft:red_terracotta").put((Object)"minecraft:slime", (Object)"minecraft:slime_block").put((Object)"minecraft:smooth_red_sandstone", (Object)"minecraft:cut_red_sandstone").put((Object)"minecraft:smooth_sandstone", (Object)"minecraft:cut_sandstone").put((Object)"minecraft:snow_layer", (Object)"minecraft:snow").put((Object)"minecraft:snow", (Object)"minecraft:snow_block").put((Object)"minecraft:speckled_melon", (Object)"minecraft:glistering_melon_slice").put((Object)"minecraft:spruce_wooden_slab", (Object)"minecraft:spruce_slab").put((Object)"minecraft:stonebrick", (Object)"minecraft:stone_bricks").put((Object)"minecraft:stone_stairs", (Object)"minecraft:cobblestone_stairs").put((Object)"minecraft:string_to_wool", (Object)"minecraft:white_wool_from_string").put((Object)"minecraft:trapdoor", (Object)"minecraft:oak_trapdoor").put((Object)"minecraft:white_stained_hardened_clay", (Object)"minecraft:white_terracotta").put((Object)"minecraft:wooden_button", (Object)"minecraft:oak_button").put((Object)"minecraft:wooden_door", (Object)"minecraft:oak_door").put((Object)"minecraft:wooden_pressure_plate", (Object)"minecraft:oak_pressure_plate").put((Object)"minecraft:yellow_stained_hardened_clay", (Object)"minecraft:yellow_terracotta").build();
    }
}
