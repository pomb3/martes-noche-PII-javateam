import Implementacion.PilaDinamica;
import Interfaces.PilaDinamicaTDA;

public class MainPilaDinamica {
    public static void main(String[] args) {

        PilaDinamicaTDA pila = new PilaDinamica();
        pila.InicializarPila();

        // El usuario escribe código (cada cambio se apila)
        pila.Apilar(1); // "int a = 5;"
        pila.Apilar(2); // agrega "int b = 10;"
        pila.Apilar(3); // agrega "System.out.println(a);"

        System.out.println("Código actual:");

        if (pila.Tope() == 3) {
            System.out.println("int a = 5;");
            System.out.println("int b = 10;");
            System.out.println("System.out.println(a);");
        }

        // El usuario hace Undo
        pila.Desapilar();

        System.out.println("\nDespués de Undo:");

        if (pila.Tope() == 2) {
            System.out.println("int a = 5;");
            System.out.println("int b = 10;");
        }
    }
}