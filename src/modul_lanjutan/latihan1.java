/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_lanjutan;

/**
 *
 * @author asus
 */
public class latihan1 extends javax.swing.JFrame {

    /**
     * Creates new form latihan1
     */
    public latihan1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Alamat = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        ComboBox = new javax.swing.JComboBox<>();
        rdb2 = new javax.swing.JRadioButton();
        rdb1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Biodata");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 10, 90, 30);

        jLabel2.setText("Alamat");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 220, 60, 20);

        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 50, 60, 20);

        jLabel4.setText("Absen");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 90, 60, 20);

        jLabel5.setText("Kelas");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 130, 60, 20);

        jLabel6.setText("Jurusan");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 170, 60, 20);
        getContentPane().add(Alamat);
        Alamat.setBounds(120, 210, 230, 30);
        getContentPane().add(Nama);
        Nama.setBounds(120, 50, 230, 30);
        getContentPane().add(Absen);
        Absen.setBounds(120, 90, 230, 30);

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XI RPL 1", "XI RPL 2", "XI RPL 3", "XI RPL 4", "XI RPL 5", "XI RPL 6", "XI TKJ 1", "XI TKJ 2", "XI TKJ 3", "XI TKJ 4", "XI TKJ 5", "XI TKJ 6" }));
        getContentPane().add(ComboBox);
        ComboBox.setBounds(120, 130, 230, 30);

        btnGroup.add(rdb2);
        rdb2.setText("TKJ");
        getContentPane().add(rdb2);
        rdb2.setBounds(260, 170, 43, 23);

        btnGroup.add(rdb1);
        rdb1.setText("RPL");
        getContentPane().add(rdb1);
        rdb1.setBounds(120, 170, 43, 23);

        jButton1.setText("EXIT");
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 260, 55, 23);

        jButton2.setText("SEND");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(70, 260, 59, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul_lanjutan/CQCrSOmVAAAb_qc.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(340, 350, 389, 730);

        setSize(new java.awt.Dimension(416, 491));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nama = Nama.getText();
        String absen = Absen.getText();
        String kelas = ComboBox.getSelectedItem().toString();
        String jurusan = "";
        String alamat = Alamat.getText();
        
        if(rdb1.isSelected())
        {
            jurusan = "RPL";
        }
        else if(rdb2.isSelected())
            jurusan = "TKJ";
        else 
            if (ComboBox.getSelectedItem() == "XI RPL 1"){
            }
            if (ComboBox.getSelectedItem() == "XI RPL 2"){
            }
            if (ComboBox.getSelectedItem() == "XI RPL 3"){
            }
            if (ComboBox.getSelectedItem() == "XI RPL 4"){
            }
            if (ComboBox.getSelectedItem() == "XI RPL 5"){
            }
            if (ComboBox.getSelectedItem() == "XI RPL 6 "){
            }
        
            new frame2(Nama, Absen, ComboBox,jurusan, Alamat).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JTextField Alamat;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JTextField Nama;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rdb1;
    private javax.swing.JRadioButton rdb2;
    // End of variables declaration//GEN-END:variables
}
