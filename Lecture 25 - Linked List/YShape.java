public class YShape {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //Step 1: create new node
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        // Step 2: newNode next = head
        newNode.next = head;
        // Step 3: head = newNode
        head = newNode;

    }

    public void addLast(int data){
        //Step 1: create new node
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        // Step 2: tail next = newNode
        tail.next = newNode;
        // Step 3: tail = newNode
        tail = newNode;
    }

    public static Node YShape(int data){
        Node ll1 = new Node();
        Node ll2  new Node();
        while(l1 != null && l2 != null){
            if (l1.data == l2.data){
                return l1.data;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        
    }

    public static void main(String args[]){
        YShape ll1 = new YShape();
        YShape ll2 = new YShape();
        ll1.addLast(1);
        ll1.addLast(2);
        ll1.addLast(3);
        ll1.addLast(6);
        ll1.addLast(7);
        ll2.addLast(4);
        ll2.addLast(5);
        ll2.addLast(6);
    }
}
