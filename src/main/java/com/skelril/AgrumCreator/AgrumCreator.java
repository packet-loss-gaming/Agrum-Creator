package com.skelril.AgrumCreator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

/**
 * Author: Turtle9598
 */
public class AgrumCreator extends JavaPlugin {
    private final Logger logger = Logger.getLogger("MineCraft");

    public void onEnable() {
        logMessage("Enabled.", false);

    }

    public void onDisable() {
        logMessage("Disabled.", false);

    }

    public void logMessage(String message, boolean isWarning) {

        PluginDescriptionFile pluginDescriptionFile = this.getDescription();

        if (!isWarning) {
            this.logger.info(pluginDescriptionFile.getName() + " " + pluginDescriptionFile.getVersion()
            + ": " + message);
        } else {
            this.logger.warning(pluginDescriptionFile.getName() + " " + pluginDescriptionFile.getVersion()
                    + ": " + message);
        }

    }

    public ChunkGenerator getDefaultWorldGenerator(String worldName, String uid) {
        return new AgrumCreatorTerrainGenerator(this);
    }
}
