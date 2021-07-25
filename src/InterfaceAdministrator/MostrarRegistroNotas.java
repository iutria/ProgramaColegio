
package InterfaceAdministrator;

import Procesos.MostrarNotas;
import Procesos.CargarTabla;
import javax.swing.JOptionPane;

public class MostrarRegistroNotas extends javax.swing.JFrame {

    public MostrarRegistroNotas(){
        initComponents();
        filtro();
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        botonVer = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        BotonInicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COLEGIO PROGRAMARTE");
        getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("ADMINISTRADOR");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(580, 460, 200, 30);

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
        tabla.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 150, 780, 210);

        botonVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonVerNotas.png"))); // NOI18N
        botonVer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        botonVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonVerMouseMoved(evt);
            }
        });
        botonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerActionPerformed(evt);
            }
        });
        getContentPane().add(botonVer);
        botonVer.setBounds(620, 370, 170, 40);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("FILTRAR POR NOMBRE:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 90, 160, 40);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("INICIO / VER NOTAS DE ESTUDIANTE");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 430, 780, 14);

        textoNombre.setBackground(new java.awt.Color(0, 51, 102));
        textoNombre.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        textoNombre.setForeground(new java.awt.Color(255, 255, 255));
        textoNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        textoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoNombreKeyTyped(evt);
            }
        });
        getContentPane().add(textoNombre);
        textoNombre.setBounds(310, 90, 310, 40);

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

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("VER NOTAS DE ESTUDIANTE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(490, 10, 300, 40);

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
            Administrador admin = new Administrador();
            admin.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAtras.png")));
        botonVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonVerNotas.png")));
        BotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonInicio.png")));
    }//GEN-LAST:event_jLabel3MouseMoved

    private void botonAtrasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseMoved
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAtrasDos.png")));
    }//GEN-LAST:event_botonAtrasMouseMoved

    private void botonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerActionPerformed
        verNotas();
    }//GEN-LAST:event_botonVerActionPerformed

    private void botonVerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerMouseMoved
        botonVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonVerNotasDos.png")));
    }//GEN-LAST:event_botonVerMouseMoved

    private void textoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNombreKeyTyped
        filtro();
    }//GEN-LAST:event_textoNombreKeyTyped

    private void BotonInicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioMouseMoved
        BotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonInicioDos.png")));
    }//GEN-LAST:event_BotonInicioMouseMoved

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        Administrador mostrar = new Administrador();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonInicioActionPerformed
// </editor-fold>
    
    private void filtro(){
        if(textoNombre.getText().trim().equals("")){
            tabla.setModel(new CargarTabla().tablaEstudiantes());
        }else{
            tabla.setModel(new CargarTabla().filtrarNombre(textoNombre.getText()));
        }
    }
    private void verNotas(){
        String documento;
        try{
            documento=tabla.getValueAt(tabla.getSelectedRow(), 1).toString();
            new MostrarNotas(documento, true).setVisible(true);
            this.dispose();
        }catch(Exception e){
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "DEBE SELECCIONAR UN ESTUDIANTE","ERROR",JOptionPane.ERROR_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(MostrarRegistroNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarRegistroNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarRegistroNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarRegistroNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MostrarRegistroNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables
}
