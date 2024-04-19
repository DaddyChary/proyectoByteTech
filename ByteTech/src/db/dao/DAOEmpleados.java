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
import model.Empleado;

/**
 *
 * @author DaddyChary
 */
public class DAOEmpleados implements DAO<Empleado> {

    private Conexion conn;

    public DAOEmpleados(Conexion conn) {
        this.conn = conn;
    }

    @Override
    public void create(Empleado t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Empleado t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Empleado t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Empleado getOne(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Empleado> getAll() throws SQLException {
        String sql = "SELECT * FROM empleado;";
        ResultSet rs = conn.execute(sql);

        List<Empleado> listaEmpleados = new ArrayList<>();

        while (rs.next()) {
            Empleado empleados = new Empleado();

            empleados.setIdEmpleado(rs.getInt("id_empleado"));
            empleados.setNombreEmpleado(rs.getString("nombre_empleado"));
            empleados.setRutEmpleado(rs.getString("rut_empleado"));
            empleados.setCargoEmpleado(rs.getString("cargo_empleado"));
            empleados.setNivelAcceso(rs.getInt("nivel_acceso"));
            listaEmpleados.add(empleados);

        }
        conn.close();
        return listaEmpleados;
    }

    public List<Empleado> getAll(String dato) throws SQLException {
        String sql = "SELECT * FROM empleado WHERE nombre_empleado LIKE '%" + dato + "%'";
        //System.out.println(sql);
        ResultSet rs = conn.execute(sql);

        List<Empleado> listaEmpleados = new ArrayList<>();

        while (rs.next()) {
            Empleado empleados = new Empleado();
            //System.out.println(sql);

            empleados.setIdEmpleado(rs.getInt("id_empleado"));
            empleados.setNombreEmpleado(rs.getString("nombre_empleado"));
            empleados.setRutEmpleado(rs.getString("rut_empleado"));
            empleados.setCargoEmpleado(rs.getString("cargo_empleado"));
            empleados.setNivelAcceso(rs.getInt("nivel_acceso"));
            listaEmpleados.add(empleados);
        }
        conn.close();
        return listaEmpleados;
    }

}
