package Implementacion;

import Interfaces.PilaTDA;

public class Estrategia_1 implements PilaTDA {

    private static final int MAX = 100;
    private String[] datos;
    private int cantidad; // variable auxiliar: cantidad de elementos

    @Override
    public void InicializarPila() {
        datos = new String[MAX];
        cantidad = 0;
    }

    @Override
    public void Apilar(String url) {
        if (cantidad < MAX) {
            datos[cantidad] = url; // guarda al final
            cantidad++;
        }
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()) {
            cantidad--;
        }
    }

    @Override
    public String Tope() {
        return datos[cantidad - 1];
    }

    @Override
    public boolean PilaVacia() {
        return cantidad == 0;
    }
}