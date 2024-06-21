package baitap.baitap8;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
        head = null;
    }

    public void add(int index, E element) {

        Node node = new Node(element);

        if (head == null) {
            head = node;
        } else {
            if (index == 1) {
                //gan vao node dau tien
                node.setNext(head);
                head = node;
            } else {

                Node temp = head;


                for (int i = 1; i < index; i++) {
                    if (temp.getNext() != null)
                        temp = temp.getNext();
                }


                node.setNext(temp.getNext());


                temp.setNext(node);
            }
        }
    }

    public void addFirst(E e) {

        Node node = new Node(e);

        node.setNext(head);
        head = node;
    }

    public void addLast(E e) {

        Node node = new Node(e);
        node.setNext(null);


        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        temp.setNext(node);

    }

    public E remove(int index) {

        Node temp = head;
        for (int i = 1; i < index; i++) {
            if (temp.getNext() != null)
                temp = temp.getNext();
        }

        Node nodeDelete = temp.getNext();
        temp.setNext(nodeDelete.getNext());
        return (E) nodeDelete.getData();
    }

    public boolean remove(Object e) {
        Node temp = head;
        Node beforeTemp = head;

        while (temp.getNext() != null && !temp.getData().equals(e)) {
            beforeTemp = temp;
            temp = temp.getNext();
        }

        if (!temp.getData().equals(e)) {
            return false;
        }


        beforeTemp.setNext(temp.getNext());
        return true;
    }

    public int size() {
        int total = 0;
        if (head != null)
            total = 1;
        Node temp = head;
        while (temp.getNext() != null) {
            total++;
            temp = temp.getNext();
        }
        return total;
    }

    public E clone() {
        return (E) head;
    }

    public boolean contains(E o) {
        if (head == null)
            return false;

        Node temp = head;
        while (temp.getNext() != null && !temp.getData().equals(o))
            temp = temp.getNext();
        if (temp.getData().equals(o))
            return true;
        return false;
    }

    public int indexOf(E o) {
        if (head == null)
            return 0;
        Node temp = head;
        int index = 1;
        while (temp.getNext() != null && !temp.getData().equals(o)) {
            temp = temp.getNext();
            index++;
        }
        if (temp.getData().equals(o))
            return index;
        return 0;
    }

    public boolean add(E e) {

        Node node = new Node(e);
        node.setNext(null);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getNext() != null)
                temp = temp.getNext();
            temp.setNext(node);
        }
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        System.out.println("I'm sure!!!");
    }

    public E get(int i) {

        if (head == null)
            return null;

        Node temp = head;
        int index = 1;
        while (index < i && temp.getNext() != null) {
            index++;
            temp = temp.getNext();
        }
        return (E) temp.getData();
    }

    public E getFirst() {
        if (head == null)
            return null;

        return (E) head.getData();
    }

    public E getLast() {
        if (head == null)
            return null;

        Node temp = head;
        while (temp.getNext() != null)
            temp = temp.getNext();
        return (E) temp.getData();
    }

    public void clear() {
        head = null;
    }
}
