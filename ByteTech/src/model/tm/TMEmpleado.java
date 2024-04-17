/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.tm;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Empleado;

/**
 *
 * @author DaddyChary
 */
public class TMEmpleado extends AbstractTableModel{
    
    private List<Empleado> empleadoList;

    public TMEmpleado(List<Empleado> productList) {
        this.empleadoList = productList;
    }
    
    @Override
    public int getRowCount() {
        return empleadoList.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    // Método para obtener atributos de la clase Estudiante
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Empleado empleados = empleadoList.get(rowIndex);

        return switch (columnIndex) {
            case 0 ->
                empleados.getIdEmpleado();
            case 1 ->
                empleados.getNombreEmpleado();
            case 2 ->
                empleados.getRutEmpleado();
            case 3 ->
                empleados.getCargoEmpleado();
            case 4 ->
                empleados.getNivelAcceso();
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
                "Cargo";
            case 4 ->
                "NivelAcceso";                
            default ->
                " ";
        };
    }
    
}
