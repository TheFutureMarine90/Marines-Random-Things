package com.thefuturemarine.ArmorModPlus.client;

import com.thefuturemarine.ArmorModPlus.init.*;
import com.thefuturemarine.ArmorModPlus.proxy.CommonProxy;
import com.thefuturemarine.ArmorModPlus.world.ArmorModWorldGenerator;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ArmorMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	public static ArmorModTab tabItems = new ArmorModTab(12, "tabItems");
	public static ArmorModToolTab tabTools = new ArmorModToolTab(13, "tabTools");
	public static ArmorModBlockTab tabBlocks = new ArmorModBlockTab(14, "tabBlocks");

	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
    	MinecraftForge.EVENT_BUS.register(event);
		ArmorModBlocks.init();
		ArmorModItems.init();

	}
	@EventHandler
	public void inti(FMLInitializationEvent event)
	{
		proxy.registerRenders();
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.ruby_helmet), "RRR", "R R", 'R', ArmorModItems.ruby);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.ruby_chestplate), "R R", "RRR", "RRR", 'R', ArmorModItems.ruby);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.ruby_leggings), "RRR", "R R", "R R", 'R', ArmorModItems.ruby);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.ruby_boots), "R R", "R R", 'R', ArmorModItems.ruby);
		//GameRegistry.addRecipe(new ItemStack(ArmorModItems.ruby_sword), " R ", " R ", " I ", 'R', ArmorModItems.ruby, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.ruby_pickaxe), "RRR", " I ", " I ", 'R', ArmorModItems.ruby, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.ruby_axe), "RR ", "RI ", " I ", 'R', ArmorModItems.ruby, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.ruby_shovel), " R ", " I ", " I ", 'R', ArmorModItems.ruby, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.ruby_hoe), "RR ", " I ", " I ", 'R', ArmorModItems.ruby, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.ruby_battle_axe), "RRR", "RSR", " S ", 'R', ArmorModItems.ruby, 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.sapphire_helmet), "SSS", "S S", 'S', ArmorModItems.sapphire);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.sapphire_chestplate), "S S", "SSS", "SSS", 'S', ArmorModItems.sapphire);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.sapphire_leggings), "SSS", "S S", "S S", 'S', ArmorModItems.sapphire);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.sapphire_boots), "S S", "S S", 'S', ArmorModItems.sapphire);
		//GameRegistry.addRecipe(new ItemStack(ArmorModItems.sapphire_sword), " S ", " S ", " I ", 'S', ArmorModItems.sapphire, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.sapphire_pickaxe), "SSS", " I ", " I ", 'S', ArmorModItems.sapphire, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.sapphire_axe), "SS ", "SI ", " I ", 'S', ArmorModItems.sapphire, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.sapphire_shovel), " S ", " I ", " I ", 'S', ArmorModItems.sapphire, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.sapphire_hoe), "SS ", " I ", " I ", 'S', ArmorModItems.sapphire, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.sapphire_battle_axe), "SSS", "SIS", " I ", 'S', ArmorModItems.sapphire, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.amethyst_helmet), "AAA", "A A", 'A', ArmorModItems.amethyst);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.amethyst_chestplate), "A A", "AAA", "AAA", 'A', ArmorModItems.amethyst);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.amethyst_leggings), "AAA", "A A", "A A", 'A', ArmorModItems.amethyst);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.amethyst_boots), "A A", "A A", 'A', ArmorModItems.amethyst);
		//GameRegistry.addRecipe(new ItemStack(ArmorModItems.amethyst_sword), " A ", " A ", " I ", 'A', ArmorModItems.amethyst, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.amethyst_pickaxe), "AAA", " I ", " I ", 'A', ArmorModItems.amethyst, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.amethyst_axe), "AA ", "AI ", " I ", 'A', ArmorModItems.amethyst, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.amethyst_shovel), " A ", " I ", " I ", 'A', ArmorModItems.amethyst, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.amethyst_hoe), "AA ", " I ", " I ", 'A', ArmorModItems.amethyst, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.amethyst_battle_axe), "AAA", "ASA", " S ", 'A', ArmorModItems.amethyst, 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.topaz_helmet), "TTT", "T T", 'T', ArmorModItems.topaz);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.topaz_chestplate), "T T", "TTT", "TTT", 'T', ArmorModItems.topaz);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.topaz_leggings), "TTT", "T T", "T T", 'T', ArmorModItems.topaz);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.topaz_boots), "T T", "T T", 'T', ArmorModItems.topaz);
		//GameRegistry.addRecipe(new ItemStack(ArmorModItems.topaz_sword), " T ", " T ", " I ", 'T', ArmorModItems.topaz, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.topaz_pickaxe), "TTT", " I ", " I ", 'T', ArmorModItems.topaz, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.topaz_axe), "TT ", "TI ", " I ", 'T', ArmorModItems.topaz, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.topaz_shovel), " T ", " I ", " I ", 'T', ArmorModItems.topaz, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.topaz_hoe), "TT ", " I ", " I ", 'T', ArmorModItems.topaz, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.topaz_battle_axe), "TTT", "TST", " S ", 'T', ArmorModItems.topaz, 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.tanzanite_helmet), "TTT", "T T", 'T', ArmorModItems.tanzanite);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.tanzanite_chestplate), "T T", "TTT", "TTT", 'T', ArmorModItems.tanzanite);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.tanzanite_leggings), "TTT", "T T", "T T", 'T', ArmorModItems.tanzanite);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.tanzanite_boots), "T T", "T T", 'T', ArmorModItems.tanzanite);
		//GameRegistry.addRecipe(new ItemStack(ArmorModItems.tanzanite_sword), " T ", " T ", " I ", 'T', ArmorModItems.tanzanite, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.tanzanite_pickaxe), "TTT", " I ", " I ", 'T', ArmorModItems.tanzanite, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.tanzanite_axe), "TT ", "TI ", " I ", 'T', ArmorModItems.tanzanite, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.tanzanite_shovel), " T ", " I ", " I ", 'T', ArmorModItems.tanzanite, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.tanzanite_hoe), "TT ", " I ", " I ", 'T', ArmorModItems.tanzanite, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.tanzanite_battle_axe), "TTT", "TST", " S ", 'T', ArmorModItems.tanzanite, 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.amber_helmet), "AAA", "A A", 'A', ArmorModItems.amber);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.amber_chestplate), "A A", "AAA", "AAA", 'A', ArmorModItems.amber);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.amber_leggings), "AAA", "A A", "A A", 'A', ArmorModItems.amber);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.amber_boots), "A A", "A A", 'A', ArmorModItems.amber);
		//GameRegistry.addRecipe(new ItemStack(ArmorModItems.amber_sword), " A ", " A ", " I ", 'A', ArmorModItems.amber, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.amber_pickaxe), "AAA", " I ", " I ", 'A', ArmorModItems.amber, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.amber_axe), "AA ", "AI ", " I ", 'A', ArmorModItems.amber, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.amber_shovel), " A ", " I ", " I ", 'A', ArmorModItems.amber, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.amber_hoe), "AA ", " I ", " I ", 'A', ArmorModItems.amber, 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.amber_battle_axe), "AAA", "ASA", " S ", 'A', ArmorModItems.amber, 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.tuna_hoagie), "BBB", "FFF", "BBB", 'B', Items.BREAD, 'F', Items.COOKED_FISH);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.beef_hoagie), "BBB", "CCC", "BBB", 'B', Items.BREAD, 'C', Items.COOKED_BEEF);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.chicken_hoagie), "BBB", "KKK", "BBB", 'B', Items.BREAD, 'K', Items.COOKED_CHICKEN);
		GameRegistry.addRecipe(new ItemStack(ArmorModBlocks.ruby_block), "RRR", "RRR", "RRR", 'R', ArmorModItems.ruby);
		GameRegistry.addRecipe(new ItemStack(ArmorModBlocks.sapphire_block), "SSS", "SSS", "SSS", 'S', ArmorModItems.sapphire);
		GameRegistry.addRecipe(new ItemStack(ArmorModBlocks.amethyst_block), "AAA", "AAA", "AAA", 'A', ArmorModItems.amethyst);
		GameRegistry.addRecipe(new ItemStack(ArmorModBlocks.topaz_block), "TTT", "TTT", "TTT", 'T', ArmorModItems.topaz);
		GameRegistry.addRecipe(new ItemStack(ArmorModBlocks.tanzanite_block), "TTT", "TTT", "TTT", 'T', ArmorModItems.tanzanite);
		GameRegistry.addRecipe(new ItemStack(ArmorModBlocks.amber_block), "AAA", "AAA", "AAA", 'A', ArmorModItems.amber);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.obsidian_helmet), "OOO", "O O", 'O', Blocks.OBSIDIAN);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.obsidian_chestplate), "O O", "OOO", "OOO", 'O', Blocks.OBSIDIAN);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.obsidian_leggings), "OOO", "O O", "O O", 'O', Blocks.OBSIDIAN);
		GameRegistry.addRecipe(new ItemStack(ArmorModItems.obsidian_boots), "O O", "O O", 'O', Blocks.OBSIDIAN);
		GameRegistry.addSmelting(ArmorModBlocks.netherrack_iron_ore,  new ItemStack(Items.IRON_INGOT), 0.7F);
		GameRegistry.addSmelting(ArmorModBlocks.nethertack_gold_ore, new ItemStack(Items.GOLD_INGOT), 1.0F);
		GameRegistry.registerWorldGenerator(new ArmorModWorldGenerator(), 1);
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
		
	}
}
