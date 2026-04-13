// package JavaBasic;

import java.util.Scanner;

public class FirstNnumber {
    public static void main(String[] args) {
        int num;
        System.out.println("enter a number:");
        try (Scanner a = new Scanner(System.in)) {
            num = a.nextInt();
        }
        for (int i=0;i<num;i++) {
            System.out.println("num:"+i);
        }
    }
}

