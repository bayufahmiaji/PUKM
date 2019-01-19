/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.controller;

import java.util.List;
import pukm.model.KasAnggota;
import pukm.model.query.QueryKasAnggota;

/**
 *
 * @author User
 */
public class ControllerKasAnggota {
    
    QueryKasAnggota qka = new QueryKasAnggota();
     public boolean insertKasAnggota(KasAnggota data){
     return qka.insert(data);}
    
    public boolean updateKasAnggota(KasAnggota data){
    return qka.update(data);}
    
    public boolean deleteKasAnggota(int id){
    return qka.delete(id);}
    
    public List<KasAnggota> getAllData(){
    return qka.getAllData();}
    
    public KasAnggota getAllKasAnggotaById(int idreg_anggota){
    return qka.getDataKasAnggotabyId(idreg_anggota);}
    
    public List<KasAnggota> getAllDataByID(int idreg_anggota){
    return qka.getAllDataByID(idreg_anggota);}
    
    public int getREG(){
    return qka.genIDReg();
    }
    
    public List<KasAnggota> getAllAnggotaByUKM(String nama_ukm){
        return qka.getAllAnggotaByUKM(nama_ukm);
    }
}
