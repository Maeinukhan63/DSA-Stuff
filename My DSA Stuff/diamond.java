public class diamond {
    public static void diamond2(int n){
        for(int i=1;i<=n;i++){
            for(int s=1;s<=(n-i);s++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
            for(int i=n;i>=1;i--){
            for(int s=1;s<=(n-i);s++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        diamond2(5);
    }

}
