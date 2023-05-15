package dev.xmroot.comercio;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Vender extends JavaPlugin {

    public static Vender instance;

    public static Vender getInstance() {
        return instance;
    }

    public static void setInstance(Vender instance) {
        Vender.instance = instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        reloadConfig();
        Strings.loadString();
        getCommand("vender").setExecutor(new Comercio());
        Bukkit.getConsoleSender().sendMessage("§aPlugin aComercio foi ligado sem problemas!");
        Bukkit.getConsoleSender().sendMessage("§aaComercio foi licenciado com sucesso.");
        Bukkit.getConsoleSender().sendMessage("§cPlugin sem atualizações");
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        instance = null;
        Bukkit.getConsoleSender().sendMessage("§cPlugin aComercio foi desligado sem problemas!");
    }
}
