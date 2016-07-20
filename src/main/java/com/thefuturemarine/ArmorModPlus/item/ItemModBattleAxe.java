package com.thefuturemarine.ArmorModPlus.item;

import com.thefuturemarine.ArmorModPlus.client.ArmorMod;
import net.minecraft.item.ItemSword;

public class ItemModBattleAxe extends ItemSword {

    public ItemModBattleAxe(String name, ToolMaterial material) {
        super(material);
        this.setMaxStackSize(1);
        this.setCreativeTab(ArmorMod.tabTools);
        this.isRepairable();

        setUnlocalizedName(name);
        setRegistryName(name);
    }

}

