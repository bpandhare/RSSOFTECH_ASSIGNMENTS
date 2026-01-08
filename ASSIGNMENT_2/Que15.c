#include <stdio.h>

int main() {
    float basic_salary, tax = 0;
    
    // Input basic salary
    printf("Enter annual basic salary: ");
    scanf("%f", &basic_salary);
    
    // Calculate tax based on rules
    if (basic_salary <= 150000) {
        tax = 0;
    } else if (basic_salary <= 300000) {
        // Tax only on the amount above 1,50,000
        tax = (basic_salary - 150000) * 0.20;
    } else {
        // For salary > 3,00,000:
        // 20% tax on 1,50,000 to 3,00,000 bracket = 30,000
        // 30% tax on amount above 3,00,000
        tax = 30000 + (basic_salary - 300000) * 0.30;
    }
    
    // Display results
    printf("\nAnnual Basic Salary: Rs. %.2f\n", basic_salary);
    printf("Income Tax: Rs. %.2f\n", tax);
    
    return 0;
}