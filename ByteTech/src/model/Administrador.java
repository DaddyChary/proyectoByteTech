/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DaddyChary
 */
public class Administrador {
    
    private int idAdmin;
    private String nombreAdmin;
    private String password;
    private String loginUser;

    public Administrador() {
    }

    public Administrador(int idAdmin, String nombreAdmin, String password, String loginUser) {
        this.idAdmin = idAdmin;
        this.nombreAdmin = nombreAdmin;
        this.password = password;
        this.loginUser = loginUser;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNombreAdmin() {
        return nombreAdmin;
    }

    public void setNombreAdmin(String nombreAdmin) {
        this.nombreAdmin = nombreAdmin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    @Override
    public String toString() {
        return "Administrador{" + "idAdmin=" + idAdmin + ", nombreAdmin=" + nombreAdmin + ", password=" + password + ", loginUser=" + loginUser + '}';
    }
}
