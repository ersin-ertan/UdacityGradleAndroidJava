package com.nullcognition.udacitygradleandroidjava;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.L01Class;
import com.nullcognition.androidlibrary01.MainActivity01;

public class ActivityMain extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toast.makeText(ActivityMain.this, L01Class.L01String01, Toast.LENGTH_SHORT).show();
		// after adding     compile project(":javalibrary01")
		// to the build manifest as a dependency and ensuring the projects setting.gradle included the
		// include ':app', ':javalibrary01'
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.menu_activity_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		int id = item.getItemId();
		if(id == R.id.action_settings){

			Intent i = new Intent(this, MainActivity01.class);
			i.putExtra("fromJavaLib", L01Class.L01String02);
			startActivity(i);

			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
