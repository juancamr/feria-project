package vista;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowMain extends javax.swing.JFrame {

    public WindowMain() {
        initComponents();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("\nClosing program...\nFERIA PROJECT by juancamr\n");
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraLateral = new javax.swing.JPanel();
        jbtnRegistrarLocal = new javax.swing.JButton();
        jbtnRegistrarFeria = new javax.swing.JButton();
        jbtnProveedores = new javax.swing.JButton();
        jbtnCerrarSesion = new javax.swing.JButton();
        jbtnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtnPatrocinadores = new javax.swing.JButton();
        jbtnEntradas = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 800));
        setPreferredSize(new java.awt.Dimension(1100, 800));
        setSize(new java.awt.Dimension(1100, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraLateral.setBackground(new java.awt.Color(204, 204, 255));
        BarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnRegistrarLocal.setText("Registrar Local");
        BarraLateral.add(jbtnRegistrarLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jbtnRegistrarFeria.setText("Registrar Feria");
        BarraLateral.add(jbtnRegistrarFeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jbtnProveedores.setText("Proveedores");
        BarraLateral.add(jbtnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jbtnCerrarSesion.setBackground(new java.awt.Color(204, 0, 51));
        jbtnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCerrarSesion.setText("Cerrar sesion");
        BarraLateral.add(jbtnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 720, 130, 40));

        jbtnHome.setText("Home");
        BarraLateral.add(jbtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel1.setText("Mi Informacion");
        BarraLateral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jbtnPatrocinadores.setText("Patrocinadores");
        BarraLateral.add(jbtnPatrocinadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jbtnEntradas.setText("Entradas");
        BarraLateral.add(jbtnEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        getContentPane().add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 850));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setMinimumSize(new java.awt.Dimension(800, 800));
        content.setPreferredSize(new java.awt.Dimension(800, 800));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 900, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(WindowMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateral;
    public javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JButton jbtnCerrarSesion;
    public javax.swing.JButton jbtnEntradas;
    public javax.swing.JButton jbtnHome;
    public javax.swing.JButton jbtnPatrocinadores;
    public javax.swing.JButton jbtnProveedores;
    public javax.swing.JButton jbtnRegistrarFeria;
    public javax.swing.JButton jbtnRegistrarLocal;
    // End of variables declaration//GEN-END:variables
}
