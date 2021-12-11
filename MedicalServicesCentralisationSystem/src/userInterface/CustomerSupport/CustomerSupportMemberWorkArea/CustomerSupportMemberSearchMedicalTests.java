/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CustomerSupport.CustomerSupportMemberWorkArea;



import userInterface.CustomerSupport.CustomerSupportAdminWorkArea.*;
import MainCentralisationSystem.MedicalServiceCentralisationEcoSystem;

import CustomerSupportTeam.CustomerSupportMember.CustomerSupportMemberDirectory;
import CustomerSupportTeam.CustomerSupportMember.CustomerSupportMember;
import CustomerSupportTeam.CustomerSupportTeam;


import MainCentralisationSystem.Role.CustomerSupportMemberRole;
import MainCentralisationSystem.Role.FrontDeskOperatorRole;
import MainCentralisationSystem.Role.Role;

import MainCentralisationSystem.UserAccount;
import MainCentralisationSystem.UserAccountDirectory;
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
public class CustomerSupportMemberSearchMedicalTests extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem;
    CustomerSupportMemberDirectory accountantDirectory;
    
    UserAccount userAccount;
    UserAccountDirectory UserAccountDirectory;
    CustomerSupportTeam customerSupportTeam;
    public CustomerSupportMemberSearchMedicalTests(JPanel userProcessContainer , MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem, CustomerSupportTeam customerSupportTeam) {
        
        this.userProcessContainer = userProcessContainer;
        this.medicalServiceCentralisationEcoSystem = medicalServiceCentralisationEcoSystem;
        this.customerSupportTeam = customerSupportTeam;
        initComponents();
        if(customerSupportTeam.getCustomerSupportMemberDirectory()== null)
           customerSupportTeam.setCustomerSupportMemberDirectory(new CustomerSupportMemberDirectory());
        
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

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRequests = new javax.swing.JTable();
        jButtonCreate = new javax.swing.JButton();
        jTextFieldCustName = new javax.swing.JTextField();
        jLabelEmpID = new javax.swing.JLabel();
        jLabelEmpID1 = new javax.swing.JLabel();
        jTextFieldCustName1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 70, 169));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lab Test Directory");

        jButton2.setBackground(new java.awt.Color(0, 70, 169));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTableRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Test Name", "Pincode", "Hospital ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRequestsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRequests);

        jButtonCreate.setText("SEARCH");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jTextFieldCustName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustNameActionPerformed(evt);
            }
        });

        jLabelEmpID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpID.setText("Test Name");

        jLabelEmpID1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpID1.setText("Pincode");

        jTextFieldCustName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustName1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelEmpID1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jTextFieldCustName1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(100, 100, 100)
                                .addComponent(jButtonCreate)))))
                .addGap(410, 410, 410))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmpID)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEmpID1)
                                    .addComponent(jTextFieldCustName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jButtonCreate)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(557, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"Sysadmin");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldCustNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustNameActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableRequests.getModel();
        ArrayList<String> user_input = check_empty_field();
        UserAccountDirectory usersList = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        if(usersList.checkIfUserIsUnique(user_input.get(0))){
            
                userAccount = new UserAccount(user_input.get(0), user_input.get(2),new CustomerSupportMemberRole());
                usersList.addUserAccount(userAccount);
                CustomerSupportMember accountant = new CustomerSupportMember();
                accountant.setCustomerSupportMemberId(user_input.get(0));
                accountant.setCustomerSupportMemberName(user_input.get(1));  
                accountantDirectory.addCustomerSupportMember(user_input.get(0), accountant);
                customerSupportTeam.setCustomerSupportMemberDirectory(accountantDirectory);
                userAccount.setCustomerSupportTeam(customerSupportTeam);
            
            
            JOptionPane.showMessageDialog(this, "New Employee Information has been added.");
            model.addRow(new Object[]{userAccount,user_input.get(1),user_input.get(2)});
            clearFields();
        }
        else{
            JOptionPane.showMessageDialog(this, "This username is not available. Please select a new one.");
        }
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jTableRequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRequestsMouseClicked
        // TODO add your handling code here:
        jButtonCreate.setEnabled(false);
        int selected_row_ix = jTableRequests.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableRequests.getModel();
        UserAccount select_user_account_details = (UserAccount)model.getValueAt(selected_row_ix, 0);
        jTextFieldCustName.setEditable(false);
        jTextFieldCustName.setText(select_user_account_details.getUsername());
        
        Role role = select_user_account_details.getRole();
        System.out.println("role.toString(): "+role.toString());
        
        
        if(role.toString().equals("CustomerSupportMember")){
            CustomerSupportTeam customerSupportTeam = select_user_account_details.getCustomerSupportTeam();
            accountantDirectory = customerSupportTeam.getCustomerSupportMemberDirectory();
            HashMap<String, CustomerSupportMember> accountantList = accountantDirectory.getCustomerSupportMemberList();
            CustomerSupportMember accountant = accountantList.get(select_user_account_details.getUsername());
            jTextFieldCustPhone.setText(accountant.getCustomerSupportMemberName());
        }
        
        jTextFieldPassword.setText(select_user_account_details.getPassword());
        
    }//GEN-LAST:event_jTableRequestsMouseClicked

    private void jTextFieldCustName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustName1ActionPerformed
    private UserAccount set_user_input_values(UserAccount userAccount, ArrayList<String> user_input) {
//        userAccount.getEmployee().setEmployee_id(user_input.get(0));
//        userAccount.getEmployee().setEmployee_name(user_input.get(1));
        userAccount.setPassword(user_input.get(2));
        return userAccount;
    }
    private void clearFields(){
        jTextFieldCustName.setText("");
        jTextFieldCustPhone.setText("");
        jTextFieldPassword.setText("");
    }
    
    public ArrayList<String> check_empty_field(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_emp_id = jTextFieldCustName.getText();
        String user_emp_name = jTextFieldCustPhone.getText();
        String user_password = jTextFieldPassword.getText();

        
        if(user_emp_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "User ID can't be left empty.");
        }
        else if(user_emp_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "User Name can't be left empty.");
        }
        else if(user_password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a Password.");
        }
        
        
        user_input.add(user_emp_id);
        user_input.add(user_emp_name);
        user_input.add(user_password);
        
        return user_input;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEmpID;
    private javax.swing.JLabel jLabelEmpID1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRequests;
    private javax.swing.JTextField jTextFieldCustName;
    private javax.swing.JTextField jTextFieldCustName1;
    // End of variables declaration//GEN-END:variables

    

    private void addrecordstotable() {
        accountantDirectory = customerSupportTeam.getCustomerSupportMemberDirectory();
    
        DefaultTableModel model = (DefaultTableModel) jTableRequests.getModel();
        model.setRowCount(0);
//        ArrayList<CustomerSupportMember> accountantList = accountantDirectory.getCustomerSupportMemberList();
//        for(CustomerSupportMember accountant: accountantList)
//        {
//            model.addRow(new Object[]{accountant.getUserAccount(),accountant.getUserAccount().getEmployee().getEmployee_name(),"CustomerSupportMember",accountant.getUserAccount().getPassword()});
//        }
        UserAccountDirectory userAccountDirectory = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        ArrayList<UserAccount> usersList = userAccountDirectory.getUserAccountList();
//        customerSupportTeamDirectory = medicalServiceCentralisationEcoSystem.getCustomerSupportTeamDirectory();
        
        model.setRowCount(0);
//        ArrayList<CustomerSupportTeam> customerSupportTeamList = customerSupportTeamDirectory.getCustomerSupportTeamList();
        for(UserAccount userAccount: usersList)
        {   
            System.out.println("userAccount.getRole().toString(): "+userAccount.getRole().toString());
            if(userAccount.getRole().toString() == "CustomerSupportMember" && userAccount.getCustomerSupportTeam().equals(customerSupportTeam)){
                
                accountantDirectory = customerSupportTeam.getCustomerSupportMemberDirectory();
                HashMap<String, CustomerSupportMember> accountantList = accountantDirectory.getCustomerSupportMemberList();
                CustomerSupportMember accountant = accountantList.get(userAccount.getUsername());
                model.addRow(new Object[]{userAccount,accountant.getCustomerSupportMemberName(),userAccount.getPassword()});
            }
        }

        jTableRequests.setModel(model);
    }
    
    
}
