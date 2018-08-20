
/**
 * Write a description of class Ejercicio1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio1
{
    public int fibonacci(int y)
    {
       if (y==0 || (y==1)){
           return y;
        } else {
            return fibonacci(y-1)+fibonacci(y-2);
        }
    }
}
