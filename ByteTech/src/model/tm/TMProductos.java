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
import model.Productos;

/**
 *
 * @author DaddyChary
 */
public class TMProductos extends AbstractTableModel{
    
    private List<Productos> productList;

    public TMProductos(List<Productos> productList) {
        this.productList = productList;
    }
    
    @Override
    public int getRowCount() {
        return productList.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    // Método para obtener atributos de la clase Estudiante
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Productos productos = productList.get(rowIndex);

        return switch (columnIndex) {
            case 0 ->
                productos.getIdProducto();
            case 1 ->
                productos.getNombreProducto();
            case 2 ->
                productos.getCantidadProducto();
            case 3 ->
                productos.getPrecioProducto();
            case 4 ->
                productos.getDescripcionProducto();
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
            default ->
                " ";
        };
    }
    
}
   /*public Productos getSelectedProduct (){
       return new Productos(1,"palito",12, 2,"canela");
   }*/
