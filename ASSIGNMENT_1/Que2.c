#include<stdio.h>
int main(){
    int height,radius;
      float volume,surface_area;
    printf("enter the height of cylinder:");
    scanf("%d",&height);
    printf("enter the radius of cylinder:");
    scanf("%d",&radius);
  
    volume=3.14*radius*radius*height;
    printf("volume of cylinder is:%f",volume);
    surface_area=2*3.14*radius*radius+2*3.14*radius*height;
    printf("\n surface area of cylinder is :%f",surface_area);
    return 0;
    
}