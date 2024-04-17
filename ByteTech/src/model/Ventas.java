
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author DaddyChary
 */
public class Ventas {
    
    private int idVentas;
    private Date fechaVentas;
    private int cantidadProductosVentas;
    private String nombreProductosVentas;
    private int precioProductosVentas;
    private String descripcionProductosVentas;

    public Ventas() {
    }

    public Ventas(int idVentas, Date fechaVentas, int cantidadProductosVentas, String nombreProductosVentas, int precioProductosVentas, String descripcionProductosVentas) {
        this.idVentas = idVentas;
        this.fechaVentas = fechaVentas;
        this.cantidadProductosVentas = cantidadProductosVentas;
        this.nombreProductosVentas = nombreProductosVentas;
        this.precioProductosVentas = precioProductosVentas;
        this.descripcionProductosVentas = descripcionProductosVentas;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public Date getFechaVentas() {
        return fechaVentas;
    }

    public void setFechaVentas(Date fechaVentas) {
        this.fechaVentas = fechaVentas;
    }

    public int getCantidadProductosVentas() {
        return cantidadProductosVentas;
    }

    public void setCantidadProductosVentas(int cantidadProductosVentas) {
        this.cantidadProductosVentas = cantidadProductosVentas;
    }

    public String getNombreProductosVentas() {
        return nombreProductosVentas;
    }

    public void setNombreProductosVentas(String nombreProductosVentas) {
        this.nombreProductosVentas = nombreProductosVentas;
    }

    public int getPrecioProductosVentas() {
        return precioProductosVentas;
    }

    public void setPrecioProductosVentas(int precioProductosVentas) {
        this.precioProductosVentas = precioProductosVentas;
    }

    public String getDescripcionProductosVentas() {
        return descripcionProductosVentas;
    }

    public void setDescripcionProductosVentas(String descripcionProductosVentas) {
        this.descripcionProductosVentas = descripcionProductosVentas;
    }

    @Override
    public String toString() {
        return "Ventas{" + "idVentas=" + idVentas + ", fechaVentas=" + fechaVentas + ", cantidadProductosVentas=" + cantidadProductosVentas + ", nombreProductosVentas=" + nombreProductosVentas + ", precioProductosVentas=" + precioProductosVentas + ", descripcionProductosVentas=" + descripcionProductosVentas + '}';
    }

}
