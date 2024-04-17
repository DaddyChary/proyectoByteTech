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
import model.Proveedores;

/**
 *
 * @author DaddyChary
 */
public class DAOProveedores implements DAO<Proveedores>{
 
    private Conexion conn;

    public DAOProveedores(Conexion conn) {
        this.conn = conn;
    }

    @Override
    public void create(Proveedores t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Proveedores t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Proveedores t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Proveedores getOne(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
        public List<Proveedores> getAll() throws SQLException {
        String sql = "SELECT * FROM proveedores";
        ResultSet rs = conn.execute(sql);

        List<Proveedores> listaProveedores = new ArrayList<>();

        while (rs.next()) {
            Proveedores proveedores = new Proveedores();

            proveedores.setIdProveedor(rs.getInt("id_proveedores"));
            proveedores.setNombreProveedor(rs.getString("nombre_proveedor"));
            proveedores.setRutProveedor(rs.getString("rut_proveedor"));
            proveedores.setCorreoProveedor(rs.getString("correo_proveedor"));
            proveedores.setTelefonoProveedor(rs.getString("telefono_proveedor"));
            listaProveedores.add(proveedores);

        }
        conn.close();
        return listaProveedores;
    }
    
}
