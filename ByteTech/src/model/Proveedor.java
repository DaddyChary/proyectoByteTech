/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DaddyChary
 */
public class Proveedor {
    
    private int idProveedor;
    private String nombre;
    private String rut;
    private String correo;
    private String telefono;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String nombreProveedor, String rutProveedor, String correoProveedor, String telefonoProveedor) {
        this.idProveedor = idProveedor;
        this.nombre = nombreProveedor;
        this.rut = rutProveedor;
        this.correo = correoProveedor;
        this.telefono = telefonoProveedor;
    }

    public int getId() {
        return idProveedor;
    }

    public void setId(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreProveedor) {
        this.nombre = nombreProveedor;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rutProveedor) {
        this.rut = rutProveedor;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correoProveedor) {
        this.correo = correoProveedor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefonoProveedor) {
        this.telefono = telefonoProveedor;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "idProveedor=" + idProveedor + ", nombreProveedor=" + nombre + ", rutProveedor=" + rut + ", correoProveedor=" + correo + ", telefonoProveedor=" + telefono + '}';
    }
}
