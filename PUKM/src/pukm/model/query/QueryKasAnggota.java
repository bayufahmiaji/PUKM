/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.model.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pukm.connection.SqlConnection;
import pukm.model.KasAnggota;
import pukm.model.interfaces.InterfacesKasAnggota;

/**
 *
 * @author User
 */
public class QueryKasAnggota implements InterfacesKasAnggota{

    Connection conn= SqlConnection.getConnection();
    
    @Override
    public boolean insert(KasAnggota data) {
        String sql="insert into bendahara values(?,?,?,?,?,?)";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setInt(1, data.getIdreg_anggota());
            statement.setInt(2, data.getId_anggota());
            statement.setString(3, data.getNama_ukm());
            statement.setInt(4, data.getSaldo_anggota());
            statement.setInt(5, data.getUang_masuk());
            statement.setInt(6, data.getUang_keluar());
            
            int row = statement.executeUpdate();
            
            if(row>0){
                return true;
            }
            statement.close();
        }catch(SQLException e){
            Logger.getLogger(KasAnggota.class.getName()).log(Level.SEVERE,null,e);
        }
        return false;
    }

    @Override
    public boolean update(KasAnggota data) {
        String sql="update kas_anggota set id_anggota =?,nama_ukm=?,saldo_ukm=?, "
                + "uang_masuk=?,uang_keluar=? where idreg_anggota=?";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setInt(1, data.getId_anggota());
            statement.setString(2, data.getNama_ukm());
            statement.setInt(3, data.getSaldo_anggota());
            statement.setInt(4, data.getUang_masuk());
            statement.setInt(5, data.getUang_keluar());
            statement.setInt(6, data.getIdreg_anggota());
            
            int row= statement.executeUpdate();
            if(row>0){
                return true;
            }
            statement.close();
        
        }catch(SQLException e){
            Logger.getLogger(KasAnggota.class.getName()).log(Level.SEVERE, null,e);
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        String sql="delete from kas_anggota where idreg_anggota=?";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setInt(1, id);
            int row=statement.executeUpdate();
            if(row>0){
                return true;
            }
            statement.close();
        }catch(SQLException e){
            Logger.getLogger(KasAnggota.class.getName()).log(Level.SEVERE, null,e);
        }
        
       return false;
    }

    @Override
    public List<KasAnggota> getAllData() {
        List<KasAnggota> listKasAnggota=new ArrayList<KasAnggota>();
       String sql="select * from bendahara";
       try{
           PreparedStatement statement=conn.prepareStatement(sql);
           
           ResultSet rs= statement.executeQuery();
           
           while(rs.next()){
               KasAnggota ks =new KasAnggota(
                       rs.getInt(1), 
                       rs.getInt(2),
                       rs.getString(3),
                       rs.getInt(4),
                       rs.getInt(5),
                       rs.getInt(6));
               listKasAnggota.add(ks);
           }
           statement.close();
           
       }catch(SQLException e){
           Logger.getLogger(KasAnggota.class.getName()).log(Level.SEVERE,null,e);
       }
       return listKasAnggota;
    }

    @Override
    public KasAnggota getDataKasAnggotabyId(int idreg_anggota) {
        KasAnggota data = null;
        String sql="select * from kas_anggota where idreg_anggota=?";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setInt(1, idreg_anggota);
            ResultSet rs=statement.executeQuery();
            
            while(rs.next()){
                data = new KasAnggota(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getInt(4), 
                        rs.getInt(5),
                        rs.getInt(6));
            }
            statement.close();
        }catch(SQLException e){
            Logger.getLogger(KasAnggota.class.getName()).log(Level.SEVERE,null,e);
        }
        
        return data;
    }

    @Override
    public List<KasAnggota> getAllDataByID(int idreg_anggota) {
        List<KasAnggota> listKasAnggota=new ArrayList<>();
       String sql="select * from kas_anggota where idreg_anggota like '%"+idreg_anggota+"%'";
       try{
           PreparedStatement statement= conn.prepareStatement(sql);
           ResultSet rs= statement.executeQuery();
           
           while(rs.next()){
               KasAnggota ks= new KasAnggota(
                       rs.getInt(1), 
                       rs.getInt(2),
                       rs.getString(3), 
                       rs.getInt(4), 
                       rs.getInt(5),
                       rs.getInt(6));
               listKasAnggota.add(ks);
           }
       statement.close();
       }catch(SQLException e){
           Logger.getLogger(KasAnggota.class.getName()).log(Level.SEVERE,null,e);
       }
       return listKasAnggota;
    }
    
}
