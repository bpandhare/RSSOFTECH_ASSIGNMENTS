#include<stdio.h>
int main(){
    int empID;
    int basicSalary;
    float hra, da, grossSalary;

    printf("Enter Employee ID: ");
    scanf("%d",&empID);
    printf("Enter basic salary :");
    scanf("%d",&basicSalary);
    hra=0.10*basicSalary;
    da=0.30*basicSalary;

    grossSalary=basicSalary+hra+da;

    printf("Employee ID: %d\n",empID);
    printf("Basic Salary: %d\n",basicSalary);
    printf("HRA: %.2f\n",hra);
    printf("DA: %.2f\n",da);
    printf("Gross Salary: %.2f\n",grossSalary);

}