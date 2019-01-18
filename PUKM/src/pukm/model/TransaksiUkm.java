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
public class TransaksiUkm {
    private int id_transaksi;
    private int id_ukm;
    private String nama_ukm;
    private String tanggal;
    private String detail;
    private int saldo_ukm;
    private int jumlah_pengeluaran;
    
    public TransaksiUkm(int id_transaksi, int id_ukm, String nama_ukm,String tanggal,String detail,int saldo_ukm,int jumlah_pengeluaran){
        this.id_transaksi = id_transaksi;
        this.id_ukm = id_ukm;
        this.nama_ukm = nama_ukm;
        this.tanggal = tanggal;
        this.detail = detail;
        this.saldo_ukm = saldo_ukm;
        this.jumlah_pengeluaran=jumlah_pengeluaran;
    }

    /**
     * @return the id_transaksi
     */
    public int getId_transaksi() {
        return id_transaksi;
    }

    /**
     * @param id_transaksi the id_transaksi to set
     */
    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
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
     * @return the tanggal
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * @return the detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail the detail to set
     */
    public void setDetail(String detail) {
        this.detail = detail;
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
     * @return the jumlah_pengeluaran
     */
    public int getJumlah_pengeluaran() {
        return jumlah_pengeluaran;
    }

    /**
     * @param jumlah_pengeluaran the jumlah_pengeluaran to set
     */
    public void setJumlah_pengeluaran(int jumlah_pengeluaran) {
        this.jumlah_pengeluaran = jumlah_pengeluaran;
    }

}
