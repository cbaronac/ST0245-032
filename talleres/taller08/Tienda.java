
/**
 * Write a description of class Tienda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tienda
{
    String nombre;
    int cantidad;

    public Tienda(String nombre, int cantidad) {
        this.nombre=nombre;
        this.cantidad=cantidad;
    }

    public int getCantidad(){
        return cantidad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
