import Implementacion.Estrategia_1;
import Interfaces.PilaEj5TDA;

public class SimuladorCallStack {

    public static void main(String[] args){
        PilaEj5TDA pila = new Estrategia_1();

        pila.InicializarPila();


        pila.Apilar("main()");
        System.out.println("Tope actual: " + pila.Tope());

        int[] misNotas = {8, 6, 10, 7, 9};

        System.out.println("Main: Necesito el promedio de " + misNotas.length + " notas.");
        double promedioFinal = calcularPromedio(misNotas, pila);

        System.out.println("Main: El promedio calculado es " + promedioFinal);

        pila.Desapilar();
        System.out.println("Programa terminado. ¿Pila vacía? " + pila.PilaVacia());

    }

    public static double calcularPromedio(int[] notas, PilaEj5TDA pila) {
        pila.Apilar("calcularPromedio() ");
        System.out.println("  Tope actual: " + pila.Tope());

        int sumarTotal = sumar(notas, pila);

        double promedio = (double) sumarTotal / notas.length;

        pila.Desapilar();
        System.out.println("  calcularPromedio terminó. El tope vuelve a ser: " + pila.Tope());



        return promedio;
    }

    public static int sumar (int[] notas, PilaEj5TDA pila){

        pila.Apilar("sumar()");
        System.out.println("    Tope actual: " + pila.Tope() + " <--- ¡Sumando todo el arreglo!");

        int resultado = 0;

        for (int i = 0; i < notas.length; i++) {
            resultado = resultado + notas[i];

        }
        pila.Desapilar();
        System.out.println("    sumar terminó. El tope vuelve a ser: " + pila.Tope());

        return  resultado;
    }
}