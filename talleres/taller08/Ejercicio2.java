
    import java.util.*;
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio2
{


    public static void atenderCliente(Queue <Tienda> solicitudes, Stack <Nevera> neveras) {
        while (!solicitudes.isEmpty()) {
            for (int i=0; i<solicitudes.peek().cantidad;i++){
                Nevera variable=neveras.pop();
                System.out.println ("La nevera tiene como código: "+variable.codigo);
                System.out.println ("La nevera es de marca: "+variable.marca);
            }
            solicitudes.poll();
        }
    }

    public static void main (String [] args) {
        Stack <Nevera> Neveras = new Stack <Nevera>();
        Queue <Tienda> Solicitudes= new LinkedList <Tienda>();
        Nevera nevera1= new Nevera(01, "LG");
        Nevera nevera2= new Nevera(02, "LG");
        Nevera nevera3= new Nevera(03, "SM");
        Tienda tienda1= new Tienda("Jumbo", 2);
        Tienda tienda2= new Tienda("Metro", 1);
        Neveras.add(nevera1);
        Neveras.add(nevera2);
        Neveras.add(nevera3);
        Solicitudes.add(tienda1);
        Solicitudes.add(tienda2);
        
        atenderCliente(Solicitudes,Neveras);
      
        
        
    }
    
    
}