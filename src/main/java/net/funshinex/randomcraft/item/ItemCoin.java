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

public class ItemCoin extends ItemRandomCraft {

	public ItemCoin() 
	{
		super();
		
		setMaxStackSize(1);
		setUnlocalizedName(Names.Item.ITEM_COIN);
		setTextureName(Textures.RESOURCE_PREFIX + "coins/coin");
		setCreativeTab(CreativeTabRandomCraft.RANDOMCRAFT_TAB);
		setHasSubtypes(true);
	}
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		icons = new IIcon[2];
		
		icons[0] = iconRegister.registerIcon(Textures.RESOURCE_PREFIX + "coins/coinhead");
		icons[1] = iconRegister.registerIcon(Textures.RESOURCE_PREFIX + "coins/cointail");
	}
	
	@Override 
	public IIcon getIconFromDamage(int dmg) 
	{
		return icons[dmg];
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		list.add(new ItemStack(this,1,0));
		list.add(new ItemStack(this,1,1));
	}
	
	@Override
	public void onCreated(ItemStack stack, World world,	EntityPlayer player) 
	{
		int result = (int)(Math.random()*2); 
		stack.setItemDamage(result);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean useExtraInformation) {
		if (stack.getItemDamage() == 0)
		{
			list.add("Heads");			
		}
		else 
		{
			list.add("Tails");
		}
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,	EntityPlayer player) {
		
		if(!world.isRemote)
		{
			int dmg = world.rand.nextInt(2);
			Entity e = new EntityItem(world, player.posX, player.posY+2.5, player.posZ, new ItemStack(ModItems.itemCoin,1,dmg));
			LogHelper.info("You flipped " + (dmg==0? "Heads" : "Tails"));
			e.motionY = .3;
			e.motionX = 0;
			e.motionZ = 0;
			world.spawnEntityInWorld(e);
		}
		
		stack.stackSize = 0;
		return stack;
	}
}
