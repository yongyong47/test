#include <stdio.h>

int main(){
    int n,i;
    int cnt=1;
    scanf("%d",&n);
    
    for (i=1;i<=n;i++){
        cnt *=i;
    }
    printf("%d",cnt);
}