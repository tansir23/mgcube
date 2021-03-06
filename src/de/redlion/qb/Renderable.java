package de.redlion.qb;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;

public class Renderable implements Comparable<Renderable> {
	
	public Vector3 position = new Vector3();
	public float sortPosition;
	
	public boolean isCollidedAnimation = false;
	public float collideAnimation = 0.0f;	

	public boolean isHighlightAnimation = false;
	public boolean isHighlightAnimationFadeInOut = false;
	public float highlightAnimation = 0.0f;	
	
	public Matrix4 model = new Matrix4();
	
	@Override
	public int compareTo(Renderable o) {
		if(!(o instanceof Renderable)) return -1;
		if((o).sortPosition<this.sortPosition) return -1;
		return 1;
	}

}
