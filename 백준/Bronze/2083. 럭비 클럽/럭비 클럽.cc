/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main(void)
{
    int  weight=0, age=0;
    char name[100];
    while(1){
        scanf("%s %d %d", name, &age, &weight);
        if(age==0) break;

        if (age > 17 || weight >= 80)
        {
            printf("%s Senior\n", name);
        }
        else
        {
            printf("%s Junior\n", name);
        }
    }
    

    return 0;
}
