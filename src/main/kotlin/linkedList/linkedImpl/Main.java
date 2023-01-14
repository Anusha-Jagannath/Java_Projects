package linkedList.linkedImpl;

public class Main {

    Node head;

    void add(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = node;
        }

        else {
            Node temp;
            temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;

        }
    }

    boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String args[]) {
            Main list = new Main();
            for(int i = 0;i<10;i++) {
                list.add(i);
            }
            list.display();
    }
}
