/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.p_owner;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Controller.*;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DELL
 */
public class Owner extends javax.swing.JFrame {

    /**
     * Creates new form Owner
     */
    public Owner() {
        
        initComponents();
        
        
        fillJtableWithOwnersData();
        
        
    }

    
    public void fillJtableWithOwnersData()
    {
        p_owner owner = new p_owner();
        ArrayList<p_owner> ownersList=owner.ownerList();
        
        String[] colNames={"ID","First Name","Last Name","Phone","Email","Address"};
        
        
        Object [][] rows = new Object[ownersList.size()][6];
        
        for(int i=0;i<ownersList.size();i++)
        {
            rows[i][0]=ownersList.get(i).getId();
            rows[i][1]=ownersList.get(i).getFname();
            rows[i][2]=ownersList.get(i).getLname();
            rows[i][3]=ownersList.get(i).getPhone();
            rows[i][4]=ownersList.get(i).getEmail();
            rows[i][5]=ownersList.get(i).getAddress();
        
        }
        
        DefaultTableModel model = new DefaultTableModel (rows,colNames);
        jTable_owner.setModel(model);
        
        jTable_owner.setRowHeight(40);
        
        
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_fname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_address = new javax.swing.JTextArea();
        btn_add_owner = new javax.swing.JButton();
        btn_edit_owner = new javax.swing.JButton();
        btn_delete_owner = new javax.swing.JButton();
        btn_refresh_owner = new javax.swing.JButton();
        txt_lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_owner = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(175, 228, 255));

        jPanel_Title.setBackground(new java.awt.Color(153, 153, 153));
        jPanel_Title.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(125, 125, 125)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Owners");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(351, 351, 351))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Address");

        txt_id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        txt_fname.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fnameActionPerformed(evt);
            }
        });

        txt_address.setColumns(20);
        txt_address.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_address.setRows(5);
        jScrollPane1.setViewportView(txt_address);

        btn_add_owner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_add_owner.setText("Add");
        btn_add_owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_ownerActionPerformed(evt);
            }
        });

        btn_edit_owner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_edit_owner.setText("Edit");
        btn_edit_owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_ownerActionPerformed(evt);
            }
        });

        btn_delete_owner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_delete_owner.setText("Delete");
        btn_delete_owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_ownerActionPerformed(evt);
            }
        });

        btn_refresh_owner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_refresh_owner.setText("Refresh");
        btn_refresh_owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refresh_ownerActionPerformed(evt);
            }
        });

        txt_lname.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lnameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Last Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Phone");

        txt_phone.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Email");

        txt_email.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        jTable_owner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_owner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ownerMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable_owner);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(56, 56, 56)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                            .addComponent(txt_phone))))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btn_add_owner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(72, 72, 72)
                        .addComponent(btn_edit_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btn_delete_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btn_refresh_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_refresh_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txt_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fnameActionPerformed

    private void btn_add_ownerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_ownerActionPerformed

       String fname=txt_fname.getText();
       String lname=txt_lname.getText();
       String phone=txt_phone.getText();
       String email=txt_fname.getText();
       String address=txt_address.getText();
       
       p_owner owner = new p_owner();
       
       if(fname.trim().equals("")||lname.trim().equals("")||phone.trim().equals("")||address.trim().equals(""))
       {
           JOptionPane.showMessageDialog(null,"ENTER REQUIRED INFORMATION{first name,phone,address}","Add Owner",2 );
       }
       else
       {
           if(owner.addNewOwner(new p_owner(0,fname,lname,phone,email,address)))
            {
           JOptionPane.showMessageDialog(null,"NEW OWNER ADDED TO THE SYSTEM","Add Owner",1 );
           
           
           txt_id.setText("");
           txt_fname.setText("");
           txt_lname.setText("");
           txt_phone.setText("");
           txt_fname.setText("");
           txt_address.setText("");
           txt_email.setText("");
           
           fillJtableWithOwnersData();
           
            }
            else
            {
           JOptionPane.showMessageDialog(null,"OWNER NOT ADDED TO THE SYSTEM","Add Owner",2 );
            }
       
       }
       
       
       

    }//GEN-LAST:event_btn_add_ownerActionPerformed

    private void btn_edit_ownerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_ownerActionPerformed

        
        String fname=txt_fname.getText();
       String lname=txt_lname.getText();
       String phone=txt_phone.getText();
       String email=txt_fname.getText();
       String address=txt_address.getText();
       
       
       p_owner owner = new p_owner();
       
       try{
           int ownerId=Integer.valueOf(txt_id.getText());
           
           if(fname.trim().equals("")||lname.trim().equals("")||phone.trim().equals("")||address.trim().equals(""))
       {
           JOptionPane.showMessageDialog(null,"ENTER REQUIRED INFORMATION{first name,phone,address}","Edit Owner",2 );
       }
       else
       {
           if(owner.editOwnerData(new p_owner(ownerId,fname,lname,phone,email,address)))
            {
           JOptionPane.showMessageDialog(null,"OWNER DATA EDITED","Edit Owner",1 );
           
           txt_id.setText("");
           txt_fname.setText("");
           txt_lname.setText("");
           txt_phone.setText("");
           txt_fname.setText("");
           txt_address.setText("");
           txt_email.setText("");
           
           fillJtableWithOwnersData();
           
           
            }
            else
            {
           JOptionPane.showMessageDialog(null,"OWNER DATA NOT EDITED ","Edit Owner",2 );
            }
       
       }
           
           
       }catch(Exception ex)
                 {
                   JOptionPane.showMessageDialog(null, ex.getMessage()+"ENTER VALID TYPE ID","INVALID ID",2);

                 }
       
        
       
    }//GEN-LAST:event_btn_edit_ownerActionPerformed

    private void btn_delete_ownerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_ownerActionPerformed
        
        
        try{
            int owneridId = Integer.valueOf(txt_id.getText());
        
        p_owner owner = new p_owner();
        
        if(txt_id.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null,"ENTER THE OWNER ID", "EMPTY ID",2);
        }
        else
        {
             int yes_or_no= JOptionPane.showConfirmDialog(null, "DO YOU WANT TO DELETE OWNER ?","DELETE TYPE",JOptionPane.YES_NO_OPTION);
             
             
            if(yes_or_no==JOptionPane.YES_OPTION)
            {
                if(owner.deleteOwner(owneridId))
                {
                     
                JOptionPane.showMessageDialog(null,"OWNER DATA DELETED","DELETE OWNER",1);
                
                txt_id.setText("");
                txt_fname.setText("");
                txt_lname.setText("");
                txt_phone.setText("");
                txt_fname.setText("");
                txt_address.setText("");
                txt_email.setText("");
                
                fillJtableWithOwnersData();
                
        }
        else
        {
            JOptionPane.showMessageDialog(null,"OPERATION FAILED","DELETE OWNER",2);
        }
            }
                
        {
            
        }
        }
            
        }
        catch(Exception ex)
                 {
                   JOptionPane.showMessageDialog(null, ex.getMessage()+"ENTER VALID TYPE ID","INVALID ID",2);

                 }
        
        
        
        
       
    }//GEN-LAST:event_btn_delete_ownerActionPerformed

    private void btn_refresh_ownerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refresh_ownerActionPerformed
        fillJtableWithOwnersData();        
    }//GEN-LAST:event_btn_refresh_ownerActionPerformed

    private void txt_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lnameActionPerformed

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void jTable_ownerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ownerMouseClicked
        int selectedRowIndex = jTable_owner.getSelectedRow();
        
        txt_id.setText(jTable_owner.getValueAt(selectedRowIndex, 0).toString());
        txt_fname.setText(jTable_owner.getValueAt(selectedRowIndex, 1).toString());
        txt_lname.setText(jTable_owner.getValueAt(selectedRowIndex, 2).toString());
        txt_phone.setText(jTable_owner.getValueAt(selectedRowIndex, 3).toString());
        txt_email.setText(jTable_owner.getValueAt(selectedRowIndex, 4).toString());
        txt_address.setText(jTable_owner.getValueAt(selectedRowIndex, 5).toString());
    }//GEN-LAST:event_jTable_ownerMouseClicked

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
            java.util.logging.Logger.getLogger(Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Owner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_owner;
    private javax.swing.JButton btn_delete_owner;
    private javax.swing.JButton btn_edit_owner;
    private javax.swing.JButton btn_refresh_owner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_owner;
    private javax.swing.JTextArea txt_address;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables
}
