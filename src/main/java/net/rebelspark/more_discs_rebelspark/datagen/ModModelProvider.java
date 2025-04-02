package net.rebelspark.more_discs_rebelspark.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
//OLD import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.rebelspark.more_discs_rebelspark.MoreDiscs;
import net.rebelspark.more_discs_rebelspark.block.ModBlocks;
import net.rebelspark.more_discs_rebelspark.item.ModItems;
import net.minecraft.client.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {


      }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);


        itemModelGenerator.register(ModItems.A_FAMILIAR_ROOM_MUSIC_DISC, Models.GENERATED);
    }
}