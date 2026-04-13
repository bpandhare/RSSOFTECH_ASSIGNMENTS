import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        int x,sum=0;
        Scanner input= new Scanner(System.in);
        System.out.print("enter number:");
        x=input.nextInt();

        while(x>0){
            sum=sum+x%10;
            x=x/10;
        }
        System.out.println("sum :"+sum);
    }
}
