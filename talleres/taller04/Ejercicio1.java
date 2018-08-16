
/**
 * Write a description of class Ejercicio1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.concurrent.TimeUnit;
public class Ejercicio1
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

    public static int suma (int []a) {
        return suma(a,0);
    }

    private static int suma (int[]a,int i) {
        if (i==a.length) {
            return 0;
        } else {
            try {
                //Delay Java
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
            }
                return a[i]+suma(a,i+1);
            }
        }
    }

