/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_ordering_delivery_system_project;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;


/**
 *
 * @author hp
 */
public class Cheif_Job extends javax.swing.JFrame {

    private final String url = "jdbc:sqlserver://localhost\\ABDO_HARB_HOSSAM;"
            + "databaseName=My_Ordering_Delivery_System_Project;"
            + "user=sa;"
            + "password=sql2020$$;";
    /**
     * Creates new form Cheif_Job
     */
    public Cheif_Job() {
        initComponents();
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Cannot Load JDBC Driver !!!");
        }
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_ORDER = new javax.swing.JTable();
        jbtnRefresh = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jTable_ORDER.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "Price"
            }
        ));
        jScrollPane2.setViewportView(jTable_ORDER);

        jbtnRefresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnRefresh.setText("Refersh");
        jbtnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRefreshActionPerformed(evt);
            }
        });

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jbtnConfirm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnConfirm.setText("Confirm");
        jbtnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
        My_Cheif MC = new My_Cheif();
        MC.show();
        dispose();
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRefreshActionPerformed
        // TODO add your handling code here:
        
          // DefaultTableModel model = (DefaultTableModel) jTable_ORDER.getModel(); //call for edit jTable
        
        
        
        
        
      
         Connection con =null;
         Statement stmt =null;
         ResultSet result = null;
         
         try{
             con = DriverManager.getConnection(url);
             stmt = con.createStatement();
             String query = "SELECT * FROM ORDERS WHERE Quantity='1';";
            result = stmt.executeQuery(query);
            
            if(result.next()){
                String Item = result.getString("Item");
                String Quantity = result.getString("Quantity");
                String Price = String.valueOf(result.getDouble("Price"));
                
                String tableModel[] ={Item,Quantity,Price};
                DefaultTableModel model = (DefaultTableModel) jTable_ORDER.getModel();
                model.addRow(tableModel);
                
                 JOptionPane.showMessageDialog(this," Order(s) Successful Insertion !!! ");
            }
             else
             {
                 JOptionPane.showMessageDialog(this, "There is no Orders !!!");
             }
         }
         catch(Exception ex)
         {
             JOptionPane.showMessageDialog(this, ex.getMessage());
         }
         finally
         {
           if(con!=null){try{ con.close(); }catch(Exception ex){}}
           if(stmt!=null){try{ stmt.close(); }catch(Exception ex){}}
         } 
        
        
        
        
    }//GEN-LAST:event_jbtnRefreshActionPerformed

    private void jbtnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfirmActionPerformed
        // TODO add your handling code here:
        
         
        DefaultTableModel model = (DefaultTableModel) jTable_ORDER.getModel(); //call for edit jTable
        Object orders = jTable_ORDER.getSelectedRow();
        
        model.setRowCount(0);//remove all rows and start from one
        
        
      //step #2: delete
         Connection con =null;
         Statement stmt =null;
         
         try{
             con = DriverManager.getConnection(url);
             stmt = con.createStatement();
             String query = "DELETE FROM ORDERS WHERE Quantity='1';";
             int affectedRows = stmt.executeUpdate(query);
             if(affectedRows >= 1)
             {
                 JOptionPane.showMessageDialog(this, affectedRows +" Order(s) Successful Deletation !!! ");
             }
             else
             {
                 JOptionPane.showMessageDialog(this, "There is no Orders !!!");
             }
         }
         catch(Exception ex)
         {
             JOptionPane.showConfirmDialog(this, ex.getMessage());
         }
         finally
         {
           if(con!=null){try{ con.close(); }catch(Exception ex){}}
           if(stmt!=null){try{ stmt.close(); }catch(Exception ex){}}
         } 
        
    }//GEN-LAST:event_jbtnConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(Cheif_Job.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cheif_Job.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cheif_Job.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cheif_Job.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cheif_Job().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_ORDER;
    private javax.swing.JButton jbtnConfirm;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnRefresh;
    // End of variables declaration//GEN-END:variables
}
