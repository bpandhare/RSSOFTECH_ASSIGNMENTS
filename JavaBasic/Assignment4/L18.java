import java.util.Scanner;
public class L18{
	public static void main(String[] args){
		int sum = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of x :");
		int x= sc.nextInt();
		System.out.println("enter the value of y :");
		int y= sc.nextInt();

	for(int i=x;i<=y;i++){	
		if(i%2==0){
			sum=sum+i;

                }

       }
        System.out.println("sum of even numbers between x and y :"+ sum);

     }
}