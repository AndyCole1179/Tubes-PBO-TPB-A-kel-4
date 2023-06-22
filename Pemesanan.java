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
import javax.swing.table.TableModel;

public class Pemesanan extends javax.swing.JFrame {
    public Pemesanan() {
        initComponents();
        ShowMenu();
        setTime();        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LJenis = new javax.swing.JLabel();
        Spin = new javax.swing.JSpinner();
        btnKembaliPemesanan = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnPesan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MenuTable = new javax.swing.JTable();
        NamaMenuTF = new javax.swing.JTextField();
        HargaTF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        PesananTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TotTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LDate = new javax.swing.JTextField();
        LTime = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(653, 850));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        LJenis.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        btnKembaliPemesanan.setBackground(new java.awt.Color(204, 204, 0));
        btnKembaliPemesanan.setForeground(new java.awt.Color(255, 255, 255));
        btnKembaliPemesanan.setText("KEMBALI");
        btnKembaliPemesanan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnKembaliPemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliPemesananActionPerformed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(51, 204, 0));
        btnTambah.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnPesan.setBackground(new java.awt.Color(0, 204, 0));
        btnPesan.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnPesan.setForeground(new java.awt.Color(255, 255, 255));
        btnPesan.setText("Pesan");
        btnPesan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesanActionPerformed(evt);
            }
        });

        MenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Jenis", "Nama", "Harga"
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

    NamaMenuTF.setEditable(false);
    NamaMenuTF.setBackground(new java.awt.Color(102, 204, 255));
    NamaMenuTF.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            NamaMenuTFActionPerformed(evt);
        }
    });

    HargaTF.setEditable(false);
    HargaTF.setBackground(new java.awt.Color(102, 204, 255));
    HargaTF.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            HargaTFActionPerformed(evt);
        }
    });

    PesananTable.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "no", "Nama", "Harga", "Jumlah", "Total"
        }
    ){
        public boolean isCellEditable(int row, int column){
            return false;
        }
    }
    );
    jScrollPane2.setViewportView(PesananTable);

    jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
    jLabel2.setText("Pesanan");

    TotTF.setText("Total");

    jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
    jLabel3.setText("Menu");

    btnDelete.setBackground(new java.awt.Color(255, 0, 0));
    btnDelete.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
    btnDelete.setForeground(new java.awt.Color(255, 255, 255));
    btnDelete.setText("Hapus");
    btnDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    btnDelete.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnDeleteActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(263, 263, 263)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(523, 523, 523)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NamaMenuTF, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(HargaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnKembaliPemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(64, 64, 64)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TotTF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(LJenis)
                            .addGap(47, 47, 47)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(607, 607, 607)))
            .addGap(470, 470, 470))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap(90, Short.MAX_VALUE)
            .addComponent(LJenis)
            .addGap(483, 483, 483))
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jLabel3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGap(11, 11, 11)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(NamaMenuTF, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(HargaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(Spin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(34, 34, 34)
                    .addComponent(btnKembaliPemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(TotTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("PEMESANAN");

    jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    jLabel5.setText("Pemesanan");

    LDate.setEditable(false);

    LTime.setEditable(false);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(4, 4, 4)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(LTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(LDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(143, 143, 143)
            .addComponent(jLabel1)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliPemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliPemesananActionPerformed
        MenuGui();
    }//GEN-LAST:event_btnKembaliPemesananActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        Pesanan();
        PesananTable.selectAll();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesanActionPerformed
        ExportTable();
    }//GEN-LAST:event_btnPesanActionPerformed

    private void NamaMenuTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaMenuTFActionPerformed
    }//GEN-LAST:event_NamaMenuTFActionPerformed

    private void HargaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaTFActionPerformed
    }//GEN-LAST:event_HargaTFActionPerformed

    private void MenuTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuTableMouseClicked
        GetData();
    }//GEN-LAST:event_MenuTableMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        HapusMenu();
        UpdateNo();
        PesananTable.selectAll();
    }//GEN-LAST:event_btnDeleteActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pemesanan().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HargaTF;
    private javax.swing.JTextField LDate;
    private javax.swing.JLabel LJenis;
    private javax.swing.JTextField LTime;
    public javax.swing.JTable MenuTable;
    private javax.swing.JTextField NamaMenuTF;
    public javax.swing.JTable PesananTable;
    private javax.swing.JSpinner Spin;
    private javax.swing.JTextField TotTF;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnKembaliPemesanan;
    private javax.swing.JButton btnPesan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
 
    private void GetData(){
    //String jenis =null;
    DefaultTableModel tablemodel= (DefaultTableModel) MenuTable.getModel();
    int MyIndex =MenuTable.getSelectedRow();
    //jenis = (String) tablemodel.getValueAt(MyIndex, 0).toString();
    NamaMenuTF.setText(tablemodel.getValueAt(MyIndex,1).toString());
    HargaTF.setText(tablemodel.getValueAt(MyIndex,2).toString());
    
    
    }
    private void ShowMenu(){
        ClearTable();
        showmakanan();
        showminuman();
        showpaket();
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
        private void ClearTable() {
    DefaultTableModel tablemodel= (DefaultTableModel) MenuTable.getModel();
    tablemodel.setRowCount(0);
    } 
        int TotalHarga;
    private void Pesanan(){
        int SpinnerValue = (Integer)Spin.getValue();
        if(NamaMenuTF.getText().isEmpty()|NamaMenuTF.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Masukan Data Dengan Benar");
            
        }
        else if(SpinnerValue < 1){
            JOptionPane.showMessageDialog(this,"Jumlah menu tidak bolehkurang dari 1");
        }
        else{
    int Total = Integer.valueOf(HargaTF.getText())* (Integer)Spin.getValue();
    TotalHarga= TotalHarga+Total;
    DefaultTableModel tblModel = (DefaultTableModel)PesananTable.getModel();
    String nextRowID =Integer.toString(tblModel.getRowCount());
    tblModel.addRow(new Object[]{
       Integer.parseInt(nextRowID)+1,
       NamaMenuTF.getText(),
       HargaTF.getText(),
       Spin.getValue(),
       Total
    });
    TotTF.setText(""+TotalHarga);
        }
}
     private void UpdateNo() {
         try{
             int i = 0;
             int a = 0;
             int count = 1;
            for (int row = 0; row < PesananTable.getRowCount(); row++) {
            PesananTable.setValueAt(count++, row, PesananTable.getColumn("no").getModelIndex());
        }
            
         }catch(Exception x){
             
         }
    }
    public void DetailPesanan(){
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

    private void ExportTable() {
        TableModel model1 = PesananTable.getModel();
        int indexs[] = PesananTable.getSelectedRows();
        PesananTable.selectAll();
        
        Object[] row = new Object[5];
        
        Pembayaran bayar = new Pembayaran();
        DefaultTableModel model2 = (DefaultTableModel)bayar.jTable1.getModel();
        String nextRowID =Integer.toString(model2.getRowCount());
        
        for(int i = 0; i< indexs.length;i++)
        {
            row[0] = model1.getValueAt(Integer.parseInt(nextRowID)+1, 0);
            row[1] = model1.getValueAt(indexs[i], 1);
            row[2] = model1.getValueAt(indexs[i], 2);
            row[3] = model1.getValueAt(indexs[i], 3);
            row[4] = model1.getValueAt(indexs[i], 4);
            model2.addRow(row);
        }
        
        dispose();
        bayar.setTitle("Register");
        bayar.setVisible(true);
    }
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
            SimpleDateFormat tf = new SimpleDateFormat("hh:mm");
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String  time = tf.format(date);
            LTime.setText(tf.format(date));
            LDate.setText(df.format(date));
           
        }
            }
    
        }).start();
                }

    private void HapusMenu() {
        TableModel model1 = PesananTable.getModel();
        int indexs[] = PesananTable.getSelectedRows();
        
        Object[] row = new Object[5];
        
        Pembayaran bayar = new Pembayaran();
        DefaultTableModel model2 = (DefaultTableModel)PesananTable.getModel();
        String nextRowID =Integer.toString(PesananTable.getRowCount());
        
        for(int i = 0; i < indexs.length;i++)
        {
            row[0] = model1.getValueAt(indexs[i], 0);
            row[1] = model1.getValueAt(indexs[i], 1);
            row[2] = model1.getValueAt(indexs[i], 2);
            row[3] = model1.getValueAt(indexs[i], 3);
            row[4] = model1.getValueAt(indexs[i], 4);
            model2.removeRow(PesananTable.getSelectedRow());
        }
    }

    private void MenuGui() {
        dispose();
        Menu menuGUI = new   Menu();
        menuGUI.setTitle("Menu");
        menuGUI.setVisible(true);    
    }
   
}
   
  

