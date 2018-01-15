/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serveur;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

/**
 *
 * @author jules
 */
public class Acceuil_Server extends javax.swing.JFrame {

    /**
     * Creates new form Acceuil_Server
     */
    public Acceuil_Server() {
        initComponents();
        Thread t = new Thread(new Serveur());
        t.start();
    }

    private Dimension tailleEcranAdapté(){
        //get local graphics environment
        GraphicsEnvironment graphicsEnvironment =GraphicsEnvironment.getLocalGraphicsEnvironment();
        //get maximum window bounds
        Rectangle rectangle =graphicsEnvironment.getMaximumWindowBounds();
        Dimension dim = new Dimension((int)rectangle.getWidth(),(int)rectangle.getHeight());
        return dim;
    }
    
    private Dimension tailleConsole(){
        //get local graphics environment
        GraphicsEnvironment graphicsEnvironment =GraphicsEnvironment.getLocalGraphicsEnvironment();
        //get maximum window bounds
        Rectangle rectangle =graphicsEnvironment.getMaximumWindowBounds();
        Dimension dim = new Dimension(((int)rectangle.getWidth())/2,(int)rectangle.getHeight());
        return dim;
    }
    
    private Dimension tailleQuartEcran(){
        //get local graphics environment
        GraphicsEnvironment graphicsEnvironment =GraphicsEnvironment.getLocalGraphicsEnvironment();
        //get maximum window bounds
        Rectangle rectangle =graphicsEnvironment.getMaximumWindowBounds();
        Dimension dim = new Dimension(((int)rectangle.getWidth())/2,((int)rectangle.getHeight())/2);
        return dim;
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
        Console_serveur = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        Bouton_groupes = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Bouton_utilisateurs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(tailleEcranAdapté());

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setPreferredSize(tailleConsole());

        Console_serveur.setColumns(20);
        Console_serveur.setRows(5);
        jScrollPane1.setViewportView(Console_serveur);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1258, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 0, 153));
        jPanel2.setPreferredSize(tailleQuartEcran());
        jPanel2.setLayout(new java.awt.BorderLayout());

        Bouton_groupes.setText("Groupes");
        Bouton_groupes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_groupesActionPerformed(evt);
            }
        });
        jPanel2.add(Bouton_groupes, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(204, 255, 102));
        jPanel3.setPreferredSize(tailleQuartEcran());
        jPanel3.setLayout(new java.awt.BorderLayout());

        Bouton_utilisateurs.setText("Utilisateurs");
        Bouton_utilisateurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_utilisateursActionPerformed(evt);
            }
        });
        jPanel3.add(Bouton_utilisateurs, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1278, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bouton_utilisateursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_utilisateursActionPerformed
        new Gestionnaire_Utilisateurs().setVisible(true);
    }//GEN-LAST:event_Bouton_utilisateursActionPerformed

    private void Bouton_groupesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_groupesActionPerformed
        new Afficher_groupe().setVisible(true);
    }//GEN-LAST:event_Bouton_groupesActionPerformed

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
            java.util.logging.Logger.getLogger(Acceuil_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuil_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceuil_Server().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bouton_groupes;
    private javax.swing.JButton Bouton_utilisateurs;
    private javax.swing.JTextArea Console_serveur;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
