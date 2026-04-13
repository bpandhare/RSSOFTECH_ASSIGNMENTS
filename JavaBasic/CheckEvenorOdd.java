import java.util.Scanner;

public class CheckEvenorOdd {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter a number ");
        int num=input.nextInt();
        CheckEvenorOdd obj= new CheckEvenorOdd();
        boolean num1=obj.EvenorOdd(num);
        System.out.println(num1);

    }
    public boolean EvenorOdd(int num){
        if(num%2==0){
            return true;
           }
                return false;
    }
}
