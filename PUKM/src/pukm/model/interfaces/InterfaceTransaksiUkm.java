/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.model.interfaces;

import java.util.List;
import pukm.model.TransaksiUkm;

/**
 *
 * @author AdittyaS
 */
public interface InterfaceTransaksiUkm {
    public boolean insert(TransaksiUkm data);
    public boolean update(TransaksiUkm data);
    public boolean delete(int id_transaksi);
    
    public List<TransaksiUkm> getAllTransaksiUkm();
    public TransaksiUkm getAllTransaksiUkmbyID(int id_transaksi);
    public int generateID();
    public TransaksiUkm getSaldo(int saldo);
}
