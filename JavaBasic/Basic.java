// package JavaBasic;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("enter you name");
               String name=s.next();
               System.out.println("my name is "+ name);
               System.out.println("enter your age");
                int age=s.nextInt();
                System.out.println("my age is "+ age);
        }


    }
}
