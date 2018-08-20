/**
 * Solución ejercicios codingbat - Recursion 1
 * 
 * @author (Camila Barona y Mariana Gomez) 
 * @version (2018)
 */
public class Count7
{
    public int count7(int n) {
        if (n<10 && n!=7){
            return 0;
        } else if (n%10==7) {
            return 1+count7(n/10);
        } else {
            return count7(n/10);
        }
    }
}
