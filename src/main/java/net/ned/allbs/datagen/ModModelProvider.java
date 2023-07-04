package net.ned.allbs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.ned.allbs.block.ModBlocks;
import net.ned.allbs.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.URANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.URANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PROCESSED_BAMBOO_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PROCESSED_BIRCH_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PROCESSED_CRIMSON_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PROCESSED_CHERRY_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PROCESSED_DARK_OAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PROCESSED_MANGROVE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PROCESSED_JUNGLE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PROCESSED_WARPED_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PROCESSED_SPRUCE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PROCESSED_OAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PROCESSED_ACACIA_PLANKS);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    itemModelGenerator.register(ModItems.DIAMOND_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.STONE_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.OAK_PLANK_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.URANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_URANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_SHARD, Models.GENERATED);



    }
}
