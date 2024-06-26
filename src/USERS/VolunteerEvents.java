/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USERS;

import Admin.*;
import Config.DbConnector;
import Config.Session;
import LoginDash.LoginForm;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author AJ
 */
public class VolunteerEvents extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public VolunteerEvents() {
        initComponents();
        displayData();
    }
    public void displayData(){
        try{
            DbConnector dbc = new DbConnector();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_event");
            vlntrtbl.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
        }
        
    
    }
    
        Color sidecolor = new Color(0,153,51);
        Color headcolor = new Color(0,102,0);
        Color bodycolor = new Color(204,255,204);

    
    public static boolean loginAcc(String username, String password){
        DbConnector connector = new DbConnector();
        try{
            String query = "SELECT * FROM tbl_user  WHERE username = '" + username + "' AND password = '" + password + "'";
            ResultSet resultSet = connector.getData(query);
            return resultSet.next();
        }catch (SQLException ex) {
            return false;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        acc_user = new javax.swing.JLabel();
        acc_lname = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        view = new javax.swing.JButton();
        view1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vlntrtbl = new javax.swing.JTable();
        view2 = new javax.swing.JButton();
        view3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/event.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 141, 140));

        acc_user.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        acc_user.setForeground(new java.awt.Color(255, 255, 255));
        acc_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(acc_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, 30));

        acc_lname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        acc_lname.setForeground(new java.awt.Color(255, 255, 255));
        acc_lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(acc_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, 30));

        logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8-logout-24.png"))); // NOI18N
        logout.setText(" Logout");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 160, 40));

        view.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        view.setForeground(new java.awt.Color(0, 102, 0));
        view.setText("VIEW");
        view.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMouseClicked(evt);
            }
        });
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel2.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, -1));

        view1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        view1.setForeground(new java.awt.Color(0, 102, 0));
        view1.setText("REPORTS");
        view1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view1MouseClicked(evt);
            }
        });
        view1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view1ActionPerformed(evt);
            }
        });
        jPanel2.add(view1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 100, -1));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 40, 160, 510);

        jPanel3.setBackground(new java.awt.Color(0, 102, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("VOLUNTEERING EVENTS");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 370, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/icons8-arrow-back-24 (1).png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 30, 40));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 950, 40);

        vlntrtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vlntrtblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(vlntrtbl);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(180, 50, 640, 310);

        view2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        view2.setForeground(new java.awt.Color(0, 102, 0));
        view2.setText("ACCEPT");
        view2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view2MouseClicked(evt);
            }
        });
        view2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view2ActionPerformed(evt);
            }
        });
        jPanel1.add(view2);
        view2.setBounds(580, 400, 100, 29);

        view3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        view3.setForeground(new java.awt.Color(0, 102, 0));
        view3.setText("DECLINE");
        view3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view3MouseClicked(evt);
            }
        });
        view3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view3ActionPerformed(evt);
            }
        });
        jPanel1.add(view3);
        view3.setBounds(700, 400, 100, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sn = Session.getInstance();  
        if(sn.getUid()==0){
            JOptionPane.showMessageDialog(null,"No Account, Login Frist","Warning", JOptionPane.WARNING_MESSAGE);
            LoginForm lf = new LoginForm();
            lf.setVisible(true);
            this.dispose();
        }else{
           acc_user.setText(""+sn.getFname());
           acc_lname.setText(""+sn.getLname());
        } 
    }//GEN-LAST:event_formWindowActivated

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        int a = JOptionPane.showConfirmDialog(null,"Are you sure you want to logout?", "Confirm Logout", JOptionPane.YES_NO_OPTION);
        LoginForm uf = new LoginForm();
        uf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked
         int rowIndex = vlntrtbl.getSelectedRow();
        
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null,"Please select an Item","Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            try{
                DbConnector dbc = new DbConnector();
                TableModel tbl = vlntrtbl.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_event WHERE e_id = '"+tbl.getValueAt(rowIndex, 0)+"'");
                if(rs.next()){
                 VolunteerInfo vys = new VolunteerInfo();
                
                 vys.eid.setText(""+rs.getString("e_id"));
                 vys.ename.setText(""+rs.getString("e_name"));
                 vys.eloc.setText(""+rs.getString("e_location"));
                 vys.edate.setText(""+rs.getString("e_sdate")); 
                 vys.estatus.setText(""+rs.getString("e_status"));
                 
                 vys.image.setIcon(vys.ResizeImage(rs.getString("e_image"),null,vys.image));
                 vys.setVisible(true);
                 this.dispose();
            }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }
        }
             
        
    }//GEN-LAST:event_viewMouseClicked

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewActionPerformed

    private void vlntrtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vlntrtblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_vlntrtblMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        UserDash ud = new UserDash();
        ud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void view1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_view1MouseClicked

    private void view1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_view1ActionPerformed

    private void view2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_view2MouseClicked

    private void view2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_view2ActionPerformed

    private void view3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_view3MouseClicked

    private void view3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_view3ActionPerformed

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
            java.util.logging.Logger.getLogger(VolunteerEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VolunteerEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VolunteerEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VolunteerEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VolunteerEvents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_lname;
    private javax.swing.JLabel acc_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JButton view;
    private javax.swing.JButton view1;
    private javax.swing.JButton view2;
    private javax.swing.JButton view3;
    public javax.swing.JTable vlntrtbl;
    // End of variables declaration//GEN-END:variables
}
