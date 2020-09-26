package com.romilo903.veryrandommod;

import com.romilo903.veryrandommod.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(VeryRandomMod.MOD_ID)
public class VeryRandomMod
{
    public static final String MOD_ID = "veryrandom";
    public static VeryRandomMod instance;

    public VeryRandomMod() {
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static final ItemGroup ItemTab = new ItemGroup("veryrandommod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.plastic_fragment);
        }
    };
}
