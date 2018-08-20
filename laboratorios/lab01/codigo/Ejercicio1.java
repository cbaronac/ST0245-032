/**
 *
 * @author Camila Barona y Mariana Gómez
 * @version 2018
 */
public class Ejercicio1 {
    /**
     * Metodo que devuelve los números de la sucesión de Fibonacci
     * @param num El parametro num define el número de elementos que seran
     * mostrados en la cadena de Fibonacci (n-ésimo termino)
     * @return Números en la sucesión de Fibonacci
     */
    public int fibonacci(int num)
    {
       if (num==0 || (num==1)){
           return num;
        } else {
            return fibonacci(num-1)+fibonacci(num-2);
       }
       //Cierre del método
    } //Cierre de la clase
}
