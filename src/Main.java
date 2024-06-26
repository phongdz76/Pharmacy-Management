/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nguye
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        SignIn1 = new javax.swing.JLabel();
        BangDieuKhien = new javax.swing.JButton();
        SanPham = new javax.swing.JButton();
        XuatKho = new javax.swing.JButton();
        BaoCao = new javax.swing.JButton();
        NhapKho = new javax.swing.JButton();
        DanhMuc = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignIn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SignIn1.setForeground(new java.awt.Color(0, 0, 0));
        SignIn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/herbal (1).png"))); // NOI18N
        SignIn1.setText("Medick Flare");
        getContentPane().add(SignIn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 250, 100));

        BangDieuKhien.setBackground(new java.awt.Color(255, 255, 255));
        BangDieuKhien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BangDieuKhien.setForeground(new java.awt.Color(0, 0, 0));
        BangDieuKhien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clipboard.png"))); // NOI18N
        BangDieuKhien.setText("Điều Khiển");
        BangDieuKhien.setToolTipText("");
        BangDieuKhien.setBorder(null);
        BangDieuKhien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BangDieuKhienActionPerformed(evt);
            }
        });
        getContentPane().add(BangDieuKhien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 300, 40));

        SanPham.setBackground(new java.awt.Color(255, 255, 255));
        SanPham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SanPham.setForeground(new java.awt.Color(0, 0, 0));
        SanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping-cart.png"))); // NOI18N
        SanPham.setText(" Sản Phẩm");
        SanPham.setToolTipText("");
        SanPham.setBorder(null);
        SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SanPhamActionPerformed(evt);
            }
        });
        getContentPane().add(SanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 300, 40));

        XuatKho.setBackground(new java.awt.Color(255, 255, 255));
        XuatKho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        XuatKho.setForeground(new java.awt.Color(0, 0, 0));
        XuatKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        XuatKho.setText(" Xuất Kho");
        XuatKho.setBorder(null);
        XuatKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XuatKhoActionPerformed(evt);
            }
        });
        getContentPane().add(XuatKho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 300, 40));

        BaoCao.setBackground(new java.awt.Color(255, 255, 255));
        BaoCao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BaoCao.setForeground(new java.awt.Color(0, 0, 0));
        BaoCao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/annual-report.png"))); // NOI18N
        BaoCao.setText(" Báo Cáo");
        BaoCao.setBorder(null);
        BaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaoCaoActionPerformed(evt);
            }
        });
        getContentPane().add(BaoCao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 300, 40));

        NhapKho.setBackground(new java.awt.Color(255, 255, 255));
        NhapKho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NhapKho.setForeground(new java.awt.Color(0, 0, 0));
        NhapKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download.png"))); // NOI18N
        NhapKho.setText(" Nhập Kho");
        NhapKho.setBorder(null);
        NhapKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhapKhoActionPerformed(evt);
            }
        });
        getContentPane().add(NhapKho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 300, 40));

        DanhMuc.setBackground(new java.awt.Color(255, 255, 255));
        DanhMuc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DanhMuc.setForeground(new java.awt.Color(0, 0, 0));
        DanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        DanhMuc.setText(" Danh Mục");
        DanhMuc.setAlignmentY(1.0F);
        DanhMuc.setBorder(null);
        DanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DanhMucActionPerformed(evt);
            }
        });
        getContentPane().add(DanhMuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 300, 40));

        LogOut.setBackground(new java.awt.Color(255, 255, 255));
        LogOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogOut.setForeground(new java.awt.Color(0, 0, 0));
        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/power-button.png"))); // NOI18N
        LogOut.setText(" Log Out");
        LogOut.setBorder(null);
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        getContentPane().add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, 220, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white layout.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BangDieuKhienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BangDieuKhienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BangDieuKhienActionPerformed

    private void SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SanPhamActionPerformed

    private void NhapKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhapKhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NhapKhoActionPerformed

    private void XuatKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XuatKhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_XuatKhoActionPerformed

    private void DanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DanhMucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DanhMucActionPerformed

    private void BaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaoCaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BaoCaoActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_LogOutActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BangDieuKhien;
    private javax.swing.JButton BaoCao;
    private javax.swing.JButton DanhMuc;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton NhapKho;
    private javax.swing.JButton SanPham;
    private javax.swing.JLabel SignIn1;
    private javax.swing.JButton XuatKho;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
