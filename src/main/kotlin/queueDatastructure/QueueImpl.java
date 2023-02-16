package queueDatastructure;


class Node {

    int data;
    Node link;

    public Node(int data) {
        this.data= data;
        this.link = null;
    }
}


class Queue1 {

    Node head;

    void addNode(int data) {
        Node newNode = new Node(data);
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

    void delete() {

        if (head == null) {
            System.out.println("queue is empty");
        } else {
            head = head.link;
        }
    }

    void display() {
        Node temp;
        temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.link;
        }
    }
}
public class QueueImpl {

    public static void main(String args[]) {
        Queue1 queue1 = new Queue1();
        queue1.addNode(10);
        queue1.addNode(20);
        queue1.addNode(30);

        queue1.delete();
        queue1.delete();

    }
}
