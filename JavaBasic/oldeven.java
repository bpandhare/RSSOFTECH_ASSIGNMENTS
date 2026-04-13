// package JavaBasic;

import java.util.Scanner;

public class oldeven {
    public static void main(String[] args) {
        int n;
        System.out.println("enter any number");
        try (Scanner r = new Scanner(System.in)) {
            n=r.nextInt();
        }
        if(n % 2==0){
System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    
}
