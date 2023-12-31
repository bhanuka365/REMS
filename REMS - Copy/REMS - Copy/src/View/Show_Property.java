/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.p_client;
import Controller.p_property;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Show_Property extends javax.swing.JFrame {

    /**
     * Creates new form Show_Property
     */
    public Show_Property() {
        
        initComponents();
        fillJtableWithPropertiesData();
        
        
        jTable_show_prop.setSelectionBackground(new Color (27,150,77));
        
        
        jTable_show_prop.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTable_show_prop.getColumnModel().getColumn(1).setPreferredWidth(45);
        jTable_show_prop.getColumnModel().getColumn(3).setPreferredWidth(55);
        jTable_show_prop.getColumnModel().getColumn(8).setPreferredWidth(35);
        jTable_show_prop.getColumnModel().getColumn(5).setPreferredWidth(150);
        
        
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_show_prop = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_address = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_description = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jTable_show_prop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_show_prop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_show_propMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_show_prop);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Address");

        txt_address.setColumns(20);
        txt_address.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_address.setRows(5);
        jScrollPane2.setViewportView(txt_address);

        txt_description.setColumns(20);
        txt_description.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_description.setRows(5);
        jScrollPane3.setViewportView(txt_description);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setText("Description");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(26, Short.MAX_VALUE))
        );

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

    private void jTable_show_propMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_show_propMouseClicked
         
        
        int selectedRowIndex = jTable_show_prop.getSelectedRow();
        
        txt_address.setText(jTable_show_prop.getValueAt(selectedRowIndex, 5).toString());
        txt_description.setText(jTable_show_prop.getValueAt(selectedRowIndex, 13).toString());
        
        
        
        
    }//GEN-LAST:event_jTable_show_propMouseClicked

   
    
     public void fillJtableWithPropertiesData()
    {
        p_property property = new p_property();
        ArrayList<p_property> PropertyList=property.propertiesList();
      
        String[] colNames={"id","type"," square_feet","owner_id","price","address","bedrooms","bathrooms","age","balconey","pool","backyard","garage","description"};
        
        
        Object [][] rows = new Object[PropertyList.size()][14];
        
        for(int i=0;i<PropertyList.size();i++)
        {
            rows[i][0]=PropertyList.get(i).getId();
            rows[i][1]=PropertyList.get(i).getType();
            rows[i][2]=PropertyList.get(i).getSize();
            rows[i][3]=PropertyList.get(i).getOwnerId();
            rows[i][4]=PropertyList.get(i).getPrice();
            rows[i][5]=PropertyList.get(i).getAddress();
            rows[i][6]=PropertyList.get(i).getBedrooms();
            rows[i][7]=PropertyList.get(i).getBathrooms();
            rows[i][8]=PropertyList.get(i).getAge();
           
            if(PropertyList.get(i).isBalconey()) rows[i][9]="YES";
            else {rows[i][9] = "NO";}
            
            if(PropertyList.get(i).isPool()) rows[i][10]="YES";
            else {rows[i][10] = "NO";}
            
            if(PropertyList.get(i).isBackyard()) rows[i][11]="YES";
            else {rows[i][11] = "NO";}
            
            if(PropertyList.get(i).isGarage()) rows[i][12]="YES";
            else {rows[i][12] = "NO";}
           
            rows[i][13]=PropertyList.get(i).getDescription();
            
        
        }
        
        DefaultTableModel model = new DefaultTableModel (rows,colNames);
        jTable_show_prop.setModel(model);
        
        jTable_show_prop.setRowHeight(40);
        
        
        
    }
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Show_Property.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show_Property.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show_Property.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show_Property.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show_Property().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_show_prop;
    private javax.swing.JTextArea txt_address;
    private javax.swing.JTextArea txt_description;
    // End of variables declaration//GEN-END:variables
}
