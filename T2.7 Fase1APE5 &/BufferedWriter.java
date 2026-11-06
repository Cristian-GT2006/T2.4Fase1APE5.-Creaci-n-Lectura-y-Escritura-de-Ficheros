import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        String[] materias = {"Programación", "Matemáticas", "Física", "Base de Datos", "Inglés"};

        // 1. BufferedWriter enlazado con FileWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("materias.txt"))) {
            // 2 y 3. Escribir cinco asignaturas, una por línea con newLine()
            for (String materia : materias) {
                bw.write(materia);
                bw.newLine();
            }
            System.out.println("Archivo materias.txt escrito correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }

        // Verificación: leer y mostrar el contenido
        try (BufferedReader br = new BufferedReader(new FileReader("materias.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }
}
