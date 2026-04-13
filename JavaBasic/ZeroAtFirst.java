import java.util.Scanner;
public class ZeroAtFirst{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
                int a[] ={4,5,0,2,0,3,0,1};
                int n =a.length;
                int j=0;
             for (int i = 0; i < n; i++) {
                 if(a[i]== 0){
                 int temp = a[i];
                 a[i] =a[j];
                 a[j] = temp;
                 j++;
                 }
              }
       for (int i = 0; i < n; i++) {
            System.out.print(a[i]+ " ");
           }
 }

}