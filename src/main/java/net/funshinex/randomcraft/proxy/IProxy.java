package net.funshinex.randomcraft.proxy;

public interface IProxy {
	public abstract void initRenderingAndTextures();
	
	public abstract void registerEventHandlers();
	
	public abstract void registerTileEntities();
}
