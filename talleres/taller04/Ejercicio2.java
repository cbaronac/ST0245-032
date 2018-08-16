
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.concurrent.TimeUnit;
public class Ejercicio2
{
    public static void main (String [] args) {
        for (int i=1;i<=20;i++) {
            int [] a=new int [i];
            for (int j=0;j<i;j++) {
                a[j]=j;
            }
            //Calcular el tiempo:
            long start = System.currentTimeMillis();
            suma(a);
            long fin = System.currentTimeMillis();
            System.out.println (fin-start);
        }
    }

    /**
     * Constructor for objects of class Ejercicio2
     */
    public static int suma(int a[])
    {
        return suma(0,a,0);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    private static int suma(int inicio, int [] a, int fin)
    {
        if (inicio >= a.length) {
            return fin = 0;
        } else { 
            return suma(inicio + 1, a, fin - a[inicio]) | suma(inicio + 1, a, fin);
        }
    }
}
