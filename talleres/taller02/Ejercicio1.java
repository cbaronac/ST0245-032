
/**
 * Write a description of class Ejercicio1 here.
 * 
 * @author (Camila Barona y Mariana Gómez) 
 * @version (a version number or a date)
 */
public class Ejercicio1
{
   	/**
	* @param p entrada 1 entero positivo, mayor que q
	* @param q entrada 2 entero positivo, menor que p
	*
	* El método gcd tiene como objetivo ecnontrar el
	* máximo común divisor de dos números, por medio del
	* algoritmo de euclides
	* @see <a href="https://www.youtube.com/watch?v=Q9HjeFD62Uk"> Explicación </a>
	* @see <a href="https://visualgo.net/en/recursion"> Funcionamiento </a>
	*
	* @return el máximo común divisor
	*/
	public static int gcd(int p, int q){
          return q==0 ? p: gcd(p,p%q);
	}
}
