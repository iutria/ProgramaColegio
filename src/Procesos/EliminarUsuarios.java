
package Procesos;

import java.util.ArrayList;
import Datos.*;

public class EliminarUsuarios {
    
    public boolean eliminarListaEstudiante(String documento){
        ManejarArchivos archivos = new ManejarArchivos();
        ArrayList<Estudiante> lista = (ArrayList<Estudiante>) archivos.leerListaEstudiante();
        for(Estudiante estudiante : lista){
            if(estudiante.getDocumento().equals(documento)){
                lista.remove(estudiante);
                archivos.guardarEstudiante(lista);
                return true;
            }
        }
        return false;
    }
    public boolean eliminarPersonaListaUsuario(String documento){
        ManejarArchivos archivos = new ManejarArchivos();
        ArrayList<Usuarios> lista = (ArrayList<Usuarios>) archivos.leerListaUsuario();
        for(Usuarios usuario : lista){
            if(usuario.getUsuario().equals(documento)){
                lista.remove(usuario);
                archivos.agregarUsuario(lista);
                return true;
            }
        }
        return false;
    }
    public boolean verificar(String documento){
        ManejarArchivos archivos = new ManejarArchivos();
        ArrayList<NotasEstudiante> lista = (ArrayList<NotasEstudiante>) archivos.leerNotas();
        for(NotasEstudiante notas : lista){
            if(notas.getDocumento().equals(documento)){
                eliminarEstudianteListaNotas(documento);
            }
        }
        return false;
    }
    public boolean eliminarEstudianteListaNotas(String documento){
        ManejarArchivos archivos = new ManejarArchivos();
        ArrayList<NotasEstudiante> lista = (ArrayList<NotasEstudiante>) archivos.leerNotas();
        for(NotasEstudiante notas : lista){
            if(notas.getDocumento().equals(documento)){
                lista.remove(notas);
                archivos.GuardarNotas(lista);
                if(!verificar(documento)){
                    return true;
                }
            }
        }
        return true;
    }
    public boolean eliminarListaDocente(String documento){
        ManejarArchivos archivos = new ManejarArchivos();
        ArrayList<Docente> lista = (ArrayList<Docente>) archivos.leerListaDocente();
        for(Docente docente : lista){
            if(docente.getDocumento().equals(documento)){
                lista.remove(docente);
                archivos.guardarDocente(lista);
                return true;
            }
        }
        return false;
    }
    public boolean eliminarMateriaDocente(String documento){
        ManejarArchivos archivos = new ManejarArchivos();
        ArrayList<MateriaDocente> lista = (ArrayList<MateriaDocente>) archivos.leerAsignatura();
        for(MateriaDocente materia : lista){
            if(materia.getDocumento().equals(documento)){
                lista.remove(materia);
                archivos.GuardarAsignatura(lista); 
                return true;
            }
        }
        return false;
    }
}
