package restorant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setTime();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LogBodyP = new javax.swing.JPanel();
        UserTF = new javax.swing.JTextField();
        PassL = new javax.swing.JLabel();
        UserL = new javax.swing.JLabel();
        LogBtn = new javax.swing.JButton();
        LogHeadP = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        DaftarBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PassTF = new javax.swing.JPasswordField();
        LDate = new javax.swing.JTextField();
        LTime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LogBodyP.setBackground(new java.awt.Color(255, 255, 255));
        LogBodyP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        LogBodyP.setPreferredSize(new java.awt.Dimension(600, 400));

        UserTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTFActionPerformed(evt);
            }
        });

        PassL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        PassL.setForeground(new java.awt.Color(51, 51, 51));
        PassL.setText("Password");

        UserL.setBackground(new java.awt.Color(0, 204, 51));
        UserL.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        UserL.setForeground(new java.awt.Color(51, 51, 51));
        UserL.setText("Username");

        LogBtn.setBackground(new java.awt.Color(0, 204, 0));
        LogBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LogBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogBtn.setText("Login");
        LogBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogBtnActionPerformed(evt);
            }
        });

        LogHeadP.setBackground(new java.awt.Color(255, 153, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login");

        DaftarBtn.setBackground(new java.awt.Color(0, 204, 0));
        DaftarBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        DaftarBtn.setForeground(new java.awt.Color(255, 255, 255));
        DaftarBtn.setText("Daftar");
        DaftarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setText("Pegawai baru/Daftar akun baru?");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("\" Nikmatilah setiap pekerjaan");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("yang kamu dapatkan,");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("karena tidak semua orang");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("memperoleh kesempatan");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("yang sama. \"");

        javax.swing.GroupLayout LogHeadPLayout = new javax.swing.GroupLayout(LogHeadP);
        LogHeadP.setLayout(LogHeadPLayout);
        LogHeadPLayout.setHorizontalGroup(
            LogHeadPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogHeadPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LogHeadPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogHeadPLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(LogHeadPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogHeadPLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogHeadPLayout.createSequentialGroup()
                                .addComponent(DaftarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87))))
                    .addGroup(LogHeadPLayout.createSequentialGroup()
                        .addGroup(LogHeadPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LogHeadPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LogHeadPLayout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addGroup(LogHeadPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 23, Short.MAX_VALUE))))
        );
        LogHeadPLayout.setVerticalGroup(
            LogHeadPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogHeadPLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(89, 89, 89)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DaftarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        PassTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassTFActionPerformed(evt);
            }
        });

        LDate.setEditable(false);

        LTime.setEditable(false);
        LTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LogBodyPLayout = new javax.swing.GroupLayout(LogBodyP);
        LogBodyP.setLayout(LogBodyPLayout);
        LogBodyPLayout.setHorizontalGroup(
            LogBodyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogBodyPLayout.createSequentialGroup()
                .addComponent(LogHeadP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(LogBodyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogBodyPLayout.createSequentialGroup()
                        .addComponent(LTime, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogBodyPLayout.createSequentialGroup()
                        .addComponent(LDate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogBodyPLayout.createSequentialGroup()
                        .addGroup(LogBodyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PassTF, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(UserTF))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogBodyPLayout.createSequentialGroup()
                        .addComponent(PassL)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogBodyPLayout.createSequentialGroup()
                        .addComponent(UserL)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogBodyPLayout.createSequentialGroup()
                        .addComponent(LogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
        );
        LogBodyPLayout.setVerticalGroup(
            LogBodyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogBodyPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(UserL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PassL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PassTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(LogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(LogHeadP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogBodyP, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LogBodyP, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PassTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassTFActionPerformed
    }//GEN-LAST:event_PassTFActionPerformed

    private void LogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogBtnActionPerformed
        UserLogin();
    }//GEN-LAST:event_LogBtnActionPerformed

    private void DaftarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarBtnActionPerformed
        SwitchClassDaftar();
    }//GEN-LAST:event_DaftarBtnActionPerformed

    private void UserTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTFActionPerformed
    }//GEN-LAST:event_UserTFActionPerformed

    private void LTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LTimeActionPerformed
    }//GEN-LAST:event_LTimeActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DaftarBtn;
    private javax.swing.JTextField LDate;
    private javax.swing.JTextField LTime;
    private javax.swing.JPanel LogBodyP;
    private javax.swing.JButton LogBtn;
    private javax.swing.JPanel LogHeadP;
    private javax.swing.JLabel PassL;
    private javax.swing.JPasswordField PassTF;
    private javax.swing.JLabel UserL;
    private javax.swing.JTextField UserTF;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
    public void setTime(){
        new Thread (new Runnable(){
            @Override
            public void run(){
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName())
                        .log(Level.SEVERE, null, ex);   
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
    private void UserLogin(){
        String username = UserTF.getText();
        String password = String.valueOf(PassTF.getPassword());
        if(username.isEmpty()| password.isEmpty()){
        JOptionPane.showMessageDialog(this,
                "Username/Password harus di isi","Error",
                JOptionPane.ERROR_MESSAGE);
        }else {
        VerifikasiUser(username,password);
        }
    }
    private void VerifikasiUser(String username, String password) {
        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){
            
        
        try{
            PreparedStatement st =(PreparedStatement)dbconn.prepareStatement(
                    "select * from users WHERE username = ? "
                            + "AND password = ?");
            st.setString(1,username);
            st.setString(2,password);
            ResultSet res = st.executeQuery();
            if(res.next()){
                SwitchClassMenu();
            }else JOptionPane.showMessageDialog(this,
                    "Username/Password Salah","Error",
                    JOptionPane.ERROR_MESSAGE);
                }catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log
        (Level.SEVERE,null,ex);
                }
        
            }else{
            System.out.println("The Connection not available");
        }
    }
    private void SwitchClassDaftar(){
        dispose();
        Register l = new   Register();
        l.setTitle("Register");
        l.setVisible(true);       
    }
    private void SwitchClassMenu(){
    dispose();
            Menu m = new Menu();
            m.setTitle("Menu");
            m.setVisible( true);
    }
}
