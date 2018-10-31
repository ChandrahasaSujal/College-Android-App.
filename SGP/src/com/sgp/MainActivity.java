package com.sgp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		  
        ImageButton buttonf=(ImageButton)findViewById(R.id.imageButton4);
        buttonf.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent i = new Intent(getApplicationContext(),FacultyActivity.class);
                        startActivity(i);
                    }
                });
        
        ImageButton button1=(ImageButton)findViewById(R.id.imageButton1);
        button1.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent i = new Intent(getApplicationContext(),FacultyActivity.class);
                        startActivity(i);
                    }
                });
        
        ImageButton button2=(ImageButton)findViewById(R.id.imageButton2);
        button2.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent i = new Intent(getApplicationContext(),Department.class);
                        startActivity(i);
                    }
                });
        
        ImageButton button3=(ImageButton)findViewById(R.id.imageButton3);
        button3.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent i = new Intent(getApplicationContext(),MarksActivity.class);
                        startActivity(i);
                    }
                });
        ImageButton button4=(ImageButton)findViewById(R.id.imageButton4);
        button4.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent i = new Intent(getApplicationContext(),MapsActivity.class);
                        startActivity(i);
                    }
                });
        
        ImageButton button5=(ImageButton)findViewById(R.id.imageButton5);
        button5.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent i = new Intent(getApplicationContext(),AboutActivity.class);
                        startActivity(i);
                    }
                });
        
        ImageButton button6=(ImageButton)findViewById(R.id.imageButton6);
        button6.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent i = new Intent(getApplicationContext(),EventActivity.class);
                        startActivity(i);
                    }
                });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
