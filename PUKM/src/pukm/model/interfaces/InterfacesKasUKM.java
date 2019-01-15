/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.model.interfaces;

import java.util.List;
import pukm.model.KasUKM;

/**
 *
 * @author User
 */
public interface InterfacesKasUKM {
 
    public boolean insert(KasUKM data);
    public boolean update(KasUKM data);
    public boolean delete(int id);
    public List<KasUKM> getAllData();
    public KasUKM getDataKasUKMbyId(int idreg_ukm);
    public List<KasUKM> getAllDataByID(int idreg_ukm);
    
    
}
