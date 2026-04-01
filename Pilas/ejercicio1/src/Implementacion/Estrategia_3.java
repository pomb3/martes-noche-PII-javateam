package Implementacion;

import Interfaces.PilaTDA;

public class Estrategia_3 implements PilaTDA {

    private static final int MAX = 100;
    private String[] datos;

    @Override
    public void InicializarPila() {
        datos = new String[MAX + 1];
        // Guardamos el número cero, pero como texto (String)
        datos[0] = "0";
    }

    @Override
    public void Apilar(String url) { // Recibe String
        // 1. Leemos el texto en la posición 0 y lo convertimos a número
        int cantidad = Integer.parseInt(datos[0]);

        if (cantidad < MAX) {
            cantidad++; // Sumamos 1
            datos[cantidad] = url; // Guardamos la URL en la nueva posición

            // 2. Convertimos el nuevo número a texto y lo guardamos en la pos 0
            datos[0] = String.valueOf(cantidad);
        }
    }

    @Override
    public void Desapilar() {
        if (!PilaVacia()) {
            int cantidad = Integer.parseInt(datos[0]);
            cantidad--; // Restamos 1
            datos[0] = String.valueOf(cantidad); // Lo volvemos a guardar como texto
        }
    }

    @Override
    public String Tope() { // Devuelve String
        int cantidad = Integer.parseInt(datos[0]);
        return datos[cantidad];
    }

    @Override
    public boolean PilaVacia() {
        // La pila está vacía si en la posición 0 dice "0"
        return datos[0].equals("0");
    }
}