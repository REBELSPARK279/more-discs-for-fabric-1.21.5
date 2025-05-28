package net.rebelspark.more_discs_rebelspark.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Blocks;
import net.rebelspark.more_discs_rebelspark.MoreDiscs;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {
    public static final RegistryKey<PointOfInterestType> DISC_JOCKEY_POI_KEY = registerPoiKey("disc_jockey_poi");
    public static final PointOfInterestType DISC_JOCKEY_POI = registerPOI("disc_jockey_poi", Blocks.JUKEBOX);

    public static final RegistryKey<VillagerProfession> DISC_JOCKEY_KEY =
            RegistryKey.of(RegistryKeys.VILLAGER_PROFESSION, Identifier.of(MoreDiscs.MOD_ID, "disc_jockey"));
    public static final VillagerProfession DISC_JOCKEY = registerProfession("disc_jockey", DISC_JOCKEY_POI_KEY);


    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, Identifier.of(MoreDiscs.MOD_ID, name),
                new VillagerProfession(Text.literal("Disc Jockey"), entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_ALLAY_AMBIENT_WITH_ITEM));
    }

    private static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(Identifier.of(MoreDiscs.MOD_ID, name),
                1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> registerPoiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, Identifier.of(MoreDiscs.MOD_ID, name));
    }

    public static void registerVillagers() {
        MoreDiscs.LOGGER.info("Registered Villagers for " + MoreDiscs.MOD_ID);
    }
}
