package gg.packetloss.AgrumCreator;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class AgrumCreator extends JavaPlugin {

    private Logger logger;

    public void onEnable() {

        logger = getServer().getLogger();
        logger.info("Enabled!");

    }

    public void onDisable() {

        logger.info("Disabled.");
    }

    public ChunkGenerator getDefaultWorldGenerator(String worldName, String uid) {
        return new AgrumCreatorTerrainGenerator(this);
    }
}
