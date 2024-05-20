#include <stdio.h>

int main(void)
{
    int hour, min, sec, need;
    
    scanf("%d %d %d %d", &hour, &min, &sec, &need);
    
    sec += need;

    min += sec / 60;
    sec %= 60;
    
    hour += min / 60;
    min %= 60;
    
    hour %= 24;
    
    printf("%d %d %d\n", hour, min, sec);
    
    return 0;
}
