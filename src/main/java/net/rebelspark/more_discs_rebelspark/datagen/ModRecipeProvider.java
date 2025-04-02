package net.rebelspark.more_discs_rebelspark.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.rebelspark.more_discs_rebelspark.item.ModItems;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {

                createShaped(RecipeCategory.MISC, ModItems.EMPTY_DISC_CORE)
                        .pattern(" R ")
                        .pattern("RIR")
                        .pattern(" R ")
                        .input('R', Items.REDSTONE)
                        .input('I', Items.IRON_INGOT)
                        .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                        .offerTo(exporter);

                //createShapeless(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, 9)
                  //      .input(ModBlocks.RAW_PINK_GARNET_BLOCK)
                    //    .criterion(hasItem(ModBlocks.RAW_PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.RAW_PINK_GARNET_BLOCK))
                      //  .offerTo(exporter);
            }
        };
    }


    @Override
    public String getName() {
        return "MoreDiscs Recipes";
    }
}
