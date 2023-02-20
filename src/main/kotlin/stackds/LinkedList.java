package stackds;


class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class Stack {
    Node head = null;

    void insert(int data) {
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

    int pop() {

        if (head == null) {
            return -1;
        } else {
            Node temp;
            Node prev;
            temp = head;
            prev = head;

            while (temp.link != null) {
                prev = temp;
                temp = temp.link;
            }
            prev.link = null;
            return temp.data;
        }
    }

    int peek() {
        Node temp;
        temp = head;

        if (head == null) {
            return -1;
        }
        while (temp.link != null) {
            temp = temp.link;
        }

        return temp.data;
    }

    void display() {
        if (head == null) {
            System.out.println("Empty linked list");
        } else {
            Node temp;
            temp = head;

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.link;
            }

        }
    }

}

public class LinkedList {

    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.insert(10);
        stack.insert(20);
        stack.insert(30);

        stack.pop();
        stack.pop();
        stack.display();
    }
}
