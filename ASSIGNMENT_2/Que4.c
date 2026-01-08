#include<stdio.h>
int main(){
    int CP,SP;
    printf("enter cost Price :");
    scanf("%d",&CP);

    printf("enter Selling Price :");
    scanf("%d",&SP);

    if(SP>CP)
    {
        printf("profit:%d",(SP-CP));
    }
    else{
        printf("Loss:%d",(CP-SP));
    }
    
}