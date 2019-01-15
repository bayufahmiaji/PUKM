/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.model.interfaces;

import java.util.List;
import pukm.model.Anggota;

/**
 *
 * @author AdittyaS
 */
public interface InterfaceAnggota {
    public boolean insert(Anggota data);
    public boolean update(Anggota data);
    public boolean delete(int id_anggota);
    
    public List<Anggota> getallAnggota();
    
    public Anggota getOneAnggotaByID(int id_anggota);
    
    public List<Anggota> getAllAnggotaByName(String nama_anggota);
}
