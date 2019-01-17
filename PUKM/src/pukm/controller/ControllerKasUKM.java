/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.controller;

import java.util.List;
import pukm.model.KasUKM;
import pukm.model.query.QueryKasUKM;

/**
 *
 * @author User
 */
public class ControllerKasUKM {
    
    QueryKasUKM qku = new QueryKasUKM();
     public boolean insertKasUKM(KasUKM data){
     return qku.insert(data);}
    
    public boolean updateKasUKM(KasUKM data){
    return qku.update(data);}
    
    public boolean deleteKasUKM(int id){
    return qku.delete(id);}
    
    public List<KasUKM> getAllData(){
    return qku.getAllData();}
    
    public KasUKM getAllKasUKMById(int idreg_ukm){
    return qku.getDataKasUKMbyId(idreg_ukm);}
    
    public List<KasUKM> getAllDataByID(int idreg_ukm){
    return qku.getAllDataByID(idreg_ukm);}
}
