import java.util.Scanner;
public class Temp{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter a temp:");
		double f = sc.nextDouble();
		
		double c= (5*(f-32))/9;
		double k= c+273.15;
		System.out.println("temp in calcius : " + c);
		System.out.println("temp in kelvin : " + k);
		
}
}