package Implementacion;

import Interfaces.PilaTDA;

public class Estrategia_3 implements PilaTDA {

    private static final int MAX = 100;
    private String[] datos;

    @Override
    public void InicializarPila() {
        datos = new String[MAX + 1];
        datos[0] = "0"; // en la posición 0 se guarda la cantidad de elementos
    }

    @Override
    public void Apilar(String x) {
        int cantidad = Integer.parseInt(datos[0]);

        if (cantidad < MAX){
            cantidad++;
            datos[cantidad] = x;
            datos[0] = String.valueOf(cantidad);
        }
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()) {
            int cantidad = Integer.parseInt(datos[0]);
            cantidad--;
            datos[0] = String.valueOf(cantidad);
        }
    }

    @Override
    public String Tope() {
        int cantidad = Integer.parseInt(datos[0]);
        return datos[cantidad];
    }

    @Override
    public boolean PilaVacia() {
        return datos[0].equals("0");
    }
}
