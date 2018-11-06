/**
 * Implementacion de un objeto Abeja con sus respectivas coordendas
 * @author Camila Barona y Mariana Gómez
 * @version 1
 */

public class Abeja {
    Double x;
    Double y;
    Double z;
    boolean colision;

    /**
     * 
     * Constructor del Objeto abeja
     * @param  x,y,z  Las coordenadas de la Abeja
     */
    public Abeja(String x, String y, String z){
        this.x=Double.parseDouble(x);
        this.y=Double.parseDouble(y);
        this.z=Double.parseDouble(z);
    }

    /**
     * Metodo para modificar la coordenada X de la Abeja
     * @param  x Coordenada de la Abeja
     */
    public void setX(Double x){
        this.x=x;
    }

    /**
     * Metodo para modificar la coordenada Y de la Abeja
     * @param  y Coordenada de la Abeja
     */
    public void setY(Double y){
        this.y=y;
    }

    /**
     * Metodo para modificar la coordenada z de la Abeja
     * @param  z Coordenada de la Abeja
     */
    public void setZ(Double z){
        this.z=z;
    }

    /**
     * Metodo para retornar la coordenada X de la Abeja
     */
    public double getX(){
        return x;
    }

    /**
     * Metodo para retornar la coordenada Y de la Abeja
     */
    public double getY(){
        return y;
    }

     /**
     * Metodo para retornar la coordenada Z de la Abeja
     */
    public double getZ(){
        return z;
    }
    
    public String toString(){
        String mensaje=x+","+y+","+z;
        return mensaje;
    }

}
