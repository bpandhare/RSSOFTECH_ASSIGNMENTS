import java.util.Scanner;
public class L32{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int count = 0 ;
		int sum =0;
	  System.out.println("factors are :");
	 for(int i=1 ;i <=num ;i++){
		 if(num % i== 0){
                 count ++;
		sum += i ;
		}
		}
   		
        System.out.println("\n Count of factors ="+ count);
	System.out.println("\n sum of factors ="+ sum);

}
}