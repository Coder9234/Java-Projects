public class CircularLL {
    static class Node{
        int data;
        Node next;
    }

    public static Node addToEmpty(Node head, int data){
        Node newNode = new Node();
        if (head != null){
            return head;
        }
        newNode.data = data;
        head = newNode;
        newNode.next = head;
        return head;
    }

    public static Node addFirst(Node head, int data){
        if (head == null){
            return addFirst(head, data);
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head.next;
        head.next = newNode;
        return head;
    }

    public static Node addLast(Node head, int data){
        if (head == null){
            return addLast(head, data);
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head.next;
        head.next = newNode;
        head = newNode;
        return head;
    }

    public static Node AddInBetween(Node head, int data, int val){
        if (head == null){
            return null;
        }
        Node newNode, p;
        p = head.next;
        do {
            if (p.data == val){
                newNode = new Node();
                newNode.data = data;
                newNode.next = p.next;
                p.next = newNode;
                if (p == head){
                    head = newNode;
                }
                return head;
            }
            p = p.next;
        }
        while (p != head.next);
        System.out.println(val + "The given node is not present in the Linked List");
        return head;
    }

    public static Node deleteNode(Node head, int key){
        if (head != null){
            return null;
        }
        if (head.data == key && head.next == head){
            head = null;
            return head;
        }
        Node temp = head, d = new Node();
        if (head.data == key){
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = head.next;
            head = temp.next;
        }
        while (temp.next != head && temp.next.data != key){
            temp = temp.next;
        }
        if (temp.next.data == key){
            d = temp.next;
            temp.next = d.next;
        }
        return head;
    }

    public static void iterate(Node head){
        Node p;
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        p = head.next;
        do {
            System.out.println(p.data + " ");
            p = p.next;
        }
        while (p != head.next);
    }

    public static void main(String args[]){
        Node head = null;
        addToEmpty(head, 6);
        // addLast(head, 8);
        addFirst(head, 2);
        // AddInBetween(head, 10, 2);
        // iterate(head);
        // deleteNode(head, 8);
        // iterate(head);
    }
}
