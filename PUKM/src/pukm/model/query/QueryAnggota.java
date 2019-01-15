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
import pukm.connection.SqlConnection;
import pukm.model.Anggota;
import pukm.model.interfaces.InterfaceAnggota;

/**
 *
 * @author AdittyaS
 */
public class QueryAnggota implements InterfaceAnggota {
    private Connection conn = SqlConnection.getConnection();
    @Override
    public boolean insert(Anggota data) {
        String sql = "Insert into karyawan values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, data.getId_anggota());
            statement.setInt(2, data.getId_ukm() );
            statement.setString(3, data.getNama_anggota());
            statement.setString(4, data.getAlamat());
            statement.setInt(5, data.getSaldo_anggota());
            statement.setString(6, data.getNama_ukm());
            statement.setString(7, data.getJabatan());
            int row = statement.executeUpdate();
            if(row > 0 ){
                return true;
            } statement.close();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(QueryAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;}

    @Override
    public boolean update(Anggota data) {
        String sql = "Update anggota set nama_anggota=? , alamat=? , saldo_anggota=? , jabatan=? where id_anggota=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, data.getNama_anggota());
            statement.setString(2, data.getAlamat());
            statement.setInt(3, data.getSaldo_anggota());
            statement.setString(4, data.getJabatan());
            statement.setInt(5, data.getId_anggota());
            int row = statement.executeUpdate();
            if(row > 0 ){
                return true;
            } statement.close();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(QueryAnggota.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(int id_anggota) {
        String sql = "Delete from anggota where id_anggota=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, id_anggota);
            int row = statement.executeUpdate();
            if (row > 0){
                return true;
            } statement.close();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(QueryAnggota.class.getName()).log(Level.SEVERE, null, ex);
        } return false;
    }

    @Override
    public List<Anggota> getallAnggota() {
        List<Anggota> listAnggota = new ArrayList<>();
        String sql = "Select * from anggota";
        try {
            if(SqlConnection.getConnection()==null){
                return null;
            } else {
                PreparedStatement statement = conn.prepareStatement(sql);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    Anggota k = new Anggota(
                    rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5), rs.getString(6), rs.getString(7)
                    );
                    listAnggota.add(k);
                }
                statement.close();
            }
        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(QueryAnggota.class.getName()).log(Level.SEVERE, null, ex);
        } return listAnggota;
    }

    @Override
    public Anggota getOneAnggotaByID(int id_anggota) {
        Anggota output = null;
        String sql = "Select * from anggota where id_anggota=?";
    try {
            if(SqlConnection.getConnection()==null){
                return null;
            } else {
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setInt(1, id_anggota);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    output = new Anggota(
                    rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5), rs.getString(6), rs.getString(7)
                    );
                    statement.close();
                }
            }
        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(QueryAnggota.class.getName()).log(Level.SEVERE, null, ex);
        } return output;
        
    }

    @Override
    public List<Anggota> getAllAnggotaByName(String nama_anggota) {
        List<Anggota> listAnggota = new ArrayList<>();
        String sql = "Select * from anggota where nama_anggota like '%"+nama_anggota+"%'";
        try {
            if(SqlConnection.getConnection()==null){
                return null;
            } else {
                PreparedStatement statement = conn.prepareStatement(sql);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    Anggota s = new Anggota(
                    rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5), rs.getString(6), rs.getString(7)
                    );
                    listAnggota.add(s);
                }
                statement.close();
            }
        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(QueryAnggota.class.getName()).log(Level.SEVERE, null, ex);
        } return listAnggota;
    }
    
}
