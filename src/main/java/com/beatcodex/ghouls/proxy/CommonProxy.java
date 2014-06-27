package com.beatcodex.ghouls.proxy;

import net.minecraftforge.common.MinecraftForge;

import com.beatcodex.ghouls.handler.GhostHandler;

public class CommonProxy {

	public void registerEventHandlers(){

		MinecraftForge.EVENT_BUS.register(new GhostHandler());

	}
}
