package com.tutorials.ewell.astroids;

import android.graphics.Bitmap;

public class Astroid extends GrfxObject {
 
	static final int WHOLE = 2;
	  static final int HALF = 1;
	  static final int QUARTER = 0;
	
  public Astroid(Bitmap bitmap, float x, float y, double velocity,
  double direction, int rotation) {
	 this.bitmap = bitmap;
	 this.x = x;
	 this.y = y;
	 this.setVelocity(velocity);
	 this.setDirection(direction);
	 this.rotation = rotation;
	   
  }

}