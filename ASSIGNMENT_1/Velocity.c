#include<stdio.h>
int main(){
    int initial_velocity,final_velocity,time,acceleration,distance;
    printf("Enter initial velocity (in m/s): ");
    scanf("%d",&initial_velocity);
      printf("Enter acceleration (in m/s^2): ");
    scanf("%d",&acceleration);
      printf("Enter time (in s): ");
    scanf("%d",&time);
    final_velocity=initial_velocity+(acceleration*time);
    printf("The final velocity is: %d m/s\n",final_velocity);
    distance=((initial_velocity*time)+(0.5*acceleration*time*time));
    printf("The distance covered is: %d meters\n",distance);
    


}