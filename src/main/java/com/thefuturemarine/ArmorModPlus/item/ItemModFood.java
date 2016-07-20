package com.thefuturemarine.ArmorModPlus.item;

import com.thefuturemarine.ArmorModPlus.client.ArmorMod;

import net.minecraft.item.ItemFood;

public class ItemModFood extends ItemFood{

	public ItemModFood(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setCreativeTab(ArmorMod.tabItems);
		this.setMaxStackSize(16);

		setUnlocalizedName(name);
		setRegistryName(name);
	}

}
