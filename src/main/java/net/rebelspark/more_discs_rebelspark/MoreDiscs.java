package net.rebelspark.more_discs_rebelspark;

import net.fabricmc.api.ModInitializer;

import net.rebelspark.more_discs_rebelspark.block.ModBlocks;
import net.rebelspark.more_discs_rebelspark.item.ModItemGroups;
import net.rebelspark.more_discs_rebelspark.item.ModItems;
import net.rebelspark.more_discs_rebelspark.sound.ModSounds;
import net.rebelspark.more_discs_rebelspark.util.ModGlobalLootTableModifiers;
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

	}
}