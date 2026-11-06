import java.io.File;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) {
        // 1. Objeto File con la ruta
        File archivo = new File("datos/temporal.txt");

        if (archivo.getParentFile() != null) {
            archivo.getParentFile().mkdirs();
        }

        // 2. Consultar estado y crear si no existe
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                System.out.println("Archivo creado: " + archivo.getName());
            } catch (IOException e) {
                System.out.println("Error de E/S al crear el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo ya existía.");
        }

        // 3. Fase de validación (simula la confirmación del usuario)
        boolean confirmarBorrado = true;

        // 4. Borrar solo si hay confirmación
        if (confirmarBorrado) {
            boolean eliminado = archivo.delete();
            System.out.println("¿Archivo eliminado?: " + eliminado);
        } else {
            System.out.println("Borrado cancelado por el usuario.");
        }
    }
}
