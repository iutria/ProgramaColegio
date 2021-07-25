
package Datos;

import java.io.Serializable;

public class Persona implements Serializable{
    
    private String nombre;
    private String documento;
    private String telefono;
    private String direccion;
    private String sexo;
    private String diaNacimiento;
    private String mesNacimiento;
    private String yearNacimiento;
    private String tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
 
    public String getTipo() {
        return tipo;
    }
 
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
