// package JavaBasic;

import java.util.Scanner;

public class Average {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Taking input for the number of elements
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();

            // Array to store numbers
            double[] numbers = new double[n];
            double sum = 0;

            // Taking input for the numbers
            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextDouble();
                sum += numbers[i];
            }

            // Calculating the average
            double average = sum / n;

            // Displaying the result
            System.out.println("The average is: " + average);
        }

       
        
    }
}
