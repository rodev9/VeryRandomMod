package com.romilo903.veryrandommod.init;

import com.romilo903.veryrandommod.VeryRandomMod;
import com.romilo903.veryrandommod.tools.ModItemTier;
import net.minecraft.item.*;
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
    public static final Item orange = null;

    // Tools
    public static final Item nether_star_sword = null;
    public static final Item nether_star_pickaxe = null;
    public static final Item nether_star_axe = null;
    public static final Item nether_star_shovel = null;
    public static final Item nether_star_hoe = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new Item(new Item.Properties()
                .group(VeryRandomMod.ItemTab)
        ).setRegistryName("romilo"));

        event.getRegistry().register(new Item(new Item.Properties()
                .group(VeryRandomMod.ItemTab)
        ).setRegistryName("plastic_fragment"));

        event.getRegistry().register(new Item(new Item.Properties()
                .group(VeryRandomMod.ItemTab)
                .food(new Food.Builder()
                        .hunger(5)
                        .saturation(3.0f)
                        .build()
                )
        ).setRegistryName("orange"));

        // Tools
        event.getRegistry().register(new SwordItem(ModItemTier.NETHER_STAR, 4, -2.0F, new Item.Properties()
                .group(VeryRandomMod.ItemTab)
                .rarity(Rarity.UNCOMMON)
        ).setRegistryName("nether_star_sword"));

        event.getRegistry().register(new PickaxeItem(ModItemTier.NETHER_STAR, 1, -2.8F, new Item.Properties()
                .group(VeryRandomMod.ItemTab)
                .rarity(Rarity.UNCOMMON)
        ).setRegistryName("nether_star_pickaxe"));

        event.getRegistry().register(new AxeItem(ModItemTier.NETHER_STAR, 5, -3.3F, new Item.Properties()
                .group(VeryRandomMod.ItemTab)
                .rarity(Rarity.UNCOMMON)
        ).setRegistryName("nether_star_axe"));

        event.getRegistry().register(new ShovelItem(ModItemTier.NETHER_STAR, 0.5F, -3.0F, new Item.Properties()
                .group(VeryRandomMod.ItemTab)
                .rarity(Rarity.UNCOMMON)
        ).setRegistryName("nether_star_shovel"));

        event.getRegistry().register(new HoeItem(ModItemTier.NETHER_STAR, -3, 1.0F, new Item.Properties()
                .group(VeryRandomMod.ItemTab)
                .rarity(Rarity.UNCOMMON)
        ).setRegistryName("nether_star_hoe"));
    }
}
