
import java.util.Arrays;
import java.io.*;

/**
 * La clase MiArrayList tiene la intención de representar un objeto que simule el comportamiento
 * de la clase ya implementada "ArrayList"
 * es claro que no se puede utilizar dicha estructura ya utilizada dentro de este ejercicio. 
 * Para más información de la clase ArrayList:
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html"> Ver documentacion ArrayList </a>
 * 
 * 
 * @author Mauricio Toro, Andres Paez
 * @version 1
 */

public class MiArrayList {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int elements[]; 

    /**
     * El metodo constructor se utiliza para incializar
     * variables a valores neutros como 0 o null.
     * El contructor no lleva parámetros en este caso.
     */
    public MiArrayList() {
        elements = new int[DEFAULT_CAPACITY];
        size=0;
    }     

    /**
     * Tiene la intención de retornar la longitud del objeto
     * @return longitud del objeto
     *
     * El size esta influenciado por las funciones add y del
     */
    public int size() {
        return size;
    }   

    /** 
     * @param e el elemento a guardar
     * Agrega un elemento e a la última posición de la lista
     *
     */
    public void add(int e)  {
        elements[size]=e;
        size++;
    } 

    /** 
     * @param i es un íncide donde se encuentra el elemento posicionado
     * Retorna el elemento que se encuentra en la posición i de la lista.
     *
     */
    public int get(int i) throws Exception {
        if (i>=0 && i<=size) {
            return elements[i]; 
        } else {
            throw new Exception ("No puede realizarse la operacion");
        }
    }

    /**
     * @param index es la posicion en la cual se va agregar el elemento
     * @param e el elemento a guardar
     * Agrega un elemento e en la posición index de la lista
     *
     */
    
    //COMPLEJIDAD: La complejidad del método agregar caracter si permite que la lista sea utilizada pues es O(n).
 
    //2. La complejidad de agregar n caracteres es O(n^2) 
    
    public void add(int index, int e) throws Exception  {
        if (index>=0 && index<=size) {
            if (verificar()){
                actualizar();
                for (int i=size; i>=index;i--){
                    elements[i+1]=elements[i];
                }
                elements[index]=e;
            } else {
                for (int i=size; i>=index;i--){
                    elements[i+1]=elements[i];
                }
                elements[index]=e;
            }
            size++;
        } else {
            throw new Exception ("No puede realizarse la operacion");
        }
    } 
   
    
    //ACTUALIZA EL ARREGLO CON UNO NUEVO
    public void actualizar(){
        int nuevo[]=new int [elements.length*2];
        for (int i=0; i>=size;i++){
            nuevo[i]=elements[i];

        }
        elements=nuevo;
    }

    //VERIFICA SI EL ARREGLO ESTA LLENO
    public boolean verificar(){
        if (elements.length==size){
            return true;
        } else { 
            return false;
        }
    }

    /**
     * @param index es la posicion en la cual se va agregar el elemento
     *
     * ELimina el elemento  en la posición index de la lista
     *
     */
    public void del(int index) throws Exception{
        if (index>=0 && index<=size) {
            for (int i=0; i<=size-1;i++){
                elements[i]=elements[i+1];        
            }
            size--;
        } else {
            throw new Exception ("No puede realizarse la operacion");
        }
    }
}