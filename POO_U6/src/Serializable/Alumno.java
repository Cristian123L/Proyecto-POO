
package Serializable;

import java.io.Serializable;
import java.time.LocalDate;

public class Alumno implements Serializable {
    private String noControl;
    private String nombre;
    private String apellidos;
    private int semestre;
    private LocalDate fechaNac;
    private Carrera carrera;

    public Alumno(String noControl, String nombre, String apellidos, int semestre, LocalDate fechaNac, Carrera carrera) {
        this.noControl = noControl;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.semestre = semestre;
        this.fechaNac = fechaNac;
        this.carrera = carrera;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" + "noControl=" + noControl + ", nombre=" + nombre + ", apellidos=" + apellidos + ", semestre=" + semestre + ", fechaNac=" + fechaNac + ", carrera=" + carrera + '}';
    }
    
 
    
}
