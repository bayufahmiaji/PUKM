/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.model.interfaces;

import java.util.List;
import pukm.model.Admin;

/**
 *
 * @author User
 */
public interface InterfaceAdmin {
    public boolean insert(Admin data);
    public boolean update(Admin data);
    public boolean delete(int id_admin);
    public int generateID();
    
    public List<Admin> getallAdmin();
    
    public boolean benar(String username, String passsword);
}
