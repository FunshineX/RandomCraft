package net.funshinex.randomcraft.reference;

import net.minecraft.util.ResourceLocation;

public class Textures {

	public static final String RESOURCE_PREFIX = ModInformation.ID.toLowerCase() + ":";
	
	public static final String COIN_RESOURCE_LOCATION = RESOURCE_PREFIX + "textures/items/coins/";
	public static final String COIN = COIN_RESOURCE_LOCATION + "coin";
	
	public static final String DIE_RESOURCE_LOCATION = RESOURCE_PREFIX + "textures/items/die/";
	public static final String DIE = DIE_RESOURCE_LOCATION + "die";
	
	public static final String ITEM_RESOURCE_LOCATOIN = RESOURCE_PREFIX + "textures/items/";
	public static final String DICE_POUCH = ITEM_RESOURCE_LOCATOIN + "dice_pouch";
	
	private static ResourceLocation getResourceLocation(String location) {
		return new ResourceLocation(ModInformation.ID.toLowerCase(), location);
	}
}
