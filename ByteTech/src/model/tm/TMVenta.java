/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.tm;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Venta;

/**
 *
 * @author DaddyChary
 */
public class TMVenta extends AbstractTableModel {
    
    private List<Venta> ventasList;

    public TMVenta(List<Venta> ventasList) {
        this.ventasList = ventasList;
    }
    
    @Override
    public int getRowCount() {
        return ventasList.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    // Método para obtener atributos de la clase Estudiante
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Venta ventas = ventasList.get(rowIndex);

        return switch (columnIndex) {
            case 0 ->
                ventas.getId();
            case 1 ->
                ventas.getFecha();
//            case 2 ->
//                ventas.getCantidadProductosVentas();
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
                "Fecha";
            case 2 ->
                "Cantidad";
            case 3 ->
                "Nombre";
            case 4 ->
                "Precio";
            case 5 ->
                "Descripción";
            default ->
                " ";
        };
    }
}
