
package db.dao;

import db.Conexion;
import java.sql.SQLException;

/**
 *
 * @author DaddyChary
 */
public class DAOManager {

    private Conexion conn;
    private DAOAdministrador dAdministrador;
    private DAOEmpleados dEmpleados;
    private DAOProductos dProductos;
    private DAOProveedores dProveedores;
    private DAOVentas dVentas;

    public DAOManager() throws SQLException {
        conn = Conexion.getConexion();
        this.dAdministrador = new DAOAdministrador(conn);
        this.dEmpleados = new DAOEmpleados(conn);
        this.dProductos = new DAOProductos(conn);
        this.dProveedores = new DAOProveedores(conn);
        this.dVentas = new DAOVentas(conn);
    }

    public DAOAdministrador getdAdministrador() {
        return dAdministrador;
    }

    public DAOEmpleados getdEmpleados() {
        return dEmpleados;
    }
    
    public DAOProductos getdProductos() {
        return dProductos;
    }
    
    public DAOProveedores getdProveedores() {
        return dProveedores;
    }
    
    public DAOVentas getdVentas() {
        return dVentas;
    }
    
    
}
