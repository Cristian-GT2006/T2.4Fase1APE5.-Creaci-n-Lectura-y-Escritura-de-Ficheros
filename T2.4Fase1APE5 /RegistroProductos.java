import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroProductos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Precio: ");
        double precio = Double.parseDouble(sc.nextLine());

        System.out.print("Cantidad disponible: ");
        int cantidad = Integer.parseInt(sc.nextLine());

        double total = precio * cantidad;

        // El segundo parámetro "true" activa el modo append
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("productos.txt", true))) {
            bw.write("Producto: " + nombre);
            bw.newLine();
            bw.write("Precio: $" + precio);
            bw.newLine();
            bw.write("Cantidad: " + cantidad);
            bw.newLine();
            bw.write("Valor total: $" + total);
            bw.newLine();
            bw.write("-----------------------");
            bw.newLine();
            System.out.println("Producto registrado correctamente.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
