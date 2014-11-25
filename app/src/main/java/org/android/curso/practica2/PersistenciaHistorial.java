package org.android.curso.practica2;

import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Created by campitos on 11/25/14.
 */
public class PersistenciaHistorial {

    public ArrayList<Imc> leerHistorial(){
        ArrayList<Imc> imcHistorial=new ArrayList<Imc>();

        String ruta=    Environment.getExternalStorageDirectory().getAbsolutePath();

        File f = new File(ruta, "/" +"historial-imc.ser" );


        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis);
        imcHistorial=    (ArrayList<Imc>) ois.readObject();
            ois.close();
        }catch(Exception e){}
        System.out.println("Leido  con exito");
        return imcHistorial;
    }

    public void guardarImc(Imc i){
        ArrayList<Imc> imcHistorial=new ArrayList<Imc>();

    String ruta=    Environment.getExternalStorageDirectory().getAbsolutePath();

        File f = new File(ruta, "/" +"historial-imc.ser" );
        if(f.exists()){
        imcHistorial=  leerHistorial();
        }
        imcHistorial.add(i);
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(imcHistorial);
            oos.close();
            System.out.println("guardado con exito");
        }catch(Exception e){
            System.out.println("<<<<<<<<<< OCURRIO UN ERROR AL GUARDARSE"+e.getMessage());
        }
    }
}
