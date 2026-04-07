import Implementacion.ColaEstatica;
import Interface.ColaTDA;

public class Main {
    public static void main(String[] args) {
         /*
        * Impresora del Laboratorio: Todos mandan el TP al mismo tiempo para
            que no cierre la entrega.
            o Consigna: Si la impresora recibe 5 archivos, ¿cuál es el orden de
            salida?
        *
        *
        * viendo que no hay prioridad ya que son tps que se entregan por orden de llegada utilizamos una cola tipo FIFO sin prioridad
        * */

        ColaTDA cola = new ColaEstatica();

        cola.InicializarCola();

        System.out.println("¿Cola vacía?: " + cola.ColaVacia());

        for (int i = 1; i <= 5; i++) {
            cola.Acolar(i);
            System.out.println("Ingreso un nuevo documento para imprimir");
        }


        for (int i = 1; i <= 5; i++) {
            System.out.println("se va a imprimir el documento: " + cola.Primero());
            cola.Desacolar();
            System.out.println("el proximo para imprimir es: " + cola.Primero());
        }
        System.out.println("¿Cola vacía?: " + cola.ColaVacia()); // true

    }
}