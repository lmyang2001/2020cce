# 2020cce
## 第一題程式碼
```c
#include <stdio.h>
int main()
{
	int n;
	scanf("%d" ,&n);
	printf("%d=50*%d+5*%d+1*%d\n" , n,n/50,(n%50)/5,(n%5)/1);
}
```
## 第二題程式碼
```c
#include <stdio.h>
int main()
{
	int n,ans=0;
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
{
	if(n%i==0) ans++;
}
	printf("%d\n",ans);
}
```
## 第三題程式碼
```c
#include<stdio.h>
int main()
{
	int ans=0,a[10];
	for(int i=0;i<10;i++)
{
	scanf("%d",&a[i]);
	if(a[i]%3==0) ans++;
}
	printf("%d\n",ans);

}
```
## 第四題程式碼
```c
#include <stdio.h>
int main()
{
	int n;
	scanf("%d" ,&n);
    if(n>=90)
        printf("A\n");
    if(n<90&&n>=80)
        printf("B\n");
    if(n<80&&n>=60)
        printf("C\n");
    if(n<60)
        printf("F\n");
}
```
## 第五題程式碼
```c
#include <stdio.h>
int main()
{
	int a,b,i,ans=1;
	scanf("%d%d",&a,&b);
	for(i=1;i<=b;i++){
		if(a%i==0 && b%i==0)
			ans=i;
	}
	printf("%d %d\n",a/ans,b/ans);	
}
```
