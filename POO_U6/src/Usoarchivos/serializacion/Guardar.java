/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Usoarchivos.serializacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Guardar {

    
    public static void main(String[] args) {
        ArrayList<Carrera> carreras=new ArrayList<>();
        //Crea alumnos de manera ramdom solo tines que insertar nombre y apellido
        carreras.add(new Carrera("Sistemas Computacionales",260));
        carreras.add(new Carrera("Ambiental",260));
        carreras.add(new Carrera("Gestión Empresarial",260));
        carreras.add(new Carrera("Industrial",260));
        carreras.add(new Carrera("Electronica",260));
        carreras.add(new Carrera("Sistemas Automotrices",260));
        carreras.add(new Carrera("Gastronomia",260));
        
        Scanner lector=new Scanner(System.in);
        String nombre=lector.nextLine();
        String apellidos=lector.nextLine();
        Random r =new Random();
        int semestre=r.nextInt(1,14);
        LocalDate fecha=LocalDate.of(r.nextInt(1995,2002), r.nextInt(1,13), r.nextInt(1,29));
        
        //Escoge una de la carrera de arriba para el Alumno
        Carrera c=carreras.get(r.nextInt(0, 7));
        String noControl=c.getNombre().substring(0,1)+
                (fecha.plusYears(18).getYear()+"").substring(2) +"12"+r.nextInt(1,10000);
        Alumno a=new Alumno(noControl,nombre,apellidos,semestre,fecha,c);
        
        //Respaldar el contenido del archivo
        ArrayList<Alumno> objetosExistentes=AccesoArchivo.leerArchivo("inscritos.txt");
        //Cuando es la primera vez que se va a escribir en el archivo no habrá nada
        //de la lectura, por lo que se va a crear un arraylist vacío
        if(objetosExistentes==null)
            objetosExistentes=new ArrayList();
        //Agregar el nuevo alumno
        objetosExistentes.add(a);
        try {
            ObjectOutputStream escritorObjetos=new
                    ObjectOutputStream(new FileOutputStream("inscritos.txt"));
            for(Object objetoAEscribir: objetosExistentes){
                escritorObjetos.writeObject(objetoAEscribir);
            }
            escritorObjetos.close();
        } catch (IOException ex) {
            
            System.out.println("ERROR: al almacenar los datos" +  
                    ex.getMessage());
        }
        
    }
    
}





