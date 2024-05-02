package net.afmrpink.EndiumMod.datagen;

import net.afmrpink.EndiumMod.EndiumMod.Item.ModItems;
import net.afmrpink.EndiumMod.EndiumMod;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EndiumMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ENDIUM);
        simpleItem(ModItems.RAW_ENDIUM);
        simpleItem(ModItems.UNPURIFIED_ENDIUM);

        simpleItem(ModItems.ENDIUM_AXE);
        simpleItem(ModItems.ENDIUM_HOE);
        simpleItem(ModItems.ENDIUM_PICKAXE);
        simpleItem(ModItems.ENDIUM_SHOVEL);
        simpleItem(ModItems.ENDIUM_SWORD);

        simpleItem(ModItems.TIER_1_ORE_FINDER);
        simpleItem(ModItems.TIER_2_ORE_FINDER);
        simpleItem(ModItems.TIER_3_ORE_FINDER);
        simpleItem(ModItems.TIER_4_ORE_FINDER);
        simpleItem(ModItems.TIER_5_ORE_FINDER);
        simpleItem(ModItems.TIER_6_ORE_FINDER);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(EndiumMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
