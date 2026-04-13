import java.util.Scanner;
public class L15{
	public static void main(String[]args){
                int sum=0;
		Scanner sc= new Scanner(System.in);
		for(int i=1;i<=10;i++){
			if(i%2==0){
				sum=sum+i;
			}
		
		}
			System.out.println(sum);

}
}