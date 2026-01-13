#include<stdio.h>
int main(){

    int amt,notes10,notes5,notes1;
    printf("Enter the amount to withdraw: ");
    scanf("%d",&amt); 
    notes10=amt/10;
    notes5=(amt%10)/5;
    notes1=(amt%10)%5;

    printf("Number of 10 rupee notes: %d\n",notes10);
    printf("Number of 5 rupee notes: %d\n",notes5);
    printf("Number of 1 rupee notes: %d\n",notes1);

    }