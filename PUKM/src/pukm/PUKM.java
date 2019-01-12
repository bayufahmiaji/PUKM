/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm;

import java.sql.Connection;
import pukm.connection.SqlConnection;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

public class PUKM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = SqlConnection.getConnection();
    }
    
}
