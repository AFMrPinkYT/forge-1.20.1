package net.afmrpink.EndiumMod.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.afmrpink.EndiumMod.EndiumMod;
import net.afmrpink.EndiumMod.recipe.EndiumSuperSmelterRecipe;
import net.afmrpink.EndiumMod.screen.EndiumSuperSmelterScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class JEIEndiumModPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(EndiumMod.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new EndiumSuperSmelterCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<EndiumSuperSmelterRecipe> superSmelterRecipes = recipeManager.getAllRecipesFor(EndiumSuperSmelterRecipe.Type.INSTANCE);
        registration.addRecipes(EndiumSuperSmelterCategory.ENDIUM_SUPER_SMELTER_TYPE, superSmelterRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(EndiumSuperSmelterScreen.class, 78, 30, 20, 30,
                EndiumSuperSmelterCategory.ENDIUM_SUPER_SMELTER_TYPE);
    }
}