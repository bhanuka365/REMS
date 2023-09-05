/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.p_client;
import Controller.p_property;
import Controller.p_type;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Property extends javax.swing.JFrame {

    p_type type=new p_type();
        
        HashMap<String, Integer> map = type.getTypesMap();
    
    
    public Property() {
        initComponents();
        bindcombo();
        
        
        
    }

    public void bindcombo()
    {
         
        
        for (String s : map.keySet())
        {
            jComboBox_Type.addItem(s);
        }
        
    }  
    
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_address = new javax.swing.JTextArea();
        btn_add_property = new javax.swing.JButton();
        btn_edit_property = new javax.swing.JButton();
        btn_delete_property = new javax.swing.JButton();
        txt_squarefeet = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_ownerid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        btn_search_property = new javax.swing.JButton();
        jComboBox_Type = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jSpinner_bedroom = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jSpinner_bathroom = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jSpinner_age = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_description = new javax.swing.JTextArea();
        jCheckBox_balcony = new javax.swing.JCheckBox();
        jCheckBox_pool = new javax.swing.JCheckBox();
        jCheckBox_backyard = new javax.swing.JCheckBox();
        jCheckBox_garage = new javax.swing.JCheckBox();
        btn_show_property = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel_Title.setBackground(new java.awt.Color(153, 153, 153));
        jPanel_Title.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(125, 125, 125)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Property");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Type");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Address");

        txt_id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        txt_address.setColumns(20);
        txt_address.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_address.setRows(5);
        jScrollPane1.setViewportView(txt_address);

        btn_add_property.setFont(new java.awt.Font("Thibus29STru", 0, 18)); // NOI18N
        btn_add_property.setText("Add");
        btn_add_property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_propertyActionPerformed(evt);
            }
        });

        btn_edit_property.setFont(new java.awt.Font("Thibus29STru", 0, 18)); // NOI18N
        btn_edit_property.setText("Edit");
        btn_edit_property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_propertyActionPerformed(evt);
            }
        });

        btn_delete_property.setFont(new java.awt.Font("Thibus29STru", 0, 18)); // NOI18N
        btn_delete_property.setText("Delete");
        btn_delete_property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_propertyActionPerformed(evt);
            }
        });

        txt_squarefeet.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_squarefeet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_squarefeetActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Square Feet");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Owner ID");

        txt_ownerid.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_ownerid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_owneridActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Price (LKR)");

        txt_price.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });

        btn_search_property.setFont(new java.awt.Font("Thibus29STru", 0, 20)); // NOI18N
        btn_search_property.setText("Search");
        btn_search_property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_search_property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_propertyActionPerformed(evt);
            }
        });

        jComboBox_Type.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Bedrooms");

        jSpinner_bedroom.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jSpinner_bedroom.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setText("Bathrooms");

        jSpinner_bathroom.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jSpinner_bathroom.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("Age of House");

        jSpinner_age.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jSpinner_age.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setText("Description");

        txt_description.setColumns(20);
        txt_description.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_description.setRows(5);
        jScrollPane2.setViewportView(txt_description);

        jCheckBox_balcony.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jCheckBox_balcony.setText("Balconey");

        jCheckBox_pool.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jCheckBox_pool.setText("Pool");
        jCheckBox_pool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_poolActionPerformed(evt);
            }
        });

        jCheckBox_backyard.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jCheckBox_backyard.setText("Backyard");

        jCheckBox_garage.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jCheckBox_garage.setText("Garage");

        btn_show_property.setFont(new java.awt.Font("Thibus29STru", 0, 18)); // NOI18N
        btn_show_property.setText("Show Properties");
        btn_show_property.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_show_propertyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(38, 38, 38))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGap(24, 24, 24))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_search_property, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_squarefeet, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_price, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ownerid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(125, 125, 125))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSpinner_bathroom, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jSpinner_age)
                                    .addComponent(jSpinner_bedroom))
                                .addGap(17, 17, 17)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox_garage, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_balcony, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_pool, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_backyard, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btn_add_property, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_edit_property, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btn_delete_property, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btn_show_property)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_search_property, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox_Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_squarefeet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jSpinner_bathroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSpinner_bedroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ownerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox_balcony)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox_pool)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox_backyard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox_garage)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_edit_property, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_property, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_property, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_show_property, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_add_propertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_propertyActionPerformed


        
        
        try
        {
            int type = map.get(jComboBox_Type.getSelectedItem().toString());
            int ownerId = Integer.valueOf(txt_ownerid.getText());
            int squarefeet = Integer.valueOf(txt_squarefeet.getText());
            int bedrooms = Integer.valueOf(jSpinner_bedroom.getValue().toString());
            int bathrooms = Integer.valueOf(jSpinner_bathroom.getValue().toString());
            int age = Integer.valueOf(jSpinner_age.getValue().toString());
            
            boolean haveBalconey=false;
            boolean havePool=false;
            boolean haveBackyard=false;
            boolean haveGarage=false;
            
            if(jCheckBox_balcony.isSelected()) haveBalconey=true;
            if(jCheckBox_pool.isSelected()) havePool=true;
            if(jCheckBox_backyard.isSelected()) haveBackyard=true;
            if(jCheckBox_garage.isSelected()) haveGarage=true;
            
            String price = txt_price.getText();
            String address = txt_address.getText();
            String description = txt_description.getText();
            
            p_property property = new p_property(0,type, squarefeet, ownerId, price, address, bedrooms, bathrooms, age, haveBalconey, havePool, haveBackyard, haveGarage, description);
            
            if (new p_property().addNewProperty(property))
            {
                JOptionPane.showMessageDialog(null,"NEW Property ADDED TO THE SYSTEM","Add Property",1 );
                
                txt_id.setText("");
                        txt_address.setText("");
                        txt_description.setText("");
                        txt_price.setText("");
                        txt_squarefeet.setText("");
                        txt_ownerid.setText("");
            
           
                        jComboBox_Type.setSelectedIndex(0);
            
            
                        jSpinner_bedroom.setValue(0);
                        jSpinner_bathroom.setValue(0);
                        jSpinner_age.setValue(0);
            
                        jCheckBox_balcony.setSelected(false);
                        jCheckBox_backyard.setSelected(false);
                        jCheckBox_pool.setSelected(false);
                        jCheckBox_garage.setSelected(false);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Property NOT ADDED TO THE SYSTEM","Add Property",2 );
            }
            
            
        }
        
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage()+"ERROR","ERROR",0);
        }
        
        
        
    }//GEN-LAST:event_btn_add_propertyActionPerformed

    private void btn_edit_propertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_propertyActionPerformed
        
        try
        {
            int id = Integer.valueOf(txt_id.getText());
            int type = map.get(jComboBox_Type.getSelectedItem().toString());
            int ownerId = Integer.valueOf(txt_ownerid.getText());
            int squarefeet = Integer.valueOf(txt_squarefeet.getText());
            int bedrooms = Integer.valueOf(jSpinner_bedroom.getValue().toString());
            int bathrooms = Integer.valueOf(jSpinner_bathroom.getValue().toString());
            int age = Integer.valueOf(jSpinner_age.getValue().toString());
            
            boolean haveBalconey=false;
            boolean havePool=false;
            boolean haveBackyard=false;
            boolean haveGarage=false;
            
            if(jCheckBox_balcony.isSelected()) haveBalconey=true;
            if(jCheckBox_pool.isSelected()) havePool=true;
            if(jCheckBox_backyard.isSelected()) haveBackyard=true;
            if(jCheckBox_garage.isSelected()) haveGarage=true;
            
            String price = txt_price.getText();
            String address = txt_address.getText();
            String description = txt_description.getText();
            
            p_property property = new p_property(id,type, squarefeet, ownerId, price, address, bedrooms, bathrooms, age, haveBalconey, havePool, haveBackyard, haveGarage, description);
            
            if (new p_property().editProperty(property))
            {
                JOptionPane.showMessageDialog(null,"Property Updated TO THE SYSTEM","Edit Property",1 );
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Property NOT Updated TO THE SYSTEM","Edit Property",2 );
            }
            
            
        }
        
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage()+"ENTER VALID PROPERTY ID","INVALID ID",0);
        }
       
    }//GEN-LAST:event_btn_edit_propertyActionPerformed

    private void btn_delete_propertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_propertyActionPerformed

        try{
            int id = Integer.valueOf(txt_id.getText());

            p_property property = new p_property();

            if(txt_id.getText().trim().equals(""))
            {
                JOptionPane.showMessageDialog(null,"ENTER PROPERTY ID", "EMPTY ID",2);
            }
            else
            {
                int yes_or_no= JOptionPane.showConfirmDialog(null, "DO YOU WANT TO DELETE CLIENT ?","DELETE PROPERTY",JOptionPane.YES_NO_OPTION);

                if(yes_or_no==JOptionPane.YES_OPTION)
                {
                    if(property.deleteProperty(id))
                    {

                        JOptionPane.showMessageDialog(null,"PROPERTY DATA DELETED","DELETE PROPERTY",1);
                        
                        txt_id.setText("");
                        txt_address.setText("");
                        txt_description.setText("");
                        txt_price.setText("");
                        txt_squarefeet.setText("");
                        txt_ownerid.setText("");
            
           
                        jComboBox_Type.setSelectedIndex(0);
            
            
                        jSpinner_bedroom.setValue(0);
                        jSpinner_bathroom.setValue(0);
                        jSpinner_age.setValue(0);
            
                        jCheckBox_balcony.setSelected(false);
                        jCheckBox_backyard.setSelected(false);
                        jCheckBox_pool.setSelected(false);
                        jCheckBox_garage.setSelected(false);
                        
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"OPERATION FAILED","DELETE PROPERTY",2);
                    }
                }

                {

                }
            }

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage()+"ENTER VALID PROPERTY ID","INVALID ID",2);

        }
       
    }//GEN-LAST:event_btn_delete_propertyActionPerformed

    private void txt_squarefeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_squarefeetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_squarefeetActionPerformed

    private void txt_owneridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_owneridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_owneridActionPerformed

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceActionPerformed

    private void jCheckBox_poolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_poolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_poolActionPerformed

    private void btn_show_propertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_show_propertyActionPerformed
       Show_Property ShowPropertyform =new Show_Property();
        ShowPropertyform.setVisible(true);
        ShowPropertyform.pack();
        ShowPropertyform.setLocationRelativeTo(null);
        ShowPropertyform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_show_propertyActionPerformed

    private void btn_search_propertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_propertyActionPerformed
        
        try {
            
            int propertyId = Integer.valueOf(txt_id.getText());
            p_property property = new p_property().findProperty(propertyId);
            
            if(property != null)
        {
            txt_address.setText(property.getAddress());
            txt_description.setText(property.getDescription());
            txt_price.setText(property.getPrice());
            txt_squarefeet.setText(String.valueOf(property.getSize()));
            txt_ownerid.setText(String.valueOf(property.getOwnerId()));
            
            
            for(Object type : map.keySet())
            {
                if(map.get(type).equals(property.getType()))
                    jComboBox_Type.setSelectedItem(type);
            }
            
            jSpinner_bedroom.setValue(property.getBedrooms());
            jSpinner_bathroom.setValue(property.getBathrooms());
            jSpinner_age.setValue(property.getAge());
            
            if(property.isBalconey()) jCheckBox_balcony.setSelected(true);
            if(property.isBackyard()) jCheckBox_backyard.setSelected(true);
            if(property.isPool()) jCheckBox_pool.setSelected(true);
            if(property.isGarage()) jCheckBox_garage.setSelected(true);
            
        }
            else
            {
                JOptionPane.showMessageDialog(null,"PROPERTY NOT FOUND","ERROR",0);
            }
            
            }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage()+"ERROR","ERROR",0);
        }
        
        
        
    }//GEN-LAST:event_btn_search_propertyActionPerformed

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
            java.util.logging.Logger.getLogger(Property.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Property.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Property.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Property.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Property().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_property;
    private javax.swing.JButton btn_delete_property;
    private javax.swing.JButton btn_edit_property;
    private javax.swing.JButton btn_search_property;
    private javax.swing.JButton btn_show_property;
    private javax.swing.JCheckBox jCheckBox_backyard;
    private javax.swing.JCheckBox jCheckBox_balcony;
    private javax.swing.JCheckBox jCheckBox_garage;
    private javax.swing.JCheckBox jCheckBox_pool;
    private javax.swing.JComboBox<String> jComboBox_Type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner_age;
    private javax.swing.JSpinner jSpinner_bathroom;
    private javax.swing.JSpinner jSpinner_bedroom;
    private javax.swing.JTextArea txt_address;
    private javax.swing.JTextArea txt_description;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_ownerid;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_squarefeet;
    // End of variables declaration//GEN-END:variables
}
