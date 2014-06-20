package com.beatcodex.ghouls.handler;

import com.beatcodex.ghouls.entity.EntityGhost;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntityCow;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class GhostHandler {

	@SubscribeEvent
	public void onLivingDeathEvent(LivingDeathEvent event){
		
		//Spawn a ghost
		
	}
	
	@SubscribeEvent
	public void onLivingAttackEvent(LivingAttackEvent event){
		
		//Prevent typical damage to and from Ghost
		
	}
}
