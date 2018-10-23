import java.util.Scanner;
import java.util.LinkedList;

/**
 * Solucion Ejercicio 2.1.
 * 
 * @author (Camila y Mariana) 
 * @version (2018)
 */
public class Ejercicio
{
    static Scanner lector= new Scanner(System.in);

    public static void Bicolorable(DigraphAM g){
        int color[]=new int[g.size];
        
        for (int i=0;i<g.size;i++){
            color[i]=-1;
            System.out.println(color[i]);
        }

        for (int j = 0; j < g.size; j++) {
            for (int i = 0; i < g.size; i++) {
                if (g.getWeight(j,i)!=0) {
                    if ( color[i] == -1) {
                        color[i] = 1 - color[j];
                    } else if (color[j] == color[i]) {
                        System.out.println("NOT BICOLORABLE");
                    }
                }
            }
        }
        System.out.println("BICOLORABLE");
    }

    public static void main (String[] args){
        System.out.println("Ingrese el nodo: ");
        int nodo=lector.nextInt();
        while (nodo!=0){
            DigraphAM grafo= new DigraphAM(nodo);
            System.out.println("Ingrese la cantidad de arcos: ");
            int arcos=lector.nextInt();
            for (int i=0;i<arcos;i++){
                System.out.println ("Ingrese la coordenada de origen: ");
                int origen=lector.nextInt();
                System.out.println ("Ingrese la coordenada de destino: ");
                int destino=lector.nextInt();
                grafo.addArc(origen,destino,1);
            }
            Bicolorable(grafo);
            System.out.println("Ingrese el nodo: ");
            nodo=lector.nextInt();
        }
    }
}
