package net.rebelspark.more_discs_rebelspark;


import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.rebelspark.more_discs_rebelspark.datagen.ModItemTagProvider;
import net.rebelspark.more_discs_rebelspark.datagen.ModModelProvider;
import net.rebelspark.more_discs_rebelspark.datagen.ModRecipeProvider;

public class MoreDiscsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

       pack.addProvider(ModModelProvider::new);
       pack.addProvider(ModRecipeProvider::new);
    }
}