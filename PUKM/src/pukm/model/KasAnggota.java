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
public class KasAnggota {
    
    private int idreg_anggota;
    private int id_anggota;
    private String nama_ukm;
    private int uang_masuk;
    private int uang_keluar;
    private int saldo_anggota;

    public KasAnggota(int idreg_anggota, int id_anggota, String nama_ukm, 
            int uang_masuk, int uang_keluar, int saldo_anggota){
        this.idreg_anggota=idreg_anggota;
        this.id_anggota=id_anggota;
        this.nama_ukm=nama_ukm;
        this.uang_masuk=uang_masuk;
        this.uang_keluar=uang_keluar;
    }

    /**
     * @return the idreg_anggota
     */
    public int getIdreg_anggota() {
        return idreg_anggota;
    }

    /**
     * @param idreg_anggota the idreg_anggota to set
     */
    public void setIdreg_anggota(int idreg_anggota) {
        this.idreg_anggota = idreg_anggota;
    }

    /**
     * @return the id_anggota
     */
    public int getId_anggota() {
        return id_anggota;
    }

    /**
     * @param id_anggota the id_anggota to set
     */
    public void setId_anggota(int id_anggota) {
        this.id_anggota = id_anggota;
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

    /**
     * @return the saldo_anggota
     */
    public int getSaldo_anggota() {
        return saldo_anggota;
    }

    /**
     * @param saldo_anggota the saldo_anggota to set
     */
    public void setSaldo_anggota(int saldo_anggota) {
        this.saldo_anggota = saldo_anggota;
    }
    
    
}
