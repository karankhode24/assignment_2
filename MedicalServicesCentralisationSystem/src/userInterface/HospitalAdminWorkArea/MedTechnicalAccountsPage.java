/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HospitalAdminWorkArea;


import HospitalManagement.Radiologist.RadiologistDirectory;
import HospitalManagement.Employee.Employee;
import HospitalManagement.HospitalManagementEcoSystem;

import HospitalManagement.Accountant.AccountantDirectory;
import HospitalManagement.Accountant.Accountant;
import HospitalManagement.Pathologist.Pathologist;
import HospitalManagement.Pathologist.PathologistDirectory;
import HospitalManagement.Radiologist.Radiologist;
import HospitalManagement.Hospital.Hospital;


import HospitalManagement.Role.AccountantRole;
import HospitalManagement.Role.PathologistRole;
import HospitalManagement.Role.RadiologistRole;
import HospitalManagement.Role.Role;
import HospitalManagement.Role.TechnicianRole;
import HospitalManagement.Technician.Technician;
import HospitalManagement.Technician.TechnicianDirectory;

import HospitalManagement.UserAccount.UserAccount;
import HospitalManagement.UserAccount.UserAccountDirectory;
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
public class MedTechnicalAccountsPage extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    HospitalManagementEcoSystem hospitalManagementEcoSystem;
    PathologistDirectory pathologistDirectory;
    RadiologistDirectory radiologistDirectory;
    TechnicianDirectory technicianDirectory;
    UserAccount userAccount;
    UserAccountDirectory UserAccountDirectory;
    Hospital hospital;
    public MedTechnicalAccountsPage(JPanel userProcessContainer , HospitalManagementEcoSystem hospitalManagementEcoSystem, Hospital hospital) {
        
        this.userProcessContainer = userProcessContainer;
        this.hospitalManagementEcoSystem = hospitalManagementEcoSystem;
        this.hospital = hospital;
        initComponents();
        if(hospital.getPathologistDirectory()== null)
           hospital.setPathologistDirectory(new PathologistDirectory());
        if(hospital.getRadiologistDirectory()== null)
           hospital.setRadiologistDirectory(new RadiologistDirectory());
        if(hospital.getTechnicianDirectory()== null)
           hospital.setTechnicianDirectory(new TechnicianDirectory());
        
        addRolesComboBox();
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
        jTableEmployee = new javax.swing.JTable();
        jButtonCreate = new javax.swing.JButton();
        jTextFieldEmpName = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jButtonView = new javax.swing.JButton();
        jTextFieldEmpID = new javax.swing.JTextField();
        jLabelRole = new javax.swing.JLabel();
        jComboBoxRole = new javax.swing.JComboBox<>();
        jLabelEmpID = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jLabelEmpName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 70, 169));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lab Testing and Technician");

        jButton2.setBackground(new java.awt.Color(0, 70, 169));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee ID", "Employee Name", "Role", "Password"
            }
        ));
        jTableEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmployee);

        jButtonCreate.setText("CREATE");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Password:");

        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });

        jButtonView.setText("VIEW");

        jTextFieldEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmpIDActionPerformed(evt);
            }
        });

        jLabelRole.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRole.setText("Role:");

        jComboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Nurse" }));

        jLabelEmpID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpID.setText("Employee ID:");

        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jLabelEmpName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpName.setText("Employee Name:");

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
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelEmpName)
                                        .addGap(28, 28, 28))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelRole, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabelEmpID, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                                .addComponent(jLabelPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldEmpID, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEmpName)
                                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCreate)
                                    .addComponent(jButtonDelete))
                                .addGap(178, 178, 178)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonView)
                                    .addComponent(jButtonUpdate))))))
                .addContainerGap(216, Short.MAX_VALUE))
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
                    .addComponent(jTextFieldEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmpName)
                            .addComponent(jTextFieldEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCreate)
                            .addComponent(jButtonUpdate))))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonDelete)
                        .addComponent(jButtonView))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelRole)
                        .addComponent(jComboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(167, 167, 167)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(333, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"Sysadmin");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

    private void jTextFieldEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmpIDActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ArrayList<String> user_input = check_empty_field();
        
        if(hospitalManagementEcoSystem.checkIfUserIsUnique(user_input.get(0))){
            
            UserAccountDirectory usersList = hospitalManagementEcoSystem.getUserAccountDirectory();
            if(user_input.get(2) == "Pathologist"){

                userAccount = new UserAccount(user_input.get(0), user_input.get(3), new PathologistRole());
                usersList.addUserAccount(userAccount);
                Pathologist pathologist = new Pathologist();
                pathologist.setPathologistId(user_input.get(0));
                pathologist.setPathologistName(user_input.get(1));                
                pathologistDirectory.addPathologist(user_input.get(0), pathologist);
                hospital.setPathologistDirectory(pathologistDirectory);
                userAccount.setHospital(hospital);
            }
            if(user_input.get(2) == "Radiologist"){

                userAccount = new UserAccount(user_input.get(0), user_input.get(3), new RadiologistRole());
                usersList.addUserAccount(userAccount);
                Radiologist radiologist = new Radiologist();
                radiologist.setRadiologistId(user_input.get(0));
                radiologist.setRadiologistName(user_input.get(1));                
                radiologistDirectory.addRadiologist(user_input.get(0), radiologist);
                hospital.setRadiologistDirectory(radiologistDirectory);
                userAccount.setHospital(hospital);
            }
            if(user_input.get(2) == "Technician"){

                userAccount = new UserAccount(user_input.get(0), user_input.get(3), new TechnicianRole());
                usersList.addUserAccount(userAccount);
                Technician technician = new Technician();
                technician.setTechnicianId(user_input.get(0));
                technician.setTechnicianName(user_input.get(1));                
                technicianDirectory.addTechnician(user_input.get(0), technician);
                hospital.setTechnicianDirectory(technicianDirectory);
                userAccount.setHospital(hospital);
            }
            
            JOptionPane.showMessageDialog(this, "New Employee Information has been added.");
            model.addRow(new Object[]{userAccount,user_input.get(1),user_input.get(2),user_input.get(3)});
            clearFields();
        }
        else{
            JOptionPane.showMessageDialog(this, "This username is not available. Please select a new one.");
        }
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int selected_row_ix = jTableEmployee.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        UserAccount select_account_details = (UserAccount)model.getValueAt(selected_row_ix, 0);        
        UserAccountDirectory = hospitalManagementEcoSystem.getUserAccountDirectory();
        ArrayList<UserAccount> userAccountList = UserAccountDirectory.getUserAccountList();
        for(UserAccount userAccount: userAccountList)
        {
            if(userAccount.getUsername().equals(select_account_details.getUsername()))
            {
                Hospital hospital = userAccount.getHospital();
                ArrayList<String> user_input = check_empty_field();
//                model.setValueAt(user_input.get(1), selected_row_ix, 0);
                model.setValueAt(user_input.get(1), selected_row_ix, 1);
//                model.setValueAt(user_input.get(2), selected_row_ix, 2);
                model.setValueAt(user_input.get(3), selected_row_ix, 3);
                UserAccountDirectory.updateAccount(set_user_input_values(userAccount, user_input));
                break;
            }
        }   
        
//        hospitalManagementEcoSystem.setRestaurantDirectory(restaurantDirectory);
        JOptionPane.showMessageDialog(this, "Values updated");
//        addrecordstotable();
        
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int selected_row_ix = jTableEmployee.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        UserAccount select_user_account_details = (UserAccount)model.getValueAt(selected_row_ix, 0);
        UserAccountDirectory = hospitalManagementEcoSystem.getUserAccountDirectory();
        UserAccountDirectory.deleteAccount(select_user_account_details);
//        ecosystem.setRestaurantDirectory(restaurantDirectory);
        model.removeRow(selected_row_ix);
        addrecordstotable();
        clearFields();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTableEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmployeeMouseClicked
        // TODO add your handling code here:
        jButtonCreate.setEnabled(false);
        jComboBoxRole.setEnabled(false);
        int selected_row_ix = jTableEmployee.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        UserAccount select_user_account_details = (UserAccount)model.getValueAt(selected_row_ix, 0);
        jTextFieldEmpID.setEditable(false);
        jTextFieldEmpID.setText(select_user_account_details.getUsername());
        
        Role role = select_user_account_details.getRole();
        System.out.println("role.toString(): "+role.toString());
        jComboBoxRole.setSelectedItem(role.toString()); 
        
        
        if(role.toString().equals("Radiologist")){
            Hospital hospital = select_user_account_details.getHospital();
            radiologistDirectory = hospital.getRadiologistDirectory();
            HashMap<String, Radiologist> radiologistList = radiologistDirectory.getRadiologistList();
            Radiologist radiologist = radiologistList.get(select_user_account_details.getUsername());
            jTextFieldEmpName.setText(radiologist.getRadiologistName());
        }
        else if(role.toString().equals("Pathologist")){
            Hospital hospital = select_user_account_details.getHospital();
            pathologistDirectory = hospital.getPathologistDirectory();
            HashMap<String, Pathologist> pathologistList = pathologistDirectory.getPathologistList();
            Pathologist pathologist = pathologistList.get(select_user_account_details.getUsername());
            jTextFieldEmpName.setText(pathologist.getPathologistName());
        }
        else if(role.toString().equals("Technician")){
            Hospital hospital = select_user_account_details.getHospital();
            technicianDirectory = hospital.getTechnicianDirectory();
            HashMap<String, Technician> technicianList = technicianDirectory.getTechnicianList();
            Technician technician = technicianList.get(select_user_account_details.getUsername());
            jTextFieldEmpName.setText(technician.getTechnicianName());
        }
        
        
        jTextFieldPassword.setText(select_user_account_details.getPassword());
        
    }//GEN-LAST:event_jTableEmployeeMouseClicked
    private UserAccount set_user_input_values(UserAccount userAccount, ArrayList<String> user_input) {
//        userAccount.getEmployee().setEmployee_id(user_input.get(0));
//        userAccount.getEmployee().setEmployee_name(user_input.get(1));
        userAccount.setPassword(user_input.get(3));
        return userAccount;
    }
    private void clearFields(){
        jTextFieldEmpID.setText("");
        jTextFieldEmpName.setText("");
        jTextFieldPassword.setText("");
        jComboBoxRole.setSelectedItem("");
    }
    
    public ArrayList<String> check_empty_field(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_emp_id = jTextFieldEmpID.getText();
        String user_emp_name = jTextFieldEmpName.getText();
        String user_password = jTextFieldPassword.getText();
        String user_role = (String) jComboBoxRole.getSelectedItem();

        
        if(user_emp_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "User ID can't be left empty.");
        }
        else if(user_emp_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "User Name can't be left empty.");
        }
        else if(user_password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a Password.");
        }
        else if(user_role.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please select a Role.");
        }
        
        user_input.add(user_emp_id);
        user_input.add(user_emp_name);
        user_input.add(user_role);
        user_input.add(user_password);
        
        return user_input;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonView;
    private javax.swing.JComboBox<String> jComboBoxRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEmpID;
    private javax.swing.JLabel jLabelEmpName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelRole;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployee;
    private javax.swing.JTextField jTextFieldEmpID;
    private javax.swing.JTextField jTextFieldEmpName;
    private javax.swing.JTextField jTextFieldPassword;
    // End of variables declaration//GEN-END:variables

    

    private void addRolesComboBox() {
        jComboBoxRole.removeAllItems();
        jComboBoxRole.addItem("");
        jComboBoxRole.addItem("Radiologist");
        jComboBoxRole.addItem("Pathologist");
        jComboBoxRole.addItem("Technician");
    }

    private void addrecordstotable() {
        pathologistDirectory = hospital.getPathologistDirectory();
        radiologistDirectory = hospital.getRadiologistDirectory();
        technicianDirectory = hospital.getTechnicianDirectory();
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        model.setRowCount(0);
//        ArrayList<Accountant> accountantList = accountantDirectory.getAccountantList();
//        for(Accountant accountant: accountantList)
//        {
//            model.addRow(new Object[]{accountant.getUserAccount(),accountant.getUserAccount().getEmployee().getEmployee_name(),"Accountant",accountant.getUserAccount().getPassword()});
//        }
        UserAccountDirectory userAccountDirectory = hospitalManagementEcoSystem.getUserAccountDirectory();
        ArrayList<UserAccount> usersList = userAccountDirectory.getUserAccountList();
//        hospitalDirectory = hospitalManagementEcoSystem.getHospitalDirectory();
        
        model.setRowCount(0);
//        ArrayList<Hospital> hospitalList = hospitalDirectory.getHospitalList();
        for(UserAccount userAccount: usersList)
        {   
            if(userAccount.getRole().toString() == "Radiologist" && userAccount.getHospital().equals(hospital)){
                
                radiologistDirectory = hospital.getRadiologistDirectory();
                HashMap<String, Radiologist> radiologistList = radiologistDirectory.getRadiologistList();
                Radiologist radiologist = radiologistList.get(userAccount.getUsername());
                model.addRow(new Object[]{userAccount,radiologist.getRadiologistName(),userAccount.getRole(),userAccount.getPassword()});
            }
            else if(userAccount.getRole().toString() == "Pathologist" && userAccount.getHospital().equals(hospital)){
                
                pathologistDirectory = hospital.getPathologistDirectory();
                HashMap<String, Pathologist> pathologistList = pathologistDirectory.getPathologistList();
                Pathologist pathologist = pathologistList.get(userAccount.getUsername());
                model.addRow(new Object[]{userAccount,pathologist.getPathologistName(),userAccount.getRole(),userAccount.getPassword()});
            }
            else if(userAccount.getRole().toString() == "Technician" && userAccount.getHospital().equals(hospital)){
                
                technicianDirectory = hospital.getTechnicianDirectory();
                HashMap<String, Technician> technicianList = technicianDirectory.getTechnicianList();
                Technician technician = technicianList.get(userAccount.getUsername());
                model.addRow(new Object[]{userAccount,technician.getTechnicianName(),userAccount.getRole(),userAccount.getPassword()});
            }
        }

        jTableEmployee.setModel(model);
    }
    
    
}
