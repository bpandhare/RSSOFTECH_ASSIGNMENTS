#include<stdio.h>
#include<ctype.h>


int main() {
    
    char ch;
     printf("Enter a character: ");
    scanf("%c", &ch);
    // if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
    //     printf("%c is an alphabet character.\n", ch);
    // } else {
    //     printf("%c is not an alphabet character.\n", ch);
    // }


    if(isalpha(ch)) {
        printf("It is an alphabet character.\n",ch);
    } else if(isdigit(ch)) {
        printf("It is a digit character.\n",ch);
    }
    else if(ispunct(ch)) {
        printf("It is a punctuation character.\n",ch);
    }
    else {
        printf("It is a special character.\n",ch);
    }
    return 0;
}