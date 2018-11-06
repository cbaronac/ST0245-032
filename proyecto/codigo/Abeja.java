/**
 * Objeto abeja con sus respectivas coordenadas
 *
 * @author Camila Barona y Mariana Gómez
 * @version 1
 */
public class Abeja {
    Double x;
    Double y;
    Double z;
    boolean colision;
    
    public Abeja(String x, String y, String z){
        this.x=Double.parseDouble(x);
        this.y=Double.parseDouble(y);
        this.z=Double.parseDouble(z);
    }
    
    public void setColision(boolean colision){
        this.colision=colision;
    }
    
    public boolean getColision(boolean colision){
        return colision;
    }
    
    public void setX(Double x){
    this.x=x;
    }
    
    public void setY(Double y){
    this.y=y;
    }
    
    public void setZ(Double z){
    this.z=z;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
    return y;
    }
    
    public double getZ(){
        return z;
    }
    
    public String toString(){
        String mensaje=x+","+y+","+z;
        return mensaje;
    }
    
}
