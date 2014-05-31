package net.funshinex.randomcraft.item;

import java.util.List;

import net.funshinex.randomcraft.creativetab.CreativeTabRandomCraft;
import net.funshinex.randomcraft.init.ModItems;
import net.funshinex.randomcraft.reference.Names;
import net.funshinex.randomcraft.reference.Textures;
import net.funshinex.randomcraft.util.LogHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDie extends ItemRandomCraft {

	private int numSides;
	
	public ItemDie(int numSides) 
	{
		super();
		
		setMaxStackSize(1);
		setTextureName(Textures.RESOURCE_PREFIX + "dice/die");
		setCreativeTab(CreativeTabRandomCraft.RANDOMCRAFT_TAB);
		
		this.numSides = numSides;
	}
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		icons = new IIcon[numSides];
		
		for (int i=0; i<numSides; i++) {
			icons[i] = iconRegister.registerIcon(Textures.RESOURCE_PREFIX + "dice/die_" + (i+1) + "_" + numSides);
		}	
	}
	
	@Override 
	public IIcon getIconFromDamage(int dmg) 
	{
		return icons[dmg];
	}
	
	@Override
	public void onCreated(ItemStack stack, World world,	EntityPlayer player) 
	{
		stack.setItemDamage(0);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean useExtraInformation) {
		list.add("Value: " + (stack.getItemDamage()+1));
	}

	public void RollDie(ItemStack stack, World world, EntityPlayer player, ItemRandomCraft die) {
		if(!world.isRemote)
		{
			int dmg = world.rand.nextInt(numSides);
			
			Entity e = new EntityItem(world, player.posX, player.posY+2.5, player.posZ, new ItemStack(die,1,dmg));
			LogHelper.info("You rolled a " + (dmg+1));
			
			e.motionY = .3;
			e.motionX = 0;
			e.motionZ = 0;
			world.spawnEntityInWorld(e);
		}		
	}
}