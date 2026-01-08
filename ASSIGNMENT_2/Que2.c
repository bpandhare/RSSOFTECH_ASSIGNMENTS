#include<stdio.h>
int main(){
    int n;
    printf("enter a number : " );
    scanf("%d",&n);
    if(n>0){
        printf("given number is positive");
    }
    else if(n==0){
        printf("given number is zero");
    }
    else{
        printf("given number is negative");
    }

}