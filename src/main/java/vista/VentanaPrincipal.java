
package main.java.vista;
        
public class VentanaPrincipal extends javax.swing.JFrame {
    
    public VentanaPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraLateral = new javax.swing.JPanel();
        Button_Mi_Info = new javax.swing.JLabel();
        Panel_Exit = new javax.swing.JPanel();
        jbtnSalir = new javax.swing.JLabel();
        jbtnRegistrarLocal = new javax.swing.JButton();
        jbtnRegistrarFeria = new javax.swing.JButton();
        jbtnProveedores = new javax.swing.JButton();
        jbtnDocumentacion = new javax.swing.JButton();
        jbtnAjustes = new javax.swing.JButton();
        jbtnBusqueda = new javax.swing.JButton();
        jbtnInformacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1100, 900));

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

        Panel_Exit.setBackground(new java.awt.Color(102, 0, 0));
        Panel_Exit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnSalir.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jbtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtnSalir.setText("Salir");
        jbtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnSalirMouseExited(evt);
            }
        });
        Panel_Exit.add(jbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        BarraLateral.add(Panel_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 800, 190, 40));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BarraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 642, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BarraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnSalirMouseClicked
     
    }//GEN-LAST:event_jbtnSalirMouseClicked

    private void jbtnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnSalirMouseEntered
        
    }//GEN-LAST:event_jbtnSalirMouseEntered

    private void jbtnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnSalirMouseExited
        
    }//GEN-LAST:event_jbtnSalirMouseExited

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraLateral;
    public javax.swing.JLabel Button_Mi_Info;
    private javax.swing.JPanel Panel_Exit;
    public javax.swing.JButton jbtnAjustes;
    public javax.swing.JButton jbtnBusqueda;
    public javax.swing.JButton jbtnDocumentacion;
    public javax.swing.JButton jbtnInformacion;
    public javax.swing.JButton jbtnProveedores;
    public javax.swing.JButton jbtnRegistrarFeria;
    public javax.swing.JButton jbtnRegistrarLocal;
    public javax.swing.JLabel jbtnSalir;
    // End of variables declaration//GEN-END:variables
}
