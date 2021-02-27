package de.maanex.ayy;


import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.maanex.ayy.cit.HammersWork;
import de.maanex.ayy.cit.ScythesWork;
import de.maanex.ayy.cit.WhipsWork;
import de.maanex.ayy.event.BeimSterben;
import de.maanex.ayy.event.BrokenTools;
import de.maanex.ayy.event.Chat;
import de.maanex.ayy.event.FelderTrampeln;
import de.maanex.ayy.event.JoinLeave;
import de.maanex.ayy.event.NoLogStripping;
import de.maanex.ayy.event.Schlafenszeit;
import de.maanex.ayy.event.Scmd;
import de.maanex.ayy.event.TrainingDummies;
import de.maanex.ayy.items.Crafting;


public class Main extends JavaPlugin {

	public static Main instance;

	public Main() {
	}

	@Override
	public void onEnable() {
		instance = this;
		super.onEnable();

		Bukkit.getPluginManager().registerEvents(new Scmd(), this);
		Bukkit.getPluginManager().registerEvents(new Chat(), this);
		Bukkit.getPluginManager().registerEvents(new JoinLeave(), this);
		Bukkit.getPluginManager().registerEvents(new Schlafenszeit(), this);
		Bukkit.getPluginManager().registerEvents(new BeimSterben(), this);
		Bukkit.getPluginManager().registerEvents(new FelderTrampeln(), this);
		Bukkit.getPluginManager().registerEvents(new BrokenTools(), this);
		Bukkit.getPluginManager().registerEvents(new TrainingDummies(), this);
		Bukkit.getPluginManager().registerEvents(new NoLogStripping(), this);

		Bukkit.getPluginManager().registerEvents(new ScythesWork(), this);
		Bukkit.getPluginManager().registerEvents(new HammersWork(), this);
		Bukkit.getPluginManager().registerEvents(new WhipsWork(), this);

		Crafting.registerRecipes();
	}

	@Override
	public void onDisable() {
		super.onDisable();
	}

}
