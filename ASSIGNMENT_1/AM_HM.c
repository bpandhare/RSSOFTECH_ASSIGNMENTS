#include<stdio.h>
int main(){
    int a,b;
    printf("Enter two integers: ");
    scanf("%d %d",&a,&b);
    float AM,HM;
    AM=(a+b)/2.0;
    HM=(2.0*a*b)/(a+b);
    printf("Arithmetic Mean of %d and %d is: %.2f\n",a,b,AM);
    printf("Harmonic Mean of %d and %d is: %.2f\n   ",a,b,HM);
    return 0;       
    
}