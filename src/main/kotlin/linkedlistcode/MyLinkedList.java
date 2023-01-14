package linkedlistcode;

public class MyLinkedList<E> {
    Node<E> head;

    void add(E data) {
        Node<E> node = new Node(data);
        if (isEmpty()) {
            head = node;
        } else {
            Node<E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Empty linked list");
        } else {
            Node<E> temp = head;
            while (temp !=null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    boolean isEmpty() {
        return head == null;
    }
    static class Node<E> {
        E data;
        Node<E> next;
        public Node(E data) {
           this.data = data;
           next = null;
        }
    }
}
