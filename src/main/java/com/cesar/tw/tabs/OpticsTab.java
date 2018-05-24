package com.cesar.tw.tabs;

import com.cesar.tw.init.ModOptics;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OpticsTab extends CreativeTabs {

	public OpticsTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return ModOptics.thermium_lens;
	}

}
