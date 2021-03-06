/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.report.ReportPUKM;
import pukm.controller.ControllerAnggota;
import pukm.controller.ControllerUkm;
import pukm.model.Anggota;
import pukm.model.Ukm;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class FormMainDasboard extends javax.swing.JFrame {
    private final ControllerUkm controllerUkm = new ControllerUkm();
    private final ControllerAnggota controllerAnggota = new ControllerAnggota();
    
    /**
     * Creates new form FormMainDasboard
     */
    public FormMainDasboard() {
        initComponents();
        setTableUKM(controllerUkm.getallData());
        setTableAnggota(controllerAnggota.getAllAnggota());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSaldo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAnggota = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        mnbar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnAbout = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnAdmin = new javax.swing.JMenuItem();
        loginBendahara = new javax.swing.JMenuItem();
        loginSekretaris = new javax.swing.JMenuItem();
        mnUkm = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblSaldo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblSaldo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );

        jLabel1.setFont(new java.awt.Font("Yu Mincho", 1, 18)); // NOI18N
        jLabel1.setText("Saldo UKM Terbaru");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblAnggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblAnggota);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(21, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel2.setFont(new java.awt.Font("Yu Mincho", 1, 18)); // NOI18N
        jLabel2.setText("Anggota Baru Terbaru");

        jMenu1.setText("File");

        mnExit.setText("Exit");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnExit);

        mnbar1.add(jMenu1);

        jMenu2.setText("Help");

        mnAbout.setText("About");
        mnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAboutActionPerformed(evt);
            }
        });
        jMenu2.add(mnAbout);

        mnbar1.add(jMenu2);

        jMenu3.setText("Login");

        mnAdmin.setText("Login Admin");
        mnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAdminActionPerformed(evt);
            }
        });
        jMenu3.add(mnAdmin);

        loginBendahara.setText("Login Bendahara");
        loginBendahara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBendaharaActionPerformed(evt);
            }
        });
        jMenu3.add(loginBendahara);

        loginSekretaris.setText("Login Seketaris");
        loginSekretaris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginSekretarisActionPerformed(evt);
            }
        });
        jMenu3.add(loginSekretaris);

        mnbar1.add(jMenu3);

        mnUkm.setText("Info");

        jMenuItem1.setText("Info UKM");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnUkm.add(jMenuItem1);

        mnbar1.add(mnUkm);

        jMenu4.setText("Report");

        jMenuItem2.setText("Report Transaksi UKM");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        mnbar1.add(jMenu4);

        setJMenuBar(mnbar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)))
                .addContainerGap(498, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(rootPane, "Apakah Anda Yakin Akan Log Out?","Confrim Dialog",JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_mnExitActionPerformed

    private void mnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAboutActionPerformed
        DialogAbout da = new DialogAbout(this, rootPaneCheckingEnabled);
        da.setVisible(true);
    }//GEN-LAST:event_mnAboutActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       DialogInfoUkm dialog = new DialogInfoUkm(this, rootPaneCheckingEnabled);
       dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAdminActionPerformed
        String login = "Login Admin";
        new DialogLogin(login, rootPaneCheckingEnabled).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnAdminActionPerformed

    private void loginBendaharaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBendaharaActionPerformed
        String login = "Login Bendahara";
        new DialogLogin(login, rootPaneCheckingEnabled).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginBendaharaActionPerformed

    private void loginSekretarisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginSekretarisActionPerformed
        String login = "Login Sekertaris";
        new DialogLogin(login, rootPaneCheckingEnabled).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginSekretarisActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
        ReportPUKM g = new ReportPUKM();
        g.GenerateReportTransaksi();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

     private void setTableUKM(List<Ukm> listUKm){
        if(listUKm==null){
            JOptionPane.showMessageDialog(this,"Data UKM Gagal Diambil Dari Database",
                    "DATABASE FAILED",JOptionPane.ERROR_MESSAGE);
        }else{
            //setting table admin
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(new String[]{
                "Id UKM",
                "Nama UKM",
                "Saldo UKM"
            });
            
            //mengambil data untuk table admin
            for(Ukm a : listUKm){
                Object[] o = new Object[3];
                o[0] = a.getId_ukm();
                o[1] = a.getNama_ukm();
                o[2] = a.getSaldo_ukm();
                tableModel.addRow(o);
        }
            tblSaldo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
            tblSaldo.setModel(tableModel);
    }
    }
     private void setTableAnggota(List<Anggota> listAnggota){
        if(listAnggota==null){
            JOptionPane.showMessageDialog(this,"Data Anggota Gagal Diambil Dari Database",
                    "DATABASE FAILED",JOptionPane.ERROR_MESSAGE);
        }else{
            //setting table admin
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(new String[]{
                "ID Anggota",
                "ID UKM",
                "Nama Anggota",
                "Alamat",
                "Saldo Anggota",
                "Nama UKM",
                "Jabatan"
            });
            
            //mengambil data untuk table admin
            for(Anggota a : listAnggota){
                Object[] o = new Object[7];
                o[0] = a.getId_anggota();
                o[1] = a.getId_ukm();
                o[2] = a.getNama_anggota();
                o[3] = a.getAlamat();
                o[4] = a.getSaldo_anggota();
                o[5] = a.getNama_ukm();
                o[6] = a.getJabatan();
                tableModel.addRow(o);
        }
            tblAnggota.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
            tblAnggota.setModel(tableModel);
    }
    }
     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMainDasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMainDasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMainDasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMainDasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMainDasboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loginBendahara;
    private javax.swing.JMenuItem loginSekretaris;
    private javax.swing.JMenuItem mnAbout;
    private javax.swing.JMenuItem mnAdmin;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenu mnUkm;
    private javax.swing.JMenuBar mnbar1;
    private javax.swing.JTable tblAnggota;
    private javax.swing.JTable tblSaldo;
    // End of variables declaration//GEN-END:variables
}
