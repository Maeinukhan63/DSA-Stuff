import java.util.*;
public class Even {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if (a%2==0){
            System.out.println("the given no. is even:"+a);
        }
        else {
            System.out.println("the given no. is odd:"+a);
        }
        sc.close();

    }
}
