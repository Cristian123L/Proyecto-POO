/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Usoarchivos.serializacion;

import java.util.ArrayList;


public class CrearCalifcaciones {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //Creamos un 
        Alumno numControl = new Alumno("S24120162");
        Carrera alumnoCarrera= new Carrera("Sistemas Computacionales");
        Materia alumnoMateria= new Materia("Fundamentos de Programacion");
        
        Calificacion alumnoCalif= new Calificacion(numControl,alumnoCarrera,alumnoMateria,1,100);
        //Se crea el archivo calificaciones.txt
        AccesoArchivo.agregarObjetoArchivo("calificaciones.txt",alumnoCalif);
    }
    
}
