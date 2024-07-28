public class doublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            next=null;
            prev=null;
        }

    }

    public static Node Head;
    public static Node Tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(Head==null){
            Head=Tail=newNode;
            return ;
        }

        newNode.next=Head;
        Head.prev=newNode;
        Head=newNode;

    }

    public void addLast(){

    }

    public int  removeFirst(){
        if(Head==null){
            System.out.println("DLL is empty");
            return -1;
        }
        if(size==1){
            int val=Head.data;
            size--;
            Head=Tail=null;
            return val;
        }

        int val=Head.data;
        Head=Head.next;
        Head.prev=null;
        size--;
        return val;
    }
    public void print(){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public void reverse(){
        Node curr=Head;
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
       Head=prev;
    }
    public static void main(String args[]){
        doublyLL  dll=new doublyLL();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        // dll.addFirst(5);
        dll.print();

        dll.reverse();
        dll.print();

    }
}
