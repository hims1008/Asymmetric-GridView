package com.airtel.agilelabs.myapplication;

import java.util.ArrayList;


import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

import com.him.quiltview.QuiltView;

public class MainActivity extends Activity {
	public QuiltView quiltView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		quiltView = (QuiltView) findViewById(R.id.quilt);
		quiltView.setChildPadding(5);
		addTestQuilts(10);
	}
	
	public void addTestQuilts(int num){
		ArrayList<ImageView> images = new ArrayList<ImageView>();
		for(int i = 0; i < num; i++){
			Log.e("i==", String.valueOf(i));
			ImageView image = new ImageView(this);
			image.setScaleType(ScaleType.CENTER_CROP);
			if(i % 2 == 0)
				image.setImageResource(R.drawable.mayer);
			else 
				image.setImageResource(R.drawable.mayer1);
			images.add(image);
		}
		Log.e("i==", images.toString());
		quiltView.addPatchImages(images);
	}

}

