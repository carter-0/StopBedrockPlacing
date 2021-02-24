package me.carter.stopbedrockplacing;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class StopBedrockPlacing extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PlayerPlaceBlock(), this);
    }
}
