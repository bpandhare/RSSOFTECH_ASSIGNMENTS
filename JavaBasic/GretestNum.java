// package JavaBasic;

import java.util.Scanner;

public class GretestNum {
    public static void main(String[] args) {
        int a,b,c;
        
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("enetr number");
            a=s.nextInt();
            System.out.println("enetr number");
            b=s.nextInt();
            System.out.println("enetr number");
            c=s.nextInt();
        }
        if(a>b&& a>c){ 
            System.out.println("a is largest");

        }
        else if(b>a && b>c ){
            System.out.println("b is largest");

            
        }
        else{
            System.out.println("c is largest");
        }

        
    }
   
}
