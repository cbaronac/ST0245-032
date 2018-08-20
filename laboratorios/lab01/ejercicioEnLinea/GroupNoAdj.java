
/**
 * Solución ejercicios codingbat - Recursion 2
 * 
 * @author (Camila Barona y Mariana Gomez) 
 * @version (2018)
 */
public class GroupNoAdj
{
    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length){ 
            return target == 0;
        } else {
            return groupNoAdj(start + 2, nums, target - nums[start])||groupNoAdj(start + 1, nums, target);
        }
    }
}
