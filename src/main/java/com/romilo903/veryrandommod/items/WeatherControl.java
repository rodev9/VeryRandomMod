package com.romilo903.veryrandommod.items;

import com.romilo903.veryrandommod.util.helpers.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.List;

public class WeatherControl extends Item {
    public WeatherControl(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (KeyboardHelper.isHoldingShift()) {
            tooltip.add(new StringTextComponent("This item controls the weather"));
            tooltip.add(new StringTextComponent("Right-click to switch the weather"));
        } else {
            tooltip.add(new StringTextComponent("Hold " + TextFormatting.YELLOW + TextFormatting.ITALIC + "SHIFT" + TextFormatting.RESET + " for more info"));
        }

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack item = playerIn.getHeldItem(handIn);

        if (item.getDamage() < item.getMaxDamage() || playerIn.isCreative()) {
            if (worldIn.isRaining() || worldIn.isThundering()) {
                worldIn.getWorldInfo().setRaining(false);
                playerIn.sendStatusMessage(new StringTextComponent(TextFormatting.GREEN + "Weather Clear"), true);
            } else {
                worldIn.getWorldInfo().setRaining(true);
                playerIn.sendStatusMessage(new StringTextComponent(TextFormatting.GREEN + "Raining"), true);
            }

            if (!playerIn.isCreative()) item.setDamage(item.getDamage() + 1);
        } else {
            playerIn.sendStatusMessage(new StringTextComponent(TextFormatting.RED + "This item is broken"), true);
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
