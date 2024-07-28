public class Armstrong {
    public static void main(String arr[]){
        int n =370;
        int temp=n;
        int sum=0;
        
        while(n>0){
            int ld=n%10;
            sum=sum + ld*ld*ld;
            n=n/10;

        }
        if(sum==temp){
            System.out.println("the no is armstrong ");
        }else{
            System.out.println("the no is nto a  armstrong ");

        }

    }
}
