
package Procesos;

import Datos.*;
import java.util.ArrayList;

public class BuscarPersona {
    private ManejarArchivos archivo;
    
    public String buscarNombreDocente(String documento){
        String nombre=null;
        archivo=new ManejarArchivos();
        ArrayList<Docente> listaDocente = (ArrayList<Docente>) archivo.leerListaDocente();
        for(Docente docente:listaDocente){
            if(docente.getDocumento().equals(documento)){
                nombre = docente.getNombre();
            }
        }
        return nombre;
    }
    public boolean verificarDocente(String documento){
        String nombre=null;
        archivo=new ManejarArchivos();
        ArrayList<MateriaDocente> listaDocente = (ArrayList<MateriaDocente>) archivo.leerAsignatura();
        for(MateriaDocente docente:listaDocente){
            if(docente.getDocumento().equals(documento)){
                return true;
            }
        }
        return false;
    }
    public String buscarLiquidacion(String documento){
        String liquidacion=null;
        archivo=new ManejarArchivos();
        ArrayList<MateriaDocente> listaDocente = (ArrayList<MateriaDocente>) archivo.leerAsignatura();
        for(MateriaDocente docente:listaDocente){
            if(docente.getDocumento().equals(documento)){
                liquidacion = docente.getLiquidacion();
            }
        }
        return liquidacion;
    }
    public String buscarNombreEstudiante(String documento){
        String nombre=null;
        archivo=new ManejarArchivos();
        ArrayList<Estudiante> listaEstudiante = (ArrayList<Estudiante>) archivo.leerListaEstudiante();
        for(Estudiante estudiante:listaEstudiante){
            if(estudiante.getDocumento().equals(documento)){
                nombre = estudiante.getNombre();
            }
        }
        return nombre;
    }
    public String buscarNombreMateria(String documento){
        String materia=null;
        archivo=new ManejarArchivos();
        ArrayList<Docente> listaDocente = (ArrayList<Docente>) archivo.leerListaDocente();
        for(Docente docente:listaDocente){
            if(docente.getDocumento().equals(documento)){
                materia = docente.getMateria();
            }
        }
        return materia;
    }
    public String buscarGrado(String documento){
        String grado=null;
        archivo=new ManejarArchivos();
        ArrayList<Estudiante> listaEstudiante = (ArrayList<Estudiante>) archivo.leerListaEstudiante();
        for(Estudiante estudiante:listaEstudiante){
            if(estudiante.getDocumento().equals(documento)){
                grado = estudiante.getGrado();
            }
        }
        return grado;
    }
    public String buscarDocumento(String nombre){
        String documento=null;
        archivo=new ManejarArchivos();
        ArrayList<Estudiante> listaEstudiante = (ArrayList<Estudiante>) archivo.leerListaEstudiante();
        for(Estudiante estudiante:listaEstudiante){
            if(estudiante.getNombre().equals(nombre)){
                documento = estudiante.getDocumento();
            }
        }
        return documento;
    }
}
