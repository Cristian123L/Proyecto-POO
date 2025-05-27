/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usoarchivos.serializacion;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author paveg
 */
public class AccesoArchivo {
    public static ArrayList leerArchivo(String ruta){
        ObjectInputStream lectorArchivo=null;
        ArrayList<Object> objetosArchivo=null;
        try {
            lectorArchivo = new ObjectInputStream(new FileInputStream(ruta));
            objetosArchivo=new ArrayList<>();
            
            while (true) {
                Object o=lectorArchivo.readObject();
                objetosArchivo.add(o);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (EOFException ex) {
            
        } catch (IOException ex) {
            System.out.println("No fue posible leer el archivo " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Arhivo corrupto, no es posible leerlo");
        }
        finally{
            try{
                //if(lectorArchivo!=null)
                    lectorArchivo.close();
            }catch(Exception e){
            }
        }
        return objetosArchivo;
    }
    
    public static void agregarObjetoArchivo(String ruta, Object nuevo){
        //Respaldar el contenido del archivo
        ArrayList objetosExistentes=AccesoArchivo.leerArchivo(ruta);
        //Cuando es la primera vez que se va a escribir en el archivo no habrá nada
        //de la lectura, por lo que se va a crear un arraylist vacío
        if(objetosExistentes==null)
            objetosExistentes=new ArrayList();
        //Agregar el nuevo alumno
        objetosExistentes.add(nuevo);
        try {
            ObjectOutputStream escritorObjetos=new
                    ObjectOutputStream(new FileOutputStream(ruta));
            for(Object objetoAEscribir: objetosExistentes){
                escritorObjetos.writeObject(objetoAEscribir);
            }
            escritorObjetos.close();
        } catch (IOException ex) {
            System.out.println("ERROR: al almacenar los datos" +  
                    ex.getMessage());
        }
    }
    
    public static void reescribirArchivo(String ruta, ArrayList lineas){
        
        try {
            ObjectOutputStream escritorObjetos=new
                    ObjectOutputStream(new FileOutputStream(ruta));
            for(Object objetoAEscribir: lineas){
                escritorObjetos.writeObject(objetoAEscribir);
            }
            escritorObjetos.close();
        } catch (IOException ex) {
            System.out.println("ERROR: al almacenar los datos" +  
                    ex.getMessage());
        }
    }
}