
package Datos;

import java.io.Serializable;

public class Estudiante extends Persona implements Serializable{
    
    private String grado;

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
}
