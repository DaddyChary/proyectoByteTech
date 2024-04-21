/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.dao;

import db.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Venta;

/**
 *
 * @author DaddyChary
 */
public class DAOVentas implements DAO<Venta>{
    
    private Conexion conn;

    public DAOVentas(Conexion conn) {
        this.conn = conn;
    }

    @Override
    public void create(Venta t) throws SQLException {
        String sql = "INSERT INTO ventas (fecha_venta, cantidad_productos, nombre_producto, precio_producto, descripcion_producto, id_producto) " +
                       "VALUES ('2024-04-17', 5, 'Nombre del Producto', 100, 'Descripción del Producto', 1)";
        conn.execute(sql);
    }

    @Override
    public void update(Venta t) throws SQLException {
        String sql = "UPDATE ventas SET columna1 = valor1, columna2 = valor2 WHERE condicion";
        conn.execute(sql);
    }

    @Override
    public void delete(Venta t) throws SQLException {
        String sql = "DELETE FROM ventas WHERE condicion";
        conn.execute(sql);
    }

    @Override
    public Venta getOne(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Venta> getAll() throws SQLException {
        String sql = "SELECT * FROM ventas";
        ResultSet rs = conn.execute(sql);

        List<Venta> listaVentas = new ArrayList<>();

        while (rs.next()) {
            Venta ventas = new Venta();

            ventas.setIdVentas(rs.getInt("IdVentas"));
            ventas.setFechaVentas(rs.getDate("FechaVentas"));
            ventas.setCantidadProductosVentas(rs.getInt("Cantidad"));
            ventas.setNombreProductosVentas(rs.getString("ProductosVentas"));
            ventas.setPrecioProductosVentas(rs.getInt("ProductosPrecio"));
            ventas.setDescripcionProductosVentas(rs.getString("Descripcion"));
            listaVentas.add(ventas);

        }
        conn.close();
        return listaVentas;
    }
    
}
