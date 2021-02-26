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
