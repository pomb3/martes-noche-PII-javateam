import Implementacion.Estrategia_1;
import Interfaces.PilaTDA;

public class Main {
    public static void main(String[] args) {

        PilaTDA pila = new Estrategia_1();
        pila.InicializarPila();

        // Simulación de editor de código (Undo)

        pila.Apilar(1); // estado 1: "int a = 5;"
        pila.Apilar(2); // estado 2: "int a = 5; int b = 10;"
        pila.Apilar(3); // estado 3: "int a = 5; int b = 10; System.out.println(a);"

        System.out.println("Tope: " + pila.Tope());

        pila.Desapilar(); // Undo

        System.out.println("Nuevo tope: " + pila.Tope());

        System.out.println("¿Está vacía?: " + pila.PilaVacia());
    }
}