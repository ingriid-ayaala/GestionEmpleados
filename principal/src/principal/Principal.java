
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
        Integer edad[]= new Integer[3];
        edad[0]= 1;
        edad[1]= 5;
        edad[2]= 4;
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                edades[i][j]=alea(0,9);
                System.out.println("\t "+edades[i][j]);
            }
            System.out.println("");
        }
        
            imprimir(edad);
            imprimir(personas);
            System.out.println("primera llamada");
            imprimirNum(1,2,3);
            System.out.println("segunda llamada");
            imprimirNum(8,4,3);
        }
        
    public static int alea(int li, int ls){//función de JAVA
            return (int)((Math.round(Math.random()*(ls-li))+li));
    }
    
    public static void imprimir (Object lista[]){
        for (int i = 0; i < lista.length; i++) {
            System.out.println("lista"+i +"}- "+lista[i]);
        }
    
    }
    //como se podria crear un metodo que de forma dinamica imprima 2 o 3 numeros 
    //imprimiendo numeros con metodos de argumentos variables 
     public static void imprimirNum(int...edad){// puedes poner cualquier nombre 
         for (int i = 0; i < edad.length; i++) {
             System.out.println("numeros [ "+ i +"]=" +edad[i]);
         }
         
         
     }




}
