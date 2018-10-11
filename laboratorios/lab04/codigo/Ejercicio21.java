
/**
 * Solución del ejercicio 2.1 - Laboratorio 04
 * 
 * @author (Camila Barona - Mariana Gómez) 
 * @version (2018)
 */
public class Ejercicio21
{
    Node root;

    /**
     * @param n el dato del nodo que se busca buscar
     * Metodo auxiliar de insetarAux.
     *
     */
    public void insertar(int n) {
        insertarAux(root, n);
    }

    /**
     * 
     * Metodo que verifica si el arbol esta vacio
     *
     */
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
     * 
     * Metodo auxiliar de imprimirPO.
     *
     */
    public void imprimirAux(){
        imprimirPO(root);
    }

    /**
     * @param node es la raíz del arbol
     * nota: metodo recursivo.
     * Imprime un arbol en pos-orden (Nodo izquierdo, derecho y luego su raiz)
     */
    public void imprimirPO(Node node){
        if(node != null){
            imprimirPO(node.left);
            imprimirPO(node.right);
            System.out.println(node.data);
        }
    }
}

