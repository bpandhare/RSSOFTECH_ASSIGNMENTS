import java.util.Scanner;

public class A6 {

    // Function to accept array
    public static void acceptArray(int arr[], int n, Scanner sc) {
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Function to display array
    public static void displayArray(int arr[], int n) {
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to sort array (Bubble Sort)
    public static void sortArray(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        acceptArray(arr, n, sc);

        System.out.println("Before sorting:");
        displayArray(arr, n);

        sortArray(arr, n);

        System.out.println("After sorting:");
        displayArray(arr, n);
    }
}