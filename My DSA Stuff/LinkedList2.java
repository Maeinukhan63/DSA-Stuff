import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String args[]){
        LinkedList<Integer> ll=new LinkedList<>();
        
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(2);
        ll.addLast(3);

        System.out.print(ll);
    }
}
