/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.model.interfaces;

import java.util.List;
import pukm.model.Seketaris;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface InterfacesSeketaris{
    
    public boolean insert(Seketaris seketaris);
    public boolean update(Seketaris seketaris);
    public boolean delete(int id);
    public List<Seketaris> getAllData();
    public Seketaris getDataSeketerisbyId(int id);
    public List<Seketaris> getAllDataByName(String nama_seketaris);
    
}
