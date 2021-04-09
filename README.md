# 2020cce
## 迴文判斷
```C
#include <stdio.h>
#include <string.h>
char a[10000];
int main()
{	
	int len;
	int i;
	scanf("%s",&a);
	len = strlen(a); ///strlen可取得字串長度
	for(i=0;i<(len/2);i++){
		if(a[i]!=a[len-1-i]) break;}
		
	if(i==(len/2)) printf("YES\n");
	else printf("NO\n");
}	
```
## 函數反序排列數字 
```C
#include <stdio.h>
int main()
{
	int a,b=0;
	scanf("%d",&a);
	while(a!=0){
		b=b*10+a%10;
		a=a/10;
		}
		printf("%d\n",b);
}
```
## 陣列找出現次數
```C
#include <stdio.h>
int main()
{
	char a[100]; 
	int r=0;
	int i;
	for(int i=0;i<100;i++)
	{
	scanf("%d",&a[i]);
		if(a[i]==0)   break;
		r++;
		}
		int x;
		scanf("%d",&x);
		int count=0;
		   ///計陣列個數
		for(int i=0;i<r;i++)
	  {
			if(a[i]==x) count++;}
			printf("%d\n",count);
}
```
## 判斷大小 
```C
#include <stdio.h>
int f(int a,int b){
	if(a<b) return -1;
	if(a==b) return 0;
	if(a>b) return 1;
}
int main(){
    int a, b;
    scanf("%d %d", &a, &b);
    printf("%d",f(a,b));
    return 0;
}
```
## 計算一列整數的總和
```C
#include <stdio.h>
int main()
{
	printf("Enter an integer ( 999 to end ): \n");
	int n;
	scanf("%d",&n);
	int ans=0;
	while(n!=999)
	{
		ans=ans+n;
		printf("Enter an integer ( 999 to end ): \n");
		scanf("%d" ,&n);
	}
	printf("The total is: %d",ans);
}
```
## 計算餘數 
```C
#include <stdio.h>
int a[10000];
int main()
{
	int a,b;
	scanf("%d%d",&a,&b);
	printf("%d",a%b);
}
```
## 計算商數 
```C
#include <stdio.h>
int a[10000];
int main()
{
	int a,b;
  	scanf("%d%d",&a,&b);
	printf("%d\n",a/b);
}
```
## 三數極大 
```C
#include <stdio.h>
int main()
{
	int a,b,c,max;
	scanf("%d%d%d",&a,&b,&c);
	max=a;
	if(b>a&&b>c)
	max=b;
	if(c>a&&c>b)
	max=c;
	printf("%d\n",max);
}
```
## N數之和 
```C
#include <stdio.h>
int main()
{
	int N,c;
	int sum=0;
	scanf("%d" ,&N);
	for(int i=1;i<=N;i++){
	scanf("%d",&c);
	sum=sum + c;
	}
		printf("%d\n",sum);
}
```
## 絕對值函數
```C
#include <stdio.h>
int f(int a)
{
	if(a>0) return a;
	else return a*(-1);
}
int main(void)
{
	int n;
	scanf("%d",&n);
	printf("[%d]",f(n));
	return 0;
}
```
## 反序數字 
```C
#include <stdio.h> ///正+反=和
int f(int n)
{
	int c;
	int a=0;
	while(n>0)
	{
		c=n%10;
		n=n/10;
		a=c+a*10;
	}
	return a;
}
int main()
{
	int n,a;
	scanf("%d", &n);
	printf("%d+%d=%d\n",n,f(a),n+f(a));
	}
```
## 找零錢
```c
#include <stdio.h>
int main()
{
	int n;
	scanf("%d" ,&n);
	printf("%d=50*%d+5*%d+1*%d\n" , n,n/50,(n%50)/5,(n%5)/1);
}
```
## 因數個數 
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
## 找倍數
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
## 整數轉換為等級
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
## 分式化簡
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
## week03-4
```C
  
#include <stdio.h>
#include <stdlib.h>
int a[10];
int main()
{
    int b[10];
    int *p=(int*) malloc( sizeof(int) * 10 );

    return 0;
}
```
## 計算陣列的平方值 
```C
#include <stdio.h>
int main()
{
int n,a[10];
scanf("%d ",&n);
for(int i=0;i<n;i++)
{
scanf("%d ",&a[i]);
printf("%d,",a[i]*a[i]);
}
printf("\n");
}
```
## 大小寫轉換 
```C
#include <stdio.h>
int main()
{
	char c[10];
	scanf("%s ",&c);
	int	i=0;
	while(c[i]!='\0')
{
    if('A'<=c[i] && c[i] <='Z')
 {
	printf("%c", c[i]-'A'+'a');
 }
	else if('a'<=c[i] && c[i] <='z')
 {
 	printf("%c",c[i]-'a'+'A'); }
	else {printf("%c" , c[i]);	}
	i++;
}
printf("\n");
}
```
## 計算幾周又幾天
```C
#include <stdio.h>
int main()
{
int n;
scanf("%d ",&n);
printf("%d %d\n",(n/7),(n%7));
}
```
## 計算車資
```C
#include <stdio.h>
int main()
{
	int n;
	scanf("%d",&n);
	if(n <=2000) printf("100");
	else printf("%d\n",100+(n-2000)/500*5+5);
}
```
## 兩數間可被5整除的整數
```C
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
```
##   整數間最大距離 
```C
#include <stdio.h>
int main()
{
	int a[3],max,min;
	for(int i=0;i<3;i++)
	scanf("%d",&a[i]);
	min=a[0];max=a[0];
	for(int i=0;i<3;i++)
	{
	if(min>a[i]) min=a[i];
	if(max<a[i]) max=a[i];
	}
	printf("%d\n",max-min);
	}
```
## 除惡務盡 
```C
#include <stdio.h>
int main()
{
	char a[100];
	scanf("%s" ,&a); //將字串讀入依序放入陣列最後加上'\0'
	int i=0;
	while(a[i]!='\0')
{
	if(a[i]!='2')
		printf("%c",a[i]);
		i++;
}
	printf("\n");	
}	
```
## 擲骰統計
```C
#include <stdio.h>
int main()
{
	char a[100];
	char count[7]={0};
	scanf("%s" ,&a);
	int i=0;
	while(a[i]!='\0')
	{
		count[a[i]-'0']++;
	    i++;
	}
	for(int i=1;i<=6;i++)
	{
	printf("%d:%d\n",i,count[i]);
	}    //點數//次數
}
```
## 函數找整數的最大數字
```C
#include<iostream>
using namespace std;
int max_digit(int n)
{
int max; //記錄最大值
max=n%10; //記錄最大值
while(n>0)
{
	if((n%10)>max) max=n%10;
	n/=10;
}
  return max;
}
int main(){
  int n;cin>>n;
  cout<<"["<<max_digit(n)<<"]";
  return 0;
}
/* 上方C++ 的 main 函數 等價於 下方 C 的 main 函數
int main(void){
  int n;
  scanf("%d", &n);
  printf("[%d]", max_digit(n));
  return 0;
}
*/
```
## 星星等腰三角 
```C
#include <stdio.h>
int main()
{
	int n;
	scanf("%d",&n);
	for(int i=1;i<=n;i++)  		//控制行數
 {
	for(int j=0;j<(n-i);j++)   //印空格
  {
		printf(" ");
  }
	for(int j=0;j<(i*2-1);j++)	//印*
	{	printf("*");
	}
 		printf("\n");
 }
}
```
## 分開整數的每個數字 
```C
#include <stdio.h>
int main()
{
	int n;
	scanf("%d" ,&n);
	printf("%d   ",n/10000);
	printf("%d   ",(n%10000)/1000);
	printf("%d   ",((n%10000)%1000)/100);
	printf("%d   ",(((n%10000)%1000)%100)/10);
	printf("%d",(((n%10000)%1000)%100)%10);
}
```
## 字元判別 
```C
#include <stdio.h>
int main()
{
	char a;
	scanf("%c" ,&a);
	if(a>='A' && a<='Z') printf("U");
	else if(a>='a' && a<='z') printf("L");
	else if(a>='0' && a<='9') printf("D");
	else printf("O");
}
```
## 數字之首
```C
#include <stdio.h>
int main()
{
	int n;
	scanf("%d",&n);
	while(n>9)
	{
	n=n/10;
	}	
	printf("%d",n);
}
```
## 輸出從0到N的偶數 
```C
#include <stdio.h>
int main()
{
	int N;
	scanf("%d" ,&N);
	for(int i=1;i<=N;i++)
	{
	if(i%2==0)
	printf("%d " ,i);
	}
}
```
