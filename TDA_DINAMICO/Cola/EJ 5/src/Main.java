import Implementacion.ColaDinamica;
import Interface.ColaTDA;

public class Main {
    public static void main(String[] args) {
        ColaTDA cola = new ColaDinamica();

        cola.InicializarCola();
        cola.Acolar("Agustina");
        cola.Acolar("Pepe");
        cola.Acolar("Ramón");
        cola.Acolar("Vibe Coder");
        cola.Acolar("Jose");

        System.out.println("--- Estado de la cola ---");
        System.out.printf("Atendiendo a : " + cola.Primero());
        cola.Desacolar();
        System.out.println("\nAtendiendo a: " + cola.Primero());
        cola.Desacolar();

        System.out.println("Siguiente en espera: " + cola.Primero());

        if (cola.Primero().equals("Vibe Coder")) {
            System.out.println("El Vibe Coder esta al frente, pero respeto su turno");
        }
    }
}


/*
        System.out.println("¿Cola vacía?: " + cola.ColaVacia());

        cola.Acolar("jose");
        cola.Acolar("Pepe");
        cola.Acolar("Agustin");

        System.out.println("Primero: " + cola.Primero()); // 10

        cola.Desacolar();
        System.out.println("Primero luego de desacolar: " + cola.Primero()); // 20

        cola.Acolar(40);
        System.out.println("Primero luego de acolar 40: " + cola.Primero()); // 20

        cola.Desacolar();
        System.out.println("Primero luego de desacolar: " + cola.Primero()); // 30

        cola.Desacolar();
        System.out.println("Primero luego de desacolar: " + cola.Primero()); // 40

        cola.Desacolar();
        System.out.println("¿Cola vacía?: " + cola.ColaVacia()); // true
    }
}
    */