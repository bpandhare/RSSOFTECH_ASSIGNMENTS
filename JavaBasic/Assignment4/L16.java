import java.util.Scanner;
public class L16{
	public static void main(String[]args){
		int sum=0;
		Scanner sc = new Scanner(System.in);
		for(int i=100;i<=200;i++){
			if(i%2==0){
			   sum  = sum +i;
				
			  }		
		}
	  System.out.println("sum of even numbersfrom 100 to 200 :" + sum);


       }
}