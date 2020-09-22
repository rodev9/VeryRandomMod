package com.romilo903.veryrandommod.init;

import com.romilo903.veryrandommod.VeryRandomMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@ObjectHolder(VeryRandomMod.MOD_ID)
@Mod.EventBusSubscriber(modid = VeryRandomMod.MOD_ID, bus = Bus.MOD)
public class BlockInit {
    public static final Block plastic_block = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new Block(Block.Properties
                .create(Material.GLASS)
                .hardnessAndResistance(0.1f, 0.6f)
                .sound(SoundType.STEM)
                .notSolid()
        ).setRegistryName("plastic_block"));
    }

    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new BlockItem(plastic_block, new Item.Properties()
                .group(VeryRandomMod.ItemTab)
        ).setRegistryName("plastic_block"));
    }
}
