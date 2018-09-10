/**
 * Laboratorio 1 de Estructuras de Datos 1
 * 
 * @author Mauricio Toro 
 * @version 1
 */

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Laboratory1
{
    // Computer the sum of an array
    public static int ArraySum(int[] A)
    {          
        int sum = 0;
        for (int i = 0; i < A.length; i++)
            sum = sum + A[i];
        return sum;
    }

    // Computes the maximum value of an array
    public static int ArrayMax(int[] A)
    {
        int max = A[0];
        for (int i = 0; i < A.length; i++)
            if (A[i] > max)
                max = A[i];
        return max;
    }

    // Sorts an array using Insertion Sort
    public static void InsertionSort(int[] A)
    {
        int temp,j;

        for (int i = 0; i < A.length; i++)
        {
            j = i;
            while (j > 0 && A[j-1] > A[j])
            {
                temp = A[j];
                A[j] = A[j-1];
                A[j-1] = temp;
                j = j-1;

            }           
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception e) {
        }
        System.out.println(Arrays.toString(A));
    }

    // Sorts an array using Merge Sort
    // Taken from www.cs.cmu.edu/
    public static void mergeSort(int [ ] a)
    {
        int[] tmp = new int[a.length];
        mergeSort(a, tmp,  0,  a.length - 1);
    }

    private static void mergeSort(int [ ] a, int [ ] tmp, int left, int right)
    {
        if( left < right )
        {
            int center = (left + right) / 2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }
    }

    private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left] <= a[right] )
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args)
    {
        int[] A = {1,5,3,2,6};
        int[] B = {1,5,3,2};
        int[] C = {1,5,2,6};
        //int[][] Arrays = {A,B,C};  
        for (int i=1; i<=20; i++) {
            int [] a=new int[i];
            int[][] Arrays = {a};
            for (int j=0;j<i;j++) {
                a[j]=j;
            }
            for (int[] X : Arrays)
            {     
                //calcular el tiempo:
                long start = System.currentTimeMillis();
                Laboratory1.mergeSort(X);
                long fin= System.currentTimeMillis();
                long start2 = System.currentTimeMillis();
                Laboratory1.InsertionSort(X);
                long fin2 = System.currentTimeMillis();

                System.out.println("Suma: "+Laboratory1.ArraySum(X) + " " + "Mayor: "+ Laboratory1.ArrayMax(X) + "\n" );      
                System.out.println ("Tiempo mergeSort: ");
                System.out.println(fin-start);
                System.out.println ("Tiempo insertionSort: ");
                System.out.println(fin2-start2);
                System.out.println();
            }
        }
    }

}
