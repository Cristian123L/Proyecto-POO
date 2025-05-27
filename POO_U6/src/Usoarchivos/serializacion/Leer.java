/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Usoarchivos.serializacion;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paveg
 */
public class Leer {

    /**
     * @param args the command line arguments
     */
    //JTable
    //CRUD (Create-Read-Update-Delete)
    public static void main(String[] args) {
        ArrayList objetos=AccesoArchivo.leerArchivo("inscritos.txt");
        if(objetos!=null){
            for (Object objetoArchivo : objetos) {
                System.out.println(objetoArchivo);
            }
        }
    }

}
