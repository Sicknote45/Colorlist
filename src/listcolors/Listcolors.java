package listcolors;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Listcolors extends JavaPlugin {
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("Dcolors")) {
			if (p.hasPermission("Donator")) {
				p.sendMessage(ChatColor.BOLD
						+ ""
						+ ChatColor.GOLD
						+ "=-=-=Below a list of possible colors for your rank, to see what it would look like in an example type / Colortext [Color] [Rank Name]=-=-=");
				p.sendMessage(ChatColor.GREEN + "This is Green text");
				p.sendMessage(ChatColor.RED + "This is Red text");
				p.sendMessage(ChatColor.WHITE + "This is White text");
				p.sendMessage(ChatColor.BLUE + "This is Blue text");
				p.sendMessage(ChatColor.BLACK + "This is Black text");
				p.sendMessage(ChatColor.YELLOW + "This is Yellow text");
				p.sendMessage(ChatColor.AQUA + "This is Aqua text");
				p.sendMessage(ChatColor.GOLD + "This is Gold text");
				p.sendMessage(ChatColor.GRAY + "This is Gray text");
				p.sendMessage(ChatColor.DARK_AQUA + "This is Dark Aqua text");
				p.sendMessage(ChatColor.DARK_BLUE + "This is Dark Blue text");
				p.sendMessage(ChatColor.DARK_GRAY + "This is Dark Gray text");
				p.sendMessage(ChatColor.DARK_GREEN + "This is Dark Green text");
				p.sendMessage(ChatColor.DARK_PURPLE
						+ "This is Dark Purple text");
				p.sendMessage(ChatColor.DARK_RED + "This is Dark Red text");
				p.sendMessage(ChatColor.LIGHT_PURPLE
						+ "This is Light Purple text");
				p.sendMessage(ChatColor.BOLD + "" + ChatColor.GOLD
						+ ChatColor.ITALIC
						+ "=-=-=Once you have chosen a color, ask staff=-=-=");

				if (cmd.getName().equalsIgnoreCase("Colortext")) {
					if (p.hasPermission("Donator")) {
						if (args.length >= 1) {
							if (args[0].equalsIgnoreCase("red")) {
								if (args.length == 3) {
									p.sendMessage(ChatColor.RED + args[1] + " "
											+ args[2]);
								}
								if (args.length == 2) {
									p.sendMessage(ChatColor.RED + args[1]);
								}
								if (args.length == 1) {
									p.sendMessage("Please type something.");
								}

							}
							if (args[0].equalsIgnoreCase("green")) {
								if (args.length == 3) {
									p.sendMessage(ChatColor.GREEN + args[1]
											+ " " + args[2]);
								}
								if (args.length == 2) {
									p.sendMessage(ChatColor.GREEN + args[1]);
								}
								if (args.length == 1) {
									p.sendMessage("Please type something.");
								}
							}
							if (args[0].equalsIgnoreCase("dark green")) {
								if (args.length == 3) {
									p.sendMessage(ChatColor.DARK_GREEN
											+ args[1] + " " + args[2]);
								}
								if (args.length == 2) {
									p.sendMessage(ChatColor.DARK_GREEN
											+ args[1]);
								}
								if (args.length == 1) {
									p.sendMessage("Please type something.");
								}
							}
							if (args[0].equalsIgnoreCase("dark red")) {
								if (args.length == 3) {
									p.sendMessage(ChatColor.DARK_RED + args[1]
											+ " " + args[2]);
								}
								if (args.length == 2) {
									p.sendMessage(ChatColor.DARK_RED + args[1]);
								}
								if (args.length == 1) {
									p.sendMessage("Please type something.");
								}
							}
							if (args[0].equalsIgnoreCase("dark gray")) {
								if (args.length == 3) {
									p.sendMessage(ChatColor.DARK_GRAY + args[1]
											+ " " + args[2]);
								}
								if (args.length == 2) {
									p.sendMessage(ChatColor.DARK_GRAY + args[1]);
								}
								if (args.length == 1) {
									p.sendMessage("Please type something.");
								}
							}
							if (args[0].equalsIgnoreCase("dark purple")) {
								if (args.length == 3) {
									p.sendMessage(ChatColor.DARK_PURPLE
											+ args[1] + " " + args[2]);
								}
								if (args.length == 2) {
									p.sendMessage(ChatColor.DARK_PURPLE
											+ args[1]);
								}
								if (args.length == 1) {
									p.sendMessage("Please type something.");
								}
								if (args[0].equalsIgnoreCase("dark aqua")) {
									if (args.length == 3) {
										p.sendMessage(ChatColor.DARK_AQUA
												+ args[1] + " " + args[2]);
									}
									if (args.length == 2) {
										p.sendMessage(ChatColor.DARK_AQUA
												+ args[1]);
									}
									if (args.length == 1) {
										p.sendMessage("Please type something.");
									}
								}
							}
							if (args[0].equalsIgnoreCase("black")) {
								if (args.length == 3) {
									p.sendMessage(ChatColor.BLACK + args[1]
											+ " " + args[2]);
								}
								if (args.length == 2) {
									p.sendMessage(ChatColor.BLACK + args[1]);
								}
								if (args.length == 1) {
									p.sendMessage("Please type something.");
								}
							}
							if (args[0].equalsIgnoreCase("dark blue")) {
								if (args.length == 3) {
									p.sendMessage(ChatColor.DARK_BLUE + args[1]
											+ " " + args[2]);
								}
								if (args.length == 2) {
									p.sendMessage(ChatColor.DARK_BLUE + args[1]);
								}
								if (args.length == 1) {
									p.sendMessage("Please type something.");
								}
							}
							if (args[0].equalsIgnoreCase("gold")) {
								if (args.length == 3) {
									p.sendMessage(ChatColor.GOLD + args[1]
											+ " " + args[2]);
								}
								if (args.length == 2) {
									p.sendMessage(ChatColor.GOLD + args[1]);
								}
								if (args.length == 1) {
									p.sendMessage("Please type something.");
								}
							}
							if (args[0].equalsIgnoreCase("gray")) {
								if (args.length == 3) {
									p.sendMessage(ChatColor.GRAY + args[1]
											+ " " + args[2]);
								}
								if (args.length == 2) {
									p.sendMessage(ChatColor.GRAY + args[1]);
								}
								if (args.length == 1) {
									p.sendMessage("Please type something.");
								}
							}
							if (args[0].equalsIgnoreCase("blue")) {
								if (args.length == 3) {
									p.sendMessage(ChatColor.BLUE + args[1]
											+ " " + args[2]);
								}
								if (args.length == 2) {
									p.sendMessage(ChatColor.BLUE + args[1]);
								}
								if (args.length == 1) {
									p.sendMessage("Please type something.");
								}
							}
							if (args[0].equalsIgnoreCase("light purple")) {
								if (args.length == 3) {
									p.sendMessage(ChatColor.LIGHT_PURPLE
											+ args[1] + " " + args[2]);
								}
								if (args.length == 2) {
									p.sendMessage(ChatColor.LIGHT_PURPLE
											+ args[1]);
								}
								if (args.length == 1) {
									p.sendMessage("Please type something.");
								}
							}
							if (args[0].equalsIgnoreCase("aqua")) {
								if (args.length == 3) {
									p.sendMessage(ChatColor.AQUA + args[1]
											+ " " + args[2]);
								}
								if (args.length == 2) {
									p.sendMessage(ChatColor.AQUA + args[1]);
								}
								if (args.length == 1) {
									p.sendMessage("Please type something.");
								}
							}
							if (args[0].equalsIgnoreCase("yellow")) {
								if (args.length == 3) {
									p.sendMessage(ChatColor.YELLOW + args[1]
											+ " " + args[2]);
								}
								if (args.length == 2) {
									p.sendMessage(ChatColor.YELLOW + args[1]);
								}
								if (args.length == 1) {
									p.sendMessage("Please type something.");
								}
							}
							if (args[0].equalsIgnoreCase("white")) {
								if (args.length == 3) {
									p.sendMessage(ChatColor.WHITE + args[1]
											+ " " + args[2]);
								}
								if (args.length == 2) {
									p.sendMessage(ChatColor.WHITE + args[1]);
								}
								if (args.length == 1) {
									p.sendMessage("Please type something.");
								}
							}

						} else {
							p.sendMessage("Please specifiy a rank.");
							return true;
						}
					} else {
						p.sendMessage(ChatColor.RED
								+ "You do not have permission to execute this command.");
					}
					return true;
				}
				return false;
			}
		} else {
			p.sendMessage(ChatColor.WHITE
					+ "You do not have permission to execute this command.");
		}
		return true;

	}
}
