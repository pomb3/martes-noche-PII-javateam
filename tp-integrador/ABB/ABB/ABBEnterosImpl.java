package ABB;

public class ABBEnterosImpl implements ABBEnteros {
    private Nodo raiz;

    @Override
    public void agregar(int valor) {
        agregarIterativo(valor);
    }

     public void agregarIterativo(int valor){
        if (raiz == null) {
            raiz = new Nodo(valor);
            return;
        }

        Nodo actual = raiz;

        while (true){
            if (valor == actual.valor) {
                return;
            }
            if (valor < actual.valor) {
                if (actual.izquierdo == null) {
                    actual.izquierdo = new Nodo(valor);
                    return;
                }

                actual = actual.izquierdo;
            }
            else{
                if (actual.derecho == null) {
                    actual.derecho = new Nodo(valor);
                    return;
                }
                actual = actual.derecho;
            }
        }
    }

    private Nodo agregarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
                return new Nodo(valor);
            }
            if (valor > actual.valor ){
                actual.derecho = agregarRecursivo(actual.derecho, valor);
            }
            if (valor < actual.valor){
                actual.izquierdo = agregarRecursivo(actual.izquierdo, valor);
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
        if (actual.valor == valor){
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

       //caso base
        if (actual == null){
            return null;
        }
        if (valor<actual.valor){
            actual.izquierdo = eliminarRecursivo(actual.izquierdo, valor);
            return actual;
        }
        if (valor > actual.valor){
            actual.derecho =  eliminarRecursivo(actual.derecho, valor);
            return actual;
        }
            if (actual.esHoja()) return null;
            if (actual.izquierdo == null) return actual.derecho;
            if (actual.derecho == null )return actual.izquierdo;

            Nodo sucesor = minimoRecursivo(actual.derecho);
            actual.valor = sucesor.valor;
            actual.derecho = eliminarRecursivo(actual.derecho, sucesor.valor);
            return actual;
    }



    @Override
    public int cantidad() {
        return cantidadRecursivo(raiz);
    }

    private int cantidadRecursivo(Nodo actual) {
        if (actual == null) return 0;
        return 1 + cantidadRecursivo(actual.izquierdo) + cantidadRecursivo(actual.derecho);
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
        System.out.println();
    }

    private void mostrarInOrdenRecursivo(Nodo actual) {
        if (actual == null) return;

        mostrarInOrdenRecursivo(actual.izquierdo);
        System.out.print(actual.valor + " ");
        mostrarInOrdenRecursivo(actual.derecho);
    }

    @Override
    public void mostrarPreOrden() {
        mostrarPreOrdenRecursivo(raiz);
        System.out.println();
    }

    private void mostrarPreOrdenRecursivo(Nodo actual) {
        if (actual == null) return;

        System.out.print(actual.valor + " ");
        mostrarPreOrdenRecursivo(actual.izquierdo);
        mostrarPreOrdenRecursivo(actual.derecho);
    }

    @Override
    public void mostrarPostOrden() {
        mostrarPostOrdenRecursivo(raiz);
        System.out.println();
    }

    private void mostrarPostOrdenRecursivo(Nodo actual) {
        if (actual == null) return;

        mostrarPostOrdenRecursivo(actual.izquierdo);
        mostrarPostOrdenRecursivo(actual.derecho);
        System.out.print(actual.valor + " ");
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
