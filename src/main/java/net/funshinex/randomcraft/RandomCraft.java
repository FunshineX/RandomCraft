package net.funshinex.randomcraft;

import net.funshinex.randomcraft.configuration.ConfigurationHandler;
import net.funshinex.randomcraft.init.ModBlocks;
import net.funshinex.randomcraft.init.ModItems;
import net.funshinex.randomcraft.item.crafting.Recipes;
import net.funshinex.randomcraft.proxy.IProxy;
import net.funshinex.randomcraft.reference.ModInformation;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION)
public class RandomCraft {
	
	@Mod.Instance(ModInformation.ID)
	public static RandomCraft instance;
	
	@SidedProxy(clientSide = ModInformation.PROXY_CLIENT, serverSide = ModInformation.PROXY_SERVER)
	public static IProxy proxy;
	
	@Mod.EventHandler 
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		
		ModItems.init();
		
		ModBlocks.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerEventHandlers();
		
		proxy.registerTileEntities();
		
		proxy.initRenderingAndTextures();
		
		Recipes.initRecipes();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
