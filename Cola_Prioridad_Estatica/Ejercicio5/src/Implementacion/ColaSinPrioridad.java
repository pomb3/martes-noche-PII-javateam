package Implementacion;

import Interface.ColaPrioridadTDA;
import Interface.ColaPrioridadEjercicio5;

public class ColaSinPrioridad implements ColaPrioridadEjercicio5 {

    private static final int MAX = 100;
    private String[] datos;
    private int cantidad;

    @Override
    public void IniciarCola() {
        datos = new String[MAX];
        cantidad = 0;
    }

    @Override
    public void Acolar(String nombre) {
        if (cantidad < MAX) {
            datos[cantidad] = nombre;
            cantidad++;

        }
    }

    @Override
    public void Desacolar() {
        if (!ColaVacia()) {
            for (int i = 0; i < cantidad - 1; i++) {
                datos[i] = datos[i + 1];}
            cantidad--;
            datos[cantidad] = null; // Limpiamos el rastro para el Garbage Collector
        }
    }

    @Override
    public boolean ColaVacia() {
        return cantidad == 0;
    }

    @Override
    public String Primero() {
        return datos[0];
    }
}