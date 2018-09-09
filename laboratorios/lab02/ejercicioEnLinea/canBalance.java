

/**
 * Solución ejercicios codingbat - Array3
 * 
 * @author (Camila Barona y Mariana Gomez) 
 * @version (2018)
 */
public class canBalance
{
    public boolean canBalance(int[] nums) {
  
        int suma=0;
  
    for (int i = 0; i < nums.length; i++) { 
        suma = 0;
        for (int k = i; k < nums.length; k++)
        suma -= nums[k];
        for (int j = 0; j < i; j++)
        suma += nums[j];
        if (suma == 0)  return true;
    }
    return false;
}
}
