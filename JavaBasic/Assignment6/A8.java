  // Copy array
 
import java.util.Scanner;
public class A8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n :");
                int n= sc.nextInt();
		int a[] = new int[n];
                int b[] = new int[n];
          System.out.println("enter the elements :");
	  for(int i=0;i< n;i++){
		a[i]= sc.nextInt();
            }
          System.out.println("elements of  array a :");
          for(int i=0;i< n;i++){
		System.out.print(a[i]+ " " );
            }
          System.out.println();

          for(int i=0;i<n;i++){
                b[i]=a[i];
            }
             System.out.println("elements are copied from array a :");

             for(int i=0;i<n;i++){
             System.out.print( b[i]+ " ");

              }
}

}