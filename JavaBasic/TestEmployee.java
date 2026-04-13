import java.util.Scanner;
public class TestEmployee{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
 		Employee emp = new Employee();
		System.out.println("enter  employee details :"); 
		System.out.println("ID :");
                int id = sc.nextInt();
                System.out.println("name :"); 
                String name = sc.next();
		System.out.println("Dept :");
                String department = sc.next();
                System.out.println("email :");
                String email = sc.next();
                System.out.println("mobile :");
                String mob = sc.next();
                System.out.println("salary:");
                 float salary = sc.nextFloat();
             emp.setDepartment(department);
             emp.setName(name);
             emp.setId(id);
             emp.setEmail(email);
             emp.setSalary(salary);
             emp.setMob(mob);
             System.out.println("Given data is :");
             System.out.println("\nID :"+emp.getId());

            System.out.println("Name :"+emp.getName());

            System.out.println("Email :"+emp.getEmail());
            System.out.println("mob :"+emp.getMob());
            System.out.println("salary :"+emp.getSalary());


}
}
                
 