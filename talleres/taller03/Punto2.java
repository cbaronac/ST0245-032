
/**
 * Write a description of class Punto2 here.
 * 
 * @author (Camila Barona y Mariana Gómez) 
 * @version (a version number or a date)
 */
public class Punto2
{
    private static void permutationsAux(String base, String s){
        if (s.length()==0){
            System.out.println(base);
        } else {
            for (int i=0;i<s.length();i++){
                permutationsAux(base+s.charAt(i),s.substring(0,i)+
                s.substring(i+1,s.length()));
            }
        }
    }

    public static void permutations(String s) {
        permutationsAux("",s);
    }
}

