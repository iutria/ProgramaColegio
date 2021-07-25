
package Datos;

import java.io.Serializable;

public class NotasEstudiante implements Serializable{
    private String documento;
    private String docente;
    private String notaUno;
    private String notaDos;
    private String notaTres;
    private String observaciones;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getNotaUno() {
        return notaUno;
    }

    public void setNotaUno(String notaUno) {
        this.notaUno = notaUno;
    }

    public String getNotaDos() {
        return notaDos;
    }

    public void setNotaDos(String notaDos) {
        this.notaDos = notaDos;
    }

    public String getNotaTres() {
        return notaTres;
    }

    public void setNotaTres(String notaTres) {
        this.notaTres = notaTres;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
}
