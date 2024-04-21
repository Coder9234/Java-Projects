public class ZigZag {
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

    public void print(){
        if (head == null){
            System.out.println("LinkedList is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void ZigZag() {
        // Step 1: find the midNode
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Step 2: 2nd half reverse
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
 
        // Step 3: Alternate Merging
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            // update
            left = nextL;
            right = nextR;
        }
    }

    public static void main(String args[]){
        ZigZag ll = new ZigZag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // 1->2->3->4->5
        ll.print(); 
        ll.ZigZag();
        ll.print();
    }
}
