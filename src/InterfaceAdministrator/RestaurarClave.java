
package InterfaceAdministrator;

import Procesos.CargarTabla;
import Procesos.ManejarClaves;
import javax.swing.JOptionPane;

public class RestaurarClave extends javax.swing.JFrame {
    boolean soloVer;
    public RestaurarClave(){
        initComponents();
        textoUrl.setText("INICIO / MAS OPCIONES / RESTAURAR CLAVE");
        textoTitulo.setText("RESTAURAR CLAVE");
        comboTipoDos.setVisible(false);
        filtro();
    }
    public RestaurarClave(boolean soloVer){
        initComponents();
        textoUrl.setText("INICIO / MAS OPCIONES / PERSONAS REGISTRADAS");
        textoTitulo.setText("PERSONAS REGISTRADAS");
        this.soloVer=soloVer;
        botonRestaurar.setVisible(false);
        comboTipoDos.setVisible(false);
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
        botonRestaurar = new javax.swing.JButton();
        comboTipo = new javax.swing.JComboBox<>();
        textoNombre = new javax.swing.JTextField();
        comboTipoDos = new javax.swing.JComboBox<>();
        BotonInicio = new javax.swing.JButton();
        textoTitulo = new javax.swing.JLabel();
        textoUrl = new javax.swing.JLabel();
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

        botonRestaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonRestaurarClave.png"))); // NOI18N
        botonRestaurar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        botonRestaurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRestaurar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonRestaurarMouseMoved(evt);
            }
        });
        botonRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestaurarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRestaurar);
        botonRestaurar.setBounds(620, 370, 170, 40);

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTUDIANTES", "DOCENTES" }));
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });
        getContentPane().add(comboTipo);
        comboTipo.setBounds(180, 90, 130, 40);

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
        textoNombre.setBounds(320, 90, 310, 40);

        comboTipoDos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTUDIANTES", "DOCENTES" }));
        comboTipoDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoDosActionPerformed(evt);
            }
        });
        getContentPane().add(comboTipoDos);
        comboTipoDos.setBounds(180, 90, 450, 40);

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

        textoTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        textoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        textoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoTitulo.setText("-------");
        getContentPane().add(textoTitulo);
        textoTitulo.setBounds(330, 10, 460, 40);

        textoUrl.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        textoUrl.setForeground(new java.awt.Color(255, 255, 255));
        textoUrl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoUrl.setText("INICIO / MAS OPCIONES");
        getContentPane().add(textoUrl);
        textoUrl.setBounds(10, 430, 780, 14);

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
        MasOpciones mostrar = new MasOpciones();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAtras.png")));
        BotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonInicio.png")));
        botonRestaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonRestaurarClave.png")));
    }//GEN-LAST:event_jLabel3MouseMoved

    private void botonAtrasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseMoved
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonAtrasDos.png")));
    }//GEN-LAST:event_botonAtrasMouseMoved

    private void botonRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestaurarActionPerformed
        restaurar();
    }//GEN-LAST:event_botonRestaurarActionPerformed

    private void botonRestaurarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRestaurarMouseMoved
        botonRestaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonRestaurarClaveDos.png")));
    }//GEN-LAST:event_botonRestaurarMouseMoved

    private void comboTipoDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoDosActionPerformed
        if(comboTipoDos.getSelectedItem().toString().trim().equals("ESTUDIANTES")){
            comboTipoDos.setVisible(false);
            comboTipo.setVisible(true);
            textoNombre.setVisible(true);
            comboTipo.setSelectedItem("ESTUDIANTES");
            filtro();
        }
    }//GEN-LAST:event_comboTipoDosActionPerformed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        if(comboTipo.getSelectedItem().toString().trim().equals("ESTUDIANTES")){
            comboTipoDos.setVisible(false);
            textoNombre.setVisible(true);
            comboTipo.setVisible(true);
        }
        else{
            comboTipoDos.setVisible(true);
            comboTipo.setVisible(false);
            textoNombre.setVisible(false);
            comboTipoDos.setSelectedItem("DOCENTES");
            tabla.setModel(new CargarTabla().tablaDocentes());
        }
    }//GEN-LAST:event_comboTipoActionPerformed

    private void BotonInicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioMouseMoved
        BotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonInicioDos.png")));
    }//GEN-LAST:event_BotonInicioMouseMoved

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        Administrador mostrar = new Administrador();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonInicioActionPerformed

    private void textoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNombreKeyTyped
        filtro();
    }//GEN-LAST:event_textoNombreKeyTyped
// </editor-fold>
    private void filtro(){
        if(textoNombre.getText().trim().equals("")){
            tabla.setModel(new CargarTabla().tablaEstudiantes());
        }else{
            tabla.setModel(new CargarTabla().filtrarNombre(textoNombre.getText()));
        }
    }
    private void restaurar(){
        String documento;
        try{
        if(comboTipo.equals("ESTUDIANTES")){
            documento = tabla.getValueAt(tabla.getSelectedRow(), 1).toString();
        }else{
            documento = tabla.getValueAt(tabla.getSelectedRow(), 1).toString();
        }
        new ManejarClaves().restaurarClave(documento);
        getToolkit().beep();
        JOptionPane.showMessageDialog(rootPane, "SE HA RESTAURADO LA CONTRASEÑA DEL CORRECTAMENTE","EXITO",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "DEBE SELECCIONAR LA PERSONA A LA QUE QUIERE RESTAURAR LA CLAVE","ERROR",JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(RestaurarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurarClave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonRestaurar;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JComboBox<String> comboTipoDos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JLabel textoTitulo;
    private javax.swing.JLabel textoUrl;
    // End of variables declaration//GEN-END:variables
}
