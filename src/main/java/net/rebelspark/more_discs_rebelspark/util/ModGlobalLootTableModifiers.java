package net.rebelspark.more_discs_rebelspark.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.rebelspark.more_discs_rebelspark.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModGlobalLootTableModifiers {
    private static final Identifier DES_TEMP = Identifier.of("minecraft", "chests/desert_pyramid");
    private static final Identifier IGLOO = Identifier.of("minecraft", "chests/igloo_chest");
    private static final Identifier BASTION_OTHER = Identifier.of("minecraft", "chests/bastion_other");
    private static final Identifier BLAZE = Identifier.of("minecraft", "entities/blaze");
    private static final Identifier MAGMA_CUBE = Identifier.of("minecraft", "entities/magma_cube");
    private static final Identifier MOOSHROOM = Identifier.of("minecraft", "entities/mooshroom");
    private static final Identifier B = Identifier.of("minecraft", "chests/bastion_other");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {

            if(DES_TEMP.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.0625f))
                        .with(ItemEntry.builder(ModItems.A_FAMILIAR_ROOM_MUSIC_DISC))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(IGLOO.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0475f))
                    .with(ItemEntry.builder(ModItems.A_FAMILIAR_ROOM_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(BASTION_OTHER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.03f))
                    .with(ItemEntry.builder(ModItems.A_FAMILIAR_ROOM_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }



        });
    }
}