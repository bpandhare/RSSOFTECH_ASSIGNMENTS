import java.util.Scanner;
public class A1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n= sc.nextInt();
		int a[] =new int[n];
		int sum=0;
        	System.out.println("Enter " + n + " numbers :");
              for(int i=0;i< n;i++){ 
	         a[i]=sc.nextInt(); 
	         sum = sum+a[i];          
               }
             double average =(double) sum /n;
	     System.out.println("Sum = "+ sum);
	       System.out.println("Average = "+ average);






}

}