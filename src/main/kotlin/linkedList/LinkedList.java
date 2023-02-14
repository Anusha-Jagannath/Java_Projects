package linkedList;


class Node {

    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}
public class LinkedList {

    Node head = null;

    private void addTo(int element) {
        Node newNode = new Node(element);

        if (head == null) {
            head = newNode;
        } else {

            Node temp;
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

            Node temp = head;

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.link;
            }
        }
    }
    public static void main(String args[]) {

        LinkedList ll = new LinkedList();
        for(int i=0;i<10;i++) {
            ll.addTo(i);
        }

        ll.display();
    }
}
