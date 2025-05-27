package Usoarchivos.serializacion;

import java.io.Serializable;
import java.util.Vector;

public class Calificacion implements Serializable, Estructurable {

    private Alumno numControl;
    private Carrera carrera;
    private Materia materia;
    private int unidad;
    private int calificacion;

    public Calificacion(Alumno numControl, Carrera carrera, Materia materia, int unidad, int calificacion) {
        this.numControl = numControl;
        this.carrera = carrera;
        this.materia = materia;
        this.unidad = unidad;
        this.calificacion = calificacion;
    }

    public Alumno getNumControl() {
        return numControl;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public Materia getMateria() {
        return materia;
    }

    public int getUnidad() {
        return unidad;
    }

    public int getCalificacion() {
        return calificacion;
    }
    //Tenemos que sobreescribir el metodo para que ordene la tabla como nosotros
    //lo deseamos
    @Override
    public Object[] toArray() {
        return new Object[]{materia,unidad,calificacion};
    }

   
}
