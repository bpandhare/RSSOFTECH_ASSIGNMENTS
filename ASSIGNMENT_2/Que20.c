#include <stdio.h>

int main() {
    char ch;
    
    printf("Enter a character: ");
    scanf("%c", &ch);
    
    printf("\nCharacter entered: %c\n", ch);
    printf("ASCII value: %d\n\n", ch);
    
    // Check using ASCII values
    if(ch >= 48 && ch <= 57) {  // ASCII 48-57 are digits 0-9
        printf("The character '%c' is a DIGIT.\n", ch);
    }
    else if(ch >= 65 && ch <= 90) {  // ASCII 65-90 are uppercase A-Z
        printf("The character '%c' is an UPPERCASE alphabet.\n", ch);
    }
    else if(ch >= 97 && ch <= 122) {  // ASCII 97-122 are lowercase a-z
        printf("The character '%c' is a LOWERCASE alphabet.\n", ch);
    }
    else {
        printf("The character '%c' is neither a digit nor an alphabet.\n", ch);
        printf("It is a special character.\n");
    }
    
    return 0;
}