/**
 * Solución ejercicios codingbat - Recursion 2
 * 
 * @author (Camila Barona y Mariana Gomez) 
 * @version (2018)
 */
public class SplitArray
{
    public boolean splitArray(int[] a) {
        return aux(0, a, 0, 0);
    }
    
    private boolean aux(int inicio, int[] a, int grupo1, int grupo2) {
        if (inicio >= a.length) {
            return grupo1 == grupo2;
        } else {
            return aux(inicio + 1, a, grupo1 + a[inicio], grupo2) || aux(inicio + 1, a, grupo1, grupo2 + a[inicio]);
        }
    }
}
