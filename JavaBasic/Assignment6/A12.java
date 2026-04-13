 
              // SECOND LARGEST AND SMALLEST ELEMENT

import java.util.Scanner;
import java.util.Arrays;
public class A12{
	public static void main(String[]args){
        	Scanner sc = new Scanner(System.in);
                System.out.println("enter the value of n :");
                int n = sc.nextInt();
                int a[] = new int[n];
                System.out.println("enter the elements : ");
                for(int i =0; i< n;i++){
                    a[i] = sc.nextInt();

                  }
                Arrays.sort(a);
                System.out.println("2nd largest : "+ a[n-2]) ;
                System.out.println("2nd smallest :" + a[1]);





}
}