package Implementacion;

public class Node {

    private String clave;
    private String valor;
    private Node next;

    public Node(String clave, String valor, Node next) {
        this.clave = clave;
        this.valor = valor;
        this.next = next;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
