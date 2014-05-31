package net.funshinex.randomcraft.util;

import net.funshinex.randomcraft.reference.ModInformation;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegistryHelper {
	public static void registerItem(Item item) 
	{
		GameRegistry.registerItem(item, ModInformation.ID + "_" + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerBlock(Block block)
	{
		GameRegistry.registerBlock(block,  ModInformation.ID + "_" + block.getUnlocalizedName().substring(5));
	}
}
