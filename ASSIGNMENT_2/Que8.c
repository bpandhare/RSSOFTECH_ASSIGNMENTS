#include<stdio.h>
int main(){
    char ch;
    printf("Enter a character: ");
    scanf("%c",&ch);
    switch (ch)
    {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        printf("The character is a vowel.");
        break;
    default:
        printf("The character is a consonant.");
        break;
    }
   
}