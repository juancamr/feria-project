
package vista;
        
public class WindowMain extends javax.swing.JFrame {
    
    public WindowMain() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraLateral = new javax.swing.JPanel();
        Button_Mi_Info = new javax.swing.JLabel();
        jbtnRegistrarLocal = new javax.swing.JButton();
        jbtnRegistrarFeria = new javax.swing.JButton();
        jbtnProveedores = new javax.swing.JButton();
        jbtnDocumentacion = new javax.swing.JButton();
        jbtnAjustes = new javax.swing.JButton();
        jbtnBusqueda = new javax.swing.JButton();
        jbtnInformacion = new javax.swing.JButton();
        jbtnCerrarSesion = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1100, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraLateral.setBackground(new java.awt.Color(204, 204, 255));
        BarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Mi_Info.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Button_Mi_Info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Mi_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/usuario48.png"))); // NOI18N
        Button_Mi_Info.setText("Ver mi Información");
        Button_Mi_Info.setToolTipText("");
        Button_Mi_Info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Mi_Info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Mi_Info.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BarraLateral.add(Button_Mi_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 210, -1));

        jbtnRegistrarLocal.setText("Registrar Local");
        BarraLateral.add(jbtnRegistrarLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jbtnRegistrarFeria.setText("Registrar Feria");
        BarraLateral.add(jbtnRegistrarFeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jbtnProveedores.setText("Proveedores");
        BarraLateral.add(jbtnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jbtnDocumentacion.setText("Documentacion");
        BarraLateral.add(jbtnDocumentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jbtnAjustes.setText("Ajustes");
        BarraLateral.add(jbtnAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        jbtnBusqueda.setText("Busqueda");
        BarraLateral.add(jbtnBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, -1, -1));

        jbtnInformacion.setText("Informacion");
        BarraLateral.add(jbtnInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 670, -1, -1));

        jbtnCerrarSesion.setBackground(new java.awt.Color(204, 0, 51));
        jbtnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCerrarSesion.setText("Cerrar sesion");
        BarraLateral.add(jbtnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 790, 130, 40));

        getContentPane().add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 900));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 900, 900));

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
    public javax.swing.JLabel Button_Mi_Info;
    public javax.swing.JPanel content;
    public javax.swing.JButton jbtnAjustes;
    public javax.swing.JButton jbtnBusqueda;
    public javax.swing.JButton jbtnCerrarSesion;
    public javax.swing.JButton jbtnDocumentacion;
    public javax.swing.JButton jbtnInformacion;
    public javax.swing.JButton jbtnProveedores;
    public javax.swing.JButton jbtnRegistrarFeria;
    public javax.swing.JButton jbtnRegistrarLocal;
    // End of variables declaration//GEN-END:variables
}
