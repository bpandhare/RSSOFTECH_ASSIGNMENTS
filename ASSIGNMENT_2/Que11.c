#include<stdio.h>
int main(){
    int a,b;
    printf("enter two numbers :");
    scanf("%d %d",&a,&b);
    if(a>b){
        printf("first number %d is greater than second number %d",a,b);
    }
    else if(b>a)
{
    printf("second number %d is greater than first  number %d",b,a);

}
else{
    printf("both numbers are equal");

}
return 0;
}