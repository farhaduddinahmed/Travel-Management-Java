/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Farhad
 */
public class tourpedia extends javax.swing.JFrame {

    /**
     * Creates new form tourpedia
     */
    public tourpedia() {
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
        nyc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        airwaysbtn2 = new javax.swing.JButton();
        signinbtn2 = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        bangladesh = new javax.swing.JButton();
        singapore = new javax.swing.JButton();
        dubai = new javax.swing.JButton();
        india = new javax.swing.JButton();
        nepal = new javax.swing.JButton();
        uk = new javax.swing.JButton();
        malaysia = new javax.swing.JButton();
        thailand = new javax.swing.JButton();
        ana = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_11red-wallpaper-1fd.jpg"))); // NOI18N

        nyc.setBackground(new java.awt.Color(65, 131, 215));
        nyc.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        nyc.setForeground(new java.awt.Color(255, 255, 0));
        nyc.setText("New Yourk");
        nyc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nycActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select  an area for details");

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

        homebtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        homebtn.setText("Home");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        bangladesh.setBackground(new java.awt.Color(65, 131, 215));
        bangladesh.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bangladesh.setForeground(new java.awt.Color(204, 0, 0));
        bangladesh.setText("Bangladesh");
        bangladesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangladeshActionPerformed(evt);
            }
        });

        singapore.setBackground(new java.awt.Color(65, 131, 215));
        singapore.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        singapore.setForeground(new java.awt.Color(204, 204, 204));
        singapore.setText("Singapore");
        singapore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singaporeActionPerformed(evt);
            }
        });

        dubai.setBackground(new java.awt.Color(65, 131, 215));
        dubai.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        dubai.setForeground(new java.awt.Color(51, 51, 51));
        dubai.setText("Dubai");
        dubai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dubaiActionPerformed(evt);
            }
        });

        india.setBackground(new java.awt.Color(65, 131, 215));
        india.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        india.setForeground(new java.awt.Color(255, 255, 255));
        india.setText("India");
        india.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indiaActionPerformed(evt);
            }
        });

        nepal.setBackground(new java.awt.Color(65, 131, 215));
        nepal.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        nepal.setForeground(new java.awt.Color(255, 255, 255));
        nepal.setText("Nepal");
        nepal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nepalActionPerformed(evt);
            }
        });

        uk.setBackground(new java.awt.Color(65, 131, 215));
        uk.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        uk.setForeground(new java.awt.Color(204, 0, 0));
        uk.setText("London");
        uk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ukActionPerformed(evt);
            }
        });

        malaysia.setBackground(new java.awt.Color(65, 131, 215));
        malaysia.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        malaysia.setForeground(new java.awt.Color(255, 255, 255));
        malaysia.setText("Malaysia");
        malaysia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malaysiaActionPerformed(evt);
            }
        });

        thailand.setBackground(new java.awt.Color(65, 131, 215));
        thailand.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        thailand.setForeground(new java.awt.Color(153, 0, 51));
        thailand.setText("Thailand");
        thailand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thailandActionPerformed(evt);
            }
        });

        ana.setBackground(new java.awt.Color(65, 131, 215));
        ana.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        ana.setForeground(new java.awt.Color(255, 255, 0));
        ana.setText("Anahiem");
        ana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(airwaysbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(signinbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bangladesh)
                                .addGap(14, 14, 14)
                                .addComponent(india, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(malaysia, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(singapore, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(thailand, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dubai, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nyc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ana, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nepal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homebtn)
                    .addComponent(airwaysbtn2)
                    .addComponent(signinbtn2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bangladesh, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(india, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(malaysia, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(singapore, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thailand, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nepal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dubai, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(uk, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nyc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ana, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nycActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nycActionPerformed

        nycwiki nyw = new nycwiki();
        this.dispose();
        nyw.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_nycActionPerformed

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

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed

        packageselect pct = new packageselect();
        this.dispose();
        pct.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_homebtnActionPerformed

    private void bangladeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangladeshActionPerformed

        bdwiki bw = new bdwiki();
        this.dispose();
        bw.setVisible(true);             // TODO add your handling code here:
    }//GEN-LAST:event_bangladeshActionPerformed

    private void singaporeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singaporeActionPerformed

        singaporewiki sw = new singaporewiki();
        this.dispose();
        sw.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_singaporeActionPerformed

    private void dubaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dubaiActionPerformed

        dubaiwiki dw = new dubaiwiki();
        this.dispose();
        dw.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_dubaiActionPerformed

    private void indiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indiaActionPerformed

        indiawiki iw = new indiawiki();
        this.dispose();
        iw.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_indiaActionPerformed

    private void nepalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nepalActionPerformed

        nepalwiki nw = new nepalwiki();
        this.dispose();
        nw.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_nepalActionPerformed

    private void ukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ukActionPerformed

        londonwiki lw = new londonwiki();
        this.dispose();
        lw.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_ukActionPerformed

    private void malaysiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malaysiaActionPerformed

        malaysiawiki mw = new malaysiawiki();
        this.dispose();
        mw.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_malaysiaActionPerformed

    private void thailandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thailandActionPerformed
        thailandwiki tw = new thailandwiki();
        this.dispose();
        tw.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_thailandActionPerformed

    private void anaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anaActionPerformed
            anahiemwiki anaw = new anahiemwiki();
            this.dispose();
            anaw.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_anaActionPerformed

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
            java.util.logging.Logger.getLogger(tourpedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tourpedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tourpedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tourpedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tourpedia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton airwaysbtn2;
    private javax.swing.JButton ana;
    private javax.swing.JButton bangladesh;
    private javax.swing.JButton dubai;
    private javax.swing.JButton homebtn;
    private javax.swing.JButton india;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton malaysia;
    private javax.swing.JButton nepal;
    private javax.swing.JButton nyc;
    private javax.swing.JButton signinbtn2;
    private javax.swing.JButton singapore;
    private javax.swing.JButton thailand;
    private javax.swing.JButton uk;
    // End of variables declaration//GEN-END:variables
}
