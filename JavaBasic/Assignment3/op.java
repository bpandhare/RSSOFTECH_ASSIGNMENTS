import java.util.Scanner;
public class op{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first number :");
		int x= sc.nextInt();
		System.out.println("enter a second number :");
		int y= sc.nextInt();
		System.out.println("Enter a type of operation (+,-,*,/)");
        System.out.println("\nChoose an option:");
        System.out.println("1. Equality");
        System.out.println("2. Less Than");
        System.out.println("3. Quotient and Remainder");
        System.out.println("4. Range");
        System.out.println("5. Swap");
		  
		switch(op){
			case 1:
				if(x==y)
				  System.out.println("x is equal to y");
				
				else
                                  System.out.println("x is not equal to y");
                               }
				break; 

			case 2:
				if(x < y)
				  System.out.println("x is less than y");
				else
			          System.out.println("x is less than y");
				  break;

			case 3:
                             if (y != 0) {
                    		System.out.println("Quotient = " + (x / y));
                   		System.out.println("Remainder = " + (x % y));
               		     } else {
                               System.out.println("Error! Division by zero");
               		     }
                            break;

          		case 4:
                              System.out.print("Enter a number to check range: ");
                              int num = sc.nextInt();

                              if (num >= x && num <= y)
                               System.out.println("Number lies between x and y (inclusive)");
                             else
                               System.out.println("Number is outside the range");
                             break; 
				
}
}
}