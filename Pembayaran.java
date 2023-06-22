package restorant;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pembayaran extends javax.swing.JFrame {
    double pajak = 0;
    int total = 0;
    int bayar = 0;
    int bayartf=0;
    int subtotal=0;
    public Pembayaran() {
        initComponents();
        setTime();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PajakTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TotalTF1 = new javax.swing.JTextField();
        TotalTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BayarTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        KembalianTF = new javax.swing.JTextField();
        btnStruk = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        LDate = new javax.swing.JTextField();
        LTime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 0));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "no", "nama", "harga", "jumlah", "total"
            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }
    );
    jTable1.addContainerListener(new java.awt.event.ContainerAdapter() {
        public void componentAdded(java.awt.event.ContainerEvent evt) {
            jTable1ComponentAdded(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jLabel3.setText("Kembalian");

    jLabel4.setText("Pajak 10%");

    PajakTF.setEditable(false);
    PajakTF.setText("0");

    jLabel5.setText("Total");

    TotalTF1.setEditable(false);
    TotalTF1.setText("0");
    TotalTF1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            TotalTF1ActionPerformed(evt);
        }
    });

    TotalTF.setEditable(false);
    TotalTF.setText("0");

    jLabel1.setText("TotalHarga");

    BayarTF.setText("0");
    BayarTF.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            BayarTFActionPerformed(evt);
        }
    });

    jLabel2.setText("Bayar");

    KembalianTF.setEditable(false);
    KembalianTF.setText("0");

    btnStruk.setBackground(new java.awt.Color(0, 204, 0));
    btnStruk.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
    btnStruk.setForeground(new java.awt.Color(255, 255, 255));
    btnStruk.setText("Print Struk");
    btnStruk.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    btnStruk.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnStrukActionPerformed(evt);
        }
    });

    Refresh.setBackground(new java.awt.Color(204, 204, 0));
    Refresh.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
    Refresh.setForeground(new java.awt.Color(255, 255, 255));
    Refresh.setText("Refresh");
    Refresh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    Refresh.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            RefreshActionPerformed(evt);
        }
    });

    textArea.setEditable(false);
    jScrollPane2.setViewportView(textArea);

    jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("Pembayaran");

    LDate.setEditable(false);

    LTime.setEditable(false);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LTime, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LDate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(27, 27, 27)))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TotalTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PajakTF, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TotalTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BayarTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(KembalianTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(432, 432, 432)
                                .addComponent(btnStruk, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel6)))
            .addContainerGap(21, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(LTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(LDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(TotalTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStruk, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PajakTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TotalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BayarTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(KembalianTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))))
            .addGap(17, 17, 17))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BayarTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BayarTFActionPerformed
        Kalk();
    }//GEN-LAST:event_BayarTFActionPerformed

    private void jTable1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable1ComponentAdded
    }//GEN-LAST:event_jTable1ComponentAdded

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        Kalk();
    }//GEN-LAST:event_RefreshActionPerformed

    private void btnStrukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStrukActionPerformed
         if(bayartf<total){
            JOptionPane.showMessageDialog(this, "Pembayaran harus lebih tinggi dari Total Harga");
        }else{
        Kalk();
        Struk();
        Bayar();
             
         }
    }//GEN-LAST:event_btnStrukActionPerformed

    private void TotalTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalTF1ActionPerformed
    }//GEN-LAST:event_TotalTF1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembayaran().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BayarTF;
    private javax.swing.JTextField KembalianTF;
    private javax.swing.JTextField LDate;
    private javax.swing.JTextField LTime;
    private javax.swing.JTextField PajakTF;
    private javax.swing.JButton Refresh;
    private javax.swing.JTextField TotalTF;
    private javax.swing.JTextField TotalTF1;
    private javax.swing.JButton btnStruk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextPane textArea;
    // End of variables declaration//GEN-END:variables
        private void Struk(){
        textArea.setText("\t NAMA WARUNG TBA \n");
        textArea.setText(textArea.getText()+"----------------------------------------------------------------------------------------------------------------------------------------------\n");
        textArea.setText(textArea.getText()+"No\t Nama\t\t Harga \t\t Jumlah \t\t Total\n");
        textArea.setText(textArea.getText()+"----------------------------------------------------------------------------------------------------------------------------------------------\n");
        
        DefaultTableModel dt= (DefaultTableModel) jTable1.getModel();
            for (int i = 0 ; i < jTable1.getRowCount();i++ )
            {
                String no = dt.getValueAt(i,0).toString();
                String nama = dt.getValueAt(i,1).toString();
                String harga = dt.getValueAt(i,2).toString();
                String jumlah = dt.getValueAt(i,3).toString();
                String totalharga = dt.getValueAt(i,4).toString();
                textArea.setText(textArea.getText()+no +"    " +nama+"\t\t" +harga+ "\t\t"+ jumlah +"\t\t"+ totalharga+ "\n");          
            }
        textArea.setText(textArea.getText()+"----------------------------------------------------------------------------------------------------------------------------------------------\n");        
        textArea.setText(textArea.getText()+"\t subtotal\t\t\t\t"+subtotal+"\n");
        textArea.setText(textArea.getText()+"\t total\t\t\t\t"+total+"\n");
        textArea.setText(textArea.getText()+"\t Pembayaran\t\t\t\t"+bayartf+"\n");
        textArea.setText(textArea.getText()+"\t kembalian\t\t\t\t"+bayar+"\n");
        setTime();
        textArea.setText(textArea.getText()+"Tgl.   "+(tf.format(date))+"    "+(df.format(date)));
    }
    private void Kalk(){
        pajak = 0;
        total = 0;
        bayar = 0;
        bayartf = 0;
        subtotal= 0;
                            
        for (int i =0 ; i< jTable1.getRowCount();i++){
            int value = Integer.parseInt(jTable1.getValueAt(i, 4).toString());
            subtotal+= value;
        }
        pajak = subtotal*10/100;
        total = (int) (pajak + subtotal);
        TotalTF1.setText(String.valueOf(subtotal));
        bayartf = Integer.parseInt(BayarTF.getText());
        bayar = bayartf-total;
        PajakTF.setText(String.valueOf(pajak));
        TotalTF.setText(String.valueOf(total));
    }
    private void Bayar(){
                PajakTF.setText(String.valueOf(pajak));
                TotalTF.setText(String.valueOf(total));
                BayarTF.setText(String.valueOf(bayartf));
                KembalianTF.setText(String.valueOf(bayar));   
    
}
    SimpleDateFormat tf;
    SimpleDateFormat df;
    Date date;
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
                    date = new Date();
                    tf = new SimpleDateFormat("hh:mm:");
                    df = new SimpleDateFormat("dd/MM/yyyy");
                    String  time = tf.format(date);
                    LTime.setText(tf.format(date));
                    LDate.setText(df.format(date));
                        }
                    }
    
                }
            ).start();
        }
}
