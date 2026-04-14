import Implementacion.ColaPrioridadEstaticaE8;
import Interface.ColaPrioridadTDAE8;

public class MainE8 {
    public static void main(String[] args) {

        // EJERCICIO 8 COLAS

        ColaPrioridadTDAE8 soporte = new ColaPrioridadEstaticaE8();
        soporte.InicializarColaPrioridad();

        soporte.AcolarPrioridad(1, 0);   // Fondo de pantalla
        soporte.AcolarPrioridad(3, 999); // Servidor caído

        System.out.println("=== SOPORTE IT ===");

        System.out.println("Se atiende primero: " + soporte.Primero() + " con prioridad 999 - servidor caído");
        soporte.Desacolar();

        System.out.println("Se atiende luego: " + soporte.Primero() + " con prioridad 0 - no le gusta el fondo de pantalla");
        soporte.Desacolar();

    }
}