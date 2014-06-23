package com.beatcodex.ghouls.entity;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityGhost extends EntityMob{

	public int influence = 1;
	
	public EntityGhost(World par1World) {
		super(par1World);
	}

	public int getEntityInfluence(){
		return influence;
	}
}

/*

per 9 grouped chunks ~10 for math

Nothing on collide (Slow Speed) [5] .5 influence per chunk
Attack on collide (Slow Speed) [10] 1 influence per chunk
stalk + disappear when viewed (Slightly Faster) [15] 1.5 influence per chunk
charge when viewed (Fast) [20] 2 influence per chunk
 

*/