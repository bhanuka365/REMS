
package View;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;



public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        
        //Center the form
        this.setLocationRelativeTo(null);
        
      
        
       
     
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_image1 = new javax.swing.JLabel();
        jLabel_title = new javax.swing.JLabel();
        jLabel_password = new javax.swing.JLabel();
        jLabel_username = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        pass_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_image1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel_image1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/building.png"))); // NOI18N
        jLabel_image1.setOpaque(true);

        jLabel_title.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(0, 153, 204));
        jLabel_title.setText("LOGIN");
        jLabel_title.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 0, 0)));

        jLabel_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/key.png"))); // NOI18N

        jLabel_username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N

        txt_username.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_username.setForeground(new java.awt.Color(204, 204, 204));
        txt_username.setText("username");
        txt_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_usernameFocusLost(evt);
            }
        });
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        pass_password.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        pass_password.setForeground(new java.awt.Color(204, 204, 204));
        pass_password.setText("password");
        pass_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass_passwordFocusLost(evt);
            }
        });

        btn_login.setBackground(new java.awt.Color(76, 193, 255));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.setBorder(null);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_image1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jLabel_title))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel_username, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel_password, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pass_password)))))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_image1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass_password))
                        .addGap(64, 64, 64)
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        
        
      Connection connection;
      PreparedStatement ps;
      
      try{
          connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/rems","root","");
          ps=connection.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
          ps.setString(1, txt_username.getText());
          ps.setString(2,String.valueOf(pass_password.getPassword()));
          ResultSet rs = ps.executeQuery();
          
          if(rs.next())
          {
              Dashboard dash = new Dashboard ();
              dash.setVisible(true);
              dash.pack();
              dash.setExtendedState(JFrame.MAXIMIZED_BOTH);
              this.dispose();
              
          }
          else
          {
              JOptionPane.showMessageDialog(this, "ERROR");
          }}
          
          catch(SQLException ex)
                  {
                  Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                  }
      
      
       
       
        
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusGained
        if(txt_username.getText().trim().toLowerCase().equals("username"))
        {
            txt_username.setText("");
            txt_username.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_usernameFocusGained

    private void txt_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusLost

            if(txt_username.getText().trim().equals("") || (txt_username.getText().trim().toLowerCase().equals("username")))
                    {
                        txt_username.setText("username");
                        txt_username.setForeground(new Color(204,204,204));
                    }

    }//GEN-LAST:event_txt_usernameFocusLost

    private void pass_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_passwordFocusGained

        String password=String.valueOf(pass_password.getPassword());
        
        if(password.trim().toLowerCase().equals("password"))
        {
            pass_password.setText("");
            pass_password.setForeground(Color.black);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_pass_passwordFocusGained

    private void pass_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_passwordFocusLost
        
        String password=String.valueOf(pass_password.getPassword());
        if(password.trim().equals("") || password.trim().toLowerCase().equals("password"))
        {
         pass_password.setText("password");
         pass_password.setForeground(new Color(204,204,204));
        }
        
    }//GEN-LAST:event_pass_passwordFocusLost

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel_image1;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
