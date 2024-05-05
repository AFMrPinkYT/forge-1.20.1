package net.afmrpink.EndiumMod.recipe;

import net.afmrpink.EndiumMod.EndiumMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, EndiumMod.MOD_ID);

    public static final RegistryObject<RecipeSerializer<EndiumSuperSmelterRecipe>> ENDIUM_SUPER_SMELTER_SERIALIZER =
            SERIALIZERS.register("endium_super_smelter", () -> EndiumSuperSmelterRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}