package net.afmrpink.EndiumMod.datagen;

import net.afmrpink.EndiumMod.EndiumMod.Block.ModBlocks;
import net.afmrpink.EndiumMod.EndiumMod.Item.ModItems;
import net.afmrpink.EndiumMod.EndiumMod;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModItems.RAW_ENDIUM.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.ENDIUM.get(), 0.25f, 200, "sapphire");
        oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.ENDIUM.get(), 0.25f, 100, "sapphire");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLOCK_OF_ENDIUM.get())
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .define('E', ModItems.ENDIUM.get())
                .unlockedBy(getHasName(ModItems.ENDIUM.get()), has(ModItems.ENDIUM.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDIUM_PICKAXE.get())
                .pattern("EEE")
                .pattern(" # ")
                .pattern(" # ")
                .define('E', ModItems.ENDIUM.get())
                .define('#', Items.STICK)
                .unlockedBy(getHasName(ModItems.ENDIUM.get()), has(ModItems.ENDIUM.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDIUM_SHOVEL.get())
                .pattern(" E ")
                .pattern(" # ")
                .pattern(" # ")
                .define('E', ModItems.ENDIUM.get())
                .define('#', Items.STICK)
                .unlockedBy(getHasName(ModItems.ENDIUM.get()), has(ModItems.ENDIUM.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDIUM_HOE.get())
                .pattern(" EE")
                .pattern(" # ")
                .pattern(" # ")
                .define('E', ModItems.ENDIUM.get())
                .define('#', Items.STICK)
                .unlockedBy(getHasName(ModItems.ENDIUM.get()), has(ModItems.ENDIUM.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDIUM_SWORD.get())
                .pattern(" E ")
                .pattern(" E ")
                .pattern(" # ")
                .define('E', ModItems.ENDIUM.get())
                .define('#', Items.STICK)
                .unlockedBy(getHasName(ModItems.ENDIUM.get()), has(ModItems.ENDIUM.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDIUM_AXE.get())
                .pattern(" EE")
                .pattern(" #E")
                .pattern(" # ")
                .define('E', ModItems.ENDIUM.get())
                .define('#', Items.STICK)
                .unlockedBy(getHasName(ModItems.ENDIUM.get()), has(ModItems.ENDIUM.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIER_1_ORE_FINDER.get())
                .pattern(" C ")
                .pattern(" # ")
                .pattern(" # ")
                .define('C', Items.COAL_BLOCK)
                .define('#', Items.STICK)
                .unlockedBy(getHasName(Items.COAL_BLOCK), has(Items.COAL_BLOCK))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIER_2_ORE_FINDER.get())
                .pattern(" I ")
                .pattern(" # ")
                .pattern("   ")
                .define('I', Items.IRON_BLOCK)
                .define('#', ModItems.TIER_1_ORE_FINDER.get())
                .unlockedBy(getHasName(ModItems.TIER_1_ORE_FINDER.get()), has(Items.IRON_BLOCK))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIER_3_ORE_FINDER.get())
                .pattern(" G ")
                .pattern(" # ")
                .pattern("   ")
                .define('G', Items.GOLD_BLOCK)
                .define('#', ModItems.TIER_2_ORE_FINDER.get())
                .unlockedBy(getHasName(ModItems.TIER_2_ORE_FINDER.get()), has(Items.GOLD_BLOCK))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIER_4_ORE_FINDER.get())
                .pattern(" R ")
                .pattern(" # ")
                .pattern("   ")
                .define('R', Items.REDSTONE_BLOCK)
                .define('#', ModItems.TIER_3_ORE_FINDER.get())
                .unlockedBy(getHasName(ModItems.TIER_3_ORE_FINDER.get()), has(Items.REDSTONE_BLOCK))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIER_5_ORE_FINDER.get())
                .pattern(" L ")
                .pattern(" # ")
                .pattern("   ")
                .define('L', Items.LAPIS_BLOCK)
                .define('#', ModItems.TIER_4_ORE_FINDER.get())
                .unlockedBy(getHasName(ModItems.TIER_4_ORE_FINDER.get()), has(Items.LAPIS_BLOCK))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIER_6_ORE_FINDER.get())
                .pattern(" D ")
                .pattern(" # ")
                .pattern("   ")
                .define('D', Items.DIAMOND_BLOCK)
                .define('#', ModItems.TIER_5_ORE_FINDER.get())
                .unlockedBy(getHasName(ModItems.TIER_5_ORE_FINDER.get()), has(Items.DIAMOND_BLOCK))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENDIUM.get(), 9)
                .requires(ModBlocks.BLOCK_OF_ENDIUM.get())
                .unlockedBy(getHasName(ModBlocks.BLOCK_OF_ENDIUM.get()), has(ModBlocks.BLOCK_OF_ENDIUM.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  EndiumMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}