
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.lang.Math;
import java.util.Stack;
/**
 * Implementacion de un algoritmo para prevenir Colisiones
 * Estructura de datos utilizada:Matriz tridimensional de Pilas
 * Complejidad: Peor Caso O(n) 
 *
 * @author Camila Barona y Mariana Gómez
 * @version 1
 */
public class PrevencionColisionesPrueba {
    static Stack<Abeja> [][][] abejasConRiesgoDeColision;
    static int xSize = 0;
    static int ySize = 0;
    static int zSize = 0;
    static double minX= 0;
    static double minY= 0;
    static double minZ= 0;
    static long totalTiempo;
    static long tiempoInicio;

    /**
     * Metodo para leer un archivo de abejas y almacenarlas en un arreglo de tipo Abeja
     *
     * @param  numeroDeAbejas  El numero de abejas a leer
     * @return un arreglo de Abejas donde cada elemento representa las coordenadas de una abeja
     */
    public static Abeja[] leerArchivo(int numeroDeAbejas){
        tiempoInicio=System.currentTimeMillis();
        final String nombreDelArchivo = "ConjuntoDeDatosCon"+numeroDeAbejas+"abejas.txt";
        Abeja[] arregloDeAbejas = new Abeja[numeroDeAbejas];

        try {            
            BufferedReader br = new BufferedReader(new FileReader(nombreDelArchivo));
            String lineaActual = br.readLine();
            lineaActual = br.readLine(); // Descarta la primera linea
            int index = 0;
            while (lineaActual != null){ // Mientras no llegue al fin del archivo
                String [] cadenaParticionada = lineaActual.split(",");
                Abeja abeja = new Abeja(cadenaParticionada[0],
                        cadenaParticionada[1],
                        cadenaParticionada[2]);
                arregloDeAbejas[index++] = abeja;
                lineaActual = br.readLine();

            }

        }
        catch(IOException ioe) {
            System.out.println("Error leyendo el archivo de entrada");
        }
        totalTiempo=System.currentTimeMillis()-tiempoInicio;
        System.out.println("Tiempo leer archivo: "+totalTiempo+"ms");
        return arregloDeAbejas;
    }

    /**
     * Metodo para calcular y determinar el tamaño de la Matriz donde se almacenaran las abejas
     * @param  arregloDeAbejas  donde se contienen las abejas leidas del archivo previamente
     */
    public static void tamaño (Abeja[] arregloDeAbejas){
        tiempoInicio=System.currentTimeMillis();
        minX= arregloDeAbejas[0].getX();
        minY= arregloDeAbejas[0].getY();
        minZ= arregloDeAbejas[0].getZ();
        double maxX= arregloDeAbejas[0].getX();
        double maxY= arregloDeAbejas[0].getY();
        double maxZ= arregloDeAbejas[0].getZ();

        for (int i=0;i<=arregloDeAbejas.length-1;i++){
            if (arregloDeAbejas[i].getX()<=minX){
                minX=arregloDeAbejas[i].getX();
            } 
            if (arregloDeAbejas[i].getX()>=maxX){
                maxX=arregloDeAbejas[i].getX();
            } 
            if (arregloDeAbejas[i].getY()<=minY){
                minY=arregloDeAbejas[i].getY();
            } 
            if (arregloDeAbejas[i].getY()>=maxY){
                maxY=arregloDeAbejas[i].getY();
            }
            if (arregloDeAbejas[i].getZ()<=minZ){
                minZ=arregloDeAbejas[i].getZ();
            } 
            if (arregloDeAbejas[i].getZ()>=maxZ){
                maxZ=arregloDeAbejas[i].getZ();
            } 
        }

        double tamañoX= ((maxX-minX)*100000/70.72);
        double tamañoY= ((maxY-minY)*100000/70.72);
        double tamañoZ= ((maxZ-minZ)/70.72);

        xSize= Math.abs((int)tamañoX);
        ySize = Math.abs((int)tamañoY);
        zSize = Math.abs((int)tamañoZ);

        abejasConRiesgoDeColision = new Stack[xSize][ySize][zSize];
        totalTiempo=System.currentTimeMillis()-tiempoInicio;
        System.out.println("Tiempo creacion tamaño: "+totalTiempo+"ms");
    }

    /**
     * Algoritmo para prevenir colisiones 
     * @param  arregloDeAbejas  Un arreglo con coordenadas de las abejas
     */
    public static void detectarColisiones(Abeja[] arregloDeAbejas){
        tiempoInicio=System.currentTimeMillis();
        Abeja aux = null;
        int x = 0;
        int y = 0;
        int z = 0;
        for (int i = 0; i < arregloDeAbejas.length ; ++i)
        {
            aux = arregloDeAbejas[i];
            x = (int) ((aux.getX()-minX)*100000  / 70.72);
            y = (int)((aux.getY()-minY)*100000 / 70.72);
            z = (int)((aux.getZ() -minZ)  / 70.72);

            if(x >0) {
                x--;
            }
            if(y>0) {
                y--;
            }
            if(z >0) {
                z--;
            }
            if(abejasConRiesgoDeColision[x][y][z] == null) {
                Stack<Abeja> n= new Stack<Abeja>();
                n.push(aux);
                abejasConRiesgoDeColision[x][y][z] = n;
            }else {
                abejasConRiesgoDeColision[x][y][z].push(aux);
            }
        }
        totalTiempo=System.currentTimeMillis()-tiempoInicio;
        System.out.println("Tiempo detectar colision: "+totalTiempo+"ms");
    }

    /**
     * Metodo para escribir un archivo con la respuesta
     * @param  numeroDeAbejas  Numero de abejas del conjunto de datos original
     */
    public static void guardarArchivo(int numeroDeAbejas){
        tiempoInicio=System.currentTimeMillis();
        final String nombreDelArchivo = "respuestaConjuntoDeDatosCon"+numeroDeAbejas+"abejas.txt";
        try {
            PrintWriter escritor = new PrintWriter(nombreDelArchivo, "UTF-8");
            for (int i = 0; i < xSize; i++) {
                for(int j = 0; j < ySize; j++){
                    for(int h = 0; h < zSize; h++){
                        if(abejasConRiesgoDeColision[i][j][h] != null ){
                            Stack<Abeja> pila = abejasConRiesgoDeColision[i][j][h];
                            if(pila.size() > 1) {
                                while(!pila.isEmpty()){
                                    Abeja abeja = pila.pop();
                                    escritor.println(abeja);
                                }
                            }
                        }
                    }
                }
            }
            escritor.close();
        }
        catch(IOException ioe) {
            System.out.println("Error escribiendo el archivo de salida");
        }
        totalTiempo=System.currentTimeMillis()-tiempoInicio;
        System.out.println("Tiempo guardar archivo: "+totalTiempo+"ms");
    }

    public static void main(String[] args){
        // Recibir el numero de abejas como parametro
        final int numeroDeAbejas = args.length == 0 ? 10 : Integer.parseInt(args[0]);
        // Leer el archivo con las coordenadas de las abejas
        Abeja[] arregloDeAbejas = leerArchivo(numeroDeAbejas);
        // Prevenir las colisiones revisando todas con todas
        long startTime = System.currentTimeMillis();
        tamaño(arregloDeAbejas);
        detectarColisiones(arregloDeAbejas);
        // Guardar en un archivo las abejas con riesgo de colision   
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("El algoritmo tomo un tiempo de: "+estimatedTime+" ms");
        guardarArchivo(numeroDeAbejas);
        //Calcular Memoria

        int dataSize=1024*1024;
        Runtime runtime=Runtime.getRuntime();

        System.out.println("Memoria máxima: "+runtime.maxMemory()/dataSize);
        System.out.println("Memoria total: "+runtime.totalMemory()/dataSize);
        System.out.println("Memoria libre: "+runtime.freeMemory()/dataSize);
        System.out.println("Memoria usada: "+(runtime.totalMemory()-runtime.freeMemory())/dataSize);
    }
}
