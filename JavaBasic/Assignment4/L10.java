import java.util.Scanner;
public class L10{
	public static void main(String[]args){
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  the value of x :");
		int x =sc.nextInt();
		System.out.println("enter  the value of y :");
		int y =sc.nextInt();
	  for(int i=x;i<=y;i++){
		sum= sum+i;	
	
}
	  System.out.println("Sum is :" +sum );
}
}