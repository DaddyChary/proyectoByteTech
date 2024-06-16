/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.tm;

import java.util.EventListener;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import model.Producto;

/**
 *
 * @author DaddyChary
 */
public class TMProducto extends AbstractTableModel{
    
    private List<Producto> productList;

    public TMProducto(List<Producto> productList) {
        this.productList = productList;
    }
    
    @Override
    public int getRowCount() {
        return productList.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    // Método para obtener atributos de la clase Estudiante
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto productos = productList.get(rowIndex);

        return switch (columnIndex) {
            case 0 ->
                productos.getId();
            case 1 ->
                productos.getNombre();
            case 2 ->
                productos.getCantidad();
            case 3 ->
                productos.getPrecio();
            case 4 ->
                productos.getDescripcion();
            case 5 ->
                productos.getProveedor().getNombre();
            default ->
                "";
        };
    }

    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 ->
                "ID";
            case 1 ->
                "Nombre";
            case 2 ->
                "Cantidad";
            case 3 ->
                "Precio";
            case 4 ->
                "Decripcion";   
            case 5 ->
                "Proveedor";
            default ->
                " ";
        };
    }
    
}
   /*public Productos getSelectedProduct (){
       return new Productos(1,"palito",12, 2,"canela");
   }*/
