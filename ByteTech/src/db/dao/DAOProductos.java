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
        String sql = "INSERT INTO `productos` (`nombre_producto`, `cantidad_producto`, `precio_producto`, `descripcion_producto`, `id_proveedor_fk`)"
                + " VALUES ('"
                + t.getNombre() + " ', '"
                + t.getCantidad() + "', '"
                + t.getPrecio() + "', '"
                + t.getDescripcion() + "', '"
                + t.getProveedor().getId() + "');";
        conn.execute(sql);
    }

    @Override
    public void update(Producto t) throws SQLException {
        String sql = ""
                + "UPDATE `productos` "
                + "SET "
                + "nombre_producto = '" + t.getNombre() + " ', "
                + "cantidad_producto ='" + t.getCantidad() + "', "
                + "precio_producto = '" + t.getPrecio() + "', "
                + "descripcion_producto = '" + t.getDescripcion() + "', "
                + "id_proveedor_fk = '" + t.getProveedor().getId() + "' "
                + "WHERE id_producto = " + t.getId() + ";";
        conn.execute(sql);
    }

    @Override
    public void delete(Producto t) throws SQLException {
        String sql = "DELETE FROM productos "
                + "WHERE id_producto = " + t.getId() + ";";
        conn.execute(sql);
    }

    @Override
    public Producto getOne(int id) throws SQLException {
        String sql = ""
                + "SELECT * "
                + "FROM productos "
                + "INNER JOIN proveedores "
                + "ON productos.id_proveedor_fk = proveedores.id_proveedor "
                + "WHERE productos.id_producto = " + id;
        ResultSet rs = conn.execute(sql);
        Producto producto = new Producto();
        if (rs.next()) {
            producto = new Producto(
                    rs.getInt("id_producto"),
                    rs.getString("nombre_producto"),
                    rs.getInt("cantidad_producto"),
                    rs.getInt("precio_producto"),
                    rs.getString("descripcion_producto"),
                    new Proveedor(
                            rs.getInt("id_proveedor"),
                            rs.getString("nombre_proveedor"),
                            rs.getString("rut_proveedor"),
                            rs.getString("correo_proveedor"),
                            rs.getString("telefono_proveedor")
                    ));

        }
        return producto;
    }

    @Override
    public List<Producto> getAll() throws SQLException {
        String sql = "SELECT * FROM productos "
                + "INNER JOIN proveedores "
                + "ON productos.id_proveedor_fk = proveedores.id_proveedor;";
        System.out.println(sql);
        ResultSet rs = conn.execute(sql);
        List<Producto> listaProductos = new ArrayList<>();

        Producto productos = new Producto();
        while (rs.next()) {
            productos.setId(rs.getInt("id_producto"));
            productos.setNombre(rs.getString("nombre_producto"));
            productos.setCantidad(rs.getInt("cantidad_producto"));
            productos.setPrecio(rs.getInt("precio_producto"));
            productos.setDescripcion(rs.getString("descripcion_producto"));
            Proveedor proveedor = new Proveedor(
                    rs.getInt("id_proveedor"),
                    rs.getString("nombre_proveedor"),
                    rs.getString("rut_proveedor"),
                    rs.getString("correo_proveedor"),
                    rs.getString("telefono_proveedor")
            );
            productos.setProveedor(proveedor);
            listaProductos.add(productos);
        }
        conn.close();
        return listaProductos;
    }

    public List<Producto> getAll(String dato) throws SQLException {
        String sql = "SELECT * FROM productos "
                + "INNER JOIN proveedores "
                + "ON productos.id_proveedor_fk = proveedores.id_proveedor "
                + "WHERE nombre_productos LIKE '%" + dato + "%';";
        //System.out.println(sql);
        ResultSet rs = conn.execute(sql);

        List<Producto> listaProductos = new ArrayList<>();

        while (rs.next()) {
            Producto productos = new Producto();

            productos.setId(rs.getInt("id_productos"));
            productos.setNombre(rs.getString("nombre_productos"));
            productos.setCantidad(rs.getInt("cantidad_productos"));
            productos.setPrecio(rs.getInt("precio_producto"));
            productos.setDescripcion(rs.getString("descripcion_producto"));
            Proveedor proveedor = new Proveedor(
                    rs.getInt("id_proveedor"), 
                    rs.getString("nombre_proveedor"), 
                    rs.getString("rut_proveedor"), 
                    rs.getString("correo_proveedor"), 
                    rs.getString("telefono_proveedor"));
            productos.setProveedor(proveedor);
            listaProductos.add(productos);

        }
        conn.close();
        return listaProductos;
    }

    public List<String> getNombreProducto() throws SQLException {
        String sql = ""
                + "SELECT DISTINCT nombre_producto  "
                + "FROM productos ";
        ResultSet rs = conn.execute(sql);
        List<String> listaNombreProductos = new ArrayList<>();

        while (rs.next()) {

            String nombreProductos = rs.getString("nombre_producto");
            listaNombreProductos.add(nombreProductos);
        }
        conn.close();
        return listaNombreProductos;
    }

    public Producto getOneByNombre(String nombre) throws SQLException {
        String sql = ""
                + "SELECT id_producto "
                + "FROM productos "
                + "WHERE nombre_producto = '" + nombre + "'";
        //System.out.println(sql);
        ResultSet rs = conn.execute(sql);
        Producto producto = new Producto();
        if (rs.next()) {
            producto.setId(rs.getInt("id_producto"));
        }
        conn.close();
        return producto;
    }

}
