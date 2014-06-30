package com.beatcodex.ghouls.render;

import com.beatcodex.ghouls.entity.EntityBasicGhost;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderBasicGhost extends RenderLiving {

	private static ResourceLocation mobTextures = new ResourceLocation("ghouls:textures/entity/GhostModel.png");
	
	public RenderBasicGhost(ModelBase modelBase, float shadow) {
		super(modelBase, shadow);
	}

	protected ResourceLocation getEntityTexture(EntityBasicGhost entity){
		return mobTextures;
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getEntityTexture((EntityBasicGhost)entity);
	}
	
}
