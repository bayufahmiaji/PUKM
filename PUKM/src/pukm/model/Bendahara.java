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
public class Bendahara {

    
    private int id_bendahara;
    private int id_ukm;
    private String nama_bendahara;
    private String username;
    private String password;
    
    public Bendahara(int id_bendahara,int id_ukm,String nama_bendahara,
                    String username,String password){
        this.id_bendahara=id_bendahara;
        this.id_ukm=id_ukm;
        this.nama_bendahara=nama_bendahara;
        this.username=username;
        this.password=password;
    }

    /**
     * @return the id_bendahara
     */
    public int getId_bendahara() {
        return id_bendahara;
    }

    /**
     * @param id_bendahara the id_bendahara to set
     */
    public void setId_bendahara(int id_bendahara) {
        this.id_bendahara = id_bendahara;
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
     * @return the nama_bendahara
     */
    public String getNama_bendahara() {
        return nama_bendahara;
    }

    /**
     * @param nama_bendahara the nama_bendahara to set
     */
    public void setNama_bendahara(String nama_bendahara) {
        this.nama_bendahara = nama_bendahara;
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
