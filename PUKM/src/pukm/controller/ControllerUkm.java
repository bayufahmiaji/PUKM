/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.controller;

import java.util.List;
import pukm.model.Ukm;
import pukm.model.query.QueryUkm;

/**
 *
 * @author User
 */
public class ControllerUkm {
    private QueryUkm queryUkm = new QueryUkm();
    
    public List<Ukm> getallData(){
        return  queryUkm.getallUkm();
    }
    
    public boolean InsertUkm(Ukm data){
        return queryUkm.insert(data);
    }
    
    public boolean UpdateUkm(Ukm data){
        return queryUkm.update(data);
    }
    
    public boolean Deleteukm(int id_ukm){
        return queryUkm.delete(id_ukm);
    }
    
    public List<Ukm> getAllUkmByID(int id_ukm){
        return queryUkm.getallukUkmbyID(id_ukm);
    }
        
    public Ukm getDataUkmbyyID(int id_ukm){
        return queryUkm.getDataUkmbyId(id_ukm);
    }
    
   
}
