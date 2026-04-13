// package JavaBasic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("welcome to our calculator ");
        System.out.println("please enter number");
        int firstnum= input.nextInt();
        System.out.println(" Now,enter 2nd number");
        int seconndnum=input.nextInt();
        int sum=firstnum+seconndnum;
        System.out.println("sum ="+sum);

    }
}
