/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pukm.controller;

import java.util.List;
import pukm.model.Bendahara;
import pukm.model.query.QueryBendahara;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControllerBendahara {
    
    QueryBendahara qs = new QueryBendahara();
    
    public boolean insertBendahara(Bendahara bendahara){
    return qs.insert(bendahara);}
    
    public boolean updateBendahara(Bendahara bendahara){
    return qs.update(bendahara);}
    
    public boolean deleteBendahara(int id){
    return qs.delete(id);}
    
    public List<Bendahara> getAllBendahara(){
    return qs.getAllData();}
    
    public Bendahara getAllBendaharaById(int id){
    return qs.getDataBendaharabyId(id);}
    
    public List<Bendahara> getAllBendaharaByName(String nama_bendahara){
    return qs.getAllDataByName(nama_bendahara);}

}
