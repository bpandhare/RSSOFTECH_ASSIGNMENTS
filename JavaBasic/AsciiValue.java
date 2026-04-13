// package JavaBasic;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        
    
    char ch;
    System.out.print("enter character:");
    try (Scanner s = new Scanner(System.in)) {
        ch= s.next().charAt(0);
    }
    int a=ch;
    System.out.print("ascii value"+a);

}
}