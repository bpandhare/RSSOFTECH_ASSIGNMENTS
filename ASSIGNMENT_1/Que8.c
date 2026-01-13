#include<stdio.h>
int main(){
    int empID;
    int basicSalary;
    float hr, da, grossSalary;

    printf("Enter Employee ID: ");
    scanf("%d",&empID);
    printf("Enter basic salary :");
    scanf("%d",&basicSalary);
    hr=0.10*basicSalary;
    da=0.30*basicSalary;
   double professional_tax=0.05*basicSalary;

    grossSalary=basicSalary+hr+da;

    printf("Employee ID: %d\n",empID);
    printf("Basic Salary: %d\n",basicSalary);
    printf("HRA: %f\n",hr);
    printf("DA: %f\n",da);
    printf("Gross Salary: %f\n",grossSalary);

}