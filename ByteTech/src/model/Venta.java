
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 *
 * @author DaddyChary
 */
public class Venta {
    
    private int idVentas;
    private Date fechaVentas;
    private Empleado empleado ;
    private List<Producto> lista_productos;

    public Venta() {
    }

    
    
    public Venta(Empleado empleado) {
        this.empleado = empleado;
        lista_productos = new ArrayList<>();
    }

    public int getId() {
        return idVentas;
    }

    public void setId(int idVentas) {
        this.idVentas = idVentas;
    }

    public Date getFecha() {
        return fechaVentas;
    }

    public void setFecha(Date fechaVentas) {
        this.fechaVentas = fechaVentas;
    }
    
    public void addProduct(Producto producto){
        this.lista_productos.add(producto);
    }
    public Producto addProduct(int index){
        return this.lista_productos.get(index);
    }

    public List<Producto> getListaProductos() {
        return lista_productos;
    }

    public void setListaProductos(List<Producto> lista_productos) {
        this.lista_productos = lista_productos;
    }

   
}
