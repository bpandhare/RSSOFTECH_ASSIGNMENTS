#include<stdio.h>
int main(){
    int a,b;
    printf("Enter two integers: ");
    scanf("%d %d",&a,&b);
    printf("Before swapping: a = %d, b = %d\n",a,b);

    // Using Temporary variable to swap
    // int temp = a;
    // a = b;
    // b = temp;
    // printf("After swapping: a = %d, b = %d\n",a,b);
    
    //  Using + and – operator 
    
    // a = a + b;
    // b = a - b;
    // a = a - b;
    // printf("After swapping without temp variable: a = %d, b = %d\n",a,b);

//  Using  / and * operator
a=a*b;
b=a/b;
a=a/b;
printf("After swapping using * and / : a = %d, b = %d\n",a,b);

    return 0;
}