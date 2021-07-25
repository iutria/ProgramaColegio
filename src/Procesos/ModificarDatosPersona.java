
package Procesos;

import Datos.*;
import java.util.ArrayList;

public class ModificarDatosPersona {
    public void modificarDatosEstudiante(String documento,String nombre,
    String telefono,String direccion,String sexo, 
    String year,String mes,String dia,String grado){
        EditarDatos editar = new EditarDatos();
        ManejarArchivos archivos = new ManejarArchivos();
        ArrayList<Estudiante> lista = (ArrayList<Estudiante>) archivos.leerListaEstudiante();
        for(Estudiante estudiante : lista){
            if(estudiante.getDocumento().equals(documento)){
                estudiante.setNombre(nombre);
                estudiante.setGrado(grado);
                estudiante.setTelefono(telefono);
                estudiante.setDireccion(direccion);
                estudiante.setSexo(sexo);
                estudiante.setYearNacimiento(year);
                estudiante.setDiaNacimiento(dia);
                estudiante.setMesNacimiento(mes);
            }
        }
        archivos.guardarEstudiante(lista);
    }
    public void modificarDatosDocente(String documento,String nombre,
    String telefono,String direccion,String sexo, 
    String year,String mes,String dia,String materia){
        
        EditarDatos editar = new EditarDatos();
        ManejarArchivos archivos = new ManejarArchivos();
        ArrayList<Docente> lista = (ArrayList<Docente>) archivos.leerListaDocente();
        for(Docente docente : lista){
            if(docente.getDocumento().equals(documento)){
                docente.setNombre(nombre);
                docente.setMateria(materia);
                docente.setTelefono(telefono);
                docente.setDireccion(direccion);
                docente.setSexo(sexo);
                docente.setYearNacimiento(year);
                docente.setDiaNacimiento(dia);
                docente.setMesNacimiento(mes);
            }
        }
        archivos.guardarDocente(lista);
    }
}
