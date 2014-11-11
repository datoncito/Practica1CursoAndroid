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


public class ActividadInicio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_inicio);
        Typeface tf = Typeface.createFromAsset(this.getAssets(), "boy.ttf");
   TextView texto1= (TextView) findViewById(R.id.titulo);
        texto1.setTypeface(tf);
    Button boton1= (Button) findViewById(R.id.button);
        boton1.setTypeface(tf);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad_inicio, menu);
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

    public void irMenu(View v){
        //System.exit(0);

         Intent i=new Intent(getApplicationContext(),ActividadMenu.class);
        startActivity(i);
        this.finish();
    }
}
