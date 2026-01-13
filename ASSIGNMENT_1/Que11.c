#include <stdio.h>

int main() {
    float l, b, h;         // room dimensions
    float dl, db;          // door dimensions
    float wl, wb;          // window dimensions
    
    printf("Enter room (L B H): ");
    scanf("%f %f %f", &l, &b, &h);
    
    printf("Enter door (L B): ");
    scanf("%f %f", &dl, &db);
    
    printf("Enter window (L B): ");
    scanf("%f %f", &wl, &wb);
    
    // Calculations
    float walls = 2 * (l + b) * h;       // total wall area
    float door = dl * db;                // door area
    float windows = 2 * (wl * wb);       // 2 windows
    float roof = l * b;                  // roof/ceiling area
    
    float paint_area = walls - door - windows;
    
    printf("\nArea to paint: %.2f sq.m\n", paint_area);
    printf("Area to whitewash: %.2f sq.m\n", roof);
    
    return 0;
}