import java.util.Scanner;
public class TestBank{
	public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		System.out.println("enter the bank details :");
		System.out.println("Bank Id:");
		int bankId = sc.nextInt();
		System.out.println("name :");
		String name = sc.next();
		System.out.println("branch :");
		String branch= sc.next();
		System.out.println("Ifsc Code :");
		String ifscCode = sc.next();
                System.out.println("Total Assets :");
		String totalAssets= sc.next();
              
                 b.setBankId(bankId);
                 b.setName(name);
                 b.setBranch(branch);
                 b.setIfscCode(ifscCode);
                 b.setTotalAssets(totalAssets);

		System.out.println("Given data is :");
		System.out.println("\n bank id :"+b.getbankId());
		System.out.println("name :" +b.getName());
		System.out.println("branch :"+b.getBranch());
		System.out.println("IfscCode :"+b.getIfscCode());
		System.out.println("total Assets:" +b.getTotalAssets());
		}
}
