/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Usoarchivos.serializacion;


public class CrearCarreras {

    
    public static void main(String[] args) {
        Carrera c = new Carrera("Sistemas Computacionales", 260);
        AccesoArchivo.agregarObjetoArchivo("carreras.txt", c);
        c = new Carrera("Ambiental", 260);
        AccesoArchivo.agregarObjetoArchivo("carreras.txt", c);
        c = new Carrera("Gestión Empresarial", 260);
        AccesoArchivo.agregarObjetoArchivo("carreras.txt", c);
        c = new Carrera("Industrial", 260);
        AccesoArchivo.agregarObjetoArchivo("carreras.txt", c);
        c = new Carrera("Electrónica", 260);
        AccesoArchivo.agregarObjetoArchivo("carreras.txt", c);
        c = new Carrera("Sistemas Automotrices", 260);
        AccesoArchivo.agregarObjetoArchivo("carreras.txt", c);
        c = new Carrera("Gastronomía", 260);
        AccesoArchivo.agregarObjetoArchivo("carreras.txt", c);
    }

}
