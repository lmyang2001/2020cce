# 2020cce
## 第一題程式碼找零錢
```c
#include <stdio.h>
int main()
{
	int n;
	scanf("%d" ,&n);
	printf("%d=50*%d+5*%d+1*%d\n" , n,n/50,(n%50)/5,(n%5)/1);
}
```
## 第二題程式碼因數個數 
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
## 第三題程式碼找倍數
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
## 第四題程式碼整數轉換為等級
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
## 第五題程式碼分式化簡
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
## 讀入整數反序列印
```C
#include <stdio.h>
int a[1000];
int main()
{
	int N=0;
	for(int i=0;i<1000;i++)
	{
		scanf("%d", &a[i]);
		if( a[i]==0 )
		{
		N=i;
		break;
		}
	}
	for(int i=N-1; i>=0;i--)
	{
	printf("%d ",a[i]);
	}
	printf("\n");
}
```
## A的B次方函數
```C
#include <stdio.h>
int MYPOWER(int a,int b)
{
	int ans;
	for(int i=1;i<b;i++)
	{
		ans=ans*a;
	}
	return ans;
}
    int main(void)
{
	int a,b;
	scanf("%d%d",&a,&b);
	printf("[%d]",MYPOWER(a,b));
	return 0;
}
```

## 漸增數列相加
```C
#include <stdio.h>
int main()
{
	int a;
	scanf("%d" , &a);
	int ans=0;
	for(int i=2;i<=a;i++)
	{
	ans+=(i-1)*i;
	}
	printf("%d\n",ans);
}
```
## 判別正方形 
```C
#include <stdio.h>
int main()
{
	int a,b;
	scanf("%d%d",&a,&b);
	printf("Enter two numbers:  ");
	if(a==b) printf("It is a square ");
	else printf("It is not a square ");
}
```
## 2進位轉10進位
```C
#include <stdio.h>
int main()
{	
	int a;
	scanf("%d",&a);
	printf("%d\n",(a/1000)*8+a%1000/100*4+a%100/10*2+a%10*1);
}
```
## week02-1
```C
#include <stdio.h>
int main()
{
    int n1=10,n2=20,n3=30;
    printf("n1:%d n2:%d n3:%d\n",n1,n2,n3);

    int *p=&n1;
    *p=200;
     printf("n1:%d n2:%d n3:%d\n",n1,n2,n3);

}
```
## week02-2
```C
#include <stdio.h>
int main()
{
    int n1=10,n2=20,n3=30;
    printf("n1:%d n2:%d n3:%d\n",n1,n2,n3);

    int *p=&n1;
    *p=200;
     printf("n1:%d n2:%d n3:%d\n",n1,n2,n3);

     int *p2=&n3;
     *p2=300;
     printf("n1:%d n2:%d n3:%d\n",n1,n2,n3);

}
```
## week02-3
```C
#include <stdio.h>
int main()
{
    int n[3]={10,20,30};
    printf("n[0]:%d n[1]:%d n[2]:%d\n",n[0],n[1],n[2]);

    int *p=&n[0];
    *p=200;
    printf("n[0]:%d n[1]:%d n[2]:%d\n",n[0],n[1],n[2]);

    int *p2=&n[2];
    *p2=300;
    printf("n[0]:%d n[1]:%d n[2]:%d\n",n[0],n[1],n[2]);

    p2=p;
    *p2=400;
    printf("n[0]:%d n[1]:%d n[2]:%d\n",n[0],n[1],n[2]);
}
```
## week03-1
```C
#include <stdio.h>

int main()
{
    int a[5]={0,10,20,30,40};
    for(int i=0; i<5;i++) printf ("%d ", a[i]);
    printf("\n");
    int *p = &a[2];
    *p=222;
     for(int i=0; i<5;i++) printf ("%d ", a[i]);
    printf("\n");
     p=p+2;
    *p=666;
 for(int i=0; i<5;i++) printf ("%d ", a[i]);
    printf("\n");
}

```
## week03-2
```C
#include <stdio.h>

int main()
{
    int a[5]={0,10,20,30,40};
    for(int i=0; i<5;i++) printf ("%d ", a[i]);
    printf("\n");
    int *p = &a[2];
    *p=222;
     for(int i=0; i<5;i++) printf ("%d ", a[i]);
    printf("\n");
    p=p+2;
    *p=666;
    for(int i=0; i<5;i++) printf ("%d ", a[i]);
    printf("\n");
    p--;
    *p=555;
      for(int i=0; i<5;i++) printf ("%d ", a[i]);
    printf("\n");
}
```
## week03-3
```C
#include <stdio.h>
int main()
{
    int a[5]={0,10,20,30,40};
        for(int i=0; i<5;i++) printf ("%d ", a[i]);
        printf("\n");
    int *p = &a[2];
    *p=222;
        for(int i=0; i<5;i++) printf ("%d ", a[i]);
         printf("\n");
        printf("p心裡小紙條記得值是:%d\n", p);
        printf("\n");
    p=p+2;
    *p=666;
        for(int i=0; i<5;i++) printf ("%d ", a[i]);
         printf("\n");
        printf("p心裡小紙條記得值是:%d\n", p);
        printf("\n");
    p--;
    *p=555;
        for(int i=0; i<5;i++) printf ("%d ", a[i]);
         printf("\n");
        printf("p心裡小紙條記得值是:%d\n", p);
        printf("\n");
}
```
