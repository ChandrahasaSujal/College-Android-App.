package com.sgp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class FacultyActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_faculty);
		
		 Button button=(Button)findViewById(R.id.button1);
	        button.setOnClickListener(new View.OnClickListener() {
	                    @Override
	                    public void onClick(View v) {
	                        // TODO Auto-generated method stub
	                        Intent i = new Intent(getApplicationContext(),CseActivity.class);
	                        startActivity(i);
	                    }
	                });
	        
	        Button button1=(Button)findViewById(R.id.button2);
	        button1.setOnClickListener(new View.OnClickListener() {
	                    @Override
	                    public void onClick(View v) {
	                        // TODO Auto-generated method stub
	                        Intent i = new Intent(getApplicationContext(),EceActivity.class);
	                        startActivity(i);
	                    }
	                });
	        Button button2=(Button)findViewById(R.id.button3);
	        button2.setOnClickListener(new View.OnClickListener() {
	                    @Override
	                    public void onClick(View v) {
	                        // TODO Auto-generated method stub
	                        Intent i = new Intent(getApplicationContext(),EeeActivity.class);
	                        startActivity(i);
	                    }
	                });
	        
	        Button button3=(Button)findViewById(R.id.button4);
	        button3.setOnClickListener(new View.OnClickListener() {
	                    @Override
	                    public void onClick(View v) {
	                        // TODO Auto-generated method stub
	                        Intent i = new Intent(getApplicationContext(),MechActivity.class);
	                        startActivity(i);
	                    }
	                });
	        
	        Button button4=(Button)findViewById(R.id.button5);
	        button4.setOnClickListener(new View.OnClickListener() {
	                    @Override
	                    public void onClick(View v) {
	                        // TODO Auto-generated method stub
	                        Intent i = new Intent(getApplicationContext(),MetActivity.class);
	                        startActivity(i);
	                    }
	                });
	        
	        Button button5=(Button)findViewById(R.id.button6);
	        button5.setOnClickListener(new View.OnClickListener() {
	                    @Override
	                    public void onClick(View v) {
	                        // TODO Auto-generated method stub
	                        Intent i = new Intent(getApplicationContext(),CivilActivity.class);
	                        startActivity(i);
	                    }
	                });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.faculty, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
