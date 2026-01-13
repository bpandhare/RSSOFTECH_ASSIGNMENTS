#include<stdio.h>
int main() {
    int radius;
    float area;
    float circumference;
    printf("enter the radius of cirle:");
    scanf("%d",&radius);
    area=3.14*radius*radius;
    printf("area of circle is:%f",area);
    circumference=2*3.14*radius;
    printf("\n circumference of circle is:%f",circumference);
    
    return 0;
}