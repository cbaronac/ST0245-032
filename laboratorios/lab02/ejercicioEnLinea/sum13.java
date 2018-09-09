
/**
 * Solución ejercicios codingbat - Array2
 * 
 * @author (Camila Barona y Mariana Gomez) 
 * @version (2018)
 */
public class sum13
{
  public int sum13(int[] nums) {

int suma=0;

for(int i=0; i<nums.length; i++){
  
  if(nums[i]!=13)
  suma+=nums[i];
  else if(i<nums.length) 
    i++;
}

return suma;


}
}
