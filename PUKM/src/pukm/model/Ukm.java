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
public class Ukm {
    public int id_ukm;
    public String nama_ukm;
    public int saldo_ukm;
    
    public Ukm(int Id_ukm, String nama_ukm, int saldo_ukm){
        this.id_ukm = Id_ukm;
        this.nama_ukm = nama_ukm;
        this.saldo_ukm = saldo_ukm;
    }

    public int getId_ukm() {
        return id_ukm;
    }

    public void setId_ukm(int id_ukm) {
        this.id_ukm = id_ukm;
    }

    public String getNama_ukm() {
        return nama_ukm;
    }

    public void setNama_ukm(String nama_ukm) {
        this.nama_ukm = nama_ukm;
    }

    public int getSaldo_ukm() {
        return saldo_ukm;
    }

    public void setSaldo_ukm(int saldo_ukm) {
        this.saldo_ukm = saldo_ukm;
    }
    
    

}
