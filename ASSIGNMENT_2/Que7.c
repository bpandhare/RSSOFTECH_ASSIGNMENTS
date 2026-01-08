#include<stdio.h>
int main(){
    int a,b,c;
    printf("enter three numbers :");
    scanf("%d %d %d",&a,&b,&c);

    if(a>b &&a<c  || a<b && a>c){
        printf("%d  is the middle number",a);
    }


}