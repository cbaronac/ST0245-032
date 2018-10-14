
/**
 * Objeto nodo para los ejercicios encontrados en el Lab 04.
 * 
 * @author (Camila Barona - Mariana Gómez) 
 * @version (2018)
 */
public class Node
{
    public Node left;
    public Node right;
    public int data;
    public String persona;
    
   public Node(int data){
       this.data=data;
    }
    
    public Node(String persona) {
        this.persona=persona;
    }
}
