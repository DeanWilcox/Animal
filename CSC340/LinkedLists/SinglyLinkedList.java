public class SinglyLinkedList {
    //data -fields
    Node head;

    //actions - methods
    //AddFirst
    public void AddFirst(int someValue) //O(1)
    {
        //create a new node
        Node newNode = new Node(someValue);

        //link this node to the head (the beginning of the existing list)
        newNode.next = head;

        //move the head to point to new node
        head = newNode;
    }
    //Print - traversal
    public void Print() //O(n)
    {
        if(IsEmpty())
        {
            System.out.println("empty list ...");
        }
        else
        {
            //put the finger on the head
            Node finger = head;
    
            //repeat as long as finger does not point to null
            while(finger != null)
            {
                //display the value
                System.out.print(finger.value+" -> ");
    
                //move to the next node
                finger = finger.next;
            }
            System.out.println();   
            System.out.println();
        }
    }
    //AddLast
    public void AddLast(int someValue) //O(n)
    {
        if(IsEmpty())
        {
            AddFirst(someValue);
        }
        else
        {
            //create a new node
            Node newNode = new Node(someValue);

            //find the last node in the list (move finger from head to last)
            Node finger=head;
            while(finger.next!=null)
            {
                //move finger to the right
                finger = finger.next;
            }

            //link in the new node - make last node point to newnode
            finger.next = newNode;
        }
    }
    //IsEmpty
    public boolean IsEmpty() //O(1)
    {
        // if(head == null)
        // {
        //     return true;
        // }
        // else
        // {
        //     return false;
        // }
        return head == null;
    }
    //deletes ....

    public void DeleteFirst() throws Exception //O(1)
    {
        if(IsEmpty())
        {
            throw new Exception("You can not delete from an empty list");
        }
        //move the head
        head = head.next;
    }

    public void DeleteLast() throws Exception //O(n)
    {
        if(IsEmpty())
        {
            throw new Exception("You can not delete from an empty list");
        }
        else if(head.next == null)// we only have 1 node in the list
        {
            DeleteFirst();
        }
        
        //find the next to last node
        Node finger = head;

        while(finger.next.next!=null)
        {
        finger = finger.next;
        }

        //break the link between the last and next to last node
        finger.next = null;

    }

    public void clear() //O(1)
    {
        head = null;
    }

//init


}
