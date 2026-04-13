import java.util.Scanner;
public class L21{
	public static void main(String[]args){
                int rem,num=0,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
	        int n=sc.nextInt();
	 while(n>0){
               int digit= n%10;
               System.out.println(digit);
               n=n/10;

           }	 

       }
}