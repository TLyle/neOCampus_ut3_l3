/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_layout;



/**
 *
 * @author LYLE_
 */
public class Lay extends javax.swing.JFrame {
    String chaine = "";
    /**
     * Creates new form lay
     */
    public Lay() {
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

        panel_gauche = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        martine = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        brigitte = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rebecca = new javax.swing.JLabel();
        panel_bas = new javax.swing.JPanel();
        zone_ecriture = new javax.swing.JTextField();
        envoyer_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        zone_affichage = new javax.swing.JTextArea();
        menu_haut = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_gauche.setLayout(new java.awt.GridLayout(3, 1));

        jPanel1.setLayout(new java.awt.BorderLayout(5, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_utilisateur.png"))); // NOI18N
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        martine.setText("Martine");
        martine.setPreferredSize(new java.awt.Dimension(36, 20));
        jPanel1.add(martine, java.awt.BorderLayout.PAGE_END);

        panel_gauche.add(jPanel1);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_utilisateur.png"))); // NOI18N
        jPanel3.add(jLabel3, java.awt.BorderLayout.CENTER);

        brigitte.setText("Brigitte");
        jPanel3.add(brigitte, java.awt.BorderLayout.PAGE_END);

        panel_gauche.add(jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone_utilisateur.png"))); // NOI18N
        jPanel4.add(jLabel2, java.awt.BorderLayout.CENTER);

        rebecca.setText("Rebecca");
        jPanel4.add(rebecca, java.awt.BorderLayout.PAGE_END);

        panel_gauche.add(jPanel4);

        getContentPane().add(panel_gauche, java.awt.BorderLayout.LINE_START);

        panel_bas.setMinimumSize(new java.awt.Dimension(600, 30));

        zone_ecriture.setText("Taper votre texte");
        zone_ecriture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zone_ecritureActionPerformed(evt);
            }
        });

        envoyer_button.setText("Envoyer");
        envoyer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envoyer_buttonActionPerformed(evt);
            }
        });
        envoyer_button.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                envoyer_buttonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                envoyer_buttonKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panel_basLayout = new javax.swing.GroupLayout(panel_bas);
        panel_bas.setLayout(panel_basLayout);
        panel_basLayout.setHorizontalGroup(
            panel_basLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_basLayout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addComponent(zone_ecriture, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(envoyer_button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_basLayout.setVerticalGroup(
            panel_basLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_basLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel_basLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_basLayout.createSequentialGroup()
                        .addComponent(envoyer_button)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(zone_ecriture))
                .addContainerGap())
        );

        getContentPane().add(panel_bas, java.awt.BorderLayout.PAGE_END);

        zone_affichage.setEditable(false);
        zone_affichage.setColumns(20);
        zone_affichage.setRows(5);
        jScrollPane1.setViewportView(zone_affichage);
        zone_affichage.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");
        menu_haut.add(jMenu1);

        jMenu2.setText("Edit");
        menu_haut.add(jMenu2);

        setJMenuBar(menu_haut);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zone_ecritureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zone_ecritureActionPerformed
        chaine += zone_ecriture.getText() + "\n";
        zone_affichage.setText(chaine);
        zone_ecriture.setText("");
    }//GEN-LAST:event_zone_ecritureActionPerformed

    private void envoyer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envoyer_buttonActionPerformed
        chaine += zone_ecriture.getText() + "\n";
        zone_affichage.setText(chaine);
        zone_ecriture.setText("");
    }//GEN-LAST:event_envoyer_buttonActionPerformed

    private void envoyer_buttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_envoyer_buttonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_envoyer_buttonKeyPressed

    private void envoyer_buttonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_envoyer_buttonKeyReleased

    }//GEN-LAST:event_envoyer_buttonKeyReleased

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
            java.util.logging.Logger.getLogger(Lay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brigitte;
    private javax.swing.JButton envoyer_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel martine;
    private javax.swing.JMenuBar menu_haut;
    private javax.swing.JPanel panel_bas;
    private javax.swing.JPanel panel_gauche;
    private javax.swing.JLabel rebecca;
    private javax.swing.JTextArea zone_affichage;
    private javax.swing.JTextField zone_ecriture;
    // End of variables declaration//GEN-END:variables
}