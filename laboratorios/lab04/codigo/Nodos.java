
/**
 * Write a description of class BTree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BTree
{    
    private String dato;
    private BTree izquiero;
    private BTree derecho;
    
    public BTree(String dato){  
        this.dato=dato;     
    }

    public BTree getIzquiero() {
        return izquiero;
    }

    public BTree getDerecho() {
        return derecho;
    }

    public void setIzquierdo(BTree izquiero) {
        this.izquiero = izquiero;
    }

    public void setDerecho(BTree derecho) {
        this.derecho = derecho;
    }

    public String getDato() {
        return dato;
    }
    
    
}
