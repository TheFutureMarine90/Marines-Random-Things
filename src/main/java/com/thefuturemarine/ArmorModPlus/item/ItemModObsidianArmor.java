package com.thefuturemarine.ArmorModPlus.item;

import com.thefuturemarine.ArmorModPlus.client.ArmorMod;

import com.thefuturemarine.ArmorModPlus.init.ArmorModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemModObsidianArmor extends ItemArmor {
	public ItemModObsidianArmor(String unlocalizedName, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setCreativeTab(ArmorMod.tabTools);
		this.setMaxStackSize(1);
		this.isRepairable();

		setUnlocalizedName(unlocalizedName);
		setRegistryName(unlocalizedName);
	}

	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD) != null && player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ArmorModItems.obsidian_helmet)
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST) != null && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ArmorModItems.obsidian_chestplate)
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS) != null && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ArmorModItems.obsidian_leggings)
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET) != null && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ArmorModItems.obsidian_boots)
					{
						player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 120, 4, true, true));
						player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 120, 4, true, true));
						player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 120, 4, true, true));
					}
	}
}