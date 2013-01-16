package com.tutorials.ewell.astroids;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;

public class GameEngine {

	Resources resources;
	Context context;
	
	public float screenWidth;
	public float screenHeight;
	private Paint blackPaint;
	private Paint textPaint;
	private String currentTimeString;
	private int level;
	private AstroidHandler astroidHandler; 
	
//	Astroid astroid;
	
	public void initializeIt(Context context){
		setSurfaceDimensions(240,160);
		resources = context.getResources();
		
		blackPaint = new Paint();
		blackPaint.setColor(Color.BLACK);
		blackPaint.setStyle(Style.FILL);
		
		textPaint = new Paint();
		textPaint.setColor(Color.LTGRAY);
		textPaint.setTextSize(40);
		
		level = 5;
		astroidHandler = new AstroidHandler(this.resources, level);
		
//		astroid = new Astroid(resources, 20, 20);
//		astroid.setVelocity(4);
//		astroid.setDirection(10);
		
	}
	
	public void onDestroy() {
	    try {
	    } catch (Exception e) {
	    }
	  }
	
	public void setSurfaceDimensions(int width, int height) {
	    screenWidth = width;
	    screenHeight = height;
	  }
	
	public void Update() {
	    currentTimeString = new SimpleDateFormat("HH:mm:ss").format(new Date());
		//astroid.move(screenWidth, screenHeight);
	    astroidHandler.update(screenWidth, screenHeight);
	  }
	
	public void Draw(Canvas canvas) {
	    canvas.drawRect(0, 0, canvas.getWidth(), canvas.getHeight(), blackPaint);
	    canvas.drawText(currentTimeString, 30, 100, textPaint);
	    astroidHandler.draw(canvas);
	    //astroid.draw(canvas, astroid.x, astroid.y, textPaint);
	  }
}
