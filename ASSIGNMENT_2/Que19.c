#include <stdio.h>
#include <ctype.h>  

int main() {
    char ch;
    
    printf("Enter a character: ");
    scanf("%c", &ch);
    
    printf("\nOriginal character: %c\n", ch);
    
    if(ch >= 'a' && ch <= 'z') {
       
        printf("Uppercase: %c\n", ch - 32);  
        // printf("Uppercase: %c\n", toupper(ch)); 
    }
    else if(ch >= 'A' && ch <= 'Z') {
        // Convert uppercase to lowercase
        printf("Lowercase: %c\n", ch + 32);  
        // printf("Lowercase: %c\n", tolower(ch));  
    }
    else {
        printf("Not an alphabet character. No conversion.\n");
    }
    
    return 0;
}