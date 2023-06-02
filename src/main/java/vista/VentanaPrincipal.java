
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
        Button_Ajustes = new javax.swing.JLabel();
        Panel_Exit = new javax.swing.JPanel();
        Button_Exit = new javax.swing.JLabel();
        Button_info = new javax.swing.JLabel();
        Button_Busqueda = new javax.swing.JLabel();
        Button_Documentos = new javax.swing.JLabel();
        Button_Proveedor = new javax.swing.JLabel();
        Button_Vender = new javax.swing.JLabel();
        Button_Home = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 900));
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

        Button_Ajustes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Button_Ajustes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ajustes-35.png"))); // NOI18N
        Button_Ajustes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Ajustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_AjustesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_AjustesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_AjustesMouseExited(evt);
            }
        });
        BarraLateral.add(Button_Ajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 210, 40));

        Panel_Exit.setBackground(new java.awt.Color(102, 0, 0));
        Panel_Exit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Exit.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        Button_Exit.setForeground(new java.awt.Color(255, 255, 255));
        Button_Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Exit.setText("Salir");
        Button_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_ExitMouseExited(evt);
            }
        });
        Panel_Exit.add(Button_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        BarraLateral.add(Panel_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 800, 190, 40));

        Button_info.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Button_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/información-35.png"))); // NOI18N
        Button_info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_infoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_infoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_infoMouseExited(evt);
            }
        });
        BarraLateral.add(Button_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 210, 40));

        Button_Busqueda.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Button_Busqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Busqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/búsqueda-35.png"))); // NOI18N
        Button_Busqueda.setToolTipText("");
        Button_Busqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Busqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_BusquedaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_BusquedaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_BusquedaMouseExited(evt);
            }
        });
        BarraLateral.add(Button_Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 210, 40));

        Button_Documentos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Button_Documentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Documentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/documento-35.png"))); // NOI18N
        Button_Documentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Documentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_DocumentosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_DocumentosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_DocumentosMouseExited(evt);
            }
        });
        BarraLateral.add(Button_Documentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 210, 40));

        Button_Proveedor.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Button_Proveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/proveedor-35.png"))); // NOI18N
        Button_Proveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_ProveedorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_ProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_ProveedorMouseExited(evt);
            }
        });
        BarraLateral.add(Button_Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 210, 40));

        Button_Vender.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Button_Vender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Vender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/vender-stock-35.png"))); // NOI18N
        Button_Vender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Vender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_VenderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_VenderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_VenderMouseExited(evt);
            }
        });
        BarraLateral.add(Button_Vender, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 210, 40));

        Button_Home.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Button_Home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/windows-35.png"))); // NOI18N
        Button_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_HomeMouseExited(evt);
            }
        });
        BarraLateral.add(Button_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 210, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BarraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 660, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BarraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_VenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_VenderMouseClicked
        
    }//GEN-LAST:event_Button_VenderMouseClicked

    private void Button_VenderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_VenderMouseEntered
       
    }//GEN-LAST:event_Button_VenderMouseEntered

    private void Button_VenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_VenderMouseExited
       
    }//GEN-LAST:event_Button_VenderMouseExited

    private void Button_ProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ProveedorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_ProveedorMouseClicked

    private void Button_ProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ProveedorMouseEntered
        
    }//GEN-LAST:event_Button_ProveedorMouseEntered

    private void Button_ProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ProveedorMouseExited
       
    }//GEN-LAST:event_Button_ProveedorMouseExited

    private void Button_DocumentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DocumentosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_DocumentosMouseClicked

    private void Button_DocumentosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DocumentosMouseEntered
        
    }//GEN-LAST:event_Button_DocumentosMouseEntered

    private void Button_DocumentosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DocumentosMouseExited
       
    }//GEN-LAST:event_Button_DocumentosMouseExited

    private void Button_AjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_AjustesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_AjustesMouseClicked

    private void Button_AjustesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_AjustesMouseEntered
        
    }//GEN-LAST:event_Button_AjustesMouseEntered

    private void Button_AjustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_AjustesMouseExited
       
    }//GEN-LAST:event_Button_AjustesMouseExited

    private void Button_BusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_BusquedaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_BusquedaMouseClicked

    private void Button_BusquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_BusquedaMouseEntered
       
    }//GEN-LAST:event_Button_BusquedaMouseEntered

    private void Button_BusquedaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_BusquedaMouseExited
       
    }//GEN-LAST:event_Button_BusquedaMouseExited

    private void Button_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_infoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_infoMouseClicked

    private void Button_infoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_infoMouseEntered
       
    }//GEN-LAST:event_Button_infoMouseEntered

    private void Button_infoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_infoMouseExited
        
    }//GEN-LAST:event_Button_infoMouseExited

    private void Button_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ExitMouseClicked
     
    }//GEN-LAST:event_Button_ExitMouseClicked

    private void Button_ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ExitMouseEntered
        
    }//GEN-LAST:event_Button_ExitMouseEntered

    private void Button_ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ExitMouseExited
        
    }//GEN-LAST:event_Button_ExitMouseExited

    private void Button_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_HomeMouseClicked
       
    }//GEN-LAST:event_Button_HomeMouseClicked

    private void Button_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_HomeMouseEntered
     
    }//GEN-LAST:event_Button_HomeMouseEntered

    private void Button_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_HomeMouseExited
        
    }//GEN-LAST:event_Button_HomeMouseExited

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
    private javax.swing.JLabel Button_Ajustes;
    private javax.swing.JLabel Button_Busqueda;
    private javax.swing.JLabel Button_Documentos;
    private javax.swing.JLabel Button_Exit;
    private javax.swing.JLabel Button_Home;
    private javax.swing.JLabel Button_Mi_Info;
    private javax.swing.JLabel Button_Proveedor;
    private javax.swing.JLabel Button_Vender;
    private javax.swing.JLabel Button_info;
    private javax.swing.JPanel Panel_Exit;
    // End of variables declaration//GEN-END:variables
}
