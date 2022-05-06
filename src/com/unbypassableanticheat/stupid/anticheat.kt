package com.unbypassableanticheat.stupid
import org.bukkit.plugin.java.JavaPlugin

class anticheat : JavaPlugin() {
    override fun onEnable(){
        logger.info("Enabled the only working unbypassable anti cheat")
        server.pluginManager.registerEvents(events(), this)
    }
}