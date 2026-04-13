import java.util.Scanner;

public class TestEmployee2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        Employee emp[] = new Employee[n]; // array
        for (int i = 0; i < emp.length; i++) {
            System.out.println("\nEnter details of employee " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Department: ");
            String department = sc.next();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Mobile: ");
            String mob = sc.next();

            System.out.print("Salary: ");
            float salary = sc.nextFloat();
            emp[i] = new Employee(id, name, mob, email, department, salary);
        }
        System.out.println("\nGiven Data:");
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }
    }
}