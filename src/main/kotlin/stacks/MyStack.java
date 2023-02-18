package stacks;

class Node {
    int data;
    Node link;
    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class LinkedList {

    Node head;

    public void insert(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node temp;
            temp = head;

            while (temp.link != null) {
                temp = temp.link;
            }

            temp.link = node;
        }
    }
    public void delete() {

        if (head == null) {
            System.out.println("Stack is empty");
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

    public int peek() {

        if (head == null) {
            return -1;
        }
        Node temp;
        temp = head;

        while(temp.link != null) {
            temp = temp.link;
        }

        return temp.data;
    }
}

public class MyStack {

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);

        ll.delete();
        System.out.println(ll.peek());
        ll.display();
    }

}
