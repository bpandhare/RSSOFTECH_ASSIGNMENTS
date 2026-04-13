import java.util.Scanner;
public class OP2{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter radius :");
		double r= sc.nextDouble();
		
		System.out.println("\nChoose an option:");
                System.out.println("1.Area of Circle :");
                System.out.println("2. Circumference of circle: ");
                System.out.println("3. Volume of sphere : ");
                System.out.println("Enter a choice : ");
                int ch=sc.nextInt();
       
        switch(ch){
		case 1:
                       double area=Math.PI*r*r;
			System.out.println("Area of Circle:" + area);
			break;

		case 2:
                       double Circumference = 2*Math.PI*r;
			System.out.println("Circumference of Circle:" + Circumference);
			break;
	       case 3:
                       double Volume = (4*Math.PI*r*r*r)/3;
			System.out.println("Volume:" +Volume);
			break;


				
        
		  
}
}



}