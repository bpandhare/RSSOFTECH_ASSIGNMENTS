import java.util.Scanner;
public class L19{
	public static void main(String[]args){
                int fact=1;
		Scanner sc= new Scanner(System.in);
                System.out.println("Enter the value of num :");
		int n = sc.nextInt();	
		for(int i=1;i<=n;i++){
                   fact=fact*i;
                   }
           System.out.println("factorial of n is :"+ fact);

}
}