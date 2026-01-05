#include<stdio.h>
#include<ctype.h>


int main(){
    char ch;
    printf("Enter an alphabet: ");
    scanf("%c",&ch);
    ch=tolower(ch);
    switch(ch){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
       
            printf("%c is a vowel.",ch);
            break;
        default:
            printf("%c is not a vowel.",ch);
    }
    return 0;
}