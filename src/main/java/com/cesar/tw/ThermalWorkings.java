package com.cesar.tw;

import com.cesar.tw.init.ModGears;
import com.cesar.tw.init.ModMachinesItems;
import com.cesar.tw.init.ModMainItems;
import com.cesar.tw.init.ModOptics;
import com.cesar.tw.proxy.CommonProxy;
import com.cesar.tw.tabs.OpticsTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class ThermalWorkings {
	
	public static final CreativeTabs tabOptics = new OpticsTab("tabOptics");
	
	@Mod.Instance(Reference.MODID)
	public static ThermalWorkings instance;
	
	@SidedProxy(clientSide = Reference.CLIPROXY, serverSide = Reference.COMPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		ModOptics.init();
		ModOptics.register();
		
		ModGears.init();
		ModGears.register();
		
		ModMainItems.init();
		ModMainItems.register();
		
		ModMachinesItems.init();
		ModMachinesItems.register();
		
		proxy.registerRenders();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}
