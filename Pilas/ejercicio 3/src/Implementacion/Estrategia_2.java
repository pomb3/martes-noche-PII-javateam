package Implementacion;

import Interfaces.PilaTDA;

public class Estrategia_2 implements PilaTDA {

    private static final int MAX = 100;
    private String[] datos;
    private int cantidad; // variable auxiliar

    @Override
    public void InicializarPila() {
        datos = new String[MAX];
        cantidad = 0;
    }

    @Override
    public void Apilar(String x) {
        if (cantidad < MAX) {
            for (int i = cantidad; i > 0; i--) {
                datos[i] = datos[i - 1]; 
            }
            datos[0] = x; // el tope siempre queda en 0
            cantidad++;
        }
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()) {
            for (int i = 0; i < cantidad - 1; i++) {
                datos[i] = datos[i + 1]; // corre a la izquierda
            }
            cantidad--;
        }
    }

    @Override
    public String Tope() {
        return datos[0];
    }

    @Override
    public boolean PilaVacia() {
        return cantidad == 0;
    }
}


//public class Estrategia_2 implements PilaTDA {
//
//    private static final int MAX = 100;
//    private int[] datos;
//    private int cantidad; // variable auxiliar
//
//    @Override
//    public void InicializarPila() {
//        datos = new int[MAX];
//        cantidad = 0;
//    }
//
//    @Override
//    public void Apilar(int x) {
//        if (cantidad < MAX) {
//            for (int i = cantidad; i > 0; i--) {
//                datos[i] = datos[i - 1]; // mueve a la derecha
//            }
//            datos[0] = x; // el tope siempre queda en 0
//            cantidad++;
//        }
//    }
//
//    @Override
//    public void Desapilar() {
//        if (!PilaVacia()) {
//            for (int i = 0; i < cantidad - 1; i++) {
//                datos[i] = datos[i + 1]; // corre a la izquierda
//            }
//            cantidad--;
//        }
//    }
//
//    @Override
//    public int Tope() {
//        return datos[0];
//    }
//
//    @Override
//    public boolean PilaVacia() {
//        return cantidad == 0;
//    }
//}
