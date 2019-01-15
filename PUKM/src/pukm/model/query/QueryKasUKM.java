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
import pukm.model.KasUKM;
import pukm.model.interfaces.InterfacesKasUKM;

/**
 *
 * @author User
 */
public class QueryKasUKM implements InterfacesKasUKM{

    Connection conn= SqlConnection.getConnection();
    
    @Override
    public boolean insert(KasUKM data) {
        String sql="insert into bendahara values(?,?,?,?,?)";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setInt(1, data.getIdreg_ukm());
            statement.setInt(2, data.getId_ukm());
            statement.setString(3, data.getNama_ukm());
            statement.setInt(4, data.getSaldo_ukm());
            statement.setInt(5, data.getUang_masuk());
            statement.setInt(6, data.getUang_keluar());
            
            int row = statement.executeUpdate();
            
            if(row>0){
                return true;
            }
            statement.close();
        }catch(SQLException e){
            Logger.getLogger(KasUKM.class.getName()).log(Level.SEVERE,null,e);
        }
        return false;
    }

    @Override
    public boolean update(KasUKM data) {
        String sql="update kas_ukm set id_ukm =?,nama_ukm=?,saldo_ukm=?, "
                + "uang_masuk=?,uang_keluar=? where idreg_anggota=?";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setInt(1, data.getId_ukm());
            statement.setString(2, data.getNama_ukm());
            statement.setInt(3, data.getSaldo_ukm());
            statement.setInt(4, data.getUang_masuk());
            statement.setInt(5, data.getUang_keluar());
            statement.setInt(6, data.getIdreg_ukm());
            
            int row= statement.executeUpdate();
            if(row>0){
                return true;
            }
            statement.close();
        
        }catch(SQLException e){
            Logger.getLogger(KasUKM.class.getName()).log(Level.SEVERE, null,e);
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        String sql="delete from kas_ukm where idreg_ukm=?";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setInt(1, id);
            int row=statement.executeUpdate();
            if(row>0){
                return true;
            }
            statement.close();
        }catch(SQLException e){
            Logger.getLogger(KasUKM.class.getName()).log(Level.SEVERE, null,e);
        }
        
       return false;
    }

    @Override
    public List<KasUKM> getAllData() {
        List<KasUKM> listKasUKM=new ArrayList<KasUKM>();
       String sql="select * from bendahara";
       try{
           PreparedStatement statement=conn.prepareStatement(sql);
           
           ResultSet rs= statement.executeQuery();
           
           while(rs.next()){
               KasUKM ku =new KasUKM(
                       rs.getInt(1), 
                       rs.getInt(2),
                       rs.getString(3),
                       rs.getInt(4),
                       rs.getInt(5),
                       rs.getInt(6));
               listKasUKM.add(ku);
           }
           statement.close();
           
       }catch(SQLException e){
           Logger.getLogger(KasUKM.class.getName()).log(Level.SEVERE,null,e);
       }
       return listKasUKM;
    }

    @Override
    public KasUKM getDataKasUKMbyId(int idreg_ukm) {
        KasUKM data = null;
        String sql="select * from kas_ukm where idreg_ukm=?";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setInt(1, idreg_ukm);
            ResultSet rs=statement.executeQuery();
            
            while(rs.next()){
                data = new KasUKM(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getInt(4), 
                        rs.getInt(5),
                        rs.getInt(6));
            }
            statement.close();
        }catch(SQLException e){
            Logger.getLogger(KasUKM.class.getName()).log(Level.SEVERE,null,e);
        }
        
        return data;
    }

    @Override
    public List<KasUKM> getAllDataByID(int idreg_ukm) {
        List<KasUKM> listKasUKM=new ArrayList<>();
       String sql="select * from kas_ukm where idreg_ukm like '%"+idreg_ukm+"%'";
       try{
           PreparedStatement statement= conn.prepareStatement(sql);
           ResultSet rs= statement.executeQuery();
           
           while(rs.next()){
               KasUKM ks= new KasUKM(
                       rs.getInt(1), 
                       rs.getInt(2),
                       rs.getString(3), 
                       rs.getInt(4), 
                       rs.getInt(5),
                       rs.getInt(6));
               listKasUKM.add(ks);
           }
       statement.close();
       }catch(SQLException e){
           Logger.getLogger(KasUKM.class.getName()).log(Level.SEVERE,null,e);
       }
       return listKasUKM;
    }
    
}
