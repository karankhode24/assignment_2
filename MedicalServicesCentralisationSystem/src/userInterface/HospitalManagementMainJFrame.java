/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import HospitalManagement.HospitalManagementEnterprise;
import HospitalManagement.HospitalManagementEcoSystem;

import userInterface.HospitalAdminWorkArea.HospitalAdminWorkAreaJPanel;
import HospitalManagement.Hospital.Hospital;
import HospitalManagement.Patient.PatientDirectory;
import HospitalManagement.Technician.TechnicianDirectory;
import HospitalManagement.Radiologist.RadiologistDirectory;
import HospitalManagement.Pathologist.PathologistDirectory;
import HospitalManagement.Doctor.DoctorDirectory;
import HospitalManagement.Nurse.NurseDirectory;
import HospitalManagement.FrontDeskOperator.FrontDeskOperatorDirectory;

import HospitalManagement.UserAccount.UserAccount;
import HospitalManagement.UserAccount.UserAccountDirectory;

import HospitalManagement.DB4OUtil.HospitalManagementDB4OUtil;
import HospitalManagement.Hospital.HospitalDirectory;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import userInterface.MedTechnicalWorkArea.MedTechnicalWorkAreaJPanel;
import userInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

public class HospitalManagementMainJFrame extends javax.swing.JFrame {

    /** 
     * Creates new form HospitalManagementMainJFrame
     */
    private HospitalManagementEcoSystem hospitalManagementEcoSystem;
    public HospitalManagementDB4OUtil dB4OUtil = HospitalManagementDB4OUtil.getInstance();
    UserAccount userAccount;

    public HospitalManagementMainJFrame() {
        initComponents();
        hospitalManagementEcoSystem = dB4OUtil.retrieveSystem();
        if(hospitalManagementEcoSystem == null)
        {
//            hospitalManagementEcoSystem = new HospitalManagementEcoSystem(new PatientDirectory(),new TechnicianDirectory(),new RadiologistDirectory(),new PathologistDirectory(), new DoctorDirectory(), new NurseDirectory(), new FrontDeskOperatorDirectory());
            hospitalManagementEcoSystem = new HospitalManagementEcoSystem(new HospitalDirectory());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanelLogin = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        loginJOpenChatWindow = new javax.swing.JButton();
        jPanelWorkArea = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setPreferredSize(new java.awt.Dimension(1381, 1080));

        jPanelLogin.setBackground(new java.awt.Color(0, 70, 169));
        jPanelLogin.setPreferredSize(new java.awt.Dimension(200, 1080));

        loginJButton.setBackground(new java.awt.Color(0, 70, 169));
        loginJButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginJButton.setForeground(new java.awt.Color(255, 255, 255));
        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        logoutJButton.setBackground(new java.awt.Color(0, 70, 169));
        logoutJButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logoutJButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        loginJOpenChatWindow.setBackground(new java.awt.Color(0, 70, 169));
        loginJOpenChatWindow.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginJOpenChatWindow.setForeground(new java.awt.Color(255, 255, 255));
        loginJOpenChatWindow.setText("Chat with us");
        loginJOpenChatWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJOpenChatWindowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(logoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                                        .addGap(180, 180, 180)
                                        .addComponent(loginJLabel))
                                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(loginJOpenChatWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutJButton)
                .addGap(190, 190, 190)
                .addComponent(loginJLabel)
                .addGap(44, 44, 44)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginJButton)
                .addGap(253, 253, 253)
                .addComponent(loginJOpenChatWindow)
                .addContainerGap(494, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanelLogin);

        jPanelWorkArea.setPreferredSize(new java.awt.Dimension(1181, 1080));
        jPanelWorkArea.setLayout(new java.awt.CardLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/MainJFrameWallpaper.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(1181, 1080));
        jPanelWorkArea.add(jLabel3, "card2");

        jSplitPane1.setRightComponent(jPanelWorkArea);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
        String username = userNameJTextField.getText();
        String password = passwordField.getText();
        UserAccountDirectory userDirectory = hospitalManagementEcoSystem.getUserAccountDirectory();
        if(userDirectory.authenticateUserLogin(username, password))
        {
            ArrayList<UserAccount> usersList = userDirectory.getUserAccountList();

            userAccount = userDirectory.authenticateUser(username, password);
            logoutJButton.setEnabled(true); 
            userNameJTextField.setEnabled(false);
            passwordField.setEnabled(false);
            loginJButton.setEnabled(false);
//            System.out.println("userAccount.getEmployee().getRole().toString(): "+userAccount.getEmployee().getRole().toString());
//            if(userAccount.getEmployee().getRole().toString().equals("HospitalManagement.Role.SystemAdminRole"))
            if(userAccount.getRole().toString().equals("HospitalManagement.Role.SystemAdminRole"))
            {
                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel = new SystemAdminWorkAreaJPanel(jPanelWorkArea, hospitalManagementEcoSystem);
                jPanelWorkArea.add("Sysadmin",systemAdminWorkAreaJPanel);
                CardLayout crdLyt = (CardLayout) jPanelWorkArea.getLayout();
                crdLyt.next(jPanelWorkArea);
            }
            
            else if(userAccount.getRole().toString().equals("HospitalAdmin"))
            {
                Hospital hospital = userAccount.getHospital();
                HospitalAdminWorkAreaJPanel hospitalAdminWorkAreaJPanel = new HospitalAdminWorkAreaJPanel(jPanelWorkArea, hospitalManagementEcoSystem, hospital);
                jPanelWorkArea.add("hospitalAdminWorkAreaJPanel",hospitalAdminWorkAreaJPanel);
                CardLayout crdLyt = (CardLayout) jPanelWorkArea.getLayout();
                crdLyt.next(jPanelWorkArea);
            }
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid credentials");
        }
      
       
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);

        userNameJTextField.setText("");
        passwordField.setText("");

        jPanelWorkArea.removeAll();
        JPanel blankJP = new JPanel();
        jPanelWorkArea.add("blank", blankJP);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/MainJFrameWallpaper.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(1181, 1080));
        jPanelWorkArea.add(jLabel3, "blank");
        CardLayout crdLyt = (CardLayout) jPanelWorkArea.getLayout();
        crdLyt.next(jPanelWorkArea);
        
        dB4OUtil.storeSystem(hospitalManagementEcoSystem);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void loginJOpenChatWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJOpenChatWindowActionPerformed
        // TODO add your handling code here:
        JTextArea chatarea = new JTextArea();
        JTextField chatbox = new JTextField();
        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jframe.setVisible(true);
        jframe.setResizable(false);
        jframe.setLayout(null);
        jframe.setSize(600, 600);
        jframe.setTitle("Alfred");
        jframe.add(chatarea);
        jframe.add(chatbox);
        
        //For chat area
        chatarea.setSize(500, 400);
        chatarea.setLocation(2,2);
        
        // for input area
        chatbox.setSize(540,30);
        chatbox.setLocation(2,500);
        
        chatbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean chat_end = false;
                String gtext = chatbox.getText().toLowerCase();
                chatarea.append("YOU -> "+gtext+"\n");
                chatbox.setText("");
                if(gtext.contains("hi")){
                    bot("hi how can I help you?",chatarea);
                }
                else if(gtext.contains("i want to order food.")){
                    bot("Please enter your zipcode.",chatarea);
                }
                else if(gtext.contains("02215")){
                    bot("Showing you restaurants.....",chatarea);
                    try {
//                        UserAccountDirectory userDirectory = ecosystem.getUserAccountDirectory();
//                        ua = userDirectory.authenticateUser("custuser", "pass");
//                        CustomerRestaurantOrder ca = new CustomerRestaurantOrder(jPanelWorkArea, ua,ecosystem,"02215");
//                        jPanelWorkArea.add("Customer",ca);
                        CardLayout crdLyt = (CardLayout) jPanelWorkArea.getLayout();
                        TimeUnit.SECONDS.sleep(3);
                        crdLyt.next(jPanelWorkArea);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(HospitalManagementMainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                
                
            }
   
        });
        
    }//GEN-LAST:event_loginJOpenChatWindowActionPerformed
    private void bot(String bot_resp, JTextArea chatarea){
        chatarea.append("BOT ->"+bot_resp+"\n");
    }
    
    
    /**
     * 
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
            java.util.logging.Logger.getLogger(HospitalManagementMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalManagementMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalManagementMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalManagementMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalManagementMainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelWorkArea;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton loginJOpenChatWindow;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
