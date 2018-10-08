
   /**
 * Write a description of class Nevera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nevera
{
    int codigo;
    String marca;
    
    public Nevera(int codigo, String marca){
        this.codigo=codigo;
        this.marca=marca;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getMarca(){
        return marca;
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }
}


