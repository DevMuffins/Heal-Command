package me.Heal;

import me.Heal.Heal.HealCMD;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("Heal command enabled!");
        getCommand("Heal").setExecutor(new HealCMD());
    }

    @Override
    public void onDisable() {
        getLogger().info("Heal command disabled!");
    }
}
