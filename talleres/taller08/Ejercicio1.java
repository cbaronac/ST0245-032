import java.util.*;

/**
 * @version 2018 
 * @author Camila Barona, Mariana Gomez 
 */
public class Ejercicio1 {
    /**

     * @param string es una cadena de texto que viene de este modo 3 4 5 * + o de esta manera 2 3 * 5 +

     * todo viene separado por espacios por lo que la funcion split.("") vendría muy bien para separarlos

     * Se intenta hacer el calculo por medio del metodo polaco posfijo

     * @return un entero resultado de la operación

     */

    public static void polaca  (String string){
        //Eliminando espacios
        String [] espacios = string.split(" ");

        //Pila de entrada
        Stack <String> Entrada = new Stack <String>();
        //Pilad de expresiones
        Stack <String> Expresion= new Stack <String>();

        for (int i=espacios.length-1;i>=0;i--) {
            Entrada.add(espacios[i]);
        }

        String operadores="+-*/%";
        while (!Entrada.isEmpty()){
            if (operadores.contains(""+Entrada.peek())) {
                Entrada.push(operar(Entrada.pop(),Expresion.pop(),Expresion.pop())+"");
            } else {
                Expresion.push(Entrada.pop());      
            }
        } 

        //Imprimir resultado
        System.out.println("Expresion: " + string);
        System.out.println("Resultado: " + Expresion.pop());
        
    }

     /**
     * @param operacion es el simbolo que se utilizara en la notacion polaca, es decir + - * /
     * numero 1 y numero 2 son los numeros que se van a operar dentro de la notacion polaca
     * @return un entero resultado de la operación
     */
    private static int operar(String operacion, String numero1, String numero2) {
        int num1=Integer.parseInt(numero1);
        int num2=Integer.parseInt(numero2);
        if (operacion.equals("+")) {
            return (num1+num2);
        }
        if (operacion.equals("-")) {
            return (num1-num2);
        }        
        if (operacion.equals("*")) {
            return (num1*num2);
        }
        if (operacion.equals("/")) {
            return (num1/num2);
        }
        if (operacion.equals("%")) {
            return (num1%num2);
        }
        return 0;
    }

}