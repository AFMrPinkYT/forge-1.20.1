package net.afmrpink.EndiumMod.datagen;

import net.afmrpink.EndiumMod.Block.ModBlocks;
import net.afmrpink.EndiumMod.EndiumMod;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EndiumMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RAW_ENDIUM_ORE);
        blockWithItem(ModBlocks.BLOCK_OF_ENDIUM);

        simpleBlockWithItem(ModBlocks.ENDIUM_PURIFIER.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/endium_purifier")));
        simpleBlockWithItem(ModBlocks.ENDIUM_SUPER_SMELTER.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/endium_super_smelter")));

    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
