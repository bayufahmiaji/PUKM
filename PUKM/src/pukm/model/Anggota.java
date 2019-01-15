/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.model;

/**
 *
 * @author AdittyaS
 */
public class Anggota {
    private int id_anggota;
    private String nama_anggota;
    private String alamat;
    private int saldo_anggota;
    private int id_ukm;
    private String jabatan;
    private String nama_ukm;
    
    public Anggota(int id_anggota,int id_ukm,String nama_anggota, String alamat,int saldo_anggota,String nama_ukm,String jabatan){
        this.id_anggota = id_anggota;
        this.id_ukm = id_ukm;
        this.nama_anggota = nama_anggota;
        this.alamat = alamat;
        this.saldo_anggota = saldo_anggota;
        this.nama_ukm = nama_ukm;
        this.jabatan = jabatan;
    }

    public int getId_anggota() {
        return id_anggota;
    }

    public void setId_anggota(int id_anggota) {
        this.id_anggota = id_anggota;
    }

    public String getNama_anggota() {
        return nama_anggota;
    }

    public void setNama_anggota(String nama_anggota) {
        this.nama_anggota = nama_anggota;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getSaldo_anggota() {
        return saldo_anggota;
    }

    public void setSaldo_anggota(int saldo_anggota) {
        this.saldo_anggota = saldo_anggota;
    }

    public String getNama_ukm(){
        return nama_ukm;
    }
    
    public void setNama_ukm(){
        this.nama_ukm = nama_ukm;
    }
            
    public int getId_ukm() {
        return id_ukm;
    }

    public void setId_ukm(int id_ukm) {
        this.id_ukm = id_ukm;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
}
