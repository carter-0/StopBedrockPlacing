package me.carter.stopbedrockplacing;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlayerPlaceBlock implements Listener {
    @EventHandler
    public void onPlaceBlock(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        Material mat = event.getBlock().getType();
        event.getBlock().setType(Material.AIR);
        Block targetedBlock = player.getTargetBlock(null, 10);
        event.getBlock().setType(mat);
        if (targetedBlock.equals(event.getBlock().getRelative(BlockFace.UP)) || targetedBlock.equals(event.getBlock().getRelative(BlockFace.DOWN)) || targetedBlock.equals(event.getBlock().getRelative(BlockFace.NORTH)) || targetedBlock.equals(event.getBlock().getRelative(BlockFace.EAST)) || targetedBlock.equals(event.getBlock().getRelative(BlockFace.SOUTH)) || targetedBlock.equals(event.getBlock().getRelative(BlockFace.WEST))) {
            event.getBlock().setType(mat);
        } else {
            event.setCancelled(true);
        }
    }
}
