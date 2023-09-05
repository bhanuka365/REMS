/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.p_client;
import Controller.p_property;
import Controller.p_sale;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Sale extends javax.swing.JFrame {

    /**
     * Creates new form Sale
     */
    public Sale() {
        initComponents();
        
        fillJtableProperties();
        
        fillJtableClients();
        
        fillJtableSales();
    }
    
    public void fillJtableSales()
    {
        p_sale sale = new p_sale();
        ArrayList<p_sale> SalesList=sale.salesList();
      
        String[] colNames={"Id","Property","Client","Price","Date"};
        
        
        Object [][] rows = new Object[SalesList.size()][5];
        
        for(int i=0;i<SalesList.size();i++)
        {
            rows[i][0]=SalesList.get(i).getId();
            rows[i][1]=SalesList.get(i).getPropertyId();
            rows[i][2]=SalesList.get(i).getClientId();
            rows[i][3]=SalesList.get(i).getFinalPrice();
            rows[i][4]=SalesList.get(i).getSellingDate();
            
        }
        
        DefaultTableModel model = new DefaultTableModel (rows,colNames);
        jTable_sale.setModel(model);
       
    }

    public void fillJtableProperties()
    {
        p_property property = new p_property();
        ArrayList<p_property> PropertyList=property.propertiesList();
      
        String[] colNames={"Id","Owner Id","Price"};
        
        
        Object [][] rows = new Object[PropertyList.size()][3];
        
        for(int i=0;i<PropertyList.size();i++)
        {
            rows[i][0]=PropertyList.get(i).getId();
            rows[i][1]=PropertyList.get(i).getOwnerId();
            rows[i][2]=PropertyList.get(i).getPrice();
        }
        
        DefaultTableModel model = new DefaultTableModel (rows,colNames);
        jTable_properties.setModel(model);
       
    }
    
     public void fillJtableClients()
    {
         p_client client = new p_client();
        ArrayList<p_client> clientList=client.clientList();
        
        String[] colNames={"ID","First Name","Last Name"};
        
        
        Object [][] rows = new Object[clientList.size()][3];
        
        for(int i=0;i<clientList.size();i++)
        {
            rows[i][0]=clientList.get(i).getId();
            rows[i][1]=clientList.get(i).getFname();
            rows[i][2]=clientList.get(i).getLname();
            
        
        }
        
        DefaultTableModel model = new DefaultTableModel (rows,colNames);
        jTable_client.setModel(model);
        
        
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_add_sale = new javax.swing.JButton();
        btn_edit_sale = new javax.swing.JButton();
        btn_delete_sale = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_properties = new javax.swing.JTable();
        txt_final_price = new javax.swing.JTextField();
        txt_client_id = new javax.swing.JTextField();
        txt_property_id = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_client = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_sale = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_Title.setBackground(new java.awt.Color(153, 153, 153));
        jPanel_Title.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(125, 125, 125)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sale");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(468, 468, 468))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TitleLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        btn_add_sale.setBackground(new java.awt.Color(0, 204, 51));
        btn_add_sale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_add_sale.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_sale.setText("Add");
        btn_add_sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_saleActionPerformed(evt);
            }
        });

        btn_edit_sale.setBackground(new java.awt.Color(0, 102, 204));
        btn_edit_sale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_edit_sale.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit_sale.setText("Update");
        btn_edit_sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_saleActionPerformed(evt);
            }
        });

        btn_delete_sale.setBackground(new java.awt.Color(255, 0, 51));
        btn_delete_sale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_delete_sale.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete_sale.setText("Delete");
        btn_delete_sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_saleActionPerformed(evt);
            }
        });

        jTable_properties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_properties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_propertiesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable_properties);

        txt_final_price.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_final_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_final_priceActionPerformed(evt);
            }
        });

        txt_client_id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_client_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_client_idActionPerformed(evt);
            }
        });

        txt_property_id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_property_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_property_idActionPerformed(evt);
            }
        });

        txt_id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Property ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Client ID");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Final Price");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Date");

        jTable_client.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_clientMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable_client);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Client's List");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setText("Properties List");

        jTable_sale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_sale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_saleMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable_sale);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("Sale's List");

        jDateChooser1.setName("jDateChooser1"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_final_price, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(66, 66, 66)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_property_id, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txt_client_id)))
                            .addComponent(btn_add_sale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_edit_sale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_delete_sale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(166, 166, 166)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(868, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_client_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(txt_final_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txt_property_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_add_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_edit_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_delete_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(501, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_saleActionPerformed

       try{
            int id=Integer.valueOf(txt_id.getText());
        int propertyId =Integer.valueOf(txt_property_id.getText());
        int clientId=Integer.valueOf(txt_client_id.getText());
        String finalPrice = txt_final_price.getText();
        SimpleDateFormat dateFormat =new SimpleDateFormat("yyyy-MM-dd");
        String sellingDate = dateFormat.format(jDateChooser1.getDate());
        
        p_sale sale = new p_sale (0,propertyId,clientId,finalPrice,sellingDate);
        
        
        if(new p_sale().addNewSale(sale))
        {
            JOptionPane.showMessageDialog(null, "A NEW SALE HAS BEEN CREATED","Add Sale",1);
        }
        else
            {
            JOptionPane.showMessageDialog(null, "SALE NOT CREATED","Add Sale",2);
            }
       }
       catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null, "SELECT PROPERTY ID CLIENT ID","Add Sale",2);
       }
        
        
        
    }//GEN-LAST:event_btn_add_saleActionPerformed

    private void btn_edit_saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_saleActionPerformed

     try{
          int id=Integer.valueOf(txt_id.getText());
        int propertyId =Integer.valueOf(txt_property_id.getText());
        int clientId=Integer.valueOf(txt_client_id.getText());
        String finalPrice = txt_final_price.getText();
        SimpleDateFormat dateFormat =new SimpleDateFormat("dd/MM/yyyy");
        String sellingDate = dateFormat.format(jDateChooser1.getDate());
        
        p_sale sale = new p_sale (0,propertyId,clientId,finalPrice,sellingDate);
        
        
        if(new p_sale().editSale(sale))
        {
            JOptionPane.showMessageDialog(null, "SALE DATA HAS BEEN UPDATED","Edit Sale",1);
        }
        else
            {
            JOptionPane.showMessageDialog(null, "SALE NOT UPDATED","Edit Sale",2);
            }
     }
     catch(Exception ex)
     {
          JOptionPane.showMessageDialog(null, "SELECT PROPERTY ID CLIENT ID","Update Sale",2);
     }

    }//GEN-LAST:event_btn_edit_saleActionPerformed

    private void btn_delete_saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_saleActionPerformed

        try{
            int id=Integer.valueOf(txt_id.getText());
        
        
        
        if(new p_sale().deleteSale(id))
        {
            JOptionPane.showMessageDialog(null, "SALE DATA HAS BEEN DELETED","Delete Sale",1);
        }
        else
            {
            JOptionPane.showMessageDialog(null, "SALE NOT DELETED","Delete Sale",2);
            }
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, "SELECT SALE ID","Delete Sale",2);
        }
        
    }//GEN-LAST:event_btn_delete_saleActionPerformed

    private void jTable_propertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_propertiesMouseClicked
        int selectedRowIndex = jTable_properties.getSelectedRow();

        txt_id.setText(jTable_properties.getValueAt(selectedRowIndex, 0).toString());
        txt_property_id.setText(jTable_properties.getValueAt(selectedRowIndex, 1).toString());
        txt_final_price.setText(jTable_properties.getValueAt(selectedRowIndex, 2).toString());
    }//GEN-LAST:event_jTable_propertiesMouseClicked

    private void txt_final_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_final_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_final_priceActionPerformed

    private void txt_client_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_client_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_client_idActionPerformed

    private void txt_property_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_property_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_property_idActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void jTable_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_clientMouseClicked
        int selectedRowIndex = jTable_client.getSelectedRow();

        txt_client_id.setText(jTable_client.getValueAt(selectedRowIndex, 0).toString());
    }//GEN-LAST:event_jTable_clientMouseClicked

    private void jTable_saleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_saleMouseClicked
        
        int selectedRowIndex = jTable_sale.getSelectedRow();
        txt_id.setText(jTable_sale.getValueAt(selectedRowIndex, 0).toString());
        txt_property_id.setText(jTable_sale.getValueAt(selectedRowIndex, 1).toString());
        txt_client_id.setText(jTable_sale.getValueAt(selectedRowIndex, 2).toString());
        txt_final_price.setText(jTable_sale.getValueAt(selectedRowIndex, 3).toString());
        
        Date saleDate;
        try{
            saleDate = new SimpleDateFormat("yyyy-MM-dd").parse(jTable_sale.getValueAt(selectedRowIndex, 4).toString());
            jDateChooser1.setDate(saleDate);
        }
        catch(Exception ex)
        {
            Logger.getLogger(Sale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jTable_saleMouseClicked

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
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_sale;
    private javax.swing.JButton btn_delete_sale;
    private javax.swing.JButton btn_edit_sale;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable_client;
    private javax.swing.JTable jTable_properties;
    private javax.swing.JTable jTable_sale;
    private javax.swing.JTextField txt_client_id;
    private javax.swing.JTextField txt_final_price;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_property_id;
    // End of variables declaration//GEN-END:variables
}
