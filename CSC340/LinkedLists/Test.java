
public class Test {
    
    public static void main(String[] args) throws Exception {
        // Node n1 = new Node(10);
        // Node n2 = new Node(20);
        // Node n3 = new Node(30);

        // n1.next = n2;
        // n2.next = n3;

        // System.out.println(n1.value);

        // System.out.println(n2.value);
        // System.out.println(n1.next.value);

        // System.out.println(n3.value);
        // System.out.println(n1.next.next.value);
        
        SinglyLinkedList list = new SinglyLinkedList();
        // list.AddFirst(10);
        // list.AddFirst(20);
        // list.AddFirst(30);
        // list.Print();

        list.AddLast(15);
        list.Print();

        list.AddLast(25);
        list.Print();

        list.AddLast(35);
        list.Print();

        list.DeleteFirst();
        list.Print();
    }
}