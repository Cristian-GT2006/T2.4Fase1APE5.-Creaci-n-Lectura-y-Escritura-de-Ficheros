<div align="center">
  <h1>
    <marquee behavior="alternate" scrollamount="4">
      Taller Práctico: Manejo de Ficheros en Java
    </marquee>
  </h1>
  <p><b>Universidad Técnica de Ambato | Ingeniería en Software</b></p>
</div>

---

## Autor
* **Estudiante:** Cristian Gómez Toasa
* **Carrera:** Ingeniería en Software
* **Institución:** Universidad Técnica de Ambato

---

## Descripción del Proyecto
Este repositorio contiene la solución desarrollada de forma individual para el taller práctico de **Manejo de Ficheros en Java**, enfocado en la creación, escritura con persistencia de datos y eliminación segura de archivos de texto plano utilizando clases nativas del paquete `java.io`.

---

## Estructura de Ejercicios

### Ejercicio 1: Creación de Archivos (`curso.txt`)
* **Propósito:** Validar la creación de un nuevo archivo de texto en el sistema utilizando la clase `File` y el método `createNewFile()`, controlando excepciones con bloques `try-catch`.
* **Métodos clave:** `createNewFile()`, `getName()`.

### Ejercicio 2: Escritura y Persistencia (`estudiantes.txt`)
* **Propósito:** Capturar datos ingresados por consola mediante `Scanner` y almacenarlos en un archivo existente usando `FileWriter`. Se implementa el parámetro `true` para evitar el sobrescribir datos previos.
* **Métodos clave:** `FileWriter(nombre, true)`, `write()`, `close()`.

### Ejercicio 3: Eliminación de Archivos
* **Propósito:** Gestionar la eliminación física de un archivo de texto del directorio local utilizando sentencias condicionales (`if-else`) para verificar el estado de la operación.
* **Métodos clave:** `delete()`.

---

## Requisitos de Ejecución
1. Tener instalado **Java Development Kit (JDK)** (versión 8 o superior).
2. Un entorno de desarrollo o terminal compatible (IntelliJ IDEA, VS Code, NetBeans o consola de comandos).
3. Compilar y ejecutar cada clase de manera independiente:
   ```bash
   javac Ejercicio1.java
   java Ejercicio1
