import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un mensaje para guardar: ");
        String mensaje = scanner.nextLine();

        try {
            // El parámetro 'true' permite conservar la información anterior y agregar al final
            FileWriter escritor = new FileWriter("estudiantes.txt", true);
            escritor.write(mensaje + "\n");
            escritor.close();
            System.out.println("¡La información se guardó correctamente!");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }
        scanner.close();
    }
}
