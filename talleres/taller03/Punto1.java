
/**
 * Write a description of class Punto01 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punto1
{
    private static void torresDeHannoiAux(int n, int origen, int intermedio, int destino) {
        if (n==1) {
            System.out.println ("Mover un disco de la torre "+origen+" a la "+destino);
        } else {
            torresDeHannoiAux(n-1,origen,destino,intermedio);
            System.out.println ("Mover un disco de la torre "+origen+" a la "+destino);
            torresDeHannoiAux(n-1,intermedio,origen,destino);
        }
    }
    
    public static void torresDeHannoi(int n) {
        torresDeHannoiAux(n,1,2,3);
    }
}
