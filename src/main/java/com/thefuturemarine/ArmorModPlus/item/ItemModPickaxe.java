package com.thefuturemarine.ArmorModPlus.item;

import com.thefuturemarine.ArmorModPlus.client.ArmorMod;

import net.minecraft.item.ItemPickaxe;

public class ItemModPickaxe extends ItemPickaxe{

	public ItemModPickaxe(String name, ToolMaterial material) {
		super(material);
		this.setCreativeTab(ArmorMod.tabTools);
		this.setMaxStackSize(1);
		this.isRepairable();
		
		setUnlocalizedName(name);
		setRegistryName(name);
	}

}
