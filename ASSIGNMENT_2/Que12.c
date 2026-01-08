#include<stdio.h>
int main(){
    int x,y,z;
    printf("enter three numbers :");
    scanf("%d %d %d",&x,&y,&z);

//  checking for largest number 1st logic
    if(x>=y && x>=z){//
        printf("%d is the largest number",x);
    }
    else if(y>=x && y>=z){
        printf("%d is the largest number",y);
    }
    else{
        printf("%d is the largest number",z);
    }


//  checking for largest number 2nd logic


    int largest=x;
    if(y>largest){

        largest=y;
    }
    if(z>largest){
        largest=z;
    }
    printf("%d is the largest number",largest);
    return 0;
}