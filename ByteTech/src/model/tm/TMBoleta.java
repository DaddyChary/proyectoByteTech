/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.tm;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Venta;

/**
 *
 * @author morag
 */
public class TMBoleta extends AbstractTableModel {

    List<Venta> ticketList = new ArrayList();

    public TMBoleta(List lista) {
        this.ticketList = lista;
    }

    @Override
    public int getRowCount() {
        return this.ticketList.size();

    }

    @Override
    public int getColumnCount() {
        return 4;
    }

////    @Override
////    public Object getValueAt(int rowIndex, int columnIndex) {
//        Venta ventas = ticketList.;
//
//        /*
//            private int idVentas;
//            private Date fechaVentas;
//            private int cantidadProductosVentas;
//            private String nombreProductosVentas;
//            private int precioProductosVentas;
//            private String descripcionProductosVentas;
//         */
//        return switch (columnIndex) {
//            case 0 ->
//                ticketList.get()[]
//            case 1 ->
//                ticketList.get(rowIndex)
//            case 2 ->
//                ticketList.get(rowIndex)
//            case 3 ->
//                ticketList.get(rowIndex)
//                
//
//           
//            
//            default ->
//                "";
//        };

//    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
