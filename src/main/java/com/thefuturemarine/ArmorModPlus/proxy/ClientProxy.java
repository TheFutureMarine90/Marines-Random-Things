package com.thefuturemarine.ArmorModPlus.proxy;

import com.thefuturemarine.ArmorModPlus.init.ArmorModBlocks;
import com.thefuturemarine.ArmorModPlus.init.ArmorModItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		ArmorModItems.registerRenders();
		ArmorModBlocks.registerRenders();
	}
}
