import java.util.Scanner;
public class Mean{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of a :");
	Double a= sc.nextDouble();
       	System.out.println("Enter the value of b :");
	Double b= sc.nextDouble();

	Double AM= (a+b)/2;
	Double HM= (a*b)/(a+b);
	System.out.println("AM :"+ AM);
	System.out.println("HM :"+ HM);



}	
}