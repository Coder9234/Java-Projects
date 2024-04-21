import java.util.*;

public class questions {
    static class Node{
        int data;
        Node left, right;
        int hd;

        Node (int data){
            this.data = data;
            this.left = left;
            this.right = right;
            this.hd = 0;
        }
    }

    public static ArrayList<Integer> bottomView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null){
            return ans;
        }
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Node> q = new LinkedList<Node>();
        root.hd = 0;
        q.add(root);
        while (!q.isEmpty()){
            Node temp = q.remove();
            int hd = temp.hd;
            map.put(hd, temp.data);
            if (temp.left != null){
                temp.left.hd = hd - 1;
                q.add(temp.left);
            }
            if (temp.right != null){
                temp.right.hd = hd + 1;
                q.add(temp.right);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    public static void main(String args[]){
        /*
                20
               /  \
              8    22
             / \    \
            5   3    25
               / \
              10  14
         */
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right.right = new Node(25);
        System.out.println("Bottom view: " + bottomView(root));
    }
}
