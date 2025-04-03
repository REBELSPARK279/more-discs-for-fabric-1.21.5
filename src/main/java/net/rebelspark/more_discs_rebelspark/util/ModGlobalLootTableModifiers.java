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
    private static final Identifier MANSION = Identifier.of("minecraft", "chests/woodland_mansion");
    private static final Identifier FISH_TREASURE = Identifier.of("minecraft", "gameplay/fishing/treasure");
    private static final Identifier CHORUS_PLANT = Identifier.of("minecraft", "blocks/chorus_plant");
    private static final Identifier ICE = Identifier.of("minecraft", "blocks/ice");
    private static final Identifier STRAY = Identifier.of("minecraft", "entities/stray");
    private static final Identifier SHEEP_YELLOW = Identifier.of("minecraft", "entities/sheep/yellow");
    private static final Identifier FORT = Identifier.of("minecraft", "chests/nether_bridge");
    private static final Identifier ANCIENT_CITY = Identifier.of("minecraft", "chests/ancient_city");
    private static final Identifier STRONG_XING = Identifier.of("minecraft", "chests/stronghold_crossing");
    private static final Identifier END_CITY_TREASURE = Identifier.of("minecraft", "chests/end_city/treasure");
    private static final Identifier SKELETON = Identifier.of("minecraft", "entities/skeleton");
    private static final Identifier SPAWNERS = Identifier.of("minecraft", "chests/simple_dungeon");
    private static final Identifier ARCH_DES_WELL = Identifier.of("minecraft", "archeology/desert_well");
    private static final Identifier ARCH_DES_TEMP = Identifier.of("minecraft", "archeology/desert_pyramid");
    private static final Identifier VILLAGE_FISH = Identifier.of("minecraft", "chests/village/village_fisher");
    private static final Identifier CHERRY_LEAVES = Identifier.of("minecraft", "blocks/cherry_leaves");
    private static final Identifier JUNG_TEMP = Identifier.of("minecraft", "chests/jungle_temple");
    private static final Identifier TREASURE = Identifier.of("minecraft", "chests/buried_treasure");
    private static final Identifier RUIN_PORT = Identifier.of("minecraft", "chests/ruined_portal");
    private static final Identifier MINESHAFT = Identifier.of("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier GRASS_BLOCK = Identifier.of("minecraft", "blocks/grass_block");
    private static final Identifier STONE = Identifier.of("minecraft", "blocks/stone");
    private static final Identifier IRON_GOLEM = Identifier.of("minecraft", "entities/iron_golem");
    private static final Identifier SHEEP_PINK = Identifier.of("minecraft", "entities/sheep/pink");
    private static final Identifier DRAGON = Identifier.of("minecraft", "entities/ender_dragon");
    private static final Identifier SEA_LANTERN = Identifier.of("minecraft", "blocks/sea_lantern");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {

            //A FAM ROOM

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

            //ARIA MATH

            if(BLAZE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.013f))
                    .with(ItemEntry.builder(ModItems.ARIA_MATH_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(MAGMA_CUBE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.009f))
                    .with(ItemEntry.builder(ModItems.ARIA_MATH_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //BIOME FEST

            if(MOOSHROOM.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.1175f))
                    .with(ItemEntry.builder(ModItems.BIOME_FEST_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(MANSION.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.165f))
                    .with(ItemEntry.builder(ModItems.BIOME_FEST_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(FISH_TREASURE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.14f))
                    .with(ItemEntry.builder(ModItems.BIOME_FEST_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //BEGINNING 2

            if(CHORUS_PLANT.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.06f))
                    .with(ItemEntry.builder(ModItems.BEGINNING2_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            //CHRIS

            if(IGLOO.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.28f))
                    .with(ItemEntry.builder(ModItems.CHRIS_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(ICE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.054f))
                    .with(ItemEntry.builder(ModItems.CHRIS_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

            if(STRAY.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.16f))
                    .with(ItemEntry.builder(ModItems.CHRIS_MUSIC_DISC))
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }



        });
    }
}