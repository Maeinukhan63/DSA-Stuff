import java.util.Scanner;
public class Circle2{
public static void main(String args[]){

    Scanner mk = new Scanner(System.in);
    mk.close();
    float side ;
    System.out.println("enter the side");
    side = mk.nextFloat();
    float area = side*side;
    System.out.println(area);
} 
}
