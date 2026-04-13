import java.util.Scanner;
public class L28{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
                if(num ==0){
                System.out.println("Zero");
		return ;
               }

            int rev = 0;
 	   
            while(num > 0){
               rev = rev *10 + (num % 10);
               num = num/10;
             }
            while(rev >0){
              int digit = rev %10;
 
            switch(digit){
                case 0: System.out.println("zero"); break; 
                case 1: System.out.println("One"); break;
		case 2: System.out.println("Two"); break;
		case 3: System.out.println("Three"); break;
		case 4: System.out.println("Four"); break;
		case 5: System.out.println("Five"); break;
		case 6: System.out.println("Six"); break;
		case 7: System.out.println("Seven"); break;
		case 8: System.out.println("Eight"); break;
                case 9: System.out.println("Nine"); break;

              }
        rev = rev /10;

}
}
}