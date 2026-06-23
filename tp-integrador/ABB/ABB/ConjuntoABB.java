package ABB;

class ConjuntoABB {
    private ABB.ABBEnterosImpl arbol = new ABB.ABBEnterosImpl();

    public void agregar(int v) { arbol.agregar(v); }
    public boolean eliminar(int v) { return arbol.eliminar(v); }
    public boolean contiene(int v) { return arbol.contiene(v); }
    public int cantidad() { return arbol.cantidad(); }
    public int elegir() { return arbol.minimo(); } // Delegamos el error de vacío a minimo()

    public ConjuntoABB interseccion(ConjuntoABB otro) {
        ConjuntoABB res = new ConjuntoABB();
        interseccionRec(arbol.getRaiz(), otro, res);
        return res;
    }

    private void interseccionRec(ABB.Nodo n, ConjuntoABB otro, ConjuntoABB res) {
        if (n == null) return;
        if (otro.contiene(n.valor)) res.agregar(n.valor);
        interseccionRec(n.izquierdo, otro, res);
        interseccionRec(n.derecho, otro, res);
    }
}