/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.controller;

import java.util.List;
import pukm.model.Admin;
import pukm.model.query.QueryAdmin;

/**
 *
 * @author User
 */
public class ControllerAdmin{
    private QueryAdmin queryAdmin = new QueryAdmin();
    
    public List<Admin> getallData(){
        return  queryAdmin.getallAdmin();
    }
    
    public boolean InsertAdmin(Admin data){
        return queryAdmin.insert(data);
    }
    
    public boolean UpdateAdmin(Admin data){
        return queryAdmin.update(data);
    }
    
    public boolean DeleteAdmin(int id_admin){
        return queryAdmin.delete(id_admin);
    }

    public int GenerateID(){
        return queryAdmin.generateID();
    }
    
    public boolean benar(String username, String password){
        return queryAdmin.benar(username, password);
    }
    
    public Admin getDataAdminById(String user){
        return queryAdmin.getDataAdminId(user);
    }
    
    public boolean cekLlogin(String username,String password){
        return queryAdmin.cekLogin(username, password);
    }


}
