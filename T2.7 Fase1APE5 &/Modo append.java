import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        // 1. FileWriter en modo adición (append = true)
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("materias.txt", true));

            // 2. Añadir dos asignaturas nuevas
            bw.write("Estructuras de Datos");
            bw.newLine();
            bw.write("Redes");
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        } finally {
            // 3. Cerrar el flujo con close()
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar: " + e.getMessage());
            }
        }

        // 4. Comprobación: deben aparecer las 5 originales + las 2 nuevas
        try (BufferedReader br = new BufferedReader(new FileReader("materias.txt"))) {
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                contador++;
            }
            System.out.println("Total de asignaturas: " + contador);
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }
}
