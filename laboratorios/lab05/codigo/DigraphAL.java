import java.util.ArrayList;
import java.util.LinkedList;
import javafx.util.Pair;
/**
 * Esta clase es una implementación de un digrafo usando listas de adyacencia
 * 
 * @author Mauricio Toro 
 * @version 1
 */
public class DigraphAL extends Graph
{
    ArrayList<LinkedList<PairCreada>> grafoConListas=new ArrayList<>();
    Graph auxiliar;

    public DigraphAL(int size)
    {
        super(size);
        grafoConListas=new ArrayList(size);
        for (int i=1;i<=size;i++){
            grafoConListas.add(new LinkedList());
        }
    }

    public void addArc(int source, int destination, int weight)
    {
        PairCreada pareja= new PairCreada(destination,weight);
        LinkedList<PairCreada> lista=grafoConListas.get(source);
        lista.add(pareja);
    }

    public int getWeight(int source, int destination)
    {
        LinkedList<PairCreada> lista=grafoConListas.get(source);
        for (int i=0;i<lista.size();i++){
            if (lista.get(i).vertice==destination){
                return lista.get(i).peso;
            }
            break;
        }
        return 0;
    }

    public ArrayList<Integer> getSuccessors(int vertice)
    {
        LinkedList<PairCreada> lista = grafoConListas.get(vertice);
        ArrayList<Integer>sucesores = new ArrayList<>();
        for(int i=0; i<lista.size();i++){
            if(lista.get(i).peso!=0){
                sucesores.add(lista.get(i).vertice);
            }
        }
        return sucesores;
    }
}
