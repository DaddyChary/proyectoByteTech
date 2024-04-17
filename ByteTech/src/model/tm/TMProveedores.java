/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.tm;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Proveedores;

/**
 *
 * @author DaddyChary
 */
public class TMProveedores extends AbstractTableModel{
    
    private List<Proveedores> proveedoresList;

    public TMProveedores(List<Proveedores> proveedoresList) {
        this.proveedoresList = proveedoresList;
    }
    
    @Override
    public int getRowCount() {
        return proveedoresList.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    // Método para obtener atributos de la clase Estudiante
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Proveedores proveedores = proveedoresList.get(rowIndex);

        return switch (columnIndex) {
            case 0 ->
                proveedores.getIdProveedor();
            case 1 ->
                proveedores.getNombreProveedor();
            case 2 ->
                proveedores.getRutProveedor();
            case 3 ->
                proveedores.getCorreoProveedor();
            case 4 ->
                proveedores.getTelefonoProveedor();
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
                "Rut";
            case 3 ->
                "Correo";
            case 4 ->
                "Telefono";                
            default ->
                " ";
        };
    }
    
    
}
