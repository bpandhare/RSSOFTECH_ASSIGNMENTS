import java.util.Scanner;

public class A4 {

    public static int countOccurrences(int arr[], int key) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number to count:");
        int key = sc.nextInt();

        int result = countOccurrences(arr, key);

        System.out.println("Occurrences of " + key + " = " + result);
    }
}	