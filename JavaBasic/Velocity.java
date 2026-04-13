import java.util.Scanner;
public class Velocity{
	public static void main(String []args){
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a velocity :");
	Double u=sc.nextDouble();

	System.out.println("enter a acceleration :");
	Double a=sc.nextDouble();

	System.out.println("enter a time :");
	Double t=sc.nextDouble();
	
	double v = u +a*t;
	double s = u +a*t*t;
	System.out.println("final velocity :"+ v);
	System.out.println("distance :"+ s);
	

}
}