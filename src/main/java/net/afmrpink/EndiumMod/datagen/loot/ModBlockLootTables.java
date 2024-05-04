package net.afmrpink.EndiumMod.datagen.loot;

import net.afmrpink.EndiumMod.Block.ModBlocks;
import net.afmrpink.EndiumMod.Item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.BLOCK_OF_ENDIUM.get());
        this.dropSelf(ModBlocks.ENDIUM_PURIFIER.get());
        this.dropSelf(ModBlocks.ENDIUM_SUPER_SMELTER.get());

        this.add(ModBlocks.RAW_ENDIUM_ORE.get(),
            block -> createOreDrop(ModBlocks.RAW_ENDIUM_ORE.get(), ModItems.RAW_ENDIUM.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
