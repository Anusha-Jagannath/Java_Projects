package linkedList;


class Node<E> {

    E data;
    Node link;

    public Node(E data) {
        this.data = data;
        this.link = null;
    }
}
public class LinkedList<E> {

    Node<E> head = null;

    private void addTo(E element) {
        Node<E> newNode = new Node<E>(element);

        if (head == null) {
            head = newNode;
        } else {

            Node<E> temp;
            temp = head;

            while (temp.link != null) {
                temp = temp.link;
            }

            temp.link = newNode;
        }
    }


    private void remove(int element) {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Node temp;
            temp = head;

            while (temp.link != null) {
                temp = temp.link;
            }

            temp.link = null;
        }
    }

    private void display() {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {

            Node<E> temp = head;

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.link;
            }
        }
    }
    public static void main(String args[]) {

        LinkedList<Integer> ll = new LinkedList<Integer>();
        for(int i=0;i<10;i++) {
            ll.addTo(i);
        }

        ll.display();
    }
}
