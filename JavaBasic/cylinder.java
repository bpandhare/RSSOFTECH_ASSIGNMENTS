import java.util.Scanner;

public class cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        // Calculations
        double surfaceArea = 2 * Math.PI * r * r + 2 * Math.PI * r * h;
        double volume = Math.PI * r * r * h;

        // Output
        System.out.println("Surface Area = " + surfaceArea);
        System.out.println("Volume = " + volume);

        sc.close();
    }
}