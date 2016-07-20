package com.thefuturemarine.ArmorModPlus.block;

import com.thefuturemarine.ArmorModPlus.client.ArmorMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCustomBlock extends Block{

	public BlockCustomBlock(String name) {
		super(Material.ROCK);
		this.setHarvestLevel("pickaxe", 3);
		this.setStepSound(SoundType.STONE);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setCreativeTab(ArmorMod.tabBlocks);

		setUnlocalizedName(name);
		setRegistryName(name);
	}

	private void setStepSound(SoundType stone) {
		
	}

}
