package snoobi.bignose;

import emu.grasscutter.plugin.Plugin;
import snoobi.bignose.commands.GiveArtCommand;

public final class GiveArtifactSnoo extends Plugin {
    /* Turn the plugin into a singleton. */
    private static GiveArtifactSnoo instance;

    public static GiveArtifactSnoo getInstance() {
        return instance;
    }
    
    @Override public void onLoad() {
        // Set the plugin instance.
        instance = this;
    }

    @Override public void onEnable() {
        // Register commands.
        this.getHandle().registerCommand(new GiveArtCommand());

        // Log a plugin status message.
        this.getLogger().info("The Give Artifact plugin has been enabled.");
    }

    @Override public void onDisable() {
        // Log a plugin status message.
        this.getLogger().info("The GiveArt plugin died lol");
    }

  
}
