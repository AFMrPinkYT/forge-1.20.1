package net.afmrpink.EndiumMod.util;

import net.afmrpink.EndiumMod.EndiumMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_ENDIUM_TOOL = tag("needs_endium_tool");

        public static final TagKey<Block> TIER_1_ORE_FINDER_VALUABLES = tag("tier_1_ore_finder_valuables");
        public static final TagKey<Block> TIER_2_ORE_FINDER_VALUABLES = tag("tier_2_ore_finder_valuables");
        public static final TagKey<Block> TIER_3_ORE_FINDER_VALUABLES = tag("tier_3_ore_finder_valuables");
        public static final TagKey<Block> TIER_4_ORE_FINDER_VALUABLES = tag("tier_4_ore_finder_valuables");
        public static final TagKey<Block> TIER_5_ORE_FINDER_VALUABLES = tag("tier_5_ore_finder_valuables");
        public static final TagKey<Block> TIER_6_ORE_FINDER_VALUABLES = tag("tier_6_ore_finder_valuables");
        public static final TagKey<Block> ADVANCED_ORE_FINDER_VALUABLES = tag("advanced_ore_finder_valuables");



        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(EndiumMod.MOD_ID, name));
        }
    }

    public static class Items {

    }
}
