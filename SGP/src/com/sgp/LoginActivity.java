package com.sgp;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        Button button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent i = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
                    }
                });
        /*Button button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                    	 Intent intent = new Intent(getBaseContext(), MainActivity.class);
                         EditText editText1 = (EditText) findViewById(R.id.editText1);
                         EditText editText2 = (EditText) findViewById(R.id.editText2);
                         int status=1;
                         if(editText1.getText().length()<1){
                             Toast.makeText(getApplicationContext(), "Please enter User Name !",Toast.LENGTH_LONG).show();
                             status=status+1;
                             return ;
                           }
                         if(editText2.getText().length()<1){
                             Toast.makeText(getApplicationContext(), "Please enter Password !",Toast.LENGTH_LONG).show();
                             status=status+1;
                             return ;
                           }
                         if(editText1.getText().toString().equals("sgp") && editText2.getText().toString().equals("sgp"))
                         startActivity(intent);
                         else
                         {
                        	 Toast.makeText(getApplicationContext(), "Invalid credentials !",Toast.LENGTH_LONG).show();
                         }
                    }
                });
        */
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
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
