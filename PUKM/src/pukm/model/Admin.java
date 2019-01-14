/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.model;

/**
 *
 * @author User
 */
public class Admin {
    public int id_admin;
    public String nama_admin;
    public String username;
    public String password;
    
    public Admin(int id_admin, String nama_admin, String username, String password){
        this.id_admin = id_admin;
        this.nama_admin = nama_admin;
        this.username = username;
        this.password = password;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getNama_admin() {
        return nama_admin;
    }

    public void setNama_admin(String nama_admin) {
        this.nama_admin = nama_admin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
