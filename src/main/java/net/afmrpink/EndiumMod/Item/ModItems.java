package net.afmrpink.EndiumMod.Item;

import net.afmrpink.EndiumMod.EndiumMod.Item.custom.*;
import net.afmrpink.Item.custom.*;
import net.afmrpink.EndiumMod.EndiumMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EndiumMod.MOD_ID);

    public static final RegistryObject<Item> ENDIUM = ITEMS.register("endium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNPURIFIED_ENDIUM = ITEMS.register("unpurified_endium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ENDIUM = ITEMS.register("raw_endium",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> ENDIUM_AXE = ITEMS.register("endium_axe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDIUM_PICKAXE = ITEMS.register("endium_pickaxe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDIUM_SHOVEL = ITEMS.register("endium_shovel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDIUM_SWORD = ITEMS.register("endium_sword",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDIUM_HOE = ITEMS.register("endium_hoe",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> TIER_1_ORE_FINDER = ITEMS.register("tier_1_ore_finder",
            () -> new Tier1OreFinderItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> TIER_2_ORE_FINDER = ITEMS.register("tier_2_ore_finder",
            () -> new Tier2OreFinderItem(new Item.Properties().durability(200)));
    public static final RegistryObject<Item> TIER_3_ORE_FINDER = ITEMS.register("tier_3_ore_finder",
            () -> new Tier3OreFinderItem(new Item.Properties().durability(350)));
    public static final RegistryObject<Item> TIER_4_ORE_FINDER = ITEMS.register("tier_4_ore_finder",
            () -> new Tier4OreFinderItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> TIER_5_ORE_FINDER = ITEMS.register("tier_5_ore_finder",
            () -> new Tier5OreFinderItem(new Item.Properties().durability(800)));
    public static final RegistryObject<Item> TIER_6_ORE_FINDER = ITEMS.register("tier_6_ore_finder",
            () -> new Tier6OreFinderItem(new Item.Properties().durability(1500)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
