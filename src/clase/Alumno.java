/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Alumno CG
 */
public class Alumno {
    private String nombres, apellidos;
    private int edad;

    public Alumno(String nombres, String apellidos, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
