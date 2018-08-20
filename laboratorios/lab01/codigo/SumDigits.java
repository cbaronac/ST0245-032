/**
 * Solución ejercicios codingbat - Recursion 1
 * 
 * @author (Camila Barona y Mariana Gomez) 
 * @version (2018)
 */
public class SumDigits
{
    public int sumDigits(int n) {
        return n==0 ? n: n%10+sumDigits(n/10);
    }
}
