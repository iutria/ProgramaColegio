/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceDocente;

import Procesos.*;
import Login.Colegio;

/**
 *
 * @author IVÁN UTRIA
 */
public class Liquidacion extends javax.swing.JFrame {

    boolean panel;
    String documento;
    
    public Liquidacion() {
        initComponents();
        
    }
    public Liquidacion(String documento){
        initComponents();
        this.documento=documento;
        textoMateria.setText(new BuscarPersona().buscarNombreMateria(documento));
        textoSaldo.setText("$"+new BuscarPersona().buscarLiquidacion(documento));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        textoMateria = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textoSaldo = new javax.swing.JLabel();
        botonAtras = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COLEGIO PROGRAMARTE");
        getContentPane().setLayout(null);

        textoMateria.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        textoMateria.setForeground(new java.awt.Color(255, 255, 255));
        textoMateria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoMateria.setText("DOCENTE");
        getContentPane().add(textoMateria);
        textoMateria.setBounds(580, 460, 200, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo2.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 460, 170, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SU SALDO ES:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 140, 280, 30);

        textoSaldo.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        textoSaldo.setForeground(new java.awt.Color(255, 255, 255));
        textoSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoSaldo.setText("0");
        getContentPane().add(textoSaldo);
        textoSaldo.setBounds(250, 190, 280, 130);

        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAtras.png"))); // NOI18N
        botonAtras.setToolTipText("Atras");
        botonAtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        botonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAtras.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonAtrasMouseMoved(evt);
            }
        });
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        botonAtras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                botonAtrasKeyTyped(evt);
            }
        });
        getContentPane().add(botonAtras);
        botonAtras.setBounds(10, 10, 40, 39);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("INICIO / VER LIQUIDACIÓN");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 430, 780, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background.png"))); // NOI18N
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel3MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 800, 500);

        setSize(new java.awt.Dimension(816, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="ACCION BOTONES">  
    
    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAtras.png")));
    }//GEN-LAST:event_jLabel3MouseMoved

    private void botonAtrasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseMoved
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAtrasDos.png")));
    }//GEN-LAST:event_botonAtrasMouseMoved

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        InicioDocente mostrar = new InicioDocente(documento);
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonAtrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonAtrasKeyTyped

    }//GEN-LAST:event_botonAtrasKeyTyped
    // </editor-fold>
    
    
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
            java.util.logging.Logger.getLogger(Liquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Liquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Liquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Liquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Liquidacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel textoMateria;
    private javax.swing.JLabel textoSaldo;
    // End of variables declaration//GEN-END:variables
}
