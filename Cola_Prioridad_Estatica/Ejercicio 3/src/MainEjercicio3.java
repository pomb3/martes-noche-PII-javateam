import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDAE6;

public class MainEjercicio3 {
    public static void main(String[] args) {
        ColaPrioridadTDAE6 cola = new ColaPrioridadEstatica();

        cola.InicializarColaPrioridad();

        // EJERCICIO 3 - Hospital

        System.out.println("\n=== HOSPITAL (TRIAGE) ===");

        System.out.println("Orden de llegada: ");
        cola.AcolarPrioridad(1, 1);   // raspón
        System.out.println("Paciente número " + cola.Primero() + " con raspón");
        cola.AcolarPrioridad(2, 50);  // fractura
        System.out.println("Paciente número " + cola.Primero() + " con fractura") ;
        cola.AcolarPrioridad(3, 100); // paro cardíaco
        System.out.println("Paciente número " + cola.Primero() + " con paro cardiaco");

        System.out.println("\nSe atiende primero paciente número " + cola.Primero() + " - Paciente con paro cardiaco" );
        cola.Desacolar();
        System.out.println("Se atiende segundo paciente número " + cola.Primero() + " - Paciente con fractura ");
        cola.Desacolar();
        System.out.println("Se atiende tercero paciente núçmero " + cola.Primero() + " - Paciente con raspón ");
    }
}
