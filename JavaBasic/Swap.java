// package JavaBasic;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number a : ");
        int a=input.nextInt();
        System.out.println("enter number b :");
        int b=input.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("swapping done .....");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        
        
    }
}
