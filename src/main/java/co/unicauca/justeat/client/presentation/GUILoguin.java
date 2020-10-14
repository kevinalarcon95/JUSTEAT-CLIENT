package co.unicauca.justeat.client.presentation;

import co.unicauca.justeat.client.domain.User;
import static co.unicauca.justeat.client.infra.Messages.warningMessage;
import java.awt.event.KeyEvent;

/**
 *
 * @author SANTIAGO MUÑOZ 
 *         KEVIN ALARCON 
 *         JUAN JOSE LOPEZ 
 *         SANTIAGO CORDOBA 
 *         DANIEL MUÑOZ
 */
public class GUILoguin extends javax.swing.JFrame {

    /**
     * Creates new form GUILoguiin
     */
    public GUILoguin() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Loguin");

        TextPrompt textUser = new TextPrompt(" Enter you username", txtUser);
        TextPrompt textPass = new TextPrompt(" Enter you password", txtPassword);
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
        txtUser = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblUser = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        btnLoguin = new rsbuttom.RSButtonMetro();
        btnCreateAccount = new rsbuttom.RSButtonMetro();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Welcome ! ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        txtUser.setBorder(null);
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 160, 20));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 190, 20));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 190, 10));

        lblUser.setIcon(new javax.swing.ImageIcon("D:\\Universidad\\Lab-Software 2\\Just Eat\\Proyecto\\JustEat-Client\\src\\main\\java\\resources\\icons8_user_16.png")); // NOI18N
        jPanel1.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 20, 20));

        jLabel7.setBackground(new java.awt.Color(84, 84, 84));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Password:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 60, 20));

        lblPass.setIcon(new javax.swing.ImageIcon("D:\\Universidad\\Lab-Software 2\\Just Eat\\Proyecto\\JustEat-Client\\src\\main\\java\\resources\\icons8_password_16.png")); // NOI18N
        jPanel1.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 20, 20));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Sign in your account");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        txtPassword.setBorder(null);
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 160, 20));

        jLabel10.setBackground(new java.awt.Color(204, 204, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("User:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 50, 20));

        btnLoguin.setBackground(new java.awt.Color(255, 66, 79));
        btnLoguin.setText("Loguin");
        btnLoguin.setColorHover(new java.awt.Color(194, 18, 31));
        btnLoguin.setColorNormal(new java.awt.Color(255, 66, 79));
        btnLoguin.setColorPressed(new java.awt.Color(194, 18, 31));
        btnLoguin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLoguin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoguinActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoguin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 70, 30));

        btnCreateAccount.setBackground(new java.awt.Color(255, 255, 255));
        btnCreateAccount.setText("Create Account");
        btnCreateAccount.setColorHover(new java.awt.Color(255, 255, 255));
        btnCreateAccount.setColorNormal(new java.awt.Color(255, 255, 255));
        btnCreateAccount.setColorPressed(new java.awt.Color(255, 255, 255));
        btnCreateAccount.setColorTextHover(new java.awt.Color(255, 66, 79));
        btnCreateAccount.setColorTextNormal(new java.awt.Color(153, 153, 153));
        btnCreateAccount.setColorTextPressed(new java.awt.Color(255, 66, 79));
        btnCreateAccount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 110, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 90, 10));

        jPanel3.setBackground(new java.awt.Color(255, 66, 79));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText(" Find your favorite restaurants and place your orders.");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 236, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Universidad\\Lab-Software 2\\Just Eat\\Proyecto\\JustEat-Client\\src\\main\\java\\resources\\Just Eat.png")); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoguinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoguinActionPerformed
     
        //Aqui vendria el analizar si el usuario existe en el sistema
        if(txtUser.getText().equalsIgnoreCase("invitado")){
                    GUIPrincipalUser gp = new GUIPrincipalUser();
                    //gp.setExtendedState(MAXIMIZED_BOTH);
                    gp.setVisible(true);
        } 
                GUIOpc gopc = new GUIOpc();
                //gopc.setExtendedState(MAXIMIZED_BOTH);
                  gopc.setVisible(true);
                  
                  this.dispose();
        
        
        co.unicauca.justeat.client.infra.Security.usuario = new User(txtUser.getText(), txtPassword.getText(), "");
        
        if (true) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    
                    
                    
                }
            });
            this.dispose();
        } else {
            warningMessage("Contraseña incorrecta", "Atención");
        }
                
    }//GEN-LAST:event_btnLoguinActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnLoguinActionPerformed(null);
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        GUICreateAccount gca = new GUICreateAccount();
        gca.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btnCreateAccountActionPerformed

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
            java.util.logging.Logger.getLogger(GUILoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUILoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUILoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUILoguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new GUILoguin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnCreateAccount;
    private rsbuttom.RSButtonMetro btnLoguin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private boolean existUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
