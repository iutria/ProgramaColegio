
package Login;

import InterfaceAdministrator.Administrador;
import InterfaceEstudiante.InicioEstudiante;
import Procesos.*;
import Datos.Usuarios;
import java.util.ArrayList;
import InterfaceDocente.InicioDocente;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author IVÁN UTRIA
 */
public class Colegio extends javax.swing.JFrame {

    String tipo;

    ArrayList<Usuarios> listaUsuarios;
    ManejarArchivos archivos;
    ActualizarDatos verificar;
    boolean activacion;
    public Colegio() {
        initComponents();
        listaUsuarios = new ArrayList<>();
        archivos = new ManejarArchivos();
        verificar = new ActualizarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        textoPass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        botonEntrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        botonVerClave = new javax.swing.JButton();
        verClave = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COLEGIO PROGRAMARTE");
        setMinimumSize(new java.awt.Dimension(799, 499));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONTRASEÑA:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 330, 100, 17);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 280, 100, 17);

        textoUsuario.setBackground(new java.awt.Color(0, 51, 102));
        textoUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        textoUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        textoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuarioActionPerformed(evt);
            }
        });
        textoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(textoUsuario);
        textoUsuario.setBounds(360, 270, 180, 40);

        textoPass.setBackground(new java.awt.Color(0, 51, 102));
        textoPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textoPass.setForeground(new java.awt.Color(255, 255, 255));
        textoPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        textoPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoPassKeyPressed(evt);
            }
        });
        getContentPane().add(textoPass);
        textoPass.setBounds(360, 320, 180, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(250, 240, 290, 10);

        botonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/g4494.png"))); // NOI18N
        botonEntrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        botonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEntrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonEntrarMouseMoved(evt);
            }
        });
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });
        botonEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonEntrarKeyPressed(evt);
            }
        });
        getContentPane().add(botonEntrar);
        botonEntrar.setBounds(430, 370, 110, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(320, 60, 170, 160);

        botonVerClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver.png"))); // NOI18N
        botonVerClave.setToolTipText("Ver");
        botonVerClave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        botonVerClave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerClave.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                botonVerClaveMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                botonVerClaveMouseMoved(evt);
            }
        });
        botonVerClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVerClaveMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonVerClaveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonVerClaveMouseReleased(evt);
            }
        });
        botonVerClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerClaveActionPerformed(evt);
            }
        });
        getContentPane().add(botonVerClave);
        botonVerClave.setBounds(550, 330, 20, 20);

        verClave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        verClave.setForeground(new java.awt.Color(255, 255, 255));
        verClave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        getContentPane().add(verClave);
        verClave.setBounds(360, 320, 180, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 800, 500);

        setSize(new java.awt.Dimension(816, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="ACCION DE BOTONES">                          
    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        entrar();
    }//GEN-LAST:event_botonEntrarActionPerformed

    private void botonEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonEntrarKeyPressed
        if(evt.getKeyCode() == 10){
            entrar();
        }
    }//GEN-LAST:event_botonEntrarKeyPressed

    private void textoPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoPassKeyPressed
       if(evt.getKeyCode() == 10){
            entrar();
        }
    }//GEN-LAST:event_textoPassKeyPressed

    private void botonEntrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEntrarMouseMoved
        botonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bitmap.png")));
    }//GEN-LAST:event_botonEntrarMouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        botonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/g4494.png")));
    }//GEN-LAST:event_formMouseMoved

    private void botonVerClaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerClaveMouseClicked
    }//GEN-LAST:event_botonVerClaveMouseClicked

    private void botonVerClaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerClaveMouseReleased
        botonVerClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver.png")));
        textoPass.setVisible(true);
        textoPass.requestFocus();
    }//GEN-LAST:event_botonVerClaveMouseReleased

    private void botonVerClaveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerClaveMouseMoved
        
    }//GEN-LAST:event_botonVerClaveMouseMoved

    private void botonVerClaveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerClaveMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVerClaveMouseDragged

    private void botonVerClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerClaveActionPerformed
        
    }//GEN-LAST:event_botonVerClaveActionPerformed

    private void botonVerClaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerClaveMousePressed
        botonVerClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver2.png")));
        verClave.setText(textoPass.getText());
        textoPass.setVisible(false);
    }//GEN-LAST:event_botonVerClaveMousePressed

    private void textoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuarioActionPerformed
        
    }//GEN-LAST:event_textoUsuarioActionPerformed

    private void textoUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoUsuarioKeyPressed
        if(evt.getKeyCode() == 10){
            entrar();
        }
    }//GEN-LAST:event_textoUsuarioKeyPressed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        jLabel9.requestFocus();
    }//GEN-LAST:event_formMouseClicked
//</editor-fold> 
    
    private void entrar(){
        Usuarios usuarios = new Usuarios();
        if(textoUsuario.getText().equals("")){
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "¡DEBE INGRESAR SU USUARIO!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(textoPass.getText().equals(""))
            {
                getToolkit().beep();
                JOptionPane.showMessageDialog(rootPane, "¡DEBE INGRESAR SU CONTRASEÑA!","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{
                if(textoUsuario.getText().trim().equals("administrator") && textoPass.getText().equals("123"))
                {
                    textoUsuario.setText("");
                    textoUsuario.requestFocus();
                    textoPass.setText("");
                    Administrador administrador = new Administrador();
                    administrador.setVisible(true);
                    this.dispose();
                    
                }
                else{
                    if(verificarUsuario(textoUsuario.getText().trim(), textoPass.getText())==false){
                        getToolkit().beep();
                        JOptionPane.showMessageDialog(rootPane, "¡EL USUARIO Y/O LA CONTRASEÑA SON INCORRECTOS!","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        if(tipo.equals("ESTUDIANTE")){
                            if(activacion==true){
                                InicioEstudiante mostrar = new InicioEstudiante(textoUsuario.getText());
                                mostrar.setVisible(true);
                                this.dispose();
                            }
                            else{
                                CambiarClave cambiarClave=new CambiarClave(textoUsuario.getText(),"ESTUDIANTE");
                                cambiarClave.setVisible(true);
                                this.dispose();
                            }
                        }
                        else{
                            if(activacion==true){
                                InicioDocente mostrar = new InicioDocente(textoUsuario.getText());
                                mostrar.setVisible(true);
                                this.dispose();
                            }
                            else{
                                CambiarClave cambiarClave=new CambiarClave(textoUsuario.getText(),"DOCENTE");
                                cambiarClave.setVisible(true);
                                this.dispose();
                            }
                        }
                    }
                }
            }
        }
    }
    
    private boolean verificarUsuario(String usuario, String clave){
        listaUsuarios = (ArrayList<Usuarios>)archivos.leerListaUsuario();
        if(listaUsuarios!=null){
            for(Usuarios usuarios:listaUsuarios){
                if(usuario.equals(usuarios.getUsuario()) && clave.equals(usuarios.getClave()))
                {
                    tipo = usuarios.getTipo();
                    activacion = usuarios.getActivacion();
                    return true;
                }
            }
        }
        return false;
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Colegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Colegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Colegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Colegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Colegio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrar;
    private javax.swing.JButton botonVerClave;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField textoPass;
    private javax.swing.JTextField textoUsuario;
    private javax.swing.JLabel verClave;
    // End of variables declaration//GEN-END:variables
}
