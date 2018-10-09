
public class Node {
    public Node left;
    public Node right;
    public int data;
    
    public Node(int d){
        data = d;
    }

    public Node getLeft(){
        return left;
    }

    public Node getRight(){
        return right;
    }

    public int getData(){
        return data;
    }
}