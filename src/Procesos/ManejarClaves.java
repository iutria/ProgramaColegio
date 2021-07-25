
package Procesos;

import Datos.*;
import java.util.ArrayList;

public class ManejarClaves {
    private ManejarArchivos archivo;
     
    public boolean cambiarClave(String documento, String clave, String nueva){
        archivo = new ManejarArchivos();
        ArrayList<Usuarios> listaUsuarios = (ArrayList<Usuarios>) archivo.leerListaUsuario();
        for(Usuarios usuario:listaUsuarios){
            if(usuario.getUsuario().equals(documento)){
                if(usuario.getClave().equals(clave)){
                    usuario.setClave(nueva);
                    usuario.setActivacion(true);
                    archivo.agregarUsuario(listaUsuarios);
                    return true;
                }
            }
        }
        return false;
    }
    public boolean restaurarClave(String documento){
        archivo = new ManejarArchivos();
        ArrayList<Usuarios> listaUsuarios = (ArrayList<Usuarios>) archivo.leerListaUsuario();
        for(Usuarios usuario:listaUsuarios){
            if(usuario.getUsuario().equals(documento)){
                    usuario.setClave(documento);
                    usuario.setActivacion(false);
                    archivo.agregarUsuario(listaUsuarios);
                    return true;
                }
            }
        return false;
    }
}
