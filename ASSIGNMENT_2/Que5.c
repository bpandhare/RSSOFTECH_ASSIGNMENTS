#include<stdio.h>
int main(){
    int n;
    printf("enter a number :");
    scanf("%d",&n);
    if(n%5==0 && n%7==0){
        printf("given number is divisible by both 5 and 7");

    }
    else{
        printf("given number is not divisible by both 5 and 7");
    }
}