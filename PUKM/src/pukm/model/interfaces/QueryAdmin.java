/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.model.interfaces;

import pukm.model.query.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pukm.connection.SqlConnection;
import pukm.model.Admin;
import pukm.model.interfaces.InterfaceAdmin;

/**
 *
 * @author User
 */
public class QueryAdmin implements InterfaceAdmin{
    private Connection conn = SqlConnection.getConnection();
    
    
    @Override
    public boolean insert(Admin a) {
       String sql = "Insert Into admin values (?,?,?,?)";
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, a.getId_admin());
            statement.setString(2, a.getNama_admin());
            statement.setString(3, a.getUsername());
            statement.setString(4, a.getPassword());
            int row = statement.executeUpdate();
            if(row>0){
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(QueryAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    
    }

    @Override
    public boolean update(Admin a) {
        String sql = "UPDATE admin SET nama_admin=?, username=?, password=? WHERE id_admin=?";
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, a.getNama_admin());
            statement.setString(2, a.getUsername());
            statement.setString(3, a.getPassword());
            statement.setInt(4, a.getId_admin());
            int row = statement.executeUpdate();
            if(row>0){
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(QueryAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(int id_admin) {
      String sql = "DELETE FROM admin where id_admin=?";
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, id_admin);
            int row = statement.executeUpdate();
            if(row>0){
                return true;
            }
            statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(QueryAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return false;
    }

    @Override
    public int generateID() {
    int id_admin = 0;
        String sql = "EXEC genIDAdmin";
        try{
            PreparedStatement statement = conn.prepareStatement(sql);
            
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                id_admin = rs.getInt(1);
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(QueryAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id_admin;
        
    }

    @Override
    public List<Admin> getallAdmin() {
        List<Admin> listAdmin = new ArrayList<>();
        String sql = "Select * from admin";
        try{
            if(SqlConnection.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                
                
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                    Admin a = new Admin(
                            rs.getInt(1),
                            rs.getString(2),rs.getString(3),rs.getString(4)); 
                listAdmin.add(a);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(QueryAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listAdmin;
    
    }

    @Override
    public boolean benar(String username, String passsword) {
     String sql = "select username, password where username like ? and password like ?";
        try{
            if(SqlConnection.getConnection()==null){
                return false;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, username);
                statement.setString(2, passsword);
                
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                   return true;
                }
                statement.close();
            }
     
        } catch (SQLException ex) {
            Logger.getLogger(QueryAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
