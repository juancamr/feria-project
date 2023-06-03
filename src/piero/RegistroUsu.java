/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package piero;

import vista.WindowLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class RegistroUsu extends javax.swing.JFrame {

    /**
     * Creates new form RegistroUsu
     */
    public RegistroUsu() {
       
         Conectar();
        initComponents();
    }
  public Connection Conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/usuarios","root","");
        } catch (SQLException e) {
            System.err.print(e.toString());
            JOptionPane.showMessageDialog(this, "Ocurrio un error.\nProblema con la Base de Datos");
        }
        return con;
    }
        public void Comprobar(int i) {
        Connection cone = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
       
        String User = txtUsuNu.getText();
        cone = Conectar();
        try{
                pst = cone.prepareStatement("select user_us from usuarios where user_us='" + User+"'");
                rs = pst.executeQuery();
                if(rs.next()){
                 i++;   
                 JOptionPane.showMessageDialog(this, "El usuario ya existe"); 
                 
                }
        }
        catch(SQLException e){}
        String Pass = txtPswNu.getText();
        String nom=txtNom.getText();
        if(nom.length()<8 && nom.length()>0){
         JOptionPane.showMessageDialog(this, "El nombre es muy corto");    
        }
        else{
            char[]compi=nom.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : compi){
         if(Character.isDigit(c)){
           JOptionPane.showMessageDialog(this, "El nombre contiene un numero"); 
           i++;
           break;
         }
      }
        }
      String corr=txtCorr.getText();
      
      if(corr.contains("@") && corr.length()>0){
      if(corr.indexOf("@")>corr.indexOf(".")&& corr.contains(".")){
      JOptionPane.showMessageDialog(this, "El arroba no va antes del punto o no existe punto");
              i++;
          }
      }
      else if(corr.length()>0){
        JOptionPane.showMessageDialog(this, "El correo no contiene un arroba (@)"); 
            i++;
              }
  
       String tel= txtTel.getText();
       if(tel.length()>9){
         JOptionPane.showMessageDialog(this, "El telefono es muy largo");
         i++;
       }
       else{
        char[]teli=tel.toCharArray();
        StringBuilder stb = new StringBuilder();
        for(char c : teli){
         if(!(Character.isDigit(c))){
           JOptionPane.showMessageDialog(this, "El telefono contiene una letra"); 
           i++;
           break;
         }
       }
       }    
       
       String dni=txtDni.getText();
      if(dni.length()<8||dni.length()>9){
         JOptionPane.showMessageDialog(this, "El nombre es muy corto o muy largo");  
         i++;
        }
      char[]cal=dni.toCharArray();
        StringBuilder stb = new StringBuilder();
        for(char c : cal){
         if(!(Character.isDigit(c))){
           JOptionPane.showMessageDialog(this, "El DNI contiene una letra"); 
           i++;
           break;
         }
       } 
       
      
        if (User.equals("") || Pass.equals("")||corr.equals("")||nom.equals("")||tel.equals("")||dni.equals("")) {
            JOptionPane.showMessageDialog(this, "Uno o mas campos estan vacios, rellenar todos los datos");
            i++;
        } else if(i<1){
            try {
                int tel1=Integer.parseInt(tel);
                int dni1=Integer.parseInt(dni);
                cone = Conectar();
                pst = cone.prepareStatement("Insert into usuarios (nom_us, tel_us, cor_us, dni_us, user_us, psw_us) values (?,?,?,?,?,?)");
                pst.setString(1,nom);
                pst.setInt(2,tel1);
                pst.setString(3,corr);
                pst.setInt(4, dni1);
                pst.setString(5,User);
                pst.setString(6,Pass);
                
                int res=pst.executeUpdate();
          
             if (res>0) {
                    JOptionPane.showMessageDialog(this, "Datos Guardados correctamente");
                    this.dispose();
                    new WindowLogin().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al guardar los datos");
                }
            } catch (SQLException e) {
                System.err.print(e.toString());
                JOptionPane.showMessageDialog(this, "Ocurrio un error inesperado");
            }
        }
    }
 
  
  
  
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtUsuNu = new javax.swing.JTextField();
        txtPswNu = new javax.swing.JTextField();
        jbtnVolver = new javax.swing.JButton();
        jbtnRegistrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCorr = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Ingresar el nombre completo del nuevo usuario");

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Ingresar el teléfono del nuevo usuario");

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Ingresar el DNI del nuevo usuario");

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Ingresar el usuario nuevo");

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Ingresar la contraseña del nuevo usuario");

        txtNom.setBackground(new java.awt.Color(204, 204, 204));

        txtDni.setBackground(new java.awt.Color(204, 204, 204));

        txtTel.setBackground(new java.awt.Color(204, 204, 204));

        txtUsuNu.setBackground(new java.awt.Color(204, 204, 204));

        txtPswNu.setBackground(new java.awt.Color(204, 204, 204));

        jbtnVolver.setBackground(new java.awt.Color(153, 153, 153));
        jbtnVolver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnVolver.setText("Volver");
        jbtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVolverActionPerformed(evt);
            }
        });

        jbtnRegistrar.setBackground(new java.awt.Color(153, 153, 153));
        jbtnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnRegistrar.setText("Registrar");
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Ingresar el correo del nuevo usuario");

        txtCorr.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Registro de  nuevo usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jbtnVolver)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNom, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(txtTel)
                            .addComponent(txtDni)
                            .addComponent(txtUsuNu)
                            .addComponent(txtPswNu)
                            .addComponent(txtCorr))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(jbtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCorr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUsuNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPswNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVolverActionPerformed
        int i=1;
        Comprobar(i);
    }//GEN-LAST:event_jbtnVolverActionPerformed

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed
       int i=0;
       Comprobar(i);
    }//GEN-LAST:event_jbtnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton jbtnRegistrar;
    public javax.swing.JButton jbtnVolver;
    private javax.swing.JTextField txtCorr;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPswNu;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtUsuNu;
    // End of variables declaration//GEN-END:variables
}
