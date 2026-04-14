package Implementacion;

public class NodeE6 {

    private int dato;
    private int prioridad;
    private NodeE2 next;

    public NodeE6(int dato, int prioridad, NodeE2 next) {
        this.dato = dato;
        this.prioridad = prioridad;
        this.next = next;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public NodeE2 getNext() {
        return next;
    }

    public void setNext(NodeE2 next) {
        this.next = next;
    }
}
