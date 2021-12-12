/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.MedSupWarehouseAdminWorkArea;


import userInterface.HospitalManagement.MedTechnicalWorkArea.*;
import HospitalManagement.Hospital.Hospital;
import MedicalEquipmentWarehouse.MedSupEquip.MedSupEquip;
import MedicalEquipmentWarehouse.MedSupEquip.MedSupEquipDirectory;
import MainCentralisationSystem.MedicalServiceCentralisationEcoSystem;
import MainCentralisationSystem.UserAccount;
import MainCentralisationSystem.UserAccountDirectory;
import MedicalEquipmentWarehouse.MedSupWarehouse;
import MedicalEquipmentWarehouse.MedSupWarehouseDirectory;
import MedicalEquipmentWarehouse.Orders.OrderDirectory;
import userInterface.SystemAdminWorkArea.*;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shreya
 */
public class MedSupWarehouseDatabase extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem;
    UserAccount userAccount;
    UserAccountDirectory userAccountDirectory;
//    PatientMedSupEquipDirectory patientMedSupEquipDirectory;
    MedSupEquipDirectory medSupEquipDirectory;
    MedSupWarehouse medSupWarehouseCurrent;
    public MedSupWarehouseDatabase(JPanel userProcessContainer , MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem, MedSupWarehouse medSupWarehouse) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.medicalServiceCentralisationEcoSystem = medicalServiceCentralisationEcoSystem;
        this.medSupWarehouseCurrent = medSupWarehouse;
        if(medSupWarehouse.getMedSupEquipDirectory() == null){
            medSupWarehouse.setMedSupEquipDirectory(new MedSupEquipDirectory());
        }
        if(medSupWarehouseCurrent.getOrderDirectory()== null){
            medSupWarehouseCurrent.setOrderDirectory(new OrderDirectory());
        }
        addrecordstotable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jButtonHome = new javax.swing.JButton();
        jButtonCreate = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jLabelPatientID = new javax.swing.JLabel();
        jTextFieldMedSupEquipName = new javax.swing.JTextField();
        jLabelPatientName = new javax.swing.JLabel();
        jLabelTitle2 = new javax.swing.JLabel();
        jTextFieldMedSupEquipPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedSupEquipDB = new javax.swing.JTable();
        jLabelPatientName1 = new javax.swing.JLabel();
        jTextFieldMedSupEquipQuantity = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 70, 169));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("All Equipment");
        add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 706, -1));

        jButtonHome.setBackground(new java.awt.Color(0, 70, 169));
        jButtonHome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonHome.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHome.setText("HOME");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 60, -1, -1));

        jButtonCreate.setText("CREATE");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });
        add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 219, -1, -1));

        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, -1, -1));

        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, -1));

        jLabelPatientID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPatientID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPatientID.setText("Medical Equiment Name");
        add(jLabelPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 200, 120, -1));

        jTextFieldMedSupEquipName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMedSupEquipNameActionPerformed(evt);
            }
        });
        add(jTextFieldMedSupEquipName, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 200, 270, -1));

        jLabelPatientName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPatientName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPatientName.setText("Medical Equipment Price");
        add(jLabelPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 130, -1));

        jLabelTitle2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelTitle2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle2.setText("Medical Supplies Equipment Database");
        add(jLabelTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 940, -1));

        jTextFieldMedSupEquipPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMedSupEquipPriceActionPerformed(evt);
            }
        });
        add(jTextFieldMedSupEquipPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 270, -1));

        jTableMedSupEquipDB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Medical Equipment Name", "Medical Equipment Price", "Medical Equipment Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableMedSupEquipDB);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 430, 110));

        jLabelPatientName1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPatientName1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPatientName1.setText("Medical Equipment Quantity");
        add(jLabelPatientName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 140, -1));

        jTextFieldMedSupEquipQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMedSupEquipQuantityActionPerformed(evt);
            }
        });
        add(jTextFieldMedSupEquipQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 270, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"Sysadmin");
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jTextFieldMedSupEquipNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMedSupEquipNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMedSupEquipNameActionPerformed

    private void jTextFieldMedSupEquipPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMedSupEquipPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMedSupEquipPriceActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableMedSupEquipDB.getModel();
        MedSupWarehouseDirectory medSupWarehouseDirectory = medicalServiceCentralisationEcoSystem.getMedSupWarehouseDirectory();
        ArrayList<MedSupWarehouse> medSupWarehouseList = medSupWarehouseDirectory.getMedSupWarehouseList();
        for(MedSupWarehouse medSupWarehouse: medSupWarehouseList){
            if(medSupWarehouse.getMedSupWarehouseId().equals(medSupWarehouseCurrent.getMedSupWarehouseId())){
                MedSupEquipDirectory medSupEquipDirectory = medSupWarehouseCurrent.getMedSupEquipDirectory();
                MedSupEquip medSupEquip = new MedSupEquip();
                String medSupEquip_name = jTextFieldMedSupEquipName.getText();
                String medSupEquip_price = jTextFieldMedSupEquipPrice.getText();
                String medSupEquip_quantity = jTextFieldMedSupEquipQuantity.getText();
                medSupEquip.setMedSupEquip_name(medSupEquip_name);
                medSupEquip.setMedSupEquip_price(medSupEquip_price);
                medSupEquip.setMedSupEquip_quantity(medSupEquip_quantity);
                medSupEquip.setMedSupWarehouseId(medSupWarehouse.getMedSupWarehouseId());
                medSupEquipDirectory.addMedSupEquip(medSupEquip);
                medSupWarehouseCurrent.setMedSupEquipDirectory(medSupEquipDirectory);
                JOptionPane.showMessageDialog(this, "New MedSupEquip Information has been added.");
                model.addRow(new Object[]{medSupEquip,medSupEquip.getMedSupEquip_price(),medSupEquip.getMedSupEquip_quantity()});
                clearFields();
                
            }
        }
        
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jTextFieldMedSupEquipQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMedSupEquipQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMedSupEquipQuantityActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteActionPerformed
    /*private Customer set_user_input_values(Customer customer, ArrayList<String> user_input){
        
        customer.getUserAccount().setPassword(user_input.get(1));
        customer.setCustomerPhone(user_input.get(2));
        return customer;
    }
        private void clearFields(){
        custUsername.setText("");
        custPassword.setText("");
        custContact.setText("");

    }
    public ArrayList<String> check_empty_field(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_custName = custUsername.getText();
        String user_custPass = custPassword.getText();
        String user_contact = custContact.getText();
 
        if(user_custName.isEmpty()){
            JOptionPane.showMessageDialog(this, "Customer Name can't be left empty");
        }
        else if(user_custPass.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter password");
        }
        
        else if(user_contact.isEmpty()){
            JOptionPane.showMessageDialog(this, "Customer Contact No can't be left empty.");
        }
        user_input.add(user_custName);
        user_input.add(user_custPass);
        user_input.add(user_contact);
        
        return user_input;
        
    }
    */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelPatientID;
    private javax.swing.JLabel jLabelPatientName;
    private javax.swing.JLabel jLabelPatientName1;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitle2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMedSupEquipDB;
    private javax.swing.JTextField jTextFieldMedSupEquipName;
    private javax.swing.JTextField jTextFieldMedSupEquipPrice;
    private javax.swing.JTextField jTextFieldMedSupEquipQuantity;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        jTextFieldMedSupEquipName.setText("");
        jTextFieldMedSupEquipPrice.setText("");
        jTextFieldMedSupEquipQuantity.setText("");
    }

    private void addrecordstotable() {
        
        medSupEquipDirectory = medSupWarehouseCurrent.getMedSupEquipDirectory();
        ArrayList<MedSupEquip> medSupEquipList = medSupEquipDirectory.getMedSupEquipList();
        DefaultTableModel model = (DefaultTableModel) jTableMedSupEquipDB.getModel();
        model.setRowCount(0);
//        DefaultComboBoxModel dc = new DefaultComboBoxModel();
        
        for(MedSupEquip medSupEquip: medSupEquipList)
        {
            model.addRow(new Object[]{medSupEquip, medSupEquip.getMedSupEquip_price(), medSupEquip.getMedSupEquip_quantity()});

        }
        jTableMedSupEquipDB.setModel(model);
    }
}
