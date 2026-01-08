#include<stdio.h>
int main(){
    int n;
    printf("enter a number : " );
    scanf("%d",&n);
    if(n%4==0 && n%100!=0 || n%400==0){
        printf("given year is leap year");
    }
    else{
        printf("given year is not leap year");
    }
}