package net.moddycraft.twop;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commandTP implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        
        if(!(sender instanceof Player)){
            System.out.println("[TwoPlus] You must be a player to use this command!");
            return false;
        }else{
            Player player = (Player) sender;
            System.out.println("[TwoPlus] Teleporting " + player.getName() + " to " + args[0]);
            //Ejecutar comando
            System.out.println("/tp " + player.getDisplayName() + " " + args[0]);
            return true;
        }

    }

    
}
