import Implementacion.Estrategia_1;
import Implementacion.Estrategia_2;
import Implementacion.Estrategia_3;
import Interfaces.PilaTDA;

public class Main {
    public static void main(String[] args) {

        PilaTDA p1 = new Estrategia_1();
        PilaTDA p2 = new Estrategia_2();
        PilaTDA p3 = new Estrategia_3();

        probarPila("Estrategia 1", p1);
        probarPila("Estrategia 2", p2);
        probarPila("Estrategia 3", p3);
    }

    public static void probarPila(String nombre, PilaTDA pila) {
        System.out.println(nombre);

        pila.InicializarPila();


        //Apilamos las urls en nuestras pilas
        pila.Apilar("www.infobae.com");
        System.out.println("Tope luego de cargar la primera URL: " + pila.Tope());

        pila.Apilar("www.facebook.com");
        System.out.println("Tope luego de cargar la segunda URL: " + pila.Tope());

        pila.Apilar("www.chatgpt.com");
        System.out.println("Tope luego de cargar la tercera URL: " + pila.Tope());

        System.out.println("--- El usuario empieza a navegar hacia atrás ---");

// Guardamos dónde está parado AHORA antes de ir hacia atrás
        String paginaActual = pila.Tope();
        pila.Desapilar(); // Apretamos "Atrás"
        System.out.println("El usuario estaba en " + paginaActual + " y apretó atrás. Se le renderiza: " + pila.Tope());

// Repetimos el proceso
        paginaActual = pila.Tope();
        pila.Desapilar();
        System.out.println("El usuario estaba en " + paginaActual + " y apretó atrás. Se le renderiza: " + pila.Tope());

    }
}