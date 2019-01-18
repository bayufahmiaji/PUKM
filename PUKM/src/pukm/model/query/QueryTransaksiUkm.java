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
import pukm.model.TransaksiUkm;
import pukm.model.interfaces.InterfaceTransaksiUkm;

/**
 *
 * @author AdittyaS
 */
public class QueryTransaksiUkm implements InterfaceTransaksiUkm {
    private Connection conn = SqlConnection.getConnection();
    @Override
    public boolean insert(TransaksiUkm data) {
        String sql = "Insert Into detail_transaksi values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, data.getId_transaksi());
            statement.setInt(2, data.getId_ukm());
            statement.setString(3, data.getNama_ukm());
            statement.setString(4, data.getTanggal());
            statement.setString(5, data.getDetail());
            statement.setInt(6, data.getSaldo_ukm());
            statement.setInt(7, data.getJumlah_pengeluaran());
            statement.setInt(8, data.getJumlah_pemasukan());
            int row = statement.executeUpdate();
            if(row > 0 ){
                return true;
            } statement.close();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(QueryTransaksiUkm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        }

    @Override
    public boolean update(TransaksiUkm data) {
        String sql = "Update detail_transaksi set detail=?, saldo_ukm=? where id_transaksi=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, data.getDetail());
            statement.setInt(2, data.getSaldo_ukm());
            statement.setInt(3, data.getId_transaksi());
            int row = statement.executeUpdate();
            if(row > 0 ){
                return true;
            } statement.close();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(QueryTransaksiUkm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(int id_transaksi) {
        String sql = "Delete from detail_transaksi where id_transaksi=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, id_transaksi);
            int row = statement.executeUpdate();
            if(row > 0 ){
                return true;
            } statement.close();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(QueryTransaksiUkm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<TransaksiUkm> getAllTransaksiUkm() {
        List<TransaksiUkm> listTransaksiUkm = new ArrayList<>();
        String sql = "Select * from detail_transaksi";
        try {
            if(SqlConnection.getConnection()==null){
                return null;
            } else {
                PreparedStatement statement = conn.prepareStatement(sql);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    TransaksiUkm k = new TransaksiUkm(
                    rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getInt(6),rs.getInt(7),rs.getInt(0)
                    );
                    listTransaksiUkm.add(k);
                }
                statement.close();
            }
        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(QueryTransaksiUkm.class.getName()).log(Level.SEVERE, null, ex);
        } return listTransaksiUkm;
    }

    @Override
    public TransaksiUkm getAllTransaksiUkmbyID(int id_transaksi) {
        TransaksiUkm output = null;
        String sql = "Select * from detail_transaksi where id_transaksi=?";
        try {
            if(SqlConnection.getConnection()==null){
                return null;
            } else {
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setInt(1, id_transaksi);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    output = new TransaksiUkm(
                    rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getInt(6),rs.getInt(7), rs.getInt(8)
                    );
                    statement.close();
                }
            }
        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(QueryTransaksiUkm.class.getName()).log(Level.SEVERE, null, ex);
        } return output;
    }

    @Override
    public int generateID() {
        int id_transaksi = 0;
        String sql = "EXEC genIdTransaksi";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                id_transaksi = rs.getInt(1);
            } 
            statement.close();
        } catch (SQLException e){
            java.util.logging.Logger.getLogger(QueryTransaksiUkm.class.getName()).log(Level.SEVERE, null, e);
        }
        return id_transaksi;
    
    }
    
    @Override
    public TransaksiUkm getSaldo(int saldo){
        TransaksiUkm output = null;
        String sql = "Select saldo_ukm from detail_transaksi where id_transaksi=?";
        try {
            if(SqlConnection.getConnection()==null){
                return null;
            } else {
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setInt(1, output.getId_transaksi());
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    output = new TransaksiUkm(
                    rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getInt(6),rs.getInt(7),rs.getInt(8)
                    );
                    statement.close();
                }
            }
        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(QueryTransaksiUkm.class.getName()).log(Level.SEVERE, null, ex);
        } return output;
    }
    
}
