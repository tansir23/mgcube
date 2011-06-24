package de.swagner.mgcube;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;

public class Switch extends Renderable{

	boolean isSwitched = false;
	int id = 0;
	Array<SwitchableBlock> sBlocks = new Array<SwitchableBlock>();
	
	public Switch(Vector3 position) {
		this.position = position;
	}
	
}
