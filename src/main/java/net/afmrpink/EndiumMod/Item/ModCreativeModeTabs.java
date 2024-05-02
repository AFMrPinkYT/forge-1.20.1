package net.afmrpink.EndiumMod.Item;

import net.afmrpink.EndiumMod.EndiumMod.Block.ModBlocks;
import net.afmrpink.EndiumMod.EndiumMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EndiumMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENDIUM.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ENDIUM.get());
                        output.accept(ModItems.UNPURIFIED_ENDIUM.get());
                        output.accept(ModItems.RAW_ENDIUM.get());

                        output.accept(ModItems.ENDIUM_AXE.get());
                        output.accept(ModItems.ENDIUM_PICKAXE.get());
                        output.accept(ModItems.ENDIUM_SHOVEL.get());
                        output.accept(ModItems.ENDIUM_SWORD.get());
                        output.accept(ModItems.ENDIUM_HOE.get());

                        output.accept(ModItems.TIER_1_ORE_FINDER.get());
                        output.accept(ModItems.TIER_2_ORE_FINDER.get());
                        output.accept(ModItems.TIER_3_ORE_FINDER.get());
                        output.accept(ModItems.TIER_4_ORE_FINDER.get());
                        output.accept(ModItems.TIER_5_ORE_FINDER.get());
                        output.accept(ModItems.TIER_6_ORE_FINDER.get());

                        output.accept(ModBlocks.RAW_ENDIUM_ORE.get());
                        output.accept(ModBlocks.BLOCK_OF_ENDIUM.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
