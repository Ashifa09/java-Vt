import java.util.Scanner;
public class Linkedlist3 {
   
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class Head {
        Node head = null;
        Node tail = null;

        public void kuch_bhi() {

            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Enter the data: ");
                int a = sc.nextInt();
                System.out.println("Enter 1 to continue: ");
                n = sc.nextInt();
                Node naya_obj = new Node(a);
                if (head == null) {
                    head = naya_obj;
                    tail = naya_obj;
                } else {
                    tail.next = naya_obj;
                    tail = naya_obj;
                }
            } while (n == 1);
        }

        public void display() {
            Node current = head;
            if (head == null) {
                System.out.println("Nhi kaam kr rha yaar");
            }
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }

        public void insertion_at_beg() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the data: ");
            int a = sc.nextInt();
            Node newNode = new Node(a);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        public void insertion_at_middle() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the data: ");
            int a = sc.nextInt();
            System.out.println("Enter the position: ");
            int pos = sc.nextInt();
            Node newNode = new Node(a);
            if (head == null) {
                head = newNode;
                tail = newNode;
            }else {
                Node temp = head;
                for(int i = 0; i < pos - 2; i++){
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
        public void deletion() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value: ");
            int value = sc.nextInt();
            if (head == null) {
                System.out.println("LinkedList doesn't exist");
            }else {
                Node temp = head, prev = null;
                temp = temp.next;
                while(temp!=null && temp.data != value){
                    prev = temp;
                    temp = temp.next;
                }
                prev.next = temp.next;
            }
        }
    }

    public static void main(String[] args){
        Head h = new Head();
        h.kuch_bhi();
        h.display();
        h.deletion();
        h.display();

    }
}

