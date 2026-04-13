import java.util.Scanner;
public class TestArray{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Emter the value of n");
		int n = sc.nextInt();


		int a[]= new int[n];
		System.out.println("Enter "+n+" elements :");
		for(int i=0;i<n;i++)
                a[i]= sc.nextInt();
                System.out.println("given elements are :");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);






}
}