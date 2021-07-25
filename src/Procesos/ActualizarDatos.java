
package Procesos;

import Datos.Estudiante;
import Datos.MateriaDocente;
import Datos.NotasEstudiante;
import InterfaceDocente.EditarNotas;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ActualizarDatos{
    ManejarArchivos archivos;
    private String notaUno;
    private String notaDos;
    private String notaTres;
    private String observaciones;
    private String documento;
    private String docente;
    public boolean registrarLiquidacion(String documento, String liquidacion){
        archivos = new ManejarArchivos();
        ArrayList<MateriaDocente> listaMaterias = (ArrayList<MateriaDocente>) archivos.leerAsignatura();
        for(MateriaDocente materia: listaMaterias){
            if(materia.getDocumento().equals(documento)){
                materia.setLiquidacion(liquidacion);
            }
        }
        archivos.GuardarAsignatura(listaMaterias);
        return true;
    }
    public void buscarNotasEstudiante(String documento, String docente){
        archivos = new ManejarArchivos();
        ArrayList<NotasEstudiante> lista = (ArrayList<NotasEstudiante>) archivos.leerNotas();
        for(NotasEstudiante notas : lista){
            if(notas.getDocumento().equals(documento) && notas.getDocente().equals(docente)){
                this.documento=documento;
                this.docente=docente;
                this.notaUno=notas.getNotaUno();
                this.notaDos=notas.getNotaDos();
                this.notaTres=notas.getNotaTres();
                this.observaciones=notas.getObservaciones();
            }
        }
    }
    public boolean cambiarNotas(String notaUno,String notaDos,String notaTres,String observaciones,String documento,String docente){
        archivos = new ManejarArchivos();
        ArrayList<NotasEstudiante> lista = (ArrayList<NotasEstudiante>) archivos.leerNotas();
        for(NotasEstudiante notas : lista){
            if(notas.getDocumento().equals(documento) && notas.getDocente().equals(docente)){
                notas.setNotaUno(notaUno);
                notas.setNotaDos(notaDos);
                notas.setNotaTres(notaTres);
                notas.setObservaciones(observaciones);
                archivos.GuardarNotas(lista);
                return true;
            }
        }
        return false;
    }
    /**
     * @return the notaUno
     */
    public String getNotaUno() {
        return notaUno;
    }

    /**
     * @param notaUno the notaUno to set
     */
    public void setNotaUno(String notaUno) {
        this.notaUno = notaUno;
    }

    /**
     * @return the notaDos
     */
    public String getNotaDos() {
        return notaDos;
    }

    /**
     * @param notaDos the notaDos to set
     */
    public void setNotaDos(String notaDos) {
        this.notaDos = notaDos;
    }

    /**
     * @return the notaTres
     */
    public String getNotaTres() {
        return notaTres;
    }

    /**
     * @param notaTres the notaTres to set
     */
    public void setNotaTres(String notaTres) {
        this.notaTres = notaTres;
    }

    /**
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the docente
     */
    public String getDocente() {
        return docente;
    }

    /**
     * @param docente the docente to set
     */
    public void setDocente(String docente) {
        this.docente = docente;
    }
}
