/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceDocente;

import Procesos.*;
import Datos.MateriaDocente;
import Login.Colegio;
import Procesos.ManejarArchivos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author IVÁN UTRIA
 */
public class InicioDocente extends javax.swing.JFrame {

    boolean panel;
    String documento;
    boolean activacion;
    ArrayList<MateriaDocente> listaAsignatura;
    ManejarArchivos archivos;
    CambiarClave cambiarClave;
    
    public InicioDocente() {
        initComponents();
        
    }
    public InicioDocente(String usuario) {
        initComponents();
        documento = usuario;
        textoNombre.setText(new BuscarPersona().buscarNombreDocente(usuario));
        textoMateria.setText(new BuscarPersona().buscarNombreMateria(usuario));
        cargarAcciones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        botonComboMostrar = new javax.swing.JButton();
        botonComboOcultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        iconoLiquidacion = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();
        botonCambiarClave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JButton();
        iconoBotonRegistrar = new javax.swing.JLabel();
        botonRegistrarNotas = new javax.swing.JButton();
        botonLiquidacion = new javax.swing.JButton();
        textoMateria = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COLEGIO PROGRAMARTE");
        getContentPane().setLayout(null);

        botonComboMostrar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonComboMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/combo2.png"))); // NOI18N
        botonComboMostrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        botonComboMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonComboMostrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                botonComboMostrarMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonComboMostrarMouseMoved(evt);
            }
        });
        botonComboMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonComboMostrarMouseClicked(evt);
            }
        });
        getContentPane().add(botonComboMostrar);
        botonComboMostrar.setBounds(690, 20, 30, 30);

        botonComboOcultar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonComboOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/combo3.png"))); // NOI18N
        botonComboOcultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        botonComboOcultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonComboOcultar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                botonComboOcultarMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonComboOcultarMouseMoved(evt);
            }
        });
        botonComboOcultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonComboOcultarMouseClicked(evt);
            }
        });
        getContentPane().add(botonComboOcultar);
        botonComboOcultar.setBounds(690, 20, 30, 30);

        jLabel2.setBackground(new java.awt.Color(0, 51, 102));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccione.png"))); // NOI18N
        jLabel2.setText("  SELECCIONE");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(560, 20, 140, 30);

        iconoLiquidacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoLiquidacion.png"))); // NOI18N
        iconoLiquidacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoLiquidacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                iconoLiquidacionMouseMoved(evt);
            }
        });
        iconoLiquidacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoLiquidacionMouseClicked(evt);
            }
        });
        getContentPane().add(iconoLiquidacion);
        iconoLiquidacion.setBounds(460, 170, 120, 130);

        panelOpciones.setBackground(new java.awt.Color(0, 51, 102));
        panelOpciones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelOpcionesMouseMoved(evt);
            }
        });
        panelOpciones.setLayout(null);

        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        botonSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonSalirMouseMoved(evt);
            }
        });
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        panelOpciones.add(botonSalir);
        botonSalir.setBounds(0, 60, 160, 30);

        botonCambiarClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCambiarClaveDos.png"))); // NOI18N
        botonCambiarClave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        botonCambiarClave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCambiarClave.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCambiarClaveMouseMoved(evt);
            }
        });
        botonCambiarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarClaveActionPerformed(evt);
            }
        });
        panelOpciones.add(botonCambiarClave);
        botonCambiarClave.setBounds(0, 20, 160, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha.png"))); // NOI18N
        panelOpciones.add(jLabel1);
        jLabel1.setBounds(0, 10, 34, 14);

        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSalirDos.png"))); // NOI18N
        botonCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        botonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonCerrarMouseMoved(evt);
            }
        });
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });
        panelOpciones.add(botonCerrar);
        botonCerrar.setBounds(0, 100, 160, 30);

        getContentPane().add(panelOpciones);
        panelOpciones.setBounds(560, 50, 160, 130);

        iconoBotonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarNotas.png"))); // NOI18N
        iconoBotonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoBotonRegistrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                iconoBotonRegistrarMouseMoved(evt);
            }
        });
        iconoBotonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoBotonRegistrarMouseClicked(evt);
            }
        });
        getContentPane().add(iconoBotonRegistrar);
        iconoBotonRegistrar.setBounds(210, 170, 140, 130);

        botonRegistrarNotas.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        botonRegistrarNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textoRegistrarNotas.png"))); // NOI18N
        botonRegistrarNotas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        botonRegistrarNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistrarNotas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRegistrarNotasMouseMoved(evt);
            }
        });
        botonRegistrarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarNotasActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrarNotas);
        botonRegistrarNotas.setBounds(180, 310, 170, 40);

        botonLiquidacion.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        botonLiquidacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textoLiquidacion.png"))); // NOI18N
        botonLiquidacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        botonLiquidacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLiquidacion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonLiquidacionMouseMoved(evt);
            }
        });
        botonLiquidacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLiquidacionActionPerformed(evt);
            }
        });
        getContentPane().add(botonLiquidacion);
        botonLiquidacion.setBounds(430, 310, 170, 40);

        textoMateria.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        textoMateria.setForeground(new java.awt.Color(255, 255, 255));
        textoMateria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoMateria.setText("DOCENTE");
        getContentPane().add(textoMateria);
        textoMateria.setBounds(580, 460, 200, 30);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoUsuario.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(730, 10, 60, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo2.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 460, 170, 30);

        textoNombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        textoNombre.setForeground(new java.awt.Color(255, 255, 255));
        textoNombre.setText("--------------");
        getContentPane().add(textoNombre);
        textoNombre.setBounds(10, 20, 230, 20);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("INICIO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 430, 780, 14);

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
    private void cargarAcciones(){
        panelOpciones.setVisible(false);
        botonComboOcultar.setVisible(false);
        panel = false;
    }
    private void botonComboMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComboMostrarMouseClicked
        panelOpciones.setVisible(true);
        botonComboMostrar.setVisible(false);
        botonComboOcultar.setVisible(true);
    }//GEN-LAST:event_botonComboMostrarMouseClicked

    private void botonComboMostrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComboMostrarMouseMoved
        botonComboMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/combo4.png")));
    }//GEN-LAST:event_botonComboMostrarMouseMoved

    private void botonComboMostrarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComboMostrarMouseDragged
    }//GEN-LAST:event_botonComboMostrarMouseDragged
    
    private void botonComboOcultarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComboOcultarMouseDragged
    }//GEN-LAST:event_botonComboOcultarMouseDragged

    private void botonComboOcultarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComboOcultarMouseMoved
        botonComboOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/combo5.png")));
    }//GEN-LAST:event_botonComboOcultarMouseMoved

    private void botonComboOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComboOcultarMouseClicked
        panelOpciones.setVisible(false);
        botonComboMostrar.setVisible(true);
        botonComboOcultar.setVisible(false);
    }//GEN-LAST:event_botonComboOcultarMouseClicked

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        salir();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonRegistrarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarNotasActionPerformed
        mostrarRegistrarNotas();
    }//GEN-LAST:event_botonRegistrarNotasActionPerformed

    private void botonLiquidacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLiquidacionActionPerformed
        
    }//GEN-LAST:event_botonLiquidacionActionPerformed

    private void botonRegistrarNotasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarNotasMouseMoved
        botonRegistrarNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonRegistroNotasDos.png")));
    }//GEN-LAST:event_botonRegistrarNotasMouseMoved

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
        mostrarOcultar();
    }//GEN-LAST:event_jLabel3MouseMoved

    private void mostrarOcultar(){
        if(panel==true)
        {
            panelOpciones.setVisible(false);
            botonComboMostrar.setVisible(true);
            botonComboOcultar.setVisible(false);
        }
        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSalirDos.png")));
        botonRegistrarNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textoRegistrarNotas.png")));
        botonLiquidacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textoLiquidacion.png")));
        botonComboMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/combo2.png")));
        iconoBotonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarNotas.png")));
        botonComboOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/combo3.png")));
        botonCambiarClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCambiarClaveDos.png")));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png")));
        iconoLiquidacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoLiquidacion.png")));
    }
    
    private void botonLiquidacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLiquidacionMouseMoved
        botonLiquidacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/textoLiquidacionDos.png")));
    }//GEN-LAST:event_botonLiquidacionMouseMoved

    private void botonCambiarClaveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCambiarClaveMouseMoved
        botonCambiarClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCambiarClave.png")));
    }//GEN-LAST:event_botonCambiarClaveMouseMoved

    private void iconoBotonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoBotonRegistrarMouseClicked
        mostrarRegistrarNotas();
    }//GEN-LAST:event_iconoBotonRegistrarMouseClicked

    private void iconoLiquidacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoLiquidacionMouseClicked
        Liquidacion mostrar = new Liquidacion(documento);
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iconoLiquidacionMouseClicked

    private void iconoBotonRegistrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoBotonRegistrarMouseMoved
        iconoBotonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarNotasDos.png")));
    }//GEN-LAST:event_iconoBotonRegistrarMouseMoved

    private void botonSalirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseMoved
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salirDos.png")));
    }//GEN-LAST:event_botonSalirMouseMoved

    private void iconoLiquidacionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoLiquidacionMouseMoved
        iconoLiquidacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoLiquidacionDos.png")));
    }//GEN-LAST:event_iconoLiquidacionMouseMoved

    private void panelOpcionesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionesMouseMoved
        panelOpciones.setVisible(true);
        panel=true;
        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSalirDos.png")));
        botonCambiarClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCambiarClaveDos.png")));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png")));
        botonComboOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/combo3.png")));
    }//GEN-LAST:event_panelOpcionesMouseMoved

    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved
        evt = null;
    }//GEN-LAST:event_jLabel2MouseMoved

    private void botonCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarClaveActionPerformed
        CambiarClave mostrar = new CambiarClave(documento, "DOCENTE",true);
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCambiarClaveActionPerformed

    private void botonCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseMoved
        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSalir.png")));
    }//GEN-LAST:event_botonCerrarMouseMoved

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        int seleccion = JOptionPane.showConfirmDialog(null, "¿SEGURO QUE DESEA CERRAR EL PROGRAMA?");
        if(JOptionPane.OK_OPTION == seleccion){
            System.exit(0);
        }
    }//GEN-LAST:event_botonCerrarActionPerformed
    // </editor-fold>
    
    private void mostrarRegistrarNotas(){
        RegistrarNotas mostrar = new RegistrarNotas(documento);
        mostrar.setVisible(true);
        this.dispose();
    }
    private void salir(){
        Colegio mostrar = new Colegio();
        mostrar.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(InicioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new InicioDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCambiarClave;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonComboMostrar;
    private javax.swing.JButton botonComboOcultar;
    private javax.swing.JButton botonLiquidacion;
    private javax.swing.JButton botonRegistrarNotas;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel iconoBotonRegistrar;
    private javax.swing.JLabel iconoLiquidacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JLabel textoMateria;
    private javax.swing.JLabel textoNombre;
    // End of variables declaration//GEN-END:variables
}
