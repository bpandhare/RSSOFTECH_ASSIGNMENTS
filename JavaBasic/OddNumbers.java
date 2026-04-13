// package JavaBasic;
// SUM OF ODD NUMBERS
import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        int n;
        System.out.println("enter num:");
        try (Scanner s = new Scanner(System.in)) {
            n=s.nextInt();
        }
        int sum=0;
        for( int i=0;i<n;i++){
            if(i%2!=0){
                
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println("sum of n of numbers : "+sum);
    }
}
