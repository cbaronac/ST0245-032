
/**
 * Write a description of class Arbolfamiliar2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arbolfamiliar2
{/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       BTree raiz= new BTree("Mariana G�mez"); 
       BTree nodo2= new BTree("Liana");
       BTree nodo3= new BTree("Hector");
       BTree nodo4= new BTree("Mariela");
       BTree nodo5= new BTree("Anibal");
       BTree nodo6= new BTree("Dioselina");
       BTree nodo7= new BTree("Hern�n");
       
       raiz.setIzquierdo(nodo2);
       raiz.setDerecho(nodo3);
       
       //familia mam�
       nodo2.setIzquierdo(nodo4);
       nodo4.setIzquierdo(new BTree("Teresa"));
       nodo4.setDerecho(new BTree("Ram�n"));
       
       nodo2.setDerecho(nodo5);
       nodo5.setIzquierdo(new BTree("Bernarda"));
       nodo5.setDerecho(new BTree(null));
       
       //familia pap�
       nodo3.setIzquierdo(nodo6);
       nodo6.setIzquierdo(new BTree("Carmen"));
       nodo6.setDerecho(new BTree("Jos�"));
       
       nodo3.setDerecho(nodo7);
       nodo7.setIzquierdo(new BTree("Margarita"));
       nodo7.setDerecho(new BTree("Crisanto"));
       
       System.out.println("Mi �rbol familiar");
       System.out.println("Se imprime en PreOrden");
       System.out.println("-------------------------");
       preOrden(raiz);
    }
    
     
       private static void preOrden(BTree raiz){
           
       if(raiz!= null){
           
           System.out.println(raiz.getDato());
           preOrden(raiz.getIzquiero());
           preOrden(raiz.getDerecho());
           
                     }  
       }
       
}

