/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.controller;

import java.util.List;
import pukm.model.Anggota;
import pukm.model.query.QueryAnggota;

/**
 *
 * @author AdittyaS
 */
public class ControllerAnggota {
    private QueryAnggota queryAnggota = new QueryAnggota();
    
    public List<Anggota> getAllAnggota(){
        return queryAnggota.getallAnggota();
    }
    
    public List<Anggota> getAllAnggotaByName(String nama_anggota){
        return queryAnggota.getAllAnggotaByName(nama_anggota);
    }
    
    public boolean insertAnggota(Anggota data){
        return queryAnggota.insert(data);
    }
    
    public boolean updateAnggota(Anggota data){
        return queryAnggota.update(data);
    }
    
    public boolean deleteAnggota(int id_anggota){
        return queryAnggota.delete(id_anggota);
    }
    
    public Anggota getOneAnggotaByID(int id_anggota){
        return queryAnggota.getOneAnggotaByID(id_anggota);
    }
    
    public List<Anggota> getIdAnggotaLike(int id_angoota){
        return queryAnggota.getIdAnggotaLike(id_angoota);
    }
    
    public boolean updateSaldoAAnggota(int id_anggota,int saldo){
        return queryAnggota.updateSaldoAnggota(id_anggota, saldo);
    }
    public int HitungAngggota(){
        return queryAnggota.HitungAnggota();
    }
    public List<Anggota> getAllAnggotaByUKM(String nama_ukm){
        return queryAnggota.getAllAnggotaByUKM(nama_ukm);
    }

}
