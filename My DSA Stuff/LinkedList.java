public class LinkedList {
    public static class Node{
        int data;
         Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
       public static Node Head;
       public static Node Tail;
       public static int size;
    
        public void addFirst(int data){
            Node newnode=new Node(data);
            size++;
            if(Head==null){
                Head=Tail=newnode;
                return;
            }
            
            newnode.next=Head;
            
            Head=newnode;
            
        }
        public void addLast(int data){
            Node newnode=new Node(data);
            size++;
            if(Head==null){
                Head=Tail=newnode;
                return;
            }
            Tail.next=newnode;

            Tail=newnode;
        }
        
        public void print(){
            Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
        }

        public void addMiddle(int idx,int data){
            Node newnode=new Node(data);
            size++;
            Node temp=Head;
            int i=0;
            while(i < idx-1){
                temp=temp.next;
                i++;
            }
            //i==idx-1 them add a newnode to linked list
            newnode.next=temp.next;
            temp.next=newnode; 
        }

        public int  removeFirst(){
            if(size==0){
                System.out.println("LL is empty");
                return Integer.MAX_VALUE;
            }
            if(size==1){
                int val=Head.data;
                Head=Tail=null;
                size=0;
                return val;
            }
            int val=Head.data;
            Head=Head.next;
            size--;
            return val;
        }

        public int removeLast(){
            if(size==0){
                System.out.print("LL is empty");
                return Integer.MIN_VALUE;
            } 
            if(size==1){
                int val=Head.data;
                Head=Tail=null;
                return val;
            }

            Node temp=Head;
           for(int i=0;i<size-2;i++){
            temp=temp.next;
           }
           int val =temp.next.data;
           temp.next=null;
           Tail=temp;
           size--;
           return val;
        }

        public int Search(int key){
            Node temp=Head;
            int i=0;
            while(temp !=null){
                if(temp.data==key){
                    return i;
                }
                temp=temp.next;

                i++;
            }
            return -1;
        }


        public int helper(Node Head,int key){
            if(Head==null){
                return -1;
            }
            if(Head.data==key){
                return 0;
            }
            int idx=helper(Head.next,key);

            if(idx==-1){
                return -1;
            }
            return idx+1;
        }
        public int recSearch(int key){
            return helper(Head,key);
        }


        public void reverseLL(){
            Node prev=null;
            Node curr=Tail=Head;
            Node next;

            while(curr != null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }

            Head=prev;
        }

        public void removeNthNode(int n){
            int sz=0;
            Node tempm=Head;

            //to find size of ll
            while(tempm != null){
                tempm=tempm.next;
                sz++;
            }

            if(sz==n){
                Head=Head.next; //removefirst operation
            }


            Node prev=Head;
            int i=1;
            while(i < sz-n){
                prev=prev.next;
                i++;
            }

            prev.next=prev.next.next;
            return;

        }

        //mid node find krne ka method (slow fast technique)
        public Node midNode(Node Head){
            Node slow=Head;
            Node fast=Head;
            while(fast !=null && fast.next !=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }

        public boolean isPalindrome(){
            if(Head==null || Head.next==null){
                return true;
            }

            //step 1; to find mid node
            Node midNod=midNode(Head);
           
            //step 2; to reverse 2nd half
            Node curr=midNod;
            Node prev=null;
            Node next;
            while(curr != null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }

            Node rightHead=prev;
            Node leftHead=Head;

            //Step 3  compare 1st and 2nd half 

            while(rightHead != null){
                if(leftHead.data != rightHead.data){
                    return false;
                }
                rightHead=rightHead.next;
                leftHead=leftHead.next;

            }
            return true;
        }

        public static boolean isCycle(){

            Node slow=Head;
            Node fast=Head;
            while (fast!=null && fast.next!=null) {
                slow=slow.next;
                fast=fast.next.next;
                if(slow == fast){
                    return true;
                }
            }
            return false;
        }

        public static void isremoveCycle(){
            Node slow =Head;
            Node fast=Head;
            boolean cycle=false;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    cycle=true;
                    break;
                }
            }
            if(cycle==false){
                return ;
            }

            slow=Head;
            Node prev=null;
            while(slow != fast){
                prev=fast;
                slow=slow.next;
                fast=fast.next;
            }

            prev.next=null;

        }
//yaha se merge sort on ll ka code start h 
        public Node getMid(Node Head){
            Node slow=Head;
            Node fast=Head.next;

            while(fast !=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;

            }
            return slow;
        }
        public Node merge(Node Head1,Node Head2){
            Node mergeLL=new Node(-1);
            Node temp=mergeLL;

            while(Head1 !=null && Head2 !=null){
                if(Head1.data<=Head2.data){
                    temp.next=Head1;
                    Head1=Head1.next;
                    temp=temp.next;
                }
                else{
                    temp.next=Head2;
                    Head2=Head2.next;
                    temp=temp.next;
                }
            }

            while(Head1!=null){
                temp.next=Head1;
                Head1=Head1.next;
                temp=temp.next;
            }
            while(Head2!=null){
                temp.next=Head2;
                Head2=Head2.next;
                temp=temp.next;
            }

            return mergeLL.next;
        }
        public Node mergeSort(Node Head){
            if(Head==null || Head.next==null){
                return Head;
            }

            Node mid=getMid(Head);

            Node RightNode=mid.next;
            mid.next=null;
            Node left=mergeSort(Head);
            Node right=mergeSort(RightNode); 


            return merge(left,right);
        }
        //or yaha khtm h mergesort ka code

        //yaha se zigzag ll ka code start ka code start h

        public void zigzag(){
            //isme total 3 steps hote h 
            //1--find mid
            //2--reverse 2nd half
            //3--alternate merge both left and right
//1st
            Node slow=Head;
            Node fast=Head.next;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }

            Node mid=slow;
//2nd            
            Node curr=mid.next;
            mid.next=null;

            Node prev=null;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
//3rd
            Node left=Head;
            Node right=prev;
            Node nextL,nextR;
            while(left!=null && right!=null){
                nextL=left.next;
                left.next=right;
                nextR=right.next;
                right.next=nextL;

                left=nextL;
                right=nextR;
            }
            
        }
	public static void main(String[] args) {
        //ye cycle check krnr ka code h 
        // Head=new Node(1);
        // Node temp=new Node(2);
        // Head.next=temp;
        // Head.next.next=new Node(3);
        // Head.next.next.next=temp;

        // System.out.println(isCycle());
        // isremoveCycle();
        // System.out.println(isCycle());

		// LinkedList ln=new LinkedList();
		// ln.addFirst(2);
		// ln.addFirst(1);
        // ln.addLast(2);
        // ln.addLast(1);
       
        
        // ln.print();
        // System.out.println(ln.isPalindrome());


        //yaha se mergesort k liyr kiya h 
        

        // LinkedList ll=new LinkedList();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        // ll.print();
        // ll.Head=ll.mergeSort(ll.Head);
        // ll.print();


        //yaha se zigzag k liye krta hu 
        LinkedList ll=new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.print();
        ll.zigzag();
        ll.print();
	}
}
