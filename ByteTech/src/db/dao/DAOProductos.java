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
import model.Productos;

/**
 *
 * @author DaddyChary
 */
public class DAOProductos implements DAO<Productos> {
    
    
    private Conexion conn;

    public DAOProductos(Conexion conn) {
        this.conn = conn;
    }

    @Override
    public void create(Productos t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Productos t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Productos t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Productos getOne(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Productos> getAll() throws SQLException {
        String sql = "SELECT * FROM productos";
        ResultSet rs = conn.execute(sql);

        List<Productos> listaProductos = new ArrayList<>();

        while (rs.next()) {
            Productos productos = new Productos();

            productos.setIdProducto(rs.getInt("id_productos"));
            productos.setNombreProducto(rs.getString("nombre_productos"));
            productos.setCantidadProducto(rs.getInt("cantidad_productos"));
            productos.setPrecioProducto(rs.getInt("precio_producto"));
            productos.setDescripcionProducto(rs.getString("descripcion_producto"));
            listaProductos.add(productos);

        }
        conn.close();
        return listaProductos;
    }
    
    
}
