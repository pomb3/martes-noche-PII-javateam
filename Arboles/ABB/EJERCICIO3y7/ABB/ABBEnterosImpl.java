package ABB;

public class ABBEnterosImpl implements ABBEnteros {
    private Nodo raiz;

    @Override
    public void agregar(int valor) {
        raiz = agregarRecursivo(raiz, valor);
    }

    private Nodo agregarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }

        if (valor < actual.valor) {
            actual.izquierdo = agregarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = agregarRecursivo(actual.derecho, valor);
        }

        return actual;
    }

    @Override
    public boolean contiene(int valor) {
        return contieneRecursivo(raiz, valor);
    }

    private boolean contieneRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return false;
        }

        if (valor == actual.valor) {
            return true;
        }

        if (valor < actual.valor) {
            return contieneRecursivo(actual.izquierdo, valor);
        } else {
            return contieneRecursivo(actual.derecho, valor);   
        }
    }

    @Override
    public boolean eliminar(int valor) {
        if (!contiene(valor)) {
            return false;
        }

        raiz = eliminarRecursivo(raiz, valor);
        return true;
    }

    private Nodo eliminarRecursivo(Nodo actual, int valor) {
        throw new UnsupportedOperationException("Método no implementado");
    }

    @Override
    public int cantidad() {
        return cantidadRecursivo(raiz);
    }

    private int cantidadRecursivo(Nodo actual) {
        throw new UnsupportedOperationException("Método no implementado");
    }

    @Override
    public int altura() {
        return alturaRecursivo(raiz);
    }

    private int alturaRecursivo(Nodo actual) {
        throw new UnsupportedOperationException("Método no implementado");
    }

    @Override
    public int minimo() {
        if (raiz == null) {
            throw new IllegalStateException("El árbol está vacío");
        }

        return minimoRecursivo(raiz).valor;
    }

    private Nodo minimoRecursivo(Nodo actual) {
        throw new UnsupportedOperationException("Método no implementado");
    }

    @Override
    public int maximo() {
        if (raiz == null) {
            throw new IllegalStateException("El árbol está vacío");
        }

        return maximoRecursivo(raiz).valor;
    }

    private Nodo maximoRecursivo(Nodo actual) {
        throw new UnsupportedOperationException("Método no implementado");
    }

    @Override
    public void mostrarInOrden() {
        mostrarInOrdenRecursivo(raiz);
    }

    private void mostrarInOrdenRecursivo(Nodo actual) {
        throw new UnsupportedOperationException("Método no implementado");
    }

    @Override
    public void mostrarPreOrden() {
        mostrarPreOrdenRecursivo(raiz);
    }

    private void mostrarPreOrdenRecursivo(Nodo actual) {
        throw new UnsupportedOperationException("Método no implementado");
    }

    @Override
    public void mostrarPostOrden() {
        mostrarPostOrdenRecursivo(raiz);
    }

    private void mostrarPostOrdenRecursivo(Nodo actual) {
        throw new UnsupportedOperationException("Método no implementado");
    }

    public boolean enRango(int desde, int hasta) {
        return enRangoRecursivo(raiz, desde, hasta);
    }

    private boolean enRangoRecursivo(Nodo actual, int desde, int hasta) {
        if (actual == null) {
            return true;
        }
        if (actual.valor < desde || actual.valor > hasta) {
            return false;
        }
        return enRangoRecursivo(actual.izquierdo, desde, hasta)
            && enRangoRecursivo(actual.derecho, desde, hasta);
    }
}
