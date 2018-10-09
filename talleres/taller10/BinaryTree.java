
/**
 * La clase BinaryTree intenta dar un conocimiento a los
 * estudiantes acerca del manejo de un arbol binario de enteros.  
 * Aquí se espera crear una estrcutura concreta del árbol binario,
 * cabe aclarar que esta estrucutra ya esta implementada.
 * @see <a href="https://docs.oracle.com/javase/9/docs/api/jdk/nashorn/api/tree/BinaryTree.html"> Árbol Binario</a>
 * @author Mauricio Toro, Andres Paez
 *
 */

public class BinaryTree {

    // Sirve como raíz del árbol
    public Node root;

    /**
     * @param n el dato del nodo que se busca buscar
     * Metodo auxiliar de insetarAux.
     *
     */
    public void insertar(int n) {
        insertarAux(root, n);
    }

    public boolean esVacio(){
        return (root==null);
    }

    /**
     * @param node es la raíz del arbol
     * @param n el data del nodo que se busca insertar
     * nota: metodo recursivo.
     * Inserta un dato respetando claro las desigualdades en el árbol
     */
    private void insertarAux(Node node, int valor){
        if (esVacio()) {
            Node nuevo=new Node(valor);
            nuevo.data=valor;
            root=nuevo;
        } else{
            if (valor<node.data) {
                if (node.left!=null) {
                    insertarAux(node.left,valor);
                } else {
                    System.out.println(valor+"Insertado en el nodo izquierdo");
                    node.left=new Node(valor);
                }
            } else if (valor > node.data) {
                if (node.right!=null){
                    insertarAux(node.right, valor);
                } else {
                    System.out.println(valor+" insertado en el nodo derecho");
                    node.right=new Node(valor);
                }
            } 
        }
        //T(n)=T(n-1)+C
        //Complejidad: O(n)
    }

    /**
     * @param n el dato del nodo que se busca.
     * Metodo auxiliar de buscarAux.
     * @return true si el metodo buscarAux es true
     */
    public boolean buscar(int n) {
        return buscarAux(root, n);
    }

    /**
     * @param node es la raíz del arbol
     * @param n el data del nodo que se busca
     * nota: metodo recursivo.
     * Inserta un dato respetando claro las desigualdades en el árbol
     * @return true si se encuentra el elemento en el árbol, false de lo contrario
     */ 

    private boolean buscarAux(Node node, int n) {
        if (node.data==n) {
            return true;
        } else if (node==null) {
            return false;
        } else if (n>node.data) {
            return buscarAux(node.right,n); //T(n)=T(n/2)+C
        } else {
            return buscarAux(node.left,n);
        }

        //Peor de los casos: T(n)=T(n-1)+C
        //Complejidad O: O(n)
    }

    /*
    Los metodos posteriores son para imprimir el arbol de manera
    que sirven para debuggeo
     */

    /**
     * @param node el nodo desde el cual se imprimirá
     * imprime el arbol desde el nodo node
     */
    private void recursivePrintAUX(Node node)
    {
        if (node != null)
        {
            recursivePrintAUX(node.left);
            recursivePrintAUX(node.right);
            System.out.println(node.data);
        }

    }

    /**
     * Metodo auxiliar de recursivePrintAUX
     *
     */
    public void recursivePrint()
    {
        recursivePrintAUX(root);
    }

}