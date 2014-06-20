package com.beatcodex.ghouls.entity;

import com.beatcodex.ghouls.reference.Colors;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModEntities {

	public static void init(){
		
		EntityRegistry.registerGlobalEntityID(EntityGhost.class, "Ghost", EntityRegistry.findGlobalUniqueEntityId(), Colors.getGhostBackground(), Colors.getGhostSpot());

	}
}
