package net.ned.allbs.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.ned.allbs.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs(){
        registerFuels();

    }
 public static void registerFuels(){
     FuelRegistry registry = FuelRegistry.INSTANCE;
     registry.add(ModItems.RAW_URANIUM, 36000);
 }
}
