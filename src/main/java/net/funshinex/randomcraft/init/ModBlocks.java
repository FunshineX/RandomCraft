package net.funshinex.randomcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.funshinex.randomcraft.block.BlockRandomOre;
import net.funshinex.randomcraft.reference.Names;

public class ModBlocks {
	public static final BlockRandomOre randomOre = new BlockRandomOre();
	
	public static void init() {
		GameRegistry.registerBlock(randomOre, "tile." + Names.Block.RANDOM_ORE);
	}
}
