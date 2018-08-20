
/**
 * Solución ejercicios codingbat - Recursion 1
 * 
 * @author (Camila Barona y Mariana Gomez) 
 * @version (2018)
 */
public class CountHi
{
    public int countHi(String str) {
        if (str.length()<2 && !str.equals("hi")) {
            return 0;
        } else if (str.substring(0,2).equals("hi")) {
            return 1+countHi(str.substring(2));
        } else {
            return countHi(str.substring(1));
        }
    }
    }
