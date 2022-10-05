
package Dominio;
//import Dominio.Empleado;

/**
 *
 * @author ingri
 */
public class Gerente extends Empleado{
    //va tener un salario y sus estudios
    //una gerente tambien es un empleado
    private String departamento;
    private String estudios;

    public Gerente(String departamento, String estudios) {
        this.departamento = departamento;
        this.estudios = estudios;
    }

    public Gerente(String departamento, String estudios, double sueldo, int numSS, String nombre, String apellido) {
        super(sueldo, numSS, nombre, apellido);
        this.departamento = departamento;
        this.estudios = estudios;
    }

    

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    @Override
    public String toString() {
        return "Gerente{" +super.toString()+ "departamento=" + departamento + ", estudios=" + estudios + '}';
    }

    
    
    
    
}
