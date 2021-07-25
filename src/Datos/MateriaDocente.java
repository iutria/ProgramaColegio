
package Datos;

import java.io.Serializable;

public class MateriaDocente implements Serializable{

    
    private String documento;
    private String asignatura;
    private String liquidacion;
    
    public String getDocumento() {
        return documento;
    }
    
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    public String getLiquidacion() {
        return liquidacion;
    }
    public void setLiquidacion(String liquidacion) {
        this.liquidacion = liquidacion;
    }

}
