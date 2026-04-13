import java.util.Scanner;
public class Swap1{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value  of a :");
		int a= sc.nextInt();
		
		System.out.println("Enter a value  of b :");
		int b= sc.nextInt();

		b=a+b;
		a=b-a;
		b=b-a;

	System.out.println("Enter a value  of a :"+a);
        System.out.println("Enter a value  of b :"+b);

	


}
}