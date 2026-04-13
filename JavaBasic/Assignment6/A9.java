       // COMPARE THE ARRAY

import java.util.Scanner;
public class A9{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
               int a[] = new int[n];
               int b[] = new int[n];
              
       System.out.println("enteer the elemnets array a");
       for(int i=0;i<n;i++ ){
       a[i] = sc.nextInt();
          }
       
       System.out.println("enteer the elemnets in the array b");
       for(int i=0;i<n;i++ ){
         b[i] = sc.nextInt();
       }
        for(int i =0;i <n;i++){
	System.out.print(a[i] + " ");

          }
        System.out.println();
        for(int i =0;i<n;i++){
	System.out.print(b[i] + " ");
       }
      boolean isequal = true;
      for(int i=0;i<n;i++){
          if(a[i]!=b[i]){
            isequal = false;
             break;
            }
        } 
         if(isequal){
           System.out.println("array are equal");
           }
          else{
            System.out.println("Array are not equal"); 
           }
 
}
}
