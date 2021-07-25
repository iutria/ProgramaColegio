/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceAdministrator;

import Procesos.CambiarClave;
import Login.Colegio;
import javax.swing.JOptionPane;

/**
 *
 * @author IVÁN UTRIA
 */
public class Administrador extends javax.swing.JFrame {

    boolean panel;
    
    public Administrador(){
        initComponents();
        botonConfiguracion.setVisible(false);
        panelOpciones.setVisible(false);
        botonComboOcultar.setVisible(false);
        panel = false;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        botonComboMostrar = new javax.swing.JButton();
        botonComboOcultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        iconoBotonMas = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();
        botonConfiguracion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JButton();
        iconoBotonRegistrar = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JButton();
        iconoBotonRegistroNotas = new javax.swing.JLabel();
        botonVerNotas = new javax.swing.JButton();
        botonMas = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
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

        iconoBotonMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoMasOpciones.png"))); // NOI18N
        iconoBotonMas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoBotonMas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                iconoBotonMasMouseMoved(evt);
            }
        });
        iconoBotonMas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoBotonMasMouseClicked(evt);
            }
        });
        getContentPane().add(iconoBotonMas);
        iconoBotonMas.setBounds(570, 170, 120, 130);

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
        botonSalir.setBounds(0, 20, 160, 30);

        botonConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/configuracion.png"))); // NOI18N
        botonConfiguracion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        botonConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonConfiguracion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonConfiguracionMouseMoved(evt);
            }
        });
        botonConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfiguracionActionPerformed(evt);
            }
        });
        panelOpciones.add(botonConfiguracion);
        botonConfiguracion.setBounds(0, 20, 160, 30);

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
        botonCerrar.setBounds(0, 60, 160, 30);

        getContentPane().add(panelOpciones);
        panelOpciones.setBounds(560, 50, 160, 90);

        iconoBotonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoRegistrar.png"))); // NOI18N
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
        iconoBotonRegistrar.setBounds(350, 170, 120, 130);

        botonRegistrar.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        botonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonRegistrar.png"))); // NOI18N
        botonRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        botonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRegistrarMouseMoved(evt);
            }
        });
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar);
        botonRegistrar.setBounds(320, 310, 170, 40);

        iconoBotonRegistroNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarNotas.png"))); // NOI18N
        iconoBotonRegistroNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconoBotonRegistroNotas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                iconoBotonRegistroNotasMouseMoved(evt);
            }
        });
        iconoBotonRegistroNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoBotonRegistroNotasMouseClicked(evt);
            }
        });
        getContentPane().add(iconoBotonRegistroNotas);
        iconoBotonRegistroNotas.setBounds(130, 170, 140, 130);

        botonVerNotas.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        botonVerNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonVerNotas.png"))); // NOI18N
        botonVerNotas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        botonVerNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerNotas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonVerNotasMouseMoved(evt);
            }
        });
        botonVerNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerNotasActionPerformed(evt);
            }
        });
        getContentPane().add(botonVerNotas);
        botonVerNotas.setBounds(100, 310, 170, 40);

        botonMas.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        botonMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonMasOpciones.png"))); // NOI18N
        botonMas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        botonMas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonMasMouseMoved(evt);
            }
        });
        botonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasActionPerformed(evt);
            }
        });
        getContentPane().add(botonMas);
        botonMas.setBounds(540, 310, 170, 40);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("ADMINISTRADOR");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(580, 460, 200, 30);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoUsuario.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(730, 10, 60, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo2.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 460, 170, 30);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("INICIO");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 430, 780, 14);

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
        // TODO add your handling code here:
    }//GEN-LAST:event_botonComboOcultarMouseDragged

    private void botonComboOcultarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComboOcultarMouseMoved
        botonComboOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/combo5.png")));
    }//GEN-LAST:event_botonComboOcultarMouseMoved

    private void botonComboOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonComboOcultarMouseClicked
        panelOpciones.setVisible(false);
        botonComboMostrar.setVisible(true);
        botonComboOcultar.setVisible(false);
    }//GEN-LAST:event_botonComboOcultarMouseClicked

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        Registrar mostrar = new Registrar();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasActionPerformed
        MasOpciones mostrar = new MasOpciones();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonMasActionPerformed

    private void botonRegistrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarMouseMoved
        botonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonRegistrarDos.png")));
    }//GEN-LAST:event_botonRegistrarMouseMoved

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
        botonVerNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonVerNotas.png")));
        botonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonRegistrar.png")));
        botonMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonMasOpciones.png")));
        botonComboMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/combo2.png")));
        iconoBotonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoRegistrar.png")));
        botonComboOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/combo3.png")));
        botonConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/configuracion.png")));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png")));
        iconoBotonMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoMasOpciones.png")));
        iconoBotonRegistroNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarNotas.png")));
    }
    
    private void botonMasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMasMouseMoved
        botonMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonMasOpcionesDos.png")));
    }//GEN-LAST:event_botonMasMouseMoved

    private void iconoBotonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoBotonRegistrarMouseClicked
        Registrar mostrar = new Registrar();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iconoBotonRegistrarMouseClicked

    private void iconoBotonMasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoBotonMasMouseClicked
        MasOpciones mostrar = new MasOpciones();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iconoBotonMasMouseClicked

    private void iconoBotonRegistrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoBotonRegistrarMouseMoved
        iconoBotonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoRegistrarDos.png")));
    }//GEN-LAST:event_iconoBotonRegistrarMouseMoved

    private void iconoBotonMasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoBotonMasMouseMoved
        iconoBotonMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoMasOpcionesDos.png")));
    }//GEN-LAST:event_iconoBotonMasMouseMoved

    private void botonVerNotasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerNotasMouseMoved
        botonVerNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonVerNotasDos.png")));
    }//GEN-LAST:event_botonVerNotasMouseMoved

    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved
        evt = null;
    }//GEN-LAST:event_jLabel2MouseMoved

    private void botonVerNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerNotasActionPerformed
        MostrarRegistroNotas mostrar = new MostrarRegistroNotas();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonVerNotasActionPerformed

    private void iconoBotonRegistroNotasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoBotonRegistroNotasMouseMoved
        iconoBotonRegistroNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrarNotasDos.png")));
    }//GEN-LAST:event_iconoBotonRegistroNotasMouseMoved

    private void iconoBotonRegistroNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoBotonRegistroNotasMouseClicked
        MostrarRegistroNotas mostrar = new MostrarRegistroNotas();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iconoBotonRegistroNotasMouseClicked

    private void panelOpcionesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionesMouseMoved
        panelOpciones.setVisible(true);
        panel=true;
        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSalirDos.png")));
        botonConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/configuracion.png")));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png")));
        botonComboOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/combo3.png")));
    }//GEN-LAST:event_panelOpcionesMouseMoved

    private void botonConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfiguracionActionPerformed
        JOptionPane.showMessageDialog(null, "EN CONSTRUCCION");
    }//GEN-LAST:event_botonConfiguracionActionPerformed

    private void botonConfiguracionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConfiguracionMouseMoved
        botonConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/configuracionDos.png")));
    }//GEN-LAST:event_botonConfiguracionMouseMoved

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        salir();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonSalirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseMoved
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salirDos.png")));
    }//GEN-LAST:event_botonSalirMouseMoved

    private void botonCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseMoved
        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSalir.png")));
    }//GEN-LAST:event_botonCerrarMouseMoved

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        int seleccion = JOptionPane.showConfirmDialog(null, "¿SEGURO QUE DESEA CERRAR EL PROGRAMA?");
        if(JOptionPane.OK_OPTION == seleccion){
            System.exit(0);
        }
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void mostrarEstudiante(){
        RegistrarPersona mostrar = new RegistrarPersona("ESTUDIANTE");
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonComboMostrar;
    private javax.swing.JButton botonComboOcultar;
    private javax.swing.JButton botonConfiguracion;
    private javax.swing.JButton botonMas;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonVerNotas;
    private javax.swing.JLabel iconoBotonMas;
    private javax.swing.JLabel iconoBotonRegistrar;
    private javax.swing.JLabel iconoBotonRegistroNotas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel panelOpciones;
    // End of variables declaration//GEN-END:variables
}