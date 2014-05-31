package net.funshinex.randomcraft.block;

import java.util.Random;

import net.funshinex.randomcraft.reference.Names;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRandomOre extends BlockRandomCraft {

	public BlockRandomOre()
	{
		super(Material.rock);
		setBlockName(Names.Block.RANDOM_ORE);
		setHardness(50.0f);
		setResistance(2000.0f);
		setHarvestLevel("pickaxe",1);
		setStepSound(soundTypeStone);
	}
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register) {
		icons = new IIcon[6];
		
		icons[0] = Blocks.iron_ore.getIcon(0, 0);
		icons[1] = Blocks.gold_ore.getIcon(0, 0);
		icons[2] = Blocks.diamond_ore.getIcon(0, 0);
		icons[3] = Blocks.redstone_ore.getIcon(0, 0);
		icons[4] = Blocks.emerald_ore.getIcon(0, 0);
		icons[5] = Blocks.lapis_ore.getIcon(0, 0);
	}
	

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		Random r = new Random();
		if (icons == null) return Blocks.iron_ore.getIcon(0,0);
		return icons[r.nextInt(6)];
	}
	
	
}
