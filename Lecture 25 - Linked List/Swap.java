public class Swap {
    public static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
        public static Node head;
        public static Node tail;
        public static int size;

        public void addFirst(int data){
            Node newNode = new Node(data);
            if (head == null){
                head = tail = newNode;
            }
            newNode.next = head;
            head = newNode;
        }

        public void addLast(int data){
            Node newNode = new Node(data);
            if (head == null){
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public void swap(int x, int y){
                        
        }

        public static void main(String args[]){
            Swap ll1 = new Swap();
            
        }
    }

}
