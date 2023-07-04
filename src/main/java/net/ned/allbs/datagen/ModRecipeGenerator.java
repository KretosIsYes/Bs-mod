package net.ned.allbs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.ned.allbs.block.ModBlocks;
import net.ned.allbs.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.URANIUM_BLOCK)
                .pattern("UUU")
                .pattern("UUU")
                .pattern("UUU")
                .input('U', ModItems.URANIUM_INGOT)
                .criterion(hasItem(ModItems.URANIUM_INGOT), conditionsFromItem(ModItems.URANIUM_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.URANIUM_BLOCK)));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.URANIUM_INGOT, RecipeCategory.MISC, ModBlocks.URANIUM_BLOCK);
    offerSmelting(exporter, List.of(ModBlocks.URANIUM_ORE), RecipeCategory.MISC, ModItems.RAW_URANIUM,
            2f, 600, "uranium_ingot");
        offerBlasting(exporter, List.of(ModBlocks.URANIUM_ORE), RecipeCategory.MISC, ModItems.RAW_URANIUM,
                2f, 400, "uranium_ingot");


    }
}
