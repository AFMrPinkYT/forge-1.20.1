package net.afmrpink.EndiumMod.Item;

import net.afmrpink.EndiumMod.EndiumMod;
import net.afmrpink.EndiumMod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier ENDIUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2500, 14f, 5f, 30,
                    ModTags.Blocks.NEEDS_ENDIUM_TOOL, () -> Ingredient.of(ModItems.ENDIUM.get())),
            new ResourceLocation(EndiumMod.MOD_ID, "endium"), List.of(Tiers.NETHERITE), List.of());

}
