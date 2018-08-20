/**
 * Laboratorio 1 de Estructuras de Datos 1
 * 
 * @author Camila Barona y Mariana Gómez 
 * @version 1
 */

import java.util.Arrays;
import java.util.*;

public class Laboratory1
{

    // Computes the sum of an array recursively
    /**
     * Metodo que devuelve la suma de los numeros de un arreglo
     * @param A, n  A es donde se almacenaran los numeros para ser sumados y n el tamaño del arreglo
     * @return suma de los números del arreglo
     */
    public static int ArraySum(int[] A, int n)
    {          
        if (n<1) {
            return A[n];
        } else {
            return A[n]+ArraySum(A,n-1);
        }
    }

    // Computes the maximum value of an array recursively
    /**
     * Metodo que devuelve el número más grande de un arreglo
     * @param A, n  Siendo A donde se almacenaran los números del arreglo y n el tamaño de este
     * @return El número más grande almacenado en el arreglo
     */
    public static int ArrayMax(int[] A, int n)
    {
        if (n==1) {
            return A[0];
        } else {
            return Math.max(A[n-1],ArrayMax(A,n-1));
        }
    }

    // Computes Fibonnacci series recursively
    /**
     * Metodo que devuelve los números de la sucesión de Fibonacci
     * @param num El parametro num define el número de elementos que seran
     * mostrados en la cadena de Fibonacci (n-ésimo termino)
     * @return Números en la sucesión de Fibonacci
     */
    public static int Fibonnacci(int n)
    {
        if (n==0 || (n==1)){
            return n;
        } else {
            return Fibonnacci(n-1)+Fibonnacci(n-2);
        }
    }

    public static void main(String[] args)
    {
        int[] A = {1,5,3,2,6};
        int[] B = {1,5,3,2};
        int[] C = {1,5,2,6};
        int [] D = {5};
        int[][] Arrays = {A,B,C,D};   
        for (int[] X : Arrays)
        {        
            System.out.println(Laboratory1.ArraySum(X, X.length - 1) + " " + Laboratory1.ArrayMax(X, X.length ) + " " + Laboratory1.Fibonnacci(X.length) +  "\n" );      
        }
    }

}
