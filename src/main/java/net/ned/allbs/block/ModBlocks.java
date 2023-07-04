package net.ned.allbs.block;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ned.allbs.AllBsMod;

public class ModBlocks {


    public static final Block PROCESSED_OAK_PLANKS = registerBlock("processed_oak_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block PROCESSED_SPRUCE_PLANKS = registerBlock("processed_spruce_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PROCESSED_DARK_OAK_PLANKS = registerBlock("processed_dark_oak_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PROCESSED_BAMBOO_PLANKS = registerBlock("processed_bamboo_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PROCESSED_CRIMSON_PLANKS = registerBlock("processed_crimson_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PROCESSED_WARPED_PLANKS = registerBlock("processed_warped_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PROCESSED_MANGROVE_PLANKS = registerBlock("processed_mangrove_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PROCESSED_JUNGLE_PLANKS = registerBlock("processed_jungle_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PROCESSED_BIRCH_PLANKS = registerBlock("processed_birch_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PROCESSED_CHERRY_PLANKS = registerBlock("processed_cherry_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PROCESSED_ACACIA_PLANKS = registerBlock("processed_acacia_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block URANIUM_ORE = registerBlock("uranium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));

    public static final Block URANIUM_BLOCK = registerBlock("uranium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));



    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AllBsMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(AllBsMod.MOD_ID, name),
               new BlockItem(block, new FabricItemSettings()));

    }

    public static void registerModBlocks(){
        AllBsMod.LOGGER.info("Registering Mod Blocks for " + AllBsMod.MOD_ID);


    }
}
