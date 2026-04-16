import Implementacion.Estrategia_1;
import Interfaces.PilaTDA;

public class MainE6 {
    public static void main(String[] args) {

        PilaTDA pila = new Estrategia_1();
        pila.InicializarPila();

        System.out.println("=== NAVEGACIÓN DE DIRECTORIOS ===\n");

        // Entradas
        pila.Apilar(1);
        System.out.println("Entré a: C:/ (Carpeta 1)");

        pila.Apilar(2);
        System.out.println("Entré a: Usuarios (Carpeta 2)");

        pila.Apilar(3);
        System.out.println("Entré a: Documentos (Carpeta 3)");

        System.out.println("\nCarpeta actual: " + pila.Tope() + " - Documentos" );

        // Subir nivel
        System.out.println("\nPresiono 'Subir un nivel'");
        pila.Desapilar();


        System.out.println("\nAhora estoy en carpeta " + pila.Tope() + " - Usuarios");
    }
}