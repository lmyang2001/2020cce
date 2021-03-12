#include <stdio.h>
int main()
{
	int n;
	scanf("%d",&n);
	if(n <=2000) printf("100");
	else printf("%d\n",100+(n-2000)/500*5+5);
}
