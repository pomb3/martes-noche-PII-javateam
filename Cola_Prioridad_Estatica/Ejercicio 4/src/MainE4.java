import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDA;

public class MainE4 {
    public static void main(String[] args) {

        //EJERCICIO 4 COLAS

        ColaPrioridadTDA cola = new ColaPrioridadEstatica();
        cola.InicializarColaPrioridad();

        System.out.println("=== EXAMEN FINAL ===");

        // Llega primero (8:00) → regular
        cola.AcolarPrioridad(1, 5); //alumno regular

        // Llega después (8:30) → promocionado
        cola.AcolarPrioridad(2, 10); //alumno promocionado

        System.out.println("Primero sale Alumno " + cola.Primero() + " promocionado");
        cola.Desacolar();

        System.out.println("Después sale Alumno " + cola.Primero() + " regular");
    }
}