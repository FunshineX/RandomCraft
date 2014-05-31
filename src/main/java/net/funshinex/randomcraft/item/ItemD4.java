package net.funshinex.randomcraft.item;

import net.funshinex.randomcraft.init.ModItems;
import net.funshinex.randomcraft.reference.Names;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemD4 extends ItemDie{

	public ItemD4() {
		super(4);

		setUnlocalizedName(Names.Item.ITEM_D4);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,	EntityPlayer player) {
		
		super.RollDie(stack, world, player, ModItems.itemD4);
		
		stack.stackSize = 0;
		return stack;
	}
}
