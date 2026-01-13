#include<stdio.h>
int main(){
    char ch,prev_ch,next_ch;
    printf("Enter a character: ");
    scanf("%c",&ch);
    prev_ch=ch-1;
    next_ch=ch+1;
    printf("Previous character: %c\n",prev_ch);
    printf("Next character: %c\n",next_ch);

    return 0;
}