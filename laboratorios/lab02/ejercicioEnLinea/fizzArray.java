

/**
 * Solución ejercicios codingbat - Array2
 * 
 * @author (Camila Barona y Mariana Gomez) 
 * @version (2018)
 */
public class fizzArray
{
   public int[] fizzArray(int n) {
  
  int a[]= new int[n];
  int cont=0;
  
  for(int i=0; i<a.length; i++)
  {
    
    a[i]=cont;
    cont++;
    
  }
  
  return a;
  
}
}
