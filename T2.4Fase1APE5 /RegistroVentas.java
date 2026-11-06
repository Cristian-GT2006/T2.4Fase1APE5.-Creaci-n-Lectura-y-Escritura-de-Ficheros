import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double acumulado = 0;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ventas.txt", true))) {
            while (true) {
                System.out.print("Nombre del producto (o 'fin' para terminar): ");
                String producto = sc.nextLine();

                if (producto.equalsIgnoreCase("fin")) {
                    break;
                }

                System.out.print("Precio: ");
                double precio = Double.parseDouble(sc.nextLine());

                System.out.print("Cantidad vendida: ");
                int cantidad = Integer.parseInt(sc.nextLine());

                double subtotal = precio * cantidad;
                double descuento = 0;

                if (subtotal >= 100) {
                    descuento = subtotal * 0.10;
                }

                double totalPagar = subtotal - descuento;
                acumulado += totalPagar;

                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + descuento);
                System.out.println("Total a pagar: $" + totalPagar);

                bw.write("Producto: " + producto);
                bw.newLine();
                bw.write("Precio: $" + precio + " | Cantidad: " + cantidad);
                bw.newLine();
                bw.write("Subtotal: $" + subtotal + " | Descuento: $" + descuento);
                bw.newLine();
                bw.write("Total a pagar: $" + totalPagar);
                bw.newLine();
                bw.write("-----------------------");
                bw.newLine();
            }

            bw.write("TOTAL ACUMULADO DE VENTAS: $" + acumulado);
            bw.newLine();
            bw.write("=======================");
            bw.newLine();
            System.out.println("Total acumulado: $" + acumulado);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
