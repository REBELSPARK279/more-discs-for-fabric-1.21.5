package net.rebelspark.more_discs_rebelspark.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.rebelspark.more_discs_rebelspark.item.ModItems;
import net.rebelspark.more_discs_rebelspark.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.ALPHA_MUSIC_DISC)
                .add(ModItems.BLIND_SPOTS_MUSIC_DISC)
                .add(ModItems.DOOR_MUSIC_DISC)

        ;

    }
}
