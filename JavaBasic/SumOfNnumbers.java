// package JavaBasic;

import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
    
        int n;
        System.out.println("enter a num:");
        try (Scanner s = new Scanner(System.in)) {
            n=s.nextInt();
        }
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            System.out.println("sum is:"+sum);
        }
        System.out.println("sum is:"+sum);

    }
}
