import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir {

    public static void main(String[] args) {
        String rutaArchivo = "ruta_del_archivo";
        
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(rutaArchivo))) {
            String textoAEscribir = "Este es el texto que quiero escribir en el archivo.";
            bufferedWriter.write(textoAEscribir);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
        }
    }

}
