#include<stdio.h>
int main(){
    float celsius, fahrenheit,kelvin;
   
    printf("Enter temperature in Fahrenheit: ");
    scanf("%f", &fahrenheit);
    celsius = (fahrenheit - 32) * 5/9;
    printf(" temperature in celcius: %f\n", celsius);
    kelvin = celsius + 273.15;
    printf("temperature in kelvin is: %f\n", kelvin);
     
    return 0;
}