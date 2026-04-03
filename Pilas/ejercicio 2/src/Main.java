import Implementacion.Estrategia_1;
import Interfaces.PilaTDA;

public class Main {
    public static void main(String[] args) {

        PilaTDA pila = new Estrategia_1();
        pila.InicializarPila();

        // Estados del código
        pila.Apilar(1);
        pila.Apilar(2);
        pila.Apilar(3);

        System.out.println("Código actual:");

        if (pila.Tope() == 3) {
            System.out.println("int a = 5;");
            System.out.println("int b = 10;");
            System.out.println("System.out.println(a);");
        }

        // Undo
        pila.Desapilar();

        System.out.println("\nDespués de Undo:");

        if (pila.Tope() == 2) {
            System.out.println("int a = 5;");
            System.out.println("int b = 10;");
        }

    }
}