package com.thefuturemarine.ArmorModPlus.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ArmorModBlockTab extends CreativeTabs{

	public ArmorModBlockTab(int index, String label) {
		super(index, label);
		this.setBackgroundImageName("armor.png");
	}

	public Item getTabIconItem() {
		return Item.getItemFromBlock(ArmorModBlocks.ruby_block);
	}
}
