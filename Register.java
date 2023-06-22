package restorant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
        setTime();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LDate1 = new javax.swing.JTextField();
        LTime1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        LogBodyP = new javax.swing.JPanel();
        NamaTF = new javax.swing.JTextField();
        PassL = new javax.swing.JLabel();
        NamaL = new javax.swing.JLabel();
        RegBtn = new javax.swing.JButton();
        LogHeadP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PassTF = new javax.swing.JPasswordField();
        UserTF = new javax.swing.JTextField();
        UserL = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        LDate = new javax.swing.JTextField();
        LTime = new javax.swing.JTextField();

        LDate1.setEditable(false);

        LTime1.setEditable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LogBodyP.setBackground(new java.awt.Color(255, 255, 255));
        LogBodyP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        LogBodyP.setPreferredSize(new java.awt.Dimension(600, 400));

        NamaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaTFActionPerformed(evt);
            }
        });

        PassL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        PassL.setText("Password");

        NamaL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        NamaL.setText("Nama");

        RegBtn.setBackground(new java.awt.Color(0, 204, 0));
        RegBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        RegBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegBtn.setText("Daftar");
        RegBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        RegBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegBtnActionPerformed(evt);
            }
        });

        LogHeadP.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Daftar");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("\" Cara terbaik");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("untuk");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("mengetahui");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("masa depan");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("adalah dengan");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("menciptakannya. \"");

        javax.swing.GroupLayout LogHeadPLayout = new javax.swing.GroupLayout(LogHeadP);
        LogHeadP.setLayout(LogHeadPLayout);
        LogHeadPLayout.setHorizontalGroup(
            LogHeadPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogHeadPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogHeadPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LogHeadPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(LogHeadPLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(LogHeadPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addGap(72, 72, 72))
        );
        LogHeadPLayout.setVerticalGroup(
            LogHeadPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogHeadPLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PassTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassTFActionPerformed(evt);
            }
        });

        UserTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTFActionPerformed(evt);
            }
        });

        UserL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        UserL.setText("Username");

        BackBtn.setBackground(new java.awt.Color(204, 204, 0));
        BackBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("Kembali");
        BackBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        LDate.setEditable(false);

        LTime.setEditable(false);

        javax.swing.GroupLayout LogBodyPLayout = new javax.swing.GroupLayout(LogBodyP);
        LogBodyP.setLayout(LogBodyPLayout);
        LogBodyPLayout.setHorizontalGroup(
            LogBodyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogBodyPLayout.createSequentialGroup()
                .addComponent(LogHeadP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(LogBodyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogBodyPLayout.createSequentialGroup()
                        .addGroup(LogBodyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogBodyPLayout.createSequentialGroup()
                                .addComponent(PassL)
                                .addGap(80, 80, 80))
                            .addGroup(LogBodyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(LogBodyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogBodyPLayout.createSequentialGroup()
                                        .addComponent(NamaL)
                                        .addGap(98, 98, 98))
                                    .addComponent(UserTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NamaTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PassTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogBodyPLayout.createSequentialGroup()
                                    .addComponent(UserL)
                                    .addGap(80, 80, 80))
                                .addGroup(LogBodyPLayout.createSequentialGroup()
                                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60)
                                    .addComponent(RegBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogBodyPLayout.createSequentialGroup()
                        .addGroup(LogBodyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LTime, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LDate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        LogBodyPLayout.setVerticalGroup(
            LogBodyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogBodyPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(NamaL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NamaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UserL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PassL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LogBodyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
            .addComponent(LogHeadP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogBodyP, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogBodyP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NamaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaTFActionPerformed

    private void RegBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegBtnActionPerformed
        UserRegis();

    }//GEN-LAST:event_RegBtnActionPerformed

    private void PassTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassTFActionPerformed
    }//GEN-LAST:event_PassTFActionPerformed

    private void UserTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTFActionPerformed
    }//GEN-LAST:event_UserTFActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        SwitchClassLogin();
    }//GEN-LAST:event_BackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField LDate;
    private javax.swing.JTextField LDate1;
    private javax.swing.JTextField LTime;
    private javax.swing.JTextField LTime1;
    private javax.swing.JPanel LogBodyP;
    private javax.swing.JPanel LogHeadP;
    private javax.swing.JLabel NamaL;
    private javax.swing.JTextField NamaTF;
    private javax.swing.JLabel PassL;
    private javax.swing.JPasswordField PassTF;
    private javax.swing.JButton RegBtn;
    private javax.swing.JLabel UserL;
    private javax.swing.JTextField UserTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
     private void UserRegis() {
    String nama = NamaTF.getText();
        String username = UserTF.getText();
        String password = String.valueOf(PassTF.getPassword());
        if(username.isEmpty()| password.isEmpty() |nama.isEmpty()){
            JOptionPane.showMessageDialog(this,
                    "Username/Password harus di isi",
                    "Error",JOptionPane.ERROR_MESSAGE);
        }else {
            AddUser(nama,username,password);
        }    
    }

    private void AddUser(String nama, String username, String password) { 
        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){
        try{
            PreparedStatement st =(PreparedStatement)dbconn.prepareStatement(
                    "INSERT INTO users(nama,username,password) "
                            + "VALUES(?,?,?)");
            st.setString(1,nama);
            st.setString(2,username);
            st.setString(3,password);
            int res = st.executeUpdate();
            JOptionPane.showMessageDialog(this,
                    "User telah dibuat","Success",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log
        (Level.SEVERE,null,ex);
        }
        
    }else{
            System.out.println("The Connection not available");
        }
    }
    public void setTime(){
        new Thread (new Runnable(){
            @Override
            public void run(){
        while(true){
            try {
                Thread.sleep(100);
                } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName()).log
        (Level.SEVERE, null, ex);   
                    }
            Date date = new Date();
            SimpleDateFormat tf = new SimpleDateFormat("hh:mm");
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String  time = tf.format(date);
            LTime.setText(tf.format(date));
            LDate.setText(df.format(date));
                }
            }
        }).start();
                }
    public void SwitchClassLogin(){
        dispose();
        Login r = new   Login();
        r.setTitle("Login");
        r.setVisible(true);
    }
}
