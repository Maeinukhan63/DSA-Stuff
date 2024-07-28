import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class RevQueue {
    public static void revQue(Queue<Integer> q){
        Stack<Integer> st=new Stack<>();
        

        while(!q.isEmpty()){
            st.push(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        revQue(q);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
