#include <stdio.h>

int main() {
    int a;
    scanf("%d",&a);
    int i,k;
    for (i=1;i<=a;i++){
        for(k=1;k<=i;k++)
        {
            printf("*");
        }
        printf("\n");
    }
}