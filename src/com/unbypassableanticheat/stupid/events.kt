package com.unbypassableanticheat.stupid

// imports everything that I need (seriously why am I commenting this)
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener

class events : Listener {
    // Handles the player join event
    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent){
        // kicks the player due to everyone is a threat to my anti cheat
        event.player.kickPlayer("stop cheating or you will be kicked again.")
        // shuts down the server so player can no longer tries to cheat in my server
        org.bukkit.Bukkit.shutdown()
    }
}


