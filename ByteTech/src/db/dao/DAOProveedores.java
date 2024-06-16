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
import model.Proveedor;

/**
 *
 * @author DaddyChary
 */
public class DAOProveedores implements DAO<Proveedor>{
 
    private Conexion conn;

    public DAOProveedores(Conexion conn) {
        this.conn = conn;
    }

    @Override
    public void create(Proveedor t) throws SQLException {
        String sql = "INSERT INTO `proveedores` (`nombre_proveedor`, `rut_proveedor`, `correo_proveedor`, `telefono_proveedor`)"+
                     " VALUES ('" + t.getNombre()+ " ', '" + t.getRut()+ "', '" + t.getCorreo()+ "', '" + t.getTelefono()+ "');";
        //System.out.println(sql);
        conn.execute(sql);
    }

    @Override
    public void update(Proveedor t) throws SQLException {
        String sql = ""
                + "UPDATE proveedores "
                + "SET "
                + "nombre_proveedor = '" + t.getNombre()+ "', "
                + "rut_proveedor = '" + t.getRut()+ "', "
                + "correo_proveedor = '" + t.getCorreo()+ "', "
                + "telefono_proveedor = '" + t.getTelefono()+ "' "
                + "WHERE id_proveedor = "+ t.getId()+";";
        //System.out.println(sql);
        conn.execute(sql);
    }

    @Override
    public void delete(Proveedor t) throws SQLException {
        String sql = "DELETE FROM proveedores "
                + "WHERE id_proveedor = "+ t.getId()+";";
        conn.execute(sql);
    }

    @Override
    public Proveedor getOne(int id) throws SQLException {
        String sql = "SELECT * FROM proveedores "
                + "WHERE id_proveedor ='" + id + "'";
        ResultSet rs = conn.execute(sql);
        Proveedor proveedor = new Proveedor();
        if (rs.next()) {
            proveedor.setId(rs.getInt("id_proveedor"));
            proveedor.setNombre(rs.getString("nombre_proveedor"));
            proveedor.setRut(rs.getString("rut_proveedor"));
            proveedor.setCorreo(rs.getString("correo_proveedor"));
            proveedor.setTelefono(rs.getString("telefono_proveedor"));
        }
        conn.close();
        return proveedor;
    }

    @Override
        public List<Proveedor> getAll() throws SQLException {
        String sql = "SELECT * FROM proveedores";
        ResultSet rs = conn.execute(sql);

        List<Proveedor> listaProveedores = new ArrayList<>();

        while (rs.next()) {
            Proveedor proveedores = new Proveedor();

            proveedores.setId(rs.getInt("id_proveedor"));
            proveedores.setNombre(rs.getString("nombre_proveedor"));
            proveedores.setRut(rs.getString("rut_proveedor"));
            proveedores.setCorreo(rs.getString("correo_proveedor"));
            proveedores.setTelefono(rs.getString("telefono_proveedor"));
            listaProveedores.add(proveedores);

        }
        conn.close();
        return listaProveedores;
    }
    
    public List<String> getNombreProveedor() throws SQLException {
        String sql = "SELECT nombre_proveedor  FROM proveedores ";
        ResultSet rs = conn.execute(sql);
        List<String> listaNombreProveedores = new ArrayList<>();

        while (rs.next()) {

            String nombreProveedores = rs.getString("nombre_proveedor");
            listaNombreProveedores.add(nombreProveedores);
        }
        conn.close();
        return listaNombreProveedores;
    }    
    
    public Proveedor getOneId(String nombre) throws SQLException {
        String sql = "SELECT id_proveedor FROM proveedores "
                + "WHERE nombre_proveedor = '" + nombre + "'";
        System.out.println(sql);
        ResultSet rs = conn.execute(sql);
        Proveedor proveedor = new Proveedor();
        if (rs.next()) {
            proveedor.setId(rs.getInt("id_proveedor"));
        }
        conn.close();
        return proveedor;
    }
        
}
