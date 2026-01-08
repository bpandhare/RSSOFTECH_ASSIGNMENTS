#include<stdio.h>
int main(){
    int n;
    printf("enter a number : " );
    scanf("%d",&n);
    if(n%5==0 ||n%7==0){
        printf("given number is divisible by 5 or 7");
    }
    else{
        printf("given number is not divisible by 5 or 7");
    }
}