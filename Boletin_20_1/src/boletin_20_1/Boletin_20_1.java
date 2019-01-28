package boletin_20_1;
import java.util.*;

/**
 * @author Gabriel <gpietrafesavieitez@danielcastelao.org>
 */

public class Boletin_20_1 {
    private static int numeroJornadas = 3;
    private static int numeroEquipos = 3;
    private static String[] listaNombresEquipos = new String[]{
        "Celta",
        "Depor",
        "Malaga"
    };
    private static int numeroGoles;
    private static Scanner leer = new Scanner(System.in);
    private static ArrayList<ArrayList<Integer>> listaFutbol = new ArrayList<ArrayList<Integer>>();
    
    public static void buildDataValues(){
        System.out.print("[-]\t¿Usar valores por defecto? (s/n)\n[>]\t:");
        if(leer.next().equals("n")){
            System.out.print("[-]\tIntroduzca el número de Equipos.\n[>]\t:");
            numeroEquipos = leer.nextInt();
            System.out.print("[-]\tIntroduzca el número de Jornadas.\n[>]\t:");
            numeroJornadas = leer.nextInt();
            for(int i = 0; i < numeroEquipos; i ++){
                System.out.print("[-]\tIntroduzca el nombre del Equipo " + (i + 1) + ".\n[>]\t:");
                listaNombresEquipos[i] = leer.next();
            }
        }
    }
    
    public static void buildArrayList(){
        for(int i = 0; i < numeroEquipos; i ++){
            listaFutbol.add(new ArrayList<Integer>());
            for(int j = 0; j < numeroJornadas; j ++){
                System.out.print("[-]\tIntroduzca el número de goles que ha marcado el " + listaNombresEquipos[i] + " en la Jornada " + (j+1) + ".\n[>]\t:");
                numeroGoles = leer.nextInt(); 
                listaFutbol.get(i).add(numeroGoles); //en la fila i se añade un nueva numeroGoles
            }           
        }
    }
    
    public static void printTable(){
        System.out.print("Equipos\t");
        for(int i = 0; i < numeroJornadas; i ++){
            System.out.print("\tJ" + (i + 1));
        }
        System.out.println("");
        for(int j = 0; j < numeroEquipos; j ++){ 
            System.out.print(listaNombresEquipos[j] + ":\t");
            for(int k = 0; k < numeroJornadas; k ++){ 
                System.out.print("\t" + listaFutbol.get(j).get(k));
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        buildDataValues();
        System.out.println("");
        buildArrayList();
        System.out.println("");
        printTable();
        
    }
}