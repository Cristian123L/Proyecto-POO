
package Serializable;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Leer {

   
    public static void main(String[] args) {
        try {
            ObjectInputStream lectorArchivo = new ObjectInputStream(new FileInputStream("inscritos.txt"));
            Object o;
            
            while ((o=lectorArchivo.readObject())!=null) {
                System.out.println(o);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (EOFException ex) {
            
        } catch (IOException ex) {
            System.out.println("No fue posible leer el archivo" + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Arhivo corrupto, no es posible leerlo");
        }
    }

}