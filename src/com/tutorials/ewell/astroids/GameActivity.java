package com.tutorials.ewell.astroids;

import android.app.Activity;
import android.os.Bundle;

public class GameActivity extends Activity {
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);// THis may be causing an issue???
    }
}
