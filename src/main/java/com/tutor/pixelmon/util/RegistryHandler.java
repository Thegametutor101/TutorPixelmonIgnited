package com.tutor.pixelmon.util;

import com.tutor.pixelmon.PixelmonModIgnited;
import com.tutor.pixelmon.blocks.BlockItemBase;
import com.tutor.pixelmon.blocks.Pokeblock;
import com.tutor.pixelmon.items.PokeballBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, PixelmonModIgnited.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, PixelmonModIgnited.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> Pokeball = ITEMS.register("pokeball", PokeballBase::new);
    public static final RegistryObject<Item> Greatball = ITEMS.register("greatball", PokeballBase::new);
    public static final RegistryObject<Item> Ultraball = ITEMS.register("ultraball", PokeballBase::new);
    public static final RegistryObject<Item> StandardBase = ITEMS.register("standard_base", PokeballBase::new);
    public static final RegistryObject<Item> PokeballLid = ITEMS.register("pokeball_lid", PokeballBase::new);

    //Blocks
    public static final RegistryObject<Block> PokeBlock = BLOCKS.register("pokeblock", Pokeblock::new);

    //Block Items
    public static final RegistryObject<Item> PokeBlockItem = ITEMS.register("pokeblock", () -> new BlockItemBase(PokeBlock.get()));
}
