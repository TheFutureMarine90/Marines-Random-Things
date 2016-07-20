package com.thefuturemarine.ArmorModPlus.item;

import com.thefuturemarine.ArmorModPlus.client.ArmorMod;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemModArmor extends ItemArmor{

	public ItemModArmor(String unlocalizedName, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setCreativeTab(ArmorMod.tabTools);
		this.setMaxStackSize(1);
		this.isRepairable();
		
		setUnlocalizedName(unlocalizedName);
		setRegistryName(unlocalizedName);
	}
}
