/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.dao;

import db.Conexion;
import java.sql.ResultSet;
import db.dao.DAO;
import java.sql.SQLException;
import java.util.List;
import model.Administrador;

/**
 *
 * @author DaddyChary
 */
public class DAOAdministrador implements DAO<Administrador> {

    private Conexion conn;

    public DAOAdministrador(Conexion conn) {
        this.conn = conn;
    }

    @Override
    public void create(Administrador t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Administrador t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Administrador t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Administrador getOne(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Administrador> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Administrador getOne(String nombre) throws SQLException {
        String sql = "SELECT * FROM administradores WHERE login_user ='" + nombre + "'";
        ResultSet rs = conn.execute(sql);
        Administrador administrador = new Administrador();
        if (rs.next()) {
            administrador.setIdAdmin(rs.getInt("id_administrador"));
            administrador.setNombreAdmin(rs.getString("nombre_administrador"));
            administrador.setPassword(rs.getString("password"));
            administrador.setLoginUser(rs.getString("login_user"));
        }
        conn.close();
        return administrador;
    }

}
