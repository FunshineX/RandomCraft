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

public class ItemDicePouch extends ItemRandomCraft {

	public ItemDicePouch() 
	{
		super();
		
		setMaxStackSize(1);
		setUnlocalizedName(Names.Item.ITEM_DICE_POUCH);
		setTextureName(Textures.RESOURCE_PREFIX + "dice_pouch");
		setCreativeTab(CreativeTabRandomCraft.RANDOMCRAFT_TAB);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		iconRegister.registerIcon(Textures.RESOURCE_PREFIX + "dice_pouch");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,	EntityPlayer player) {
		
		if(!world.isRemote)
		{
			for (int i=0; i<3; i++) {
				int dmg = world.rand.nextInt(6);
				Entity e = new EntityItem(world, player.posX, player.posY+2.5, player.posZ, new ItemStack(ModItems.itemD6,1,dmg));
				
				e.motionY = .3;
				e.motionX = world.rand.nextFloat()-0.5f;
				e.motionZ = world.rand.nextFloat()-0.5f;
				world.spawnEntityInWorld(e);
			}
		}
		
		stack.stackSize = 0;
		return stack;
	}
}