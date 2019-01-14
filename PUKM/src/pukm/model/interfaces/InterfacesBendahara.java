/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.model.interfaces;

import java.util.List;
import pukm.model.Bendahara;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface InterfacesBendahara {
    
    
    public boolean insert(Bendahara bendahara);
    public boolean update(Bendahara bendahara);
    public boolean delete(int id);
    public List<Bendahara> getAllData();
    public Bendahara getDataBendaharabyId(int id);
    public List<Bendahara> getAllDataByName(String nama_bendahara);
    
}
