package net.rebelspark.more_discs_rebelspark;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;
import net.rebelspark.more_discs_rebelspark.block.ModBlocks;
import net.rebelspark.more_discs_rebelspark.item.ModItemGroups;
import net.rebelspark.more_discs_rebelspark.item.ModItems;
import net.rebelspark.more_discs_rebelspark.sound.ModSounds;
import net.rebelspark.more_discs_rebelspark.util.ModGlobalLootTableModifiers;
import net.rebelspark.more_discs_rebelspark.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreDiscs implements ModInitializer {
	public static final String MOD_ID = "more_discs_rebelspark";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
		ModGlobalLootTableModifiers.modifyLootTables();
		ModVillagers.registerVillagers();


		//TRADES
		//1
		TradeOfferHelper.registerVillagerOffers(ModVillagers.DISC_JOCKEY_KEY, 1, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 4),
					new ItemStack(Items.FLINT, 8), 16, 1, 0.02f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 3),
					new ItemStack(Items.FLINT, 8), 16, 1, 0.02f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 4),
					new ItemStack(Items.FLINT, 9), 16, 1, 0.02f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 3),
					new ItemStack(Items.FLINT, 7), 16, 1, 0.02f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 5),
					new ItemStack(Items.FLINT, 9), 16, 1, 0.02f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 20),
					new ItemStack(ModItems.DREITON_MUSIC_DISC, 1), 10, 4, 0.07f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 20),
					new ItemStack(ModItems.DRY_HANDS_MUSIC_DISC, 1), 10, 4, 0.07f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 20),
					new ItemStack(ModItems.FLOATING_TREES_MUSIC_DISC, 1), 10, 4, 0.07f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 20),
					new ItemStack(ModItems.HAUNT_MUSKIE_MUSIC_DISC, 1), 10, 4, 0.07f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 20),
					new ItemStack(ModItems.HEADBUG_MUSIC_DISC, 1), 10, 4, 0.07f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 20),
					new ItemStack(ModItems.KI_MUSIC_DISC, 1), 10, 4, 0.07f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 20),
					new ItemStack(ModItems.SWEDEN_MUSIC_DISC, 1), 10, 4, 0.07f));

			});
		//2
		TradeOfferHelper.registerVillagerOffers(ModVillagers.DISC_JOCKEY_KEY, 2, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 18),
					new ItemStack(ModItems.DREITON_MUSIC_DISC, 1), 10, 8, 0.07f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 18),
					new ItemStack(ModItems.DRY_HANDS_MUSIC_DISC, 1), 10, 8, 0.07f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 18),
					new ItemStack(ModItems.FLOATING_TREES_MUSIC_DISC, 1), 10, 8, 0.07f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 18),
					new ItemStack(ModItems.HAUNT_MUSKIE_MUSIC_DISC, 1), 10, 8, 0.07f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 18),
					new ItemStack(ModItems.HEADBUG_MUSIC_DISC, 1), 10, 8, 0.07f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 18),
					new ItemStack(ModItems.KI_MUSIC_DISC, 1), 10, 8, 0.07f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 18),
					new ItemStack(ModItems.SWEDEN_MUSIC_DISC, 1), 10, 8, 0.07f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 25),
					new ItemStack(ModItems.ALPHA_MUSIC_DISC, 1), 10, 10, 0.07f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 25),
					new ItemStack(ModItems.ARIA_MATH_MUSIC_DISC, 1), 10, 10, 0.07f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 25),
					new ItemStack(ModItems.BLIND_SPOTS_MUSIC_DISC, 1), 10, 10, 0.07f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 25),
					new ItemStack(ModItems.LIVING_MICE_MUSIC_DISC, 1), 10, 10, 0.07f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 25),
					new ItemStack(ModItems.MOOG_CITY2_DISC_FRAGMENT, 1), 10, 10, 0.07f));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 25),
					new ItemStack(ModItems.MUTATION_MUSIC_DISC, 1), 10, 10, 0.07f));
		});
		//3
		TradeOfferHelper.registerVillagerOffers(ModVillagers.DISC_JOCKEY_KEY, 3, factories -> {

		});
		//4
		TradeOfferHelper.registerVillagerOffers(ModVillagers.DISC_JOCKEY_KEY, 4, factories -> {

		});
		//5
		TradeOfferHelper.registerVillagerOffers(ModVillagers.DISC_JOCKEY_KEY, 5, factories -> {

		});
	}
}