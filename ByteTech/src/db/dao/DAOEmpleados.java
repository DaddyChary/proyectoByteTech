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
        String sql = "INSERT INTO `empleados` (`nombre_empleado`, `rut_empleado`, `cargo_empleado`, `nivel_acceso`)"+
                     " VALUES ('" + t.getNombre()+ " ', '" + t.getRut()+ "', '" + t.getCargo()+ "', '" + t.getNivelAcceso()+ "');";
        //System.out.println(sql);
        conn.execute(sql);
    }

    @Override
    public void update(Empleado t) throws SQLException {
       String sql = "UPDATE `empleados` "
               + "SET "
               + "nombre_empleado = '" + t.getNombre()+ " ', "
               + "rut_empleado ='" + t.getRut()+ "', "
               + "cargo_empleado = '" + t.getCargo()+ "', "
               + "nivel_acceso = '" + t.getNivelAcceso()+ "' "
               + "WHERE id_empleado = "+ t.getId()+";";
        System.out.println(sql);
        //System.out.println(sql);
        conn.execute(sql);
    }

    @Override
    public void delete(Empleado t) throws SQLException {
        String sql = "DELETE FROM empleados WHERE id_empleado = "+ t.getId()+";";
        conn.execute(sql);
    }

    @Override
    public Empleado getOne(int id) throws SQLException {
        String sql = ""
                + "SELECT * "
                + "FROM empleados "
                + "WHERE id_empleado = " + id;
        ResultSet rs = conn.execute(sql);
        Empleado empleado = new Empleado();
        if(rs.next()){
            empleado.setId(rs.getInt("id_empleado"));
            empleado.setNombre(rs.getString("nombre_empleado"));
            empleado.setRut(rs.getString("rut_empleado"));
            empleado.setCargo(rs.getString("cargo_empleado"));
            empleado.setNivelAcceso(rs.getInt("nivel_acceso"));
        }
        return empleado;
    }

    @Override
    public List<Empleado> getAll() throws SQLException {
        String sql = "SELECT * FROM empleados;";
        ResultSet rs = conn.execute(sql);

        List<Empleado> listaEmpleados = new ArrayList<>();

        while (rs.next()) {
            Empleado empleado = new Empleado();

            empleado.setId(rs.getInt("id_empleado"));
            empleado.setNombre(rs.getString("nombre_empleado"));
            empleado.setRut(rs.getString("rut_empleado"));
            empleado.setCargo(rs.getString("cargo_empleado"));
            empleado.setNivelAcceso(rs.getInt("nivel_acceso"));
            System.out.println(empleado);
            listaEmpleados.add(empleado);

        }
        conn.close();
        return listaEmpleados;
    }

    public List<Empleado> getAll(String dato) throws SQLException {
        String sql = "SELECT * FROM empleados WHERE nombre_empleado LIKE '%" + dato + "%'";
        //System.out.println(sql);
        ResultSet rs = conn.execute(sql);

        List<Empleado> listaEmpleados = new ArrayList<>();

        while (rs.next()) {
            Empleado empleados = new Empleado();
            //System.out.println(sql);

            empleados.setId(rs.getInt("id_empleado"));
            empleados.setNombre(rs.getString("nombre_empleado"));
            empleados.setRut(rs.getString("rut_empleado"));
            empleados.setCargo(rs.getString("cargo_empleado"));
            empleados.setNivelAcceso(rs.getInt("nivel_acceso"));
            listaEmpleados.add(empleados);
        }
        conn.close();
        return listaEmpleados;
    }

        public Empleado getOne(String nombre) throws SQLException {
        String sql = "SELECT * FROM empleados WHERE nombre_empleado ='" + nombre + "'";
        ResultSet rs = conn.execute(sql);
        Empleado empleados = new Empleado();
        if (rs.next()) {
            
            empleados.setId(rs.getInt("id_empleado"));
            empleados.setNombre(rs.getString("nombre_empleado"));
            empleados.setRut(rs.getString("rut_empleado"));
            empleados.setCargo(rs.getString("cargo_empleado"));
            empleados.setNivelAcceso(rs.getInt("nivel_acceso"));
        }
        conn.close();
        return empleados;
    }
    
}
