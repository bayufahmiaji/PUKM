/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pukm.model;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Seketaris {
    
    private int id_seketaris;
    private int id_ukm;
    private String nama_seketaris;
    private String username;
    private String password;
    
    public Seketaris(int id_seketaris,int id_ukm,String nama_seketaris,
            String username,String password){
            
        this.id_seketaris=id_seketaris;
        this.id_ukm=id_ukm;
        this.nama_seketaris=nama_seketaris;
        this.username=username;
        this.password=password;
        
    }

    /**
     * @return the id_seketaris
     */
    public int getId_seketaris() {
        return id_seketaris;
    }

    /**
     * @param id_seketaris the id_seketaris to set
     */
    public void setId_seketaris(int id_seketaris) {
        this.id_seketaris = id_seketaris;
    }

    /**
     * @return the id_ukm
     */
    public int getId_ukm() {
        return id_ukm;
    }

    /**
     * @param id_ukm the id_ukm to set
     */
    public void setId_ukm(int id_ukm) {
        this.id_ukm = id_ukm;
    }

    /**
     * @return the nama_seketaris
     */
    public String getNama_seketaris() {
        return nama_seketaris;
    }

    /**
     * @param nama_seketaris the nama_seketaris to set
     */
    public void setNama_seketaris(String nama_seketaris) {
        this.nama_seketaris = nama_seketaris;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
