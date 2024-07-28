// Queue using array
// public class QueueB {

//     static class Queue{
//        static int arr[];
//         static int rear;
//         static int size;

//         Queue(int data){
//             arr=new int[data];
//             size=data;
//             rear=-1;
//         }

//         public static boolean isEmpty(){
//             return rear==-1;
//         }

//         public static void add(int data){
//             if(rear==size-1){
//                 System.out.println("queue is full");
//                 return;
//             }
//             rear=rear+1;
//             arr[rear]=data;
//         }

//         public static int remove(){
//             if(rear==-1){
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }

//             int front=arr[0];
//             for(int i=0;i<rear;i++){
//                 arr[i]=arr[i+1];
//             }
//             rear-=1;
//             return front;
//         }

//         public static int peek(){
//             if(rear==-1){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             return arr[0];
//         }

//     }
//     public static void main(String args[]){

//         Queue q=new Queue(5);

//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }


//     }
// }



//Ye wala code circular queue k liye h jisme remove ki TC O(1) hoti h 

// public class QueueB {

//     static class Queue{
//        static int arr[];
//         static int rear;
//         static int size;
//         static int front;

//         Queue(int data){
//             arr=new int[data];
//             size=data;
//             rear=-1;
//             front=-1;
//         }

//         public static boolean isEmpty(){
//             return rear==-1;
//         }

//         public static boolean isFull(){
//             return (rear+1)%size==front;
//         }

//         public static void add(int data){
//             if(isFull()){
//                 System.out.println("queue is full");
//                 return;
//             }

//             if(front==-1){
//                 front=0;
//             }
//             rear=(rear+1)%size;
//             arr[rear]=data;
//         }

//         public static int remove(){
//             if(rear==-1){
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }

//             int result=arr[front];
//             if(rear==front){
//                 rear=front=-1;

//             }else{
//                 front=(front+1)%size;
//             }
//             return result;
//         }

//         public static int peek(){
//             if(rear==-1){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             return arr[front];
//         }

//     }
//     public static void main(String args[]){

//         Queue q=new Queue(3);

//         q.add(1);
//         q.add(2);
//         q.add(3);
//         System.out.println(q.remove());
//         q.add(4);
//         System.out.println(q.remove());
//         q.add(5);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }


//     }
// }


// ye implementation h linked list se   queue ki

// public class QueueB {

//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     static class Queue{
//          static Node head=null;
//          static Node tail=null;

//         public static boolean isEmpty(){
//             return head==null && tail==null;
//         }

//         public static void add(int data){
//             Node newnode=new Node(data);
//             if(head==null ){
//                 head=tail=newnode;
//                 return;
//             }
//             tail.next=newnode;
//             tail=newnode;
//         }

//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }

//            int fdata=head.data;
//            if(head==tail){
//             tail=head=null;
//            }else{
//                head=head.next;
//            }
//            return fdata;
//         }

//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             return head.data;
//         }

//     }
//     public static void main(String args[]){

//         Queue q=new Queue();

//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }


//     }
// }


//ab hm java collection frameworks ki help se queue ko design krenge
import java.util.LinkedList;
import java.util.Queue;

public class QueueB {
    public static void main(String args[]) {

        // Queue q=new Queue(); // This line will cause an error, as you cannot instantiate an interface

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
