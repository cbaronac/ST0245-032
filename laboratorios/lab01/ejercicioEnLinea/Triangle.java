
/**
 * Solución ejercicios codingbat - Recursion 1
 * 
 * @author (Camila Barona y Mariana Gomez) 
 * @version (2018)
 */
public class Triangle
{
    public int triangle(int rows) {
        return rows==0 ? rows:rows+triangle(rows-1);
    }
}

