import Implementacion.ColaSinPrioridad;

/*
En este caso que no hay preferencia alguna por mas que seas ingeniero, o progromador trucho, implementamos un FIFO normal donde el primero en llegar a la fila es el primero en recibir su comida
* */


public class Ejercicio5 {
    static void main(String[] args) {
        ColaSinPrioridad filaDeLaMilanga = new ColaSinPrioridad();

        filaDeLaMilanga.IniciarCola();

        filaDeLaMilanga.Acolar("El Jorge de ingenieria informatica");
        filaDeLaMilanga.Acolar("El migue de la licenciatura en sistemas");

        System.out.println("Estado de la fila para la imalanga");
        imprimirColar(filaDeLaMilanga);


        filaDeLaMilanga.Acolar("Vino el chanta que pago copilot y se cree desarrollador");

        System.out.println("\nel chanta quiere colarse, pero el TDA no tiene prioridades, va para atriqui");

        System.out.println("\nRaquel llama al primero para recibir su milanesa: " + filaDeLaMilanga.Primero());

        filaDeLaMilanga.Desacolar();

        System.out.println("Ahora el primero es: " + filaDeLaMilanga.Primero());
    }

    public static void imprimirColar(ColaSinPrioridad colaOriginal){
        ColaSinPrioridad colaAuxiliar = new ColaSinPrioridad();
        colaAuxiliar.IniciarCola();

        while(!colaOriginal.ColaVacia()){
            String nombre = colaOriginal.Primero();
            System.out.println("- " + nombre);

            colaAuxiliar.Acolar(nombre);
            colaOriginal.Desacolar();
        }

        while(!colaAuxiliar.ColaVacia()){
            colaOriginal.Acolar(colaAuxiliar.Primero());
            colaAuxiliar.Desacolar();
        }
    }

}

