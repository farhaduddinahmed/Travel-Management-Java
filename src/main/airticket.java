/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Farhad
 */
public class airticket extends javax.swing.JFrame {

    /**
     * Creates new form airticket
     */
    public airticket() {
        initComponents();
    }

            String driver= "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String url= "jdbc:sqlserver://localhost:1433;databaseName=travelmanagement";
            String user="sa";
            String pass="12345";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        useridtxt3 = new javax.swing.JTextField();
        countrycombo = new javax.swing.JComboBox<>();
        aircombo3 = new javax.swing.JComboBox<>();
        datefrom3 = new com.toedter.calendar.JDateChooser();
        submitbtn = new javax.swing.JButton();
        cancelbtn2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ticketcombo3 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        personnotxt3 = new javax.swing.JTextField();
        pediabtn2 = new javax.swing.JButton();
        signinbtn2 = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(960, 700));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_11red-wallpaper-1fd.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/air logo.JPG"))); // NOI18N

        useridtxt3.setBackground(new java.awt.Color(255, 255, 255));
        useridtxt3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        useridtxt3.setForeground(new java.awt.Color(0, 0, 0));

        countrycombo.setBackground(new java.awt.Color(255, 255, 255));
        countrycombo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        countrycombo.setForeground(new java.awt.Color(51, 51, 51));
        countrycombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Country", "Bangladesh", "Singapore", "Thailand", "Malaysia", "Dubai", "China", "United State", "England", "India", "Nepal" }));

        aircombo3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        aircombo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Airways", "Biman Bangladesh", "Emirates", "United Airways", "Thai Airways", "Kuwait Airways", "Malaysia Airways", "Bengal Airways", "Singapore Airlines", "Dragon Air" }));

        datefrom3.setBackground(new java.awt.Color(255, 255, 255));
        datefrom3.setForeground(new java.awt.Color(0, 0, 0));

        submitbtn.setBackground(new java.awt.Color(255, 255, 255));
        submitbtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        submitbtn.setForeground(new java.awt.Color(0, 0, 0));
        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        cancelbtn2.setBackground(new java.awt.Color(255, 255, 255));
        cancelbtn2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cancelbtn2.setForeground(new java.awt.Color(0, 0, 0));
        cancelbtn2.setText("Cancel");
        cancelbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtn2ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Note: You have to book Tickets Five days before your travel date");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Country");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Travel Date");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("User ID");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Airways");

        ticketcombo3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ticketcombo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Economy Class", "Business Class", "Luxury" }));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ticket Type");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Total Person");

        personnotxt3.setBackground(new java.awt.Color(255, 255, 255));
        personnotxt3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        personnotxt3.setForeground(new java.awt.Color(0, 0, 0));

        pediabtn2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pediabtn2.setText("Tour Pedia");
        pediabtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pediabtn2ActionPerformed(evt);
            }
        });

        signinbtn2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        signinbtn2.setText("Sign-in");
        signinbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbtn2ActionPerformed(evt);
            }
        });

        homebtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        homebtn.setText("Home");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(countrycombo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(useridtxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(personnotxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(datefrom3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aircombo3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ticketcombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pediabtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signinbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homebtn)
                    .addComponent(pediabtn2)
                    .addComponent(signinbtn2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(useridtxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(countrycombo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(personnotxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(datefrom3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(aircombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ticketcombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtn2ActionPerformed

              
                  packageselect pkst = new packageselect();
                  this.dispose();
                  pkst.setVisible(true); 

        // TODO add your handling code here:
    }//GEN-LAST:event_cancelbtn2ActionPerformed

    private void pediabtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pediabtn2ActionPerformed
tourpedia tpda =new tourpedia();
            this.dispose();
            tpda.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_pediabtn2ActionPerformed

    private void signinbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbtn2ActionPerformed

        signin sin = new signin();
        this.dispose();
        sin.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_signinbtn2ActionPerformed

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed

        packageselect pct = new packageselect();
        this.dispose();
        pct.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_homebtnActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed


            try {

            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String sql= "insert into airticket"
            +"(User_ID,Country,Person,Airways,Ticket_Type,Date_From)"
            +"values(?,?,?,?,?,?)";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1,useridtxt3.getText());
            String value1 = countrycombo.getSelectedItem().toString();
            pst.setString(2,value1);
            pst.setString(3,personnotxt3.getText());
            String value = aircombo3.getSelectedItem().toString();
            pst.setString(4,value);
            String values = ticketcombo3.getSelectedItem().toString();
            pst.setString(5,values);
            pst.setString(6,((JTextField)datefrom3.getDateEditor().getUiComponent()).getText());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this,"Booked Successfully");

           packageselect pct = new packageselect();
           this.dispose();
           pct.setVisible(true);

            // TODO add your handling code here:
        } catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }     



        // TODO add your handling code here:
    }//GEN-LAST:event_submitbtnActionPerformed

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
            java.util.logging.Logger.getLogger(airticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(airticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(airticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(airticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new airticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aircombo3;
    private javax.swing.JButton cancelbtn2;
    private javax.swing.JComboBox<String> countrycombo;
    private com.toedter.calendar.JDateChooser datefrom3;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton pediabtn2;
    private javax.swing.JTextField personnotxt3;
    private javax.swing.JButton signinbtn2;
    private javax.swing.JButton submitbtn;
    private javax.swing.JComboBox<String> ticketcombo3;
    private javax.swing.JTextField useridtxt3;
    // End of variables declaration//GEN-END:variables


}
