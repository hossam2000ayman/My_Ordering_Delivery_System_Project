/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_ordering_delivery_system_project;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class My_Customer extends javax.swing.JFrame {

    /**
     * Creates new form My_Customer
     */
    public My_Customer() {
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

        jLabel1 = new javax.swing.JLabel();
        jbtn_Customer = new javax.swing.JButton();
        jbtnSystem_User = new javax.swing.JButton();
        jbtnCheif = new javax.swing.JButton();
        jbtnDelivery_Man = new javax.swing.JButton();
        jbtnAdminstratour = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Choose Your Actor ");

        jbtn_Customer.setBackground(new java.awt.Color(255, 255, 255));
        jbtn_Customer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn_Customer.setText("Customer");
        jbtn_Customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_CustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtn_CustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtn_CustomerMouseExited(evt);
            }
        });
        jbtn_Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_CustomerActionPerformed(evt);
            }
        });

        jbtnSystem_User.setBackground(new java.awt.Color(255, 255, 255));
        jbtnSystem_User.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnSystem_User.setText("System User");
        jbtnSystem_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnSystem_UserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnSystem_UserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnSystem_UserMouseExited(evt);
            }
        });
        jbtnSystem_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSystem_UserActionPerformed(evt);
            }
        });

        jbtnCheif.setBackground(new java.awt.Color(255, 255, 255));
        jbtnCheif.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnCheif.setText("Cheif");
        jbtnCheif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnCheifMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnCheifMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnCheifMouseExited(evt);
            }
        });
        jbtnCheif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCheifActionPerformed(evt);
            }
        });

        jbtnDelivery_Man.setBackground(new java.awt.Color(255, 255, 255));
        jbtnDelivery_Man.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnDelivery_Man.setText("Delivery Man");
        jbtnDelivery_Man.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnDelivery_ManMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnDelivery_ManMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnDelivery_ManMouseExited(evt);
            }
        });
        jbtnDelivery_Man.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDelivery_ManActionPerformed(evt);
            }
        });

        jbtnAdminstratour.setBackground(new java.awt.Color(255, 255, 255));
        jbtnAdminstratour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnAdminstratour.setText("Adminstratour");
        jbtnAdminstratour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnAdminstratourMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnAdminstratourMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnAdminstratourMouseExited(evt);
            }
        });
        jbtnAdminstratour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdminstratourActionPerformed(evt);
            }
        });

        jbtnExit.setBackground(new java.awt.Color(255, 255, 255));
        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnExitMouseExited(evt);
            }
        });
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtn_Customer)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnSystem_User)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnCheif, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnDelivery_Man)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnAdminstratour))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSystem_User, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCheif, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDelivery_Man, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAdminstratour, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_CustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_CustomerMouseClicked
        // TODO add your handling code here:
        jbtn_Customer.setBackground(Color.black);
        jbtn_Customer.setForeground(Color.white);
    }//GEN-LAST:event_jbtn_CustomerMouseClicked

    private void jbtn_CustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_CustomerMouseEntered
        // TODO add your handling code here:
        jbtn_Customer.setBackground(Color.DARK_GRAY);
        jbtn_Customer.setForeground(Color.white);
    }//GEN-LAST:event_jbtn_CustomerMouseEntered

    private void jbtn_CustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_CustomerMouseExited
        // TODO add your handling code here:
        jbtn_Customer.setBackground(Color.white);
        jbtn_Customer.setForeground(Color.black);
    }//GEN-LAST:event_jbtn_CustomerMouseExited

    private void jbtn_CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_CustomerActionPerformed
        // TODO add your handling code here:
        My_Login_Registeration MLR = new My_Login_Registeration();
        MLR.show();
        dispose();
    }//GEN-LAST:event_jbtn_CustomerActionPerformed

    private void jbtnSystem_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnSystem_UserMouseClicked
        // TODO add your handling code here:
        jbtnSystem_User.setBackground(Color.black);
        jbtnSystem_User.setForeground(Color.white);
    }//GEN-LAST:event_jbtnSystem_UserMouseClicked

    private void jbtnSystem_UserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnSystem_UserMouseEntered
        // TODO add your handling code here:
        jbtnSystem_User.setBackground(Color.DARK_GRAY);
        jbtnSystem_User.setForeground(Color.white);
    }//GEN-LAST:event_jbtnSystem_UserMouseEntered

    private void jbtnSystem_UserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnSystem_UserMouseExited
        // TODO add your handling code here:
        jbtnSystem_User.setBackground(Color.white);
        jbtnSystem_User.setForeground(Color.black);
    }//GEN-LAST:event_jbtnSystem_UserMouseExited

    private void jbtnCheifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCheifMouseClicked
        // TODO add your handling code here:
        jbtnCheif.setBackground(Color.white);
        jbtnCheif.setForeground(Color.black);
    }//GEN-LAST:event_jbtnCheifMouseClicked

    private void jbtnCheifMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCheifMouseEntered
        // TODO add your handling code here:
        jbtnCheif.setBackground(Color.DARK_GRAY);
        jbtnCheif.setForeground(Color.white);
    }//GEN-LAST:event_jbtnCheifMouseEntered

    private void jbtnCheifMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCheifMouseExited
        // TODO add your handling code here:
        jbtnCheif.setBackground(Color.white);
        jbtnCheif.setForeground(Color.black);
    }//GEN-LAST:event_jbtnCheifMouseExited

    private void jbtnDelivery_ManMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnDelivery_ManMouseClicked
        // TODO add your handling code here:
        jbtnDelivery_Man.setBackground(Color.white);
        jbtnDelivery_Man.setForeground(Color.black);
    }//GEN-LAST:event_jbtnDelivery_ManMouseClicked

    private void jbtnDelivery_ManMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnDelivery_ManMouseEntered
        // TODO add your handling code here:
        jbtnDelivery_Man.setBackground(Color.DARK_GRAY);
        jbtnDelivery_Man.setForeground(Color.white);
    }//GEN-LAST:event_jbtnDelivery_ManMouseEntered

    private void jbtnDelivery_ManMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnDelivery_ManMouseExited
        // TODO add your handling code here:
        jbtnDelivery_Man.setBackground(Color.white);
        jbtnDelivery_Man.setForeground(Color.black);
    }//GEN-LAST:event_jbtnDelivery_ManMouseExited

    private void jbtnAdminstratourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAdminstratourMouseClicked
        // TODO add your handling code here:
        jbtnAdminstratour.setBackground(Color.white);
        jbtnAdminstratour.setForeground(Color.black);
    }//GEN-LAST:event_jbtnAdminstratourMouseClicked

    private void jbtnAdminstratourMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAdminstratourMouseEntered
        // TODO add your handling code here:
        jbtnAdminstratour.setBackground(Color.DARK_GRAY);
        jbtnAdminstratour.setForeground(Color.white);
    }//GEN-LAST:event_jbtnAdminstratourMouseEntered

    private void jbtnAdminstratourMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAdminstratourMouseExited
        // TODO add your handling code here:
        jbtnAdminstratour.setBackground(Color.white);
        jbtnAdminstratour.setForeground(Color.black);
    }//GEN-LAST:event_jbtnAdminstratourMouseExited

    private void jbtnAdminstratourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdminstratourActionPerformed
        // TODO add your handling code here:
        My_Adminstratour MA = new My_Adminstratour();
        MA.show();
        dispose();
    }//GEN-LAST:event_jbtnAdminstratourActionPerformed

    private void jbtnDelivery_ManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDelivery_ManActionPerformed
        // TODO add your handling code here:
        My_Delivery_Man MDM = new My_Delivery_Man();
        MDM.show();
        dispose();
        
    }//GEN-LAST:event_jbtnDelivery_ManActionPerformed

    private void jbtnCheifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCheifActionPerformed
        // TODO add your handling code here:
        My_Cheif MC = new My_Cheif();
        MC.show();
        dispose();
    }//GEN-LAST:event_jbtnCheifActionPerformed

    private void jbtnSystem_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSystem_UserActionPerformed
        // TODO add your handling code here:
        systemuser MSU = new systemuser();
        MSU.show();
        dispose();
        
    }//GEN-LAST:event_jbtnSystem_UserActionPerformed

    private void jbtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnExitMouseClicked
        // TODO add your handling code here:
        jbtnExit.setBackground(Color.white);
        jbtnExit.setForeground(Color.black);
    }//GEN-LAST:event_jbtnExitMouseClicked

    private void jbtnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnExitMouseEntered
        // TODO add your handling code here:
        jbtnExit.setBackground(Color.DARK_GRAY);
        jbtnExit.setForeground(Color.white);
    }//GEN-LAST:event_jbtnExitMouseEntered

    private void jbtnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnExitMouseExited
        // TODO add your handling code here:
        jbtnExit.setBackground(Color.white);
        jbtnExit.setForeground(Color.black);
    }//GEN-LAST:event_jbtnExitMouseExited

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "You Sure want ot exit", "Check Out", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0); //optional
            //switch to checkout to any user ??what you choose

        }
    }//GEN-LAST:event_jbtnExitActionPerformed

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
            java.util.logging.Logger.getLogger(My_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(My_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(My_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(My_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new My_Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnAdminstratour;
    private javax.swing.JButton jbtnCheif;
    private javax.swing.JButton jbtnDelivery_Man;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnSystem_User;
    private javax.swing.JButton jbtn_Customer;
    // End of variables declaration//GEN-END:variables
}
