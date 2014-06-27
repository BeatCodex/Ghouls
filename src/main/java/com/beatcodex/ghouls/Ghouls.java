package com.beatcodex.ghouls;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import com.beatcodex.ghouls.proxy.CommonProxy;
import com.beatcodex.ghouls.reference.Reference;
import com.beatcodex.ghouls.init.ModEntities;
import com.beatcodex.ghouls.handler.GhostHandler;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class Ghouls {

	@Instance(Reference.MOD_ID)
	public static Ghouls instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

	
	
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		
		proxy.registerEventHandlers();
		
		ModEntities.init();
	
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {


		
	}
	
}
