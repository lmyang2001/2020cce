#include <stdio.h>
#include <string.h>
#include <stdlib.h>
char line[100][10];
char temp[10]; ///�r��.���O�r��

int compare(const void * p1, const void * p2)
{                         ///�����P1(P2)�ন�r��S1(S2)
	char *s1 = (char*) p1;
	char *s2 = (char*) p2;
	return strcmp(s1 , s2 );
}
int main()
{
	int n;
	scanf("%d",&n);

	for(int i=0 ; i<n;i++){
		scanf("%s", line[i]);
	}  ///input

    qsort(line, n, 10, compare );

	for(int i=0;i<n;i++){
			printf("%s\n",line[i]);
	} ///output
}
