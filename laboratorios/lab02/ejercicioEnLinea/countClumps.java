

/**
 * Solución ejercicios codingbat - Array3
 * 
 * @author (Camila Barona y Mariana Gomez) 
 * @version (2018)
 */
public class countClumps
{
   public int countClumps(int[] nums) {
  
int count = 0;

for(int i = 0;i<nums.length-1;i++){
  
 if(nums[i] == nums[i+1] && (i==0 || nums[i-1]!=nums[i]))
    count++;
    
}
return count;
  
}
}
