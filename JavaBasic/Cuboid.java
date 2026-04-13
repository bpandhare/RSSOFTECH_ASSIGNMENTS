import java.util.Scanner;
public class Cuboid{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter value of length : ");
		Double l= sc.nextDouble();

		System.out.println("enter value of  breadth : ");
		Double b= sc.nextDouble();
		
		System.out.println("enter value of height : ");
		Double h= sc.nextDouble();

		Double surfaceArea = 2*(l*b +l*h+ b*h);
		Double volume= l*b*h;

		System.out.println("Enter a surface area :"+ surfaceArea );
		System.out.println("Enter a Volume:"+ volume );



}
}