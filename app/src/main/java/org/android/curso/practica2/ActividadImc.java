package org.android.curso.practica2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ActividadImc extends Activity {
    EditText peso;
    EditText altura;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_imc);
        Typeface tf = Typeface.createFromAsset(this.getAssets(), "boy.ttf");



         peso= (EditText) findViewById(R.id.editPeso);
        peso.setTypeface(tf);

         altura= (EditText) findViewById(R.id.editText);
        altura.setTypeface(tf);


        Button botoncalcular= (Button) findViewById(R.id.botonCalcular);
        botoncalcular.setTypeface(tf);


        resultado= (TextView) findViewById(R.id.textoResultado);
        resultado.setTypeface(tf);


        Button sal= (Button) findViewById(R.id.textView3);
        sal.setTypeface(tf);







    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad_imc, menu);
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


    public void calcularImc(View v){
      float p=  Float.parseFloat(peso.getText().toString());
        float a=Float.parseFloat(altura.getText().toString());
        float imc=p/(a*a);
        resultado.setText("Tu imc es: "+imc);
    }

    public void salir(View v){
       this.finish();





    }
}
