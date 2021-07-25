/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Datos.*;
import InterfaceAdministrator.Administrador;
import InterfaceAdministrator.MostrarRegistroNotas;
import InterfaceEstudiante.InicioEstudiante;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IVÁN UTRIA
 */
public class MostrarNotas extends javax.swing.JFrame {

    ManejarArchivos accesorArchivo;
    ArrayList<NotasEstudiante> notas;
    String documentoEstudiante;
    
    boolean administrator=false;
    
    public MostrarNotas(){
        initComponents();
        verNotas();
        accesorArchivo = new ManejarArchivos();
    }
    public MostrarNotas(String documentoEstudiante){
        initComponents();
        this.documentoEstudiante = documentoEstudiante;
        textoUrl.setText("INICIO / MIS NOTAS");
        BotonInicio.setVisible(false);
        accesorArchivo = new ManejarArchivos();
        buscarNombre(documentoEstudiante);
        verNotas();
    }
    public MostrarNotas(String documentoEstudiante, boolean administrator){
        initComponents();
        textoDiferenciador.setText("ADMINISTRADOR");
        textoUrl.setText("INICIO / VER NOTAS DE ESTUDIANTE / NOTAS");
        BotonInicio.setVisible(true);
        this.administrator=administrator;
        this.documentoEstudiante = documentoEstudiante;
        accesorArchivo = new ManejarArchivos();
        buscarNombre(documentoEstudiante);
        verNotas();
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
        textoDiferenciador = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        textoNombre = new javax.swing.JLabel();
        textoUrl = new javax.swing.JLabel();
        BotonInicio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COLEGIO PROGRAMARTE");
        getContentPane().setLayout(null);

        textoDiferenciador.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        textoDiferenciador.setForeground(new java.awt.Color(255, 255, 255));
        textoDiferenciador.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoDiferenciador.setText("MIS NOTAS");
        getContentPane().add(textoDiferenciador);
        textoDiferenciador.setBounds(580, 460, 200, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo2.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 460, 260, 30);

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
        getContentPane().add(botonAtras);
        botonAtras.setBounds(10, 10, 40, 40);

        tabla = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        tabla.setBackground(new java.awt.Color(0, 51, 102));
        tabla.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setRowHeight(50);
        tabla.setSelectionBackground(new java.awt.Color(0, 51, 102));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 62, 780, 350);

        textoNombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        textoNombre.setForeground(new java.awt.Color(255, 255, 255));
        textoNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoNombre.setText("-----");
        getContentPane().add(textoNombre);
        textoNombre.setBounds(480, 10, 300, 40);

        textoUrl.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        textoUrl.setForeground(new java.awt.Color(255, 255, 255));
        textoUrl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoUrl.setText("INICIO / REGISTRAR NOTAS");
        getContentPane().add(textoUrl);
        textoUrl.setBounds(10, 430, 780, 14);

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
        getContentPane().add(BotonInicio);
        BotonInicio.setBounds(60, 10, 43, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
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
    
    // <editor-fold defaultstate="collapsed" desc="ACCION DE BOTONES"> 
    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        if(administrator){
            MostrarRegistroNotas mostrar= new MostrarRegistroNotas();
            mostrar.setVisible(true);
            this.dispose();
        }else{
            InicioEstudiante admin = new InicioEstudiante(documentoEstudiante);
            admin.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAtras.png")));
        BotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonInicio.png")));
    }//GEN-LAST:event_jLabel3MouseMoved

    private void botonAtrasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseMoved
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAtrasDos.png")));
    }//GEN-LAST:event_botonAtrasMouseMoved

    private void BotonInicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioMouseMoved
        BotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonInicioDos.png")));
    }//GEN-LAST:event_BotonInicioMouseMoved

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        Administrador mostrar = new Administrador();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonInicioActionPerformed
    // </editor-fold>  
    private void verNotas(){
        notas = (ArrayList<NotasEstudiante>) accesorArchivo.leerNotas();
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas={"ASIGNATURA","PRIMERA NOTA","SEGUNDA NOTA","TERCERA NOTA"};
        modelo.setColumnIdentifiers(columnas);
        String[] fila;
        for(NotasEstudiante registro:notas){
            if(registro.getDocumento().equals(documentoEstudiante)){
                fila = new String[columnas.length];
                fila[0] = buscarDocente(registro.getDocente());
                fila[1] = registro.getNotaUno();
                fila[2] = registro.getNotaDos();
                fila[3] = registro.getNotaTres();
                modelo.addRow(fila);
            }
        }
        tabla.setModel(modelo);
    }
    private void buscarNombre(String documento){
        ArrayList<Estudiante> lista = (ArrayList<Estudiante>) accesorArchivo.leerListaEstudiante();
        for(Estudiante estudiante:lista){
            if(documento.equals(estudiante.getDocumento())){
                textoNombre.setText(estudiante.getNombre());
            }
        }
    }
    private String buscarDocente(String documentoDocente){
        String materia = null;
        ArrayList<MateriaDocente> lista;
        lista = (ArrayList<MateriaDocente>)accesorArchivo.leerAsignatura();
        for(MateriaDocente materiaDocente: lista){
            if(materiaDocente.getDocumento().equals(documentoDocente)){
                materia = materiaDocente.getAsignatura();
            }
        }
        return materia;
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
            java.util.logging.Logger.getLogger(MostrarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MostrarNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton botonAtras;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel textoDiferenciador;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel textoUrl;
    // End of variables declaration//GEN-END:variables
}
