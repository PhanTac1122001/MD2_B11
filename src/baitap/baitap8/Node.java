package baitap.baitap8;

public class Node {
    private Object data;
    private Node next;

    public Node(Object data){
        this.data = data;
        next = null;
    }

    public Object getData(){
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
