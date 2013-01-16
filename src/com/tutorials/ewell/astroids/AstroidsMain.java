package com.tutorials.ewell.astroids;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class AstroidsMain extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_astroids_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_astroids_main, menu);
		return true;
	}
	
	public void onClickGame(View v) {
		  Toast.makeText(this, "You clicked on Game!", Toast.LENGTH_LONG).show();
		  Intent intent = new Intent(this, GameActivity.class);
		  startActivity(intent);
		}

		public void onClickHowto(View v) {
		  Toast.makeText(this, "You clicked on HowTo!", Toast.LENGTH_LONG).show();
		  Intent intent = new Intent(this, HowtoActivity.class);
		  startActivity(intent);
		}

		public void onClickCredits(View v) {
		  Toast.makeText(this, "You clicked on Credits!", Toast.LENGTH_LONG) .show();
		  Intent intent = new Intent(this, CreditsActivity.class);
		  startActivity(intent);
		}

}
