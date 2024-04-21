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
    private String nombreProveedor;
    private String rutProveedor;
    private String correoProveedor;
    private String telefonoProveedor;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String nombreProveedor, String rutProveedor, String correoProveedor, String telefonoProveedor) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.rutProveedor = rutProveedor;
        this.correoProveedor = correoProveedor;
        this.telefonoProveedor = telefonoProveedor;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getRutProveedor() {
        return rutProveedor;
    }

    public void setRutProveedor(String rutProveedor) {
        this.rutProveedor = rutProveedor;
    }

    public String getCorreoProveedor() {
        return correoProveedor;
    }

    public void setCorreoProveedor(String correoProveedor) {
        this.correoProveedor = correoProveedor;
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "idProveedor=" + idProveedor + ", nombreProveedor=" + nombreProveedor + ", rutProveedor=" + rutProveedor + ", correoProveedor=" + correoProveedor + ", telefonoProveedor=" + telefonoProveedor + '}';
    }
}
