/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author ingri
 */
public class Empleado extends Persona {
    private double sueldo;
    private int numSS;

    public Empleado(double sueldo, int numSS) {
        this.sueldo = sueldo;
        this.numSS = numSS;
    }

    public Empleado(double sueldo, int numSS, String nombre, String apellido) {
        super(nombre, apellido);
        this.sueldo = sueldo;
        this.numSS = numSS;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getNumSS() {
        return numSS;
    }

    public void setNumSS(int numSS) {
        this.numSS = numSS;
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString()+"sueldo=" + sueldo + ", numSS=" + numSS + '}';
    }
    
    
}
/*
@Override
    public String toString() {
        return "Alumno{" + super.toString()+ ", Curso= " + curso + ", Notas= " + Arrays.toString(nota) + '}';
    }
*/