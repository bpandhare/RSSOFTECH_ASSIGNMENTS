import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int largest = arr[0];
        int smallest = arr[0];

        // Find largest and smallest
        for(int i = 1; i < n; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }


        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        sc.close();
    }
}