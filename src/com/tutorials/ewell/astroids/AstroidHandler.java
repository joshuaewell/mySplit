package com.tutorials.ewell.astroids;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class AstroidHandler {
  private Bitmap[] asteroidBitmaps;
  private float[] asteroidRadiuses;
  private List<Astroid> astroids;
  private Random random;
  private Paint paint;

  public AstroidHandler(Resources resources, int level) {
   paint = new Paint();
   random = new Random();

   asteroidBitmaps = new Bitmap[3];
   asteroidBitmaps[Astroid.WHOLE] = BitmapFactory.decodeResource(
     resources, R.drawable.astroid_100);
   asteroidBitmaps[Astroid.HALF] = BitmapFactory.decodeResource(
     resources, R.drawable.astroid_100);
   asteroidBitmaps[Astroid.QUARTER] = BitmapFactory.decodeResource(
     resources, R.drawable.astroid_100);
   
   asteroidRadiuses = new float[3];
   asteroidRadiuses[Astroid.WHOLE] = 50;
   asteroidRadiuses[Astroid.HALF] = 30;
   asteroidRadiuses[Astroid.QUARTER] = 15;

   astroids = new ArrayList<Astroid>();
   float x;
   float y;
   double velocity;
   double direction;
   int rotation;

   for (int i = 0; i < level; i++) {
    x = 160 * random.nextFloat();
    y = 1;
    velocity = 0.2 + 1 * random.nextFloat();
    direction = 360 * random.nextFloat();
    rotation = -1 - random.nextInt(3);
    astroids.add(new Astroid(asteroidBitmaps[Astroid.WHOLE],
    		 x, y, velocity, direction, rotation));
   }
  }

  public void update(float screenWidth, float screenHeight) {
   for (Astroid asteroid : astroids)
    asteroid.move(screenWidth, screenHeight);
  }

  public void draw(Canvas canvas) {
  for (Astroid astroid : astroids)
    astroid.draw(canvas, astroid.x, astroid.y, paint);
  }

}