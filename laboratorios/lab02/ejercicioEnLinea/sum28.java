

/**
 * Solución ejercicios codingbat - Array2
 * 
 * @author (Camila Barona y Mariana Gomez) 
 * @version (2018)
 */
public class sum28
{
    public boolean sum28(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++)
        if (nums[i] == 2) sum += 2;
 
 
 if(sum==8)
 return true;
 else
 return false;
    
}
}
