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
    
    private int idEmpleado;
    private String nombreEmpleado;
    private String rutEmpleado;
    private String cargoEmpleado;
    private int nivelAcceso;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String nombreEmpleado, String rutEmpleado, String cargoEmpleado, int nivelAcceso) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.rutEmpleado = rutEmpleado;
        this.cargoEmpleado = cargoEmpleado;
        this.nivelAcceso = nivelAcceso;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getRutEmpleado() {
        return rutEmpleado;
    }

    public void setRutEmpleado(String rutEmpleado) {
        this.rutEmpleado = rutEmpleado;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", rutEmpleado=" + rutEmpleado + ", cargoEmpleado=" + cargoEmpleado + ", nivelAcceso=" + nivelAcceso + '}';
    }
}
