package com.thefuturemarine.ArmorModPlus.init;

import com.thefuturemarine.ArmorModPlus.client.Reference;
import com.thefuturemarine.ArmorModPlus.event.EventHandler;
import com.thefuturemarine.ArmorModPlus.item.*;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeedFood;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ArmorModItems {
	//EventHandler
	EventHandler events = new EventHandler();
	
	//Items
	public static Item ruby;
	public static Item sapphire;
	public static Item amethyst;
	public static Item topaz;
	public static Item tanzanite;
	public static Item amber;
	public static Item tuna_hoagie;
	public static Item beef_hoagie;
	public static Item chicken_hoagie;
	
	//Tools
	public static ToolMaterial Ruby = EnumHelper.addToolMaterial("Ruby", 4, 2500, 10.0F, 7.0F, 64);
	public static Item ruby_battle_axe;
	public static Item ruby_axe;
	public static Item ruby_pickaxe;
	public static Item ruby_shovel;
	public static Item ruby_hoe;
	public static ToolMaterial Sapphire = EnumHelper.addToolMaterial("Sapphire", 4, 2600, 11.0F, 8.0F, 64);
	public static Item sapphire_battle_axe;
	public static Item sapphire_axe;
	public static Item sapphire_pickaxe;
	public static Item sapphire_shovel;
	public static Item sapphire_hoe;
	public static ToolMaterial Amethyst = EnumHelper.addToolMaterial("Amethyst", 4, 2700, 12.0F, 9.0F, 64);
	public static Item amethyst_battle_axe;
	public static Item amethyst_axe;
	public static Item amethyst_pickaxe;
	public static Item amethyst_shovel;
	public static Item amethyst_hoe;
	public static ToolMaterial Topaz = EnumHelper.addToolMaterial("Topaz", 4, 2800, 10.0F, 11.0F, 64);
	public static Item topaz_battle_axe;
	public static Item topaz_axe;
	public static Item topaz_pickaxe;
	public static Item topaz_shovel;
	public static Item topaz_hoe;
	public static ToolMaterial Tanzanite = EnumHelper.addToolMaterial("Tanzanite", 4, 3000, 15.0F, 13.0F, 64);
	public static Item tanzanite_battle_axe;
	public static Item tanzanite_axe;
	public static Item tanzanite_pickaxe;
	public static Item tanzanite_shovel;
	public static Item tanzanite_hoe;
	public static ToolMaterial Amber = EnumHelper.addToolMaterial("Amber", 4, 2900, 14.0F, 8.0F, 64);
	public static Item amber_battle_axe;
	public static Item amber_axe;
	public static Item amber_pickaxe;
	public static Item amber_shovel;
	public static Item amber_hoe;

	//Armor
	public static ArmorMaterial RubyArmor = EnumHelper.addArmorMaterial("RubyArmor", "am:ruby", 50, new int[]{4,9,6,3}, 64, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	public static Item ruby_helmet;
	public static Item ruby_chestplate;
	public static Item ruby_leggings;
	public static Item ruby_boots;
	public static ArmorMaterial SapphireArmor = EnumHelper.addArmorMaterial("SapphireArmor", "am:sapphire", 50, new int[]{5,10,7,4}, 64, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	public static Item sapphire_helmet;
	public static Item sapphire_chestplate;
	public static Item sapphire_leggings;
	public static Item sapphire_boots;
	public static ArmorMaterial AmethystArmor = EnumHelper.addArmorMaterial("AmethystArmor", "am:amethyst", 50, new int[]{6,11,8,5}, 64, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	public static Item amethyst_helmet;
	public static Item amethyst_chestplate;
	public static Item amethyst_leggings;
	public static Item amethyst_boots;
	public static ArmorMaterial TopazArmor = EnumHelper.addArmorMaterial("TopazArmor", "am:topaz", 50, new int[]{7,12,9,6}, 64, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	public static Item topaz_helmet;
	public static Item topaz_chestplate;
	public static Item topaz_leggings;
	public static Item topaz_boots;
	public static ArmorMaterial TanzaniteArmor = EnumHelper.addArmorMaterial("TanzaniteArmor", "am:tanzanite", 50, new int[]{8,13,10,7}, 64, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	public static Item tanzanite_helmet;
	public static Item tanzanite_chestplate;
	public static Item tanzanite_leggings;
	public static Item tanzanite_boots;
	public static ArmorMaterial AmberArmor = EnumHelper.addArmorMaterial("AmberArmor", "am:amber", 50, new int[]{3,8,5,2}, 64, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	public static Item amber_helmet;
	public static Item amber_chestplate;
	public static Item amber_leggings;
	public static Item amber_boots;
	public static ArmorMaterial ObsidianArmor = EnumHelper.addArmorMaterial("ObsidianArmor", "am:obsidian", 50, new int[]{3,7,10,5}, 64, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	public static Item obsidian_helmet;
	public static Item obsidian_chestplate;
	public static Item obsidian_leggings;
	public static Item obsidian_boots;
	
	public static void init() {
		//Gems
		ruby = register(new ItemBase("ruby"));
		sapphire = register(new ItemBase("sapphire"));
		amethyst = register(new ItemBase("amethyst"));
		topaz = register(new ItemBase("topaz"));
		tanzanite = register(new ItemBase("tanzanite"));
		amber = register(new ItemBase("amber"));
		//Weapons and Tools
		ruby_battle_axe = register(new ItemModBattleAxe("ruby_battle_axe", Ruby));
		ruby_pickaxe = register(new ItemModPickaxe("ruby_pickaxe", Ruby));
		ruby_axe = register(new ItemModAxe("ruby_axe", Ruby));
		ruby_shovel = register(new ItemModShovel("ruby_shovel", Ruby));
		ruby_hoe = register(new ItemModHoe("ruby_hoe", Ruby));
		ruby_helmet = register(new ItemModArmor("ruby_helmet", RubyArmor, 1, EntityEquipmentSlot.HEAD));
		ruby_chestplate = register(new ItemModArmor("ruby_chestplate", RubyArmor, 1, EntityEquipmentSlot.CHEST));
		ruby_leggings = register(new ItemModArmor("ruby_leggings", RubyArmor, 1, EntityEquipmentSlot.LEGS));
		ruby_boots = register(new ItemModArmor("ruby_boots", RubyArmor, 1, EntityEquipmentSlot.FEET));
		sapphire_battle_axe = register(new ItemModBattleAxe("sapphire_battle_axe", Sapphire));
		sapphire_pickaxe = register(new ItemModPickaxe("sapphire_pickaxe", Sapphire));
		sapphire_axe = register(new ItemModAxe("sapphire_axe", Sapphire));
		sapphire_shovel = register(new ItemModShovel("sapphire_shovel", Sapphire));
		sapphire_hoe = register(new ItemModHoe("sapphire_hoe", Sapphire));
		sapphire_helmet = register(new ItemModArmor("sapphire_helmet", SapphireArmor, 1, EntityEquipmentSlot.HEAD));
		sapphire_chestplate = register(new ItemModArmor("sapphire_chestplate", SapphireArmor, 1, EntityEquipmentSlot.CHEST));
		sapphire_leggings = register(new ItemModArmor("sapphire_leggings", SapphireArmor, 1, EntityEquipmentSlot.LEGS));
		sapphire_boots = register(new ItemModArmor("sapphire_boots", SapphireArmor, 1, EntityEquipmentSlot.FEET));
		amethyst_battle_axe = register(new ItemModBattleAxe("amethyst_battle_axe", Amethyst));
		amethyst_pickaxe = register(new ItemModPickaxe("amethyst_pickaxe", Amethyst));
		amethyst_axe = register(new ItemModAxe("amethyst_axe", Amethyst));
		amethyst_shovel = register(new ItemModShovel("amethyst_shovel", Amethyst));
		amethyst_hoe = register(new ItemModHoe("amethyst_hoe", Amethyst));
		amethyst_helmet = register(new ItemModArmor("amethyst_helmet", AmethystArmor, 1, EntityEquipmentSlot.HEAD));
		amethyst_chestplate = register(new ItemModArmor("amethyst_chestplate", AmethystArmor, 1, EntityEquipmentSlot.CHEST));
		amethyst_leggings = register(new ItemModArmor("amethyst_leggings", AmethystArmor, 1, EntityEquipmentSlot.LEGS));
		amethyst_boots = register(new ItemModArmor("amethyst_boots", AmethystArmor, 1, EntityEquipmentSlot.FEET));
		topaz_battle_axe = register(new ItemModBattleAxe("topaz_battle_axe", Topaz));
		topaz_pickaxe = register(new ItemModPickaxe("topaz_pickaxe", Topaz));
		topaz_axe = register(new ItemModAxe("topaz_axe", Topaz));
		topaz_shovel = register(new ItemModShovel("topaz_shovel", Topaz));
		topaz_hoe = register(new ItemModHoe("topaz_hoe", Topaz));
		topaz_helmet = register(new ItemModArmor("topaz_helmet", TopazArmor, 1, EntityEquipmentSlot.HEAD));
		topaz_chestplate = register(new ItemModArmor("topaz_chestplate", TopazArmor, 1, EntityEquipmentSlot.CHEST));
		topaz_leggings = register(new ItemModArmor("topaz_leggings", TopazArmor, 1, EntityEquipmentSlot.LEGS));
		topaz_boots = register(new ItemModArmor("topaz_boots", TopazArmor, 1, EntityEquipmentSlot.FEET));
		tanzanite_battle_axe = register(new ItemModBattleAxe("tanzanite_battle_axe", Tanzanite));
		tanzanite_pickaxe = register(new ItemModPickaxe("tanzanite_pickaxe", Tanzanite));
		tanzanite_axe = register(new ItemModAxe("tanzanite_axe", Tanzanite));
		tanzanite_shovel = register(new ItemModShovel("tanzanite_shovel", Tanzanite));
		tanzanite_hoe = register(new ItemModHoe("tanzanite_hoe", Tanzanite));
		tanzanite_helmet = register(new ItemModArmor("tanzanite_helmet", TanzaniteArmor, 1, EntityEquipmentSlot.HEAD));
		tanzanite_chestplate = register(new ItemModArmor("tanzanite_chestplate", TanzaniteArmor, 1, EntityEquipmentSlot.CHEST));
		tanzanite_leggings = register(new ItemModArmor("tanzanite_leggings", TanzaniteArmor, 1, EntityEquipmentSlot.LEGS));
		tanzanite_boots = register(new ItemModArmor("tanzanite_boots", TanzaniteArmor, 1, EntityEquipmentSlot.FEET));
		amber_battle_axe = register(new ItemModBattleAxe("amber_battle_axe", Amber));
		amber_pickaxe = register(new ItemModPickaxe("amber_pickaxe", Amber));
		amber_axe = register(new ItemModAxe("amber_axe", Amber));
		amber_shovel = register(new ItemModShovel("amber_shovel", Amber));
		amber_hoe = register(new ItemModHoe("amber_hoe", Amber));
		amber_helmet = register(new ItemModArmor("amber_helmet", AmberArmor, 1, EntityEquipmentSlot.HEAD));
		amber_chestplate = register(new ItemModArmor("amber_chestplate", AmberArmor, 1, EntityEquipmentSlot.CHEST));
		amber_leggings = register(new ItemModArmor("amber_leggings", AmberArmor, 1, EntityEquipmentSlot.LEGS));
		amber_boots = register(new ItemModArmor("amber_boots", AmberArmor, 1, EntityEquipmentSlot.FEET));
		obsidian_helmet = register(new ItemModObsidianArmor("obsidian_helmet", ObsidianArmor, 1, EntityEquipmentSlot.HEAD));
		obsidian_chestplate = register(new ItemModObsidianArmor("obsidian_chestplate", ObsidianArmor, 1, EntityEquipmentSlot.CHEST));
		obsidian_leggings = register(new ItemModObsidianArmor("obsidian_leggings", ObsidianArmor, 1, EntityEquipmentSlot.LEGS));
		obsidian_boots = register(new ItemModObsidianArmor("obsidian_boots", ObsidianArmor, 1, EntityEquipmentSlot.FEET));
		//Food
		tuna_hoagie = register(new ItemModFood("tuna_hoagie", 4, 1.5F, false));
		beef_hoagie = register(new ItemModFood("beef_hoagie", 4, 1.5F, true));
		chicken_hoagie = register(new ItemModFood("chicken_hoagie", 4, 1.5F, false));
	}
	
	public static void registerRenders() {
		//Gems
		registerRender(ruby);
		registerRender(sapphire);
		registerRender(amethyst);
		registerRender(topaz);
		registerRender(tanzanite);
		registerRender(amber);
		//Armor
		registerRender(ruby_helmet);
		registerRender(ruby_chestplate);
		registerRender(ruby_leggings);
		registerRender(ruby_boots);
		registerRender(sapphire_helmet);
		registerRender(sapphire_chestplate);
		registerRender(sapphire_leggings);
		registerRender(sapphire_boots);
		registerRender(amethyst_helmet);
		registerRender(amethyst_chestplate);
		registerRender(amethyst_leggings);
		registerRender(amethyst_boots);
		registerRender(topaz_helmet);
		registerRender(topaz_chestplate);
		registerRender(topaz_leggings);
		registerRender(topaz_boots);
		registerRender(tanzanite_helmet);
		registerRender(tanzanite_chestplate);
		registerRender(tanzanite_leggings);
		registerRender(tanzanite_boots);
		registerRender(amber_helmet);
		registerRender(amber_chestplate);
		registerRender(amber_leggings);
		registerRender(amber_boots);
		registerRender(obsidian_helmet);
		registerRender(obsidian_chestplate);
		registerRender(obsidian_leggings);
		registerRender(obsidian_boots);
		//Tools
		registerRender(ruby_battle_axe);
		registerRender(ruby_pickaxe);
		registerRender(ruby_axe);
		registerRender(ruby_shovel);
		registerRender(ruby_hoe);
		registerRender(sapphire_battle_axe);
		registerRender(sapphire_pickaxe);
		registerRender(sapphire_axe);
		registerRender(sapphire_shovel);
		registerRender(sapphire_hoe);
		registerRender(amethyst_battle_axe);
		registerRender(amethyst_pickaxe);
		registerRender(amethyst_axe);
		registerRender(amethyst_shovel);
		registerRender(amethyst_hoe);
		registerRender(topaz_battle_axe);
		registerRender(topaz_pickaxe);
		registerRender(topaz_axe);
		registerRender(topaz_shovel);
		registerRender(topaz_hoe);
		registerRender(tanzanite_battle_axe);
		registerRender(tanzanite_pickaxe);
		registerRender(tanzanite_axe);
		registerRender(tanzanite_shovel);
		registerRender(tanzanite_hoe);
		registerRender(amber_battle_axe);
		registerRender(amber_pickaxe);
		registerRender(amber_axe);
		registerRender(amber_shovel);
		registerRender(amber_hoe);
		//Food
		registerRender(tuna_hoagie);
		registerRender(beef_hoagie);
		registerRender(chicken_hoagie);

	}
	
	private static <T extends Item> T register(T item)
	{
		GameRegistry.register(item);
		return item;
	}
	private static <T extends ItemFood> T register(T itemfood)
	{
		GameRegistry.register(itemfood);
		return itemfood;
	}
	private static <T extends ItemSeedFood> T register(T itemseedfood)
	{
		GameRegistry.register(itemseedfood);
		return itemseedfood;
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
