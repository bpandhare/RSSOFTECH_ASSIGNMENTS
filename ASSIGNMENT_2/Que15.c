#include <stdio.h>

int main() {
    float basic_salary, tax = 0;
    

    printf("Enter annual basic salary: ");
    scanf("%f", &basic_salary);

    if (basic_salary <= 150000) {
        tax = 0;
    } else if (basic_salary <= 300000) {
                tax = (basic_salary - 150000) * 0.20;
    } else {
        
        tax = 30000 + (basic_salary - 300000) * 0.30;
    }
    

    printf("\nAnnual Basic Salary: Rs. %.2f\n", basic_salary);
    printf("Income Tax: Rs. %.2f\n", tax);
    
    return 0;
}