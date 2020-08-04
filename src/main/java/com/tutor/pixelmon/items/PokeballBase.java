package com.tutor.pixelmon.items;

import com.tutor.pixelmon.PixelmonModIgnited;
import com.tutor.pixelmon.util.RegistryHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class PokeballBase extends ItemBase {

    public  PokeballBase() {
        super(new Item.Properties().group(PixelmonModIgnited.POKEBALLSTAB));
    }

    @Override
    public void onCreated(ItemStack stack, World worldIn, PlayerEntity playerIn) {
        super.onCreated(RegistryHandler.Pokeball.get().getDefaultInstance(), worldIn, playerIn);

    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

}
