package net.funshinex.randomcraft.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.funshinex.randomcraft.reference.ModInformation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabRandomCraft {
	
	public static final CreativeTabs RANDOMCRAFT_TAB = new CreativeTabs(ModInformation.ID) {
		
		@Override
		public Item getTabIconItem() {
			return Items.gold_nugget;
		}
		
		@Override
		@SideOnly(Side.CLIENT)
		public String getTranslatedTabLabel()
		{
			return "RandomCraft";
		}
	};
}
