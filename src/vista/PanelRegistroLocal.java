/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

/**
 *
 * @author jcmro
 */
public class PanelRegistroLocal extends javax.swing.JPanel {

    /**
     * Creates new form PanelRegistrarLocal
     */
    public PanelRegistroLocal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jtxtDistrito = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbtnRegistrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jdchFecha = new com.toedter.calendar.JDateChooser();
        jspnAforo = new javax.swing.JSpinner();
        jspnCosto = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(900, 850));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Registro de Local");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 148, -1));
        jPanel1.add(jtxtDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 148, -1));

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Ingresar el nombre del local");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 101, -1, -1));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Ingresar el distrito del local");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Ingresar el aforo del local");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Ingresar el costo del local");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        jbtnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnRegistrar.setText("Subir datos");
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 146, 65));

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Ingresar fecha");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));
        jPanel1.add(jdchFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 150, -1));
        jPanel1.add(jspnAforo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 150, -1));
        jPanel1.add(jspnCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed


    }//GEN-LAST:event_jbtnRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton jbtnRegistrar;
    public com.toedter.calendar.JDateChooser jdchFecha;
    public javax.swing.JSpinner jspnAforo;
    public javax.swing.JSpinner jspnCosto;
    public javax.swing.JTextField jtxtDistrito;
    public javax.swing.JTextField jtxtNombre;
    // End of variables declaration//GEN-END:variables
}
