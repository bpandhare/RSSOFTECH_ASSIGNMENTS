// package JavaBasic;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int n,p,result=1;
        System.out.println("enter a number");
        try (Scanner s = new Scanner(System.in)) {
            n = s.nextInt();
            System.out.println("enter a number");
            p= s.nextInt();
        }
        for(int i=1;i<=p;i++){
            result=n*result;
        }
     System.out.println("result:" + result);
    }
}
