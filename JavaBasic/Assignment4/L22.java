import java.util.Scanner;
public class L22{
	public static void main(String[]args){
		int cnt=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
	while(n > 0){
	     n=n/10 ;
             cnt++;
          }
        System.out.println("number of digits : " + cnt );



}
}