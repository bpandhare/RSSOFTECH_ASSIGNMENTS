
              // REVERSE ARRAY
      
import java.util.Scanner;
public class A7{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n :");
                int n = sc.nextInt();
                int a[]= new int[n];
                System.out.println("elements"+ n + "are");
		for(int i=0;i<n;i++){
                    a[i] = sc.nextInt();

           }

 		for(int i=n-1;i>= 0;i--){
                       System.out.print(a[i] + " ");


                 }


        }
}