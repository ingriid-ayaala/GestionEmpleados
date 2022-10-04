
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
        Persona pers4 = new Persona("Ingrid","Gomez");
        
        Persona personas[]= new Persona [3];
        personas[0]= pers1;
        personas[1]= pers2;
        personas[2]= pers3;
        
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("*" + personas[i]);
        }
        
            //Persona matriz[][]= new Persona[2][2];
            Persona matriz [][] = {{pers1,pers2},{pers3,pers4}};
//            matriz[0][0]= pers1;
//            matriz[0][1]= pers2;
//            matriz[1][0]= pers3;
//            matriz[1][1]= pers4;
            
            
            for (int i = 0; i < matriz.length; i++){//visualizar
              
                for (int j = 0; j < matriz[0].length; j++){   
                     System.out.print("\t"+matriz[i][j]);
                }
                System.out.println("");
            }
        
        
    }
    
}
