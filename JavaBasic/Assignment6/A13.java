      	// ODD AND EVEN ELEMENTS FROM AN ARRAY

import java.util.Scanner;
public class A13{
	public static void main(String[]args){
               Scanner sc = new Scanner(System.in);
               System.out.println("enter the value of n :");
              int n = sc.nextInt();
              int a[] = new int[n];
              int b[]= new int[n];
              int c[]= new int[n];
              System.out.println("enter the elements :");
              for(int i =0;i< n;i++){
                  a[i]= sc.nextInt();
                 }            
               for(int i=0;i<n;i++){
                     if(a[i]%2==0){
                          b[i] = a[i];
                     }
                     else{
                        c[i] =a[i];
                      } 
                   }
              
                System.out.println("even elements are: ");
               for(int i= 0;i < n;i++){
                  System.out.print(b[i]+ " ");
                   }
               System.out.println();
               System.out.println("odd elements are :");
               for(int i= 0;i < n;i++){
                  System.out.print(c[i]+ " ");

                 }

 
   }
}
