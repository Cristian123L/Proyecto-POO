/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usoarchivos.serializacion;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Alumno implements Serializable, Estructurable {
    private String noControl;
    private String nombre;
    private String apellidos;
    private int semestre;
    private LocalDate fechaNac;
    private Carrera carrera;

    public Alumno(String noControl) {
        this.noControl = noControl;
    }

    
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
    
    @Override
    public Object[] toArray() {
        return new Object[]{noControl,apellidos,nombre,semestre,carrera.getNombre()};
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return Objects.equals(this.noControl.toLowerCase(), other.noControl.toLowerCase());
    }
    
    
    
}
