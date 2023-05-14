package clase;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public abstract class Archivo_Base {

    // Este metodo permite guardar los datos del .txt en un ArrayList
    public static void registros(ArrayList<persona> listaP) {
        try {

//            utilizo la clase file para obtener la informacion de direcciones de archivos 
//utilizo el .lines el método se puede usar para leer todas las líneas de un archivo como una secuencia.
            Stream<String> registros = Files.lines(Paths.get("C:\\Users\\ASUS\\Downloads\\archivo.txt"));

            registros.map(registro -> { // uso map para convertir en objeto persona

                String[] fila = registro.split(" "); // split para separar registros

                return new persona(fila[0], fila[1], fila[2]);
            }).forEach(listaP::add); // addd para agregar el objeto en la lista de personas

        } catch (Exception e) {
            System.out.println("e = " + e);
        }
    }
}
