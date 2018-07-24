
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author (Camila Barona y Mariana Gómez) 
 * @version (a version number or a date)
 */
public class Ejercicio2
{
    /**
     * @param start entrada 1 entero positivo, determina un índice dentro del proceso
     * @param nums entrada 2 arreglo de enteros positivos, sobre el cual vamos a interar 
     * @param target entrada 3 entero positivo, determina el valor de referencia 
     * El método SumaGrupo tiene como objetivo darnos a conocer si hay 
     * algun subconjunto el cual su suma = target.
     * 
     *
     * @return verdadero si hay un subconjunto el cual su suma = target
     */

    public static boolean SumaGrupo(int start, int[] nums, int target) {
        if (start>=nums.length) {
            return target==0;
        } else {
            return SumaGrupo(start+1,nums,target-nums[start]) || SumaGrupo(start+1,nums,target);
        }
    }
    
    public static boolean sumaGrupo1(int start, int [] nums, int target) {
        return start>=nums.length ? target==0: SumaGrupo(start+1,nums,target-nums[start]) || SumaGrupo(start+1,nums,target);
    }
}
