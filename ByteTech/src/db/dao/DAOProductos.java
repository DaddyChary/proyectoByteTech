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
import model.Producto;
import model.Proveedor;

/**
 *
 * @author DaddyChary
 */
public class DAOProductos implements DAO<Producto> {
    
    
    private Conexion conn;

    public DAOProductos(Conexion conn) {
        this.conn = conn;
    }

    @Override
    public void create(Producto t) throws SQLException {
        //System.out.println(t);
        String sql = "INSERT INTO `productos` (`nombre_productos`, `cantidad_productos`, `precio_producto`, `descripcion_producto`, `id_proveedor`)"+
                     " VALUES ('" + t.getNombreProducto() + " ', '" + t.getCantidadProducto() + "', '" + t.getPrecioProducto() + "', '" + t.getDescripcionProducto() + "', '" + t.getProveedor().getIdProveedor()+ "');";
        conn.execute(sql);
    }

    @Override
    public void update(Producto t) throws SQLException {
        String sql = "UPDATE `productos` SET nombre_productos = '" + t.getNombreProducto() + " ', cantidad_productos ='" + t.getCantidadProducto() + "', precio_producto = '" + t.getPrecioProducto() + "', descripcion_producto = '" + t.getDescripcionProducto() + "', id_proveedor = '" + t.getProveedor().getIdProveedor()+ "' WHERE id_productos = "+ t.getIdProducto()+";";
        conn.execute(sql);
    }

    @Override
    public void delete(Producto t) throws SQLException {
        String sql = "DELETE FROM productos WHERE id_productos = "+ t.getIdProducto()+";";
        conn.execute(sql);
    }

    @Override
    public Producto getOne(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Producto> getAll() throws SQLException {
        String sql = "SELECT * FROM productos INNER JOIN proveedores ON productos.id_proveedor = proveedores.id_proveedores;";
        System.out.println(sql);
        ResultSet rs = conn.execute(sql);

        List<Producto> listaProductos = new ArrayList<>();

        while (rs.next()) {
            Producto productos = new Producto();
 
            productos.setIdProducto(rs.getInt("id_productos"));
            productos.setNombreProducto(rs.getString("nombre_productos"));
            productos.setCantidadProducto(rs.getInt("cantidad_productos"));
            productos.setPrecioProducto(rs.getInt("precio_producto"));
            productos.setDescripcionProducto(rs.getString("descripcion_producto"));
            Proveedor proveedor = new Proveedor(rs.getInt("id_proveedores"),rs.getString("nombre_proveedor"),rs.getString("rut_proveedor"),rs.getString("correo_proveedor"),rs.getString("telefono_proveedor"));
            productos.setProveedor(proveedor);
            listaProductos.add(productos);

        }
        conn.close();
        return listaProductos;
    }
    
    public List<Producto> getAll(String dato) throws SQLException {
        String sql = "SELECT * FROM productos INNER JOIN proveedores ON productos.id_proveedor = proveedores.id_proveedores WHERE nombre_productos LIKE '%" + dato + "%';";
        //System.out.println(sql);
        ResultSet rs = conn.execute(sql);

        List<Producto> listaProductos = new ArrayList<>();

        while (rs.next()) {
            Producto productos = new Producto();
 
            productos.setIdProducto(rs.getInt("id_productos"));
            productos.setNombreProducto(rs.getString("nombre_productos"));
            productos.setCantidadProducto(rs.getInt("cantidad_productos"));
            productos.setPrecioProducto(rs.getInt("precio_producto"));
            productos.setDescripcionProducto(rs.getString("descripcion_producto"));
            Proveedor proveedor = new Proveedor(rs.getInt("id_proveedores"),rs.getString("nombre_proveedor"),rs.getString("rut_proveedor"),rs.getString("correo_proveedor"),rs.getString("telefono_proveedor"));
            productos.setProveedor(proveedor);
            listaProductos.add(productos);

        }
        conn.close();
        return listaProductos;
    }
    
}
