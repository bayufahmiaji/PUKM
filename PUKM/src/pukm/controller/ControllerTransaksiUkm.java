/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.controller;

import java.util.List;
import pukm.model.TransaksiUkm;
import pukm.model.query.QueryTransaksiUkm;

/**
 *
 * @author AdittyaS
 */
public class ControllerTransaksiUkm {
    private QueryTransaksiUkm queryTransaksiUkm = new QueryTransaksiUkm();
    
    public List<TransaksiUkm> getAllTransaksiUkm(){
        return queryTransaksiUkm.getAllTransaksiUkm();
    }
    
    public TransaksiUkm getAllTransaksiUkmById(int id_transaksi){
        return queryTransaksiUkm.getAllTransaksiUkmbyID(id_transaksi);
    }
    
    public boolean insertTransaksi(TransaksiUkm data){
        return queryTransaksiUkm.insert(data);
    }
    
    public boolean updateTransaksi(TransaksiUkm data){
        return queryTransaksiUkm.update(data);
    }
    
    public boolean deleteTransaksi(int id_transaksi){
        return queryTransaksiUkm.delete(id_transaksi);
    }
    
    public int generateID(){
        return queryTransaksiUkm.generateID();
    }
    
    public TransaksiUkm getSaldo(int saldo){
        return queryTransaksiUkm.getSaldo(saldo);
    }
    
    
}
