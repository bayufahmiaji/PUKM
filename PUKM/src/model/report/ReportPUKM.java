/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.report;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import pukm.connection.SqlConnection;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ReportPUKM {
private Connection conn= SqlConnection.getConnection();
    
    public void GenerateReportTransaksi(){
        try{
         
            String sql ="select * from detail_transaksi";
            JasperDesign jd= JRXmlLoader.load("src/model/report/report1.jrxml");
            JRDesignQuery query= new JRDesignQuery();
            query.setText(sql);
            jd.setQuery(query);
            JasperReport report=JasperCompileManager.compileReport(jd);
            JasperPrint print= JasperFillManager.fillReport(report, null,conn);
            JasperViewer.viewReport(print,false);
        
        }catch(Exception e){
            Logger.getLogger(ReportPUKM.class.getName()).log(Level.SEVERE,null,e);
        }
    
    }
}
