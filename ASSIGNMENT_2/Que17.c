#include <stdio.h>

int main() {
    float quantity[3], rate[3], amount[3];
    float total_amount = 0, discount = 0, net_amount = 0;
    int i;
    

    printf("Enter details for 3 items:\n");
    for(i = 0; i < 3; i++) {
        printf("\nItem %d:\n", i + 1);
        printf("Enter quantity: ");
        scanf("%f", &quantity[i]);
        printf("Enter rate: ");
        scanf("%f", &rate[i]);
       
        amount[i] = quantity[i] * rate[i];
        total_amount += amount[i];
    }
    
    printf("\n\nItem-wise Details:\n");
    printf("------------------------------------------------\n");
    printf("Item\tQuantity\tRate\t\tAmount\n");
    printf("------------------------------------------------\n");
    for(i = 0; i < 3; i++) {
        printf("%d\t%.2f\t\t%.2f\t\t%.2f\n", 
               i + 1, quantity[i], rate[i], amount[i]);
    }
    printf("------------------------------------------------\n");
    printf("Total Sales Amount: Rs. %.2f\n", total_amount);
    
   
    if(total_amount > 5000) {
        discount = total_amount * 0.20;
        printf("Discount Applied: 20%%\n");
    } 
    else if(total_amount >= 2000 && total_amount <= 5000) {
        discount = total_amount * 0.15;
        printf("Discount Applied: 15%%\n");
    } 
    else if(total_amount >= 1000 && total_amount < 2000) {
        discount = total_amount * 0.08;
        printf("Discount Applied: 8%%\n");
    } 
    else {
        discount = 0;
        printf("Discount Applied: 0%%\n");
    }
    
 
    net_amount = total_amount - discount;

    printf("\nBill Summary:\n");
    
    printf("Total Amount:     Rs. %.2f\n", total_amount);
    printf("Discount:        -Rs. %.2f\n", discount);
   
    printf("Net Amount:       Rs. %.2f\n", net_amount);
   
    
    return 0;
}