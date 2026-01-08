#include<stdio.h>
int main() {
    int hours, minutes, seconds;
    printf("Enter time in hours, minutes and seconds: ");
    scanf("%d %d %d", &hours, &minutes, &seconds);

    // // Convert the time to total seconds
    // int total_seconds = (hours * 3600) + (minutes * 60) + seconds;

    // printf("Total time in seconds: %d\n", total_seconds);


    // if(h>=0 && hours<24 && minutes>=0 && minutes<60 && seconds>=0 && seconds<60) {
    //     int total_seconds = (hours * 3600) + (minutes * 60) + seconds;
    //     printf("Total time in seconds: %d\n", total_seconds);
    // } else {
    //     printf("Invalid time input.\n");
    // }

    if(hours>=0 && hours<24)
    {
        if(minutes>=0 && minutes<60)
        {
            if(seconds>=0 && seconds<60)
            {
                // int total_seconds = (hours * 3600) + (minutes * 60) + seconds;
                printf("time is valid: \n");
            }
            else
            {
                printf("Invalid seconds input.\n");
            }
        }
        else
        {
            printf("Invalid minutes input.\n");
        }

    }
else{
    printf("Invalid time input.\n");
}


    return 0;
}