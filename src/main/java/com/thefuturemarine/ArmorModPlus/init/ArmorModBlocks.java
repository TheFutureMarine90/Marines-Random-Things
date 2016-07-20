package com.thefuturemarine.ArmorModPlus.init;

import com.thefuturemarine.ArmorModPlus.block.*;
import com.thefuturemarine.ArmorModPlus.block.decoration.BlockLamp;
import com.thefuturemarine.ArmorModPlus.client.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ArmorModBlocks {
	
	public static Block ruby_ore;
	public static Block sapphire_ore;
	public static Block amethyst_ore;
	public static Block topaz_ore;
	public static Block tanzanite_ore;
	public static Block amber_ore;
	public static Block netherrack_coal_ore;
	public static Block netherrack_iron_ore;
	public static Block nethertack_gold_ore;
	public static Block netherrack_diamond_ore;
	public static Block netherrack_emerald_ore;
	public static Block netherrack_lapis_ore;
	public static Block netherrack_redstone_ore;
	public static Block ruby_block;
	public static Block sapphire_block;
	public static Block amethyst_block;
	public static Block topaz_block;
	public static Block tanzanite_block;
	public static Block amber_block;
	//Decorations
	public static Block lamp;


	public static void init() {
		ruby_ore = register(new BlockRubyOre("ruby_ore"));
		sapphire_ore = register(new BlockSapphireOre("sapphire_ore"));
		amethyst_ore = register(new BlockAmethystOre("amethyst_ore"));
		topaz_ore = register(new BlockTopazOre("topaz_ore"));
		tanzanite_ore = register(new BlockTanzaniteOre("tanzanite_ore"));
		amber_ore = register(new BlockAmberOre("amber_ore"));
		netherrack_iron_ore = register(new BlockNetherIronOre("netherrack_iron_ore"));
		nethertack_gold_ore = register(new BlockNetherGoldOre("netherrack_gold_ore"));
		netherrack_coal_ore = register(new BlockNetherCoalOre("netherrack_coal_ore"));
		netherrack_diamond_ore = register(new BlockNetherDiamondOre("netherrack_diamond_ore"));
		netherrack_lapis_ore = register(new BlockNetherLapisOre("netherrack_lapis_ore"));
		netherrack_redstone_ore = register(new BlockNetherRedstoneOre("netherrack_redstone_ore"));
		netherrack_emerald_ore = register(new BlockNetherEmeraldOre("netherrack_emerald_ore"));
		ruby_block = register(new BlockCustomBlock("ruby_block"));
		sapphire_block = register(new BlockCustomBlock("sapphire_block"));
		amethyst_block = register(new BlockCustomBlock("amethyst_block"));
		topaz_block = register(new BlockCustomBlock("topaz_block"));
		tanzanite_block = register(new BlockCustomBlock("tanzanite_block"));
		amber_block = register(new BlockCustomBlock("amber_block"));
		//Decorations
		lamp = register(new BlockLamp("lamp"));




	}
	
	public static void registerRenders() {
		registerRender(ruby_ore);
		registerRender(sapphire_ore);
		registerRender(amethyst_ore);
		registerRender(topaz_ore);
		registerRender(tanzanite_ore);
		registerRender(amber_ore);
		registerRender(ruby_block);
		registerRender(sapphire_block);
		registerRender(amethyst_block);
		registerRender(topaz_block);
		registerRender(tanzanite_block);
		registerRender(amber_block);
		registerRender(netherrack_iron_ore);
		registerRender(nethertack_gold_ore);
		registerRender(netherrack_coal_ore);
		registerRender(netherrack_diamond_ore);
		registerRender(netherrack_lapis_ore);
		registerRender(netherrack_redstone_ore);
		registerRender(netherrack_emerald_ore);
		//Decorations
		registerRender(lamp);


	}
	private static <T extends Block> T register(T block, ItemBlock itemBlock)
	{
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);
		return block;
	}

	private static <T extends Block> T register(T block)
	{
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
	
	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
