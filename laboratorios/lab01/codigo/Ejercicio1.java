
/**
 * Encontar el n-esimo termino de Fibonacci.
 * 
 * @author (Camila Barona y Mariana Gómez) 
 * @version (2018)
 */
public class Ejercicio1
{
    public int fibonacci(int a)
    {
       if ((a==0) || (a==1)){
           return a;
        } else {
            return fibonacci(a-1)+fibonacci(a-2);
        }
    }
}
