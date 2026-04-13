///TABLE OF GIVEN NUMBER


import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        int x;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("enter the number:");
            x=input.nextInt();
        }
        for(int i=1;i<=10;i++){
            System.out.println(i*x);
        }
    }
}
