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
public class KasUKM {
    
    private int idreg_ukm;
    private int id_ukm;
    private String nama_ukm;
    private int saldo_ukm;
    private int uang_masuk;
    private int uang_keluar;
    

    public KasUKM(int idreg_ukm, int id_ukm, String nama_ukm, 
        int saldo_ukm,int uang_masuk, int uang_keluar){
        this.idreg_ukm=idreg_ukm;
        this.id_ukm=id_ukm;
        this.nama_ukm=nama_ukm;
        this.saldo_ukm=saldo_ukm;
        this.uang_masuk=uang_masuk;
        this.uang_keluar=uang_keluar;
    }

    /**
     * @return the idreg_ukm
     */
    public int getIdreg_ukm() {
        return idreg_ukm;
    }

    /**
     * @param idreg_ukm the idreg_ukm to set
     */
    public void setIdreg_ukm(int idreg_ukm) {
        this.idreg_ukm = idreg_ukm;
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
     * @return the nama_ukm
     */
    public String getNama_ukm() {
        return nama_ukm;
    }

    /**
     * @param nama_ukm the nama_ukm to set
     */
    public void setNama_ukm(String nama_ukm) {
        this.nama_ukm = nama_ukm;
    }

    /**
     * @return the saldo_ukm
     */
    public int getSaldo_ukm() {
        return saldo_ukm;
    }

    /**
     * @param saldo_ukm the saldo_ukm to set
     */
    public void setSaldo_ukm(int saldo_ukm) {
        this.saldo_ukm = saldo_ukm;
    }

    /**
     * @return the uang_masuk
     */
    public int getUang_masuk() {
        return uang_masuk;
    }

    /**
     * @param uang_masuk the uang_masuk to set
     */
    public void setUang_masuk(int uang_masuk) {
        this.uang_masuk = uang_masuk;
    }

    /**
     * @return the uang_keluar
     */
    public int getUang_keluar() {
        return uang_keluar;
    }

    /**
     * @param uang_keluar the uang_keluar to set
     */
    public void setUang_keluar(int uang_keluar) {
        this.uang_keluar = uang_keluar;
    }
    
    
}
