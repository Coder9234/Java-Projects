// Reverse a Stack
import java.util.*;
public class ReverseaStack {
    public static void pushAtBottom(Stack<Integer>s, int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Integer>s){
        if (s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    public static void print(Stack<Integer>s){
        
    }
    public static void main(String args[]){
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        print(s);
        reverse(s);
        print(s);
    }
}