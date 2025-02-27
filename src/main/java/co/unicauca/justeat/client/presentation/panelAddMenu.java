/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.justeat.client.presentation;

import co.unicauca.justeat.client.access.Factory;
import co.unicauca.justeat.client.access.IDishAccess;
import co.unicauca.justeat.client.domain.services.DishService;
import static co.unicauca.justeat.client.infra.Messages.successMessage;
import co.unicauca.justeat.commons.domain.Dish;

/**
 *
 * @author SANTIAGO MUÑOZ 
 *         KEVIN ALARCON 
 *         JUAN JOSE LOPEZ 
 *         SANTIAGO CORDOBA 
 *         DANIEL MUÑOZ
 */


public class panelAddMenu extends javax.swing.JPanel {

    /**
     * Creates new form panelAddMenu
     */
    public panelAddMenu() {
        initComponents();
        TextPrompt txtMenuId = new TextPrompt("Id Menu", this.txtMenuId);
        TextPrompt txtMenuName = new TextPrompt("Id sMenu", this.txtMenuName);
        TextPrompt txtDishId = new TextPrompt("Id Dish", this.txtDishID);
        TextPrompt txtDishName = new TextPrompt("Name Dish", this.txtDishName);
        TextPrompt txtDishPrice = new TextPrompt("Price Dish", this.txtDishPrice);
        TextPrompt txtDishDescrip = new TextPrompt("Description Dish", this.txtDishDes);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMenuId = new javax.swing.JTextField();
        txtDishName = new javax.swing.JTextField();
        txtDishID = new javax.swing.JTextField();
        txtDishPrice = new javax.swing.JTextField();
        txtMenuName = new javax.swing.JTextField();
        txtDishDes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCreateMenuDish = new rsbuttom.RSButtonMetro();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMenuId.setBorder(null);
        txtMenuId.setName("txtMenuId"); // NOI18N
        add(txtMenuId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, -1));

        txtDishName.setBorder(null);
        txtDishName.setName("txtDishName"); // NOI18N
        add(txtDishName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 120, -1));

        txtDishID.setBorder(null);
        txtDishID.setName("txtDishId"); // NOI18N
        add(txtDishID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 120, -1));

        txtDishPrice.setBorder(null);
        txtDishPrice.setName("txtDishPrice\n"); // NOI18N
        add(txtDishPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 120, -1));

        txtMenuName.setBorder(null);
        txtMenuName.setName("txtMenuId"); // NOI18N
        add(txtMenuName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 150, -1));

        txtDishDes.setName("txtDishDes"); // NOI18N
        add(txtDishDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 140, 120));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 66, 79));
        jLabel1.setText("Menu ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 66, 79));
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 66, 79));
        jLabel3.setText("DishID\n");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 66, 79));
        jLabel4.setText("Description ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 70, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 66, 79));
        jLabel5.setText("Name\n");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 120, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 66, 79));
        jLabel6.setText("Price");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 110, -1));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Create Menu ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Enter the data of the dish you want to register");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Menu informacion (Required fields)");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        btnCreateMenuDish.setBackground(new java.awt.Color(255, 66, 79));
        btnCreateMenuDish.setText("Create");
        btnCreateMenuDish.setColorHover(new java.awt.Color(194, 18, 31));
        btnCreateMenuDish.setColorNormal(new java.awt.Color(255, 66, 79));
        btnCreateMenuDish.setColorPressed(new java.awt.Color(194, 18, 31));
        btnCreateMenuDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateMenuDishActionPerformed(evt);
            }
        });
        add(btnCreateMenuDish, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 100, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\Universidad\\Lab-Software 2\\Just Eat\\Proyecto\\JustEat-Client\\src\\main\\java\\resources\\img3.png")); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 210, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 120, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 120, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 150, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 120, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 120, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateMenuDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateMenuDishActionPerformed
        IDishAccess service= Factory.getInstance().getDishService();
        
        DishService dishSerivce= new DishService(service);
        
        Dish dish = new Dish();
        
        dish.setPlatoId(txtDishID.getText());
        dish.setPlanNom(txtDishName.getText());
        dish.setPlacDesc(txtDishDes.getText());
        dish.setPlaPrecio(Double.parseDouble(txtDishPrice.getText()));
        
        try {
            String response = dishSerivce.createDish(dish);
             successMessage("Plato  " + response + " agregado con exito.", "Atención");
             clearCotronls();
             
        } catch (Exception ex) {
                System.out.println(ex);
                successMessage(ex.getMessage() + "Error", "Atención");
        }
    }//GEN-LAST:event_btnCreateMenuDishActionPerformed
    
    private void clearCotronls() {
        txtDishDes.setText("");
        txtDishID.setText("");
        txtDishName.setText("");
        txtMenuName.setText("");
        txtMenuId.setText("");
        txtDishPrice.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnCreateMenuDish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtDishDes;
    private javax.swing.JTextField txtDishID;
    private javax.swing.JTextField txtDishName;
    private javax.swing.JTextField txtDishPrice;
    private javax.swing.JTextField txtMenuId;
    private javax.swing.JTextField txtMenuName;
    // End of variables declaration//GEN-END:variables
}
