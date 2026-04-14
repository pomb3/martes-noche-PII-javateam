import Implementacion.DiccionarioMultipleDinamico;
import Interface.DiccionarioMultipleTDA;

import Implementacion.DiccionarioMultipleDinamico;
import Interface.DiccionarioMultipleTDA;

public class EjercicioDiccionarioMultiple {

    public static void main(String[] args) {
        DiccionarioMultipleTDA diccionarioSinonimos = new DiccionarioMultipleDinamico();
        diccionarioSinonimos.InicializarDiccionario();

        // 1. Cargamos el diccionario de sinónimos con varias palabras
        diccionarioSinonimos.Agregar("feliz", "alegre");
        diccionarioSinonimos.Agregar("feliz", "contento");
        diccionarioSinonimos.Agregar("feliz", "dichoso");

        diccionarioSinonimos.Agregar("rápido", "veloz");
        diccionarioSinonimos.Agregar("rápido", "ágil");
        diccionarioSinonimos.Agregar("rápido", "ligero");
        diccionarioSinonimos.Agregar("rápido", "presto");

        diccionarioSinonimos.Agregar("hermoso", "lindo");
        diccionarioSinonimos.Agregar("hermoso", "bello");
        diccionarioSinonimos.Agregar("hermoso", "precioso");

        System.out.println("--- DICCIONARIO DE SINÓNIMOS ---\n");

        imprimirSinonimos(diccionarioSinonimos, "feliz");
        imprimirSinonimos(diccionarioSinonimos, "rápido");
        imprimirSinonimos(diccionarioSinonimos, "hermoso");

        // Probamos con una palabra que no existe para ver qué hace
        imprimirSinonimos(diccionarioSinonimos, "triste");
    }


    public static void imprimirSinonimos(DiccionarioMultipleTDA diccionario, String palabra) {
        String[] sinonimos = diccionario.Recuperar(palabra);

        System.out.println("Palabra: [" + palabra.toUpperCase() + "]");

        if (sinonimos.length == 0) {
            System.out.println("  -> No se encontraron sinónimos registrados.\n");
        } else {
            for (String sinonimo : sinonimos) {
                System.out.println("  - " + sinonimo);
            }
            System.out.println(); // Salto de línea extra para que quede prolijo
        }
    }
}