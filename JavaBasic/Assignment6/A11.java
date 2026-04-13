      //LARGEST TWO NUMBERS FROM ARRAY
import java.util.Scanner;
public class A11{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n :");
		int n = sc.nextInt();
               int a[] = new int[n]; 
		System.out.println("enter the elements :");
                for(int i =0;i< n;i++){
                  a[i] = sc.nextInt();
                   }
                  int max1 = Integer.MIN_VALUE;
                  int max2 = Integer.MIN_VALUE;

                 for(int i= 0 ;i< n;i++){
                   if(a[i]>max1){
                     max2 =max1;
                     max1= a[i];
                   }
                   else if(a[i] > max2 && a[i]!= max1){
                     max2= a[i];
                 }
                }

              System.out.println("largest :" + max1);        
               System.out.println("second largest :" + max2);    
    

   }
}