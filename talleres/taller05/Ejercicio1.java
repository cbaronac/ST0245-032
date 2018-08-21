
/**
 * Write a description of class Ejercicio1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.concurrent.TimeUnit;
public class Ejercicio1
{
    public static void main (String [] args) {
      for (int i=10000000;i<=200000000;i=i+10000000) {
            int [] a=new int [i];
            for (int j=0;j<i;j++) {
                a[j]=j;
            }
            //Calcular el tiempo:
            long start = System.currentTimeMillis();
            System.out.println(a);
            insertionSort(a);
            long fin = System.currentTimeMillis();
            System.out.println (fin-start);
        }
    }

    public static int[] insertionSort(int []a) {
        return insertionSort(a,0);
    }

    private static int[] insertionSort(int[] nums, int n){
        for (int i=1;i<nums.length;i++){
            int temp=nums[i];
            int j=i;
            while (j>0 && nums[j-1]>temp) {
                nums[j]=nums[j-1];
                j--;
            }
            nums[j]=temp;
        }
        return nums;
    }
}
