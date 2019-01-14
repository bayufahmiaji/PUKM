/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pukm.controller;

import java.util.List;
import pukm.model.Seketaris;
import pukm.model.query.QuerySeketaris;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControllerSeketaris {
    
    QuerySeketaris qs = new QuerySeketaris();
    
    public boolean insertSeketaris(Seketaris seketaris){
    return qs.insert(seketaris);}
    
    public boolean updateSeketeris(Seketaris seketaris){
    return qs.update(seketaris);}
    
    public boolean deleteSeketaris(int id){
    return qs.delete(id);}
    
    public List<Seketaris> getAllSeketaris(){
    return qs.getAllData();}
    
    public Seketaris getAllSeketarisById(int id){
    return qs.getDataSeketerisbyId(id);}
    
    public List<Seketaris> getAllSeketarisByName(String nama_seketaris){
    return qs.getAllDataByName(nama_seketaris);}
}
