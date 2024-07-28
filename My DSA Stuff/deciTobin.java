public class deciTobin {
    public static void deciTobini(int n){
        
        int temp=n;
        int pow=0;
        int res=0;
        while(n>0){
            int rem=n%2;
            res=res+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("the deci of :"+temp+" = "+res);
    }

    public static void main(String args[]){
        deciTobini(15);
    }
}
    