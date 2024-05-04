package net.afmrpink.EndiumMod.screen;

import net.afmrpink.EndiumMod.EndiumMod;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, EndiumMod.MOD_ID);

    public static final RegistryObject<MenuType<EndiumPurifierMenu>> ENDIUM_PURIFIER_MENU =
            registerMenuType("endium_purifier_menu", EndiumPurifierMenu::new);
    public static final RegistryObject<MenuType<EndiumSuperSmelterMenu>> ENDIUM_SUPER_SMELTER_MENU =
            registerMenuType("endium_super_smelter_menu", EndiumSuperSmelterMenu::new);


    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(String name, IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}