import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista simplemente enlazada
public class LinkedListMauricio {
    private Node first;
    private int size;

    public LinkedListMauricio()
    {
        size = 0;
        first = null;   
    }

    /**
     * Returns the node at the specified position in this list.
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    private Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Returns the element at the specified position in this list.
     * @param index - index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    public int get(int index) throws IndexOutOfBoundsException {
        Node temp = getNode(index);
        return temp.data;
    }

    // Retorna el tamaño actual de la lista
    public int size()
    {
        return size;
    }

    // Inserta un dato en la posición index
    public void insert(int data, int index) throws IndexOutOfBoundsException
    {
        if (index==0) {
            Node nuevo= new Node(data);
            nuevo.next=first;
            first=nuevo;
            size++;
        } else if(index>=0 && index<size){
            Node temp=getNode(index-1);
            Node nuevo= new Node(data);
            nuevo.next=temp.next;
            temp.next=nuevo;
            size++;
        }else {
            throw new IndexOutOfBoundsException();      
        }
    }

    //Borra el dato en la posición index
    public void remove(int index) throws IndexOutOfBoundsException
    { if (index==0) {
            Node temp=first.next;
            first=temp;
        } else if (index>=0 && index<size){
            Node temp=getNode(index-1);
            temp.next=temp.next.next;
            size--;
        } else if (index==size-1){
           Node temp =getNode(size-2);
           temp.next= null;
           size--;
        }else {
            throw new IndexOutOfBoundsException();  
        }
    }
    // Verifica si está un dato en la lista
    public boolean contains(int data)
    {
        Node nodoEncontrado=first;
        while (nodoEncontrado!=null){
            if (nodoEncontrado.data==data){
                return true;
            }
            nodoEncontrado=nodoEncontrado.next;
        }
        return false;
    }

    public static void main (String[]args){
        LinkedListMauricio list=new LinkedListMauricio();
        list.insert(3,0);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println(list.contains(3));
        System.out.println(list.contains(3));
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}

