package co.unicauca.justeat.client.presentation;

import co.unicauca.justeat.client.access.Factory;
import co.unicauca.justeat.client.access.IRestaurantAccess;
import co.unicauca.justeat.client.domain.services.RestaurantService;
import co.unicauca.justeat.client.infra.Messages;
import static co.unicauca.justeat.client.infra.Messages.successMessage;
import co.unicauca.justeat.commons.domain.Restaurant;

/**
 *
 * @author SANTIAGO MUÑOZ
 *         KEVIN ALARCON
 *         JUAN JOSE LOPEZ
 *         SANTIAGO CORDOBA
 *         DANIEL MUÑOZ
 */
public class GUIAddRestaurant extends javax.swing.JFrame {

    public GUIAddRestaurant() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRestCity = new javax.swing.JTextField();
        txtRestId = new javax.swing.JTextField();
        txtRestName = new javax.swing.JTextField();
        txtRestAddress = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnCreateRestaurant = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Restaurant ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel2.setText(" Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel3.setText("Address:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel4.setText("City:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel5.setText("Category:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 50, -1));
        jPanel1.add(txtRestCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 170, -1));
        jPanel1.add(txtRestId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 170, -1));
        jPanel1.add(txtRestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 170, -1));
        jPanel1.add(txtRestAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 170, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipico", "Parrilla", "Gourtmet", "Criollo", "Pollo" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 130, -1));

        jButton1.setText("Add");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        btnCreateRestaurant.setText("Create");
        btnCreateRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRestaurantActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreateRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRestaurantActionPerformed
        IRestaurantAccess service = Factory.getInstance().getRestaurantService();
        //Inyecta la dependencia
        
        RestaurantService restaurantService = new RestaurantService(service);
        
        Restaurant restaurant = new Restaurant();
        restaurant.setResId(Integer.parseInt(txtRestId.getText()));
        restaurant.setAdminId(1061782); // Se valida con el loguin
        restaurant.setResNom(txtRestName.getText());
        restaurant.setResDireccion(txtRestAddress.getText());
        restaurant.setResTematicaComida("Pollo"); //Implementar con el combo box (debe poder seleccionar más de una opcion)
        
        try {
            String response = restaurantService.createRestaurant(restaurant);
            successMessage("Restaurante " + response + " agregado con exito.", "Atención");
            clearCotronls();
            txtRestId.setText("");
            btnCreateRestaurant.setVisible(false);
        } catch (Exception ex) {
            successMessage(ex.getMessage(), "Atención");
        }
    }//GEN-LAST:event_btnCreateRestaurantActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIAddRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAddRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAddRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAddRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAddRestaurant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateRestaurant;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtRestAddress;
    private javax.swing.JTextField txtRestCity;
    private javax.swing.JTextField txtRestId;
    private javax.swing.JTextField txtRestName;
    // End of variables declaration//GEN-END:variables

    private void clearCotronls() {
        txtRestId.setText("");
        txtRestName.setText("");
        txtRestAddress.setText("");
        txtRestCity.setText("");
    }
}
