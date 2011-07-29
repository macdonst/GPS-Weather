package com.simonmacdonald.gpsweather;

import android.os.Bundle;

import com.phonegap.DroidGap;

public class GPSWeather extends DroidGap {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.init();
        super.loadUrl("file:///android_asset/www/index.html");
	}
}
