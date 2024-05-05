package net.afmrpink.EndiumMod;

import com.mojang.logging.LogUtils;
import net.afmrpink.EndiumMod.Block.ModBlocks;
import net.afmrpink.EndiumMod.Block.custom.entity.ModBlockEntities;
import net.afmrpink.EndiumMod.Item.ModCreativeModeTabs;
import net.afmrpink.EndiumMod.Item.ModItems;
import net.afmrpink.EndiumMod.recipe.ModRecipes;
import net.afmrpink.EndiumMod.screen.EndiumPurifierScreen;
import net.afmrpink.EndiumMod.screen.EndiumSuperSmelterScreen;
import net.afmrpink.EndiumMod.screen.ModMenuTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(EndiumMod.MOD_ID)
public class EndiumMod {
    public static final String MOD_ID = "endiummod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public EndiumMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModMenuTypes.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModRecipes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

            MenuScreens.register(ModMenuTypes.ENDIUM_PURIFIER_MENU.get(), EndiumPurifierScreen::new);
            MenuScreens.register(ModMenuTypes.ENDIUM_SUPER_SMELTER_MENU.get(), EndiumSuperSmelterScreen::new);
        }
    }
}