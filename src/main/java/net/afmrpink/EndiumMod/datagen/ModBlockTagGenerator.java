package net.afmrpink.EndiumMod.datagen;

import net.afmrpink.EndiumMod.Block.ModBlocks;
import net.afmrpink.EndiumMod.EndiumMod;
import net.afmrpink.EndiumMod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EndiumMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Blocks.TIER_1_ORE_FINDER_VALUABLES)
                .addTag(Tags.Blocks.ORES_COAL);
        this.tag(ModTags.Blocks.TIER_2_ORE_FINDER_VALUABLES)
                .addTag(Tags.Blocks.ORES_COAL)
                .addTag(Tags.Blocks.ORES_IRON);
        this.tag(ModTags.Blocks.TIER_3_ORE_FINDER_VALUABLES)
                .addTag(Tags.Blocks.ORES_COAL)
                .addTag(Tags.Blocks.ORES_IRON)
                .addTag(Tags.Blocks.ORES_GOLD);
        this.tag(ModTags.Blocks.TIER_4_ORE_FINDER_VALUABLES)
                .addTag(Tags.Blocks.ORES_COAL)
                .addTag(Tags.Blocks.ORES_IRON)
                .addTag(Tags.Blocks.ORES_GOLD)
                .addTag(Tags.Blocks.ORES_REDSTONE);
        this.tag(ModTags.Blocks.TIER_5_ORE_FINDER_VALUABLES)
                .addTag(Tags.Blocks.ORES_COAL)
                .addTag(Tags.Blocks.ORES_IRON)
                .addTag(Tags.Blocks.ORES_GOLD)
                .addTag(Tags.Blocks.ORES_REDSTONE)
                .addTag(Tags.Blocks.ORES_LAPIS);
        this.tag(ModTags.Blocks.TIER_6_ORE_FINDER_VALUABLES)
                .addTag(Tags.Blocks.ORES_COAL)
                .addTag(Tags.Blocks.ORES_IRON)
                .addTag(Tags.Blocks.ORES_GOLD)
                .addTag(Tags.Blocks.ORES_REDSTONE)
                .addTag(Tags.Blocks.ORES_LAPIS)
                .addTag(Tags.Blocks.ORES_DIAMOND);
        this.tag(ModTags.Blocks.ADVANCED_ORE_FINDER_VALUABLES)
                .add(ModBlocks.RAW_ENDIUM_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BLOCK_OF_ENDIUM.get());
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.RAW_ENDIUM_ORE.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BLOCK_OF_ENDIUM.get(),
                        ModBlocks.RAW_ENDIUM_ORE.get());
    }
}
