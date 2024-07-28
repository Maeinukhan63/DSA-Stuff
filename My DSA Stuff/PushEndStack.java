import java.util.*;
public class PushEndStack {

    public static void pushInLast(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        pushInLast(s, data);
        s.push(top);
    }

    public static void revStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        revStack(s);
        pushInLast(s,top);

    }
    public static void main(String args[]){
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        revStack(s);

        while(!s.isEmpty()){
            System.out.println(s.pop());
            
        }
    }
}
