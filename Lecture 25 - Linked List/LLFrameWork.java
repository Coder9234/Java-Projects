import java.util.LinkedList;
public class LLFrameWork {
    public static void main(String args[]){
        // create - objects, int, float, boolean -> Integer, Float, Character Class
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        // 0->1->2
        System.out.println(ll);
        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
