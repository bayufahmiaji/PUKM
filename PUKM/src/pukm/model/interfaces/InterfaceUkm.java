/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.model.interfaces;

import java.util.List;
import pukm.model.Ukm;

/**
 *
 * @author User
 */
public interface InterfaceUkm {
    public boolean insert(Ukm data);
    public boolean update(Ukm data);
    public boolean delete(int id_ukm);
    
    public List<Ukm> getallUkm();
    public List <Ukm> getallukUkmbyID(int id_golongan); 
}
