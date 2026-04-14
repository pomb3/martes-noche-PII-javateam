package Implementacion;

import Interface.DiccionarioMultipleTDA;

public class DiccionarioMultipleDinamico implements DiccionarioMultipleTDA {

    // Lista enlazada de claves; cada clave apunta a su propia lista de valores.
    private NodeClave cabeza;

    @Override
    public void InicializarDiccionario() {
        cabeza = null;
    }

    @Override
    public void Agregar(String clave, String valor) {
        NodeClave nodoClave = buscarClave(clave);

        if (nodoClave == null) {
            // Clave nueva: crear nodo de clave con un primer valor.
            NodeValor nodoValor = new NodeValor(valor, null);
            cabeza = new NodeClave(clave, nodoValor, cabeza);
        } else {
            // Clave existente: agregar valor solo si no está repetido.
            if (!existeValor(nodoClave, valor)) {
                nodoClave.setPrimero(new NodeValor(valor, nodoClave.getPrimero()));
            }
        }
    }

    @Override
    public void EliminarValor(String clave, String valor) {
        NodeClave nodoClave = buscarClave(clave);
        if (nodoClave == null) return;

        NodeValor curr = nodoClave.getPrimero();
        NodeValor prev = null;

        // CORRECCIÓN: Uso de .equals() para comparar Strings
        while (curr != null && !curr.getValor().equals(valor)) {
            prev = curr;
            curr = curr.getNext();
        }

        if (curr != null) {
            if (prev == null) {
                nodoClave.setPrimero(curr.getNext());
            } else {
                prev.setNext(curr.getNext());
            }

            // Si la clave quedó sin valores, se elimina también.
            if (nodoClave.getPrimero() == null) {
                Eliminar(clave);
            }
        }
    }

    @Override
    public void Eliminar(String clave) {
        NodeClave curr = cabeza;
        NodeClave prev = null;

        // CORRECCIÓN: Uso de .equals() para comparar Strings
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
    public String[] Recuperar(String clave) {
        NodeClave nodoClave = buscarClave(clave);
        if (nodoClave == null) return new String[0];

        int count = 0;
        NodeValor curr = nodoClave.getPrimero();
        while (curr != null) {
            count++;
            curr = curr.getNext();
        }

        // CORRECCIÓN: Instanciar arreglo de String, no de int
        String[] result = new String[count];
        curr = nodoClave.getPrimero();
        for (int i = 0; i < count; i++) {
            result[i] = curr.getValor();
            curr = curr.getNext();
        }
        return result;
    }

    @Override
    public String[] Claves() {
        int count = 0;
        NodeClave curr = cabeza;
        while (curr != null) {
            count++;
            curr = curr.getNext();
        }

        // CORRECCIÓN: Instanciar arreglo de String, no de int
        String[] result = new String[count];
        curr = cabeza;
        for (int i = 0; i < count; i++) {
            result[i] = curr.getClave();
            curr = curr.getNext();
        }
        return result;
    }

    private NodeClave buscarClave(String clave) {
        NodeClave curr = cabeza;
        // CORRECCIÓN: Uso de .equals() para comparar Strings
        while (curr != null && !curr.getClave().equals(clave)) {
            curr = curr.getNext();
        }
        return curr;
    }

    private boolean existeValor(NodeClave nodoClave, String valor) {
        NodeValor curr = nodoClave.getPrimero();
        while (curr != null) {
            // CORRECCIÓN: Uso de .equals() para comparar Strings
            if (curr.getValor().equals(valor)) return true;
            curr = curr.getNext();
        }
        return false;
    }
}