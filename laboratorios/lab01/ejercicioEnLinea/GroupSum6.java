
/**
 * Solución ejercicios codingbat - Recursion 2
 * 
 * @author (Camila Barona y Mariana Gomez) 
 * @version (2018)
 */
public class GroupSum6
{
    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }else if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - nums[start]);
        } else {
            return groupSum6(start + 1, nums, target - nums[start]) || 
            groupSum6(start + 1, nums, target);
        }
    }
}
