import Implementacion.ColaPrioridadDinamica;
import Interface.ColaPrioridadTDA;

public class MainE6 {
    public static void main(String[] args) {

        ColaPrioridadTDA cola = new ColaPrioridadDinamica();

        cola.InicializarColaPrioridad();

        System.out.println("\n=== PROCESOS DEL SISTEMA ===");

        cola.AcolarPrioridad(1, 10); // usuario (Spotify)
        cola.AcolarPrioridad(2, 50); // sistema
        cola.AcolarPrioridad(3, 10); // usuario (Chrome)

        System.out.println("Se ejecuta primero proceso: " + cola.Primero());

        cola.Desacolar();

        System.out.println("Luego se ejecuta proceso: " + cola.Primero());

        cola.Desacolar();

        System.out.println("Por último se ejecuta proceso: " + cola.Primero());

        System.out.println("\nSi el sistema se sobrecarga:");
        System.out.println("Los procesos de alta prioridad (sistema) se ejecutan primero.");
        System.out.println("Los procesos de baja prioridad (usuario) quedan en espera y pueden demorarse.");
    }
}