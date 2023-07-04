package net.ned.allbs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.mininglevel.v1.FabricMineableTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.ned.allbs.block.ModBlocks;
import net.ned.allbs.util.ModRegistries;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.PROCESSED_BAMBOO_PLANKS,
                        ModBlocks.PROCESSED_ACACIA_PLANKS,
                        ModBlocks.PROCESSED_BIRCH_PLANKS,
                        ModBlocks.PROCESSED_CHERRY_PLANKS,
                        ModBlocks.PROCESSED_CRIMSON_PLANKS,
                        ModBlocks.PROCESSED_JUNGLE_PLANKS,
                        ModBlocks.PROCESSED_DARK_OAK_PLANKS,
                        ModBlocks.PROCESSED_MANGROVE_PLANKS,
                        ModBlocks.PROCESSED_OAK_PLANKS,
                        ModBlocks.PROCESSED_SPRUCE_PLANKS,
                        ModBlocks.PROCESSED_WARPED_PLANKS);

    }
}
