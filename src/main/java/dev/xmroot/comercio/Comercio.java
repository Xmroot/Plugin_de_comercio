package dev.xmroot.comercio;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Comercio implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender s, Command cmd, String lb, String[] args) {
        if ((s instanceof Player)) {
            Player p = (Player) s;
            if (cmd.getName().equalsIgnoreCase("vender")) {
                if (!p.hasPermission("primevender.use")) {
                    p.sendMessage("§cVocê não tem permissão para executar este comando, adquira seu VIP!");
                    return true;
                }
                int amount = 0;
                int valor = 0;
                for (Vendas e : Vendas.values()) {
                    if (p.getInventory().contains(e.getMaterial())) {
                        for (int i = 0; i < p.getInventory().getSize(); i++) {
                            if (p.getInventory().getItem(i) != null
                                    && p.getInventory().getItem(i).getType() == e.getMaterial()) {
                                valor += p.getInventory().getItem(i).getAmount() * e.getValor() / 2304;
                                amount += p.getInventory().getItem(i).getAmount();
                                p.getInventory().removeItem(p.getInventory().getItem(i));
                            }
                        }
                    }
                }
                if(amount == 0) {
                    p.sendMessage("§cVocê não tem itens no inventário para vender!");
                    return true;
                }
                //MoedasAPI.addCoins(p.getName(), valor);
                p.sendMessage("§aVocê vendeu §f" + amount + " §aitens por §e" + valor + " §acoins.");
            }
        }
        return true;
    }
}
