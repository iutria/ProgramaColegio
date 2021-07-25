
package Procesos;

import Datos.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class CargarTabla {
    ManejarArchivos archivo;
    
    public DefaultTableModel tablaEstudiantes(){
        archivo = new ManejarArchivos();
        ArrayList<Estudiante> listaEstudiante=(ArrayList<Estudiante>) archivo.leerListaEstudiante();
        
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"GRADO","DOCUMENTO","NOMBRE","TELEFONO","DIRECCION","SEXO","NACIMIENTO"};
        modelo.setColumnIdentifiers(columnas);
        String[] fila;
        for(Estudiante estudiante:listaEstudiante){
            fila = new String[columnas.length];
            fila[0] = ""+estudiante.getGrado();
            fila[1] = estudiante.getDocumento();
            fila[2] = estudiante.getNombre();
            fila[3] = estudiante.getTelefono();
            fila[4] = estudiante.getDireccion();
            fila[5] = estudiante.getSexo();
            fila[6] = ""+estudiante.getDiaNacimiento()+"/"+estudiante.getMesNacimiento()+"/"+estudiante.getYearNacimiento();
            modelo.addRow(fila);
        }
        return modelo;
    }
    public DefaultTableModel tablaDocentes(){
        archivo = new ManejarArchivos();
        ArrayList<Docente> listaDocente=(ArrayList<Docente>) archivo.leerListaDocente();
        ArrayList<MateriaDocente> listaMateria = (ArrayList<MateriaDocente>) archivo.leerAsignatura();
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"ASIGNATURA","DOCUMENTO","NOMBRE","TELEFONO","DIRECCION","SEXO","NACIMIENTO"};
        modelo.setColumnIdentifiers(columnas);
        String[] fila;
        for(Docente docente:listaDocente){
            for(MateriaDocente materia : listaMateria)
            if(docente.getDocumento().equals(materia.getDocumento())){
                fila = new String[columnas.length];
                fila[0] = ""+docente.getMateria();
                fila[1] = docente.getDocumento();
                fila[2] = docente.getNombre();
                fila[3] = docente.getTelefono();
                fila[4] = docente.getDireccion();
                fila[5] = docente.getSexo();
                fila[6] = ""+docente.getDiaNacimiento()+"/"+docente.getMesNacimiento()+"/"+docente.getYearNacimiento();
                modelo.addRow(fila);
            }
        }
        return modelo;
    }
    public DefaultTableModel tablaLiquidacionDocentes(){
        archivo = new ManejarArchivos();
        ArrayList<Docente> listaDocente=(ArrayList<Docente>) archivo.leerListaDocente();
        ArrayList<MateriaDocente> listaMateria = (ArrayList<MateriaDocente>) archivo.leerAsignatura();
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"ASIGNATURA","DOCUMENTO","NOMBRE","LIQUIDACION ACTUAL"};
        modelo.setColumnIdentifiers(columnas);
        String[] fila;
        for(Docente docente:listaDocente){
            for(MateriaDocente materia : listaMateria)
            if(docente.getDocumento().equals(materia.getDocumento())){
                fila = new String[columnas.length];
                fila[0] = ""+docente.getMateria();
                fila[1] = docente.getDocumento();
                fila[2] = docente.getNombre();
                fila[3] = "$"+materia.getLiquidacion();
                modelo.addRow(fila);
            }
        }
        return modelo;
    }
    public DefaultTableModel filtrarGrado(String grado){
        archivo = new ManejarArchivos();
        ArrayList<Estudiante> listaEstudiante=(ArrayList<Estudiante>) archivo.leerListaEstudiante();
        
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"DOCUMENTO","NOMBRE","TELEFONO","DIRECCION","SEXO","NACIMIENTO"};
        modelo.setColumnIdentifiers(columnas);
        String[] fila;
        for(Estudiante estudiante:listaEstudiante){
            if(estudiante.getGrado().equals(grado)){
                fila = new String[columnas.length];
                fila[0] = estudiante.getDocumento();
                fila[1] = estudiante.getNombre();
                fila[2] = estudiante.getTelefono();
                fila[3] = estudiante.getDireccion();
                fila[4] = estudiante.getSexo();
                fila[5] = ""+estudiante.getDiaNacimiento()+"/"+estudiante.getMesNacimiento()+"/"+estudiante.getYearNacimiento();
                modelo.addRow(fila);
            }
        }
        return modelo;
    }
    public DefaultTableModel tablaNotas(String documento){
        BuscarPersona buscar = new BuscarPersona();
        archivo = new ManejarArchivos();
        ArrayList<NotasEstudiante> listaNotas=(ArrayList<NotasEstudiante>) archivo.leerNotas();
        
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"DOCUMENTO","NOMBRE","1° NOTA","2° NOTA","3° NOTA","OBSEVACIONES"};
        modelo.setColumnIdentifiers(columnas);
        String[] fila;
        for(NotasEstudiante notas:listaNotas){
            if(notas.getDocente().equals(documento)){
                fila = new String[columnas.length];
                fila[0] = notas.getDocumento();
                fila[1] = buscar.buscarNombreEstudiante(notas.getDocumento());
                fila[2] = notas.getNotaUno();
                fila[3] = notas.getNotaDos();
                fila[4] = notas.getNotaTres();
                fila[5] = notas.getObservaciones();
                modelo.addRow(fila);
            }
        }
        return modelo;
    }
    public DefaultTableModel filtrarNombre(String palabra){
        String nombre = palabra;
        archivo = new ManejarArchivos();
        ArrayList<Estudiante> listaEstudiante=(ArrayList<Estudiante>) archivo.leerListaEstudiante();
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"GRADO","DOCUMENTO","NOMBRE","TELEFONO","DIRECCION","SEXO","NACIMIENTO"};
        modelo.setColumnIdentifiers(columnas);
        String[] fila;
        for(Estudiante estudiante:listaEstudiante){
            if(estudiante.getNombre().contains(nombre.toUpperCase())){
                fila = new String[columnas.length];
                fila[0] = ""+estudiante.getGrado();
                fila[1] = estudiante.getDocumento();
                fila[2] = estudiante.getNombre();
                fila[3] = estudiante.getTelefono();
                fila[4] = estudiante.getDireccion();
                fila[5] = estudiante.getSexo();
                fila[6] = ""+estudiante.getDiaNacimiento()+"/"+estudiante.getMesNacimiento()+"/"+estudiante.getYearNacimiento();
                modelo.addRow(fila);
            }
            
        }
        return modelo;
    }
    
}
