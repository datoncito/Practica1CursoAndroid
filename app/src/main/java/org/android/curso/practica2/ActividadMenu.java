package org.android.curso.practica2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ActividadMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_menu);
        Typeface tf = Typeface.createFromAsset(this.getAssets(), "boy.ttf");
     Button b5= (Button) findViewById(R.id.button5);
        b5.setTypeface(tf);

        Button b6= (Button) findViewById(R.id.button6);
        b6.setTypeface(tf);

        Button b7= (Button) findViewById(R.id.button7);
        b7.setTypeface(tf);

        TextView nal= (TextView) findViewById(R.id.textoNalgas);
        nal.setTypeface(tf);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void irImc(View v){
        Intent i=new Intent(getApplicationContext(),ActividadImc.class);
        startActivity(i);
    }
}
