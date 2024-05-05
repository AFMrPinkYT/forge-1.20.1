package net.afmrpink.EndiumMod.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.afmrpink.EndiumMod.Block.ModBlocks;
import net.afmrpink.EndiumMod.EndiumMod;
import net.afmrpink.EndiumMod.recipe.EndiumSuperSmelterRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class EndiumSuperSmelterCategory implements IRecipeCategory<EndiumSuperSmelterRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(EndiumMod.MOD_ID, "endium_super_smelter");
    public static final ResourceLocation TEXTURE = new ResourceLocation(EndiumMod.MOD_ID,
            "textures/gui/endium_super_smelter_gui.png");

    public static final RecipeType<EndiumSuperSmelterRecipe> ENDIUM_SUPER_SMELTER_TYPE =
            new RecipeType<>(UID, EndiumSuperSmelterRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public EndiumSuperSmelterCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.ENDIUM_SUPER_SMELTER.get()));
    }

    @Override
    public RecipeType<EndiumSuperSmelterRecipe> getRecipeType() {
        return ENDIUM_SUPER_SMELTER_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.endiummod.endium_super_smelter");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, EndiumSuperSmelterRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 11).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 59).addItemStack(recipe.getResultItem(null));
    }
}
