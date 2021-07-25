
package Procesos;

import Datos.*;
import java.util.ArrayList;

public class EditarDatos {
    
    private String documento;
    private String grado;
    private String materia;
    private String nombre;
    private String direccion;
    private String sexo;
    private String diaNacimiento;
    private String mesNacimiento;
    private String yearNacimiento;
    private String telefono;
    
    public void buscarEstudiante(String documento){
        ManejarArchivos archivo = new ManejarArchivos();
        ArrayList<Estudiante> lista = (ArrayList<Estudiante>) archivo.leerListaEstudiante();
        for(Estudiante estudiante : lista){
            if(estudiante.getDocumento().equals(documento)){
                this.documento = documento;
                this.grado = estudiante.getGrado();
                this.nombre = estudiante.getNombre();
                this.direccion = estudiante.getDireccion();
                this.telefono = estudiante.getTelefono();
                this.sexo = estudiante.getSexo();
                this.diaNacimiento = estudiante.getDiaNacimiento();
                this.mesNacimiento = estudiante.getMesNacimiento();
                this.yearNacimiento = estudiante.getYearNacimiento();
            }
        }
    }
    public void buscarDocente(String documento){
        ManejarArchivos archivo = new ManejarArchivos();
        ArrayList<Docente> lista = (ArrayList<Docente>) archivo.leerListaDocente();
        for(Docente docente : lista){
            if(docente.getDocumento().equals(documento)){
                this.documento = documento;
                this.materia = docente.getMateria();
                this.nombre = docente.getNombre();
                this.direccion = docente.getDireccion();
                this.telefono = docente.getTelefono();
                this.sexo = docente.getSexo();
                this.diaNacimiento = docente.getDiaNacimiento();
                this.mesNacimiento = docente.getMesNacimiento();
                this.yearNacimiento = docente.getYearNacimiento();
            }
        }
    }
    
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(String diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public String getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(String mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public String getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(String yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
