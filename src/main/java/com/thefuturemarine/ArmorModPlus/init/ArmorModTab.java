package com.thefuturemarine.ArmorModPlus.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ArmorModTab extends CreativeTabs{

	public ArmorModTab(int index, String label) {
		super(index, label);
		this.setBackgroundImageName("armor.png");
	}

	@Override
	public Item getTabIconItem() {
		return ArmorModItems.ruby;
	}
}
