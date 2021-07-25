/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceAdministrator;

import InterfaceDocente.*;
import Procesos.*;
import Login.Colegio;
import javax.swing.JOptionPane;

/**
 *
 * @author IVÁN UTRIA
 */
public class RegistrarLiquidacion extends javax.swing.JFrame {

    boolean panel;
    String documento;
    
    public RegistrarLiquidacion() {
        initComponents();
       cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        BotonInicio = new javax.swing.JButton();
        textoMateria = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        textoLiquidacion = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botonInicio = new javax.swing.JButton();
        textoTitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        BotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonInicio.png"))); // NOI18N
        BotonInicio.setToolTipText("Regresar al Inico");
        BotonInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        BotonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BotonInicioMouseMoved(evt);
            }
        });
        BotonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COLEGIO PROGRAMARTE");
        getContentPane().setLayout(null);

        textoMateria.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        textoMateria.setForeground(new java.awt.Color(255, 255, 255));
        textoMateria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoMateria.setText("ADMINISTRADOR");
        getContentPane().add(textoMateria);
        textoMateria.setBounds(580, 460, 200, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo2.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 460, 170, 30);

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

        tabla = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        tabla.setBackground(new java.awt.Color(0, 51, 102));
        tabla.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 780, 200);

        textoLiquidacion.setBackground(new java.awt.Color(0, 51, 102));
        textoLiquidacion.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        textoLiquidacion.setForeground(new java.awt.Color(255, 255, 255));
        textoLiquidacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textoLiquidacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        textoLiquidacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoLiquidacionKeyTyped(evt);
            }
        });
        getContentPane().add(textoLiquidacion);
        textoLiquidacion.setBounds(280, 330, 200, 40);

        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.png"))); // NOI18N
        botonGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        botonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonGuardarMouseMoved(evt);
            }
        });
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardar);
        botonGuardar.setBounds(490, 330, 110, 40);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("$");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 330, 60, 40);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("INICIO / MAS OPCIONES / REGISTRAR LIQUDACIÓN");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 430, 780, 14);

        botonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonInicio.png"))); // NOI18N
        botonInicio.setToolTipText("Regresar al Inico");
        botonInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        botonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonInicioMouseMoved(evt);
            }
        });
        botonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioActionPerformed(evt);
            }
        });
        getContentPane().add(botonInicio);
        botonInicio.setBounds(60, 10, 43, 40);

        textoTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        textoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        textoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoTitulo.setText("REGISTRAR LIQUIDACIÓN DE DOCENTE");
        getContentPane().add(textoTitulo);
        textoTitulo.setBounds(330, 10, 460, 40);

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
        botonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonInicio.png")));
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.png")));
    }//GEN-LAST:event_jLabel3MouseMoved

    private void botonAtrasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseMoved
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAtrasDos.png")));
    }//GEN-LAST:event_botonAtrasMouseMoved

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        MasOpciones mostrar = new MasOpciones();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonAtrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonAtrasKeyTyped

    }//GEN-LAST:event_botonAtrasKeyTyped

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        cambiar();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void textoLiquidacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoLiquidacionKeyTyped
        if(textoLiquidacion.getText().equals("") && evt.getKeyChar()==46){
            getToolkit().beep();
            evt.consume();
        }
        impedirNumeros(evt);
    }//GEN-LAST:event_textoLiquidacionKeyTyped

    private void botonGuardarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarMouseMoved
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardarDos.png")));
    }//GEN-LAST:event_botonGuardarMouseMoved

    private void BotonInicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioMouseMoved
        BotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonInicioDos.png")));
    }//GEN-LAST:event_BotonInicioMouseMoved

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        Administrador mostrar = new Administrador();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonInicioActionPerformed

    private void botonInicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioMouseMoved
        botonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonInicioDos.png")));
    }//GEN-LAST:event_botonInicioMouseMoved

    private void botonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioActionPerformed
        Administrador mostrar = new Administrador();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonInicioActionPerformed
    private void impedirNumeros(java.awt.event.KeyEvent evt){
        char validar = evt.getKeyChar();
        
        if(validar!=48 && validar!=49 && validar!=50 
        && validar!=51 && validar!=52 && validar!=53
        && validar!=54 && validar!=55
        && validar!=56 && validar!=57
        && validar!=127 && validar!=8)
        {
            getToolkit().beep();
            evt.consume();
        }
    }
// </editor-fold>
    
    private void cargarTabla(){
        tabla.setModel(new CargarTabla().tablaLiquidacionDocentes());
    }
    private void cambiar(){
        String documento=null;
        if(textoLiquidacion.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DEBE DIGITAR UN VALOR","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                documento = tabla.getValueAt(tabla.getSelectedRow(), 1).toString();
                new ActualizarDatos().registrarLiquidacion(documento, textoLiquidacion.getText());
                JOptionPane.showMessageDialog(rootPane, "DATOS GUARDADOS NUEVO SALDO $"+textoLiquidacion.getText(),"EXITO",JOptionPane.INFORMATION_MESSAGE);
                textoLiquidacion.setText("");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "DEBE SELECCIONAR UN DOCENTE","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        cargarTabla();
    }
    
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
            java.util.logging.Logger.getLogger(RegistrarLiquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarLiquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarLiquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarLiquidacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RegistrarLiquidacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textoLiquidacion;
    private javax.swing.JLabel textoMateria;
    private javax.swing.JLabel textoTitulo;
    // End of variables declaration//GEN-END:variables
}
