import java.util.Scanner;
public class TestCollege{
	public static void main(String[]args){
               Scanner sc = new Scanner(System.in);
               College clg = new College();
               System.out.println("Enter college details :");
	       System.out.println("enter the college Id :");
               int collegeId = sc.nextInt();
               System.out.println("enter the name :");
               String name = sc.next();
               System.out.println("enter the Location :");
               String location = sc.next();
               System.out.println("enter the numberofDepartments :");
               int numberOfDepartments = sc.nextInt();
               System.out.println("enter affiliation :");
               String affiliation = sc.next();

               clg.setCollegeId(collegeId);
               clg.setName(name);
               clg.setLocation(location);
               clg.setNumberOfDepartments(numberOfDepartments);
               clg.setAffiliation(affiliation);
         

             System.out.println("given data :");
             System.out.println("\n college ID: "+clg.getCollegeId());
             System.out.println("\n name:  "+clg.getName());
             System.out.println("\n Location: "+clg.getLocation());
             System.out.println("\n numberofDepartments: "+clg.getNumberOfDepartments());
             System.out.println("\n college ID: "+clg.getAffiliation());
}
}