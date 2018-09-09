

/**
 * Solución ejercicios codingbat - Array3
 * 
 * @author (Camila Barona y Mariana Gomez) 
 * @version (2018)
 */
public class seriesUp
{
   public int[] seriesUp(int n) {
  
  int g= n*(n+1)/2;
  int a[]= new int[g];
  int cont=0;
  
  for(int i=1; i<=n; i++){
    for(int j=1; j<=i; j++){
     a[cont]=j;
     cont++;
    }
  }
  
  return a;
}
}
