//   Write a program to accept n numbers and store all prime numbers in an array called prime. 
// Display this array.  
      //PRIME NUMBERS
import java.util.Scanner;
public class A14{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n :");
		int n = sc.nextInt();
     		int a[] = new int[n];
 		System.out.println("enter the elements :");
		for(int i=0 ;i<n;i++){
                    a[i]=sc.nextInt();
		}
		String[] prime = new String[n];
      int k;
      for(int i=0 ;i<n;i++){
                    int num = a[i]; 
		     boolean isPrime = false;

                    if(num<=1){
                       isPrime = false;
                      }
                     else{
                        for(int j=2;j<=num/2;j++){
                           if(num%j ==0){
                              isPrime = false;
                              break;
                        }
                   }
                }
             if(isPrime){
               prime[k] = String.valueOf(num);
               k++;
             }
           }
          System.out.println("prime numbers are : ");
          for(int i =0;i<k;i++){
             System.out.print(prime[i] + " ");
}
}
}