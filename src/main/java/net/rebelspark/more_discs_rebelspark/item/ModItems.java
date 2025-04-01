package net.rebelspark.more_discs_rebelspark.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.rebelspark.more_discs_rebelspark.MoreDiscs;
import net.rebelspark.more_discs_rebelspark.sound.ModSounds;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {



    public static final Item A_FAMILIAR_ROOM_MUSIC_DISC = registerItem("a_familiar_room_music_disc",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID, "a_familiar_room_music_disc")))
                    .jukeboxPlayable(ModSounds.A_FAMILIAR_ROOM_KEY).maxCount(1))//{
       // @Override
       // public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
           // tooltip.add(Text.translatable("tooltip.more_discs_rebelspark.epic_disc"));
           // super.appendTooltip(stack, context, tooltip, type);
           // }
       // }
    );
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID, "raw_pink_garnet")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreDiscs.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreDiscs.LOGGER.info("Registering Mod Items for " + MoreDiscs.MOD_ID);


    }
}