package com.thefuturemarine.ArmorModPlus.item;

import com.thefuturemarine.ArmorModPlus.client.ArmorMod;

import net.minecraft.item.Item;

public class ItemBase extends Item{
	public ItemBase(String name)
	{
		this.setCreativeTab(ArmorMod.tabItems);
		
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
