
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer {

    public static void main(String[] args) {
        String rutaArchivo = "ruta_del_archivo"; // Cambiar por la ruta de tu archivo
        
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(rutaArchivo))) {
            String lineaActual;
            while ((lineaActual = bufferedReader.readLine()) != null) {
                System.out.println(lineaActual);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();
        }
    }

}
