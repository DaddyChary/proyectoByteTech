/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DaddyChary
 */
public class Empleado {

    private int id;
    private String nombre;
    private String rut;
    private String cargo;
    private int nivelAcceso;

    public Empleado() {
    }

    public Empleado(int id) {
        this.id = id;
    }

    public Empleado(int idEmpleado, String nombreEmpleado, String rutEmpleado, String cargoEmpleado, int nivelAcceso) {
        this.id = idEmpleado;
        this.nombre = nombreEmpleado;
        this.rut = rutEmpleado;
        this.cargo = cargoEmpleado;
        this.nivelAcceso = nivelAcceso;
    }

    public int getId() {
        return id;
    }

    public void setId(int idEmpleado) {
        this.id = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreEmpleado) {
        this.nombre = nombreEmpleado;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rutEmpleado) {
        this.rut = rutEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargoEmpleado) {
        this.cargo = cargoEmpleado;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + id + ", nombreEmpleado=" + nombre + ", rutEmpleado=" + rut + ", cargoEmpleado=" + cargo + ", nivelAcceso=" + nivelAcceso + '}';
    }
}
