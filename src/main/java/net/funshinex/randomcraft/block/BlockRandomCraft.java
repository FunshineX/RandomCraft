package net.funshinex.randomcraft.block;

import net.funshinex.randomcraft.creativetab.CreativeTabRandomCraft;
import net.funshinex.randomcraft.reference.Textures;
import net.funshinex.randomcraft.util.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockRandomCraft extends Block {

	public BlockRandomCraft() {
		super(Material.rock);
	}
	
	public BlockRandomCraft(Material material ) {
		super(material);
		this.setCreativeTab(CreativeTabRandomCraft.RANDOMCRAFT_TAB);
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("tile%s%s",  Textures.RESOURCE_PREFIX, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	
	public void registerIcons(IIconRegister register) {
		// TODO Auto-generated method stub
		
	}
}