#include<stdio.h>
int main(){
    int length, breadth, height, volume, surface_area;
    printf("Enter length of the cuboid (in meters): ");
    scanf("%d", &length);
    printf("Enter breadth of the cuboid (in meters): ");
    scanf("%d", &breadth);
    printf("Enter height of the cuboid (in meters): ");
    scanf("%d", &height);
    volume = length * breadth * height;
    surface_area = 2 * (length * breadth + breadth * height + height * length);
    printf("The volume of the cuboid is: %d cubic meters\n", volume);   
    printf("The surface area of the cuboid is: %d square meters\n", surface_area);
    return 0;
}