package com.beatcodex.ghouls.proxy;

import com.beatcodex.ghouls.entity.EntityBasicGhost;
import com.beatcodex.ghouls.model.ModelBasicGhost;
import com.beatcodex.ghouls.render.RenderBasicGhost;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRender(){
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBasicGhost.class, new RenderBasicGhost(new ModelBasicGhost(), 0));
		
	}
	
	@Override
	public void registerEventHandlers(){
		
	}
}
