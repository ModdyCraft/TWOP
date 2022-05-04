package net.moddycraft.twop;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    
    public void onEnable() {
        System.out.println("[TwoPlus] Enabled!");
        registrarComando();
    }
    
    public void onDisable() {
        System.out.println("[TwoPlus] Enabled!");
    }

    public void registrarComando() {
        getCommand("tp_w").setExecutor(new commandTP());
    }
}
