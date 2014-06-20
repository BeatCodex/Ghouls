package com.beatcodex.ghouls.reference;

import java.awt.Color;

public class Colors {
	
	public static int getGhostBackground(){
		Color background = new Color(0xf9f9f9);
		return (background.getRed() << 16) + (background.getGreen() << 8) + background.getBlue();
	}
	
	public static int getGhostSpot(){
		Color spot = new Color(0xd3d3d3);
		return (spot.getRed() << 16) + (spot.getGreen() << 8) + spot.getBlue();
	}
}
