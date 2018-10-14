
/**
 * Write a description of class Node here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
