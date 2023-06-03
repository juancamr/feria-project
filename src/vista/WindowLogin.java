/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import piero.Home;
import piero.RegistroUsu;
public class WindowLogin extends javax.swing.JFrame {

    /**
     * Creates new form Logeo
     */
    public WindowLogin() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtUserName = new javax.swing.JTextField();
        jbtnIngresar = new javax.swing.JButton();
        jbtnRegistrarse = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jpwdPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lock_32.png"))); // NOI18N
        jLabel1.setName(""); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 217, -1, 48));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/user_32.png"))); // NOI18N
        jLabel2.setName(""); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 133, -1, 48));

        jtxtUserName.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jtxtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 133, 437, 48));

        jbtnIngresar.setBackground(new java.awt.Color(153, 153, 153));
        jbtnIngresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnIngresar.setText("Ingresar");
        jbtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 344, 151, 44));

        jbtnRegistrarse.setBackground(new java.awt.Color(250, 250, 250));
        jbtnRegistrarse.setText("Crea tu cuenta");
        jbtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bienvenido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 30, -1, 63));
        jPanel1.add(jpwdPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 217, 437, 48));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nuevo aquí?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIngresarActionPerformed
            
    }//GEN-LAST:event_jbtnIngresarActionPerformed

    private void jbtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarseActionPerformed
      
    }//GEN-LAST:event_jbtnRegistrarseActionPerformed

    
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
            java.util.logging.Logger.getLogger(WindowLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton jbtnIngresar;
    public javax.swing.JButton jbtnRegistrarse;
    public javax.swing.JPasswordField jpwdPassword;
    public javax.swing.JTextField jtxtUserName;
    // End of variables declaration//GEN-END:variables
}
