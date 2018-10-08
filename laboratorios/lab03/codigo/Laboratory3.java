import java.util.*;
import java.lang.IndexOutOfBoundsException;

/**
 * Development of exercises 1.1 - 1.5.
 * @author (Camila Barona - Mariana Gómez) 
 * @version (2018)
 */
public class Laboratory3 {
    //EXERCISE 1.1
    /**
     * EXERCISE 1.1
    * This metod insert a data at the end of the List with the condition that it
    * doesn't appear twice.
    * @param List
    * @param data
    */
    public static void smartInsert(List<Integer> lista, int data) {
        if (lista.contains(data)) {

        } else {
            lista.add(data);
        }
    }

    //EXERCISE 1.2
    /**
     * EXERCISE 1.2
     * Verify which pivote is the best in an Array
     * @param List
     * This metod prints in which position the beam will be less unbalanced
     */
    public static void ejercicio12(List<Integer> lista) {
        int izquierda = 0;
        int derecha = 0;
        boolean noPivote = true;
        int pivote = 0;
        int index = lista.size() / 2;

        for (int i = 0; i < index; i++) {
            izquierda += (int) lista.get(i);
        }

        for (int i = index + 1; i < lista.size(); i++) {
            derecha += (int) lista.get(i);
        }

        if (derecha == izquierda) {
            System.out.println("Correct pivote: " + lista.get(index)+" at index: "+index);
            noPivote = false;
        }
        else {
            pivote = (int) lista.get(index);
            int resta = Math.abs(derecha - izquierda);
            int restaAux = 0;
            while (noPivote) {
                if (derecha > izquierda) {
                    index=index+ 1;
                    derecha = 0;
                    izquierda = 0;
                    for (int i = index+1; i < lista.size(); i++) {
                        derecha += (int) lista.get(i);
                    }
                    for (int i = 0; i < index; i++) {
                        izquierda += (int) lista.get(i);
                    }
                    restaAux = Math.abs(derecha - izquierda);
                    if (resta > restaAux) {
                        resta = restaAux;
                        pivote = (int) lista.get(index);

                    }
                    else{
                        noPivote = false;
                    }
                }
                else{
                    derecha = 0;
                    index= index-1;
                    izquierda = 0;
                    for (int i = index+1; i < lista.size(); i++) {
                        derecha += (int) lista.get(i);
                    }
                    for (int i = 0; i < index; i++) {
                        izquierda += (int) lista.get(i);
                    }
                    restaAux = Math.abs(derecha - izquierda);
                    if (resta>restaAux) {
                        resta = restaAux;
                        pivote = (int) lista.get(index);
                    }
                    else{
                        noPivote = false;
                    }
                }
                if (index == lista.size() || index == 0) {
                    noPivote = false;
                    pivote = (int) lista.get(index);
                }
            }
            System.out.println("Correct pivote: " + pivote+"at index: "+index);
        }
    }

    //EXERCISE 1.3
    //It has two objects: Tienda and Nevera
     /**
      * EXERCISE 1.3
     * This method is based on attend a client
     * @param solicitudes - Queue
     * @param neveras - Stack
     */
    public static void atenderCliente(Queue <Tienda> solicitudes, Stack <Nevera> neveras) {
        while (!solicitudes.isEmpty()) {
            for (int i=0; i<solicitudes.peek().cantidad;i++){
                Nevera variable=neveras.pop();
                System.out.println ("Fridge's code: "+variable.codigo);
                System.out.println ("Fridge's brand: "+variable.marca);
            }
            solicitudes.poll();
        }
    }

    //EXERCISE 1.4
    private Node head;
    private Node tail;
    private int size;

    /**
     * Returns the node at the specified position in this list.
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    public Laboratory3()
    {
        this.size = 0;
        this.head = null; 
        this.tail=null;
    }

    /**
     * Returns if the LinkedList is Empty or not.
     * @return boolean if the LinkedList is Empty or not.
     */
    public boolean isEmpty(){
        return size==0;
    }

    /**
     * Returns the size of the LinkedList.
     * @return the size of the LinkedList
     */
    public int size(){
        return size;
    }

    /**
     * Returns the node at the specified position in this list.
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    private Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Node temp = head;
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

    // Inserta un dato en la posición index
    /**
     * Insert a Node in the List
     * @param index - index of the node to return
     * @param data - data of the new Node
     * @throws IndexOutOfBoundsException
     */
    public void insert(int data, int index) throws IndexOutOfBoundsException {
        if (isEmpty()){
            Node nuevo= new Node(data);
            head=nuevo;
            tail=nuevo;
            size++;
        }
        else if (index==0) {
            Node nuevo= new Node(data);
            nuevo.next=head;
            head=nuevo;
            Node temp= head.next;
            temp.previous=head;
            size++;
        } else if (index>=0 && index<size) {
            Node nuevo = new Node(data);
            Node temp=getNode(index);
            Node temp2=getNode(index-1);
            nuevo.next=temp;
            nuevo.previous=getNode(index-1);
            temp.previous=nuevo;
            temp2.next=nuevo;
            size++;
        } else if (index==size){
            Node nuevo=new Node(data);
            tail.next= nuevo;
            nuevo.previous=tail;
            tail=nuevo;
            Node temp=tail.previous;
            temp.next=tail;
            size++;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    //Borra el dato en la posición index
    /**
     * Remove a Node of the specifics position of the list
     * @param index - index of the node to return
     * @throws IndexOutOfBoundsException
     */
    public void remove(int index) throws IndexOutOfBoundsException
    {   
        if (isEmpty()){
            throw new IndexOutOfBoundsException();  
        }else if (index==0) {
            Node temp=head;
            if (head==tail) {
                tail=null;
            } else {
                head.next.previous=null; 
            }
            head=head.next;
            temp.next=null;
            size--;
        } else if (index>0 && index<size-1){
            Node temp=getNode(index-1);
            temp.next=temp.next.next;
            size--;
        } else if (index==size-1){
            Node temp =tail;
            if (head==tail) {
                head=null;
            } else {
                tail.previous.next=null;
            }
            tail=tail.previous;
            temp.previous=null;
            size--;
        }else {
            throw new IndexOutOfBoundsException();  
        }
    }

    // Verifica si está un dato en la lista
    /**
     * Verify if a specific data is in the List
     * @param data - Data of the Node
     */
    public boolean contains(int data)
    {
        Node nodoEncontrado=head;
        while (nodoEncontrado!=null){
            if (nodoEncontrado.data==data){
                return true;
            } else {
                nodoEncontrado=nodoEncontrado.next;
            }
        }
        return false;
    }

    public static void main (String[]args){
        //Test of Exercise 1.1
        LinkedList <Integer>nueva= new LinkedList(); 
        nueva.add(1);
        nueva.add(2);
        nueva.add(3);
        smartInsert(nueva,2);
        
        //Test of Exercise 1.2
        LinkedList<Integer> pivote= new LinkedList();
        pivote.add(10);
        pivote.add(30);
        pivote.add(125);
        pivote.add(70);
        ejercicio12(pivote);
        
        //Test of Exercise 1.3
        Stack <Nevera> Neveras = new Stack <Nevera>();
        Queue <Tienda> Solicitudes= new LinkedList <Tienda>();
        Nevera nevera1= new Nevera(01, "LG");
        Nevera nevera2= new Nevera(02, "LG");
        Nevera nevera3= new Nevera(03, "SM");
        Tienda tienda1= new Tienda("Jumbo", 2);
        Tienda tienda2= new Tienda("Metro", 1);
        Neveras.add(nevera1);
        Neveras.add(nevera2);
        Neveras.add(nevera3);
        Solicitudes.add(tienda1);
        Solicitudes.add(tienda2);
        atenderCliente(Solicitudes,Neveras);

        //Test of Exercise 1.4
        //Optional point 1.5
        Laboratory3 list=new Laboratory3();
        list.insert(0,0);
        list.insert(1,0);
        list.insert(10,2);
        
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        
        System.out.println(list.contains(10));
        System.out.println(list.contains(2));
        list.remove(2);
        list.remove(0);
        list.remove(0);
        list.remove(0);

    }
}