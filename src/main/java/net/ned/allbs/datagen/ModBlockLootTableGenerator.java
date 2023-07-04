package net.ned.allbs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.ned.allbs.block.ModBlocks;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.URANIUM_BLOCK);
        addDrop(ModBlocks.URANIUM_ORE);
        addDrop(ModBlocks.PROCESSED_ACACIA_PLANKS);
        addDrop(ModBlocks.PROCESSED_BAMBOO_PLANKS);
        addDrop(ModBlocks.PROCESSED_BIRCH_PLANKS);
        addDrop(ModBlocks.PROCESSED_CRIMSON_PLANKS);
        addDrop(ModBlocks.PROCESSED_CHERRY_PLANKS);
        addDrop(ModBlocks.PROCESSED_DARK_OAK_PLANKS);
        addDrop(ModBlocks.PROCESSED_MANGROVE_PLANKS);
        addDrop(ModBlocks.PROCESSED_JUNGLE_PLANKS);
        addDrop(ModBlocks.PROCESSED_WARPED_PLANKS);
        addDrop(ModBlocks.PROCESSED_SPRUCE_PLANKS);
        addDrop(ModBlocks.PROCESSED_OAK_PLANKS);
    }
}
