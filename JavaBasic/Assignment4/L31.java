import java.util.Scanner;
public class L31{
	public static void main(String[]args){
		int cnt =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum =0;
	  for(int i=1;i<= num ;i++){
		if(num % i==0){
			sum = sum +i;
			cnt++;
                 }

}
     System.out.println("count of factors ="+cnt);
}
}



