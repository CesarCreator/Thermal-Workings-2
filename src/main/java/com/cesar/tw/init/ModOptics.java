package com.cesar.tw.init;

import com.cesar.tw.Reference;
import com.cesar.tw.ThermalWorkings;
import com.cesar.tw.base.NormalItem;
import com.cesar.tw.util.Utils;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModOptics {
		
		/*
		 Lenses
		 */
	
		//Different Lenses
		public static Item lens;
		public static Item thermium_lens;
		
		//Colored Lenses
		public static Item aqua_lens;
		public static Item blue_lens;
		public static Item green_lens;
		public static Item lime_lens;
		public static Item magenta_lens;
		public static Item orange_lens;
		public static Item pink_lens;
		public static Item red_lens;
		public static Item white_lens;
		public static Item yellow_lens;
		
	
	public static void init() {
		
		/*
		 Lenses
		 */
		
		//Different lenses
		lens = new NormalItem("lens", "lens");
		thermium_lens = new NormalItem("thermium_lens", "thermium_lens");
		
		//Colored Lenses
		aqua_lens = new NormalItem("aqua_lens", "aqua_lens");
		blue_lens = new NormalItem("blue_lens", "blue_lens");
		green_lens = new NormalItem("green_lens", "green_lens");
		lime_lens = new NormalItem("lime_lens", "lime_lens");
		magenta_lens = new NormalItem("magenta_lens", "magenta_lens");
		orange_lens = new NormalItem("orange_lens", "orange_lens");
		pink_lens = new NormalItem("pink_lens", "pink_lens");
		red_lens = new NormalItem("red_lens", "red_lens");
		white_lens = new NormalItem("white_lens", "white_lens");
		yellow_lens = new NormalItem("yellow_lens", "yellow_lens");
	}
	
	public static void register() {
		/*
		 Lenses
		 */
		
		//Different Lenses
		registerItem(lens);
		registerItem(thermium_lens);
		
		//Colored Lenses
		registerItem(aqua_lens);
		registerItem(blue_lens);
		registerItem(green_lens);
		registerItem(lime_lens);
		registerItem(magenta_lens);
		registerItem(orange_lens);
		registerItem(pink_lens);
		registerItem(red_lens);
		registerItem(white_lens);
		registerItem(yellow_lens);
	}
	
	public static void registerRenders() {
		/*
		 Lenses
		 */
		
		//Different Lenses
		registerRender(lens);
		registerRender(thermium_lens);
		
		//Colored Lenses
		registerRender(aqua_lens);
		registerRender(blue_lens);
		registerRender(green_lens);
		registerRender(lime_lens);
		registerRender(magenta_lens);
		registerRender(orange_lens);
		registerRender(pink_lens);
		registerRender(red_lens);
		registerRender(white_lens);
		registerRender(yellow_lens);
		
	}
	
	public static void registerItem(Item item) {
		GameRegistry.register(item);
		Utils.getLogger().info("Registering optic item: " + item.getUnlocalizedName().substring(5));
		item.setCreativeTab(ThermalWorkings.tabOptics);
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
}

