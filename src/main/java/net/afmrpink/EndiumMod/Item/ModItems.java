package net.afmrpink.EndiumMod.Item;

import net.afmrpink.EndiumMod.EndiumMod;
import net.afmrpink.EndiumMod.Item.custom.*;
import net.minecraft.world.item.*;
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
            () -> new AxeItem(ModToolTiers.ENDIUM, 8, 1, new Item.Properties()));
    public static final RegistryObject<Item> ENDIUM_PICKAXE = ITEMS.register("endium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ENDIUM, 2, 1, new Item.Properties()));
    public static final RegistryObject<Item> ENDIUM_SHOVEL = ITEMS.register("endium_shovel",
            () -> new ShovelItem(ModToolTiers.ENDIUM, 2, 1, new Item.Properties()));
    public static final RegistryObject<Item> ENDIUM_SWORD = ITEMS.register("endium_sword",
            () -> new SwordItem(ModToolTiers.ENDIUM, 5, 2, new Item.Properties()));
    public static final RegistryObject<Item> ENDIUM_HOE = ITEMS.register("endium_hoe",
            () -> new HoeItem(ModToolTiers.ENDIUM, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> ENDIUM_HELMET = ITEMS.register("endium_helmet",
            () -> new ModArmorItem(ModArmorMaterials.ENDIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ENDIUM_CHESTPLATE = ITEMS.register("endium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ENDIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ENDIUM_LEGGINGS = ITEMS.register("endium_leggings",
            () -> new ArmorItem(ModArmorMaterials.ENDIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ENDIUM_BOOTS = ITEMS.register("endium_boots",
            () -> new ArmorItem(ModArmorMaterials.ENDIUM, ArmorItem.Type.BOOTS, new Item.Properties()));


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
    public static final RegistryObject<Item> ADVANCED_ORE_FINDER = ITEMS.register("advanced_ore_finder",
            () -> new AdvancedOreFinder(new Item.Properties().durability(2000)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
