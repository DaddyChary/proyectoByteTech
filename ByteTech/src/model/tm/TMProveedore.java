/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.tm;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Proveedor;

/**
 *
 * @author DaddyChary
 */
public class TMProveedore extends AbstractTableModel{
    
    private List<Proveedor> proveedoresList;

    public TMProveedore(List<Proveedor> proveedoresList) {
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
        Proveedor proveedores = proveedoresList.get(rowIndex);

        return switch (columnIndex) {
            case 0 ->
                proveedores.getId();
            case 1 ->
                proveedores.getNombre();
            case 2 ->
                proveedores.getRut();
            case 3 ->
                proveedores.getCorreo();
            case 4 ->
                proveedores.getTelefono();
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
