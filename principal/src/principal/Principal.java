
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
        //CREAMOS LOS OBJETOS
        Persona pers1 = new Persona("Ingrid","Ruiz");
        Persona pers2 = new Persona("Emily","Ruiz");
        Persona pers3 = new Persona("Ana","Ruiz");
        Persona pers4 = new Persona("Ingrid","Gomez");
        //LOS METEMOS EN UN ARRAY
        Persona personas[]= new Persona [4];
        personas[0]= pers1;
        personas[1]= pers2;
        personas[2]= pers3;
        personas[3]= pers4;
        // SE RECORRE 
        for (int i = 0; i < personas.length; i++) {
            System.out.println("*" + personas[i]);
        }
        //OBJETOS EN UN ARRAY BIDIMENSIONAL
            //Persona matriz[][]= new Persona[2][2];
            Persona matriz [][] = {{pers1,pers2},{pers3,pers4}};
//            matriz[0][0]= pers1;
//            matriz[0][1]= pers2;
//            matriz[1][0]= pers3;
//            matriz[1][1]= pers4;
            
        // SE RECORRE   EL ARRAY BIDIMENSIONAL  
            for (int i = 0; i < matriz.length; i++){//visualizar
                if (i == 0) System.out.println("Socios: ");
                else System.out.println("\nDirectores: ");
                for (int j = 0; j < matriz[0].length; j++){   
                     System.out.print("\t"+matriz[i][j]);
                }
                System.out.println("");
            
        }
        // EDADES 
        int edades[][]= new int[3][4];
        
            for (int[] edade : edades) {
                for (int j = 0; j < edades.length; j++) {
                    edade[j] = alea(0,9);
                }
            }
                    System.out.println("VISUALIZAR EDADES");
            for (int[] edade : edades) {
                //visualizar
                for (int j = 0; j < edades[0].length; j++) {
                    System.out.print("\t" + edades[j]);
                }
                System.out.println("");
            }
        }
        
        public static int alea(int li, int ls){//función de JAVA
                return (int)((Math.round(Math.random()*(ls-li))+li));
            }
    
}
