import java.util.Scanner;
public class no_Vowle 
    {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.next();
		int count =0;
		for(int i=0;i<str.length();i++ ){
		    if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
		        count++;
		    }else if(str.charAt(i)=='A' ||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
		        count++;
		    }
		}
		System.out.println(count);
		sc.close();
	}
}
