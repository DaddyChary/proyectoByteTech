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
        String sql = "INSERT INTO `empleado` (`nombre_empleado`, `rut_empleado`, `cargo_empleado`, `nivel_acceso`)"+
                     " VALUES ('" + t.getNombreEmpleado()+ " ', '" + t.getRutEmpleado()+ "', '" + t.getCargoEmpleado()+ "', '" + t.getNivelAcceso()+ "');";
        //System.out.println(sql);
        conn.execute(sql);
    }

    @Override
    public void update(Empleado t) throws SQLException {
       String sql = "UPDATE `empleado` SET nombre_empleado = '" + t.getNombreEmpleado()+ " ', rut_empleado ='" + t.getRutEmpleado()+ "', cargo_empleado = '" + t.getCargoEmpleado()+ "', nivel_acceso = '" + t.getNivelAcceso()+ "' WHERE id_empleado = "+ t.getIdEmpleado()+";";
        //System.out.println(sql);
        conn.execute(sql);
    }

    @Override
    public void delete(Empleado t) throws SQLException {
        String sql = "DELETE FROM empleado WHERE id_empleado = "+ t.getIdEmpleado()+";";
        conn.execute(sql);
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

        public Empleado getOne(String nombre) throws SQLException {
        String sql = "SELECT * FROM empleado WHERE nombre_empleado ='" + nombre + "'";
        ResultSet rs = conn.execute(sql);
        Empleado empleados = new Empleado();
        if (rs.next()) {
            
            empleados.setIdEmpleado(rs.getInt("id_empleado"));
            empleados.setNombreEmpleado(rs.getString("nombre_empleado"));
            empleados.setRutEmpleado(rs.getString("rut_empleado"));
            empleados.setCargoEmpleado(rs.getString("cargo_empleado"));
            empleados.setNivelAcceso(rs.getInt("nivel_acceso"));
        }
        conn.close();
        return empleados;
    }
    
}
