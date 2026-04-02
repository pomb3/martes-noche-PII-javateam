package Implementacion;

import Interfaces.PilaTDA;

public class Estrategia_1 implements PilaTDA {

    int[] arr;
    int tope;

    public void InicializarPila() {
        arr = new int[100];
        tope = 0;
    }

    public void Apilar(int x) {
        arr[tope] = x;
        tope++;
    }

    public void Desapilar() {
        tope--;
    }

    public int Tope() {
        return arr[tope - 1];
    }

    public boolean PilaVacia() {
        return tope == 0;
    }
}