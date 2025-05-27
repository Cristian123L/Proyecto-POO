package Usoarchivos.serializacion;

import java.io.Serializable;

public class Materia  implements Serializable {

    private String nombre;
    private Carrera carrera;
    
    public Materia(String nombre){
        this.nombre=nombre;
    }
    
    public Materia(String nombre,Carrera carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }
    
    public String getNombre() {
        return nombre;
    }

    public Carrera getCarrera() {
        return carrera;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
