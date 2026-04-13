import java.util.Scanner;
public class A3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :");
                int n= sc.nextInt();
                int a[]  = new int[n];
		System.out.println("enter "+ n+"elements");
               for(int i=0;i<n;i++){
                  a[i]= sc.nextInt();

                 }
		
          System.out.println("enter the element to be searched");
          int key =sc.nextInt();
          boolean found =false;
          for(int i=0;i< n;i++){
              if(key==a[i]){
                 found=true;
                 break;
                }
             }
           if(found){
              System.out.println("element found");
            }
          else{
             System.out.println(" found");
           }

     }
}