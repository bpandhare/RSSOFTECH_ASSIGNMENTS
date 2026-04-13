import java.util.Scanner;
public class RemoveDuplicate{
	public static void main(String[]args){
                String str= "RSSOFTTECS";
                char[] arr = str.toCharArray();
                int n= str.length();
                for(int i =0;i<n-1;i++){
                    for(int j=1;j<i;j++){
                        if(arr[i]==arr[j]){
                            arr[j]=arr[j+1];
                         }                

         }

      }
   }
}