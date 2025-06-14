package net.rebelspark.more_discs_rebelspark.item;

import net.minecraft.component.type.TooltipDisplayComponent;
import net.rebelspark.more_discs_rebelspark.MoreDiscs;
import net.rebelspark.more_discs_rebelspark.sound.ModSounds;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModItems {

//DISC FRAGS

    public static final Item DOG_DISC_FRAGMENT = registerItem("dog_disc_fragment", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID, "dog_disc_fragment"))).maxCount(8)));
    public static final Item MOOG_CITY2_DISC_FRAGMENT = registerItem("moog_city2_disc_fragment", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID, "moog_city2_disc_fragment"))).maxCount(8)));
    public static final Item MINECRAFT_DISC_FRAGMENT = registerItem("minecraft_disc_fragment", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID, "minecraft_disc_fragment"))).maxCount(8)));

   //DISC CORE

    public static final Item EMPTY_DISC_CORE = registerItem("empty_disc_core", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID, "empty_disc_core"))).maxCount(16)));

//A
    public static final Item A_FAMILIAR_ROOM_MUSIC_DISC = registerItem("a_familiar_room_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
            "a_familiar_room_music_disc"))).jukeboxPlayable(ModSounds.A_FAMILIAR_ROOM_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.epic_disc"));}});

    public static final Item ALPHA_MUSIC_DISC = registerItem("alpha_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "alpha_music_disc"))).jukeboxPlayable(ModSounds.ALPHA_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));}});

    public static final Item ARIA_MATH_MUSIC_DISC = registerItem("aria_math_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "aria_math_music_disc"))).jukeboxPlayable(ModSounds.ARIA_MATH_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.rare_disc"));}});

    public static final Item BACK_ON_DASH_MUSIC_DISC = registerItem("back_on_dash_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "back_on_dash_music_disc"))).jukeboxPlayable(ModSounds.BACK_ON_DASH_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.vill_disc"));}});

    public static final Item BEGINNING_MUSIC_DISC = registerItem("beginning_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "beginning_music_disc"))).jukeboxPlayable(ModSounds.BEGINNING_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.gen_wandy-t_disc"));}});

    public static final Item BEGINNING2_MUSIC_DISC = registerItem("beginning2_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "beginning2_music_disc"))).jukeboxPlayable(ModSounds.BEGINNING2_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.rare_disc"));}});

    public static final Item BIOME_FEST_MUSIC_DISC = registerItem("biome_fest_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "biome_fest_music_disc"))).jukeboxPlayable(ModSounds.BIOME_FEST_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.epic_disc"));}});

    public static final Item BLIND_SPOTS_MUSIC_DISC = registerItem("blind_spots_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "blind_spots_music_disc"))).jukeboxPlayable(ModSounds.BLIND_SPOTS_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));}});

    public static final Item CASTLEMANIA_MUSIC_DISC = registerItem("castlemania_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "castlemania_music_disc"))).jukeboxPlayable(ModSounds.CASTLEMANIA_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.gen_wandy-t_disc"));}});

    public static final Item CASTLEMANIA2_MUSIC_DISC = registerItem("castlemania2_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "castlemania2_music_disc"))).jukeboxPlayable(ModSounds.CASTLEMANIA2_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.rare_wandy-t_disc"));}});

    public static final Item CHRIS_MUSIC_DISC = registerItem("chris_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "chris_music_disc"))).jukeboxPlayable(ModSounds.CHRIS_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.rare_disc"));}});

    public static final Item CLARK_MUSIC_DISC = registerItem("clark_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "clark_music_disc"))).jukeboxPlayable(ModSounds.CLARK_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.rare_disc"));}});

    public static final Item DANNY_MUSIC_DISC = registerItem("danny_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "danny_music_disc"))).jukeboxPlayable(ModSounds.DANNY_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.legendary_disc"));}});

    public static final Item DEATH_MUSIC_DISC = registerItem("death_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "death_music_disc"))).jukeboxPlayable(ModSounds.DEATH_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.vill_disc"));}});

    public static final Item DOG_MUSIC_DISC = registerItem("dog_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "dog_music_disc"))).jukeboxPlayable(ModSounds.DOG_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.legendary_disc"));}});

    public static final Item DOOR_MUSIC_DISC = registerItem("door_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "door_music_disc"))).jukeboxPlayable(ModSounds.DOOR_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));}});

    public static final Item DREITON_MUSIC_DISC = registerItem("dreiton_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "dreiton_music_disc"))).jukeboxPlayable(ModSounds.DREITON_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.common_disc"));}});

    public static final Item DRY_HANDS_MUSIC_DISC = registerItem("dry_hands_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "dry_hands_music_disc"))).jukeboxPlayable(ModSounds.DRY_HANDS_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.common_disc"));}});

    public static final Item EXCUSE_MUSIC_DISC = registerItem("excuse_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "excuse_music_disc"))).jukeboxPlayable(ModSounds.EXCUSE_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.common_disc"));}});

    public static final Item EXECUTIONER_MUSIC_DISC = registerItem("executioner_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "executioner_music_disc"))).jukeboxPlayable(ModSounds.EXECUTIONER_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.vill_disc"));}});

    public static final Item FLAKE_MUSIC_DISC = registerItem("flake_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "flake_music_disc"))).jukeboxPlayable(ModSounds.FLAKE_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.rare_disc"));}});

    public static final Item FLOATING_TREES_MUSIC_DISC = registerItem("floating_trees_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "floating_trees_music_disc"))).jukeboxPlayable(ModSounds.FLOATING_TREES_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.common_disc"));}});

    public static final Item HAGGSTROM_MUSIC_DISC = registerItem("haggstrom_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "haggstrom_music_disc"))).jukeboxPlayable(ModSounds.HAGGSTROM_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.epic_disc"));}});

    public static final Item HARDCOREMINECRAFT_MUSIC_DISC = registerItem("hardcoreminecraft_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "hardcoreminecraft_music_disc"))).jukeboxPlayable(ModSounds.HARDCOREMINECRAFT_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.rare_wandy-t_disc"));}});

    public static final Item HAUNT_MUSKIE_MUSIC_DISC = registerItem("haunt_muskie_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "haunt_muskie_music_disc"))).jukeboxPlayable(ModSounds.HAUNT_MUSKIE_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.common_disc"));}});


    public static final Item HEADBUG_MUSIC_DISC = registerItem("headbug_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "headbug_music_disc"))).jukeboxPlayable(ModSounds.HEADBUG_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.common_disc"));}});

    public static final Item INVINCIBLE_MUSIC_DISC = registerItem("invincible_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "invincible_music_disc"))).jukeboxPlayable(ModSounds.INVINCIBLE_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.gen_wandy-t_disc"));}});

    public static final Item KEY_MUSIC_DISC = registerItem("key_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "key_music_disc"))).jukeboxPlayable(ModSounds.KEY_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.common_disc"));}});

    public static final Item KI_MUSIC_DISC = registerItem("ki_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "ki_music_disc"))).jukeboxPlayable(ModSounds.KI_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.common_disc"));}});

    public static final Item LIVING_MICE_MUSIC_DISC = registerItem("living_mice_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "living_mice_music_disc"))).jukeboxPlayable(ModSounds.LIVING_MICE_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));}});

    public static final Item MICE_ON_VENUS_MUSIC_DISC = registerItem("mice_on_venus_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "mice_on_venus_music_disc"))).jukeboxPlayable(ModSounds.MICE_ON_VENUS_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.epic_disc"));}});

    public static final Item MINECRAFT_MUSIC_DISC = registerItem("minecraft_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "minecraft_music_disc"))).jukeboxPlayable(ModSounds.MINECRAFT_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.legendary_disc"));}});

    public static final Item MOOG_CITY_MUSIC_DISC = registerItem("moog_city_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "moog_city_music_disc"))).jukeboxPlayable(ModSounds.MOOG_CITY_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));}});

    public static final Item MOOG_CITY2_MUSIC_DISC = registerItem("moog_city2_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "moog_city2_music_disc"))).jukeboxPlayable(ModSounds.MOOG_CITY2_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.legendary_disc"));}});

    public static final Item MUTATION_MUSIC_DISC = registerItem("mutation_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "mutation_music_disc"))).jukeboxPlayable(ModSounds.MUTATION_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.uncommon_disc"));}});

    public static final Item REVENGE_MUSIC_DISC = registerItem("revenge_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "revenge_music_disc"))).jukeboxPlayable(ModSounds.REVENGE_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.legendary_disc"));}});

    public static final Item SUBWOOFER_LULLABY_MUSIC_DISC = registerItem("subwoofer_lullaby_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "subwoofer_lullaby_music_disc"))).jukeboxPlayable(ModSounds.SUBWOOFER_LULLABY_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.rare_disc"));}});

    public static final Item SWEDEN_MUSIC_DISC = registerItem("sweden_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                "sweden_music_disc"))).jukeboxPlayable(ModSounds.SWEDEN_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.common_disc"));}});

    public static final Item TASWELL_MUSIC_DISC = registerItem("taswell_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "taswell_music_disc"))).jukeboxPlayable(ModSounds.TASWELL_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.legendary_disc"));}});

    public static final Item WET_HANDS_MUSIC_DISC = registerItem("wet_hands_music_disc",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreDiscs.MOD_ID,
                    "wet_hands_music_disc"))).jukeboxPlayable(ModSounds.WET_HANDS_KEY).maxCount(1)) {
                @Override public void appendTooltip(ItemStack stack, TooltipContext context,
                                                    TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
                    super.appendTooltip(stack, context, displayComponent, textConsumer, type);
                    textConsumer.accept(Text.translatable("tooltip.more_discs_rebelspark.rare_disc"));}});





















    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreDiscs.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreDiscs.LOGGER.info("Mod items for " + MoreDiscs.MOD_ID + " are being registered!");


    }
}