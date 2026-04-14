package Implementacion;

public class Node {

    private int data;
    private NodeE2 next;

    public Node(int data, NodeE2 next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeE2 getNext() {
        return next;
    }

    public void setNext(NodeE2 next) {
        this.next = next;
    }
}