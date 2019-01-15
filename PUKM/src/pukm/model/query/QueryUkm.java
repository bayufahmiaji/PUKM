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
import pukm.model.Ukm;
import pukm.model.interfaces.InterfaceUkm;

/**
 *
 * @author User
 */
public class QueryUkm implements InterfaceUkm{
    private Connection conn = SqlConnection.getConnection();
    
    
    @Override
    public boolean insert(Ukm u) {
        String sql = "Insert Into ukm values (?,?,?)";
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, u.getId_ukm());
            statement.setString(2, u.getNama_ukm());
            statement.setInt(3, u.getSaldo_ukm());
            int row = statement.executeUpdate();
            if(row>0){
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(QueryUkm.class.getName()).log(Level.SEVERE, null, ex);
        } 
     return false;  
    }

    @Override
    public boolean update(Ukm data) {
      String sql = "UPDATE ukm set nama_ukm=? , saldo_ukm=? where id_ukm=?";
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, data.getNama_ukm());
            statement.setInt(2, data.getSaldo_ukm());
            statement.setInt(3, data.getId_ukm());
            int row = statement.executeUpdate();
            if(row>0){
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(QueryUkm.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return false;
    }

    @Override
    public boolean delete(int id_ukm) {
        String sql = "Delete from ukm where id_ukm=?";
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, id_ukm);
            int row = statement.executeUpdate();
            if(row>0){
                return true;
            }
            statement.close();
            
        } catch (SQLException ex) { 
            Logger.getLogger(QueryUkm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; 
    }

    @Override
    public List<Ukm> getallUkm() {
        List<Ukm> listukm = new ArrayList<>();
        String sql = "Select * from ukm";
        try{
            if(SqlConnection.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                
                
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                    Ukm a = new Ukm(rs.getInt(1), rs.getString(2), rs.getInt(3));
                listukm.add(a);
                }
                statement.close();
            }
        } catch (SQLException ex) { 
            Logger.getLogger(QueryUkm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listukm;
    }

    @Override
    public List<Ukm> getallukUkmbyID(int id_golongan) {
     List<Ukm> listukm = new ArrayList<>();
        String sql = "Select * from ukm WHERE id_ukm=?";
        try{
            if(SqlConnection.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                    Ukm s = new Ukm(
                                rs.getInt(1), rs.getString(2), rs.getInt(3));
                    listukm.add(s);
                }
                statement.close();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(QueryUkm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listukm;
}
    
}
