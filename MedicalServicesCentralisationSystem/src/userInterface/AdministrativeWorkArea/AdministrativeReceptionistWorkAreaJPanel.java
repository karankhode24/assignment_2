/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AdministrativeWorkArea;

import userInterface.SystemAdminWorkArea.*;
import HospitalManagement.HospitalManagementEcoSystem;
import HospitalManagement.HospitalManagementEnterprise;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
//import userinterface.createNewUser.createLogin;

public class AdministrativeReceptionistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    HospitalManagementEcoSystem hospitalManagementEcoSystem;
    public AdministrativeReceptionistWorkAreaJPanel(JPanel userProcessContainer,HospitalManagementEcoSystem hospitalManagementEcoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.hospitalManagementEcoSystem = hospitalManagementEcoSystem;
        jPanel1.setVisible(false);
        //jSplitPane.setVisible(false);
        //jPanel2.setVisible(true);
//        populateTree();
    }
    
    public void populateTree(){
        //DefaultTreeModel model=(DefaultTreeModel)Admin.getModel();
       // Add the code for draw your system structure shown by JTree
       
      //  model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonPatientManagement = new javax.swing.JButton();
        jButtonAppointmentManagement = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1720, 1080));
        setLayout(new java.awt.BorderLayout());

        jSplitPane.setPreferredSize(new java.awt.Dimension(1720, 1080));

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 1080));

        jPanel2.setBackground(new java.awt.Color(0, 70, 169));
        jPanel2.setPreferredSize(new java.awt.Dimension(1720, 1080));

        jButtonPatientManagement.setBackground(new java.awt.Color(0, 70, 169));
        jButtonPatientManagement.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonPatientManagement.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPatientManagement.setText("Patient Management");
        jButtonPatientManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPatientManagementActionPerformed(evt);
            }
        });

        jButtonAppointmentManagement.setBackground(new java.awt.Color(0, 70, 169));
        jButtonAppointmentManagement.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonAppointmentManagement.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAppointmentManagement.setText("Appointment Management");
        jButtonAppointmentManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAppointmentManagementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPatientManagement, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                    .addComponent(jButtonAppointmentManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(892, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jButtonPatientManagement)
                .addGap(50, 50, 50)
                .addComponent(jButtonAppointmentManagement)
                .addContainerGap(670, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1078, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel1);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAppointmentManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAppointmentManagementActionPerformed
//        ManageRestaurantsWorkArena manageRestaurantsWorkArena = new ManageRestaurantsWorkArena(userProcessContainer,hospitalManagementEcoSystem);
//        userProcessContainer.add("ManageRestaurantsWorkArena",manageRestaurantsWorkArena);
//        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
//        cardLayout.show(userProcessContainer,"ManageRestaurantsWorkArena");
    }//GEN-LAST:event_jButtonAppointmentManagementActionPerformed

    private void jButtonPatientManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPatientManagementActionPerformed

//        ManageCustomersWorkArena mc = new ManageCustomersWorkArena(userProcessContainer,hospitalManagementEcoSystem);
//        userProcessContainer.add("manageCustomers",mc);
//        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
//        cardLayout.show(userProcessContainer,"manageCustomers");
    }//GEN-LAST:event_jButtonPatientManagementActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAppointmentManagement;
    private javax.swing.JButton jButtonPatientManagement;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
