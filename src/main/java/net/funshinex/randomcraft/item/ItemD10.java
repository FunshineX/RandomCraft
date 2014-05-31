package net.funshinex.randomcraft.item;

import net.funshinex.randomcraft.init.ModItems;
import net.funshinex.randomcraft.reference.Names;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemD10 extends ItemDie{

	public ItemD10() {
		super(10);

		setUnlocalizedName(Names.Item.ITEM_D10);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,	EntityPlayer player) {
		
		super.RollDie(stack, world, player, ModItems.itemD10);
		
		stack.stackSize = 0;
		return stack;
	}
}
