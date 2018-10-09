import java.util.ArrayList;
import java.util.LinkedList;
import javafx.util.Pair;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class UnaTablaDeHash {
    
  
    
   private ArrayList<LinkedList<Pair<String,Integer>>> tabla;
   private ArrayList<LinkedList<Pair<String,String>>> paises;

 
   public UnaTablaDeHash(){
      tabla = new ArrayList<>();
      paises = new ArrayList<>();
   }

  
   
   private int funcionHash(String k, ArrayList hash){
       int suma = 0;
       for(int i = 0; i < k.length(); i++){
         suma += ((int) k.charAt(i)) * i * (int) Math.pow(2,31-i);
       }
       return suma % hash.size();
   }

   
   public int get(String k){
       int laFuncionHashDeK =  funcionHash(k, tabla);
       LinkedList<Pair<String,Integer>> temp = tabla.get(laFuncionHashDeK);
       for(Pair<String,Integer> pareja: temp){
            if(k.equalsIgnoreCase(pareja.getKey())){
                return pareja.getValue();
            }
        }
       return -1;
   }

 
   
   public void put(String k, int v){  
         Pair<String,Integer> pareja= new Pair(k,v);
         tabla.get(funcionHash(k,tabla)).add(pareja);
   }
   
   public String getEmpresa(String nombreE){
     int laFuncionHashDeK =  funcionHash(nombreE, paises);
       LinkedList<Pair<String,String>> temp = paises.get(laFuncionHashDeK);
       for(Pair<String,String> pareja: temp){
            if(nombreE.equalsIgnoreCase(pareja.getKey())){
                return pareja.getValue();
            }
       }
       return "no se encuentra en la lista";
   }
   
   
  
   
   public void putEmpresa(String pais, String nombre){
     Pair<String,String> pareja= new Pair(nombre,pais);
         paises.get(funcionHash(pais,paises)).add(pareja);
   }
}
