#include <stdio.h>
#include <stdlib.h>
int main()
{
    int a[10]={1,2,3,4,5,6,7,8,9,10};
    int *p;
    p=a;
    for(int i=0;i<10;i++)
    {
    printf(" %d ", p[i] );
    }
    p = (int*) malloc( 4 * 10 );

    return 0;
}
