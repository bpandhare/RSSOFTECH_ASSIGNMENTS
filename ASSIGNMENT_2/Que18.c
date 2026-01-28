#include <stdio.h>

int main() {
    int days_late;
    float fine = 0;
    
    // Input number of days late
    printf("Enter number of days the book is late: ");
    scanf("%d", &days_late);
    
  
    
    if(days_late <= 0) {
        printf("Book returned on time or early. No fine!\n");
        fine = 0;
    }
    else if(days_late <= 5) {
        fine = days_late * 2.0;  // Rs. 2 per day for first 5 days
    }
    else if(days_late <= 10) {
      
        fine = (5 * 2.0) + ((days_late - 5) * 5.0);
    }
    else {
      
       
        fine = (5 * 2.0) + (5 * 5.0) + ((days_late - 10) * 10.0);
    }
    
    // Display results
    printf("\n=== LIBRARY FINE CALCULATION ===\n");
    printf("Days Late: %d\n", days_late);
    
    if(days_late > 0) {
        printf("Fine Rate Applied:\n");
        
        if(days_late <= 5) {
            printf("  - Rs. 2 per day (for up to 5 days)\n");
        }
        else if(days_late <= 10) {
            printf("  - First 5 days: Rs. 2 per day\n");
            printf("  - Next %d days: Rs. 5 per day\n", days_late - 5);
        }
        else {
            printf("  - First 5 days: Rs. 2 per day\n");
            printf("  - Next 5 days: Rs. 5 per day\n");
            printf("  - Remaining %d days: Rs. 10 per day\n", days_late - 10);
        }
    }
    
    printf("Total Fine: Rs. %.2f\n", fine);
    
    return 0;
}