
package Datos;

import java.io.Serializable;

public class Docente extends Persona implements Serializable{
    
    private String materia;
    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
