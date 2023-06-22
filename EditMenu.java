package restorant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditMenu extends javax.swing.JFrame {

    public EditMenu() {
        initComponents();
        UCJenis();
        ShowMenu();
        setTime();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LDate = new javax.swing.JTextField();
        LTime = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        HargaTF = new javax.swing.JTextField();
        NamaMenuTF = new javax.swing.JTextField();
        CBJenis = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MenuTable = new javax.swing.JTable();
        Kembali = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        FilterCB = new javax.swing.JComboBox<>();
        LTime1 = new javax.swing.JTextField();
        LDate1 = new javax.swing.JTextField();

        LDate.setEditable(false);

        LTime.setEditable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        HargaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaTFActionPerformed(evt);
            }
        });

        CBJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBJenisActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama Menu");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jenis");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga");

        btnAdd.setBackground(new java.awt.Color(51, 204, 0));
        btnAdd.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD");
        btnAdd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(51, 51, 255));
        btnEdit.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDel.setBackground(new java.awt.Color(255, 0, 0));
        btnDel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnDel.setForeground(new java.awt.Color(255, 255, 255));
        btnDel.setText("DELETE");
        btnDel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        MenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jenis", "Nama Menu", "Harga"
            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }
    );
    MenuTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            MenuTableMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(MenuTable);

    Kembali.setBackground(new java.awt.Color(204, 204, 0));
    Kembali.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
    Kembali.setForeground(new java.awt.Color(255, 255, 255));
    Kembali.setText("Kembali");
    Kembali.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    Kembali.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            KembaliActionPerformed(evt);
        }
    });

    jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setText("EditMenu");

    FilterCB.setBackground(new java.awt.Color(204, 204, 204));
    FilterCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Paket", "Makanan", "Minuman" }));
    FilterCB.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            FilterCBActionPerformed(evt);
        }
    });

    LTime1.setEditable(false);

    LDate1.setEditable(false);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Kembali, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(HargaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(FilterCB, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(247, 247, 247))
                                    .addComponent(CBJenis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addComponent(NamaMenuTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))))))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(LTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(LDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FilterCB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(CBJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(NamaMenuTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HargaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void HargaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaTFActionPerformed
    }//GEN-LAST:event_HargaTFActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(NamaMenuTF.getText().isEmpty()|HargaTF.getText().isEmpty()
                |CBJenis.getSelectedIndex()== -1){
            JOptionPane.showMessageDialog(this, "Harap Isi Nama/Harga/Jenis Menu dengan benar"
                    , "error", HEIGHT);
        }else{
            AddDataMenu();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void CBJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBJenisActionPerformed
    }//GEN-LAST:event_CBJenisActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        EditDataMenu();
    }//GEN-LAST:event_btnEditActionPerformed

    private void MenuTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuTableMouseClicked
        GetData();
    }//GEN-LAST:event_MenuTableMouseClicked

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
       DeleteDataMenu();
    }//GEN-LAST:event_btnDelActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        dispose();
        Menu menuGUI = new   Menu();
        menuGUI.setTitle("Menu");
        menuGUI.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_KembaliActionPerformed

    private void FilterCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterCBActionPerformed
        Filter();
    }//GEN-LAST:event_FilterCBActionPerformed
        
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EditMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBJenis;
    private javax.swing.JComboBox<String> FilterCB;
    private javax.swing.JTextField HargaTF;
    private javax.swing.JButton Kembali;
    private javax.swing.JTextField LDate;
    private javax.swing.JTextField LDate1;
    private javax.swing.JTextField LTime;
    private javax.swing.JTextField LTime1;
    private javax.swing.JTable MenuTable;
    private javax.swing.JTextField NamaMenuTF;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
public void setTime(){
        new Thread (new Runnable(){
            @Override
            public void run(){
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);   
            }
            Date date = new Date();
            SimpleDateFormat tf = new SimpleDateFormat("hh:mm:ss");
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String  time = tf.format(date);
            LTime1.setText(tf.format(date));
            LDate1.setText(df.format(date));
           
        }
            }
    
        }).start();
                }
    private void showpaket(){
        Connection dbconn = DBConnection.connectDB();
        Statement st = null;
        ResultSet res = null;
        try {
            st = dbconn.createStatement();
            String sql ="select * from (paket)";
            res = st.executeQuery(sql);
            while(res.next()){
                String id = String.valueOf(res.getInt("jenisId"));
                String NamaMenu = res.getString("nama");
                String harga = String.valueOf(res.getInt("harga"));
                
                String tbdData[] ={"paket",NamaMenu,harga};
                    DefaultTableModel tblModel = (DefaultTableModel)MenuTable.getModel();
                    tblModel.addRow(tbdData);
            }
            }catch (SQLException ex) {
            Logger.getLogger(EditMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    private void showminuman(){
        Connection dbconn = DBConnection.connectDB();
        Statement st = null;
        ResultSet res = null;
        try {
            st = dbconn.createStatement();
            String sql ="select * from minuman";
            res = st.executeQuery(sql);
            while(res.next()){
                String id = String.valueOf(res.getInt("jenisid"));
                String NamaMenu = res.getString("nama");
                String harga = String.valueOf(res.getInt("harga"));
                
                String tbdData[] ={"minuman",NamaMenu,harga};
                    DefaultTableModel tblModel = (DefaultTableModel)MenuTable.getModel();
                    tblModel.addRow(tbdData);
            }
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex);
            Logger.getLogger(EditMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    private void showmakanan(){
        Connection dbconn = DBConnection.connectDB();
        Statement st = null;
        ResultSet res = null;
        try {
            st = dbconn.createStatement();
            String sql ="select * from (makanan)";
            res = st.executeQuery(sql);
            while(res.next()){
                String id = String.valueOf(res.getInt("jenisId"));
                String NamaMenu = res.getString("nama");
                String harga = String.valueOf(res.getInt("harga"));
                
                String tbdData[] ={"makanan",NamaMenu,harga};
                    DefaultTableModel tblModel = (DefaultTableModel)MenuTable.getModel();
                    tblModel.addRow(tbdData);
            }
            }catch (SQLException ex) {
            Logger.getLogger(EditMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    private void ShowMenu(){
        ClearTable();
        showmakanan();
        showminuman();
        showpaket();
    }
    
    private void AddDataMenu(){
        AddDataPaket();
        AddDataMinuman();
        AddDataMakanan();
        ShowMenu();
    }
    private void AddDataPaket(){
    if (CBJenis.getSelectedItem().equals("paket")){
            Connection dbconn = DBConnection.connectDB();
            ResultSet res = null;
            Statement st = null;
            try{
                PreparedStatement pst =(PreparedStatement)dbconn.prepareStatement("INSERT INTO paket(jenisid,nama,harga)VALUES(?,?,?) ");
            pst.setInt(1,1);
            pst.setString(2,NamaMenuTF.getText());
            pst.setInt(3, Integer.parseInt(HargaTF.getText()));
            int row =pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Produk telah ditambahkan");
            dbconn.close();
            }catch (SQLException ex) {
        }
        }
    }
    private void AddDataMinuman(){
        if (CBJenis.getSelectedItem().equals("minuman")){
            Connection dbconn = DBConnection.connectDB();
            try{
                PreparedStatement pst =(PreparedStatement)dbconn.prepareStatement("INSERT INTO minuman(jenisid,nama,harga)VALUES(?,?,?) ");
            pst.setInt(1,3);   
            pst.setString(2,NamaMenuTF.getText());
            pst.setInt(3, Integer.parseInt(HargaTF.getText()));
            int row =pst.executeUpdate();
            dbconn.close();
            JOptionPane.showMessageDialog(this, "Produk telah ditambahkan");
            }catch (SQLException ex) {
                
        }
        }
    }
    private void AddDataMakanan(){
        if (CBJenis.getSelectedItem().equals("makanan")){
            Connection dbconn = DBConnection.connectDB();
            try{
            PreparedStatement pst =(PreparedStatement)dbconn.prepareStatement("INSERT INTO makanan(jenisid,nama,harga)VALUES(?,?,?) ");
            pst.setInt(1,2); 
            pst.setString(2,NamaMenuTF.getText());
            pst.setInt(3, Integer.parseInt(HargaTF.getText()));
            int row =pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Produk telah ditambahkan");
            dbconn.close();         
            }catch (SQLException ex) {
        }
        }
    }
    
    private void UCJenis() {
        Connection dbconn = DBConnection.connectDB();
        ResultSet res = null;
         PreparedStatement pst =null;
        try{
            String sql ="select * from jenis";
            pst = dbconn.prepareStatement(sql);
            res = pst.executeQuery();
            
            while(res.next()){
                String paket = res.getString("jenismenu");
                CBJenis.addItem(paket);
                   
            
            }
        }catch (SQLException ex) {
        }
         }    

    private void ClearTable() {
    DefaultTableModel tablemodel= (DefaultTableModel) MenuTable.getModel();
    tablemodel.setRowCount(0);
    }   
    private void GetData(){
        String jenis =null;
    DefaultTableModel tablemodel= (DefaultTableModel) MenuTable.getModel();
    int MyIndex =MenuTable.getSelectedRow();
    jenis = (String) tablemodel.getValueAt(MyIndex, 0).toString();
    NamaMenuTF.setText(tablemodel.getValueAt(MyIndex,1).toString());
    HargaTF.setText(tablemodel.getValueAt(MyIndex,2).toString());
    CBJenis.getModel().setSelectedItem(jenis);
    
    
}

    private void EditDataMenu() {
    EditDataMakanan();    
    EditDataMinuman();
    EditDataPaket();
    ShowMenu();
    }

    private void EditDataMakanan() {
        if (CBJenis.getSelectedItem().equals("makanan")){
            Connection dbconn = DBConnection.connectDB();
            try{
            PreparedStatement pst =(PreparedStatement)dbconn.prepareStatement("update makanan set jenisId= ?,nama=?,harga=?");
            pst.setInt(1,2); 
            pst.setString(2,NamaMenuTF.getText());
            pst.setInt(3, Integer.parseInt(HargaTF.getText()));
            int row =pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Produk Telah Berubah");
            dbconn.close();         
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex);
        }
        }   
      
    }

    private void EditDataMinuman() {
         if (CBJenis.getSelectedItem().equals("minuman")){   
            Connection dbconn = DBConnection.connectDB();
            try{
            PreparedStatement pst =(PreparedStatement)dbconn.prepareStatement("update minuman set jenisId= ?,nama=?,harga=?");
            pst.setInt(1,2); 
            pst.setString(2,NamaMenuTF.getText());
            pst.setInt(3, Integer.parseInt(HargaTF.getText()));
            int row =pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Produk Telah Berubah");
            dbconn.close();         
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex);
        }
    }
    }
    private void EditDataPaket() {
        if (CBJenis.getSelectedItem().equals("paket")){
            Connection dbconn = DBConnection.connectDB();
            try{
            PreparedStatement pst =(PreparedStatement)dbconn.prepareStatement("update paket set jenisId= ?,nama=?,harga=?");
            pst.setInt(1,2); 
            pst.setString(2,NamaMenuTF.getText());
            pst.setInt(3, Integer.parseInt(HargaTF.getText()));
            int row =pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Produk Telah Berubah");
            dbconn.close();         
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex);
        }}
    }

    private void DeleteDataMenu() {
        DDMakan();
        DDMinum();
        DDPaket();
       ShowMenu();
    }

    private void DDMakan() {
    if (CBJenis.getSelectedItem().equals("makanan")){
            Connection dbconn = DBConnection.connectDB();
            try{
            PreparedStatement pst =(PreparedStatement)dbconn.prepareStatement("delete from  makanan where nama=?");
            pst.setString(1,NamaMenuTF.getText());
            int row =pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Produk telah dihapus");
            dbconn.close();         
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex);
        }}
    }

    private void DDMinum() {
       if (CBJenis.getSelectedItem().equals("minuman")){
            Connection dbconn = DBConnection.connectDB();
            try{
            PreparedStatement pst =(PreparedStatement)dbconn.prepareStatement("delete from  minuman where nama=?");
            pst.setString(1,NamaMenuTF.getText());
            int row =pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Produk telah dihapus");
            dbconn.close();         
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex);
        }}
    }

    private void DDPaket() {
        if (CBJenis.getSelectedItem().equals("paket")){
            Connection dbconn = DBConnection.connectDB();
            try{
            PreparedStatement pst =(PreparedStatement)dbconn.prepareStatement("delete from  paket where nama=?");
            pst.setString(1,NamaMenuTF.getText());
            int row =pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Produk telah dihapus");
            dbconn.close();         
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex);
        }}
    }
    private void Filter(){
        ClearTable();
        FillterAll();
        FilterPaket();
        FilterMakanan();
        FilterMinuman();
    }
    private void FillterAll() {
        if (FilterCB.getSelectedItem().equals("All")){
            ShowMenu();
      
      }
    }

    private void FilterPaket() {
       if (FilterCB.getSelectedItem().equals("Paket")){
            showpaket();
        }
    }

    private void FilterMakanan() {
        if (FilterCB.getSelectedItem().equals("Makanan")){
            showmakanan();
    }
    }

    private void FilterMinuman() {
         if (FilterCB.getSelectedItem().equals("Minuman")){
            showminuman();
        } }

        
}
