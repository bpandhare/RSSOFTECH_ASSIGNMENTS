import java.util.Scanner;
public class Room{
	public static void main(String [] args){
	   Scanner sc=new Scanner(System.in);
 		System.out.println("enter a width and hight of door");
		float dw=sc.nextFloat();
		float dl=sc.nextFloat();


		System.out.println("enter a width and hight of Window");
                float ww=sc.nextFloat();
		float wl=sc.nextFloat();
 
		System.out.println("enter a width and hight of Room");
		float rw=sc.nextFloat();
		float rl=sc.nextFloat();
		float rh=sc.nextFloat();

                float areaWindow=2*(ww*wl);
		float areaDoor=dw*dl;
                float volumeRoom= rl*rw*rh;
                float paintArea= volumeRoom-(areaDoor+areaWindow);
                float roof =rl*rw;
 
               System.out.println("Root : " +roof+"\nPaint area : "+ paintArea);
               

		
}
}