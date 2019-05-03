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
public class singaporepack extends javax.swing.JFrame {

    /**
     * Creates new form singaporepack
     */
    public singaporepack() {
        initComponents();
    }

            String driver= "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String url= "jdbc:sqlserver://localhost\\singapore:1433;databaseName=travelmanagement";
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        pediabtn2 = new javax.swing.JButton();
        airwaysbtn2 = new javax.swing.JButton();
        signinbtn2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        useridtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        packnotxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        personnotxt = new javax.swing.JTextField();
        hotelcomb = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        aircombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ticketcombo = new javax.swing.JComboBox<>();
        datefrom = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtReceipt = new javax.swing.JTextArea();
        printbtn = new javax.swing.JButton();
        submitbtn = new javax.swing.JButton();
        aboutbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(958, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_11red-wallpaper-1fd.jpg"))); // NOI18N

        backbtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        homebtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        homebtn.setText("Home");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        pediabtn2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pediabtn2.setText("Tour Pedia");
        pediabtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pediabtn2ActionPerformed(evt);
            }
        });

        airwaysbtn2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        airwaysbtn2.setText("Airways");
        airwaysbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airwaysbtn2ActionPerformed(evt);
            }
        });

        signinbtn2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        signinbtn2.setText("Sign-in");
        signinbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbtn2ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("User ID");

        useridtxt.setBackground(new java.awt.Color(255, 255, 255));
        useridtxt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Package No.");

        packnotxt.setBackground(new java.awt.Color(255, 255, 255));
        packnotxt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Total Persons");

        personnotxt.setBackground(new java.awt.Color(255, 255, 255));
        personnotxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        personnotxt.setForeground(new java.awt.Color(0, 0, 0));

        hotelcomb.setBackground(new java.awt.Color(255, 255, 255));
        hotelcomb.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        hotelcomb.setForeground(new java.awt.Color(51, 51, 51));
        hotelcomb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Value Hotel Thomson", "Le Méridien" }));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Hotel");

        aircombo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        aircombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Airways", "Biman Bangladesh", "Emirates", "United Airways", "Thai Airways", "Kuwait Airways", "Malaysia Airways", "Bengal Airways", "Singapore Airlines", "Dragon Air" }));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Airways");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ticket Type");

        ticketcombo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ticketcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Economy Class", "Business Class", "Luxury" }));

        datefrom.setBackground(new java.awt.Color(255, 255, 255));
        datefrom.setForeground(new java.awt.Color(0, 0, 0));
        datefrom.setDateFormatString("yyyy-MM-dd");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Travel Date");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("From");

        jtxtReceipt.setBackground(new java.awt.Color(255, 255, 255));
        jtxtReceipt.setColumns(20);
        jtxtReceipt.setForeground(new java.awt.Color(0, 0, 0));
        jtxtReceipt.setRows(5);
        jScrollPane2.setViewportView(jtxtReceipt);

        printbtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        printbtn.setText("Print");
        printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbtnActionPerformed(evt);
            }
        });

        submitbtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        aboutbtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        aboutbtn.setForeground(new java.awt.Color(255, 255, 255));
        aboutbtn.setText("About");
        aboutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 12, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(backbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(aboutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pediabtn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(airwaysbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signinbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(useridtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(packnotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 623, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(personnotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addComponent(aircombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(hotelcomb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ticketcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datefrom, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(70, 134, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homebtn)
                    .addComponent(pediabtn2)
                    .addComponent(airwaysbtn2)
                    .addComponent(signinbtn2)
                    .addComponent(backbtn)
                    .addComponent(aboutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(useridtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(packnotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hotelcomb, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(personnotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ticketcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aircombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(datefrom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed

        packageselect pct = new packageselect();
        this.dispose();
        pct.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_homebtnActionPerformed

    private void pediabtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pediabtn2ActionPerformed
tourpedia tpda =new tourpedia();
            this.dispose();
            tpda.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_pediabtn2ActionPerformed

    private void airwaysbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airwaysbtn2ActionPerformed

        airticket act = new airticket();
        this.dispose();
        act.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_airwaysbtn2ActionPerformed

    private void signinbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbtn2ActionPerformed

        signin sin = new signin();
        this.dispose();
        sin.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_signinbtn2ActionPerformed

    private void aboutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutbtnActionPerformed

        about at = new about();
        this.dispose();
        at.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutbtnActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed

 
        try {
          
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String sql= "insert into singapore"
                    +"(User_ID,Package_No,Person,Airways,Ticket_Type,Hotel,Date_From)"
                    +"values(?,?,?,?,?,?,?)";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1,useridtxt.getText());
            pst.setString(2,packnotxt.getText());
            pst.setString(3,personnotxt.getText());
            String value = aircombo.getSelectedItem().toString();
            pst.setString(4,value);
            String values = ticketcombo.getSelectedItem().toString();
            pst.setString(5,values);
            String valuess = hotelcomb.getSelectedItem().toString();
            pst.setString(6,valuess);
            pst.setString(7,((JTextField)datefrom.getDateEditor().getUiComponent()).getText());
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Booked Successfully");
            
                 
                        
                        
// TODO add your handling code here:
        } catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                      JOptionPane.showMessageDialog(this,e.getMessage()); 
                }        // TODO add your handling code here:
    }//GEN-LAST:event_submitbtnActionPerformed

    private void printbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbtnActionPerformed


            String rUserid =(useridtxt.getText());
            String rPackageno=(packnotxt.getText());
            String rPerson=(personnotxt.getText());
            String rAirways = aircombo.getSelectedItem().toString();
            String rTicket = ticketcombo.getSelectedItem().toString();
            String rHotel = hotelcomb.getSelectedItem().toString();
            String rDate = ((JTextField)datefrom.getDateEditor().getUiComponent()).getText();
      	
        jtxtReceipt.append("\tAsian Holidays Ltd. \n\n"  
        
        +"\n\n\tUser ID: "+ rUserid
        +"\n\n\tSelected Package: "+ rPackageno
        +"\n\n\tTotal Person: "+ rPerson
        +"\n\n\tSelected Airways: "+ rAirways
        +"\n\n\tTicket Type: "+ rTicket 
        +"\n\n\tSelected Hotel: "+ rHotel
        +"\n\n\tTraveling Date: "+ rDate 
       
        
        +"\n\n\n\tThanks for Choosing us"
        
        
     );
          

        // TODO add your handling code here:
    }//GEN-LAST:event_printbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed

singapore sgp = new singapore();
this.dispose();
sgp.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_backbtnActionPerformed

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
            java.util.logging.Logger.getLogger(singaporepack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(singaporepack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(singaporepack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(singaporepack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new singaporepack().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutbtn;
    private javax.swing.JComboBox<String> aircombo;
    private javax.swing.JButton airwaysbtn2;
    private javax.swing.JButton backbtn;
    private com.toedter.calendar.JDateChooser datefrom;
    private javax.swing.JButton homebtn;
    private javax.swing.JComboBox<String> hotelcomb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jtxtReceipt;
    private javax.swing.JTextField packnotxt;
    private javax.swing.JButton pediabtn2;
    private javax.swing.JTextField personnotxt;
    private javax.swing.JButton printbtn;
    private javax.swing.JButton signinbtn2;
    private javax.swing.JButton submitbtn;
    private javax.swing.JComboBox<String> ticketcombo;
    private javax.swing.JTextField useridtxt;
    // End of variables declaration//GEN-END:variables
}