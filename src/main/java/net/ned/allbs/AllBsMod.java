package net.ned.allbs;

import net.fabricmc.api.ModInitializer;

import net.ned.allbs.block.ModBlocks;
import net.ned.allbs.item.ModItemGroup;
import net.ned.allbs.item.ModItems;
import net.ned.allbs.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AllBsMod implements ModInitializer {
	public static final String MOD_ID = "allbs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();
	}
}