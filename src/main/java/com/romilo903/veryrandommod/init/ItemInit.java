package com.romilo903.veryrandommod.init;

import com.romilo903.veryrandommod.VeryRandomMod;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = VeryRandomMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(VeryRandomMod.MOD_ID)
public class ItemInit {
    public static final Item romilo = null;
    public static final Item plastic_fragment = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new Item(new Item.Properties()
                .group(VeryRandomMod.ItemTab)
        ).setRegistryName("romilo"));

        event.getRegistry().register(new Item(new Item.Properties()
                .group(VeryRandomMod.ItemTab)
        ).setRegistryName("plastic_fragment"));
    }
}
