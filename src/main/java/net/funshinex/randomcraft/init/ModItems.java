package net.funshinex.randomcraft.init;

import net.funshinex.randomcraft.item.ItemCoin;
import net.funshinex.randomcraft.item.ItemD10;
import net.funshinex.randomcraft.item.ItemD12;
import net.funshinex.randomcraft.item.ItemD20;
import net.funshinex.randomcraft.item.ItemD4;
import net.funshinex.randomcraft.item.ItemD6;
import net.funshinex.randomcraft.item.ItemD8;
import net.funshinex.randomcraft.item.ItemDicePouch;
import net.funshinex.randomcraft.item.ItemRandomCraft;
import net.funshinex.randomcraft.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static final ItemRandomCraft itemCoin = new ItemCoin();
	public static final ItemRandomCraft itemD4 = new ItemD4();
	public static final ItemRandomCraft itemD6 = new ItemD6();
	public static final ItemRandomCraft itemD8 = new ItemD8();
	public static final ItemRandomCraft itemD10 = new ItemD10();
	public static final ItemRandomCraft itemD12 = new ItemD12();
	public static final ItemRandomCraft itemD20 = new ItemD20();
	public static final ItemRandomCraft itemDicePouch = new ItemDicePouch();
	
	public static void init() {
		GameRegistry.registerItem(itemCoin, "item." + Names.Item.ITEM_COIN);
		GameRegistry.registerItem(itemD4, "item." + Names.Item.ITEM_D4);
		GameRegistry.registerItem(itemD6, "item." + Names.Item.ITEM_D6);
		GameRegistry.registerItem(itemD8, "item." + Names.Item.ITEM_D8);
		GameRegistry.registerItem(itemD10, "item." + Names.Item.ITEM_D10);
		GameRegistry.registerItem(itemD12, "item." + Names.Item.ITEM_D12);
		GameRegistry.registerItem(itemD20, "item." + Names.Item.ITEM_D20);
		GameRegistry.registerItem(itemDicePouch, Names.Item.ITEM_DICE_POUCH);
	}
	
}
