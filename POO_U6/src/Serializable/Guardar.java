
package Serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Guardar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Carrera> carreras=new ArrayList<>();
        carreras.add(new Carrera("Sistemas Computacionales",260));
        carreras.add(new Carrera("Ambiental",260));
        carreras.add(new Carrera("Gestión Empresarial",260));
        
        Scanner lector=new Scanner(System.in);
        String nombre=lector.nextLine();
        String apellidos=lector.nextLine();
        Random r =new Random();
        int semestre=r.nextInt(1,14);
        LocalDate fecha=LocalDate.of(r.nextInt(1995,2002), r.nextInt(1,13), r.nextInt(1,29));
        Carrera c=carreras.get(r.nextInt(0, 3));
        String noControl=c.getNombre().substring(0,1)+
                (fecha.plusYears(18).getYear()+"").substring(2) +"12"+r.nextInt(1,10000);
        Alumno a=new Alumno(noControl,nombre,apellidos,semestre,fecha,c);
        
        String filePath="inscritos.txt";
        boolean archivoExiste=new File(filePath).exists();
        
        try 
            (FileOutputStream fos = new FileOutputStream(filePath, true);
            ObjectOutputStream escritorObjetos = archivoExiste ? new AppendableObjectOutputStream(fos) : new ObjectOutputStream(fos)){

            escritorObjetos.writeObject(a);
            escritorObjetos.close();
            System.out.println("Objeto guardado exitosamente");

        } catch (IOException ex) {
            System.out.println("ERROR: al almacenar los datos " + ex.getMessage());
        }
    }
}

        
//        try {
//            ObjectOutputStream escritorObjetos=new ObjectOutputStream(new FileOutputStream("inscritos.txt"));
//            escritorObjetos.writeObject(a);
//            escritorObjetos.close();
//        } catch (IOException ex) {
//            
//            System.out.println("ERROR: al almacenar los datos" +  
//                    ex.getMessage());
//        }
        
    
