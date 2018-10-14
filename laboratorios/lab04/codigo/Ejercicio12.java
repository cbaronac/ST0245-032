
/**
 * Solución del ejercicio 1.2 - Lab 04.
 * 
 * @author (Mariana Gómez - Camila Barona) 
 * @version (2018)
 */
public class Ejercicio12
{

    /**
     * @param node es la raíz del arbol
     * Metodo que busca encontrar las abuelas de una familia mediante un árbol genealógico
       */
    public static void ejercicio12(Node nodo){
        String abue1="";
        String abue2="";

        if(nodo!=null){
            if(nodo.left.left!=null){
                abue1=nodo.left.left.persona;
            }
            else {
                System.out.println("No se conoce a la abuela Materna");
            }
            if(nodo.right.left!=null){
                abue2=nodo.right.left.persona;
            }
            else {
                System.out.println("No se conoce a la abuela Paterna");
            }
        }
        System.out.println("La abuela Materna es: "+abue1);
        System.out.println ("La abuela Paterna es: "+abue2);
    }
}
