
/**
 * Solución ejercicios codingbat - Recursion 1
 * 
 * @author (Camila Barona y Mariana Gomez) 
 * @version (2018)
 */
public class BunnyEars
{
    public int bunnyEars2(int bunnies) {
        if (bunnies==0) {
            return 0;
        } else if (bunnies%2!=0){
            return 2+bunnyEars2(bunnies-1);
        } else {
            return 3+bunnyEars2(bunnies-1);
        }
    }
}
