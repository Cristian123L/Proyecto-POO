/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Usoarchivos.serializacion;



public class CrearMaterias {

    
    public static void main(String[] args) {
        //Se crean las materias prestablecidas de cada carrera
        Carrera c=new Carrera("Sistemas Computacionales");
        Materia m=new Materia("Fundamentos de Programacion",c);
        AccesoArchivo.agregarObjetoArchivo("materias.txt", m);
        
         
    }
    
}
