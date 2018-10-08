import java.util.*;
/**
 * Write a description of class Ejercicio31 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio31
{
      /**
     * This method print a String with the text written for the user and transformaded without "]" or "["
     * @param texto - String typped for the User
     */
    public static void maquinaEnloqueciendo (String texto) {
        LinkedList<String> nueva= new LinkedList<>();
        int index=0;
        boolean llaveInicial=true;
        String respuesta="";
        for (int i=0; i<texto.length();i++) {
            if (texto.substring(i,i+1).equals("[")){
                index=0;
                llaveInicial=true;
            } else if (texto.substring(i,i+1).equals("]")) {
                llaveInicial=false;
            } else if (!(texto.substring(i,i+1).equals("[") && texto.substring(i,i+1).equals("]"))){
                if (llaveInicial) {
                    nueva.add(index, texto.substring(i,i+1));
                    index++;
                } else {
                    nueva.add(texto.substring(i,i+1));
                }
            }
        }

        for (int i=0; i<nueva.size();i++){
            respuesta+=nueva.get(i);
        }

        System.out.print(respuesta);
    }
}