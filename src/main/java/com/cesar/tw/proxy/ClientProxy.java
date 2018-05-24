package com.cesar.tw.proxy;

import com.cesar.tw.init.ModGears;
import com.cesar.tw.init.ModMachinesItems;
import com.cesar.tw.init.ModMainItems;
import com.cesar.tw.init.ModOptics;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders() {
		ModOptics.registerRenders();
		ModMainItems.registerRenders();
		ModGears.registerRenders();
		ModMachinesItems.registerRenders();
	}
}
