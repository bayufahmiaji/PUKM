/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.model.interfaces;

import java.util.List;
import pukm.model.KasAnggota;

/**
 *
 * @author User
 */
public interface InterfacesKasAnggota {
    
    public boolean insert(KasAnggota data);
    public boolean update(KasAnggota data);
    public boolean delete(int id);
    public List<KasAnggota> getAllData();
    public KasAnggota getDataKasAnggotabyId(int idreg_anggota);
    public List<KasAnggota> getAllDataByID(int idreg_anggota);
   
}
