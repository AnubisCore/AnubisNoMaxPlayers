/*
 * Copyright 2016 FFY00
 * 
 * All Rights Reserved
 */

package cf.ffy00;

import java.util.logging.Level;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
/**
 *
 * @author FFY00 <FFY00 at ffy00.cf>
 */
public class M extends JavaPlugin implements Listener {
    
    // Vars Config
    PluginDescriptionFile pl;

    // Liga o Plugin
    @Override
    public void onEnable() {
        pl = getDescription();
        getLogger().log(Level.INFO, "Ativando {0} v{1} por FFY00!", new Object[]{pl.getName(), pl.getVersion()});
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    // Desliga o Plugin
    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "Desativando {0} v{1} por FFY00 :(", new Object[]{pl.getName(), pl.getVersion()});
    }
    
    // Plugin INCIO
    @EventHandler(priority = EventPriority.HIGHEST)
    public void serverPing(final ServerListPingEvent e){
        e.setMaxPlayers(Bukkit.getServer().getOnlinePlayers().length + 1);
    }
    // Plugin FIM
}