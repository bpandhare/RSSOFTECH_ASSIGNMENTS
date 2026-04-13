// package JavaBasic;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter two numbers:");
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("enter 1stnumber:");
            a=s.nextInt();
            System.out.println("enter 2nd number:");
            b=s.nextInt();
        }
        System.out.println("a+b:"+(a+b));

    }
}
