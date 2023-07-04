package net.ned.allbs.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ned.allbs.AllBsMod;
import net.ned.allbs.block.ModBlocks;
import net.ned.allbs.item.custom.ModFootComponents;

public class ModItems {
public static final Item IRON_SHARD = registerItem("iron_shard",
        new Item(new FabricItemSettings()));
    public static final Item NETHERITE_SHARD = registerItem("netherite_shard",
            new Item(new FabricItemSettings()));
    public static final Item STONE_SHARD = registerItem("stone_shard",
            new Item(new FabricItemSettings()));
    public static final Item DIAMOND_SHARD = registerItem("diamond_shard",
            new Item(new FabricItemSettings()));
    public static final Item GOLD_SHARD = registerItem("gold_shard",
            new Item(new FabricItemSettings()));
    public static final Item OAK_PLANK_SHARD = registerItem("oak_plank_shard",
            new Item(new FabricItemSettings()));

    public static final Item RAW_URANIUM = registerItem("raw_uranium",
            new Item(new FabricItemSettings().food(ModFootComponents.RAW_URANIUM)));

    public static final Item URANIUM_INGOT = registerItem("uranium_ingot",
            new Item(new FabricItemSettings()));

private static Item registerItem(String name, Item item){
    return Registry.register(Registries.ITEM, new Identifier(AllBsMod.MOD_ID, name), item);
}

private static void itemGroupIngredients(FabricItemGroupEntries entries) {
    entries.add(IRON_SHARD);
    entries.add(NETHERITE_SHARD);
    entries.add(DIAMOND_SHARD);
    entries.add(STONE_SHARD);
    entries.add(GOLD_SHARD);
    entries.add(OAK_PLANK_SHARD);
    entries.add(RAW_URANIUM);
    entries.add(URANIUM_INGOT);

}
private static void itemGroupNatural(FabricItemGroupEntries entries) {
    entries.add(ModBlocks.URANIUM_ORE);


}
    private static void itemGroupBuildingBlocks(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.URANIUM_BLOCK);
    }
    public static void registerModItems () {
        AllBsMod.LOGGER.info("Registering Mod Items for " + AllBsMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::itemGroupNatural);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::itemGroupBuildingBlocks);

    }
}
