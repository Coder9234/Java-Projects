public class LinkedList{
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

    public void addInMiddle(int index, int data){
        if (index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1){
            temp  = temp.next;
            i++;
        }
        // i = index - 1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MAX_VALUE;
        }
        else if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if (size == 0){
            System.out.println("Linked List is empty");
            return Integer.MAX_VALUE;
        }
        else if (size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        // prev: i = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++){
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int search(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if (temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public void reverse(){ 
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public void deleteNthFromEnd(int n){
        // calculate size
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if (n == size){
            head = head.next; // remove First
            return;
        }
        // size - n
        int i = 0;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is the midNode 
    }

    public boolean checkPalindrome(){
        if (head == null && head.next == null){
            return true;
        }
        // Step 1: find mid
        Node midNode = findMid(head);

        // Step 2: reverse the 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next ;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // Step 3: check if the first half is equal to the rigth half
        while(right != null){
            if (left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.checkPalindrome());
    }
}