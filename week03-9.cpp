#include <stdio.h>
int main()
{
	int a,b,max,min;
	scanf("%d %d",&a,&b);
	if(a>b) {max=a;min=b;}
	else {max=b;min=a;}
	for(int i=min;i<=max;i++)
	{
	if(i%5==0)
	printf("%d\n",i);
	}
}
