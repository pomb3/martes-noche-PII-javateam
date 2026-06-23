package ABB;

class NodoPalabra {
    String p;
    int cant = 1;
    NodoPalabra izq, der;

    public NodoPalabra(String p) { this.p = p; }
}

public class IndiceDePalabras {
    private NodoPalabra raiz;

    public void procesarTexto(String[] palabras) {
        for (String p : palabras) if (!p.trim().isEmpty()) raiz = agregar(raiz, p.toLowerCase().trim());
    }

    private NodoPalabra agregar(NodoPalabra n, String p) {
        if (n == null) return new NodoPalabra(p);

        int cmp = p.compareTo(n.p);
        if (cmp < 0) n.izq = agregar(n.izq, p);
        else if (cmp > 0) n.der = agregar(n.der, p);
        else n.cant++; // Si es igual (0), suma el contador

        return n;
    }

    public void mostrarIndice() { mostrar(raiz); }

    private void mostrar(NodoPalabra n) {
        if (n == null) return;
        mostrar(n.izq);
        System.out.println(n.p + " -> " + n.cant);
        mostrar(n.der);
    }
}
