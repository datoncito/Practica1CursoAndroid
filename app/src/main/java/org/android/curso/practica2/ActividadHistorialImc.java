package org.android.curso.practica2;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class ActividadHistorialImc extends Activity {
TextView textoHistorial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_historial_imc);
        Typeface tf = Typeface.createFromAsset(this.getAssets(), "boy.ttf");
        Button b5= (Button) findViewById(R.id.recobrarHistorial);
        b5.setTypeface(tf);

         textoHistorial = (TextView) findViewById(R.id.textoResultadoHistorial);
        textoHistorial.setTypeface(tf);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad_historial_imc, menu);
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

    public void recobrarHistorial(View v){
        PersistenciaHistorial p=new PersistenciaHistorial();
      ArrayList<Imc> historial= p.leerHistorial();
        textoHistorial.setText("Tamaño:"+historial.size() +"y el usuario fue con fecha "
                +historial.get(2).getFecha());
    }
}
