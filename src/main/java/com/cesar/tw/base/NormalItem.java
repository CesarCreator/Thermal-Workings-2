package com.cesar.tw.base;

import com.cesar.tw.Reference;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class NormalItem extends Item{
	
	public NormalItem(String unlocalizedName, String registryName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
	}
	
}
