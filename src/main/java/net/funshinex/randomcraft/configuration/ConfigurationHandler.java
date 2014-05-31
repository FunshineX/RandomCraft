package net.funshinex.randomcraft.configuration;

import java.io.File;

import net.funshinex.randomcraft.util.LogHelper;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	
	private static Configuration configuration;
	public static void init(File configFile)
	{
		configuration = new Configuration(configFile);
		
		try {
			configuration.load();
		}
		catch (Exception e) {
			LogHelper.error(e.getCause());
		}
		finally {
			configuration.save();
		}
	}
}
