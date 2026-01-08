#include<stdio.h>
int main(){
    int x,y;
    printf("Enter two numbers: ");
    scanf("%d %d",&x,&y);

    if(x>0 && y>0){
        printf("1st Quadrant\n");
    }
    else if(x<0 && y>0){
        printf("2nd Quadrant\n");
    }
    else if(x<0 && y<0){
        printf("3rd Quadrant\n");
    }
    else if(x>0 && y<0){
        printf("4th Quadrant\n");
    }
    else if(x==0 && y!=0){
        printf("Lies on Y axis\n");
    }
    else if(y==0 && x!=0){
        printf("Lies on X axis\n");
    }
    else{
        printf("Origin\n");
    }
}