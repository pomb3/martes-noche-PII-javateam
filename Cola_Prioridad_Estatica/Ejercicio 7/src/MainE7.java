import Implementacion.ColaPrioridadEstaticaE7;
import Interface.ColaPrioridadTDAE7;

public class MainE7 {
    public static void main(String[] args) {

        //EJERCICIO 7 COLAS

        ColaPrioridadTDAE7 vuelo = new ColaPrioridadEstaticaE7();
        vuelo.InicializarColaPrioridad();

        vuelo.AcolarPrioridad(1, 1); // mortal

        // Dos pasajeros con la MISMA prioridad
        vuelo.AcolarPrioridad(2, 2); // business (llega primero)
        vuelo.AcolarPrioridad(3, 2); // business (llega después)

        // Otro con mayor prioridad
        vuelo.AcolarPrioridad(4, 3); // movilidad reducida

        System.out.println("=== EMBARQUE ===");

        System.out.println("Sube primero: Pasajero " + vuelo.Primero());
        vuelo.Desacolar();

        System.out.println("Sube después: Pasajero " + vuelo.Primero());
        vuelo.Desacolar();

        System.out.println("Sube después: Pasajero " + vuelo.Primero());
        vuelo.Desacolar();

        System.out.println("Sube último: Pasajero " + vuelo.Primero());
    }
}