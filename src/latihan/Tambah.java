/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package latihan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fatiq
 */
public class Tambah extends javax.swing.JDialog {

    /**
     * Creates new form Tambah
     */
    private final String url = "jdbc:postgresql://localhost:5432/PBO";
    private final String user = "postgres";
    private final String pass = "5127";
    private Connection conn = null;
    private Santri sn = new Santri();
    
    public Tambah(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        initComponents();
        conn = DriverManager.getConnection(url,user,pass);
        generateNomer();
    }
    
    public Tambah(java.awt.Frame parent, boolean modal, Santri hsn) throws SQLException {
        super(parent, modal);
        initComponents();
        conn = DriverManager.getConnection(url,user,pass);
        lb_judul.setText("Perbarui Data Santri");
        setData(hsn);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lb_judul = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_tlp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbx_jk = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tf_alamat = new javax.swing.JTextField();
        btn_hapus = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JPanel();
        lb_simpan = new javax.swing.JLabel();
        sp_usia = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        lb_judul.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_judul.setForeground(new java.awt.Color(255, 255, 255));
        lb_judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_judul.setText("Tambah Data Santri");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_judul, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_judul, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        tf_id.setEditable(false);
        tf_id.setBackground(new java.awt.Color(204, 204, 204));
        tf_id.setForeground(new java.awt.Color(102, 102, 102));
        tf_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        tf_nama.setBackground(new java.awt.Color(255, 255, 255));
        tf_nama.setForeground(new java.awt.Color(0, 0, 0));
        tf_nama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(tf_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 350, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NAMA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("JK");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NOMOR TLP");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        tf_tlp.setBackground(new java.awt.Color(255, 255, 255));
        tf_tlp.setForeground(new java.awt.Color(0, 0, 0));
        tf_tlp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(tf_tlp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 260, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("USIA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        cbx_jk.setBackground(new java.awt.Color(255, 255, 255));
        cbx_jk.setForeground(new java.awt.Color(0, 0, 0));
        cbx_jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "L", "P" }));
        jPanel1.add(cbx_jk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ALAMAT");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        tf_alamat.setBackground(new java.awt.Color(255, 255, 255));
        tf_alamat.setForeground(new java.awt.Color(0, 0, 0));
        tf_alamat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(tf_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 450, -1));

        btn_hapus.setBackground(new java.awt.Color(255, 0, 0));
        btn_hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapusMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("BATAL");

        javax.swing.GroupLayout btn_hapusLayout = new javax.swing.GroupLayout(btn_hapus);
        btn_hapus.setLayout(btn_hapusLayout);
        btn_hapusLayout.setHorizontalGroup(
            btn_hapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(btn_hapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );
        btn_hapusLayout.setVerticalGroup(
            btn_hapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
            .addGroup(btn_hapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_hapusLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel1.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, 30));

        btn_simpan.setBackground(new java.awt.Color(0, 0, 255));
        btn_simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_simpanMouseClicked(evt);
            }
        });

        lb_simpan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_simpan.setForeground(new java.awt.Color(255, 255, 255));
        lb_simpan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_simpan.setText("SIMPAN");

        javax.swing.GroupLayout btn_simpanLayout = new javax.swing.GroupLayout(btn_simpan);
        btn_simpan.setLayout(btn_simpanLayout);
        btn_simpanLayout.setHorizontalGroup(
            btn_simpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_simpan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btn_simpanLayout.setVerticalGroup(
            btn_simpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_simpanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, 30));
        jPanel1.add(sp_usia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseClicked
        setSn();
        if(lb_judul.getText().equals("Perbarui Data Santri")){
            perbarui();
        } else {
            tambah();
        }
        dispose();
    }//GEN-LAST:event_btn_simpanMouseClicked

    private void btn_hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseClicked
        dispose();
    }//GEN-LAST:event_btn_hapusMouseClicked

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
            java.util.logging.Logger.getLogger(Tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tambah dialog = null;
                try {
                    dialog = new Tambah(new javax.swing.JFrame(), true);
                } catch (SQLException ex) {
                    Logger.getLogger(Tambah.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_hapus;
    private javax.swing.JPanel btn_simpan;
    private javax.swing.JComboBox<String> cbx_jk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_judul;
    private javax.swing.JLabel lb_simpan;
    private javax.swing.JSpinner sp_usia;
    private javax.swing.JTextField tf_alamat;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JTextField tf_tlp;
    // End of variables declaration//GEN-END:variables

    private void setSn(){
        this.sn.setId(tf_id.getText());
        this.sn.setNama(tf_nama.getText());
        this.sn.setAlamat(tf_alamat.getText());
        this.sn.setTlp(tf_tlp.getText());
        this.sn.setJk(cbx_jk.getSelectedItem().toString());
        this.sn.setUsia(Integer.parseInt(sp_usia.getValue().toString()));
    }
    
    private void tambah(){
        String query = "INSERT INTO santri "
                + "(id_santri,nama,jenis_kelamin,alamat,usia,no_tlp) "
                + "values (?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement(query);
            
            stmt.setString(1, sn.getId());
            stmt.setString(2, sn.getNama());
            stmt.setString(3, sn.getJk());
            stmt.setString(4, sn.getAlamat());
            stmt.setInt(5, sn.getUsia());
            stmt.setString(6, sn.getTlp());
              
            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    private void perbarui(){
        String query = "UPDATE santri SET nama = ?, jenis_kelamin = ?, "
                + "alamat = ?, usia = ?, no_tlp = ? WHERE id_santri = ?";
        try{
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement(query);
            
            stmt.setString(6, sn.getId());
            stmt.setString(1, sn.getNama());
            stmt.setString(2, sn.getJk());
            stmt.setString(3, sn.getAlamat());
            stmt.setInt(4, sn.getUsia());
            stmt.setString(5, sn.getTlp());
              
            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    private void generateNomer(){
        PreparedStatement st = null;
        ResultSet rs = null;
        String query = "SELECT id_santri AS nomor FROM santri ORDER BY id_santri DESC LIMIT 1";
        String urutan = null;
        
        try{
            st = conn.prepareStatement(query);
            rs = st.executeQuery();
            if(rs.next()){
                int nomor = Integer.parseInt(rs.getString("nomor"));
                nomor++;
                urutan = String.format("%04d", nomor);
            } else {
                urutan = "0001";
            }
            tf_id.setText(urutan);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    private void setData(Santri hsn){
        tf_id.setText(hsn.getId());
        tf_nama.setText(hsn.getNama());
        tf_alamat.setText(hsn.getAlamat());
        tf_tlp.setText(hsn.getTlp());
        cbx_jk.setSelectedItem(hsn.getJk());
        sp_usia.setValue(hsn.getUsia());
    }
}
