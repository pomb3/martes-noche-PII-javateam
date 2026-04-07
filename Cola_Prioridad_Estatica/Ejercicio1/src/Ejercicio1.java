/*
Fila del Cajero: Los clientes llegan al banco de la esquina de la facultad.
o Consigna: ¿Es Cola común o de Prioridad? Justificá según la lógica de
atención.
 */

/*
Fila del Cajero: Los clientes llegan al banco de la esquina de la facultad.
o Consigna: ¿Es Cola común o de Prioridad? Justificá según la lógica de
atención.
*/


import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadEjercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        ColaPrioridadEjercicio1 cola = new ColaPrioridadEstatica();

        cola.InicializarColaPrioridad();

        System.out.println("¿Hay fila en el banco? " + cola.ColaVacia());
        System.out.println("--- ABRE EL BANCO ---");

        // Entra gente al banco
        cola.AcolarPrioridad("Miguel", Prioridades.REGULAR.getNivel());
        System.out.println("Primero: " + cola.Primero());
        System.out.println("Prioridad del primero: " + cola.Prioridad());

        cola.AcolarPrioridad("Jorge", Prioridades.REGULAR.getNivel());
        cola.AcolarPrioridad("Maria", Prioridades.EMBARAZADA.getNivel());

        System.out.println("\nPobre Miguel, llegó primero, pero acaba de ingresar una embarazada. Entonces al primero que van a llamar es a: " + cola.Primero());
        cola.Desacolar(); // Se va María

        System.out.println("Miguel está contento, piensa que es el siguiente en la fila porque ya llamaron a María, así que está esperando su llamado...");
        cola.AcolarPrioridad("Luis", Prioridades.ADULTO_MAYOR.getNivel());

        System.out.println("\nNo te la puedo creer... llamaron a " + cola.Primero() + " que es un anciano que acaba de entrar.");
        cola.Desacolar(); // Se va Luis

        // Entra una patota de gente con prioridad
        cola.AcolarPrioridad("Sofia", Prioridades.EMBARAZADA.getNivel());
        cola.AcolarPrioridad("Carlos", Prioridades.VIP.getNivel()); // Cliente VIP
        cola.AcolarPrioridad("Fabio", Prioridades.DISCAPACIDAD.getNivel());

        System.out.println("\nMiguel se acomoda la camisa. 'Bueno, ahora sí, no hay nadie más...'");
        System.out.println("Altavoz: 'Atención cliente " + cola.Primero() + ", pase por la caja 1.'");
        System.out.println("Miguel: '¡PERO SI SOFÍA LLEGÓ HACE 2 MINUTOS!' (Claro, Sofía tiene prioridad 5).");
        cola.Desacolar(); // Se va Sofía

        System.out.println("\nMiguel suspira profundo. 'Paciencia Miguel, paciencia...'");
        System.out.println("Altavoz: 'Cliente VIP " + cola.Primero() + ", lo esperamos en el sector exclusivo.'");
        System.out.println("Miguel: '¡Esto es una estafa! ¡Ese tipo ni siquiera hizo la fila!'");
        cola.Desacolar(); // Se va Carlos

        System.out.println("\nMiguel ya está buscando el libro de quejas, con la vena del cuello a punto de explotar.");
        System.out.println("Altavoz: 'Atención prioritaria para " + cola.Primero() + ".'");
        cola.Desacolar(); // Se va Fabio

        System.out.println("\nMiguel se acerca al mostrador arrastrando los pies, con lágrimas en los ojos: 'Por favor... dígame que me toca.'");
        System.out.println("Cajero: 'Sí, señor " + cola.Primero() + ", adelante.'");
        cola.Desacolar(); // ¡Por fin se va Miguel!
        System.out.println("Miguel es finalmente atendido tras 3 horas de agonía emocional.");

        System.out.println("\nCajero: 'Siguiente, " + cola.Primero() + ".'");
        System.out.println("Jorge: '¡Uy, qué rápido! Estuve esperando con Miguel todo este tiempo pero ni sentí la espera. ¡Qué buen servicio!'");
        cola.Desacolar(); // Se va Jorge

        System.out.println("\n¿Quedó alguien en el banco? " + !cola.ColaVacia());
    }
}