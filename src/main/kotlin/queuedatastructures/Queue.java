package queuedatastructures;

class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class LinkedList {

    Node head;

    public void insertNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
    }

    public void deleteNode() {
        if (head == null) {
            System.out.println("Queue is empty");
        } else {
            head = head.link;
        }
    }

    public void display() {
        Node temp;
        temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.link;
        }
    }
}
public class Queue {

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.insertNode(1);
        ll.insertNode(2);
        ll.insertNode(3);
        ll.insertNode(4);

        ll.deleteNode();

        ll.deleteNode();
        ll.deleteNode();
        ll.display();
    }
}
