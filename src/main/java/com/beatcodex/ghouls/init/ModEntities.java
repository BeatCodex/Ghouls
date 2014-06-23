package com.beatcodex.ghouls.init;

import com.beatcodex.ghouls.entity.EntityBasicGhost;
import com.beatcodex.ghouls.entity.EntityGhost;
import com.beatcodex.ghouls.reference.Colors;
import com.beatcodex.ghouls.reference.Names;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModEntities {

	public static void init(){
		
		EntityRegistry.registerGlobalEntityID(EntityBasicGhost.class, Names.Entity.GHOST, EntityRegistry.findGlobalUniqueEntityId(), Colors.Ghost.EGG_BACKGROUND, Colors.Ghost.EGG_SPOT);

	}
}
