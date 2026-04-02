import Implementacion.Estrategia_1;
import Implementacion.Estrategia_2;
import Implementacion.Estrategia_3;
import Interfaces.PilaTDA;

//Consigna: En la expresión ( ( a + b ) * c ), ¿en qué momento exacto
//hacés un Apilar y cuándo comparás para hacer un Desapilar?

public class Main {
    public static void main(String[] args) {
        PilaTDA pila = new Estrategia_1();
        pila.InicializarPila();

        System.out.println("Analizando expresion: ( ( a + b ) * c )");

        //Se lee el primer '('
        pila.Apilar("("); 
        System.out.println("Se lee '(': APILAR. El tope ahora es: " + pila.Tope());

        // Se lee el segundo '('
        pila.Apilar("("); 
        System.out.println("Se lee '(': APILAR. El tope ahora es: " + pila.Tope());

        // Se lee 'a + b' (No afecta a la pila, solo se procesa)
        System.out.println("Se lee 'a + b': Operacion matematica (No hay cambio en pila)");

        //Se lee el primer ')' -> MOMNTO DE COMPARAR Y DESAPILAR
        System.out.println("Se lee ')': El usuario cierra un bloque (equivale a ir 'Atras')");
        if (!pila.PilaVacia()) {
            pila.Desapilar();
            System.out.println("DESAPILAR realizado. Volvemos al nivel: " + pila.Tope());
        }

        //Se lee '* c'
        System.out.println("Se lee '* c': Operacion matematica (No hay cambio en pila)");

        //  Se lee el ultimo ')' -> MOMENTO DE COMPARAR Y DESAPILAR
        System.out.println("Se lee ')': Se cierra el ultimo bloque.");
        if (!pila.PilaVacia()) {
            pila.Desapilar();
        }

        // final 
        System.out.println("---------------------------------------");
        System.out.println("¿La pila quedo vacia?: " + pila.PilaVacia());
    }
}
