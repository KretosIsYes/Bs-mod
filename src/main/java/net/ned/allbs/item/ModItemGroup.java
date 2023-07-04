package net.ned.allbs.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.ned.allbs.AllBsMod;
import net.ned.allbs.block.ModBlocks;

public class ModItemGroup {
public static final ItemGroup PROCESSED_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(AllBsMod.MOD_ID, "processed_group"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.processed_group"))
                .icon(()-> new ItemStack(ModBlocks.PROCESSED_OAK_PLANKS)).entries((displayContext, entries) -> {

                    entries.add(ModBlocks.PROCESSED_OAK_PLANKS);
                    entries.add(ModBlocks.PROCESSED_BIRCH_PLANKS);
                    entries.add(ModBlocks.PROCESSED_CRIMSON_PLANKS);
                    entries.add(ModBlocks.PROCESSED_WARPED_PLANKS);
                    entries.add(ModBlocks.PROCESSED_DARK_OAK_PLANKS);
                    entries.add(ModBlocks.PROCESSED_BAMBOO_PLANKS);
                    entries.add(ModBlocks.PROCESSED_CHERRY_PLANKS);
                    entries.add(ModBlocks.PROCESSED_JUNGLE_PLANKS);
                    entries.add(ModBlocks.PROCESSED_MANGROVE_PLANKS);
                    entries.add(ModBlocks.PROCESSED_SPRUCE_PLANKS);
                    entries.add(ModBlocks.PROCESSED_ACACIA_PLANKS);

                }).build());

    public static void registerItemGroups(){

    }
}
