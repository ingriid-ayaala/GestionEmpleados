
package principal;
import Dominio.Persona;
import java.util.Arrays;
/**Príncipe Pío, 28008 Madrid
 *
 * @author ingri
 */
public class Principal {
static Persona arrayPersonas[]=new Persona[10];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Gestión empleados");
        
        Persona pers1 = new Persona("Ingrid","Ruiz");
        Persona pers2 = new Persona("Emily","Ruiz");
        Persona pers3 = new Persona("Ana","Ruiz");
        
        Persona personas[]= new Persona [3];
        personas[0]= pers1;
        personas[1]= pers2;
        personas[2]= pers3;
        
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("*" + personas[i]);
        }
        
        
    }
    
}
