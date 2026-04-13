
import java.util.Scanner;

public class A5 {

    public static void printArray(int arr[]) {
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void calculateAverage(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("Average = " + avg);
    }

    public static void findMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element = " + max);
    }

    public static void searchElement(int arr[], int key) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }

    public static void countOccurence(int arr[], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println("Occurrence = " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a choice:");
        System.out.println("1. Print Array");
        System.out.println("2. Calculate Average");
        System.out.println("3. Find Max");
        System.out.println("4. Search Element");
        System.out.println("5. Count Occurrence");
        System.out.println("6. Exit");

        int ch = sc.nextInt();

        switch (ch) {

            case 1:
                printArray(arr);
                break;

            case 2:
                calculateAverage(arr);
                break;

            case 3:
                findMax(arr);
                break;

            case 4:
                System.out.println("Enter element to search:");
                int key1 = sc.nextInt();
                searchElement(arr, key1);
                break;

            case 5:
                System.out.println("Enter element to count:");
                int key2 = sc.nextInt();
                countOccurence(arr, key2);
                break;

            case 6:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}