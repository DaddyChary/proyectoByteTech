/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DaddyChary
 */
public class Producto {
    
    private int id;
    private String nombre;
    private int cantidad;
    private int precio;
    private String descripcion;
    private Proveedor proveedor;

    public Producto() {
        
    }

    public Producto(int idProducto, String nombreProducto, int cantidadProducto, int precioProducto, String descripcionProducto) {
        this.id = idProducto;
        this.nombre = nombreProducto;
        this.cantidad = cantidadProducto;
        this.precio = precioProducto;
        this.descripcion = descripcionProducto;
    }

    public Producto(int idProducto, String nombreProducto, int cantidadProducto, int precioProducto, String descripcionProducto, Proveedor proveedor) {
        this.id = idProducto;
        this.nombre = nombreProducto;
        this.cantidad = cantidadProducto;
        this.precio = precioProducto;
        this.descripcion = descripcionProducto;
        this.proveedor = proveedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    
    
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", descripcion=" + descripcion + ", proveedor=" + proveedor + '}';
    }

    
    

    
}
