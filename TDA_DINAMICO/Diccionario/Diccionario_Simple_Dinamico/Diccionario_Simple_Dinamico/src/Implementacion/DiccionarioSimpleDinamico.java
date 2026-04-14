package Implementacion;

import Interface.DiccionarioSimpleTDA;

public class DiccionarioSimpleDinamico implements DiccionarioSimpleTDA {

    private Node cabeza; // lista enlazada de pares clave-valor

    @Override
    public void InicializarDiccionario() {
        cabeza = null;
    }

    @Override
    public void Agregar(String clave, String valor) {
        Node curr = cabeza;

        // Si la clave ya existe, actualiza su valor.
        while (curr != null && !curr.getClave().equals(clave)) {
            curr = curr.getNext();
        }

        if (curr != null) {
            curr.setValor(valor);
        } else {
            cabeza = new Node(clave, valor, cabeza);
        }
    }

    @Override
    public void Eliminar(String clave) {
        Node curr = cabeza;
        Node prev = null;

        while (curr != null && !curr.getClave().equals(clave)) {
            prev = curr;
            curr = curr.getNext();
        }

        if (curr != null) {
            if (prev == null) {
                cabeza = curr.getNext();
            } else {
                prev.setNext(curr.getNext());
            }
        }
    }

    @Override
    public String[] Claves() {
        int count = 0;
        Node curr = cabeza;
        while (curr != null) {
            count++;
            curr = curr.getNext();
        }

        String[] result = new String[count];
        curr = cabeza;
        for (int i = 0; i < count; i++) {
            result[i] = curr.getClave();
            curr = curr.getNext();
        }
        return result;
    }
}
