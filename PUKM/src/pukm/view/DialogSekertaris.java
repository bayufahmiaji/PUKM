/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.view;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pukm.controller.ControllerSeketaris;
import pukm.controller.ControllerUkm;
import pukm.model.Seketaris;
import pukm.model.Ukm;
import pukm.model.query.QueryBendahara;

/**
 *
 * @author User
 */
public class DialogSekertaris extends javax.swing.JDialog {
    
     ControllerSeketaris cs= new ControllerSeketaris();
     ControllerUkm ukm= new ControllerUkm();
    //test
    QueryBendahara qb= new QueryBendahara();

    /**
     * Creates new form DialogSekertaris
     */
    public DialogSekertaris(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setDataSeketaris(cs.getAllSeketaris());
        setCbxUkm(ukm.getallData());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpMenu = new javax.swing.JPopupMenu();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdSekertaris = new javax.swing.JTextField();
        txtNamaSekertaris = new javax.swing.JTextField();
        cbxidUkm = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lbReport = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSerketaris = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("Field Sekertaris");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Id Sekertaris");

        jLabel2.setText("Nama Sekertaris");

        jLabel3.setText("UKM");

        cbxidUkm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("User");

        jLabel9.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addComponent(txtIdSekertaris))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamaSekertaris)
                            .addComponent(cbxidUkm, 0, 350, Short.MAX_VALUE)
                            .addComponent(txtUser)
                            .addComponent(txtPassword))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdSekertaris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(txtNamaSekertaris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxidUkm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("Action");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        lbReport.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbReport.setText("READY...!!!");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblSerketaris.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id Sekertaris", "Nama Sekertaris", "Id UKM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSerketaris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSerketarisMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblSerketarisMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblSerketaris);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.setText("Output");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel6)))
                        .addGap(48, 48, 48))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(lbReport))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnClose))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbReport)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int  id_sekertaris=Integer.parseInt(txtIdSekertaris.getText());
        String  id_ukm=cbxidUkm.getSelectedItem().toString();
        String nama_sekertaris=txtNamaSekertaris.getText();
        String user=txtUser.getText();
        String password=txtPassword.getText();
        
        char [] x= new char[1];
        
        for(int c=0;c<id_ukm.length();c++){
            if(id_ukm.charAt(c)!='-'){
                x[c]=id_ukm.charAt(c);
            }
            else{
                break;
            }
        }
        
        int idUkm=Integer.parseInt(new String(x));

        Seketaris s= new Seketaris(id_sekertaris, idUkm, nama_sekertaris, user, password);

        if(btnSave.getText().equals("Save")){
            if(cs.insertSeketaris(s)){
                lbReport.setText("Saved");
                clear();
                setDataSeketaris(cs.getAllSeketaris());
            }else{
                lbReport.setText("Failed Saved");
                setDataSeketaris(cs.getAllSeketaris());
            }
        }else{
            if(cs.updateSeketeris(s)){
                lbReport.setText("Updated");
                btnSave.setText("Save");
                clear();
                setDataSeketaris(cs.getAllSeketaris());
            }else{
                lbReport.setText("Failed Update");
                btnSave.setText("Save");
                clear();
                setDataSeketaris(cs.getAllSeketaris());
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void tblSerketarisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSerketarisMousePressed
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            int row= tblSerketaris.getSelectedRow();
            String id_sekertaris=tblSerketaris.getModel().getValueAt(row, 0).toString();
            String nama_seketaris=tblSerketaris.getModel().getValueAt(row, 2).toString();
            int indexUkm= Integer.parseInt(tblSerketaris.getModel().getValueAt(row, 1).toString())-1;
            String user=tblSerketaris.getModel().getValueAt(row, 3).toString();
            String password=tblSerketaris.getModel().getValueAt(row, 4).toString();
            btnSave.setText("Update");

            txtIdSekertaris.setText(id_sekertaris);
            txtNamaSekertaris.setText(nama_seketaris);
            txtUser.setText(user);
            txtPassword.setText(password);
            //cbxidUkm.setSelectedIndex(indexUkm);
        }
        if(evt.isPopupTrigger()){
            popUpMenu.show(tblSerketaris,evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_tblSerketarisMousePressed

    private void tblSerketarisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSerketarisMouseReleased
        // TODO add your handling code here:
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            int row= tblSerketaris.getSelectedRow();
            String id_sekertaris=tblSerketaris.getModel().getValueAt(row, 0).toString();
            String nama_seketaris=tblSerketaris.getModel().getValueAt(row, 2).toString();
            int indexUkm= Integer.parseInt(tblSerketaris.getModel().getValueAt(row, 1).toString())-1;
            String user=tblSerketaris.getModel().getValueAt(row, 3).toString();
            String password=tblSerketaris.getModel().getValueAt(row, 4).toString();
            btnSave.setText("Update");

            txtIdSekertaris.setText(id_sekertaris);
            txtNamaSekertaris.setText(nama_seketaris);
            txtUser.setText(user);
            txtPassword.setText(password);
            //cbxidUkm.setSelectedIndex(indexUkm);
        }
        if(evt.isPopupTrigger()){
            popUpMenu.show(tblSerketaris,evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_tblSerketarisMouseReleased

    
    private void setDataSeketaris(List<Seketaris> listSektaris){
        if(listSektaris == null){
            JOptionPane.showMessageDialog(this, "gagal ambil data sekertaris",""
                    + "failed",JOptionPane.ERROR_MESSAGE);
        }else
        {
            DefaultTableModel model= new DefaultTableModel();
            model.setColumnIdentifiers(new String []{
            "ID Sekertaris",
            "ID UKM",
            "Nama Serketaris",
            "User",
            "Password"
            });
            
            for(Seketaris s:listSektaris){
                Object[]ob= new Object[5];
                ob[0]=s.getId_seketaris();
                ob[1]=s.getId_ukm();
                ob[2]=s.getNama_seketaris();
                ob[3]=s.getUsername();
                ob[4]=s.getPassword();
                
                model.addRow(ob);
            }
            
            tblSerketaris.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
            tblSerketaris.setModel(model);
        }
    }
    
    private void setCbxUkm(List<Ukm> listUkm){
        
        DefaultComboBoxModel boxModel= new DefaultComboBoxModel();
        for(Ukm u:listUkm){
            boxModel.addElement(u.id_ukm +"-"+u.nama_ukm);
        }
        cbxidUkm.setModel(boxModel);
        
    }
    
    public void clear(){
        btnSave.setText("Save");
        txtIdSekertaris.setText("");
        txtNamaSekertaris.setText("");
        cbxidUkm.setSelectedIndex(0);
        txtUser.setText("");
        txtPassword.setText("");
        lbReport.setText("");
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DialogSekertaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogSekertaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogSekertaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogSekertaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogSekertaris dialog = new DialogSekertaris(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxidUkm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbReport;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JTable tblSerketaris;
    private javax.swing.JTextField txtIdSekertaris;
    private javax.swing.JTextField txtNamaSekertaris;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
