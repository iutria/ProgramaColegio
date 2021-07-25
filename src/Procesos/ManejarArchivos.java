
package Procesos;

import Datos.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ManejarArchivos {
    
    private String url="";
    private String urlEstudiante = "ESTUDIANTE.estudiante";
    private String urlDocente = "DOCENTE.docente";
    private String urlUsuario = "USUARIO.usuarios";
    private String urlAsignaturas = "ASIGNATURAS.materia";
    private String urlNotas = "NOTAS.notas";
    
    public void guardarEstudiante(ArrayList<Estudiante> estudiante){
        ObjectOutputStream escritor = null;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream(url+urlEstudiante));
            escritor.writeObject(estudiante);
        } catch (IOException ex) {
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException err) {
            }
        }
    }
    public void guardarDocente(ArrayList<Docente> docente){
        ObjectOutputStream escritor = null;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream(url+urlDocente));
            escritor.writeObject(docente);
        } catch (IOException ex) {
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException err) {
            }
        }
    }
    public void agregarUsuario(ArrayList<Usuarios> usuario){
        ObjectOutputStream escritor = null;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream(url+urlUsuario));
            escritor.writeObject(usuario);
        } catch (IOException ex) {
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException err) {
            }
        }
    }
    public void GuardarAsignatura(ArrayList<MateriaDocente> docente){
        ObjectOutputStream escritor = null;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream(url+urlAsignaturas));
            escritor.writeObject(docente);
        } catch (IOException ex) {
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException err) {
            }
        }
    }
    public void GuardarNotas(ArrayList<NotasEstudiante> notas){
        ObjectOutputStream escritor = null;
        try {
            escritor = new ObjectOutputStream(new FileOutputStream(url+urlNotas));
            escritor.writeObject(notas);
        } catch (IOException ex) {
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException err) {
            }
        }
    }
    public ArrayList<Estudiante> leerListaEstudiante(){
        ArrayList<Estudiante> listaEstudiante = new ArrayList<>();
        ObjectInputStream lector = null;
        try {
            lector = new ObjectInputStream(new FileInputStream(url+urlEstudiante));
            listaEstudiante = (ArrayList<Estudiante>) lector.readObject();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (Exception err) {
            }
        }
        return listaEstudiante;
    }
    public ArrayList<Docente> leerListaDocente(){
        ArrayList<Docente> listaDocente = new ArrayList<>();
        ObjectInputStream lector = null;
        try {
            lector = new ObjectInputStream(new FileInputStream(url+urlDocente));
            listaDocente = (ArrayList<Docente>) lector.readObject();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (Exception err) {
            }
        }
        return listaDocente;
    }
    public ArrayList<Usuarios> leerListaUsuario(){
        ArrayList<Usuarios> listaUsuarios = new ArrayList<>();
        ObjectInputStream lector = null;
        try {
            lector = new ObjectInputStream(new FileInputStream(url+urlUsuario));
            listaUsuarios = (ArrayList<Usuarios>) lector.readObject();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (Exception err) {
            }
        }
        return listaUsuarios;
    }
    public ArrayList<MateriaDocente> leerAsignatura(){
        ArrayList<MateriaDocente> listaAsignaturas = new ArrayList<>();
        ObjectInputStream lector = null;
        try {
            lector = new ObjectInputStream(new FileInputStream(url+urlAsignaturas));
            listaAsignaturas = (ArrayList<MateriaDocente>) lector.readObject();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (Exception err) {
            }
        }
        return listaAsignaturas;
    }
    public ArrayList<NotasEstudiante> leerNotas(){
        ArrayList<NotasEstudiante> listaNotas = new ArrayList<>();
        ObjectInputStream lector = null;
        try {
            lector = new ObjectInputStream(new FileInputStream(url+urlNotas));
            listaNotas = (ArrayList<NotasEstudiante>) lector.readObject();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (Exception err) {
            }
        }
        return listaNotas;
    }
}
