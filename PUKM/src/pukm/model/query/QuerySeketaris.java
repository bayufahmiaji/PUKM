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
import pukm.model.Seketaris;
import pukm.model.interfaces.InterfacesSeketaris;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class QuerySeketaris implements InterfacesSeketaris{
    
    SqlConnection sqlConnection= new SqlConnection();
    Connection conn= sqlConnection.getConnection();

    @Override
    public boolean insert(Seketaris seketaris) {
        String sql="insert into sekertaris values(?,?,?,?,?)";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setInt(1, seketaris.getId_seketaris());
            statement.setInt(2, seketaris.getId_ukm());
            statement.setString(3, seketaris.getNama_seketaris());
            statement.setString(4, seketaris.getUsername());
            statement.setString(5, seketaris.getPassword());
            
            int row = statement.executeUpdate();
            
            if(row>0){
                return true;
            }
            statement.close();
        }catch(SQLException e){
            Logger.getLogger(Seketaris.class.getName()).log(Level.SEVERE,null,e);
        }
        return false;
    }

    @Override
    public boolean update(Seketaris seketaris) {
        String sql="update sekertaris set id_ukm =?, nama_sekertaris=?, username=?, "
                + "password=? where id_sekertaris=?";
        
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setInt(1, seketaris.getId_ukm());
            statement.setString(2, seketaris.getNama_seketaris());
            statement.setString(3, seketaris.getUsername());
            statement.setString(4, seketaris.getPassword());
            statement.setInt(5, seketaris.getId_seketaris());            
            int row= statement.executeUpdate();
            if(row>0){
                return true;
            }
            statement.close();
        
        }catch(SQLException e){
            Logger.getLogger(Seketaris.class.getName()).log(Level.SEVERE, null,e);
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        String sql="delete from sekertaris where id_sekertaris=?";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setInt(1, id);
            int row=statement.executeUpdate();
            if(row>0){
                return true;
            }
            statement.close();
        }catch(SQLException e){
            Logger.getLogger(Seketaris.class.getName()).log(Level.SEVERE, null,e);
        }
        
       return false;
    }

    @Override
    public List<Seketaris> getAllData() {
        List<Seketaris> listSerketaris=new ArrayList<Seketaris>();
       String sql="select * from sekertaris";
       try{
           PreparedStatement statement=conn.prepareStatement(sql);
           
           ResultSet rs= statement.executeQuery();
           
           while(rs.next()){
               Seketaris s =new Seketaris(
                       rs.getInt(1), 
                       rs.getInt(2),
                       rs.getString(3),
                       rs.getString(4),
                       rs.getString(5));
               listSerketaris.add(s);
           }
           statement.close();
           
       }catch(SQLException e){
           Logger.getLogger(Seketaris.class.getName()).log(Level.SEVERE,null,e);
       }
       return listSerketaris;
    }

    @Override
    public Seketaris getDataSeketerisbyId(int id) {
        Seketaris seketaris = null;
        String sql="select * from sekertaris where id_sekertaris=?";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs=statement.executeQuery();
            
            while(rs.next()){
                seketaris= new Seketaris(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4), 
                        rs.getString(5));
            }
            statement.close();
        }catch(SQLException e){
            Logger.getLogger(Seketaris.class.getName()).log(Level.SEVERE,null,e);
        }
        
        return seketaris;
    }

    @Override
    public List<Seketaris> getAllDataByName(String nama_seketeris) {
       List<Seketaris> listSekertaris=new ArrayList<>();
       String sql="select * from sekertaris where nama_sekertaris like '%"+nama_seketeris+"%'";
       try{
           PreparedStatement statement= conn.prepareStatement(sql);
           ResultSet rs= statement.executeQuery();
           
           while(rs.next()){
               Seketaris s= new Seketaris(rs.getInt(1), 
                       rs.getInt(2),
                       rs.getString(3), 
                       rs.getString(4), 
                       rs.getString(5));
               listSekertaris.add(s);
           }
       statement.close();
       }catch(SQLException e){
           Logger.getLogger(Seketaris.class.getName()).log(Level.SEVERE,null,e);
       }
       return listSekertaris;
    }

    public boolean cekLogin(String username,String password){
        //Seketaris seketaris= null;
        String sql="select username,password from sekertaris where username=?"
                + " and password=?";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet rs=statement.executeQuery();
            while(rs.next()){
                return true;
            }
            statement.close();
        }catch(SQLException e){
            Logger.getLogger(Seketaris.class.getName()).log(Level.SEVERE, null,e);
        }
        return false;
    }
    
    public Seketaris getDataSeketerisbyUser(String user) {
        Seketaris seketaris = null;
        String sql="select * from sekertaris where username=?";
        try{
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setString(1, user);
            ResultSet rs=statement.executeQuery();
            
            while(rs.next()){
                seketaris= new Seketaris(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4), 
                        rs.getString(5));
            }
            statement.close();
        }catch(SQLException e){
            Logger.getLogger(Seketaris.class.getName()).log(Level.SEVERE,null,e);
        }
        
        return seketaris;
    }

}
