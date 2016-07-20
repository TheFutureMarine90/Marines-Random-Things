package com.thefuturemarine.ArmorModPlus.item;

import com.thefuturemarine.ArmorModPlus.client.ArmorMod;

import net.minecraft.item.ItemHoe;

public class ItemModHoe extends ItemHoe{

	public ItemModHoe(String name, ToolMaterial material) {
		super(material);
		this.setCreativeTab(ArmorMod.tabTools);
		this.setMaxStackSize(1);
		this.isRepairable();
		
		setUnlocalizedName(name);
		setRegistryName(name);
	}

}
